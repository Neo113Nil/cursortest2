package Fd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9841g;
import ud.InterfaceC10030h;

/* renamed from: Fd.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3048a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final k f9358a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC9841g f9359b;

    public C3048a(k kVar, InterfaceC9841g interfaceC9841g) {
        this.f9358a = kVar;
        this.f9359b = interfaceC9841g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC10030h additionalAnnotations = this.f9359b.getAnnotations();
        k kVar = this.f9358a;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return kVar.a().a().b(kVar.b(), additionalAnnotations);
    }
}
