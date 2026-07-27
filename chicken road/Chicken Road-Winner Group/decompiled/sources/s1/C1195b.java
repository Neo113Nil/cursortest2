package s1;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import v1.AbstractC1217a;

/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1195b extends C1198e {

    /* renamed from: d, reason: collision with root package name */
    public static final C1195b f10319d = new C1195b();

    @Override // s1.C1198e
    public final void a(boolean z3) {
        Iterator it = Collections.unmodifiableCollection(C1196c.f10320c.f10321a).iterator();
        while (it.hasNext()) {
            AbstractC1217a abstractC1217a = ((o1.i) it.next()).f10172e;
            if (abstractC1217a.f10407b.get() != 0) {
                C1202i.f10332a.a(abstractC1217a.g(), "setState", z3 ? "foregrounded" : "backgrounded", abstractC1217a.f10406a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s1.C1198e
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(C1196c.f10320c.f10322b).iterator();
        while (it.hasNext()) {
            View view = (View) ((o1.i) it.next()).f10171d.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
