package bi0;

import Sc.InterfaceC4008j;
import Sc.k;
import di0.C6201a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bi0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5668b implements InterfaceC5669c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j<C6201a> f56037a = k.b(new C5667a(0));

    @Override // bi0.InterfaceC5669c
    public final void a() {
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a b(@NotNull C6201a trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        return (C6201a) f56037a.getValue();
    }

    @Override // bi0.InterfaceC5669c
    @NotNull
    public final C6201a beginTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (C6201a) f56037a.getValue();
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a endTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // bi0.InterfaceC5669c
    public final C6201a removeTrace(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }
}
