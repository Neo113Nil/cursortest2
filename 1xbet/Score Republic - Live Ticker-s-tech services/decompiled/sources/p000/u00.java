package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u00 implements InterfaceC0870xa {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f7635a = new AtomicReference();

    @Override // p000.InterfaceC0870xa
    /* JADX INFO: renamed from: a */
    public final void mo1232a(boolean z) {
        synchronized (w00.f8316j) {
            try {
                ArrayList arrayList = new ArrayList(w00.f8317k.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    w00 w00Var = (w00) obj;
                    if (w00Var.f8322e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = w00Var.f8326i.iterator();
                        while (it.hasNext()) {
                            w00 w00Var2 = ((t00) it.next()).f7247a;
                            if (!z) {
                                ((C0553oq) w00Var2.f8325h.get()).m3729b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
