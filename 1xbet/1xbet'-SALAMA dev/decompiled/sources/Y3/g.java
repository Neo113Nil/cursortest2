package Y3;

import com.google.android.gms.common.api.internal.InterfaceC0781b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements InterfaceC0781b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f7658a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0781b
    public final void a(boolean z4) {
        synchronized (i.f7661k) {
            try {
                for (i iVar : new ArrayList(i.f7662l.values())) {
                    if (iVar.f7667e.get()) {
                        iVar.k(z4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
