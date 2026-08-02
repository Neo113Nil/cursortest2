package com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004\u0082\u0001\u0002\f\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration;", "", "", "isApiIntegration", "()Z", "isSdkIntegration", "isMerchantNativeApp", "isMerchantWebApp", "Method", "AppPlatform", "SdkIntegration", "ApiIntegration", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface MerchantIntegration {

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform;", "", "Native", "Web", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Native;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Web;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface AppPlatform {

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Native;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$NativeApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$NativeApp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Native extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Web;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$WebApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$WebApp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Web extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method;", "", "Api", "Sdk", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Api;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Sdk;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Method {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Api;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Api extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Sdk;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public interface Sdk extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Sdk;", "NativeApp", "WebApp", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$NativeApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$WebApp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface SdkIntegration extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method.Sdk {

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static boolean isApiIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration sdkIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.super.isApiIntegration();
            }

            @java.lang.Deprecated
            public static boolean isMerchantNativeApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration sdkIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.super.isMerchantNativeApp();
            }

            @java.lang.Deprecated
            public static boolean isMerchantWebApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration sdkIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.super.isMerchantWebApp();
            }

            @java.lang.Deprecated
            public static boolean isSdkIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration sdkIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.super.isSdkIntegration();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$NativeApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Native;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NativeApp implements com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Native {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.NativeApp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.NativeApp();

            private NativeApp() {
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isApiIntegration() {
                return super.isApiIntegration();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantNativeApp() {
                return super.isMerchantNativeApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantWebApp() {
                return super.isMerchantWebApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isSdkIntegration() {
                return super.isSdkIntegration();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration$WebApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$SdkIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Web;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class WebApp implements com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Web {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.WebApp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.SdkIntegration.WebApp();

            private WebApp() {
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isApiIntegration() {
                return super.isApiIntegration();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantNativeApp() {
                return super.isMerchantNativeApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantWebApp() {
                return super.isMerchantWebApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isSdkIntegration() {
                return super.isSdkIntegration();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$Method$Api;", "NativeApp", "WebApp", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$NativeApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$WebApp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface ApiIntegration extends com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method.Api {

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static boolean isApiIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.super.isApiIntegration();
            }

            @java.lang.Deprecated
            public static boolean isMerchantNativeApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.super.isMerchantNativeApp();
            }

            @java.lang.Deprecated
            public static boolean isMerchantWebApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.super.isMerchantWebApp();
            }

            @java.lang.Deprecated
            public static boolean isSdkIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration) {
                return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.super.isSdkIntegration();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$NativeApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Native;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NativeApp implements com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Native {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp();

            private NativeApp() {
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isApiIntegration() {
                return super.isApiIntegration();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantNativeApp() {
                return super.isMerchantNativeApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantWebApp() {
                return super.isMerchantWebApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isSdkIntegration() {
                return super.isSdkIntegration();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration$WebApp;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$AppPlatform$Web;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class WebApp implements com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration, com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Web {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.WebApp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.WebApp();

            private WebApp() {
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isApiIntegration() {
                return super.isApiIntegration();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantNativeApp() {
                return super.isMerchantNativeApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isMerchantWebApp() {
                return super.isMerchantWebApp();
            }

            @Override // com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration
            public final /* bridge */ boolean isSdkIntegration() {
                return super.isSdkIntegration();
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isApiIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration merchantIntegration) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.super.isApiIntegration();
        }

        @java.lang.Deprecated
        public static boolean isSdkIntegration(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration merchantIntegration) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.super.isSdkIntegration();
        }

        @java.lang.Deprecated
        public static boolean isMerchantNativeApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration merchantIntegration) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.super.isMerchantNativeApp();
        }

        @java.lang.Deprecated
        public static boolean isMerchantWebApp(com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration merchantIntegration) {
            return com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.super.isMerchantWebApp();
        }
    }

    default boolean isApiIntegration() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method.Api;
    }

    default boolean isSdkIntegration() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.Method.Sdk;
    }

    default boolean isMerchantNativeApp() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Native;
    }

    default boolean isMerchantWebApp() {
        return this instanceof com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.AppPlatform.Web;
    }
}
