package K4;

import E4.EnumC0172e;
import com.google.protobuf.AbstractC0867k;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3960a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3961b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3962c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC0867k f3963d = AbstractC0867k.f12212b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3964e = false;

    public final z a() {
        p075k4.e eVar = H4.h.f3317c;
        p075k4.e eVarL = eVar;
        p075k4.e eVarL2 = eVarL;
        p075k4.e eVarL3 = eVarL2;
        for (Map.Entry entry : this.f3961b.entrySet()) {
            H4.h hVar = (H4.h) entry.getKey();
            EnumC0172e enumC0172e = (EnumC0172e) entry.getValue();
            int iOrdinal = enumC0172e.ordinal();
            if (iOrdinal == 0) {
                eVarL3 = eVarL3.l(hVar);
            } else if (iOrdinal == 1) {
                eVarL = eVarL.l(hVar);
            } else {
                if (iOrdinal != 2) {
                    p113p3.f.F("Encountered invalid change type: %s", enumC0172e);
                    throw null;
                }
                eVarL2 = eVarL2.l(hVar);
            }
        }
        return new z(this.f3963d, this.f3964e, eVarL, eVarL2, eVarL3);
    }
}
