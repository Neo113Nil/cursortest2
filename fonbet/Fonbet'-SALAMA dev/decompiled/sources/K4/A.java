package K4;

import E4.EnumC0172e;
import com.google.protobuf.AbstractC0911k;
import java.util.HashMap;
import java.util.Map;
import k4.C1343e;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public int f3960a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3961b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3962c = true;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0911k f3963d = AbstractC0911k.f12212b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3964e = false;

    public final z a() {
        C1343e c1343e = H4.h.f3317c;
        C1343e c1343e2 = c1343e;
        C1343e c1343e3 = c1343e2;
        C1343e c1343e4 = c1343e3;
        for (Map.Entry entry : this.f3961b.entrySet()) {
            H4.h hVar = (H4.h) entry.getKey();
            EnumC0172e enumC0172e = (EnumC0172e) entry.getValue();
            int ordinal = enumC0172e.ordinal();
            if (ordinal == 0) {
                c1343e4 = c1343e4.l(hVar);
            } else if (ordinal == 1) {
                c1343e2 = c1343e2.l(hVar);
            } else {
                if (ordinal != 2) {
                    p3.f.F("Encountered invalid change type: %s", enumC0172e);
                    throw null;
                }
                c1343e3 = c1343e3.l(hVar);
            }
        }
        return new z(this.f3963d, this.f3964e, c1343e2, c1343e3, c1343e4);
    }
}
