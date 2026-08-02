package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaMethod extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner {
    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getAnnotationParameterDefaultValue();

    boolean getHasAnnotationParameterDefaultValue();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getReturnType();

    java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters();
}
