package p063i4;

import B.v;
import W5.AbstractC0486a1;
import Y3.i;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import p098n4.C0932e;
import p098n4.C0940m;
import p098n4.C0941n;
import p098n4.o;
import p120q4.f;
import p120q4.k;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0941n f14002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0932e f14003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f14004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0940m f14005d;

    public h(C0932e c0932e, C0941n c0941n) {
        this.f14002a = c0941n;
        this.f14003b = c0932e;
    }

    public static synchronized h c(i iVar, String str) {
        i iVar2;
        f fVarD;
        if (TextUtils.isEmpty(str)) {
            throw new d("Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call.");
        }
        iVar.b();
        iVar2 = (i) iVar.f7666d.a(i.class);
        D.j(iVar2, "Firebase Database component is not present.");
        fVarD = k.d(str);
        if (!fVarD.f15866b.isEmpty()) {
            throw new d("Specified Database URL '" + str + "' is invalid. It should point to the root of a Firebase Database but it includes a path: " + fVarD.f15866b.toString());
        }
        return iVar2.a(fVarD.f15865a);
    }

    public final void a(String str) {
        if (this.f14005d != null) {
            throw new d(AbstractC0486a1.h("Calls to ", str, "() must be made before any other usage of FirebaseDatabase instance."));
        }
    }

    public final synchronized void b() {
        if (this.f14005d == null) {
            C0941n c0941n = this.f14002a;
            v vVar = this.f14004c;
            c0941n.getClass();
            if (vVar != null) {
                c0941n.f15468a = ((String) vVar.f966c) + ":" + vVar.f965b;
                c0941n.f15469b = false;
            }
            this.f14005d = o.a(this.f14003b, this.f14002a);
        }
    }

    public final synchronized void d(long j) {
        a("setPersistenceCacheSizeBytes");
        C0932e c0932e = this.f14003b;
        synchronized (c0932e) {
            c0932e.a();
            if (j < 1048576) {
                throw new d("The minimum cache size must be at least 1MB");
            }
            if (j > 104857600) {
                throw new d("Firebase Database currently doesn't support a cache size larger than 100MB");
            }
            c0932e.j = j;
        }
    }
}
