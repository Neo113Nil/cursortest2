package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class NameResolverUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        return kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.fromString(nameResolver.getQualifiedClassName(i), nameResolver.isLocalClassName(i));
    }

    public static final kotlin.reflect.jvm.internal.impl.name.Name getName(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.reflect.jvm.internal.impl.name.Name guessByFirstCharacter = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(nameResolver.getString(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(guessByFirstCharacter, "");
        return guessByFirstCharacter;
    }
}
