package com.datadog.android.sqlite;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00018\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/sqlite/DatadogDatabaseErrorHandler;", "Landroid/database/DatabaseErrorHandler;", "", "sdkInstanceName", "defaultErrorHandler", "<init>", "(Ljava/lang/String;Landroid/database/DatabaseErrorHandler;)V", "Landroid/database/sqlite/SQLiteDatabase;", "dbObj", "", "onCorruption", "(Landroid/database/sqlite/SQLiteDatabase;)V", "Landroid/database/DatabaseErrorHandler;", "getDefaultErrorHandler$dd_sdk_android_rum_release", "()Landroid/database/DatabaseErrorHandler;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/datadog/android/core/SdkReference;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/core/SdkReference;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatadogDatabaseErrorHandler implements android.database.DatabaseErrorHandler {
    public static final java.lang.String DATABASE_CORRUPTION_ERROR_MESSAGE = "Corruption reported by sqlite database: %s";
    private final android.database.DatabaseErrorHandler defaultErrorHandler;
    private final com.datadog.android.core.SdkReference getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public DatadogDatabaseErrorHandler(java.lang.String str, android.database.DatabaseErrorHandler databaseErrorHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseErrorHandler, "");
        this.getHighSpeedVideoSizes = str;
        this.defaultErrorHandler = databaseErrorHandler;
        this.getHighSpeedVideoFpsRanges = new com.datadog.android.core.SdkReference(str, null, 2, null);
    }

    public /* synthetic */ DatadogDatabaseErrorHandler(java.lang.String str, android.database.DefaultDatabaseErrorHandler defaultDatabaseErrorHandler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new android.database.DefaultDatabaseErrorHandler() : defaultDatabaseErrorHandler);
    }

    /* renamed from: getDefaultErrorHandler$dd_sdk_android_rum_release, reason: from getter */
    public final android.database.DatabaseErrorHandler getDefaultErrorHandler() {
        return this.defaultErrorHandler;
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(android.database.sqlite.SQLiteDatabase dbObj) {
        final java.lang.String concat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbObj, "");
        this.defaultErrorHandler.onCorruption(dbObj);
        com.datadog.android.api.SdkCore sdkCore = this.getHighSpeedVideoFpsRanges.get();
        if (sdkCore != null) {
            com.datadog.android.rum.RumMonitor rumMonitor = com.datadog.android.rum.GlobalRumMonitor.get(sdkCore);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.US, DATABASE_CORRUPTION_ERROR_MESSAGE, java.util.Arrays.copyOf(new java.lang.Object[]{dbObj.getPath()}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            rumMonitor.addError(format, com.datadog.android.rum.RumErrorSource.SOURCE, null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ERROR_DATABASE_PATH, dbObj.getPath()), kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.ERROR_DATABASE_VERSION, java.lang.Integer.valueOf(dbObj.getVersion()))));
            return;
        }
        java.lang.String str = this.getHighSpeedVideoSizes;
        if (str == null) {
            concat = "Default SDK instance";
        } else {
            concat = "SDK instance with name=".concat(java.lang.String.valueOf(str));
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sqlite.DatadogDatabaseErrorHandler$onCorruption$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                java.lang.String str2 = concat;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str2);
                sb.append(" is not found, skipping reporting the corruption of sqlite database: %s");
                return sb.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DatadogDatabaseErrorHandler() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
