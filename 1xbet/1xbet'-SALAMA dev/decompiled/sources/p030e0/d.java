package p030e0;

import G6.g;
import kotlin.jvm.functions.Function2;
import p010b0.InterfaceC0738i;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0738i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0738i f12507a;

    public d(InterfaceC0738i interfaceC0738i) {
        this.f12507a = interfaceC0738i;
    }

    @Override // p010b0.InterfaceC0738i
    public final Object a(Function2 function2, i iVar) {
        return this.f12507a.a(new c(function2, null), iVar);
    }

    @Override // p010b0.InterfaceC0738i
    public final g getData() {
        return this.f12507a.getData();
    }
}
