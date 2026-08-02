package Ld;

import java.util.HashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ld.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3575b implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3575b f16756a = new C3575b();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3582i loadConstantFromProperty = (C3582i) obj;
        B it = (B) obj2;
        Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
        Intrinsics.checkNotNullParameter(it, "it");
        return ((HashMap) loadConstantFromProperty.a()).get(it);
    }
}
