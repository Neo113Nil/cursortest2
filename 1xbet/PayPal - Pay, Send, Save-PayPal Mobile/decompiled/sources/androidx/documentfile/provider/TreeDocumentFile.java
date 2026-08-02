package androidx.documentfile.provider;

/* loaded from: classes7.dex */
class TreeDocumentFile extends androidx.documentfile.provider.DocumentFile {
    private android.content.Context getHighSpeedVideoFpsRanges;
    private android.net.Uri getHighSpeedVideoSizes;

    TreeDocumentFile(androidx.documentfile.provider.DocumentFile documentFile, android.content.Context context, android.net.Uri uri) {
        super(documentFile);
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = uri;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createFile(java.lang.String str, java.lang.String str2) {
        android.net.Uri highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, str, str2);
        if (highSpeedVideoFpsRanges != null) {
            return new androidx.documentfile.provider.TreeDocumentFile(this, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges);
        }
        return null;
    }

    private static android.net.Uri getHighSpeedVideoFpsRanges(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        try {
            return android.provider.DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile createDirectory(java.lang.String str) {
        android.net.Uri highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, "vnd.android.document/directory", str);
        if (highSpeedVideoFpsRanges != null) {
            return new androidx.documentfile.provider.TreeDocumentFile(this, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public android.net.Uri getUri() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getName() {
        return androidx.documentfile.provider.DocumentsContractApi19.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public java.lang.String getType() {
        return androidx.documentfile.provider.DocumentsContractApi19.getInputFormats(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isDirectory() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoSizesFor(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isFile() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputMinFrameDuration(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean isVirtual() {
        return androidx.documentfile.provider.DocumentsContractApi19.getInputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long lastModified() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputFormats(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public long length() {
        return androidx.documentfile.provider.DocumentsContractApi19.getOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canRead() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean canWrite() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean delete() {
        try {
            return android.provider.DocumentsContract.deleteDocument(this.getHighSpeedVideoFpsRanges.getContentResolver(), this.getHighSpeedVideoSizes);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean exists() {
        return androidx.documentfile.provider.DocumentsContractApi19.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public androidx.documentfile.provider.DocumentFile[] listFiles() {
        android.content.ContentResolver contentResolver = this.getHighSpeedVideoFpsRanges.getContentResolver();
        android.net.Uri uri = this.getHighSpeedVideoSizes;
        android.net.Uri buildChildDocumentsUriUsingTree = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, android.provider.DocumentsContract.getDocumentId(uri));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new java.lang.String[]{"document_id"}, null, null, null);
            while (cursor.moveToNext()) {
                arrayList.add(android.provider.DocumentsContract.buildDocumentUriUsingTree(this.getHighSpeedVideoSizes, cursor.getString(0)));
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                try {
                    androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) cursor);
                } catch (java.lang.RuntimeException e) {
                    throw e;
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
        if (cursor != null) {
            try {
                androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) cursor);
            } catch (java.lang.RuntimeException e2) {
                throw e2;
            } catch (java.lang.Exception unused3) {
            }
        }
        android.net.Uri[] uriArr = (android.net.Uri[]) arrayList.toArray(new android.net.Uri[arrayList.size()]);
        androidx.documentfile.provider.DocumentFile[] documentFileArr = new androidx.documentfile.provider.DocumentFile[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            documentFileArr[i] = new androidx.documentfile.provider.TreeDocumentFile(this, this.getHighSpeedVideoFpsRanges, uriArr[i]);
        }
        return documentFileArr;
    }

    @Override // androidx.documentfile.provider.DocumentFile
    public boolean renameTo(java.lang.String str) {
        try {
            android.net.Uri renameDocument = android.provider.DocumentsContract.renameDocument(this.getHighSpeedVideoFpsRanges.getContentResolver(), this.getHighSpeedVideoSizes, str);
            if (renameDocument == null) {
                return false;
            }
            this.getHighSpeedVideoSizes = renameDocument;
            return true;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
