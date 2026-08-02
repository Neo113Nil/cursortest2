package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a!\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"CreditAvatar", "", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/image/CreditAvatarUiModel;", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/AvatarSize;", "emphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "badge", "Lcom/paypal/pds/components/AvatarBadge;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/image/CreditAvatarUiModel;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Lcom/paypal/pds/components/AvatarEmphasis;Lcom/paypal/pds/components/AvatarBadge;Landroidx/compose/runtime/Composer;II)V", "rememberCreditAvatarSource", "Lcom/paypal/pds/components/AvatarSource;", "scale", "Lcom/paypal/oslo/core/commonui/components/Scale;", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/image/CreditAvatarUiModel;Lcom/paypal/oslo/core/commonui/components/Scale;Landroidx/compose/runtime/Composer;II)Lcom/paypal/pds/components/AvatarSource;", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CreditAvatarKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreditAvatar(final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel creditAvatarUiModel, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, com.paypal.pds.components.AvatarBadge avatarBadge, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis2;
        int i5;
        final com.paypal.pds.components.AvatarSize avatarSize2;
        final com.paypal.pds.components.AvatarBadge avatarBadge2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        com.paypal.pds.components.AvatarEmphasis avatarEmphasis3;
        com.paypal.pds.components.AvatarBadge avatarBadge3;
        com.paypal.pds.components.AvatarSource avatarSource;
        int i6;
        com.paypal.pds.components.AvatarSize.Large large = avatarSize;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAvatarUiModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1064934357);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(creditAvatarUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(large) : startRestartGroup.changedInstance(large)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                }
                i6 = 128;
                i3 |= i6;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                avatarEmphasis2 = avatarEmphasis;
                i3 |= startRestartGroup.changed(avatarEmphasis2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? startRestartGroup.changed(avatarBadge) : startRestartGroup.changedInstance(avatarBadge) ? 16384 : 8192;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            large = com.paypal.pds.components.AvatarSize.Large.INSTANCE;
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            avatarEmphasis2 = com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE;
                        }
                        if (i5 != 0) {
                            modifier3 = modifier2;
                            avatarEmphasis3 = avatarEmphasis2;
                            avatarBadge3 = null;
                            int i8 = i3;
                            final com.paypal.pds.components.AvatarSize avatarSize3 = large;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1064934357, i8, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatar (CreditAvatar.kt:49)");
                            }
                            int i9 = i8 & 14;
                            com.paypal.oslo.core.commonui.components.Scale scale = com.paypal.oslo.core.commonui.components.Scale.FIT;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-700936869, i9, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.rememberCreditAvatarSource (CreditAvatar.kt:64)");
                            }
                            if (!(creditAvatarUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.Undefined)) {
                                startRestartGroup.startReplaceGroup(520898530);
                                startRestartGroup.endReplaceGroup();
                                avatarSource = null;
                            } else if (creditAvatarUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon) {
                                startRestartGroup.startReplaceGroup(709541684);
                                startRestartGroup.endReplaceGroup();
                                avatarSource = new com.paypal.pds.components.AvatarSource.Icon(((com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromIcon) creditAvatarUiModel).getIcon());
                            } else {
                                if (!(creditAvatarUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromUrl)) {
                                    startRestartGroup.startReplaceGroup(709538563);
                                    startRestartGroup.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(521042464);
                                com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromUrl fromUrl = (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.FromUrl) creditAvatarUiModel;
                                com.paypal.pds.components.AvatarSource image = new com.paypal.pds.components.AvatarSource.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).scale(scale).data(fromUrl.getUrl()).build(), fromUrl.getPlaceHolderIcon(), fromUrl.getFallbackIcon(), null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 24), fromUrl.getScale());
                                startRestartGroup.endReplaceGroup();
                                avatarSource = image;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            if (avatarSource != null) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final com.paypal.pds.components.AvatarEmphasis avatarEmphasis4 = avatarEmphasis3;
                                    final com.paypal.pds.components.AvatarBadge avatarBadge4 = avatarBadge3;
                                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarKt.$r8$lambda$MpPCGO39z4cdsMYbHmiw1TO0MAY(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.this, modifier3, avatarSize3, avatarEmphasis4, avatarBadge4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    };
                                    endRestartGroup.updateScope(function2);
                                    return;
                                }
                                return;
                            }
                            com.paypal.pds.components.AvatarKt.Avatar(avatarSource, modifier3, avatarSize3, avatarEmphasis3, avatarBadge3, null, startRestartGroup, (com.paypal.pds.components.AvatarSize.$stable << 6) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (com.paypal.pds.components.AvatarBadge.$stable << 12) | (i8 & 57344), 32);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            avatarSize2 = avatarSize3;
                            avatarEmphasis2 = avatarEmphasis3;
                            avatarBadge2 = avatarBadge3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    avatarBadge3 = avatarBadge;
                    modifier3 = modifier2;
                    avatarEmphasis3 = avatarEmphasis2;
                    int i82 = i3;
                    final com.paypal.pds.components.AvatarSize avatarSize32 = large;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i82 & 14;
                    com.paypal.oslo.core.commonui.components.Scale scale2 = com.paypal.oslo.core.commonui.components.Scale.FIT;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (!(creditAvatarUiModel instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.Undefined)) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (avatarSource != null) {
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    avatarSize2 = large;
                    avatarBadge2 = avatarBadge;
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.pds.components.AvatarEmphasis avatarEmphasis5 = avatarEmphasis2;
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarKt.m18399$r8$lambda$RxWooUNEqTUl7FPGUilNYaFiAo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel.this, modifier3, avatarSize2, avatarEmphasis5, avatarBadge2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            avatarEmphasis2 = avatarEmphasis;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        avatarEmphasis2 = avatarEmphasis;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MpPCGO39z4cdsMYbHmiw1TO0MAY(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel creditAvatarUiModel, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, com.paypal.pds.components.AvatarBadge avatarBadge, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CreditAvatar(creditAvatarUiModel, modifier, avatarSize, avatarEmphasis, avatarBadge, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RxWooUNEqTUl7FPGUilNY-aFiAo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18399$r8$lambda$RxWooUNEqTUl7FPGUilNYaFiAo(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.image.CreditAvatarUiModel creditAvatarUiModel, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, com.paypal.pds.components.AvatarBadge avatarBadge, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CreditAvatar(creditAvatarUiModel, modifier, avatarSize, avatarEmphasis, avatarBadge, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
