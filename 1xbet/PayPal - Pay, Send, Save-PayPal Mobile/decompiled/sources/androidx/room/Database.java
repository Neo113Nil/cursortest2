package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001BJ\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0012\b\u0002\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002R\u001b\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\fR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\u0006\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\t\u001a\u00020\b8\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000f"}, d2 = {"Landroidx/room/Database;", "", "", "Lkotlin/reflect/KClass;", "entities", "views", "", "version", "", "exportSchema", "Landroidx/room/AutoMigration;", "autoMigrations", "()[Ljava/lang/Class;", "()I", "()Z", "()[Landroidx/room/AutoMigration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Database {
    androidx.room.AutoMigration[] autoMigrations() default {};

    java.lang.Class<?>[] entities() default {};

    boolean exportSchema() default true;

    int version();

    java.lang.Class<?>[] views() default {};
}
