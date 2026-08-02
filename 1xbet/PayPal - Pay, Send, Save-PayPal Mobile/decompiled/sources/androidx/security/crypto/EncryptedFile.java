package androidx.security.crypto;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public final class EncryptedFile {
    final android.content.Context Camera2StreamConfigurationMap;
    final com.google.crypto.tink.StreamingAead getHighResolutionOutputSizeshNQ4ISI;
    final java.io.File getHighSpeedVideoFpsRanges;
    final java.lang.String getHighSpeedVideoSizes;

    EncryptedFile(java.io.File file, java.lang.String str, com.google.crypto.tink.StreamingAead streamingAead, android.content.Context context) {
        this.getHighSpeedVideoFpsRanges = file;
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = streamingAead;
    }

    @java.lang.Deprecated
    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB;

        final java.lang.String getHighSpeedVideoFpsRanges;

        FileEncryptionScheme() {
            this.getHighSpeedVideoFpsRanges = r3;
        }
    }

    @java.lang.Deprecated
    public static final class Builder {
        private static final java.lang.Object getOutputMinFrameDuration = new java.lang.Object();
        final androidx.security.crypto.EncryptedFile.FileEncryptionScheme getHighResolutionOutputSizeshNQ4ISI;
        final android.content.Context getHighSpeedVideoFpsRanges;
        java.io.File getHighSpeedVideoFpsRangesFor;
        final java.lang.String getOutputFormats;
        java.lang.String getHighSpeedVideoSizes = "__androidx_security_crypto_encrypted_file_pref__";
        java.lang.String Camera2StreamConfigurationMap = "__androidx_security_crypto_encrypted_file_keyset__";

        @java.lang.Deprecated
        public Builder(java.io.File file, android.content.Context context, java.lang.String str, androidx.security.crypto.EncryptedFile.FileEncryptionScheme fileEncryptionScheme) {
            this.getHighSpeedVideoFpsRangesFor = file;
            this.getHighResolutionOutputSizeshNQ4ISI = fileEncryptionScheme;
            this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
            this.getOutputFormats = str;
        }

        public Builder(android.content.Context context, java.io.File file, androidx.security.crypto.MasterKey masterKey, androidx.security.crypto.EncryptedFile.FileEncryptionScheme fileEncryptionScheme) {
            this.getHighSpeedVideoFpsRangesFor = file;
            this.getHighResolutionOutputSizeshNQ4ISI = fileEncryptionScheme;
            this.getHighSpeedVideoFpsRanges = context.getApplicationContext();
            this.getOutputFormats = masterKey.getHighSpeedVideoFpsRanges;
        }

        public final androidx.security.crypto.EncryptedFile.Builder setKeysetPrefName(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final androidx.security.crypto.EncryptedFile.Builder setKeysetAlias(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public final androidx.security.crypto.EncryptedFile build() throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.integration.android.AndroidKeysetManager build;
            com.google.crypto.tink.streamingaead.StreamingAeadConfig.register();
            com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withSharedPref = new com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder().withKeyTemplate(com.google.crypto.tink.KeyTemplates.get(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges)).withSharedPref(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.PREFIX);
            sb.append(this.getOutputFormats);
            com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withMasterKeyUri = withSharedPref.withMasterKeyUri(sb.toString());
            synchronized (getOutputMinFrameDuration) {
                build = withMasterKeyUri.build();
            }
            return new androidx.security.crypto.EncryptedFile(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, (com.google.crypto.tink.StreamingAead) build.getKeysetHandle().getPrimitive(com.google.crypto.tink.StreamingAead.class), this.getHighSpeedVideoFpsRanges);
        }
    }

    public final java.io.FileOutputStream openFileOutput() throws java.security.GeneralSecurityException, java.io.IOException {
        if (this.getHighSpeedVideoFpsRanges.exists()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("output file already exists, please use a new file: ");
            sb.append(this.getHighSpeedVideoFpsRanges.getName());
            throw new java.io.IOException(sb.toString());
        }
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.getHighSpeedVideoFpsRanges);
        return new androidx.security.crypto.EncryptedFile.EncryptedFileOutputStream(fileOutputStream.getFD(), this.getHighResolutionOutputSizeshNQ4ISI.newEncryptingStream(fileOutputStream, this.getHighSpeedVideoFpsRanges.getName().getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    public final java.io.FileInputStream openFileInput() throws java.security.GeneralSecurityException, java.io.IOException, java.io.FileNotFoundException {
        if (!this.getHighSpeedVideoFpsRanges.exists()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("file doesn't exist: ");
            sb.append(this.getHighSpeedVideoFpsRanges.getName());
            throw new java.io.FileNotFoundException(sb.toString());
        }
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.getHighSpeedVideoFpsRanges);
        return new androidx.security.crypto.EncryptedFile.EncryptedFileInputStream(fileInputStream.getFD(), this.getHighResolutionOutputSizeshNQ4ISI.newDecryptingStream(fileInputStream, this.getHighSpeedVideoFpsRanges.getName().getBytes(java.nio.charset.StandardCharsets.UTF_8)));
    }

    static final class EncryptedFileOutputStream extends java.io.FileOutputStream {
        private final java.io.OutputStream Camera2StreamConfigurationMap;

        EncryptedFileOutputStream(java.io.FileDescriptor fileDescriptor, java.io.OutputStream outputStream) {
            super(fileDescriptor);
            this.Camera2StreamConfigurationMap = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(int i) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(i);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.Camera2StreamConfigurationMap.write(bArr, i, i2);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            this.Camera2StreamConfigurationMap.close();
        }

        @Override // java.io.FileOutputStream
        public final java.nio.channels.FileChannel getChannel() {
            throw new java.lang.UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws java.io.IOException {
            this.Camera2StreamConfigurationMap.flush();
        }
    }

    static final class EncryptedFileInputStream extends java.io.FileInputStream {
        private final java.lang.Object Camera2StreamConfigurationMap;
        private final java.io.InputStream getHighResolutionOutputSizeshNQ4ISI;

        EncryptedFileInputStream(java.io.FileDescriptor fileDescriptor, java.io.InputStream inputStream) {
            super(fileDescriptor);
            this.Camera2StreamConfigurationMap = new java.lang.Object();
            this.getHighResolutionOutputSizeshNQ4ISI = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read() throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.read();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr) throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.read(bArr, i, i2);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final long skip(long j) throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.skip(j);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int available() throws java.io.IOException {
            return this.getHighResolutionOutputSizeshNQ4ISI.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.close();
        }

        @Override // java.io.FileInputStream
        public final java.nio.channels.FileChannel getChannel() {
            throw new java.lang.UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            synchronized (this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI.mark(i);
            }
        }

        @Override // java.io.InputStream
        public final void reset() throws java.io.IOException {
            synchronized (this.Camera2StreamConfigurationMap) {
                this.getHighResolutionOutputSizeshNQ4ISI.reset();
            }
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.getHighResolutionOutputSizeshNQ4ISI.markSupported();
        }
    }
}
