package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\n8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/meta/PlatformImpl;", "Lcom/zettle/sdk/meta/Platform;", "<init>", "()V", "Lcom/zettle/sdk/meta/BluetoothInfo;", "bluetooth$delegate", "Lkotlin/Lazy;", "getBluetooth", "()Lcom/zettle/sdk/meta/BluetoothInfo;", "bluetooth", "Lcom/zettle/sdk/meta/PlatformClock;", "clock$delegate", "getClock", "()Lcom/zettle/sdk/meta/PlatformClock;", "clock", "Lcom/zettle/sdk/meta/PlatformInfo;", "info$delegate", "getInfo", "()Lcom/zettle/sdk/meta/PlatformInfo;", "info"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PlatformImpl implements com.zettle.sdk.meta.Platform {

    /* renamed from: clock$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy clock = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.meta.PlatformSystemClock>() { // from class: com.zettle.sdk.meta.PlatformImpl$clock$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.meta.PlatformSystemClock invoke() {
            return new com.zettle.sdk.meta.PlatformSystemClock();
        }
    });

    /* renamed from: info$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy info = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.meta.PlatformInfoFromBuild>() { // from class: com.zettle.sdk.meta.PlatformImpl$info$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.meta.PlatformInfoFromBuild invoke() {
            return new com.zettle.sdk.meta.PlatformInfoFromBuild(new com.zettle.sdk.meta.BuildInfo() { // from class: com.zettle.sdk.meta.PlatformImpl$info$2.1
                @Override // com.zettle.sdk.meta.BuildInfo
                public final java.lang.String getProduct() {
                    java.lang.String str = android.os.Build.PRODUCT;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final java.lang.String getDevice() {
                    java.lang.String str = android.os.Build.DEVICE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final java.lang.String getModel() {
                    java.lang.String str = android.os.Build.MODEL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final java.lang.String getBrand() {
                    java.lang.String str = android.os.Build.BRAND;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final java.lang.String getManufacturer() {
                    java.lang.String str = android.os.Build.MANUFACTURER;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final int getVersionCode() {
                    return android.os.Build.VERSION.SDK_INT;
                }

                @Override // com.zettle.sdk.meta.BuildInfo
                public final kotlin.jvm.functions.Function0<java.lang.String> getLocaleProvider() {
                    return new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.zettle.sdk.meta.PlatformImpl$info$2$1$localeProvider$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String obj = java.util.Locale.getDefault().toString();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                            return obj;
                        }
                    };
                }
            });
        }
    });

    /* renamed from: bluetooth$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy bluetooth = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.meta.BluetoothInfoImpl>() { // from class: com.zettle.sdk.meta.PlatformImpl$bluetooth$2
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public final com.zettle.sdk.meta.BluetoothInfoImpl invoke() {
            return new com.zettle.sdk.meta.BluetoothInfoImpl();
        }
    });

    @Override // com.zettle.sdk.meta.Platform
    public final com.zettle.sdk.meta.PlatformClock getClock() {
        return (com.zettle.sdk.meta.PlatformClock) this.clock.getValue();
    }

    @Override // com.zettle.sdk.meta.Platform
    public final com.zettle.sdk.meta.PlatformInfo getInfo() {
        return (com.zettle.sdk.meta.PlatformInfo) this.info.getValue();
    }

    @Override // com.zettle.sdk.meta.Platform
    public final com.zettle.sdk.meta.BluetoothInfo getBluetooth() {
        return (com.zettle.sdk.meta.BluetoothInfo) this.bluetooth.getValue();
    }
}
