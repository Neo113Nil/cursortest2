package Kl;

import com.google.gson.internal.o;
import com.google.gson.j;
import kotlin.jvm.functions.Function1;
import m1.InterfaceC8038i;
import m1.q;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements g, o, InterfaceC8038i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16000a;

    public /* synthetic */ b(Object obj) {
        this.f16000a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f16000a).invoke(obj);
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        q qVar = (q) this.f16000a;
        double a11 = qVar.a();
        double b11 = qVar.b();
        double c11 = qVar.c();
        return d11 >= qVar.d() * c11 ? (Math.pow(d11, 1.0d / qVar.g()) - b11) / a11 : d11 / c11;
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        throw new j((String) this.f16000a);
    }
}
