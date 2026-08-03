package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class a0 implements android.media.MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4324a;
    public android.media.MediaScannerConnection b;

    public a0(java.lang.String str) {
        this.f4324a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        android.media.MediaScannerConnection mediaScannerConnection = this.b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f4324a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(java.lang.String str, android.net.Uri uri) {
        android.media.MediaScannerConnection mediaScannerConnection = this.b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
