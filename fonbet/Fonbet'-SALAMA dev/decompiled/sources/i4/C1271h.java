package i4;

import B.v;
import W5.AbstractC0486a1;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import n4.C1471e;
import n4.C1479m;
import n4.C1480n;

/* renamed from: i4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1271h {

    /* renamed from: a, reason: collision with root package name */
    public final C1480n f13996a;

    /* renamed from: b, reason: collision with root package name */
    public final C1471e f13997b;

    /* renamed from: c, reason: collision with root package name */
    public v f13998c;

    /* renamed from: d, reason: collision with root package name */
    public C1479m f13999d;

    public C1271h(C1471e c1471e, C1480n c1480n) {
        this.f13996a = c1480n;
        this.f13997b = c1471e;
    }

    public static synchronized C1271h c(Y3.i iVar, String str) {
        C1271h a2;
        synchronized (C1271h.class) {
            if (TextUtils.isEmpty(str)) {
                throw new C1267d("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
            }
            iVar.b();
            C1272i c1272i = (C1272i) iVar.f7666d.a(C1272i.class);
            D.j(c1272i, "Firebase Database component is not present.");
            q4.f d7 = q4.k.d(str);
            if (!d7.f15860b.isEmpty()) {
                throw new C1267d("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + d7.f15860b.toString());
            }
            a2 = c1272i.a(d7.f15859a);
        }
        return a2;
    }

    public final void a(String str) {
        if (this.f13999d != null) {
            throw new C1267d(AbstractC0486a1.h("Calls to ", str, "() must be made before any other usage of FirebaseDatabase instance."));
        }
    }

    public final synchronized void b() {
        if (this.f13999d == null) {
            C1480n c1480n = this.f13996a;
            v vVar = this.f13998c;
            c1480n.getClass();
            if (vVar != null) {
                c1480n.f15462a = ((String) vVar.f966c) + ":" + vVar.f965b;
                c1480n.f15463b = false;
            }
            this.f13999d = n4.o.a(this.f13997b, this.f13996a);
        }
    }

    public final synchronized void d(long j) {
        a("setPersistenceCacheSizeBytes");
        C1471e c1471e = this.f13997b;
        synchronized (c1471e) {
            c1471e.a();
            if (j < 1048576) {
                throw new C1267d("The minimum cache size must be at least 1MB");
            }
            if (j > 104857600) {
                throw new C1267d("Firebase Database currently doesn't support a cache size larger than 100MB");
            }
            c1471e.j = j;
        }
    }
}
