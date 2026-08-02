package Nc0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.InterfaceC4008j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ze.C11115c;

/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<k> f18982a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C11115c f18983b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC2395h<String> f18984c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull InterfaceC4008j<? extends k> screenStateHolder) {
        Intrinsics.checkNotNullParameter(screenStateHolder, "screenStateHolder");
        this.f18982a = screenStateHolder;
        C11115c a11 = ze.k.a(-1, 6, null);
        this.f18983b = a11;
        this.f18984c = C2399j.H(a11);
    }

    @Override // Nc0.d
    @NotNull
    public final InterfaceC2395h<String> t() {
        return this.f18984c;
    }

    @Override // Nc0.d
    public final void y(String str) {
        this.f18983b.b(str);
        this.f18982a.getValue().hideLoader();
    }
}
