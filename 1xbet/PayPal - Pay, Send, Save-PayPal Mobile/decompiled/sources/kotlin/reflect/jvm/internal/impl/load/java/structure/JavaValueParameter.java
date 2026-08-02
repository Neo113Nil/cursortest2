package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaValueParameter extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner {
    kotlin.reflect.jvm.internal.impl.name.Name getName();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getType();

    boolean isVararg();
}
