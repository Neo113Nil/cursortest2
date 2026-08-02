package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001B8\u0012\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0006\u001a\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\rR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007¢\u0006\u0006\u001a\u0004\b\n\u0010\u000e"}, d2 = {"Landroidx/room/Relation;", "", "Lkotlin/reflect/KClass;", "entity", "", "parentColumn", "entityColumn", "Landroidx/room/Junction;", "associateBy", "", "projection", "()Ljava/lang/Class;", "()Ljava/lang/String;", "()Landroidx/room/Junction;", "()[Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Relation {
    androidx.room.Junction associateBy() default @androidx.room.Junction(java.lang.Object.class);

    java.lang.Class<?> entity() default java.lang.Object.class;

    java.lang.String entityColumn();

    java.lang.String parentColumn();

    java.lang.String[] projection() default {};
}
