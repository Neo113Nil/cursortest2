package Ue0;

import Ae.M0;
import De.C2862e;
import ce0.InterfaceC5817a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import xe0.InterfaceC10767f;

/* loaded from: classes3.dex */
final class k extends AbstractC7737t implements Function0<ee0.j> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(h hVar) {
        super(0);
        this.f27698b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ee0.j invoke() {
        M0 m02;
        C2862e i11;
        h hVar = this.f27698b;
        InterfaceC10767f o11 = h.o(hVar);
        m02 = hVar.f27679c;
        InterfaceC5817a g10 = hVar.g();
        ee0.i iVar = new ee0.i(new j(hVar));
        i11 = hVar.i();
        return new ee0.j(new fe0.i(o11, g10, m02, iVar, i11));
    }
}
