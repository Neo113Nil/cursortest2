package com.paypal.oslo.feature.cryptocurrency.ui.details.components;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"TimeframeButtonGroup", "", "timeframes", "", "", "selectedIndex", "", "onTimeframeSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "contentDescriptions", "(Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "TimeframeButtonGroupPreview", "(Landroidx/compose/runtime/Composer;I)V", "TimeframeButtonGroupMiddleSelectedPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeframeButtonGroupKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeframeButtonGroup(final java.util.List<java.lang.String> list, final int i, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, java.util.List<java.lang.String> list2, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.util.List<java.lang.String> list3;
        final java.util.List<java.lang.String> list4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.ButtonStyle buttonStyle;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1380362510);
        int i5 = (i2 & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i6 = 256;
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                list3 = list2;
                i5 |= startRestartGroup.changedInstance(list3) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    list4 = list3;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    java.util.List<java.lang.String> emptyList = i4 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1380362510, i5, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroup (TimeframeButtonGroup.kt:44)");
                    }
                    startRestartGroup.startReplaceGroup(616530284);
                    java.util.List<java.lang.String> list5 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list5, 10));
                    final int i8 = 0;
                    for (java.lang.Object obj : list5) {
                        if (i8 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        java.lang.String str = (java.lang.String) obj;
                        boolean z = (i5 & 896) == i6;
                        boolean changed = startRestartGroup.changed(i8);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt.$r8$lambda$103sT690Z9kvgor_lAT0dG7s4Ac(kotlin.jvm.functions.Function1.this, i8);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                        if (i8 == i) {
                            buttonStyle = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                        } else {
                            buttonStyle = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                        }
                        arrayList.add(new com.paypal.pds.components.ButtonGroupItem(str, function0, null, null, buttonStyle, (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(emptyList, i8), null, 76, null));
                        i8++;
                        i6 = 256;
                    }
                    startRestartGroup.endReplaceGroup();
                    com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = (com.paypal.pds.components.ButtonGroupItem[]) arrayList.toArray(new com.paypal.pds.components.ButtonGroupItem[0]);
                    int i9 = ((i5 >> 6) & 112) | 384;
                    list4 = emptyList;
                    com.paypal.pds.components.ButtonGroupKt.ButtonGroupHug((com.paypal.pds.components.ButtonGroupItem[]) java.util.Arrays.copyOf(buttonGroupItemArr, buttonGroupItemArr.length), modifier3, com.paypal.pds.components.ButtonSize.Small.INSTANCE, startRestartGroup, i9, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt.$r8$lambda$X3XGtCcXe3IoiDhYheuXbuCSsgQ(list, i, function1, modifier4, list4, i2, i3, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            list3 = list2;
            if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        list3 = list2;
        if (!startRestartGroup.shouldExecute((i5 & 9363) != 9362, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$103sT690Z9kvgor_lAT0dG7s4Ac(kotlin.jvm.functions.Function1 function1, int i) {
        function1.invoke(java.lang.Integer.valueOf(i));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ssk4tb8HQf7AnCiaXBAQr89no9I(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1930878729);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1930878729, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupMiddleSelectedPreview (TimeframeButtonGroup.kt:81)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"24H", "1W", "1M", "6M", "1Y", "All"});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TimeframeButtonGroup(listOf, 3, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 438, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt.$r8$lambda$Ssk4tb8HQf7AnCiaXBAQr89no9I(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X3XGtCcXe3IoiDhYheuXbuCSsgQ(java.util.List list, int i, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, java.util.List list2, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        TimeframeButtonGroup(list, i, function1, modifier, list2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wkIpVes2csdipfpAvDUOFuFfBrA(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(149680441);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(149680441, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupPreview (TimeframeButtonGroup.kt:68)");
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"24H", "1W", "1M", "6M", "1Y", "All"});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Integer) obj).intValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TimeframeButtonGroup(listOf, 0, (kotlin.jvm.functions.Function1) rememberedValue, null, null, startRestartGroup, 438, 24);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.details.components.TimeframeButtonGroupKt.$r8$lambda$wkIpVes2csdipfpAvDUOFuFfBrA(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
