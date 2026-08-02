package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.internal.AbstractC1127b;
import kotlinx.serialization.internal.C1129c;

/* loaded from: classes5.dex */
public final class g {
    public static final <T> a<T> a(AbstractC1127b<T> abstractC1127b, kotlinx.serialization.encoding.c decoder, String str) {
        Intrinsics.checkNotNullParameter(abstractC1127b, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        a<T> a = abstractC1127b.a(decoder, str);
        if (a != null) {
            return a;
        }
        C1129c.a(str, abstractC1127b.c());
        throw null;
    }

    public static final k b(AbstractC1127b abstractC1127b, kotlinx.serialization.encoding.b encoder, Object value) {
        Intrinsics.checkNotNullParameter(abstractC1127b, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        k b = abstractC1127b.b(encoder, value);
        if (b != null) {
            return b;
        }
        KClass subClass = Reflection.getOrCreateKotlinClass(value.getClass());
        KClass baseClass = abstractC1127b.c();
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        C1129c.a(simpleName, baseClass);
        throw null;
    }
}
