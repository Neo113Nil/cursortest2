package androidx.documentfile.provider;

/* loaded from: classes7.dex */
class RawDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private java.io.File getHighSpeedVideoFpsRangesFor;

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return false;
    }

    RawDocumentFile(androidx.documentfile.provider.DocumentFile documentFile, java.io.File file) {
        super(documentFile);
        this.getHighSpeedVideoFpsRangesFor = file;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str2);
            sb.append(".");
            sb.append(extensionFromMimeType);
            str2 = sb.toString();
        }
        java.io.File file = new java.io.File(this.getHighSpeedVideoFpsRangesFor, str2);
        try {
            file.createNewFile();
            return new androidx.documentfile.provider.RawDocumentFile(this, file);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        java.io.File file = new java.io.File(this.getHighSpeedVideoFpsRangesFor, str);
        if (file.isDirectory() || file.mkdir()) {
            return new androidx.documentfile.provider.RawDocumentFile(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
        return android.net.Uri.fromFile(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor.getName();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
        if (this.getHighSpeedVideoFpsRangesFor.isDirectory()) {
            return null;
        }
        java.lang.String name2 = this.getHighSpeedVideoFpsRangesFor.getName();
        int lastIndexOf = name2.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(name2.substring(lastIndexOf + 1).toLowerCase());
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
        }
        return com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return this.getHighSpeedVideoFpsRangesFor.isDirectory();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return this.getHighSpeedVideoFpsRangesFor.isFile();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return this.getHighSpeedVideoFpsRangesFor.lastModified();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return this.getHighSpeedVideoFpsRangesFor.length();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return this.getHighSpeedVideoFpsRangesFor.canRead();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return this.getHighSpeedVideoFpsRangesFor.canWrite();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        return this.getHighSpeedVideoFpsRangesFor.delete();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return this.getHighSpeedVideoFpsRangesFor.exists();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.File[] listFiles = this.getHighSpeedVideoFpsRangesFor.listFiles();
        if (listFiles != null) {
            for (java.io.File file : listFiles) {
                arrayList.add(new androidx.documentfile.provider.RawDocumentFile(this, file));
            }
        }
        return (androidx.documentfile.provider.DocumentFile[]) arrayList.toArray(new androidx.documentfile.provider.DocumentFile[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        java.io.File file = new java.io.File(this.getHighSpeedVideoFpsRangesFor.getParentFile(), str);
        if (!this.getHighSpeedVideoFpsRangesFor.renameTo(file)) {
            return false;
        }
        this.getHighSpeedVideoFpsRangesFor = file;
        return true;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.io.File file) {
        java.io.File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (java.io.File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= getHighSpeedVideoFpsRangesFor(file2);
                }
                if (!file2.delete()) {
                    z = false;
                }
            }
        }
        return z;
    }
}
