package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public final class JavaTypesKt {
    public static final boolean isSuperWildcard(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType javaType) {
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType javaWildcardType = javaType instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType ? (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType) javaType : null;
        return (javaWildcardType == null || javaWildcardType.getBound() == null || javaWildcardType.isExtends()) ? false : true;
    }
}
