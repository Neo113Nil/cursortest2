package kotlinx.serialization.builtins;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlinx.serialization.b;
import kotlinx.serialization.internal.C1135f;
import kotlinx.serialization.internal.C1159r0;
import kotlinx.serialization.internal.L0;
import kotlinx.serialization.internal.S0;

/* loaded from: classes5.dex */
public final class a {
    public static final L0 a(KClass kClass, b elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new L0(kClass, elementSerializer);
    }

    public static final C1135f b(b elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new C1135f(elementSerializer);
    }

    public static final <T> b<T> c(b<T> bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.getDescriptor().b() ? bVar : new C1159r0(bVar);
    }

    public static final void d(StringCompanionObject stringCompanionObject) {
        Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        S0 s0 = S0.a;
    }
}
