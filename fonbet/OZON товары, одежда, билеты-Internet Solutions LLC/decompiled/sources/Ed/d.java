package Ed;

import Gd.C3085o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.c0;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class d extends f {

    /* renamed from: D, reason: collision with root package name */
    @NotNull
    private final c0 f7835D;

    /* renamed from: E, reason: collision with root package name */
    private final c0 f7836E;

    /* renamed from: F, reason: collision with root package name */
    @NotNull
    private final InterfaceC9831W f7837F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull C3085o ownerDescriptor, @NotNull c0 getterMethod, c0 c0Var, @NotNull InterfaceC9831W overriddenProperty) {
        super(ownerDescriptor, InterfaceC10030h.a.b(), getterMethod.h(), getterMethod.getVisibility(), c0Var != null, overriddenProperty.getName(), getterMethod.e(), null, InterfaceC9836b.a.DECLARATION, false, null);
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
        Intrinsics.checkNotNullParameter(overriddenProperty, "overriddenProperty");
        this.f7835D = getterMethod;
        this.f7836E = c0Var;
        this.f7837F = overriddenProperty;
    }
}
