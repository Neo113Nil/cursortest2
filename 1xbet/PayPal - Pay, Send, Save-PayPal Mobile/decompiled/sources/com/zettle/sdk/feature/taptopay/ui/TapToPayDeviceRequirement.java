package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "", "<init>", "()V", "AndroidVersionBelowOreo", "GooglePlayServicesMissing", "NfcCapabilitiesMissing", "Ok", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$AndroidVersionBelowOreo;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$GooglePlayServicesMissing;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$NfcCapabilitiesMissing;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$Ok;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class TapToPayDeviceRequirement {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$AndroidVersionBelowOreo;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AndroidVersionBelowOreo extends com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.AndroidVersionBelowOreo INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.AndroidVersionBelowOreo();

        private AndroidVersionBelowOreo() {
            super(null);
        }

        public final java.lang.String toString() {
            return "AndroidVersionBelowOreo";
        }
    }

    private TapToPayDeviceRequirement() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$GooglePlayServicesMissing;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GooglePlayServicesMissing extends com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.GooglePlayServicesMissing INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.GooglePlayServicesMissing();

        private GooglePlayServicesMissing() {
            super(null);
        }

        public final java.lang.String toString() {
            return "GooglePlayServicesMissing";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$NfcCapabilitiesMissing;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NfcCapabilitiesMissing extends com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.NfcCapabilitiesMissing INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.NfcCapabilitiesMissing();

        private NfcCapabilitiesMissing() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NfcCapabilitiesMissing";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement$Ok;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "<init>", "()V", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Ok extends com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement {
        public static final int $stable = 0;
        public static final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.Ok INSTANCE = new com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.Ok();

        private Ok() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Ok";
        }
    }

    public /* synthetic */ TapToPayDeviceRequirement(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
