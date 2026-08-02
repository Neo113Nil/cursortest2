package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "<init>", "()V", "ThreeDSecureDataCollection", "ThreeDSecureAuthentication", "PlanUserDataCollection", "RealTimeBalance", "TopUpInstrument", "CardVerificationDataCollection", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$CardVerificationDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$PlanUserDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$RealTimeBalance;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureAuthentication;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$TopUpInstrument;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PlanContingencyDetails {
    public static final int $stable = 0;

    private PlanContingencyDetails() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJt\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b,\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "version", "referenceId", "deviceDataCollectionUrl", com.paypal.android.threeds.utils.NetworkUtil.JWT, "deviceDataCollectionMode", "authenticationProvider", "returnUrl", "source", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "getReferenceId", "getDeviceDataCollectionUrl", "getJwt", "getDeviceDataCollectionMode", "getAuthenticationProvider", "getReturnUrl", "getSource", "getReason"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ThreeDSecureDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 0;
        private final java.lang.String authenticationProvider;
        private final java.lang.String deviceDataCollectionMode;
        private final java.lang.String deviceDataCollectionUrl;
        private final java.lang.String jwt;
        private final java.lang.String reason;
        private final java.lang.String referenceId;
        private final java.lang.String returnUrl;
        private final java.lang.String source;
        private final java.lang.String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDSecureDataCollection(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.version = str;
            this.referenceId = str2;
            this.deviceDataCollectionUrl = str3;
            this.jwt = str4;
            this.deviceDataCollectionMode = str5;
            this.authenticationProvider = str6;
            this.returnUrl = str7;
            this.source = str8;
            this.reason = str9;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.String getDeviceDataCollectionUrl() {
            return this.deviceDataCollectionUrl;
        }

        public final java.lang.String getJwt() {
            return this.jwt;
        }

        public final java.lang.String getDeviceDataCollectionMode() {
            return this.deviceDataCollectionMode;
        }

        public final java.lang.String getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.String getSource() {
            return this.source;
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            java.lang.String str2 = this.referenceId;
            java.lang.String str3 = this.deviceDataCollectionUrl;
            java.lang.String str4 = this.jwt;
            java.lang.String str5 = this.deviceDataCollectionMode;
            java.lang.String str6 = this.authenticationProvider;
            java.lang.String str7 = this.returnUrl;
            java.lang.String str8 = this.source;
            java.lang.String str9 = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDSecureDataCollection(version=");
            sb.append(str);
            sb.append(", referenceId=");
            sb.append(str2);
            sb.append(", deviceDataCollectionUrl=");
            sb.append(str3);
            sb.append(", jwt=");
            sb.append(str4);
            sb.append(", deviceDataCollectionMode=");
            sb.append(str5);
            sb.append(", authenticationProvider=");
            sb.append(str6);
            sb.append(", returnUrl=");
            sb.append(str7);
            sb.append(", source=");
            sb.append(str8);
            sb.append(", reason=");
            sb.append(str9);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            int hashCode2 = this.referenceId.hashCode();
            int hashCode3 = this.deviceDataCollectionUrl.hashCode();
            int hashCode4 = this.jwt.hashCode();
            java.lang.String str = this.deviceDataCollectionMode;
            int hashCode5 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.authenticationProvider;
            int hashCode6 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.returnUrl;
            int hashCode7 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.source;
            int hashCode8 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.reason;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str5 != null ? str5.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection threeDSecureDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.version, threeDSecureDataCollection.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDSecureDataCollection.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceDataCollectionUrl, threeDSecureDataCollection.deviceDataCollectionUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwt, threeDSecureDataCollection.jwt) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceDataCollectionMode, threeDSecureDataCollection.deviceDataCollectionMode) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationProvider, threeDSecureDataCollection.authenticationProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, threeDSecureDataCollection.returnUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, threeDSecureDataCollection.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, threeDSecureDataCollection.reason);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection copy(java.lang.String version, java.lang.String referenceId, java.lang.String deviceDataCollectionUrl, java.lang.String jwt, java.lang.String deviceDataCollectionMode, java.lang.String authenticationProvider, java.lang.String returnUrl, java.lang.String source, java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceDataCollectionUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureDataCollection(version, referenceId, deviceDataCollectionUrl, jwt, deviceDataCollectionMode, authenticationProvider, returnUrl, source, reason);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getSource() {
            return this.source;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDeviceDataCollectionMode() {
            return this.deviceDataCollectionMode;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getJwt() {
            return this.jwt;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDeviceDataCollectionUrl() {
            return this.deviceDataCollectionUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0082\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0012R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureAuthentication;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "version", "referenceId", com.paypal.android.threeds.utils.NetworkUtil.JWT, "resolutionRedirectUrl", "resolutionRedirectMethod", "transactionId", "externalTransactionId", "authenticationProvider", "paymentAuthRequest", "", "Lcom/paypal/oslo/feature/p2p/domain/model/RedirectRequestParameter;", "redirectRequestParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$ThreeDSecureAuthentication;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "getReferenceId", "getJwt", "getResolutionRedirectUrl", "getResolutionRedirectMethod", "getTransactionId", "getExternalTransactionId", "getAuthenticationProvider", "getPaymentAuthRequest", "Ljava/util/List;", "getRedirectRequestParameters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ThreeDSecureAuthentication extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 8;
        private final java.lang.String authenticationProvider;
        private final java.lang.String externalTransactionId;
        private final java.lang.String jwt;
        private final java.lang.String paymentAuthRequest;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> redirectRequestParameters;
        private final java.lang.String referenceId;
        private final java.lang.String resolutionRedirectMethod;
        private final java.lang.String resolutionRedirectUrl;
        private final java.lang.String transactionId;
        private final java.lang.String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDSecureAuthentication(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
            this.version = str;
            this.referenceId = str2;
            this.jwt = str3;
            this.resolutionRedirectUrl = str4;
            this.resolutionRedirectMethod = str5;
            this.transactionId = str6;
            this.externalTransactionId = str7;
            this.authenticationProvider = str8;
            this.paymentAuthRequest = str9;
            this.redirectRequestParameters = list;
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.String getJwt() {
            return this.jwt;
        }

        public final java.lang.String getResolutionRedirectUrl() {
            return this.resolutionRedirectUrl;
        }

        public final java.lang.String getResolutionRedirectMethod() {
            return this.resolutionRedirectMethod;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final java.lang.String getExternalTransactionId() {
            return this.externalTransactionId;
        }

        public final java.lang.String getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        public final java.lang.String getPaymentAuthRequest() {
            return this.paymentAuthRequest;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> getRedirectRequestParameters() {
            return this.redirectRequestParameters;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            java.lang.String str2 = this.referenceId;
            java.lang.String str3 = this.jwt;
            java.lang.String str4 = this.resolutionRedirectUrl;
            java.lang.String str5 = this.resolutionRedirectMethod;
            java.lang.String str6 = this.transactionId;
            java.lang.String str7 = this.externalTransactionId;
            java.lang.String str8 = this.authenticationProvider;
            java.lang.String str9 = this.paymentAuthRequest;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> list = this.redirectRequestParameters;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDSecureAuthentication(version=");
            sb.append(str);
            sb.append(", referenceId=");
            sb.append(str2);
            sb.append(", jwt=");
            sb.append(str3);
            sb.append(", resolutionRedirectUrl=");
            sb.append(str4);
            sb.append(", resolutionRedirectMethod=");
            sb.append(str5);
            sb.append(", transactionId=");
            sb.append(str6);
            sb.append(", externalTransactionId=");
            sb.append(str7);
            sb.append(", authenticationProvider=");
            sb.append(str8);
            sb.append(", paymentAuthRequest=");
            sb.append(str9);
            sb.append(", redirectRequestParameters=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            int hashCode2 = this.referenceId.hashCode();
            int hashCode3 = this.jwt.hashCode();
            int hashCode4 = this.resolutionRedirectUrl.hashCode();
            int hashCode5 = this.resolutionRedirectMethod.hashCode();
            int hashCode6 = this.transactionId.hashCode();
            java.lang.String str = this.externalTransactionId;
            int hashCode7 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.authenticationProvider;
            int hashCode8 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.paymentAuthRequest;
            int hashCode9 = str3 == null ? 0 : str3.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> list = this.redirectRequestParameters;
            return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication threeDSecureAuthentication = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.version, threeDSecureAuthentication.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDSecureAuthentication.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.jwt, threeDSecureAuthentication.jwt) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolutionRedirectUrl, threeDSecureAuthentication.resolutionRedirectUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolutionRedirectMethod, threeDSecureAuthentication.resolutionRedirectMethod) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, threeDSecureAuthentication.transactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalTransactionId, threeDSecureAuthentication.externalTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationProvider, threeDSecureAuthentication.authenticationProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentAuthRequest, threeDSecureAuthentication.paymentAuthRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectRequestParameters, threeDSecureAuthentication.redirectRequestParameters);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication copy(java.lang.String version, java.lang.String referenceId, java.lang.String jwt, java.lang.String resolutionRedirectUrl, java.lang.String resolutionRedirectMethod, java.lang.String transactionId, java.lang.String externalTransactionId, java.lang.String authenticationProvider, java.lang.String paymentAuthRequest, java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> redirectRequestParameters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolutionRedirectUrl, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolutionRedirectMethod, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.ThreeDSecureAuthentication(version, referenceId, jwt, resolutionRedirectUrl, resolutionRedirectMethod, transactionId, externalTransactionId, authenticationProvider, paymentAuthRequest, redirectRequestParameters);
        }

        /* renamed from: component9, reason: from getter */
        public final java.lang.String getPaymentAuthRequest() {
            return this.paymentAuthRequest;
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.String getAuthenticationProvider() {
            return this.authenticationProvider;
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getExternalTransactionId() {
            return this.externalTransactionId;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getResolutionRedirectMethod() {
            return this.resolutionRedirectMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getResolutionRedirectUrl() {
            return this.resolutionRedirectUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getJwt() {
            return this.jwt;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.RedirectRequestParameter> component10() {
            return this.redirectRequestParameters;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$PlanUserDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanUserDataCollectionAttribute;", "requiredFields", "Lcom/paypal/oslo/feature/p2p/domain/model/IdentityDocumentType;", "identityDocuments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$PlanUserDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequiredFields", "getIdentityDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PlanUserDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> identityDocuments;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> requiredFields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PlanUserDataCollection(java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> list, java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requiredFields = list;
            this.identityDocuments = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> getRequiredFields() {
            return this.requiredFields;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> getIdentityDocuments() {
            return this.identityDocuments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> list = this.requiredFields;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> list2 = this.identityDocuments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanUserDataCollection(requiredFields=");
            sb.append(list);
            sb.append(", identityDocuments=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.requiredFields.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> list = this.identityDocuments;
            return (hashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection planUserDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requiredFields, planUserDataCollection.requiredFields) && kotlin.jvm.internal.Intrinsics.areEqual(this.identityDocuments, planUserDataCollection.identityDocuments);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection copy(java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> requiredFields, java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> identityDocuments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredFields, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection(requiredFields, identityDocuments);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentType> component2() {
            return this.identityDocuments;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> component1() {
            return this.requiredFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.PlanUserDataCollection planUserDataCollection, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = planUserDataCollection.requiredFields;
            }
            if ((i & 2) != 0) {
                list2 = planUserDataCollection.identityDocuments;
            }
            return planUserDataCollection.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$RealTimeBalance;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "confirmationUrl", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$RealTimeBalance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmationUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class RealTimeBalance extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 0;
        private final java.lang.String confirmationUrl;

        public RealTimeBalance(java.lang.String str) {
            super(null);
            this.confirmationUrl = str;
        }

        public final java.lang.String getConfirmationUrl() {
            return this.confirmationUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmationUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RealTimeBalance(confirmationUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.confirmationUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationUrl, ((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance) other).confirmationUrl);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance copy(java.lang.String confirmationUrl) {
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance(confirmationUrl);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmationUrl() {
            return this.confirmationUrl;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.RealTimeBalance realTimeBalance, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = realTimeBalance.confirmationUrl;
            }
            return realTimeBalance.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$TopUpInstrument;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "provider", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "minimumAmount", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$TopUpInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProvider", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getMinimumAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TopUpInstrument extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount minimumAmount;
        private final java.lang.String provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopUpInstrument(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.Amount amount) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            this.provider = str;
            this.minimumAmount = amount;
        }

        public final java.lang.String getProvider() {
            return this.provider;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getMinimumAmount() {
            return this.minimumAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.provider;
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.minimumAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TopUpInstrument(provider=");
            sb.append(str);
            sb.append(", minimumAmount=");
            sb.append(amount);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.minimumAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument topUpInstrument = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.provider, topUpInstrument.provider) && kotlin.jvm.internal.Intrinsics.areEqual(this.minimumAmount, topUpInstrument.minimumAmount);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument copy(java.lang.String provider, com.paypal.oslo.feature.p2p.domain.model.Amount minimumAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minimumAmount, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument(provider, minimumAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getMinimumAmount() {
            return this.minimumAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.TopUpInstrument topUpInstrument, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.Amount amount, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = topUpInstrument.provider;
            }
            if ((i & 2) != 0) {
                amount = topUpInstrument.minimumAmount;
            }
            return topUpInstrument.copy(str, amount);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$CardVerificationDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails;", "", "cvvLength", "<init>", "(Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Integer;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyDetails$CardVerificationDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getCvvLength"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CardVerificationDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails {
        public static final int $stable = 0;
        private final java.lang.Integer cvvLength;

        public CardVerificationDataCollection(java.lang.Integer num) {
            super(null);
            this.cvvLength = num;
        }

        public final java.lang.Integer getCvvLength() {
            return this.cvvLength;
        }

        public final java.lang.String toString() {
            java.lang.Integer num = this.cvvLength;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardVerificationDataCollection(cvvLength=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Integer num = this.cvvLength;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvvLength, ((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection) other).cvvLength);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection copy(java.lang.Integer cvvLength) {
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection(cvvLength);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Integer getCvvLength() {
            return this.cvvLength;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyDetails.CardVerificationDataCollection cardVerificationDataCollection, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = cardVerificationDataCollection.cvvLength;
            }
            return cardVerificationDataCollection.copy(num);
        }
    }

    public /* synthetic */ PlanContingencyDetails(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
