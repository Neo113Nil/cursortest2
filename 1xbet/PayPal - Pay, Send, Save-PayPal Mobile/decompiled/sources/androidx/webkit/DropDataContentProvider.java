package androidx.webkit;

/* loaded from: classes7.dex */
public final class DropDataContentProvider extends android.content.ContentProvider {
    org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getHighSpeedVideoFpsRanges;

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        return getHighSpeedVideoFpsRangesFor().openFile(this, uri);
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return getHighSpeedVideoFpsRangesFor().query(uri, strArr, str, strArr2, str2);
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return getHighSpeedVideoFpsRangesFor().getType(uri);
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Insert method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("delete method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("update method is not supported.");
    }

    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return getHighSpeedVideoFpsRangesFor().call(str, str2, bundle);
    }

    private org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface dropDataProvider = androidx.webkit.internal.WebViewGlueCommunicator.getFactory().getDropDataProvider();
            this.getHighSpeedVideoFpsRanges = dropDataProvider;
            dropDataProvider.onCreate();
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}
