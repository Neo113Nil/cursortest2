package com.paypal.oslo.feature.inappcheckout.features.loader.domain;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0005\u0015\u0016\u0017\u0018\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0001\u0004\u001a\u001b\u001c\u001dÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "", "", "shouldUseBrandedLogo", "()Z", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getType", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "type", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "getText", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "text", "", "getProduct", "()Ljava/lang/String;", "product", "getFeature", "feature", "getAction", "action", "WithoutText", "SettingThingsUp", "Canceling", "CustomText", "Text", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Canceling;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$CustomText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$SettingThingsUp;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$WithoutText;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface LoadingSettings {
    java.lang.String getAction();

    java.lang.String getFeature();

    java.lang.String getProduct();

    com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text getText();

    com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType();

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean shouldUseBrandedLogo(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings loadingSettings) {
            return com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.super.shouldUseBrandedLogo();
        }
    }

    default boolean shouldUseBrandedLogo() {
        return kotlin.jvm.internal.Intrinsics.areEqual(getType(), com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedLogo.INSTANCE);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\"\u001a\u00020!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$WithoutText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "type", "", "product", "feature", "action", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$WithoutText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getType", "Ljava/lang/String;", "getProduct", "getFeature", "getAction", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "text", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "getText", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class WithoutText implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.lang.String feature;
        private final java.lang.String product;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text text;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type;

        public WithoutText(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.type = loaderType;
            this.product = str;
            this.feature = str2;
            this.action = str3;
            this.text = com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.NoText.INSTANCE;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final /* bridge */ boolean shouldUseBrandedLogo() {
            return super.shouldUseBrandedLogo();
        }

        public /* synthetic */ WithoutText(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle animatedCircle, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle.INSTANCE : animatedCircle, str, str2, str3);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getProduct() {
            return this.product;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType = this.type;
            java.lang.String str = this.product;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WithoutText(type=");
            sb.append(loaderType);
            sb.append(", product=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.type.hashCode() * 31) + this.product.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText withoutText = (com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, withoutText.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, withoutText.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, withoutText.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, withoutText.action);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type, java.lang.String product, java.lang.String feature, java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText(type, product, feature, action);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText copy$default(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.WithoutText withoutText, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loaderType = withoutText.type;
            }
            if ((i & 2) != 0) {
                str = withoutText.product;
            }
            if ((i & 4) != 0) {
                str2 = withoutText.feature;
            }
            if ((i & 8) != 0) {
                str3 = withoutText.action;
            }
            return withoutText.copy(loaderType, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\"\u001a\u00020!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$SettingThingsUp;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "type", "", "product", "feature", "action", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$SettingThingsUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getType", "Ljava/lang/String;", "getProduct", "getFeature", "getAction", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "text", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "getText", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SettingThingsUp implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.lang.String feature;
        private final java.lang.String product;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text text;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type;

        public SettingThingsUp(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.type = loaderType;
            this.product = str;
            this.feature = str2;
            this.action = str3;
            this.text = com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.SettingThingsUp.INSTANCE;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final /* bridge */ boolean shouldUseBrandedLogo() {
            return super.shouldUseBrandedLogo();
        }

        public /* synthetic */ SettingThingsUp(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle animatedCircle, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle.INSTANCE : animatedCircle, str, str2, str3);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getProduct() {
            return this.product;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType = this.type;
            java.lang.String str = this.product;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SettingThingsUp(type=");
            sb.append(loaderType);
            sb.append(", product=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.type.hashCode() * 31) + this.product.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp settingThingsUp = (com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, settingThingsUp.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, settingThingsUp.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, settingThingsUp.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, settingThingsUp.action);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type, java.lang.String product, java.lang.String feature, java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp(type, product, feature, action);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp copy$default(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.SettingThingsUp settingThingsUp, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loaderType = settingThingsUp.type;
            }
            if ((i & 2) != 0) {
                str = settingThingsUp.product;
            }
            if ((i & 4) != 0) {
                str2 = settingThingsUp.feature;
            }
            if ((i & 8) != 0) {
                str3 = settingThingsUp.action;
            }
            return settingThingsUp.copy(loaderType, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\"\u001a\u00020!8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Canceling;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "type", "", "product", "feature", "action", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Canceling;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getType", "Ljava/lang/String;", "getProduct", "getFeature", "getAction", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "text", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "getText", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Canceling implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.lang.String feature;
        private final java.lang.String product;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text text;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type;

        public Canceling(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.type = loaderType;
            this.product = str;
            this.feature = str2;
            this.action = str3;
            this.text = com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.NoText.INSTANCE;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final /* bridge */ boolean shouldUseBrandedLogo() {
            return super.shouldUseBrandedLogo();
        }

        public /* synthetic */ Canceling(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle animatedCircle, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle.INSTANCE : animatedCircle, str, str2, str3);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getProduct() {
            return this.product;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType = this.type;
            java.lang.String str = this.product;
            java.lang.String str2 = this.feature;
            java.lang.String str3 = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Canceling(type=");
            sb.append(loaderType);
            sb.append(", product=");
            sb.append(str);
            sb.append(", feature=");
            sb.append(str2);
            sb.append(", action=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.type.hashCode() * 31) + this.product.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling canceling = (com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, canceling.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, canceling.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, canceling.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, canceling.action);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type, java.lang.String product, java.lang.String feature, java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling(type, product, feature, action);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling copy$default(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Canceling canceling, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loaderType = canceling.type;
            }
            if ((i & 2) != 0) {
                str = canceling.product;
            }
            if ((i & 4) != 0) {
                str2 = canceling.feature;
            }
            if ((i & 8) != 0) {
                str3 = canceling.action;
            }
            return canceling.copy(loaderType, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u001a\u0010%\u001a\u00020$8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$CustomText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "type", "", "textToShow", "product", "feature", "action", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$CustomText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoaderType;", "getType", "Ljava/lang/String;", "getTextToShow", "getProduct", "getFeature", "getAction", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "text", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "getText", "()Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CustomText implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings {
        public static final int $stable = 8;
        private final java.lang.String action;
        private final java.lang.String feature;
        private final java.lang.String product;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text text;
        private final java.lang.String textToShow;
        private final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type;

        public CustomText(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loaderType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.type = loaderType;
            this.textToShow = str;
            this.product = str2;
            this.feature = str3;
            this.action = str4;
            this.text = new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText(str);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final /* bridge */ boolean shouldUseBrandedLogo() {
            return super.shouldUseBrandedLogo();
        }

        public /* synthetic */ CustomText(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle animatedCircle, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType.AnimatedCircle.INSTANCE : animatedCircle, str, str2, str3, str4);
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        public final java.lang.String getTextToShow() {
            return this.textToShow;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getProduct() {
            return this.product;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getFeature() {
            return this.feature;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final java.lang.String getAction() {
            return this.action;
        }

        @Override // com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType = this.type;
            java.lang.String str = this.textToShow;
            java.lang.String str2 = this.product;
            java.lang.String str3 = this.feature;
            java.lang.String str4 = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomText(type=");
            sb.append(loaderType);
            sb.append(", textToShow=");
            sb.append(str);
            sb.append(", product=");
            sb.append(str2);
            sb.append(", feature=");
            sb.append(str3);
            sb.append(", action=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.type.hashCode() * 31) + this.textToShow.hashCode()) * 31) + this.product.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText)) {
                return false;
            }
            com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText customText = (com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.type, customText.type) && kotlin.jvm.internal.Intrinsics.areEqual(this.textToShow, customText.textToShow) && kotlin.jvm.internal.Intrinsics.areEqual(this.product, customText.product) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, customText.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, customText.action);
        }

        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText copy(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType type, java.lang.String textToShow, java.lang.String product, java.lang.String feature, java.lang.String action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textToShow, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText(type, textToShow, product, feature, action);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getAction() {
            return this.action;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFeature() {
            return this.feature;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getProduct() {
            return this.product;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTextToShow() {
            return this.textToShow;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType getType() {
            return this.type;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText copy$default(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.CustomText customText, com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoaderType loaderType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loaderType = customText.type;
            }
            if ((i & 2) != 0) {
                str = customText.textToShow;
            }
            java.lang.String str5 = str;
            if ((i & 4) != 0) {
                str2 = customText.product;
            }
            java.lang.String str6 = str2;
            if ((i & 8) != 0) {
                str3 = customText.feature;
            }
            java.lang.String str7 = str3;
            if ((i & 16) != 0) {
                str4 = customText.action;
            }
            return customText.copy(loaderType, str5, str6, str7, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "", "NoText", "SettingThingsUp", "CustomizedText", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$CustomizedText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$NoText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$SettingThingsUp;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Text {

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$NoText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class NoText implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.NoText INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.NoText();

            private NoText() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$SettingThingsUp;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SettingThingsUp implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.SettingThingsUp INSTANCE = new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.SettingThingsUp();

            private SettingThingsUp() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$CustomizedText;", "Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text;", "", "text", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/features/loader/domain/LoadingSettings$Text$CustomizedText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class CustomizedText implements com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text {
            public static final int $stable = 0;
            private final java.lang.String text;

            public CustomizedText(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.text = str;
            }

            public final java.lang.String getText() {
                return this.text;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.text;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomizedText(text=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText) other).text);
            }

            public final com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText copy(java.lang.String text) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
                return new com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText(text);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getText() {
                return this.text;
            }

            public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText copy$default(com.paypal.oslo.feature.inappcheckout.features.loader.domain.LoadingSettings.Text.CustomizedText customizedText, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = customizedText.text;
                }
                return customizedText.copy(str);
            }
        }
    }
}
