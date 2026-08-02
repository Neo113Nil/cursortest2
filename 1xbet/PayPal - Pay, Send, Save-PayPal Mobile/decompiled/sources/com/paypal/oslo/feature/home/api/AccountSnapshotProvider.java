package com.paypal.oslo.feature.home.api;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H'¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "", "Render", "", "modifier", "Landroidx/compose/ui/Modifier;", "includedTypes", "", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotType;", "(Landroidx/compose/ui/Modifier;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V", "home-api_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AccountSnapshotProvider {
    void Render(androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, androidx.compose.runtime.Composer composer, int i);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        public static final void Render$default(androidx.compose.ui.Modifier modifier, java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set, final com.paypal.oslo.feature.home.api.AccountSnapshotProvider accountSnapshotProvider, androidx.compose.runtime.Composer composer, final int i, final int i2) {
            int i3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountSnapshotProvider, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1567628925);
            int i4 = i2 & 1;
            if (i4 != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i5 = i2 & 2;
            if (i5 != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(set) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? startRestartGroup.changed(accountSnapshotProvider) : startRestartGroup.changedInstance(accountSnapshotProvider) ? 256 : 128;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                if (i4 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (i5 != 0) {
                    set = null;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1567628925, i3, -1, "com.paypal.oslo.feature.home.api.AccountSnapshotProvider.ComposeDefaultImpls.Render$default (AccountSnapshotProvider.kt:-1)");
                }
                accountSnapshotProvider.Render(modifier, set, startRestartGroup, i3 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            final androidx.compose.ui.Modifier modifier2 = modifier;
            final java.util.Set<? extends com.paypal.oslo.feature.home.api.AccountSnapshotType> set2 = set;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.api.AccountSnapshotProvider$ComposeDefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.home.api.AccountSnapshotProvider.ComposeDefaultImpls.$r8$lambda$MxaE5DNh65Yb23h0__Eq2FA3tls(androidx.compose.ui.Modifier.this, set2, accountSnapshotProvider, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
            }
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$MxaE5DNh65Yb23h0__Eq2FA3tls(androidx.compose.ui.Modifier modifier, java.util.Set set, com.paypal.oslo.feature.home.api.AccountSnapshotProvider accountSnapshotProvider, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
            Render$default(modifier, set, accountSnapshotProvider, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
