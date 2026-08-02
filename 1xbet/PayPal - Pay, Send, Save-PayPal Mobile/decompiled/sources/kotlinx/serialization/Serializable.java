package kotlinx.serialization;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.TYPE_USE})
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0016\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/serialization/Serializable;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "with", "()Ljava/lang/Class;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.TYPE})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes3.dex */
public @interface Serializable {
    java.lang.Class<? extends kotlinx.serialization.KSerializer<?>> with() default kotlinx.serialization.KSerializer.class;
}
