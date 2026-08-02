package com.paypal.oslo.feature.cashin.ui.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"FeaturedStoreItem", "", "storeLogoUrl", "", "storeName", "fee", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "testTag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoreUiModel;", "(Lcom/paypal/oslo/feature/cashin/ui/viewmodel/CashInStoreUiModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FeaturedStoreItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FeaturedStoreItemKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FeaturedStoreItem(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str5;
        int i5;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(279288520);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                str5 = str4;
                i3 |= startRestartGroup.changed(str5) ? 131072 : 65536;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    str6 = str5;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        str5 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(279288520, i5, -1, "com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItem (FeaturedStoreItem.kt:48)");
                    }
                    if (str5 == null || (companion = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str5)) == null) {
                        companion = androidx.compose.ui.Modifier.INSTANCE;
                    }
                    java.lang.String str7 = str5;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str2, modifier4.then(companion), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_activationdetails_retailer_fee, new java.lang.Object[]{str3}, startRestartGroup, 0), null, null, false, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-138520323, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt.$r8$lambda$XG6aYcKp_sRCCTYDqkS5hQbIhg0(str, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, null, null, false, function0, null, null, null, com.paypal.pds.components.ListAlignment.Center, false, composer2, ((i5 >> 3) & 14) | 102432768, (i5 & 7168) | 12582912, 384664);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    str6 = str7;
                    modifier3 = modifier5;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt.$r8$lambda$oN9l9TUeGQEHwm6qwrkfvJSBHuc(str, str2, str3, function0, modifier3, str6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str5 = str4;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str5 = str4;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void FeaturedStoreItem(final com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cashInStoreUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1561703036);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(cashInStoreUiModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1561703036, i3, -1, "com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItem (FeaturedStoreItem.kt:77)");
            }
            FeaturedStoreItem(cashInStoreUiModel.getLogoUrl(), cashInStoreUiModel.getName(), cashInStoreUiModel.getFeeText(), function0, modifier, com.paypal.oslo.feature.cashin.ui.utils.StoreItemUtilsKt.generateStoreItemTestTag(cashInStoreUiModel.getName(), "featured"), startRestartGroup, (i3 << 6) & 64512, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt.m13433$r8$lambda$NjK8rdScLOuk2VnwU5gB5Tlnnk(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel.this, function0, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$NjK-8rdScLOuk2VnwU5gB5Tlnnk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13433$r8$lambda$NjK8rdScLOuk2VnwU5gB5Tlnnk(com.paypal.oslo.feature.cashin.ui.viewmodel.CashInStoreUiModel cashInStoreUiModel, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FeaturedStoreItem(cashInStoreUiModel, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Pf7DsZsaF1ohm-8BHJIQV50Chy4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13434$r8$lambda$Pf7DsZsaF1ohm8BHJIQV50Chy4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-528130215);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-528130215, updateChangedFlags, -1, "com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemPreview (FeaturedStoreItem.kt:90)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FeaturedStoreItem(null, "Store name", "$3.60", (kotlin.jvm.functions.Function0) rememberedValue, null, null, startRestartGroup, 3510, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItemKt.m13434$r8$lambda$Pf7DsZsaF1ohm8BHJIQV50Chy4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XG6aYcKp_sRCCTYDqkS5hQbIhg0(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-138520323, i, -1, "com.paypal.oslo.feature.cashin.ui.components.FeaturedStoreItem.<anonymous> (FeaturedStoreItem.kt:56)");
            }
            com.paypal.pds.components.AvatarKt.Avatar(com.paypal.oslo.feature.cashin.ui.utils.AvatarUtilKt.rememberAvatarSource(str, composer, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize32()), com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, composer, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oN9l9TUeGQEHwm6qwrkfvJSBHuc(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FeaturedStoreItem(str, str2, str3, function0, modifier, str4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
