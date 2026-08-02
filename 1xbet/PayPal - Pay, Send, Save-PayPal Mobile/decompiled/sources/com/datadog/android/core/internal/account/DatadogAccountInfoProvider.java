package com.datadog.android.core.internal.account;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/core/internal/account/DatadogAccountInfoProvider;", "Lcom/datadog/android/core/internal/account/MutableAccountInfoProvider;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "", "", "extraInfo", "", "addExtraInfo", "(Ljava/util/Map;)V", "clearAccountInfo", "()V", "Lcom/datadog/android/api/context/AccountInfo;", "getAccountInfo", "()Lcom/datadog/android/api/context/AccountInfo;", "id", "name", "setAccountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/context/AccountInfo;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogAccountInfoProvider implements com.datadog.android.core.internal.account.MutableAccountInfoProvider {
    public static final java.lang.String MSG_ACCOUNT_NULL = "Failed to add Account ExtraInfo because no Account Info exist yet. Please call `setAccountInfo` first.";
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private volatile com.datadog.android.api.context.AccountInfo getHighSpeedVideoFpsRanges;

    public DatadogAccountInfoProvider(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
    }

    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void setAccountInfo(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        com.datadog.android.api.context.AccountInfo accountInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
        com.datadog.android.api.context.AccountInfo accountInfo2 = this.getHighSpeedVideoFpsRanges;
        if (accountInfo2 == null || (accountInfo = accountInfo2.copy(id, name2, kotlin.collections.MapsKt.toMap(extraInfo))) == null) {
            accountInfo = new com.datadog.android.api.context.AccountInfo(id, name2, kotlin.collections.MapsKt.toMap(extraInfo));
        }
        this.getHighSpeedVideoFpsRanges = accountInfo;
    }

    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void addExtraInfo(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
        com.datadog.android.api.context.AccountInfo accountInfo = this.getHighSpeedVideoFpsRanges;
        if (accountInfo != null) {
            this.getHighSpeedVideoFpsRanges = com.datadog.android.api.context.AccountInfo.copy$default(accountInfo, null, null, kotlin.collections.MapsKt.plus(accountInfo.getExtraInfo(), extraInfo), 3, null);
            unit = kotlin.Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.account.DatadogAccountInfoProvider$addExtraInfo$2$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.account.DatadogAccountInfoProvider.MSG_ACCOUNT_NULL;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.core.internal.account.MutableAccountInfoProvider
    public final void clearAccountInfo() {
        this.getHighSpeedVideoFpsRanges = null;
    }

    @Override // com.datadog.android.core.internal.account.AccountInfoProvider
    /* renamed from: getAccountInfo, reason: from getter */
    public final com.datadog.android.api.context.AccountInfo getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
