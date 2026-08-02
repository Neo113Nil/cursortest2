package Ld;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ld.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3574a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3578e f16755a;

    public C3574a(AbstractC3578e abstractC3578e) {
        this.f16755a = abstractC3578e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y kotlinClass = (y) obj;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        AbstractC3578e abstractC3578e = this.f16755a;
        abstractC3578e.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        C3577d c3577d = new C3577d(abstractC3578e, hashMap, kotlinClass, hashMap2);
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        kotlinClass.c(c3577d);
        return new C3582i(hashMap, hashMap2, hashMap3);
    }
}
