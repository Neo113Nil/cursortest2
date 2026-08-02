package H2;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final long f3277a;

    public l(long j) {
        this.f3277a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (AdOverlayInfoParcel.f10799Q.remove(Long.valueOf(this.f3277a)) == null) {
            return null;
        }
        E2.o.f1952C.f1961g.zzw(new Exception("Key was non-null in AdOverlayObjectsCleanupTask"), "AdOverlayObjectsCleanupTask");
        return null;
    }
}
