package Ld;

import I0.C3173b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class F implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final F f16740a = new F();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 1 ? C3173b.a(';', "L", it) : it;
    }
}
