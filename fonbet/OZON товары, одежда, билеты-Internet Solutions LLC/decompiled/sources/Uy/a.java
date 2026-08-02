package Uy;

import kotlin.jvm.functions.Function1;
import n8.InterfaceC8452b;
import n8.e;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements g, e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f27864a;

    public /* synthetic */ a(Object obj) {
        this.f27864a = obj;
    }

    @Override // n8.e
    public Object a(InterfaceC8452b interfaceC8452b) {
        return this.f27864a;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f27864a).invoke(obj);
    }
}
