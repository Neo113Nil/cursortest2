package Zd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import td.InterfaceC9836b;
import te.b;

/* loaded from: classes10.dex */
public final class f extends b.AbstractC2189b<InterfaceC9836b, InterfaceC9836b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ M<InterfaceC9836b> f35898a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<InterfaceC9836b, Boolean> f35899b;

    f(Function1 function1, M m11) {
        this.f35898a = m11;
        this.f35899b = function1;
    }

    @Override // te.b.d
    public final Object a() {
        return this.f35898a.f71787a;
    }

    @Override // te.b.d
    public final boolean b(Object obj) {
        InterfaceC9836b current = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        return this.f35898a.f71787a == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, td.b] */
    @Override // te.b.AbstractC2189b, te.b.d
    public final void c(Object obj) {
        ?? current = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(current, "current");
        M<InterfaceC9836b> m11 = this.f35898a;
        if (m11.f71787a == null && ((Boolean) this.f35899b.invoke(current)).booleanValue()) {
            m11.f71787a = current;
        }
    }
}
