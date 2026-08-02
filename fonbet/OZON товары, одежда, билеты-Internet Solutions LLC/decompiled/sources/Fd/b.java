package Fd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
final class b implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final k f9360a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10030h f9361b;

    public b(k kVar, InterfaceC10030h interfaceC10030h) {
        this.f9360a = kVar;
        this.f9361b = interfaceC10030h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k kVar = this.f9360a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        InterfaceC10030h additionalAnnotations = this.f9361b;
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().b(kVar.b(), additionalAnnotations);
    }
}
