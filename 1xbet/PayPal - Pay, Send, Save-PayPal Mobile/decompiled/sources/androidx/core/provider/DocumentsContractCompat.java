package androidx.core.provider;

/* loaded from: classes7.dex */
public final class DocumentsContractCompat {

    public static final class DocumentCompat {
        public static final int FLAG_VIRTUAL_DOCUMENT = 512;

        private DocumentCompat() {
        }
    }

    public static boolean isDocumentUri(android.content.Context context, android.net.Uri uri) {
        return android.provider.DocumentsContract.isDocumentUri(context, uri);
    }

    public static boolean isTreeUri(android.net.Uri uri) {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.Camera2StreamConfigurationMap(uri);
    }

    public static java.lang.String getDocumentId(android.net.Uri uri) {
        return android.provider.DocumentsContract.getDocumentId(uri);
    }

    public static java.lang.String getTreeDocumentId(android.net.Uri uri) {
        return android.provider.DocumentsContract.getTreeDocumentId(uri);
    }

    public static android.net.Uri buildDocumentUri(java.lang.String str, java.lang.String str2) {
        return android.provider.DocumentsContract.buildDocumentUri(str, str2);
    }

    public static android.net.Uri buildDocumentUriUsingTree(android.net.Uri uri, java.lang.String str) {
        return android.provider.DocumentsContract.buildDocumentUriUsingTree(uri, str);
    }

    public static android.net.Uri buildTreeDocumentUri(java.lang.String str, java.lang.String str2) {
        return android.provider.DocumentsContract.buildTreeDocumentUri(str, str2);
    }

    public static android.net.Uri buildChildDocumentsUri(java.lang.String str, java.lang.String str2) {
        return android.provider.DocumentsContract.buildChildDocumentsUri(str, str2);
    }

    public static android.net.Uri buildChildDocumentsUriUsingTree(android.net.Uri uri, java.lang.String str) {
        return android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
    }

    public static android.net.Uri createDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str, java.lang.String str2) throws java.io.FileNotFoundException {
        return android.provider.DocumentsContract.createDocument(contentResolver, uri, str, str2);
    }

    public static android.net.Uri renameDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return android.provider.DocumentsContract.renameDocument(contentResolver, uri, str);
    }

    public static boolean removeDocument(android.content.ContentResolver contentResolver, android.net.Uri uri, android.net.Uri uri2) throws java.io.FileNotFoundException {
        return androidx.core.provider.DocumentsContractCompat.DocumentsContractApi24Impl.getHighSpeedVideoFpsRangesFor(contentResolver, uri, uri2);
    }

    static class DocumentsContractApi24Impl {
        static boolean Camera2StreamConfigurationMap(android.net.Uri uri) {
            return android.provider.DocumentsContract.isTreeUri(uri);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.content.ContentResolver contentResolver, android.net.Uri uri, android.net.Uri uri2) throws java.io.FileNotFoundException {
            return android.provider.DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }

        private DocumentsContractApi24Impl() {
        }
    }

    private DocumentsContractCompat() {
    }
}
