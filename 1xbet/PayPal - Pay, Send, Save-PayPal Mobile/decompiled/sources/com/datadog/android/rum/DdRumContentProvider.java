package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/rum/DdRumContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", "uri", "", "selection", "", "selectionArgs", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "onCreate", "()Z", "projection", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DdRumContentProvider extends android.content.ContentProvider {
    public static final int DEFAULT_IMPORTANCE = 100;
    private static int processImportance;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.rum.DdRumContentProvider.Companion INSTANCE = new com.datadog.android.rum.DdRumContentProvider.Companion(null);
    private static long createTimeNs = java.lang.System.nanoTime();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (processImportance != 0) {
            return true;
        }
        android.content.Context context = getContext();
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        java.lang.Object systemService = context != null ? context.getSystemService("activity") : null;
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        int myPid = android.os.Process.myPid();
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            java.util.Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((android.app.ActivityManager.RunningAppProcessInfo) next).pid == myPid) {
                    runningAppProcessInfo = next;
                    break;
                }
            }
            runningAppProcessInfo = runningAppProcessInfo;
        }
        processImportance = runningAppProcessInfo != null ? runningAppProcessInfo.importance : 100;
        return true;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/rum/DdRumContentProvider$Companion;", "", "<init>", "()V", "", "DEFAULT_IMPORTANCE", com.visa.cbp.getEncExpo.warmup, "", "createTimeNs", "J", "getCreateTimeNs", "()J", "setCreateTimeNs", "(J)V", "processImportance", "getProcessImportance", "()I", "setProcessImportance", "(I)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final int getProcessImportance() {
            return com.datadog.android.rum.DdRumContentProvider.processImportance;
        }

        public final void setProcessImportance(int i) {
            com.datadog.android.rum.DdRumContentProvider.processImportance = i;
        }

        public final long getCreateTimeNs() {
            return com.datadog.android.rum.DdRumContentProvider.createTimeNs;
        }

        public final void setCreateTimeNs(long j) {
            com.datadog.android.rum.DdRumContentProvider.createTimeNs = j;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues values, java.lang.String selection, java.lang.String[] selectionArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] projection, java.lang.String selection, java.lang.String[] selectionArgs, java.lang.String sortOrder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues values) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }
}
