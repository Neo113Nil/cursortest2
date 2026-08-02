package Y3;

import com.google.android.gms.common.api.internal.InterfaceC0825b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class g implements InterfaceC0825b {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReference f7658a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.InterfaceC0825b
    public final void a(boolean z4) {
        synchronized (i.f7661k) {
            try {
                Iterator it = new ArrayList(i.f7662l.values()).iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
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
