package e0;

import b0.InterfaceC0761i;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d implements InterfaceC0761i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0761i f12501a;

    public d(InterfaceC0761i interfaceC0761i) {
        this.f12501a = interfaceC0761i;
    }

    @Override // b0.InterfaceC0761i
    public final Object a(Function2 function2, AbstractC1362i abstractC1362i) {
        return this.f12501a.a(new c(function2, null), abstractC1362i);
    }

    @Override // b0.InterfaceC0761i
    public final G6.g getData() {
        return this.f12501a.getData();
    }
}
