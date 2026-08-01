package sg.bigo.ads.k1;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class N implements MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a, reason: collision with root package name */
    public final String f13020a;
    public MediaScannerConnection b;

    public N(String str) {
        this.f13020a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f13020a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
