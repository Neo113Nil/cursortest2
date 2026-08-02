package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class BuiltinSpecialPropertiesKt {
    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.FqName access$child(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return fqName.child(identifier);
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.FqName access$childSafe(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, java.lang.String str) {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return fqNameUnsafe.child(identifier).toSafe();
    }
}
