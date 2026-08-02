package androidx.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.MustBeDocumented
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/annotation/CheckResult;", "", "", "suggest", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@java.lang.annotation.Documented
/* loaded from: classes.dex */
public @interface CheckResult {
    java.lang.String suggest() default "";
}
