package com.paypal.oslo.feature.subscriptions.shared.ui.component;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"MerchantIcon", "", "avatarResult", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/AvatarSize;", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/AvatarResult;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Landroidx/compose/runtime/Composer;II)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MerchantIconKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        if ((r15 & 4) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MerchantIcon(final com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.pds.components.AvatarEmphasis custom;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarResult, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(390861702);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(avatarResult) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                if ((i & 512) == 0 ? startRestartGroup.changed(avatarSize) : startRestartGroup.changedInstance(avatarSize)) {
                    i4 = 256;
                    i3 |= i4;
                }
            }
            i4 = 128;
            i3 |= i4;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i5 != 0) {
                    modifier = androidx.compose.ui.Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    avatarSize = com.paypal.pds.components.AvatarSize.Large.INSTANCE;
                    i3 &= -897;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(390861702, i3, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.component.MerchantIcon (MerchantIcon.kt:26)");
                }
                com.paypal.pds.components.AvatarSource source = avatarResult.getSource();
                if (avatarResult.isFallback()) {
                    custom = com.paypal.pds.components.AvatarEmphasis.High.INSTANCE;
                } else {
                    custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleEmphasisPositive.INSTANCE, com.paypal.pds.core.Color.ContentRoleEmphasisPositive.INSTANCE);
                }
                com.paypal.pds.components.AvatarKt.Avatar(source, modifier, avatarSize, custom, null, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | (i3 & 112) | (i3 & 896), 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final com.paypal.pds.components.AvatarSize avatarSize2 = avatarSize;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.shared.ui.component.MerchantIconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.shared.ui.component.MerchantIconKt.$r8$lambda$FinXWR5RD6iCsHlV55Pv9ssqnNQ(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult.this, modifier2, avatarSize2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FinXWR5RD6iCsHlV55Pv9ssqnNQ(com.paypal.oslo.feature.subscriptions.shared.ui.model.AvatarResult avatarResult, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MerchantIcon(avatarResult, modifier, avatarSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
