package n1;

import android.view.KeyEvent;

/* renamed from: n1.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1313Q {

    /* renamed from: a, reason: collision with root package name */
    public int f11340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11341b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11343d;

    public C1313Q(U.e eVar, l1.d[] dVarArr, boolean z, int i2) {
        this.f11343d = eVar;
        this.f11342c = dVarArr;
        boolean z5 = false;
        if (dVarArr != null && z) {
            z5 = true;
        }
        this.f11341b = z5;
        this.f11340a = i2;
    }

    public C1313Q(x0.c cVar, KeyEvent keyEvent) {
        this.f11343d = cVar;
        this.f11340a = ((w2.s[]) cVar.f12258a).length;
        this.f11341b = false;
        this.f11342c = keyEvent;
    }
}
