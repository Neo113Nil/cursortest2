package Gd;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Gd.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3090u implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3090u f10070a = new C3090u();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Jd.p it = (Jd.p) obj;
        int i11 = C3070B.f9930v;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.g());
    }
}
