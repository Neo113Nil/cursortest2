package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaClassifierType extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier getClassifier();

    java.lang.String getClassifierQualifiedName();

    java.lang.String getPresentableText();

    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType> getTypeArguments();

    boolean isRaw();
}
