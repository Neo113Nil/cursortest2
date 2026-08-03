package androidx.sqlite.db;

/* compiled from: SupportSQLiteCompat.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat;", "", "()V", "Api16Impl", "Api19Impl", "Api21Impl", "Api23Impl", "Api29Impl", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SupportSQLiteCompat {
    private SupportSQLiteCompat() {
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007JI\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0010\u0010\u0014\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0007¨\u0006 "}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api16Impl;", "", "()V", "cancel", "", "cancellationSignal", "Landroid/os/CancellationSignal;", "createCancellationSignal", "deleteDatabase", "", "file", "Ljava/io/File;", "disableWriteAheadLogging", "sQLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "isWriteAheadLoggingEnabled", "rawQueryWithFactory", "Landroid/database/Cursor;", "sql", "", "selectionArgs", "", "editTable", "cursorFactory", "Landroid/database/sqlite/SQLiteDatabase$CursorFactory;", "(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/Cursor;", "setForeignKeyConstraintsEnabled", com.ironsource.mediationsdk.metadata.a.j, "setWriteAheadLoggingEnabled", "sQLiteOpenHelper", "Landroid/database/sqlite/SQLiteOpenHelper;", "enabled", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api16Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api16Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api16Impl();

        private Api16Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void cancel(android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @kotlin.jvm.JvmStatic
        public static final android.os.CancellationSignal createCancellationSignal() {
            return new android.os.CancellationSignal();
        }

        @kotlin.jvm.JvmStatic
        public static final boolean deleteDatabase(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            return android.database.sqlite.SQLiteDatabase.deleteDatabase(file);
        }

        @kotlin.jvm.JvmStatic
        public static final android.database.Cursor rawQueryWithFactory(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String sql, java.lang.String[] selectionArgs, java.lang.String editTable, android.os.CancellationSignal cancellationSignal, android.database.sqlite.SQLiteDatabase.CursorFactory cursorFactory) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionArgs, "selectionArgs");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationSignal, "cancellationSignal");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursorFactory, "cursorFactory");
            android.database.Cursor rawQueryWithFactory = sQLiteDatabase.rawQueryWithFactory(cursorFactory, sql, selectionArgs, editTable, cancellationSignal);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "sQLiteDatabase.rawQueryW…ationSignal\n            )");
            return rawQueryWithFactory;
        }

        @kotlin.jvm.JvmStatic
        public static final void setForeignKeyConstraintsEnabled(android.database.sqlite.SQLiteDatabase sQLiteDatabase, boolean enable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.setForeignKeyConstraintsEnabled(enable);
        }

        @kotlin.jvm.JvmStatic
        public static final void disableWriteAheadLogging(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            sQLiteDatabase.disableWriteAheadLogging();
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isWriteAheadLoggingEnabled(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
            return sQLiteDatabase.isWriteAheadLoggingEnabled();
        }

        @kotlin.jvm.JvmStatic
        public static final void setWriteAheadLoggingEnabled(android.database.sqlite.SQLiteOpenHelper sQLiteOpenHelper, boolean enabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(enabled);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api19Impl;", "", "()V", "getNotificationUri", "Landroid/net/Uri;", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroid/database/Cursor;", "isLowRamDevice", "", "activityManager", "Landroid/app/ActivityManager;", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api19Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api19Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api19Impl();

        private Api19Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final android.net.Uri getNotificationUri(android.database.Cursor cursor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "cursor");
            android.net.Uri notificationUri = cursor.getNotificationUri();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationUri, "cursor.notificationUri");
            return notificationUri;
        }

        @kotlin.jvm.JvmStatic
        public static final boolean isLowRamDevice(android.app.ActivityManager activityManager) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api21Impl;", "", "()V", "getNoBackupFilesDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api21Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api21Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api21Impl();

        private Api21Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final java.io.File getNoBackupFilesDir(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            java.io.File noBackupFilesDir = context.getNoBackupFilesDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
            return noBackupFilesDir;
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api23Impl;", "", "()V", "setExtras", "", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroid/database/Cursor;", "extras", "Landroid/os/Bundle;", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api23Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api23Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api23Impl();

        private Api23Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void setExtras(android.database.Cursor cursor, android.os.Bundle extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "cursor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* compiled from: SupportSQLiteCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007¨\u0006\r"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteCompat$Api29Impl;", "", "()V", "getNotificationUris", "", "Landroid/net/Uri;", com.helpshift.user.UserConstants.POLLING_CURSOR, "Landroid/database/Cursor;", "setNotificationUris", "", "cr", "Landroid/content/ContentResolver;", "uris", "sqlite_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Api29Impl {
        public static final androidx.sqlite.db.SupportSQLiteCompat.Api29Impl INSTANCE = new androidx.sqlite.db.SupportSQLiteCompat.Api29Impl();

        private Api29Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void setNotificationUris(android.database.Cursor cursor, android.content.ContentResolver cr, java.util.List<? extends android.net.Uri> uris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "cursor");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cr, "cr");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uris, "uris");
            cursor.setNotificationUris(cr, uris);
        }

        @kotlin.jvm.JvmStatic
        public static final java.util.List<android.net.Uri> getNotificationUris(android.database.Cursor cursor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "cursor");
            java.util.List<android.net.Uri> notificationUris = cursor.getNotificationUris();
            kotlin.jvm.internal.Intrinsics.checkNotNull(notificationUris);
            return notificationUris;
        }
    }
}
