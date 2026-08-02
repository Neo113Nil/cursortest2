package com.paypal.oslo.core.telemetry.analytics.schema.context.session;

@com.paypal.oslo.core.telemetry.analytics.annotations.ContextKey(key = "device_info")
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR \u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\"\u0010\u001e\u001a\u0004\b!\u0010\u000bR \u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u000bR \u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/DeviceInfoContext;", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "", "osVersion", "carrier", "deviceModel", "deviceId", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/DeviceInfoContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOsVersion", "getOsVersion$annotations", "()V", "getCarrier", "getCarrier$annotations", "getDeviceModel", "getDeviceModel$annotations", "getDeviceId", "getDeviceId$annotations", "getDeviceType", "getDeviceType$annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DeviceInfoContext extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext {
    public static final int $stable = 0;
    private final java.lang.String carrier;
    private final java.lang.String deviceId;
    private final java.lang.String deviceModel;
    private final java.lang.String deviceType;
    private final java.lang.String osVersion;

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "carrier")
    public static /* synthetic */ void getCarrier$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "id")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "model")
    public static /* synthetic */ void getDeviceModel$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "type")
    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @com.paypal.oslo.core.telemetry.analytics.annotations.AttributeKey(key = "os_version")
    public static /* synthetic */ void getOsVersion$annotations() {
    }

    public DeviceInfoContext(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.osVersion = str;
        this.carrier = str2;
        this.deviceModel = str3;
        this.deviceId = str4;
        this.deviceType = str5;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.lang.String getCarrier() {
        return this.carrier;
    }

    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.osVersion;
        java.lang.String str2 = this.carrier;
        java.lang.String str3 = this.deviceModel;
        java.lang.String str4 = this.deviceId;
        java.lang.String str5 = this.deviceType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfoContext(osVersion=");
        sb.append(str);
        sb.append(", carrier=");
        sb.append(str2);
        sb.append(", deviceModel=");
        sb.append(str3);
        sb.append(", deviceId=");
        sb.append(str4);
        sb.append(", deviceType=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.osVersion.hashCode() * 31) + this.carrier.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext)) {
            return false;
        }
        com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext deviceInfoContext = (com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, deviceInfoContext.osVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.carrier, deviceInfoContext.carrier) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceModel, deviceInfoContext.deviceModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, deviceInfoContext.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceType, deviceInfoContext.deviceType);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext copy(java.lang.String osVersion, java.lang.String carrier, java.lang.String deviceModel, java.lang.String deviceId, java.lang.String deviceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrier, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext(osVersion, carrier, deviceModel, deviceId, deviceType);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCarrier() {
        return this.carrier;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext copy$default(com.paypal.oslo.core.telemetry.analytics.schema.context.session.DeviceInfoContext deviceInfoContext, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfoContext.osVersion;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfoContext.carrier;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = deviceInfoContext.deviceModel;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = deviceInfoContext.deviceId;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = deviceInfoContext.deviceType;
        }
        return deviceInfoContext.copy(str, str6, str7, str8, str5);
    }
}
