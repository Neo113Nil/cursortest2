package Ld;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ld.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3576c implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3576c f16757a = new C3576c();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3582i loadConstantFromProperty = (C3582i) obj;
        B it = (B) obj2;
        Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(it, "it");
        return ((HashMap) loadConstantFromProperty.c()).get(it);
    }
}
