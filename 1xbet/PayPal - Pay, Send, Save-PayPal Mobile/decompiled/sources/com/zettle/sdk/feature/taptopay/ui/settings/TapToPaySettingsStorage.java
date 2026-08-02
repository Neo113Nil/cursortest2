package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorage;", "", "", "isCurrentUserEnabled", "()Z", "isCurrentUserOnboardCTAInteractedWith", "enabled", "setEnabled", "(Z)Z", "interactedWith", "setInteractedWithOnboardCTA", "Lkotlinx/coroutines/flow/Flow;", "isEnabledFlow", "()Lkotlinx/coroutines/flow/Flow;", "getShouldShowOnboardCTAFlow", "shouldShowOnboardCTAFlow", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TapToPaySettingsStorage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage.Companion INSTANCE = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage.Companion.getHighSpeedVideoSizes;

    kotlinx.coroutines.flow.Flow<java.lang.Boolean> getShouldShowOnboardCTAFlow();

    boolean isCurrentUserEnabled();

    boolean isCurrentUserOnboardCTAInteractedWith();

    kotlinx.coroutines.flow.Flow<java.lang.Boolean> isEnabledFlow();

    boolean setEnabled(boolean enabled);

    boolean setInteractedWithOnboardCTA(boolean interactedWith);

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorage$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage.Companion getHighSpeedVideoSizes = new com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage.Companion();

        private Companion() {
        }
    }
}
