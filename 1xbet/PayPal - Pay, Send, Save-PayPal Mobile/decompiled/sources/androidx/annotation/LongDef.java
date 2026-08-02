package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\t"}, d2 = {"Landroidx/annotation/LongDef;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "flag", "open", "()Z", "", "()[J"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
/* loaded from: classes.dex */
public @interface LongDef {
    boolean flag() default false;

    boolean open() default false;

    long[] value() default {};
}
