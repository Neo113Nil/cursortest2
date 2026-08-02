package androidx.room;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0018\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/room/RenameColumn;", "", "", "tableName", "fromColumnName", "toColumnName", "()Ljava/lang/String;", "Entries"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
@java.lang.annotation.Repeatable(androidx.room.RenameColumn.Entries.class)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
/* loaded from: classes.dex */
public @interface RenameColumn {

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00048\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005"}, d2 = {"Landroidx/room/RenameColumn$Entries;", "", "Landroidx/room/RenameColumn;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "()[Landroidx/room/RenameColumn;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface Entries {
        androidx.room.RenameColumn[] value();
    }

    java.lang.String fromColumnName();

    java.lang.String tableName();

    java.lang.String toColumnName();
}
