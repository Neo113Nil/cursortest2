package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"ActivityMerchantImage", "", "imageUrl", "", "modifier", "Landroidx/compose/ui/Modifier;", "placeHolderSize", "Lcom/paypal/pds/components/AvatarSize;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/AvatarSize;Landroidx/compose/runtime/Composer;II)V", "SectionHeaderWithoutURLPreview", "(Landroidx/compose/runtime/Composer;I)V", "SectionHeaderWithURLPreview", "revolvingcredit-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActivityMerchantImageKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityMerchantImage(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final com.paypal.pds.components.AvatarSize avatarSize2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.pds.components.AvatarSize avatarSize3;
        int i4;
        final androidx.compose.ui.Modifier modifier4;
        int i5;
        com.paypal.pds.components.AvatarSize.Large large = avatarSize;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2097831017);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if ((i & 512) == 0 ? startRestartGroup.changed(large) : startRestartGroup.changedInstance(large)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                }
                i5 = 128;
                i3 |= i5;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    avatarSize3 = large;
                    i4 = i3;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        large = com.paypal.pds.components.AvatarSize.Large.INSTANCE;
                        i3 &= -897;
                    }
                    avatarSize3 = large;
                    i4 = i3;
                    modifier4 = companion;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-2097831017, i4, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImage (ActivityMerchantImage.kt:40)");
                }
                final androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1765492654, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.m18267$r8$lambda$qWwtZ7OPas25viuwBVoQ_aha4A(androidx.compose.ui.Modifier.this, avatarSize3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                java.lang.String str2 = str;
                if (str2 == null || str2.length() == 0) {
                    startRestartGroup.startReplaceGroup(-414038678);
                    rememberComposableLambda.invoke(startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-413977391);
                    com.paypal.oslo.core.commonui.components.AsyncImageKt.SubcomposeAsyncImage(str, null, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier4, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getSpacing2()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), androidx.compose.ui.layout.ContentScale.INSTANCE.getInside(), null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(231561107, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function3
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.$r8$lambda$CSqBFrxkumsjdWbY_BsQyNENWO8(kotlin.jvm.functions.Function2.this, (com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ComposableSingletons$ActivityMerchantImageKt.INSTANCE.m18275getLambda$1773929772$revolvingcredit_servicing_prodRelease(), startRestartGroup, (i4 & 14) | 1772592, 16);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                avatarSize2 = avatarSize3;
            } else {
                startRestartGroup.skipToGroupEnd();
                avatarSize2 = large;
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.m18268$r8$lambda$va93FBENYvPCyevo7ZNtGF6kpQ(str, modifier3, avatarSize2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4WJHCSSNYI3OoElZuPEbCVu4bsc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2093480046);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2093480046, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.SectionHeaderWithoutURLPreview (ActivityMerchantImage.kt:78)");
            }
            ActivityMerchantImage(null, null, null, startRestartGroup, 6, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.$r8$lambda$4WJHCSSNYI3OoElZuPEbCVu4bsc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CSqBFrxkumsjdWbY_BsQyNENWO8(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.core.commonui.components.SubcomposeAsyncImageScope subcomposeAsyncImageScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subcomposeAsyncImageScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(231561107, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImage.<anonymous> (ActivityMerchantImage.kt:70)");
            }
            function2.invoke(composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mpudxqaXaKpvBxODanSheuk1oIw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1250069144);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1250069144, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.SectionHeaderWithURLPreview (ActivityMerchantImage.kt:87)");
            }
            ActivityMerchantImage("https://companieslogo.com/img/orig/PYPL-3570673e.png", null, null, startRestartGroup, 6, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImageKt.$r8$lambda$mpudxqaXaKpvBxODanSheuk1oIw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qWwtZ7OPas25-viuwBVoQ_aha4A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18267$r8$lambda$qWwtZ7OPas25viuwBVoQ_aha4A(androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1765492654, i, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.components.ActivityMerchantImage.<anonymous> (ActivityMerchantImage.kt:42)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.Store.INSTANCE), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSize48()), com.paypal.pds.core.ConstantsKt.getSpacing2()), avatarSize, new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE), null, null, composer, com.paypal.pds.components.AvatarSize.$stable << 6, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$va93FBENYvPC-yevo7ZNtGF6kpQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18268$r8$lambda$va93FBENYvPCyevo7ZNtGF6kpQ(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.AvatarSize avatarSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityMerchantImage(str, modifier, avatarSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
