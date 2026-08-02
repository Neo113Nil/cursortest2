package androidx.documentfile.provider;

/* loaded from: classes7.dex */
class SingleDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.net.Uri Camera2StreamConfigurationMap;
    private android.content.Context getHighSpeedVideoSizes;

    SingleDocumentFile(android.content.Context context, android.net.Uri uri) {
        super(null);
        this.getHighSpeedVideoSizes = context;
        this.Camera2StreamConfigurationMap = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
        return androidx.documentfile.provider.DocumentsContractApi19.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
        return androidx.documentfile.provider.DocumentsContractApi19.getInputFormats(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoSizesFor(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputMinFrameDuration(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return androidx.documentfile.provider.DocumentsContractApi19.getInputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputFormats(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        try {
            return android.provider.DocumentsContract.deleteDocument(this.getHighSpeedVideoSizes.getContentResolver(), this.Camera2StreamConfigurationMap);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException();
    }
}
