package kotlin.reflect.jvm.internal.impl.load.java.structure;

/* loaded from: classes5.dex */
public interface JavaField extends kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember {
    boolean getHasConstantNotNullInitializer();

    kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getType();

    boolean isEnumEntry();
}
