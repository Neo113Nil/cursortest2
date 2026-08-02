package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Gs extends Js {

    /* renamed from: n, reason: collision with root package name */
    public static final Gs f9282n = new Gs();

    @Override // com.google.android.gms.internal.ads.Js
    public final void a(boolean z3) {
        Iterator it = Collections.unmodifiableCollection(Hs.f9492c.f9493a).iterator();
        while (it.hasNext()) {
            Rs rs = ((C1893zs) it.next()).f16778d;
            if (rs.f11461b.get() != 0) {
                AbstractC1668us.E(rs.a(), "setState", true != z3 ? "backgrounded" : "foregrounded", rs.f11460a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Js
    public final boolean b() {
        Iterator it = Collections.unmodifiableCollection(Hs.f9492c.f9494b).iterator();
        while (it.hasNext()) {
            View view = (View) ((C1893zs) it.next()).f16777c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
