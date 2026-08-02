package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LaunchOAuthFlow", "RelinkDeepLink", "ShowToast", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$LaunchOAuthFlow;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$None;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$RelinkDeepLink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$ShowToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PackageSettingsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PackageSettingsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$LaunchOAuthFlow;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "provider", "", "authUrl", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$LaunchOAuthFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getProvider", "Ljava/lang/String;", "getAuthUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LaunchOAuthFlow extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String authUrl;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LaunchOAuthFlow(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str) {
            super("LaunchOAuthFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.provider = emailProvider;
            this.authUrl = str;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public final java.lang.String getAuthUrl() {
            return this.authUrl;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.provider;
            java.lang.String str = this.authUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LaunchOAuthFlow(provider=");
            sb.append(emailProvider);
            sb.append(", authUrl=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.provider.hashCode() * 31) + this.authUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow launchOAuthFlow = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow) other;
            return this.provider == launchOAuthFlow.provider && kotlin.jvm.internal.Intrinsics.areEqual(this.authUrl, launchOAuthFlow.authUrl);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow copy(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider, java.lang.String authUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authUrl, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow(provider, authUrl);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAuthUrl() {
            return this.authUrl;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getProvider() {
            return this.provider;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.LaunchOAuthFlow launchOAuthFlow, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailProvider = launchOAuthFlow.provider;
            }
            if ((i & 2) != 0) {
                str = launchOAuthFlow.authUrl;
            }
            return launchOAuthFlow.copy(emailProvider, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$RelinkDeepLink;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "linkedAccounts", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "showErrorBanner", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "component3", "()Z", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Z)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$RelinkDeepLink;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinkedAccounts", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "getEmailProvider", "Z", "getShowErrorBanner"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RelinkDeepLink extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider;
        private final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedAccounts;
        private final boolean showErrorBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelinkDeepLink(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z) {
            super("RelinkDeepLink", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            this.linkedAccounts = list;
            this.emailProvider = emailProvider;
            this.showErrorBanner = z;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> getLinkedAccounts() {
            return this.linkedAccounts;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list = this.linkedAccounts;
            com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider = this.emailProvider;
            boolean z = this.showErrorBanner;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RelinkDeepLink(linkedAccounts=");
            sb.append(list);
            sb.append(", emailProvider=");
            sb.append(emailProvider);
            sb.append(", showErrorBanner=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.linkedAccounts.hashCode() * 31) + this.emailProvider.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showErrorBanner);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink)) {
                return false;
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink relinkDeepLink = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedAccounts, relinkDeepLink.linkedAccounts) && this.emailProvider == relinkDeepLink.emailProvider && this.showErrorBanner == relinkDeepLink.showErrorBanner;
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink copy(java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> linkedAccounts, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean showErrorBanner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedAccounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink(linkedAccounts, emailProvider, showErrorBanner);
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowErrorBanner() {
            return this.showErrorBanner;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider getEmailProvider() {
            return this.emailProvider;
        }

        public final java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> component1() {
            return this.linkedAccounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.RelinkDeepLink relinkDeepLink, java.util.List list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = relinkDeepLink.linkedAccounts;
            }
            if ((i & 2) != 0) {
                emailProvider = relinkDeepLink.emailProvider;
            }
            if ((i & 4) != 0) {
                z = relinkDeepLink.showErrorBanner;
            }
            return relinkDeepLink.copy(list, emailProvider, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$ShowToast;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "message", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)V", "component1", "()Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "copy", "(Lcom/paypal/oslo/feature/packagetracking/domain/UiString;)Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$ShowToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowToast extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.packagetracking.domain.UiString message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToast(com.paypal.oslo.feature.packagetracking.domain.UiString uiString) {
            super("ShowToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiString, "");
            this.message = uiString;
        }

        public final com.paypal.oslo.feature.packagetracking.domain.UiString getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.packagetracking.domain.UiString uiString = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowToast(message=");
            sb.append(uiString);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast) other).message);
        }

        public final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast copy(com.paypal.oslo.feature.packagetracking.domain.UiString message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast(message);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.packagetracking.domain.UiString getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast copy$default(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.ShowToast showToast, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiString = showToast.message;
            }
            return showToast.copy(uiString);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect$None;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None extends com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.None INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.None();

        public final int hashCode() {
            return -1546584693;
        }

        private None() {
            super(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, null);
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiEffect.None)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PackageSettingsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
