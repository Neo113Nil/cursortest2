package Ie;

import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C7735q;
import org.jetbrains.annotations.NotNull;
import ze.C11114b;
import ze.C11115c;

/* loaded from: classes.dex */
public final class f<Q> implements g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C11115c f12286a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7735q f12287b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7735q f12288c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@NotNull C11115c c11115c, @NotNull InterfaceC6511n interfaceC6511n, @NotNull InterfaceC6511n interfaceC6511n2, C11114b c11114b) {
        this.f12286a = c11115c;
        this.f12287b = (C7735q) interfaceC6511n;
        this.f12288c = (C7735q) interfaceC6511n2;
    }

    @Override // Ie.g
    public final InterfaceC6511n<j<?>, Object, Object, InterfaceC6511n<Throwable, Object, CoroutineContext, Unit>> a() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fd.n<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object>, kotlin.jvm.internal.q] */
    @Override // Ie.g
    @NotNull
    public final InterfaceC6511n<Object, Object, Object, Object> b() {
        return this.f12288c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fd.n<java.lang.Object, Ie.j<?>, java.lang.Object, kotlin.Unit>, kotlin.jvm.internal.q] */
    @Override // Ie.g
    @NotNull
    public final InterfaceC6511n<Object, j<?>, Object, Unit> c() {
        return this.f12287b;
    }

    @Override // Ie.g
    @NotNull
    public final Object d() {
        return this.f12286a;
    }
}
