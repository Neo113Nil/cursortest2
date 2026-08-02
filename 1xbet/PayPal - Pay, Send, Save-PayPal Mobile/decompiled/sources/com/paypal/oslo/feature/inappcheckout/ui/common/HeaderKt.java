package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "buyerInfoEntity", "Lkotlin/Function0;", "", "onProfileClick", "Header", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeaderKt {
    public static final void Header(final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        com.paypal.pds.components.AvatarSource.Icon icon;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ProfileImage profileImage;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-94744474);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(buyerInfoEntity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-94744474, i2, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.Header (Header.kt:37)");
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSize8(), com.paypal.pds.core.ConstantsKt.getSize8(), 0.0f, 9, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String imagePath = (buyerInfoEntity == null || (profileImage = buyerInfoEntity.getProfileImage()) == null) ? null : profileImage.getImagePath();
            if (imagePath != null && !kotlin.text.StringsKt.isBlank(imagePath)) {
                startRestartGroup.startReplaceGroup(1624270646);
                com.paypal.pds.components.AvatarSize.Small small = com.paypal.pds.components.AvatarSize.Small.INSTANCE;
                androidx.compose.ui.Modifier align = boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize32(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart());
                if (buyerInfoEntity == null) {
                    icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
                } else {
                    java.lang.String givenName = buyerInfoEntity.getName().getGivenName();
                    java.lang.String obj = givenName != null ? kotlin.text.StringsKt.trim(givenName).toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    java.lang.String surname = buyerInfoEntity.getName().getSurname();
                    java.lang.String obj2 = surname != null ? kotlin.text.StringsKt.trim(surname).toString() : null;
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    java.lang.String str = obj;
                    if (!kotlin.text.StringsKt.isBlank(str)) {
                        java.lang.String str2 = obj2;
                        if (!kotlin.text.StringsKt.isBlank(str2)) {
                            java.lang.String valueOf = java.lang.String.valueOf(kotlin.text.StringsKt.first(str));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                            java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                            java.lang.String valueOf2 = java.lang.String.valueOf(kotlin.text.StringsKt.first(str2));
                            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2, "");
                            java.lang.String upperCase2 = valueOf2.toUpperCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(upperCase);
                            sb.append(upperCase2);
                            icon = new com.paypal.pds.components.AvatarSource.Initials(sb.toString());
                        }
                    }
                    icon = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
                }
                com.paypal.pds.components.AvatarSize.Small small2 = small;
                boolean z = (i2 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt.$r8$lambda$K4HuXr_aQiTuF8HPXNBG71UxwyM(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.inappcheckout.ui.common.AsyncAvatarKt.ShimmerAsyncAvatar(align, small2, imagePath, (kotlin.jvm.functions.Function0) rememberedValue, icon, startRestartGroup, com.paypal.pds.components.AvatarSize.Small.$stable << 3, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1624722099);
                com.paypal.pds.components.AvatarSource.Icon icon2 = new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.User.INSTANCE);
                com.paypal.pds.components.AvatarSize.Small small3 = com.paypal.pds.components.AvatarSize.Small.INSTANCE;
                androidx.compose.ui.Modifier align2 = boxScopeInstance.align(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.ui.Modifier.INSTANCE, null, false, 3, null), com.paypal.pds.core.ConstantsKt.getSize32(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.Alignment.INSTANCE.getCenterStart());
                com.paypal.pds.components.AvatarSource.Icon icon3 = icon2;
                com.paypal.pds.components.AvatarSize.Small small4 = small3;
                boolean z2 = (i2 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt.$r8$lambda$ecqHb7gcRLajvDaTLsnrJuswgi0(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.AvatarKt.Avatar(icon3, align2, small4, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, com.paypal.pds.components.AvatarSize.Small.$stable << 6, 24);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.inappcheckout.R.drawable.feature_inappcheckout_paypal_logo, startRestartGroup, 0), "PayPal Logo", boxScopeInstance.align(androidx.compose.foundation.layout.SizeKt.m1744sizeInqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(90.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), 0.0f, 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(250.0f), 0.0f, 11, null), androidx.compose.ui.Alignment.INSTANCE.getCenter()), androidx.compose.ui.layout.ContentScale.INSTANCE.getInside(), null, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 3120, 112);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.inappcheckout.ui.common.HeaderKt.$r8$lambda$tiXYmlQIaKJDNB0WhTIGabZ5nF0(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity.this, function0, i, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K4HuXr_aQiTuF8HPXNBG71UxwyM(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ecqHb7gcRLajvDaTLsnrJuswgi0(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tiXYmlQIaKJDNB0WhTIGabZ5nF0(com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity buyerInfoEntity, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        Header(buyerInfoEntity, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
