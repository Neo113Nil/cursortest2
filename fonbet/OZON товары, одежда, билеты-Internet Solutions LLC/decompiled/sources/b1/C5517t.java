package b1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: b1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5517t implements InterfaceC5515r<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function2<InterfaceC5518u, Object, Object> f55472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Object> f55473b;

    /* JADX WARN: Multi-variable type inference failed */
    C5517t(Function2<? super InterfaceC5518u, Object, Object> function2, Function1<Object, Object> function1) {
        this.f55472a = function2;
        this.f55473b = function1;
    }

    @Override // b1.InterfaceC5515r
    public final Object a(@NotNull Object obj) {
        return this.f55473b.invoke(obj);
    }

    @Override // b1.InterfaceC5515r
    public final Object b(@NotNull InterfaceC5518u interfaceC5518u, Object obj) {
        return this.f55472a.invoke(interfaceC5518u, obj);
    }
}
