package com.chuckerteam.chucker.api;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/chuckerteam/chucker/api/ChuckerCollector;", "", "Landroid/content/Context;", "context", "", "showNotification", "Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "retentionPeriod", "<init>", "(Landroid/content/Context;ZLcom/chuckerteam/chucker/api/RetentionManager$Period;)V", "", "startTimestamp", "Lcom/chuckerteam/chucker/api/ExportFormat;", "exportFormat", "Landroid/net/Uri;", "writeTransactions", "(Landroid/content/Context;Ljava/lang/Long;Lcom/chuckerteam/chucker/api/ExportFormat;)Landroid/net/Uri;", "Z", "getShowNotification", "()Z", "setShowNotification", "(Z)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ChuckerCollector {
    private boolean showNotification;

    public ChuckerCollector(android.content.Context context, boolean z, com.chuckerteam.chucker.api.RetentionManager.Period period) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "");
        this.showNotification = z;
    }

    public final boolean getShowNotification() {
        return this.showNotification;
    }

    public final void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public /* synthetic */ ChuckerCollector(android.content.Context context, boolean z, com.chuckerteam.chucker.api.RetentionManager.Period period, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? true : z, (i & 4) != 0 ? com.chuckerteam.chucker.api.RetentionManager.Period.ONE_WEEK : period);
    }

    public static /* synthetic */ android.net.Uri writeTransactions$default(com.chuckerteam.chucker.api.ChuckerCollector chuckerCollector, android.content.Context context, java.lang.Long l, com.chuckerteam.chucker.api.ExportFormat exportFormat, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            exportFormat = com.chuckerteam.chucker.api.ExportFormat.LOG;
        }
        return chuckerCollector.writeTransactions(context, l, exportFormat);
    }

    public final android.net.Uri writeTransactions(android.content.Context context, java.lang.Long startTimestamp, com.chuckerteam.chucker.api.ExportFormat exportFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exportFormat, "");
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChuckerCollector(android.content.Context context, boolean z) {
        this(context, z, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChuckerCollector(android.content.Context context) {
        this(context, false, null, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
    }
}
