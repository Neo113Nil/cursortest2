package Ay;

import Ih.b;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements g, b.a.InterfaceC0251b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1296a;

    public /* synthetic */ b(Object obj) {
        this.f1296a = obj;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f1296a).invoke(obj);
    }

    @Override // Ih.b.a.InterfaceC0251b
    public Boolean getValue() {
        b.a aVar = (b.a) this.f1296a;
        return Boolean.valueOf(aVar.b().getValue().booleanValue() && !aVar.d().getValue().booleanValue());
    }
}
