package kotlinx.os;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.PROPERTY})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0010\b\u0001\u0010\u0003*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00022\u00020\u0004B\u0000"}, d2 = {"Lkotlinx/parcelize/TypeParceler;", "T", "Lkotlinx/parcelize/Parceler;", "P", ""}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.annotation.Repeatable
@java.lang.annotation.Repeatable(kotlinx.parcelize.TypeParceler.Container.class)
/* loaded from: classes3.dex */
public @interface TypeParceler<T, P extends kotlinx.os.Parceler<? super T>> {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.PROPERTY})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.jvm.internal.RepeatableContainer
    public @interface Container {
        kotlinx.os.TypeParceler[] value();
    }
}
