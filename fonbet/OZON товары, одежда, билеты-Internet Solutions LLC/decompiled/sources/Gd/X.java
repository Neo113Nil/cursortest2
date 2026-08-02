package Gd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class X implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final X f10000a = new X();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Jd.p it = (Jd.p) obj;
        int i11 = d0.f10016p;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.g());
    }
}
