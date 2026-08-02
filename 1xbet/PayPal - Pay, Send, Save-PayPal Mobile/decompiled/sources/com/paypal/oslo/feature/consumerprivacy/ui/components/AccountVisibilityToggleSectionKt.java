package com.paypal.oslo.feature.consumerprivacy.ui.components;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u008f\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"AccountVisibilityToggleSection", "", "title", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "showDivider", "radioOptions", "", "selectedRadioIndex", "", "onRadioSelected", "showTopPadding", "toggleTestTag", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/util/List;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "AccountVisibilityToggleSectionPreview", "(Landroidx/compose/runtime/Composer;I)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountVisibilityToggleSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:115:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountVisibilityToggleSection(final java.lang.String str, final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, java.lang.String str2, boolean z2, java.util.List<java.lang.String> list, java.lang.Integer num, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, boolean z3, java.lang.String str3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.Composer composer2;
        final java.lang.String str4;
        final boolean z4;
        final java.util.List<java.lang.String> list2;
        final java.lang.Integer num2;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13;
        final boolean z5;
        final java.lang.String str5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier;
        int i10;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1687158431);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(num) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
                    }
                    i9 = i2 & 512;
                    if (i9 == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changed(str3) ? 536870912 : 268435456;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        str4 = str2;
                        z4 = z2;
                        list2 = list;
                        num2 = num;
                        function13 = function12;
                        z5 = z3;
                        str5 = str3;
                    } else {
                        java.lang.String str6 = i11 != 0 ? "" : str2;
                        boolean z6 = i4 != 0 ? false : z2;
                        java.util.List<java.lang.String> list3 = i5 != 0 ? null : list;
                        java.lang.Integer num3 = i6 != 0 ? null : num;
                        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function15 = i7 != 0 ? null : function12;
                        boolean z7 = i8 != 0 ? false : z3;
                        java.lang.String str7 = i9 != 0 ? "" : str3;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1687158431, i3, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSection (AccountVisibilityToggleSection.kt:47)");
                        }
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, z7 ? com.paypal.pds.core.ConstantsKt.getSpacing16() : com.paypal.pds.core.ConstantsKt.getSpacing0(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor3);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        int i12 = i3;
                        java.lang.String str8 = str7;
                        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function16 = function15;
                        java.lang.String str9 = str6;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.ui.Modifier.INSTANCE, false, null, 3, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, (i3 & 14) | 48, 6, 1020);
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(str9, "")) {
                            composer2 = startRestartGroup;
                            composer2.startReplaceGroup(-479484766);
                            modifier = null;
                            i10 = 0;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str9, androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.ui.Modifier.INSTANCE, 0.9f), false, null, 3, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, ((i12 >> 9) & 14) | 432, 6, 1016);
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = startRestartGroup;
                            modifier = null;
                            i10 = 0;
                            composer2.startReplaceGroup(-479144975);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        com.paypal.pds.components.SwitchKt.Switch(z, function1, str8.length() > 0 ? androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, str8) : androidx.compose.ui.Modifier.INSTANCE, false, composer2, (i12 >> 3) & 126, 8);
                        composer2.endNode();
                        if (list3 == null || num3 == null) {
                            function14 = function16;
                        } else {
                            function14 = function16;
                            if (function14 != null) {
                                composer2.startReplaceGroup(-1242636251);
                                java.util.List<java.lang.String> list4 = list3;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list4, 10));
                                java.util.Iterator<T> it = list4.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(com.paypal.pds.components.RadioButtonItem.Companion.create$default(com.paypal.pds.components.RadioButtonItem.INSTANCE, (java.lang.String) it.next(), (java.lang.String) null, (com.paypal.pds.core.AnalyticsScope) null, 6, (java.lang.Object) null));
                                }
                                java.util.ArrayList arrayList2 = arrayList;
                                int intValue = num3.intValue();
                                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null);
                                int i13 = (i12 & 29360128) == 8388608 ? 1 : i10;
                                java.lang.Object rememberedValue = composer2.rememberedValue();
                                if (i13 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.$r8$lambda$KOnCz9dfx4hsyEZZH9xQlimwTK0(kotlin.jvm.functions.Function1.this, ((java.lang.Integer) obj).intValue());
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                com.paypal.pds.components.RadioKt.Radio(arrayList2, java.lang.Integer.valueOf(intValue), m1710paddingqDBjuR0$default2, false, (kotlin.jvm.functions.Function1) rememberedValue, null, null, composer2, (i12 >> 15) & 112, 104);
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (!z6) {
                                    composer2.startReplaceGroup(1867383336);
                                    com.paypal.pds.components.DividerKt.Divider(modifier, composer2, i10, 1);
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(1867407361);
                                    composer2.endReplaceGroup();
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                str5 = str8;
                                str4 = str9;
                                function13 = function14;
                                z4 = z6;
                                list2 = list3;
                                num2 = num3;
                                z5 = z7;
                            }
                        }
                        composer2.startReplaceGroup(-1242363017);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (!z6) {
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        str5 = str8;
                        str4 = str9;
                        function13 = function14;
                        z4 = z6;
                        list2 = list3;
                        num2 = num3;
                        z5 = z7;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.$r8$lambda$vIutgio8GBKo7GDqCzS3TSQkdP0(str, z, function1, str4, z4, list2, num2, function13, z5, str5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i2 & 512;
                if (i9 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i2 & 512;
            if (i9 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KOnCz9dfx4hsyEZZH9xQlimwTK0(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VDjtubLeMGLzav2X4SCNDMNzvy0(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(700958915);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(700958915, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionPreview (AccountVisibilityToggleSection.kt:94)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Everyone", "Contacts only"});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
            composer2 = startRestartGroup;
            AccountVisibilityToggleSection("Personal profile info", true, function1, "Allow people on PayPal to find you by username, name, email, and phone.", true, listOf, 0, function12, false, null, startRestartGroup, 14380470, com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.components.AccountVisibilityToggleSectionKt.$r8$lambda$VDjtubLeMGLzav2X4SCNDMNzvy0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vIutgio8GBKo7GDqCzS3TSQkdP0(java.lang.String str, boolean z, kotlin.jvm.functions.Function1 function1, java.lang.String str2, boolean z2, java.util.List list, java.lang.Integer num, kotlin.jvm.functions.Function1 function12, boolean z3, java.lang.String str3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AccountVisibilityToggleSection(str, z, function1, str2, z2, list, num, function12, z3, str3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
