package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0018\u0012\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b"}, d2 = {"Landroidx/room/TypeConverters;", "", "Lkotlin/reflect/KClass;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/room/BuiltInTypeConverters;", "builtInTypeConverters", "", "()[Ljava/lang/Class;", "()Landroidx/room/BuiltInTypeConverters;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface TypeConverters {
    androidx.room.BuiltInTypeConverters builtInTypeConverters() default @androidx.room.BuiltInTypeConverters;

    java.lang.Class<?>[] value() default {};
}
