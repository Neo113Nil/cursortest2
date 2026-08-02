package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0002\u0018\u00002\u00020\u0001BT\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\t\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010"}, d2 = {"Landroidx/room/Entity;", "", "", "tableName", "", "Landroidx/room/Index;", "indices", "", "inheritSuperIndices", "primaryKeys", "Landroidx/room/ForeignKey;", "foreignKeys", "ignoredColumns", "()Ljava/lang/String;", "()[Landroidx/room/Index;", "()Z", "()[Ljava/lang/String;", "()[Landroidx/room/ForeignKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface Entity {
    androidx.room.ForeignKey[] foreignKeys() default {};

    java.lang.String[] ignoredColumns() default {};

    androidx.room.Index[] indices() default {};

    boolean inheritSuperIndices() default false;

    java.lang.String[] primaryKeys() default {};

    java.lang.String tableName() default "";
}
