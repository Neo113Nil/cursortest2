package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class FileDataSource extends com.google.android.exoplayer2.upstream.BaseDataSource {
    private long bytesRemaining;
    private java.io.RandomAccessFile file;
    private boolean opened;
    private android.net.Uri uri;

    public static class FileDataSourceException extends com.google.android.exoplayer2.upstream.DataSourceException {
        @java.lang.Deprecated
        public FileDataSourceException(java.lang.Exception exc) {
            super(exc, 2000);
        }

        @java.lang.Deprecated
        public FileDataSourceException(java.lang.String str, java.io.IOException iOException) {
            super(str, iOException, 2000);
        }

        public FileDataSourceException(java.lang.Throwable th, int i) {
            super(th, i);
        }

        public FileDataSourceException(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }
    }

    public static final class Factory implements com.google.android.exoplayer2.upstream.DataSource.Factory {
        private com.google.android.exoplayer2.upstream.TransferListener listener;

        public com.google.android.exoplayer2.upstream.FileDataSource.Factory setListener(com.google.android.exoplayer2.upstream.TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public com.google.android.exoplayer2.upstream.FileDataSource createDataSource() {
            com.google.android.exoplayer2.upstream.FileDataSource fileDataSource = new com.google.android.exoplayer2.upstream.FileDataSource();
            com.google.android.exoplayer2.upstream.TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    public FileDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(com.google.android.exoplayer2.upstream.DataSpec dataSpec) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        android.net.Uri uri = dataSpec.uri;
        this.uri = uri;
        transferInitializing(dataSpec);
        java.io.RandomAccessFile openLocalFile = openLocalFile(uri);
        this.file = openLocalFile;
        try {
            openLocalFile.seek(dataSpec.position);
            long length = dataSpec.length == -1 ? this.file.length() - dataSpec.position : dataSpec.length;
            this.bytesRemaining = length;
            if (length < 0) {
                throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(null, null, 2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (java.io.IOException e) {
            throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int read = ((java.io.RandomAccessFile) com.google.android.exoplayer2.util.Util.castNonNull(this.file)).read(bArr, i, (int) java.lang.Math.min(this.bytesRemaining, i2));
            if (read > 0) {
                this.bytesRemaining -= read;
                bytesTransferred(read);
            }
            return read;
        } catch (java.io.IOException e) {
            throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public android.net.Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        this.uri = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (java.io.IOException e) {
                throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e, 2000);
            }
        } finally {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    private static java.io.RandomAccessFile openLocalFile(android.net.Uri uri) throws com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException {
        try {
            return new java.io.RandomAccessFile((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri.getPath()), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (java.io.FileNotFoundException e) {
            if (!android.text.TextUtils.isEmpty(uri.getQuery()) || !android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
            }
            throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e, (com.google.android.exoplayer2.util.Util.SDK_INT < 21 || !com.google.android.exoplayer2.upstream.FileDataSource.Api21.isPermissionError(e.getCause())) ? 2005 : 2006);
        } catch (java.lang.SecurityException e2) {
            throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e2, 2006);
        } catch (java.lang.RuntimeException e3) {
            throw new com.google.android.exoplayer2.upstream.FileDataSource.FileDataSourceException(e3, 2000);
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isPermissionError(java.lang.Throwable th) {
            return (th instanceof android.system.ErrnoException) && ((android.system.ErrnoException) th).errno == android.system.OsConstants.EACCES;
        }
    }
}
