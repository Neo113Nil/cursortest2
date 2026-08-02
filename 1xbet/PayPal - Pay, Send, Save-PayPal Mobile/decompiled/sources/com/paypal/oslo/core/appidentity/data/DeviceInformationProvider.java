package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\t8\u0017X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\t8\u0017X\u0097D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001b\u0010\u001d\u001a\u00020\u001a8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u001f8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\t8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/DeviceInformationProvider;", "Lcom/paypal/oslo/core/appidentity/domain/DeviceInformation;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "", "deviceModel", "Ljava/lang/String;", "getDeviceModel", "()Ljava/lang/String;", "deviceManufacturer", "getDeviceManufacturer", "osName", "getOsName", "osVersion", "getOsVersion", "Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "getDeviceOrientation", "()Lcom/paypal/oslo/core/appidentity/domain/DeviceOrientation;", "deviceOrientation", "androidId", "getAndroidId", "", "isNFCSupported$delegate", "Lkotlin/Lazy;", "isNFCSupported", "()Z", "Lcom/paypal/oslo/core/appidentity/domain/DeviceType;", "deviceType$delegate", "getDeviceType", "()Lcom/paypal/oslo/core/appidentity/domain/DeviceType;", "deviceType", "networkCarrier$delegate", "getNetworkCarrier", "networkCarrier", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeviceInformationProvider implements com.paypal.oslo.core.appidentity.domain.DeviceInformation {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String androidId;
    private final java.lang.String deviceManufacturer;
    private final java.lang.String deviceModel;

    /* renamed from: deviceType$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy deviceType;

    /* renamed from: isNFCSupported$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy isNFCSupported;

    /* renamed from: networkCarrier$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy networkCarrier;
    private final java.lang.String osName;
    private final java.lang.String osVersion;

    @javax.inject.Inject
    public DeviceInformationProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        java.lang.String str = android.os.Build.MODEL;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        this.deviceModel = str;
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        this.deviceManufacturer = str2;
        this.osName = "Android";
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3, "");
        this.osVersion = str3;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        this.androidId = string == null ? "unknown" : string;
        this.isNFCSupported = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.DeviceInformationProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.this);
                return java.lang.Boolean.valueOf(highResolutionOutputSizeshNQ4ISI);
            }
        });
        this.deviceType = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.DeviceInformationProvider$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.$r8$lambda$35MtJIgFNAphxMBKuuHqR9oPnmE(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.this);
            }
        });
        this.networkCarrier = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.appidentity.data.DeviceInformationProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.$r8$lambda$OOQmboRqaTjasuuhNvq2_2HXzU0(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider.this);
            }
        });
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getOsName() {
        return this.osName;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final com.paypal.oslo.core.appidentity.domain.DeviceOrientation getDeviceOrientation() {
        return com.paypal.oslo.core.appidentity.domain.DeviceOrientation.INSTANCE.fromConfigOrientation(this.getHighResolutionOutputSizeshNQ4ISI.getResources().getConfiguration().orientation);
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getAndroidId() {
        return this.androidId;
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final boolean isNFCSupported() {
        return ((java.lang.Boolean) this.isNFCSupported.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider deviceInformationProvider) {
        try {
            android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(deviceInformationProvider.getHighResolutionOutputSizeshNQ4ISI);
            if (defaultAdapter != null) {
                if (android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter) != null) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.UnsupportedOperationException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.appidentity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("exception", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(e.getClass()).getSimpleName());
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[1] = kotlin.TuplesKt.to("message", message);
            com.paypal.android.logger.Logger.d$default(logger, "Device does not support host-based card emulation", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return false;
        }
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final com.paypal.oslo.core.appidentity.domain.DeviceType getDeviceType() {
        return (com.paypal.oslo.core.appidentity.domain.DeviceType) this.deviceType.getValue();
    }

    @Override // com.paypal.oslo.core.appidentity.domain.DeviceInformation
    public final java.lang.String getNetworkCarrier() {
        return (java.lang.String) this.networkCarrier.getValue();
    }

    public static /* synthetic */ com.paypal.oslo.core.appidentity.domain.DeviceType $r8$lambda$35MtJIgFNAphxMBKuuHqR9oPnmE(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider deviceInformationProvider) {
        int i = deviceInformationProvider.getHighResolutionOutputSizeshNQ4ISI.getResources().getConfiguration().smallestScreenWidthDp;
        if (deviceInformationProvider.getHighResolutionOutputSizeshNQ4ISI.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) {
            return com.paypal.oslo.core.appidentity.domain.DeviceType.FOLDABLE;
        }
        if (i >= 600) {
            return com.paypal.oslo.core.appidentity.domain.DeviceType.TABLET;
        }
        return com.paypal.oslo.core.appidentity.domain.DeviceType.PHONE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$OOQmboRqaTjasuuhNvq2_2HXzU0(com.paypal.oslo.core.appidentity.data.DeviceInformationProvider deviceInformationProvider) {
        java.lang.String networkOperatorName;
        java.lang.Object systemService = deviceInformationProvider.getHighResolutionOutputSizeshNQ4ISI.getSystemService("phone");
        android.telephony.TelephonyManager telephonyManager = systemService instanceof android.telephony.TelephonyManager ? (android.telephony.TelephonyManager) systemService : null;
        if (telephonyManager == null || (networkOperatorName = telephonyManager.getNetworkOperatorName()) == null) {
            return "unknown";
        }
        java.lang.String str = networkOperatorName;
        return str.length() != 0 ? str : "unknown";
    }
}
