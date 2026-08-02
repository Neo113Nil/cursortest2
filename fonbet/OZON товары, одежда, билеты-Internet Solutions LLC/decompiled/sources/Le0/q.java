package Le0;

import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineManager;
import te0.C9867b;

/* loaded from: classes3.dex */
public final class q implements OfflineManager.FileSourceCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f17025a;

    q(long j11) {
        this.f17025a = j11;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onError(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        C9867b.f99466a.a("LibreMapController", "configureTileCache failure applied, cause: " + message, null);
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public final void onSuccess() {
        C9867b.f99466a.c("LibreMapController", P4.f.a(this.f17025a, " (mb)", new StringBuilder("configureTileCache success applied correctedCachedSize:")));
    }
}
