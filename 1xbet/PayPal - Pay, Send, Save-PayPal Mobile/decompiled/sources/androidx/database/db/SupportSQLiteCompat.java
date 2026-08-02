package androidx.database.db;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "<init>", "()V", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupportSQLiteCompat {
    private SupportSQLiteCompat() {
    }

    @kotlin.Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 16.")
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "<init>", "()V", "Landroid/os/CancellationSignal;", "cancellationSignal", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Landroid/os/CancellationSignal;)V", "createCancellationSignal", "()Landroid/os/CancellationSignal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api16Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api16Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api16Impl();

        private Api16Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void cancel(android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "");
            cancellationSignal.cancel();
        }

        @kotlin.jvm.JvmStatic
        public static final android.os.CancellationSignal createCancellationSignal() {
            return new android.os.CancellationSignal();
        }
    }

    @kotlin.Deprecated(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 19.")
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/net/Uri;", "getNotificationUri", "(Landroid/database/Cursor;)Landroid/net/Uri;", "Landroid/app/ActivityManager;", "activityManager", "", "isLowRamDevice", "(Landroid/app/ActivityManager;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Api19Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api19Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api19Impl();

        private Api19Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.net.Uri getNotificationUri(android.database.Cursor cursor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
            android.net.Uri notificationUri = cursor.getNotificationUri();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationUri, "");
            return notificationUri;
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityManager, "");
            return activityManager.isLowRamDevice();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "getNoBackupFilesDir", "(Landroid/content/Context;)Ljava/io/File;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Api21Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api21Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api21Impl();

        private Api21Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final java.io.File getNoBackupFilesDir(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            java.io.File noBackupFilesDir = context.getNoBackupFilesDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "");
            return noBackupFilesDir;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/os/Bundle;", "extras", "", "setExtras", "(Landroid/database/Cursor;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api23Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api23Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api23Impl();

        private Api23Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void setExtras(android.database.Cursor cursor, android.os.Bundle extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "");
            cursor.setExtras(extras);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "<init>", "()V", "Landroid/database/Cursor;", "cursor", "Landroid/content/ContentResolver;", "cr", "", "Landroid/net/Uri;", "uris", "", "setNotificationUris", "(Landroid/database/Cursor;Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUris", "(Landroid/database/Cursor;)Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Api29Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api29Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void setNotificationUris(android.database.Cursor cursor, android.content.ContentResolver cr, java.util.List<? extends android.net.Uri> uris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uris, "");
            cursor.setNotificationUris(cr, uris);
        }

        @kotlin.jvm.JvmStatic
        public static final java.util.List<android.net.Uri> getNotificationUris(android.database.Cursor cursor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
            java.util.List<android.net.Uri> notificationUris = cursor.getNotificationUris();
            kotlin.jvm.internal.Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }
    }
}
