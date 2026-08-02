package kotlinx.serialization;

@java.lang.annotation.Target({})
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002R%\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006"}, d2 = {"Lkotlinx/serialization/UseSerializers;", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/KSerializer;", "serializerClasses", "", "()[Ljava/lang/Class;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FILE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes3.dex */
public @interface UseSerializers {
    java.lang.Class<? extends kotlinx.serialization.KSerializer<?>>[] serializerClasses();
}
