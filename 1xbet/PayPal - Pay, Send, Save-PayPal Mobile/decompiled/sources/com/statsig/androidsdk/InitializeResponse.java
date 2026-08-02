package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse;", "", "<init>", "()V", "FailedInitializeResponse", "SuccessfulInitializeResponse", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InitializeResponse {

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "Lcom/statsig/androidsdk/InitializeFailReason;", "reason", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "exception", "", "statusCode", "<init>", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)V", "component1", "()Lcom/statsig/androidsdk/InitializeFailReason;", "component2", "()Ljava/lang/Exception;", "component3", "()Ljava/lang/Integer;", "copy", "(Lcom/statsig/androidsdk/InitializeFailReason;Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getException", "Lcom/statsig/androidsdk/InitializeFailReason;", "getReason", "Ljava/lang/Integer;", "getStatusCode"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FailedInitializeResponse extends com.statsig.androidsdk.InitializeResponse {

        @com.google.gson.annotations.SerializedName("exception")
        private final java.lang.Exception exception;

        @com.google.gson.annotations.SerializedName("reason")
        private final com.statsig.androidsdk.InitializeFailReason reason;

        @com.google.gson.annotations.SerializedName("statusCode")
        private final java.lang.Integer statusCode;

        public /* synthetic */ FailedInitializeResponse(com.statsig.androidsdk.InitializeFailReason initializeFailReason, java.lang.Exception exc, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(initializeFailReason, (i & 2) != 0 ? null : exc, (i & 4) != 0 ? null : num);
        }

        public final com.statsig.androidsdk.InitializeFailReason getReason() {
            return this.reason;
        }

        public final java.lang.Exception getException() {
            return this.exception;
        }

        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedInitializeResponse(com.statsig.androidsdk.InitializeFailReason initializeFailReason, java.lang.Exception exc, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeFailReason, "");
            this.reason = initializeFailReason;
            this.exception = exc;
            this.statusCode = num;
        }

        public final java.lang.String toString() {
            com.statsig.androidsdk.InitializeFailReason initializeFailReason = this.reason;
            java.lang.Exception exc = this.exception;
            java.lang.Integer num = this.statusCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FailedInitializeResponse(reason=");
            sb.append(initializeFailReason);
            sb.append(", exception=");
            sb.append(exc);
            sb.append(", statusCode=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.reason.hashCode();
            java.lang.Exception exc = this.exception;
            int hashCode2 = exc == null ? 0 : exc.hashCode();
            java.lang.Integer num = this.statusCode;
            return (((hashCode * 31) + hashCode2) * 31) + (num != null ? num.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse)) {
                return false;
            }
            com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse = (com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse) other;
            return this.reason == failedInitializeResponse.reason && kotlin.jvm.internal.Intrinsics.areEqual(this.exception, failedInitializeResponse.exception) && kotlin.jvm.internal.Intrinsics.areEqual(this.statusCode, failedInitializeResponse.statusCode);
        }

        public final com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse copy(com.statsig.androidsdk.InitializeFailReason reason, java.lang.Exception exception, java.lang.Integer statusCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse(reason, exception, statusCode);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.Integer getStatusCode() {
            return this.statusCode;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Exception getException() {
            return this.exception;
        }

        /* renamed from: component1, reason: from getter */
        public final com.statsig.androidsdk.InitializeFailReason getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse copy$default(com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failedInitializeResponse, com.statsig.androidsdk.InitializeFailReason initializeFailReason, java.lang.Exception exc, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                initializeFailReason = failedInitializeResponse.reason;
            }
            if ((i & 2) != 0) {
                exc = failedInitializeResponse.exception;
            }
            if ((i & 4) != 0) {
                num = failedInitializeResponse.statusCode;
            }
            return failedInitializeResponse.copy(initializeFailReason, exc, num);
        }
    }

    public InitializeResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012.\b\u0002\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00020\u0002\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u001e\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J6\u0010$\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00020\u0002\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010&Jü\u0001\u0010'\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022.\b\u0002\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00020\u0002\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00022\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u0010&R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0018R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b2\u0010\u0018R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0018R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\b5\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010 R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u00100\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010<R@\u0010\u0011\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00020\u0002\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b=\u0010\u0018R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b>\u0010\u0018R(\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b?\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010\""}, d2 = {"Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "Lcom/statsig/androidsdk/InitializeResponse;", "", "", "Lcom/statsig/androidsdk/APIFeatureGate;", "featureGates", "Lcom/statsig/androidsdk/APIDynamicConfig;", "configs", "layerConfigs", "", "hasUpdates", "Lcom/statsig/androidsdk/HashAlgorithm;", "hashUsed", "", "time", "derivedFields", "", "paramStores", "fullChecksum", "sdkFlags", "sdkConfigs", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLcom/statsig/androidsdk/HashAlgorithm;JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "component10", "component11", "component2", "component3", "component4", "()Z", "component5", "()Lcom/statsig/androidsdk/HashAlgorithm;", "component6", "()J", "component7", "component8", "component9", "()Ljava/lang/String;", "copy", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ZLcom/statsig/androidsdk/HashAlgorithm;JLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lcom/statsig/androidsdk/InitializeResponse$SuccessfulInitializeResponse;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/Map;", "getConfigs", "getDerivedFields", "getFeatureGates", "Ljava/lang/String;", "getFullChecksum", "Z", "getHasUpdates", "Lcom/statsig/androidsdk/HashAlgorithm;", "getHashUsed", "getLayerConfigs", "setLayerConfigs", "(Ljava/util/Map;)V", "getParamStores", "getSdkConfigs", "getSdkFlags", "J", "getTime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class SuccessfulInitializeResponse extends com.statsig.androidsdk.InitializeResponse {

        @com.google.gson.annotations.SerializedName("dynamic_configs")
        public java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> configs;

        @com.google.gson.annotations.SerializedName("derived_fields")
        public java.util.Map<java.lang.String, java.lang.String> derivedFields;

        @com.google.gson.annotations.SerializedName("feature_gates")
        public java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> featureGates;

        @com.google.gson.annotations.SerializedName("full_checksum")
        public java.lang.String fullChecksum;

        @com.google.gson.annotations.SerializedName("has_updates")
        public boolean hasUpdates;

        @com.google.gson.annotations.SerializedName("hash_used")
        public com.statsig.androidsdk.HashAlgorithm hashUsed;

        @com.google.gson.annotations.SerializedName("layer_configs")
        public java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> layerConfigs;

        @com.google.gson.annotations.SerializedName("param_stores")
        public java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> paramStores;

        @com.google.gson.annotations.SerializedName("sdk_configs")
        public java.util.Map<java.lang.String, java.lang.Object> sdkConfigs;

        @com.google.gson.annotations.SerializedName("sdk_flags")
        public java.util.Map<java.lang.String, java.lang.Object> sdkFlags;

        @com.google.gson.annotations.SerializedName("time")
        public long time;

        public /* synthetic */ SuccessfulInitializeResponse(java.util.Map map, java.util.Map map2, java.util.Map map3, boolean z, com.statsig.androidsdk.HashAlgorithm hashAlgorithm, long j, java.util.Map map4, java.util.Map map5, java.lang.String str, java.util.Map map6, java.util.Map map7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(map, map2, map3, z, (i & 16) != 0 ? null : hashAlgorithm, j, map4, (i & 128) != 0 ? null : map5, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : map6, (i & 1024) != 0 ? null : map7);
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> getFeatureGates() {
            return this.featureGates;
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> getConfigs() {
            return this.configs;
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> getLayerConfigs() {
            return this.layerConfigs;
        }

        public final void setLayerConfigs(java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map) {
            this.layerConfigs = map;
        }

        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        public final com.statsig.androidsdk.HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        public final long getTime() {
            return this.time;
        }

        public final java.util.Map<java.lang.String, java.lang.String> getDerivedFields() {
            return this.derivedFields;
        }

        public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> getParamStores() {
            return this.paramStores;
        }

        public final java.lang.String getFullChecksum() {
            return this.fullChecksum;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getSdkFlags() {
            return this.sdkFlags;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> getSdkConfigs() {
            return this.sdkConfigs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessfulInitializeResponse(java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> map, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map2, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map3, boolean z, com.statsig.androidsdk.HashAlgorithm hashAlgorithm, long j, java.util.Map<java.lang.String, java.lang.String> map4, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> map5, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map6, java.util.Map<java.lang.String, ? extends java.lang.Object> map7) {
            super(null);
            this.featureGates = map;
            this.configs = map2;
            this.layerConfigs = map3;
            this.hasUpdates = z;
            this.hashUsed = hashAlgorithm;
            this.time = j;
            this.derivedFields = map4;
            this.paramStores = map5;
            this.fullChecksum = str;
            this.sdkFlags = map6;
            this.sdkConfigs = map7;
        }

        public /* synthetic */ SuccessfulInitializeResponse() {
        }

        public final java.lang.String toString() {
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> map = this.featureGates;
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map2 = this.configs;
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map3 = this.layerConfigs;
            boolean z = this.hasUpdates;
            com.statsig.androidsdk.HashAlgorithm hashAlgorithm = this.hashUsed;
            long j = this.time;
            java.util.Map<java.lang.String, java.lang.String> map4 = this.derivedFields;
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map5 = this.paramStores;
            java.lang.String str = this.fullChecksum;
            java.util.Map<java.lang.String, java.lang.Object> map6 = this.sdkFlags;
            java.util.Map<java.lang.String, java.lang.Object> map7 = this.sdkConfigs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuccessfulInitializeResponse(featureGates=");
            sb.append(map);
            sb.append(", configs=");
            sb.append(map2);
            sb.append(", layerConfigs=");
            sb.append(map3);
            sb.append(", hasUpdates=");
            sb.append(z);
            sb.append(", hashUsed=");
            sb.append(hashAlgorithm);
            sb.append(", time=");
            sb.append(j);
            sb.append(", derivedFields=");
            sb.append(map4);
            sb.append(", paramStores=");
            sb.append(map5);
            sb.append(", fullChecksum=");
            sb.append(str);
            sb.append(", sdkFlags=");
            sb.append(map6);
            sb.append(", sdkConfigs=");
            sb.append(map7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> map = this.featureGates;
            int hashCode = map == null ? 0 : map.hashCode();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map2 = this.configs;
            int hashCode2 = map2 == null ? 0 : map2.hashCode();
            java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> map3 = this.layerConfigs;
            int hashCode3 = map3 == null ? 0 : map3.hashCode();
            int hashCode4 = java.lang.Boolean.hashCode(this.hasUpdates);
            com.statsig.androidsdk.HashAlgorithm hashAlgorithm = this.hashUsed;
            int hashCode5 = hashAlgorithm == null ? 0 : hashAlgorithm.hashCode();
            int hashCode6 = java.lang.Long.hashCode(this.time);
            java.util.Map<java.lang.String, java.lang.String> map4 = this.derivedFields;
            int hashCode7 = map4 == null ? 0 : map4.hashCode();
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> map5 = this.paramStores;
            int hashCode8 = map5 == null ? 0 : map5.hashCode();
            java.lang.String str = this.fullChecksum;
            int hashCode9 = str == null ? 0 : str.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map6 = this.sdkFlags;
            int hashCode10 = map6 == null ? 0 : map6.hashCode();
            java.util.Map<java.lang.String, java.lang.Object> map7 = this.sdkConfigs;
            return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (map7 != null ? map7.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse)) {
                return false;
            }
            com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse successfulInitializeResponse = (com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.featureGates, successfulInitializeResponse.featureGates) && kotlin.jvm.internal.Intrinsics.areEqual(this.configs, successfulInitializeResponse.configs) && kotlin.jvm.internal.Intrinsics.areEqual(this.layerConfigs, successfulInitializeResponse.layerConfigs) && this.hasUpdates == successfulInitializeResponse.hasUpdates && this.hashUsed == successfulInitializeResponse.hashUsed && this.time == successfulInitializeResponse.time && kotlin.jvm.internal.Intrinsics.areEqual(this.derivedFields, successfulInitializeResponse.derivedFields) && kotlin.jvm.internal.Intrinsics.areEqual(this.paramStores, successfulInitializeResponse.paramStores) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullChecksum, successfulInitializeResponse.fullChecksum) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkFlags, successfulInitializeResponse.sdkFlags) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkConfigs, successfulInitializeResponse.sdkConfigs);
        }

        public final com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse copy(java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> featureGates, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> configs, java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> layerConfigs, boolean hasUpdates, com.statsig.androidsdk.HashAlgorithm hashUsed, long time, java.util.Map<java.lang.String, java.lang.String> derivedFields, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>>> paramStores, java.lang.String fullChecksum, java.util.Map<java.lang.String, ? extends java.lang.Object> sdkFlags, java.util.Map<java.lang.String, ? extends java.lang.Object> sdkConfigs) {
            return new com.statsig.androidsdk.InitializeResponse.SuccessfulInitializeResponse(featureGates, configs, layerConfigs, hasUpdates, hashUsed, time, derivedFields, paramStores, fullChecksum, sdkFlags, sdkConfigs);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getFullChecksum() {
            return this.fullChecksum;
        }

        public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> component8() {
            return this.paramStores;
        }

        public final java.util.Map<java.lang.String, java.lang.String> component7() {
            return this.derivedFields;
        }

        /* renamed from: component6, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        /* renamed from: component5, reason: from getter */
        public final com.statsig.androidsdk.HashAlgorithm getHashUsed() {
            return this.hashUsed;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getHasUpdates() {
            return this.hasUpdates;
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> component3() {
            return this.layerConfigs;
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIDynamicConfig> component2() {
            return this.configs;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component11() {
            return this.sdkConfigs;
        }

        public final java.util.Map<java.lang.String, java.lang.Object> component10() {
            return this.sdkFlags;
        }

        public final java.util.Map<java.lang.String, com.statsig.androidsdk.APIFeatureGate> component1() {
            return this.featureGates;
        }
    }

    public /* synthetic */ InitializeResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
