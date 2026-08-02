package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"ErrorScreen", "", "onRetry", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "testTag", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "buttonText", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str5;
        int i5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str9;
        final java.lang.String str10;
        final java.lang.String str11;
        final java.lang.String str12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        java.lang.String str13;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1985851640);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str5 = str;
                i3 |= startRestartGroup.changed(str5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str6 = str2;
                    i3 |= startRestartGroup.changed(str6) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            str7 = str3;
                            if (startRestartGroup.changed(str7)) {
                                i7 = 16384;
                                i3 |= i7;
                            }
                        } else {
                            str7 = str3;
                        }
                        i7 = 8192;
                        i3 |= i7;
                    } else {
                        str7 = str3;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            str8 = str4;
                            if (startRestartGroup.changed(str8)) {
                                i6 = 131072;
                                i3 |= i6;
                            }
                        } else {
                            str8 = str4;
                        }
                        i6 = 65536;
                        i3 |= i6;
                    } else {
                        str8 = str4;
                    }
                    if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            modifier4 = modifier2;
                            str13 = str5;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            java.lang.String str14 = i4 != 0 ? "error_screen" : str5;
                            if (i5 != 0) {
                                str6 = null;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                str7 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_error_screen_description, startRestartGroup, 0);
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                                str8 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_error_screen_retry_button_text, startRestartGroup, 0);
                            }
                            modifier4 = companion;
                            str13 = str14;
                        }
                        java.lang.String str15 = str6;
                        java.lang.String str16 = str7;
                        java.lang.String str17 = str8;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1985851640, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.ErrorScreen (ErrorScreen.kt:33)");
                        }
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), str13);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                        com.paypal.pds.components.EmptyStateKt.EmptyState(com.paypal.pds.core.Icon.Alert.INSTANCE, androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.Modifier.INSTANCE, false, null, 3, null), null, str15, str16, str17, function0, startRestartGroup, (i3 & 7168) | 54 | (57344 & i3) | (458752 & i3) | ((i3 << 18) & 3670016), 4);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        str9 = str13;
                        str10 = str15;
                        str11 = str16;
                        str12 = str17;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        str9 = str5;
                        str10 = str6;
                        str11 = str7;
                        str12 = str8;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.ErrorScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.consumerprivacy.ui.components.ErrorScreenKt.$r8$lambda$Ozq7WEyvQvi_i1F_HT5AnovKXM0(kotlin.jvm.functions.Function0.this, modifier3, str9, str10, str11, str12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                str6 = str2;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str5 = str;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str6 = str2;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str5 = str;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str6 = str2;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ozq7WEyvQvi_i1F_HT5AnovKXM0(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErrorScreen(function0, modifier, str, str2, str3, str4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
