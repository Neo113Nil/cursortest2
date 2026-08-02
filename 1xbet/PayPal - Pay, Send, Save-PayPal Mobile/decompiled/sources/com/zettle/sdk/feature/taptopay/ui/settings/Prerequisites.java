package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "", "<init>", "()V", "DeveloperOptionsDetected", "NfcDisabled", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "RequiredPermissionsMissing", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$NfcDisabled;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$None;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$RequiredPermissionsMissing;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Prerequisites {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$DeveloperOptionsDetected;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeveloperOptionsDetected extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.DeveloperOptionsDetected INSTANCE = new com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.DeveloperOptionsDetected();

        private DeveloperOptionsDetected() {
            super(null);
        }
    }

    private Prerequisites() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$RequiredPermissionsMissing;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RequiredPermissionsMissing extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.RequiredPermissionsMissing INSTANCE = new com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.RequiredPermissionsMissing();

        private RequiredPermissionsMissing() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$NfcDisabled;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NfcDisabled extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.NfcDisabled INSTANCE = new com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.NfcDisabled();

        private NfcDisabled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites$None;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class None extends com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.None INSTANCE = new com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ Prerequisites(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
