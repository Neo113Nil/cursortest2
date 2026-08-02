package Y;

import G.v;
import O3.l;
import android.os.Bundle;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.L;
import i4.InterfaceC2015a;
import java.util.Map;

/* loaded from: classes.dex */
public final class i implements f, U1.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f6115k;

    /* renamed from: l, reason: collision with root package name */
    public final v f6116l;

    /* renamed from: m, reason: collision with root package name */
    public final C0493w f6117m;

    /* renamed from: n, reason: collision with root package name */
    public final v3.g f6118n;

    public i(g gVar) {
        this.f6115k = gVar;
        v vVar = new v(new W1.a(this, new l(5, this)));
        this.f6116l = vVar;
        this.f6117m = new C0493w(this, false);
        this.f6118n = (v3.g) vVar.f1750m;
        Object f = gVar.f("androidx.savedstate.SavedStateRegistry");
        vVar.o(f instanceof Bundle ? (Bundle) f : null);
        gVar.e("androidx.savedstate.SavedStateRegistry", new l(8, this));
    }

    @Override // U1.e
    public final v3.g b() {
        return this.f6118n;
    }

    @Override // Y.f
    public final boolean c(Object obj) {
        return this.f6115k.c(obj);
    }

    @Override // Y.f
    public final Map d() {
        return this.f6115k.d();
    }

    @Override // Y.f
    public final e e(String str, InterfaceC2015a interfaceC2015a) {
        return this.f6115k.e(str, interfaceC2015a);
    }

    @Override // Y.f
    public final Object f(String str) {
        return this.f6115k.f(str);
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        return this.f6117m;
    }
}
