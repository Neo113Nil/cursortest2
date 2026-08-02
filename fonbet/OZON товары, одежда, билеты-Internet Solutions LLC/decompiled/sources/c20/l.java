package c20;

import c20.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class l extends AbstractC7737t implements Function2<k.a, k.a, Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final l f56403b = new l(2);

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(k.a aVar, k.a aVar2) {
        k.a aVar3 = aVar;
        k.a aVar4 = aVar2;
        k.a.EnumC0848a c11 = aVar3.c();
        k.a.EnumC0848a enumC0848a = k.a.EnumC0848a.DELETE;
        return Integer.valueOf((c11 == enumC0848a && aVar4.c() == enumC0848a) ? 0 : (aVar3.c() == enumC0848a || aVar4.c() == enumC0848a) ? 1 : aVar3.a(aVar4));
    }
}
