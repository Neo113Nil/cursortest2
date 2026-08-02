package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public interface JvmTypeFactory<T> {
    T boxType(T t);

    T createFromString(java.lang.String str);

    T createObjectType(java.lang.String str);

    T createPrimitiveType(kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType);

    T getJavaLangClassType();

    java.lang.String toString(T t);
}
