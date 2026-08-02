package com.paypal.oslo.feature.identity.userverification.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\u0000\u001a\u001c\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0003H\u0000\u001a\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"toDropdownItem", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;", "toDropdownItems", "", "toSelectedDropdownItem", "CountryFlagImage", "", "flagUrl", "", "countryName", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "identity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CountryDropdownItemKt {
    public static final com.paypal.pds.components.MenuItem toDropdownItem(final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        return new com.paypal.pds.components.MenuItem(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1158642849, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt.$r8$lambda$EXu0pk8KWIr4gDPz3v7QTxc3els(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), countryPhoneDetail.getCountryName(), countryPhoneDetail.getCountryCode(), "+".concat(java.lang.String.valueOf(countryPhoneDetail.getCountryCallingCode())), null, 16, null);
    }

    public static final java.util.List<com.paypal.pds.components.MenuItem> toDropdownItems(java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toDropdownItem((com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail) it.next()));
        }
        return arrayList;
    }

    public static final com.paypal.pds.components.MenuItem toSelectedDropdownItem(final com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        return new com.paypal.pds.components.MenuItem(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-917211578, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt.m15402$r8$lambda$G1U7rG_ndN4IclUbIrZC3NXF2c(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            }
        }), countryPhoneDetail.getCountryCode(), countryPhoneDetail.getCountryCode(), countryPhoneDetail.getCountryName(), null, 16, null);
    }

    private static final void Camera2StreamConfigurationMap(final java.lang.String str, final java.lang.String str2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1173736133);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1173736133, i2, -1, "com.paypal.oslo.feature.identity.userverification.ui.model.CountryFlagImage (CountryDropdownItem.kt:88)");
            }
            androidx.compose.ui.graphics.painter.ColorPainter colorPainter = new androidx.compose.ui.graphics.painter.ColorPainter(androidx.compose.ui.graphics.Color.INSTANCE.m6028getLightGray0d7_KjU(), null);
            androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize28()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
            java.lang.String str3 = str;
            java.lang.String str4 = str3.length() != 0 ? str3 : null;
            androidx.compose.ui.layout.ContentScale crop = androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop();
            androidx.compose.ui.graphics.painter.ColorPainter colorPainter2 = colorPainter;
            com.paypal.oslo.core.commonui.components.AsyncImageKt.AsyncImage(str4, str2, androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize28()), colorPainter2, colorPainter2, crop, startRestartGroup, (androidx.compose.ui.graphics.painter.ColorPainter.$stable << 9) | (i2 & 112) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (androidx.compose.ui.graphics.painter.ColorPainter.$stable << 12), 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.identity.userverification.ui.model.CountryDropdownItemKt.$r8$lambda$4185Ml6evazwv4tS357FAnAqk48(str, str2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4185Ml6evazwv4tS357FAnAqk48(java.lang.String str, java.lang.String str2, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(str, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EXu0pk8KWIr4gDPz3v7QTxc3els(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1158642849, i, -1, "com.paypal.oslo.feature.identity.userverification.ui.model.toDropdownItem.<anonymous> (CountryDropdownItem.kt:39)");
            }
            Camera2StreamConfigurationMap(countryPhoneDetail.getCountryFlag(), countryPhoneDetail.getCountryName(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$G1U7rG_nd-N4IclUbIrZC3NXF2c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15402$r8$lambda$G1U7rG_ndN4IclUbIrZC3NXF2c(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-917211578, i, -1, "com.paypal.oslo.feature.identity.userverification.ui.model.toSelectedDropdownItem.<anonymous> (CountryDropdownItem.kt:68)");
            }
            Camera2StreamConfigurationMap(countryPhoneDetail.getCountryFlag(), countryPhoneDetail.getCountryName(), composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
