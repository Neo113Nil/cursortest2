package Fi;

import Sc.r;
import android.media.MediaScannerConnection;
import android.net.Uri;
import xe.C10737n;

/* loaded from: classes10.dex */
final class b implements MediaScannerConnection.OnScanCompletedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f9488a;

    b(C10737n c10737n) {
        this.f9488a = c10737n;
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        r.Companion companion = r.INSTANCE;
        this.f9488a.resumeWith(uri);
    }
}
