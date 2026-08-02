package com.paypal.oslo.feature.cardconnect.api.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "<init>", "()V", "Success", "Error", com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit, "KnotEvent", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Error;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Exit;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$KnotEvent;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class CardConnectSDKEvent {
    private CardConnectSDKEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Success;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "merchantId", "", "", "metaData", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Success;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMerchantId", "Ljava/util/Map;", "getMetaData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent {
        private final java.lang.String merchantId;
        private final java.util.Map<java.lang.String, java.lang.Object> metaData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.merchantId = str;
            this.metaData = map;
        }

        public /* synthetic */ Success(java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : map);
        }

        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getMetaData() {
            return this.metaData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.merchantId;
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(merchantId=");
            sb.append(str);
            sb.append(", metaData=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.merchantId.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            return (hashCode * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success success = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, success.merchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, success.metaData);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success copy(java.lang.String merchantId, java.util.Map<java.lang.String, ? extends java.lang.Object> metaData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantId, "");
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success(merchantId, metaData);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component2() {
            return this.metaData;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Success success, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.merchantId;
            }
            if ((i & 2) != 0) {
                map = success.metaData;
            }
            return success.copy(str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u001e\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Error;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "errorCode", "errorDescription", "", "", "metaData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Error;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription", "Ljava/util/Map;", "getMetaData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent {
        private final java.lang.String errorCode;
        private final java.lang.String errorDescription;
        private final java.util.Map<java.lang.String, java.lang.Object> metaData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.errorCode = str;
            this.errorDescription = str2;
            this.metaData = map;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : map);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getMetaData() {
            return this.metaData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorDescription;
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorCode=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(", metaData=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorCode.hashCode();
            int hashCode2 = this.errorDescription.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            return (((hashCode * 31) + hashCode2) * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error error = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, error.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, error.metaData);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error copy(java.lang.String errorCode, java.lang.String errorDescription, java.util.Map<java.lang.String, ? extends java.lang.Object> metaData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error(errorCode, errorDescription, metaData);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component3() {
            return this.metaData;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Error error, java.lang.String str, java.lang.String str2, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = error.errorDescription;
            }
            if ((i & 4) != 0) {
                map = error.metaData;
            }
            return error.copy(str, str2, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Exit;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "", "", "metaData", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$Exit;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getMetaData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Exit extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent {
        private final java.util.Map<java.lang.String, java.lang.Object> metaData;

        public Exit(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            this.metaData = map;
        }

        public /* synthetic */ Exit(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getMetaData() {
            return this.metaData;
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exit(metaData=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, ((com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit) other).metaData);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit copy(java.util.Map<java.lang.String, ? extends java.lang.Object> metaData) {
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit(metaData);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component1() {
            return this.metaData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.Exit exit, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = exit.metaData;
            }
            return exit.copy(map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Exit() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u001e\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$KnotEvent;", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent;", "", "event", "merchantName", "merchantId", "taskId", "", "", "metaData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKEvent$KnotEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEvent", "getMerchantName", "getMerchantId", "getTaskId", "Ljava/util/Map;", "getMetaData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class KnotEvent extends com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent {
        private final java.lang.String event;
        private final java.lang.String merchantId;
        private final java.lang.String merchantName;
        private final java.util.Map<java.lang.String, java.lang.Object> metaData;
        private final java.lang.String taskId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KnotEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.event = str;
            this.merchantName = str2;
            this.merchantId = str3;
            this.taskId = str4;
            this.metaData = map;
        }

        public /* synthetic */ KnotEvent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : map);
        }

        public final java.lang.String getEvent() {
            return this.event;
        }

        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getMetaData() {
            return this.metaData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.event;
            java.lang.String str2 = this.merchantName;
            java.lang.String str3 = this.merchantId;
            java.lang.String str4 = this.taskId;
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("KnotEvent(event=");
            sb.append(str);
            sb.append(", merchantName=");
            sb.append(str2);
            sb.append(", merchantId=");
            sb.append(str3);
            sb.append(", taskId=");
            sb.append(str4);
            sb.append(", metaData=");
            sb.append(map);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.event.hashCode();
            int hashCode2 = this.merchantName.hashCode();
            int hashCode3 = this.merchantId.hashCode();
            int hashCode4 = this.taskId.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map = this.metaData;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (map == null ? 0 : map.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent)) {
                return false;
            }
            com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent knotEvent = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.event, knotEvent.event) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, knotEvent.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantId, knotEvent.merchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.taskId, knotEvent.taskId) && kotlin.jvm.internal.Intrinsics.areEqual(this.metaData, knotEvent.metaData);
        }

        public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent copy(java.lang.String event, java.lang.String merchantName, java.lang.String merchantId, java.lang.String taskId, java.util.Map<java.lang.String, ? extends java.lang.Object> metaData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "");
            return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent(event, merchantName, merchantId, taskId, metaData);
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component5() {
            return this.metaData;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getTaskId() {
            return this.taskId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMerchantId() {
            return this.merchantId;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEvent() {
            return this.event;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent copy$default(com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKEvent.KnotEvent knotEvent, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = knotEvent.event;
            }
            if ((i & 2) != 0) {
                str2 = knotEvent.merchantName;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                str3 = knotEvent.merchantId;
            }
            java.lang.String str6 = str3;
            if ((i & 8) != 0) {
                str4 = knotEvent.taskId;
            }
            java.lang.String str7 = str4;
            if ((i & 16) != 0) {
                map = knotEvent.metaData;
            }
            return knotEvent.copy(str, str5, str6, str7, map);
        }
    }

    public /* synthetic */ CardConnectSDKEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
