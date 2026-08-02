package Kd;

import je.K0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class c0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f15883a = new c0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        K0 it = (K0) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it instanceof Hd.k);
    }
}
