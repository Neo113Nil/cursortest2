package com.paypal.oslo.feature.identity.otplogin.verifyotp.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OtpDigitEntered", "OtpInputCompleted", "RequestNewOtp", "MoreOptions", "ChangeUser", "OtpVerificationSucceeded", "ChallengeRequired", "OtpVerificationFailed", "NewOtpSent", "NewOtpFailed", "SmsAutoDetected", "Initialize", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$ChangeUser;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$MoreOptions;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$NewOtpFailed;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$NewOtpSent;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpDigitEntered;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpInputCompleted;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationFailed;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationSucceeded;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$RequestNewOtp;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$SmsAutoDetected;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class OtpVerificationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private OtpVerificationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpDigitEntered;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "otpDigit", "", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(CI)V", "component1", "()C", "component2", "()I", "copy", "(CI)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpDigitEntered;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getOtpDigit", com.visa.cbp.getEncExpo.warmup, "getPosition"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpDigitEntered extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final char otpDigit;
        private final int position;

        public OtpDigitEntered(char c, int i) {
            super("OtpDigitEntered", null);
            this.otpDigit = c;
            this.position = i;
        }

        public final char getOtpDigit() {
            return this.otpDigit;
        }

        public final int getPosition() {
            return this.position;
        }

        public final java.lang.String toString() {
            char c = this.otpDigit;
            int i = this.position;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpDigitEntered(otpDigit=");
            sb.append(c);
            sb.append(", position=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Character.hashCode(this.otpDigit) * 31) + java.lang.Integer.hashCode(this.position);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered otpDigitEntered = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered) other;
            return this.otpDigit == otpDigitEntered.otpDigit && this.position == otpDigitEntered.position;
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered copy(char otpDigit, int position) {
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered(otpDigit, position);
        }

        /* renamed from: component2, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* renamed from: component1, reason: from getter */
        public final char getOtpDigit() {
            return this.otpDigit;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpDigitEntered otpDigitEntered, char c, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                c = otpDigitEntered.otpDigit;
            }
            if ((i2 & 2) != 0) {
                i = otpDigitEntered.position;
            }
            return otpDigitEntered.copy(c, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpInputCompleted;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "requestId", "otpCode", "publicCredential", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpInputCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getRequestId", "getOtpCode", "getPublicCredential", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpInputCompleted extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String nonce;
        private final java.lang.String otpCode;
        private final java.lang.String publicCredential;
        private final java.lang.String requestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpInputCompleted(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super("OtpInputCompleted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.requestId = str;
            this.otpCode = str2;
            this.publicCredential = str3;
            this.nonce = str4;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.requestId;
            java.lang.String str2 = this.otpCode;
            java.lang.String str3 = this.publicCredential;
            java.lang.String str4 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpInputCompleted(requestId=");
            sb.append(str);
            sb.append(", otpCode=");
            sb.append(str2);
            sb.append(", publicCredential=");
            sb.append(str3);
            sb.append(", nonce=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.requestId.hashCode() * 31) + this.otpCode.hashCode()) * 31) + this.publicCredential.hashCode()) * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted otpInputCompleted = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, otpInputCompleted.requestId) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, otpInputCompleted.otpCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, otpInputCompleted.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, otpInputCompleted.nonce);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted copy(java.lang.String requestId, java.lang.String otpCode, java.lang.String publicCredential, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted(requestId, otpCode, publicCredential, nonce);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpInputCompleted otpInputCompleted, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = otpInputCompleted.requestId;
            }
            if ((i & 2) != 0) {
                str2 = otpInputCompleted.otpCode;
            }
            if ((i & 4) != 0) {
                str3 = otpInputCompleted.publicCredential;
            }
            if ((i & 8) != 0) {
                str4 = otpInputCompleted.nonce;
            }
            return otpInputCompleted.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$RequestNewOtp;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "challengeId", "publicCredential", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$RequestNewOtp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getChallengeId", "getPublicCredential", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestNewOtp extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String challengeId;
        private final java.lang.String nonce;
        private final java.lang.String publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestNewOtp(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super("RequestNewOtp", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.challengeId = str;
            this.publicCredential = str2;
            this.nonce = str3;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.challengeId;
            java.lang.String str2 = this.publicCredential;
            java.lang.String str3 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestNewOtp(challengeId=");
            sb.append(str);
            sb.append(", publicCredential=");
            sb.append(str2);
            sb.append(", nonce=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.challengeId.hashCode() * 31) + this.publicCredential.hashCode()) * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp requestNewOtp = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, requestNewOtp.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, requestNewOtp.publicCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, requestNewOtp.nonce);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp copy(java.lang.String challengeId, java.lang.String publicCredential, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp(challengeId, publicCredential, nonce);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getPublicCredential() {
            return this.publicCredential;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.RequestNewOtp requestNewOtp, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestNewOtp.challengeId;
            }
            if ((i & 2) != 0) {
                str2 = requestNewOtp.publicCredential;
            }
            if ((i & 4) != 0) {
                str3 = requestNewOtp.nonce;
            }
            return requestNewOtp.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$MoreOptions;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MoreOptions extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.MoreOptions INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.MoreOptions();

        public final int hashCode() {
            return -1535699908;
        }

        private MoreOptions() {
            super("MoreOptions", null);
        }

        public final java.lang.String toString() {
            return "MoreOptions";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.MoreOptions)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$ChangeUser;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeUser extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChangeUser INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChangeUser();

        public final int hashCode() {
            return -577450360;
        }

        private ChangeUser() {
            super("ChangeUser", null);
        }

        public final java.lang.String toString() {
            return "ChangeUser";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChangeUser)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationSucceeded;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "Lcom/paypal/oslo/feature/identity/login/domain/model/PostAuthenticationOperation;", "postAuthOperations", "<init>", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/identity/foundation/model/Token;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/foundation/model/Token;", "getToken", "Ljava/util/List;", "getPostAuthOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpVerificationSucceeded extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations;
        private final com.paypal.oslo.feature.identity.foundation.model.Token token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpVerificationSucceeded(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list) {
            super("OtpVerificationSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.token = token;
            this.postAuthOperations = list;
        }

        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        public /* synthetic */ OtpVerificationSucceeded(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(token, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> getPostAuthOperations() {
            return this.postAuthOperations;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.foundation.model.Token token = this.token;
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> list = this.postAuthOperations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpVerificationSucceeded(token=");
            sb.append(token);
            sb.append(", postAuthOperations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.token.hashCode() * 31) + this.postAuthOperations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded otpVerificationSucceeded = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.token, otpVerificationSucceeded.token) && kotlin.jvm.internal.Intrinsics.areEqual(this.postAuthOperations, otpVerificationSucceeded.postAuthOperations);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded copy(com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> postAuthOperations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postAuthOperations, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded(token, postAuthOperations);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.PostAuthenticationOperation> component2() {
            return this.postAuthOperations;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.foundation.model.Token getToken() {
            return this.token;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationSucceeded otpVerificationSucceeded, com.paypal.oslo.feature.identity.foundation.model.Token token, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                token = otpVerificationSucceeded.token;
            }
            if ((i & 2) != 0) {
                list = otpVerificationSucceeded.postAuthOperations;
            }
            return otpVerificationSucceeded.copy(token, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$ChallengeRequired;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "challengeResult", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$ChallengeRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeResult;", "getChallengeResult"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChallengeRequired extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeRequired(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            super("ChallengeRequired", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            this.challengeResult = challengeResult;
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult = this.challengeResult;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChallengeRequired(challengeResult=");
            sb.append(challengeResult);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeResult.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeResult, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired) other).challengeResult);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeResult, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired(challengeResult);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult getChallengeResult() {
            return this.challengeResult;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.ChallengeRequired challengeRequired, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeResult challengeResult, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeResult = challengeRequired.challengeResult;
            }
            return challengeRequired.copy(challengeResult);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationFailed;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "errorMessage", "", "isExpiredError", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$OtpVerificationFailed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OtpVerificationFailed extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final boolean isExpiredError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtpVerificationFailed(java.lang.String str, boolean z) {
            super("OtpVerificationFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
            this.isExpiredError = z;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean isExpiredError() {
            return this.isExpiredError;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            boolean z = this.isExpiredError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OtpVerificationFailed(errorMessage=");
            sb.append(str);
            sb.append(", isExpiredError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorMessage.hashCode() * 31) + java.lang.Boolean.hashCode(this.isExpiredError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed otpVerificationFailed = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, otpVerificationFailed.errorMessage) && this.isExpiredError == otpVerificationFailed.isExpiredError;
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed copy(java.lang.String errorMessage, boolean isExpiredError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed(errorMessage, isExpiredError);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsExpiredError() {
            return this.isExpiredError;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.OtpVerificationFailed otpVerificationFailed, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = otpVerificationFailed.errorMessage;
            }
            if ((i & 2) != 0) {
                z = otpVerificationFailed.isExpiredError;
            }
            return otpVerificationFailed.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$NewOtpSent;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NewOtpSent extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpSent INSTANCE = new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpSent();

        public final int hashCode() {
            return 1009840784;
        }

        private NewOtpSent() {
            super("NewOtpSent", null);
        }

        public final java.lang.String toString() {
            return "NewOtpSent";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpSent)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$NewOtpFailed;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$NewOtpFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NewOtpFailed extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewOtpFailed(java.lang.String str) {
            super("NewOtpFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NewOtpFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.NewOtpFailed newOtpFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = newOtpFailed.errorMessage;
            }
            return newOtpFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$SmsAutoDetected;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "otpCode", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$SmsAutoDetected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOtpCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SmsAutoDetected extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final java.lang.String otpCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SmsAutoDetected(java.lang.String str) {
            super("SmsAutoDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.otpCode = str;
        }

        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.otpCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SmsAutoDetected(otpCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.otpCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected) && kotlin.jvm.internal.Intrinsics.areEqual(this.otpCode, ((com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected) other).otpCode);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected copy(java.lang.String otpCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpCode, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected(otpCode);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOtpCode() {
            return this.otpCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.SmsAutoDetected smsAutoDetected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = smsAutoDetected.otpCode;
            }
            return smsAutoDetected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$Initialize;", "Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent;", "", "phoneNumber", "email", "", "autoSmsDetectionEnabled", "challengeId", "nonce", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/otplogin/verifyotp/ui/OtpVerificationEvent$Initialize;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getEmail", "Z", "getAutoSmsDetectionEnabled", "getChallengeId", "getNonce"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent {
        public static final int $stable = 0;
        private final boolean autoSmsDetectionEnabled;
        private final java.lang.String challengeId;
        private final java.lang.String email;
        private final java.lang.String nonce;
        private final java.lang.String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initialize(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4) {
            super("Initialize", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.phoneNumber = str;
            this.email = str2;
            this.autoSmsDetectionEnabled = z;
            this.challengeId = str3;
            this.nonce = str4;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final boolean getAutoSmsDetectionEnabled() {
            return this.autoSmsDetectionEnabled;
        }

        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        public final java.lang.String getNonce() {
            return this.nonce;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.email;
            boolean z = this.autoSmsDetectionEnabled;
            java.lang.String str3 = this.challengeId;
            java.lang.String str4 = this.nonce;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(phoneNumber=");
            sb.append(str);
            sb.append(", email=");
            sb.append(str2);
            sb.append(", autoSmsDetectionEnabled=");
            sb.append(z);
            sb.append(", challengeId=");
            sb.append(str3);
            sb.append(", nonce=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.phoneNumber.hashCode() * 31) + this.email.hashCode()) * 31) + java.lang.Boolean.hashCode(this.autoSmsDetectionEnabled)) * 31) + this.challengeId.hashCode()) * 31) + this.nonce.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize initialize = (com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, initialize.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, initialize.email) && this.autoSmsDetectionEnabled == initialize.autoSmsDetectionEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeId, initialize.challengeId) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, initialize.nonce);
        }

        public final com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize copy(java.lang.String phoneNumber, java.lang.String email, boolean autoSmsDetectionEnabled, java.lang.String challengeId, java.lang.String nonce) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonce, "");
            return new com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize(phoneNumber, email, autoSmsDetectionEnabled, challengeId, nonce);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getNonce() {
            return this.nonce;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getChallengeId() {
            return this.challengeId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getAutoSmsDetectionEnabled() {
            return this.autoSmsDetectionEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize copy$default(com.paypal.oslo.feature.identity.otplogin.verifyotp.ui.OtpVerificationEvent.Initialize initialize, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = initialize.email;
            }
            java.lang.String str5 = str2;
            if ((i & 4) != 0) {
                z = initialize.autoSmsDetectionEnabled;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str3 = initialize.challengeId;
            }
            java.lang.String str6 = str3;
            if ((i & 16) != 0) {
                str4 = initialize.nonce;
            }
            return initialize.copy(str, str5, z2, str6, str4);
        }
    }

    public /* synthetic */ OtpVerificationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
