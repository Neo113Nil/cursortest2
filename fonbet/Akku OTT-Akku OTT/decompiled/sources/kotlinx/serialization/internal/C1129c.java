package kotlinx.serialization.internal;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* renamed from: kotlinx.serialization.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1129c {
    @JvmName(name = "throwSubtypeNotRegistered")
    public static final void a(String str, KClass baseClass) {
        String sb;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            sb = androidx.compose.runtime.t.c("Class discriminator was missing and no default serializers were registered ", '.', str2);
        } else {
            StringBuilder a = androidx.datastore.preferences.protobuf.c.a("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            androidx.collection.e.d(a, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            a.append(baseClass.getSimpleName());
            a.append("' has to be sealed and '@Serializable'.");
            sb = a.toString();
        }
        throw new kotlinx.serialization.j(sb);
    }
}
