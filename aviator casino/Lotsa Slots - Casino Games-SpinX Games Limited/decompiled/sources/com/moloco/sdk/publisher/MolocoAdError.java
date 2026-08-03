package com.moloco.sdk.publisher;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError;", "", "networkName", "", "adUnitId", "errorType", "Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;Ljava/lang/String;)V", "getNetworkName", "()Ljava/lang/String;", "getAdUnitId", "getErrorType", "()Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "getDescription", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ErrorType", "AdCreateError", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MolocoAdError {
    public static final int $stable = 0;
    private final java.lang.String adUnitId;
    private final java.lang.String description;
    private final com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType;
    private final java.lang.String networkName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;", "", "description", "", "errorCode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()I", "SDK_INIT_FAILED", "SDK_INIT_WAS_NOT_COMPLETED", com.moloco.sdk.internal.publisher.C3418b.h, "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AdCreateError {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.moloco.sdk.publisher.MolocoAdError.AdCreateError[] $VALUES;
        public static final com.moloco.sdk.publisher.MolocoAdError.AdCreateError SDK_INIT_FAILED = new com.moloco.sdk.publisher.MolocoAdError.AdCreateError("SDK_INIT_FAILED", 0, "Failed to create `ad` object due to SDK initialization failure.", 1011);
        public static final com.moloco.sdk.publisher.MolocoAdError.AdCreateError SDK_INIT_WAS_NOT_COMPLETED = new com.moloco.sdk.publisher.MolocoAdError.AdCreateError("SDK_INIT_WAS_NOT_COMPLETED", 1, "Failed to create `ad` object due to `Moloco.initialize()` not complete.", 1012);
        public static final com.moloco.sdk.publisher.MolocoAdError.AdCreateError UNABLE_TO_CREATE_AD = new com.moloco.sdk.publisher.MolocoAdError.AdCreateError(com.moloco.sdk.internal.publisher.C3418b.h, 2, "Failed to create `ad` object due to `Moloco.initialize()` not complete in time", 1013);
        private final java.lang.String description;
        private final int errorCode;

        private static final /* synthetic */ com.moloco.sdk.publisher.MolocoAdError.AdCreateError[] $values() {
            return new com.moloco.sdk.publisher.MolocoAdError.AdCreateError[]{SDK_INIT_FAILED, SDK_INIT_WAS_NOT_COMPLETED, UNABLE_TO_CREATE_AD};
        }

        static {
            com.moloco.sdk.publisher.MolocoAdError.AdCreateError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private AdCreateError(java.lang.String str, int i, java.lang.String str2, int i2) {
            this.description = str2;
            this.errorCode = i2;
        }

        public static kotlin.enums.EnumEntries<com.moloco.sdk.publisher.MolocoAdError.AdCreateError> getEntries() {
            return $ENTRIES;
        }

        public static com.moloco.sdk.publisher.MolocoAdError.AdCreateError valueOf(java.lang.String str) {
            return (com.moloco.sdk.publisher.MolocoAdError.AdCreateError) java.lang.Enum.valueOf(com.moloco.sdk.publisher.MolocoAdError.AdCreateError.class, str);
        }

        public static com.moloco.sdk.publisher.MolocoAdError.AdCreateError[] values() {
            return (com.moloco.sdk.publisher.MolocoAdError.AdCreateError[]) $VALUES.clone();
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/moloco/sdk/publisher/MolocoAdError$ErrorType;", "", "description", "", "errorCode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getErrorCode", "()I", "UNKNOWN", "SDK_INIT_ERROR", "SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT", "SDK_INVALID_CONFIGURATION", "AD_LOAD_FAILED", "AD_LOAD_FAILED_SDK_NOT_INIT", "AD_LOAD_TIMEOUT_ERROR", "AD_LOAD_LIMIT_REACHED", "AD_LOAD_BID_FAILED", "AD_LOAD_WEBVIEW_FAILED", "AD_SHOW_ERROR", "AD_SHOW_ERROR_NOT_LOADED", "AD_SHOW_ERROR_ALREADY_DISPLAYING", "AD_BID_PARSE_ERROR", "AD_SIGNAL_COLLECTION_FAILED", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorType {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
        private static final /* synthetic */ com.moloco.sdk.publisher.MolocoAdError.ErrorType[] $VALUES;
        private final java.lang.String description;
        private final int errorCode;
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType UNKNOWN = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("UNKNOWN", 0, "Generic failure error code", -1);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType SDK_INIT_ERROR = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("SDK_INIT_ERROR", 1, "SDK initialization error", 1000);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT", 2, "WorkManager crash that prevents us from creating a persistent http request client", 1001);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType SDK_INVALID_CONFIGURATION = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("SDK_INVALID_CONFIGURATION", 3, "Ad object cannot be created, due to invalid configuration", 1002);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_FAILED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_FAILED", 4, "Ad is not loaded", 2000);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_FAILED_SDK_NOT_INIT = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_FAILED_SDK_NOT_INIT", 5, "Ad load failed because SDK was not initialized", 2001);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_TIMEOUT_ERROR = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_TIMEOUT_ERROR", 6, "Ad failed to load because the request timed out", 2003);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_LIMIT_REACHED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_LIMIT_REACHED", 7, "Ad load limit reached", 2004);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_BID_FAILED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_BID_FAILED", 8, "Ad failed to load because bid request failed or no fill", 2005);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_LOAD_WEBVIEW_FAILED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_LOAD_WEBVIEW_FAILED", 9, "Ad failed to load because Webview was *not* available", 2006);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_SHOW_ERROR = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_SHOW_ERROR", 10, "Ad show failed despite a successful ad load. Internal renderer error", 3000);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_SHOW_ERROR_NOT_LOADED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_SHOW_ERROR_NOT_LOADED", 11, "Ad show failed because ad load was not called", 3001);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_SHOW_ERROR_ALREADY_DISPLAYING = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_SHOW_ERROR_ALREADY_DISPLAYING", 12, "Ad show failed because show() was invoked multiple times when ad was already rendering", 3002);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_BID_PARSE_ERROR = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_BID_PARSE_ERROR", 13, "The bid response received was not parseable by the SDK", com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
        public static final com.moloco.sdk.publisher.MolocoAdError.ErrorType AD_SIGNAL_COLLECTION_FAILED = new com.moloco.sdk.publisher.MolocoAdError.ErrorType("AD_SIGNAL_COLLECTION_FAILED", 14, "The bid token couldn’t be retrieved.", 5000);

        private static final /* synthetic */ com.moloco.sdk.publisher.MolocoAdError.ErrorType[] $values() {
            return new com.moloco.sdk.publisher.MolocoAdError.ErrorType[]{UNKNOWN, SDK_INIT_ERROR, SDK_PERSISTENT_HTTP_REQUEST_FAILED_TO_INIT, SDK_INVALID_CONFIGURATION, AD_LOAD_FAILED, AD_LOAD_FAILED_SDK_NOT_INIT, AD_LOAD_TIMEOUT_ERROR, AD_LOAD_LIMIT_REACHED, AD_LOAD_BID_FAILED, AD_LOAD_WEBVIEW_FAILED, AD_SHOW_ERROR, AD_SHOW_ERROR_NOT_LOADED, AD_SHOW_ERROR_ALREADY_DISPLAYING, AD_BID_PARSE_ERROR, AD_SIGNAL_COLLECTION_FAILED};
        }

        static {
            com.moloco.sdk.publisher.MolocoAdError.ErrorType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        }

        private ErrorType(java.lang.String str, int i, java.lang.String str2, int i2) {
            this.description = str2;
            this.errorCode = i2;
        }

        public static kotlin.enums.EnumEntries<com.moloco.sdk.publisher.MolocoAdError.ErrorType> getEntries() {
            return $ENTRIES;
        }

        public static com.moloco.sdk.publisher.MolocoAdError.ErrorType valueOf(java.lang.String str) {
            return (com.moloco.sdk.publisher.MolocoAdError.ErrorType) java.lang.Enum.valueOf(com.moloco.sdk.publisher.MolocoAdError.ErrorType.class, str);
        }

        public static com.moloco.sdk.publisher.MolocoAdError.ErrorType[] values() {
            return (com.moloco.sdk.publisher.MolocoAdError.ErrorType[]) $VALUES.clone();
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public MolocoAdError(java.lang.String networkName, java.lang.String adUnitId, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "errorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        this.networkName = networkName;
        this.adUnitId = adUnitId;
        this.errorType = errorType;
        this.description = description;
    }

    public static /* synthetic */ com.moloco.sdk.publisher.MolocoAdError copy$default(com.moloco.sdk.publisher.MolocoAdError molocoAdError, java.lang.String str, java.lang.String str2, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = molocoAdError.networkName;
        }
        if ((i & 2) != 0) {
            str2 = molocoAdError.adUnitId;
        }
        if ((i & 4) != 0) {
            errorType = molocoAdError.errorType;
        }
        if ((i & 8) != 0) {
            str3 = molocoAdError.description;
        }
        return molocoAdError.copy(str, str2, errorType, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    /* renamed from: component3, reason: from getter */
    public final com.moloco.sdk.publisher.MolocoAdError.ErrorType getErrorType() {
        return this.errorType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.moloco.sdk.publisher.MolocoAdError copy(java.lang.String networkName, java.lang.String adUnitId, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, java.lang.String description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkName, "networkName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "errorType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        return new com.moloco.sdk.publisher.MolocoAdError(networkName, adUnitId, errorType, description);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.moloco.sdk.publisher.MolocoAdError)) {
            return false;
        }
        com.moloco.sdk.publisher.MolocoAdError molocoAdError = (com.moloco.sdk.publisher.MolocoAdError) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkName, molocoAdError.networkName) && kotlin.jvm.internal.Intrinsics.areEqual(this.adUnitId, molocoAdError.adUnitId) && this.errorType == molocoAdError.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.description, molocoAdError.description);
    }

    public final java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.moloco.sdk.publisher.MolocoAdError.ErrorType getErrorType() {
        return this.errorType;
    }

    public final java.lang.String getNetworkName() {
        return this.networkName;
    }

    public int hashCode() {
        return (((((this.networkName.hashCode() * 31) + this.adUnitId.hashCode()) * 31) + this.errorType.hashCode()) * 31) + this.description.hashCode();
    }

    public java.lang.String toString() {
        return "MolocoAdError(networkName=" + this.networkName + ", adUnitId=" + this.adUnitId + ", errorType=" + this.errorType + ", description=" + this.description + ')';
    }

    public /* synthetic */ MolocoAdError(java.lang.String str, java.lang.String str2, com.moloco.sdk.publisher.MolocoAdError.ErrorType errorType, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, errorType, (i & 8) != 0 ? errorType.getDescription() : str3);
    }
}
