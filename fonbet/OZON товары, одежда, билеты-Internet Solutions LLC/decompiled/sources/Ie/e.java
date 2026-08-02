package Ie;

import Ie.k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f12283a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<Object, j<?>, Object, Unit> f12284b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<Object, Object, Object, Object> f12285c;

    public e(Object obj, InterfaceC6511n interfaceC6511n) {
        this.f12283a = obj;
        this.f12284b = interfaceC6511n;
        int i11 = k.f12314g;
        this.f12285c = k.a.f12315a;
    }

    @Override // Ie.g
    public final InterfaceC6511n<j<?>, Object, Object, InterfaceC6511n<Throwable, Object, CoroutineContext, Unit>> a() {
        return null;
    }

    @Override // Ie.g
    @NotNull
    public final InterfaceC6511n<Object, Object, Object, Object> b() {
        return this.f12285c;
    }

    @Override // Ie.g
    @NotNull
    public final InterfaceC6511n<Object, j<?>, Object, Unit> c() {
        return this.f12284b;
    }

    @Override // Ie.g
    @NotNull
    public final Object d() {
        return this.f12283a;
    }
}
