package Fd;

import Cd.B;
import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f9396a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final o f9397b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<B> f9398c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f9399d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Hd.e f9400e;

    public k(@NotNull d components, @NotNull o typeParameterResolver, @NotNull InterfaceC4008j<B> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f9396a = components;
        this.f9397b = typeParameterResolver;
        this.f9398c = delegateForDefaultTypeQualifiers;
        this.f9399d = delegateForDefaultTypeQualifiers;
        this.f9400e = new Hd.e(this, typeParameterResolver);
    }

    @NotNull
    public final d a() {
        return this.f9396a;
    }

    public final B b() {
        return (B) this.f9399d.getValue();
    }

    @NotNull
    public final InterfaceC4008j<B> c() {
        return this.f9398c;
    }

    @NotNull
    public final InterfaceC9815F d() {
        return this.f9396a.m();
    }

    @NotNull
    public final ie.o e() {
        return this.f9396a.u();
    }

    @NotNull
    public final o f() {
        return this.f9397b;
    }

    @NotNull
    public final Hd.e g() {
        return this.f9400e;
    }
}
