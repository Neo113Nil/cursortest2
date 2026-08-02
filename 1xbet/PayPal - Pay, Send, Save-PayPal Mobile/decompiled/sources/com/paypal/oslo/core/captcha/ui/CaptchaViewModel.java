package com.paypal.oslo.core.captcha.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformation", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/AppInformation;)V", "", "correlationId", "", "buildCaptchaHeaders", "(Ljava/lang/String;)Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "SecureAppData", "FptiHeaders"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CaptchaViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.appidentity.domain.AppInformation getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public CaptchaViewModel(com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        this.getHighSpeedVideoFpsRanges = appInformation;
    }

    public final java.util.Map<java.lang.String, java.lang.String> buildCaptchaHeaders(java.lang.String correlationId) {
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        if (correlationId != null) {
        }
        java.lang.String appGUID = this.getHighSpeedVideoFpsRanges.getAppGUID();
        if (appGUID != null) {
        }
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData secureAppData = new com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData(this.getHighSpeedVideoFpsRanges.getAppVersion(), "PayPal", this.getHighSpeedVideoFpsRanges.getSessionID());
        companion.getSerializersModule();
        createMapBuilder.put("X-PayPal-Secure-App-Data", companion.encodeToString(com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData.INSTANCE.serializer(), secureAppData));
        java.lang.String appGUID2 = this.getHighSpeedVideoFpsRanges.getAppGUID();
        if (appGUID2 == null) {
            appGUID2 = "";
        }
        kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
        com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders fptiHeaders = new com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders(appGUID2, this.getHighSpeedVideoFpsRanges.getSessionID(), appGUID2);
        companion2.getSerializersModule();
        createMapBuilder.put("X-PayPal-FPTI", companion2.encodeToString(com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders.INSTANCE.serializer(), fptiHeaders));
        return kotlin.collections.MapsKt.build(createMapBuilder);
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$SecureAppData;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "p3", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "p4", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$SecureAppData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "appVersion", "Ljava/lang/String;", "getAppVersion", "tenant", "getTenant", "appSessionId", "getAppSessionId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    static final /* data */ class SecureAppData {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData.Companion INSTANCE = new com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData.Companion(null);
        private final java.lang.String appSessionId;
        private final java.lang.String appVersion;
        private final java.lang.String tenant;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$SecureAppData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$SecureAppData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData> serializer() {
                return com.paypal.oslo.core.captcha.ui.CaptchaViewModel$SecureAppData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ SecureAppData(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.core.captcha.ui.CaptchaViewModel$SecureAppData$$serializer.INSTANCE.getDescriptor());
            }
            this.appVersion = str;
            this.tenant = str2;
            this.appSessionId = str3;
        }

        public SecureAppData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.appVersion = str;
            this.tenant = str2;
            this.appSessionId = str3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData p0, kotlinx.serialization.encoding.CompositeEncoder p1, kotlinx.serialization.descriptors.SerialDescriptor p2) {
            p1.encodeStringElement(p2, 0, p0.appVersion);
            p1.encodeStringElement(p2, 1, p0.tenant);
            p1.encodeStringElement(p2, 2, p0.appSessionId);
        }

        public final java.lang.String getAppVersion() {
            return this.appVersion;
        }

        public final java.lang.String getTenant() {
            return this.tenant;
        }

        public final java.lang.String getAppSessionId() {
            return this.appSessionId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.appVersion;
            java.lang.String str2 = this.tenant;
            java.lang.String str3 = this.appSessionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecureAppData(appVersion=");
            sb.append(str);
            sb.append(", tenant=");
            sb.append(str2);
            sb.append(", appSessionId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.appVersion.hashCode() * 31) + this.tenant.hashCode()) * 31) + this.appSessionId.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData)) {
                return false;
            }
            com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData secureAppData = (com.paypal.oslo.core.captcha.ui.CaptchaViewModel.SecureAppData) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, secureAppData.appVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.tenant, secureAppData.tenant) && kotlin.jvm.internal.Intrinsics.areEqual(this.appSessionId, secureAppData.appSessionId);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0083\b\u0018\u0000  2\u00020\u0001:\u0002! B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0013R\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$FptiHeaders;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "p3", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "p4", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$FptiHeaders;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "userGuid", "Ljava/lang/String;", "getUserGuid", "userSessionGuid", "getUserSessionGuid", "appGuid", "getAppGuid", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    static final /* data */ class FptiHeaders {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders.Companion INSTANCE = new com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders.Companion(null);
        private final java.lang.String appGuid;
        private final java.lang.String userGuid;
        private final java.lang.String userSessionGuid;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$FptiHeaders$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/captcha/ui/CaptchaViewModel$FptiHeaders;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes10.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders> serializer() {
                return com.paypal.oslo.core.captcha.ui.CaptchaViewModel$FptiHeaders$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FptiHeaders(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.core.captcha.ui.CaptchaViewModel$FptiHeaders$$serializer.INSTANCE.getDescriptor());
            }
            this.userGuid = str;
            this.userSessionGuid = str2;
            this.appGuid = str3;
        }

        public FptiHeaders(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.userGuid = str;
            this.userSessionGuid = str2;
            this.appGuid = str3;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void Camera2StreamConfigurationMap(com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders p0, kotlinx.serialization.encoding.CompositeEncoder p1, kotlinx.serialization.descriptors.SerialDescriptor p2) {
            p1.encodeStringElement(p2, 0, p0.userGuid);
            p1.encodeStringElement(p2, 1, p0.userSessionGuid);
            p1.encodeStringElement(p2, 2, p0.appGuid);
        }

        public final java.lang.String getUserGuid() {
            return this.userGuid;
        }

        public final java.lang.String getUserSessionGuid() {
            return this.userSessionGuid;
        }

        public final java.lang.String getAppGuid() {
            return this.appGuid;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.userGuid;
            java.lang.String str2 = this.userSessionGuid;
            java.lang.String str3 = this.appGuid;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FptiHeaders(userGuid=");
            sb.append(str);
            sb.append(", userSessionGuid=");
            sb.append(str2);
            sb.append(", appGuid=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.userGuid.hashCode() * 31) + this.userSessionGuid.hashCode()) * 31) + this.appGuid.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders)) {
                return false;
            }
            com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders fptiHeaders = (com.paypal.oslo.core.captcha.ui.CaptchaViewModel.FptiHeaders) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userGuid, fptiHeaders.userGuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.userSessionGuid, fptiHeaders.userSessionGuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.appGuid, fptiHeaders.appGuid);
        }
    }
}
