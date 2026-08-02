package com.paypal.oslo.feature.cryptocurrency.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "logoUrl", "assetName", "", "CryptoAvatar", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAvatarKt {
    public static final void CryptoAvatar(final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(983389280);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(983389280, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatar (CryptoAvatar.kt:28)");
            }
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str, str2, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), com.paypal.pds.core.ConstantsKt.getSpacing40()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), null, null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), startRestartGroup, (i3 & 14) | 199680 | (i3 & 112), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.CryptoAvatarKt.m13825$r8$lambda$fPkp3uHaOo_sqW2ghExtjdq7pg(str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$fPkp3uHaOo-_sqW2ghExtjdq7pg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13825$r8$lambda$fPkp3uHaOo_sqW2ghExtjdq7pg(java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        CryptoAvatar(str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
