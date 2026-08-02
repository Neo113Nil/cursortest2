package com.paypal.oslo.feature.balance.common.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"CardValueEdit", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "onClick", "Lkotlin/Function0;", "labelTestTag", "buttonTestTag", "analyticsModule", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;", "analyticsItem", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "analyticsContext", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Module;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "balance_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardValueEditKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardValueEdit(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str5, java.lang.String str6, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str7;
        final java.lang.String str8;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module2;
        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item2;
        final java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1478148087);
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
            i3 |= startRestartGroup.changed(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        int i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(str5) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changed(str6) ? 1048576 : 524288;
            }
            i5 = i2 & 128;
            int i9 = 12582912;
            if (i5 == 0) {
                if ((i & 12582912) == 0) {
                    i9 = (i & 16777216) == 0 ? startRestartGroup.changed(module) : startRestartGroup.changedInstance(module) ? 8388608 : 4194304;
                }
                i6 = i2 & 256;
                int i10 = 100663296;
                if (i6 == 0) {
                    if ((i & 100663296) == 0) {
                        i10 = (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? startRestartGroup.changed(item) : startRestartGroup.changedInstance(item) ? 67108864 : 33554432;
                    }
                    i7 = i2 & 512;
                    if (i7 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(list) ? 536870912 : 268435456;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        str7 = str5;
                        str8 = str6;
                        module2 = module;
                        item2 = item;
                        list2 = list;
                    } else {
                        java.lang.String str9 = i8 != 0 ? "" : str5;
                        java.lang.String str10 = i4 != 0 ? "" : str6;
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module3 = i5 != 0 ? null : module;
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item3 = i6 != 0 ? null : item;
                        java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> emptyList = i7 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1478148087, i3, -1, "com.paypal.oslo.feature.balance.common.ui.CardValueEdit (CardValueEdit.kt:45)");
                        }
                        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module4 = module3;
                        com.paypal.pds.components.SectionHeaderKt.SectionHeader(null, str, null, null, startRestartGroup, (i3 << 3) & 112, 13);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), startRestartGroup, 0);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.Common.CardValueEdit.CARD);
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        if (module4 != null) {
                            companion = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(companion, module4);
                        }
                        final java.lang.String str11 = str9;
                        composer2 = startRestartGroup;
                        final java.lang.String str12 = str10;
                        final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item4 = item3;
                        final java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list3 = emptyList;
                        com.paypal.pds.components.CardKt.Card(testTag.then(companion), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1127986543, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.CardValueEditKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.balance.common.ui.CardValueEditKt.$r8$lambda$MLw3eSGRWwJWjc3iZFmDk5yLO8g(str11, str2, str3, str12, item4, list3, function0, str4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, composer2, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        module2 = module4;
                        str7 = str9;
                        str8 = str10;
                        item2 = item3;
                        list2 = emptyList;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.CardValueEditKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.balance.common.ui.CardValueEditKt.m12015$r8$lambda$sgaAkISObXXVob7exiY4fgdrnw(str, str2, str3, str4, function0, str7, str8, module2, item2, list2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i10;
                i7 = i2 & 512;
                if (i7 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i3 |= i9;
            i6 = i2 & 256;
            int i102 = 100663296;
            if (i6 == 0) {
            }
            i3 |= i102;
            i7 = i2 & 512;
            if (i7 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i5 = i2 & 128;
        int i92 = 12582912;
        if (i5 == 0) {
        }
        i3 |= i92;
        i6 = i2 & 256;
        int i1022 = 100663296;
        if (i6 == 0) {
        }
        i3 |= i1022;
        i7 = i2 & 512;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$22PyhL8dMlPGss_vKyQYvP9H9GE(java.lang.String str, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List list, kotlin.jvm.functions.Function0 function0, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1964467929, i, -1, "com.paypal.oslo.feature.balance.common.ui.CardValueEdit.<anonymous>.<anonymous> (CardValueEdit.kt:66)");
            }
            com.paypal.pds.components.ButtonKt.Button(function0, str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str).then(item != null ? com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, item), list) : androidx.compose.ui.Modifier.INSTANCE), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, false, false, composer, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MLw3eSGRWwJWjc3iZFmDk5yLO8g(java.lang.String str, java.lang.String str2, java.lang.String str3, final java.lang.String str4, final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, final java.util.List list, final kotlin.jvm.functions.Function0 function0, final java.lang.String str5, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1127986543, i, -1, "com.paypal.oslo.feature.balance.common.ui.CardValueEdit.<anonymous> (CardValueEdit.kt:59)");
            }
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str), str3, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1964467929, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.CardValueEditKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.common.ui.CardValueEditKt.$r8$lambda$22PyhL8dMlPGss_vKyQYvP9H9GE(str4, item, list, function0, str5, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), null, null, null, null, false, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), null, null, false, composer, 12582912, 0, 475000);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$sgaAkISObXXVob7exiY4fgd-rnw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12015$r8$lambda$sgaAkISObXXVob7exiY4fgdrnw(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function0 function0, java.lang.String str5, java.lang.String str6, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module module, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardValueEdit(str, str2, str3, str4, function0, str5, str6, module, item, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
