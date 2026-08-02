package Cd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* renamed from: Cd.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C2750k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C2750k f4763a = new C2750k();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(C2751l.b(it));
    }
}
