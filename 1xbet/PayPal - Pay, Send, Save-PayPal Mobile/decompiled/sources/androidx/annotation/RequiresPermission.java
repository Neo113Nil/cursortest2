package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB4\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\tR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u0011\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000b"}, d2 = {"Landroidx/annotation/RequiresPermission;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "allOf", "anyOf", "", "conditional", "()[Ljava/lang/String;", "()Z", "()Ljava/lang/String;", "Read", "Write"}, k = 1, mv = {1, 9, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes.dex */
public @interface RequiresPermission {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/annotation/RequiresPermission$Read;", "", "Landroidx/annotation/RequiresPermission;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Landroidx/annotation/RequiresPermission;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Read {
        androidx.annotation.RequiresPermission value() default @androidx.annotation.RequiresPermission;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/annotation/RequiresPermission$Write;", "", "Landroidx/annotation/RequiresPermission;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Landroidx/annotation/RequiresPermission;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Write {
        androidx.annotation.RequiresPermission value() default @androidx.annotation.RequiresPermission;
    }

    java.lang.String[] allOf() default {};

    java.lang.String[] anyOf() default {};

    boolean conditional() default false;

    java.lang.String value() default "";
}
