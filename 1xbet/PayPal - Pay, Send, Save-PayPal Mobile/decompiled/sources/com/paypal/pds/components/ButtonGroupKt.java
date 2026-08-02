package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a?\u0010\n\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\u001a>\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0004H\u0002\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010!\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010\"\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010$\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"ButtonGroupHug", "", "items", "", "Lcom/paypal/pds/components/ButtonGroupItem;", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/ButtonSize;", "([Lcom/paypal/pds/components/ButtonGroupItem;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ButtonSize;Landroidx/compose/runtime/Composer;II)V", "ButtonGroup", "alignment", "Lcom/paypal/pds/components/ButtonGroupAlignment;", "([Lcom/paypal/pds/components/ButtonGroupItem;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/ButtonSize;Lcom/paypal/pds/components/ButtonGroupAlignment;Landroidx/compose/runtime/Composer;II)V", "Button", "(Lcom/paypal/pds/components/ButtonGroupItem;Lcom/paypal/pds/components/ButtonSize;Landroidx/compose/runtime/Composer;I)V", "AdaptiveButtonLayout", "spacing", "Landroidx/compose/ui/unit/Dp;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "AdaptiveButtonLayout-942rkJo", "(Lcom/paypal/pds/components/ButtonGroupAlignment;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NEWLINE_REGEX", "Lkotlin/text/Regex;", "hasNewLines", "", "PreviewTextWithNewline", "", "ButtonGroupBasicPreview", "(Landroidx/compose/runtime/Composer;I)V", "ButtonGroupVariableItemCountPreview", "ButtonGroupHugVariableCountPreview", "ButtonGroupLongTextPreview", "ButtonGroupNewlinePreview", "ButtonGroupHugSingleNewlinePreview", "ButtonGroupHugMultipleNewlinesPreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ButtonGroupKt {
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("(\\r\\n|\\r|\\n)");

    public static final void ButtonGroupHug(final com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonGroupItemArr, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1203698252);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(buttonSize) ? 256 : 128;
        }
        startRestartGroup.startMovableGroup(-1407816751, java.lang.Integer.valueOf(buttonGroupItemArr.length));
        int i6 = i3 | (startRestartGroup.changed(buttonGroupItemArr.length) ? 4 : 0);
        for (com.paypal.pds.components.ButtonGroupItem buttonGroupItem : buttonGroupItemArr) {
            i6 |= startRestartGroup.changed(buttonGroupItem) ? 4 : 0;
        }
        startRestartGroup.endMovableGroup();
        if ((i6 & 14) == 0) {
            i6 |= 2;
        }
        if (!startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                buttonSize = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1203698252, i6, -1, "com.paypal.pds.components.ButtonGroupHug (ButtonGroup.kt:50)");
            }
            ButtonGroup((com.paypal.pds.components.ButtonGroupItem[]) java.util.Arrays.copyOf(buttonGroupItemArr, buttonGroupItemArr.length), modifier, buttonSize, com.paypal.pds.components.ButtonGroupAlignment.Hug.INSTANCE, startRestartGroup, (i6 & 112) | 3072 | (i6 & 896), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final com.paypal.pds.components.ButtonSize buttonSize2 = buttonSize;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$_SA4oqC88DBZ_Jii3cgXh3cDtlE(buttonGroupItemArr, modifier2, buttonSize2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonGroup(final com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.pds.components.ButtonSize buttonSize2;
        int i4;
        com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment2;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        final com.paypal.pds.components.ButtonSize.Medium medium;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment3;
        com.paypal.pds.components.ButtonGroupAlignment.Vertical vertical;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonGroupItemArr, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2000795514);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 32 : 16) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            buttonSize2 = buttonSize;
            i3 |= startRestartGroup.changed(buttonSize2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                buttonGroupAlignment2 = buttonGroupAlignment;
                i3 |= startRestartGroup.changed(buttonGroupAlignment2) ? 2048 : 1024;
                startRestartGroup.startMovableGroup(1380860355, java.lang.Integer.valueOf(buttonGroupItemArr.length));
                boolean z = false;
                i5 = i3 | (startRestartGroup.changed(buttonGroupItemArr.length) ? 4 : 0);
                for (com.paypal.pds.components.ButtonGroupItem buttonGroupItem : buttonGroupItemArr) {
                    i5 |= startRestartGroup.changed(buttonGroupItem) ? 4 : 0;
                }
                startRestartGroup.endMovableGroup();
                if ((i5 & 14) == 0) {
                    i5 |= 2;
                }
                if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    medium = buttonSize2;
                } else {
                    companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    medium = i7 != 0 ? com.paypal.pds.components.ButtonSize.Medium.INSTANCE : buttonSize2;
                    com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment4 = i4 != 0 ? com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE : buttonGroupAlignment2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-2000795514, i5, -1, "com.paypal.pds.components.ButtonGroup (ButtonGroup.kt:98)");
                    }
                    int length = buttonGroupItemArr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        if (Camera2StreamConfigurationMap.containsMatchIn(buttonGroupItemArr[i8].getText())) {
                            z = true;
                            break;
                        }
                        i8++;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(buttonGroupAlignment4, com.paypal.pds.components.ButtonGroupAlignment.Hug.INSTANCE) && buttonGroupItemArr.length == 1) {
                        vertical = com.paypal.pds.components.ButtonGroupAlignment.Hug.INSTANCE;
                    } else if (z) {
                        vertical = com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE;
                    } else {
                        buttonGroupAlignment3 = buttonGroupAlignment4;
                        getHighResolutionOutputSizeshNQ4ISI(buttonGroupAlignment3, com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1889634664, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$5GJ4f3GczchBkFcVscDzJUBmVSo(buttonGroupItemArr, medium, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, 3072, 4);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        buttonGroupAlignment2 = buttonGroupAlignment4;
                    }
                    buttonGroupAlignment3 = vertical;
                    getHighResolutionOutputSizeshNQ4ISI(buttonGroupAlignment3, com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1889634664, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$5GJ4f3GczchBkFcVscDzJUBmVSo(buttonGroupItemArr, medium, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3072, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    buttonGroupAlignment2 = buttonGroupAlignment4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final com.paypal.pds.components.ButtonSize buttonSize3 = medium;
                    final com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment5 = buttonGroupAlignment2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.pds.components.ButtonGroupKt.m21612$r8$lambda$fIxMMGaQm9bMO_YPoSR7eXcHvs(buttonGroupItemArr, modifier3, buttonSize3, buttonGroupAlignment5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            buttonGroupAlignment2 = buttonGroupAlignment;
            startRestartGroup.startMovableGroup(1380860355, java.lang.Integer.valueOf(buttonGroupItemArr.length));
            boolean z2 = false;
            i5 = i3 | (startRestartGroup.changed(buttonGroupItemArr.length) ? 4 : 0);
            while (r14 < r11) {
            }
            startRestartGroup.endMovableGroup();
            if ((i5 & 14) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        buttonSize2 = buttonSize;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        buttonGroupAlignment2 = buttonGroupAlignment;
        startRestartGroup.startMovableGroup(1380860355, java.lang.Integer.valueOf(buttonGroupItemArr.length));
        boolean z22 = false;
        i5 = i3 | (startRestartGroup.changed(buttonGroupItemArr.length) ? 4 : 0);
        while (r14 < r11) {
        }
        startRestartGroup.endMovableGroup();
        if ((i5 & 14) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 1171) != 1170, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.pds.components.ButtonGroupItem buttonGroupItem, final com.paypal.pds.components.ButtonSize buttonSize, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-827548369);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(buttonGroupItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(buttonSize) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-827548369, i2, -1, "com.paypal.pds.components.Button (ButtonGroup.kt:122)");
            }
            final java.lang.String contentDescription = buttonGroupItem.getContentDescription();
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            if (contentDescription != null) {
                startRestartGroup.startReplaceGroup(-380974571);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                boolean changed = startRestartGroup.changed(contentDescription);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$f047JjWo71ok9gGeo7RMP2tuES8(contentDescription, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-380877045);
                startRestartGroup.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = fillMaxWidth$default.then(companion);
            com.paypal.pds.components.ButtonKt.Button(buttonGroupItem.getOnClick(), buttonGroupItem.getText(), buttonGroupItem.getAnalyticsScope().getModifier().then(then), buttonGroupItem.getLeadingIcon(), buttonGroupItem.getTrailingIcon(), buttonGroupItem.getStyle(), buttonSize, false, false, startRestartGroup, (i2 << 15) & 3670016, 384);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.m21610$r8$lambda$NiTkFqutqMVr42PPjBXbXORwE(com.paypal.pds.components.ButtonGroupItem.this, buttonSize, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment, androidx.compose.ui.Modifier modifier, float f, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        float f2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1837928714);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(buttonGroupAlignment) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        f2 = com.paypal.pds.core.ConstantsKt.getSpacing12();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1837928714, i3, -1, "com.paypal.pds.components.AdaptiveButtonLayout (ButtonGroup.kt:175)");
                    }
                    boolean z = (i3 & 896) == 256;
                    boolean z2 = (i3 & 14) == 4;
                    com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.pds.components.ButtonGroupKt$AdaptiveButtonLayout$1$1(f2, buttonGroupAlignment);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((((((((i3 >> 9) & 14) | (i3 & 112)) << 6) & 896) | 6) >> 6) & 14));
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                final float f3 = f2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$cicRI8q32cBJyrVUMG4xQexlw90(com.paypal.pds.components.ButtonGroupAlignment.this, modifier3, f3, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            final float f32 = f2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        final float f322 = f2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2ylutsf068rr7ACxSZ34jEKY0sE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-579661902);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-579661902, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupHugMultipleNewlinesPreview (ButtonGroup.kt:512)");
            }
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[3];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Approve\ntoday", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem(com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, (kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            buttonGroupItemArr[2] = new com.paypal.pds.components.ButtonGroupItem("Reject\ntomorrow", (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr, null, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda54
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$2ylutsf068rr7ACxSZ34jEKY0sE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5GJ4f3GczchBkFcVscDzJUBmVSo(com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr, com.paypal.pds.components.ButtonSize buttonSize, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1889634664, i, -1, "com.paypal.pds.components.ButtonGroup.<anonymous> (ButtonGroup.kt:115)");
            }
            for (com.paypal.pds.components.ButtonGroupItem buttonGroupItem : buttonGroupItemArr) {
                getHighSpeedVideoSizes(buttonGroupItem, buttonSize, composer, 0);
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ZL2KELEIys1IM48_UUf5igXttg(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        androidx.compose.runtime.Composer composer5;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-324862236);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-324862236, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupHugVariableCountPreview (ButtonGroup.kt:385)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("One Button", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[1];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda38
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Click Me", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr, null, null, composer3, 0, 6);
            androidx.compose.runtime.Composer composer6 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Two Buttons", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr2 = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue2 = composer6.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4 = composer6;
                composer4.updateRememberedValue(rememberedValue2);
            } else {
                composer4 = composer6;
            }
            buttonGroupItemArr2[0] = new com.paypal.pds.components.ButtonGroupItem("Yes", (kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue3 = composer4.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue3);
            }
            buttonGroupItemArr2[1] = new com.paypal.pds.components.ButtonGroupItem("No", (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr2, null, null, composer4, 0, 6);
            androidx.compose.runtime.Composer composer7 = composer4;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Three Buttons", null, null, null, null, null, false, 0, 0, null, null, composer4, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr3 = new com.paypal.pds.components.ButtonGroupItem[3];
            java.lang.Object rememberedValue4 = composer7.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5 = composer7;
                composer5.updateRememberedValue(rememberedValue4);
            } else {
                composer5 = composer7;
            }
            buttonGroupItemArr3[0] = new com.paypal.pds.components.ButtonGroupItem("Left", (kotlin.jvm.functions.Function0) rememberedValue4, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue5 = composer5.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue5);
            }
            buttonGroupItemArr3[1] = new com.paypal.pds.components.ButtonGroupItem("Center", (kotlin.jvm.functions.Function0) rememberedValue5, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue6 = composer5.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue6);
            }
            buttonGroupItemArr3[2] = new com.paypal.pds.components.ButtonGroupItem("Right", (kotlin.jvm.functions.Function0) rememberedValue6, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr3, null, null, composer5, 0, 6);
            androidx.compose.runtime.Composer composer8 = composer5;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Four Buttons", null, null, null, null, null, false, 0, 0, null, null, composer5, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr4 = new com.paypal.pds.components.ButtonGroupItem[4];
            java.lang.Object rememberedValue7 = composer8.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer8;
                composer2.updateRememberedValue(rememberedValue7);
            } else {
                composer2 = composer8;
            }
            buttonGroupItemArr4[0] = new com.paypal.pds.components.ButtonGroupItem("A", (kotlin.jvm.functions.Function0) rememberedValue7, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue8 = composer2.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda47
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
            }
            buttonGroupItemArr4[1] = new com.paypal.pds.components.ButtonGroupItem("B", (kotlin.jvm.functions.Function0) rememberedValue8, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue9 = composer2.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            buttonGroupItemArr4[2] = new com.paypal.pds.components.ButtonGroupItem(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, (kotlin.jvm.functions.Function0) rememberedValue9, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue10 = composer2.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            buttonGroupItemArr4[3] = new com.paypal.pds.components.ButtonGroupItem("D", (kotlin.jvm.functions.Function0) rememberedValue10, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            ButtonGroupHug(buttonGroupItemArr4, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, composer2, 384, 2);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$5ZL2KELEIys1IM48_UUf5igXttg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LPxqN7uCCb9R02yBkftgjlhKl6s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1620954137);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1620954137, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupNewlinePreview (ButtonGroup.kt:474)");
            }
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[3];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Approve\ntoday", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem(com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, (kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            buttonGroupItemArr[2] = new com.paypal.pds.components.ButtonGroupItem("Reject\ntomorrow", (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr, null, com.paypal.pds.components.ButtonSize.Large.INSTANCE, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$LPxqN7uCCb9R02yBkftgjlhKl6s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MoR6wjzp-pAenxHBMb-XVr3RkM8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21609$r8$lambda$MoR6wjzppAenxHBMbXVr3RkM8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(898227083);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(898227083, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupHugSingleNewlinePreview (ButtonGroup.kt:499)");
            }
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[1];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Approve\ntoday", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr, null, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.m21609$r8$lambda$MoR6wjzppAenxHBMbXVr3RkM8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NiT-kFqutqMVr42PPjBXbXO-RwE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21610$r8$lambda$NiTkFqutqMVr42PPjBXbXORwE(com.paypal.pds.components.ButtonGroupItem buttonGroupItem, com.paypal.pds.components.ButtonSize buttonSize, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoSizes(buttonGroupItem, buttonSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_SA4oqC88DBZ_Jii3cgXh3cDtlE(com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ButtonGroupHug(buttonGroupItemArr, modifier, buttonSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_ZOXzV0NV7dcNvIDnJVlc6HCQYg(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1073780275);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1073780275, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupBasicPreview (ButtonGroup.kt:293)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Horizontal Fill", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Approve", (kotlin.jvm.functions.Function0) rememberedValue, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 104, null);
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem("Reject", (kotlin.jvm.functions.Function0) rememberedValue2, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 104, null);
            ButtonGroup(buttonGroupItemArr, null, null, com.paypal.pds.components.ButtonGroupAlignment.Horizontal.INSTANCE, composer3, 3072, 6);
            androidx.compose.runtime.Composer composer5 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Vertical Fill", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr2 = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue3 = composer5.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4 = composer5;
                composer4.updateRememberedValue(rememberedValue3);
            } else {
                composer4 = composer5;
            }
            buttonGroupItemArr2[0] = new com.paypal.pds.components.ButtonGroupItem("Approve", (kotlin.jvm.functions.Function0) rememberedValue3, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
            java.lang.Object rememberedValue4 = composer4.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue4);
            }
            buttonGroupItemArr2[1] = new com.paypal.pds.components.ButtonGroupItem("Reject", (kotlin.jvm.functions.Function0) rememberedValue4, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 108, null);
            ButtonGroup(buttonGroupItemArr2, null, null, null, composer4, 0, 14);
            androidx.compose.runtime.Composer composer6 = composer4;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Horizontal Hug", null, null, null, null, null, false, 0, 0, null, null, composer4, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr3 = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue5 = composer6.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer6;
                composer2.updateRememberedValue(rememberedValue5);
            } else {
                composer2 = composer6;
            }
            buttonGroupItemArr3[0] = new com.paypal.pds.components.ButtonGroupItem("Yes", (kotlin.jvm.functions.Function0) rememberedValue5, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue6 = composer2.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue6);
            }
            buttonGroupItemArr3[1] = new com.paypal.pds.components.ButtonGroupItem("No", (kotlin.jvm.functions.Function0) rememberedValue6, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr3, null, null, composer2, 0, 6);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.$r8$lambda$_ZOXzV0NV7dcNvIDnJVlc6HCQYg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cicRI8q32cBJyrVUMG4xQexlw90(com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment, androidx.compose.ui.Modifier modifier, float f, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(buttonGroupAlignment, modifier, f, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f047JjWo71ok9gGeo7RMP2tuES8(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fIxMMGaQ-m9bMO_YPoSR7eXcHvs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21612$r8$lambda$fIxMMGaQm9bMO_YPoSR7eXcHvs(com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.ButtonSize buttonSize, com.paypal.pds.components.ButtonGroupAlignment buttonGroupAlignment, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ButtonGroup(buttonGroupItemArr, modifier, buttonSize, buttonGroupAlignment, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jXLuO-2GYk6GZIqzTCrGeK-7DI4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21614$r8$lambda$jXLuO2GYk6GZIqzTCrGeK7DI4(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1991862988);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1991862988, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupLongTextPreview (ButtonGroup.kt:426)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Fill with Long Text", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Lorem ipsum dolor sit amet, eiusmod consectet uradipiscing elit, sed do tempor incididunt ut", (kotlin.jvm.functions.Function0) rememberedValue, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem("Reject", (kotlin.jvm.functions.Function0) rememberedValue2, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 108, null);
            ButtonGroup(buttonGroupItemArr, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, com.paypal.pds.components.ButtonGroupAlignment.Horizontal.INSTANCE, composer3, 3456, 2);
            androidx.compose.runtime.Composer composer4 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Hug with Long Text", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr2 = new com.paypal.pds.components.ButtonGroupItem[3];
            java.lang.Object rememberedValue3 = composer4.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer4;
                composer2.updateRememberedValue(rememberedValue3);
            } else {
                composer2 = composer4;
            }
            buttonGroupItemArr2[0] = new com.paypal.pds.components.ButtonGroupItem("Lorem ipsum dolor sit amet, eiusmod consectet uradipiscing elit, sed do tempor incididunt ut", (kotlin.jvm.functions.Function0) rememberedValue3, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda33
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            buttonGroupItemArr2[1] = new com.paypal.pds.components.ButtonGroupItem(com.paypal.oslo.feature.p2p.api.navigation.SendTabConfiguration.PARENT_NAME, (kotlin.jvm.functions.Function0) rememberedValue4, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            java.lang.Object rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue5);
            }
            buttonGroupItemArr2[2] = new com.paypal.pds.components.ButtonGroupItem("Reject", (kotlin.jvm.functions.Function0) rememberedValue5, com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, null, null, 120, null);
            ButtonGroupHug(buttonGroupItemArr2, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, composer2, 384, 2);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda50
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.m21614$r8$lambda$jXLuO2GYk6GZIqzTCrGeK7DI4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u-i1gFgiKTucGvj4s3jZFIdiY98, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21619$r8$lambda$ui1gFgiKTucGvj4s3jZFIdiY98(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer composer3;
        androidx.compose.runtime.Composer composer4;
        androidx.compose.runtime.Composer composer5;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-486633829);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-486633829, updateChangedFlags, -1, "com.paypal.pds.components.ButtonGroupVariableItemCountPreview (ButtonGroup.kt:336)");
            }
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Two Buttons", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr = new com.paypal.pds.components.ButtonGroupItem[2];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3 = startRestartGroup;
                composer3.updateRememberedValue(rememberedValue);
            } else {
                composer3 = startRestartGroup;
            }
            buttonGroupItemArr[0] = new com.paypal.pds.components.ButtonGroupItem("Action 1", (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue2 = composer3.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer3.updateRememberedValue(rememberedValue2);
            }
            buttonGroupItemArr[1] = new com.paypal.pds.components.ButtonGroupItem("Action 2", (kotlin.jvm.functions.Function0) rememberedValue2, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            ButtonGroup(buttonGroupItemArr, null, null, null, composer3, 0, 14);
            androidx.compose.runtime.Composer composer6 = composer3;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Three Buttons", null, null, null, null, null, false, 0, 0, null, null, composer3, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr2 = new com.paypal.pds.components.ButtonGroupItem[3];
            java.lang.Object rememberedValue3 = composer6.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4 = composer6;
                composer4.updateRememberedValue(rememberedValue3);
            } else {
                composer4 = composer6;
            }
            buttonGroupItemArr2[0] = new com.paypal.pds.components.ButtonGroupItem("Save", (kotlin.jvm.functions.Function0) rememberedValue3, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null);
            java.lang.Object rememberedValue4 = composer4.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue4);
            }
            buttonGroupItemArr2[1] = new com.paypal.pds.components.ButtonGroupItem("Don't Save", (kotlin.jvm.functions.Function0) rememberedValue4, null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, 108, null);
            java.lang.Object rememberedValue5 = composer4.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer4.updateRememberedValue(rememberedValue5);
            }
            buttonGroupItemArr2[2] = new com.paypal.pds.components.ButtonGroupItem(com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, (kotlin.jvm.functions.Function0) rememberedValue5, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, 108, null);
            ButtonGroup(buttonGroupItemArr2, null, null, null, composer4, 0, 14);
            androidx.compose.runtime.Composer composer7 = composer4;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Four Buttons (Vertical)", null, null, null, null, null, false, 0, 0, null, null, composer4, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr3 = new com.paypal.pds.components.ButtonGroupItem[4];
            java.lang.Object rememberedValue6 = composer7.rememberedValue();
            if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5 = composer7;
                composer5.updateRememberedValue(rememberedValue6);
            } else {
                composer5 = composer7;
            }
            buttonGroupItemArr3[0] = new com.paypal.pds.components.ButtonGroupItem("Option 1", (kotlin.jvm.functions.Function0) rememberedValue6, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue7 = composer5.rememberedValue();
            if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue7);
            }
            buttonGroupItemArr3[1] = new com.paypal.pds.components.ButtonGroupItem("Option 2", (kotlin.jvm.functions.Function0) rememberedValue7, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue8 = composer5.rememberedValue();
            if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda35
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue8);
            }
            buttonGroupItemArr3[2] = new com.paypal.pds.components.ButtonGroupItem("Option 3", (kotlin.jvm.functions.Function0) rememberedValue8, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue9 = composer5.rememberedValue();
            if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer5.updateRememberedValue(rememberedValue9);
            }
            buttonGroupItemArr3[3] = new com.paypal.pds.components.ButtonGroupItem("Option 4", (kotlin.jvm.functions.Function0) rememberedValue9, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            ButtonGroup(buttonGroupItemArr3, null, null, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer5, 3072, 6);
            androidx.compose.runtime.Composer composer8 = composer5;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Five Buttons (Vertical)", null, null, null, null, null, false, 0, 0, null, null, composer5, 6, 0, 2046);
            com.paypal.pds.components.ButtonGroupItem[] buttonGroupItemArr4 = new com.paypal.pds.components.ButtonGroupItem[5];
            java.lang.Object rememberedValue10 = composer8.rememberedValue();
            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2 = composer8;
                composer2.updateRememberedValue(rememberedValue10);
            } else {
                composer2 = composer8;
            }
            buttonGroupItemArr4[0] = new com.paypal.pds.components.ButtonGroupItem("First", (kotlin.jvm.functions.Function0) rememberedValue10, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue11 = composer2.rememberedValue();
            if (rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue11);
            }
            buttonGroupItemArr4[1] = new com.paypal.pds.components.ButtonGroupItem("Second", (kotlin.jvm.functions.Function0) rememberedValue11, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue12 = composer2.rememberedValue();
            if (rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue12);
            }
            buttonGroupItemArr4[2] = new com.paypal.pds.components.ButtonGroupItem("Third", (kotlin.jvm.functions.Function0) rememberedValue12, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue13 = composer2.rememberedValue();
            if (rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue13);
            }
            buttonGroupItemArr4[3] = new com.paypal.pds.components.ButtonGroupItem("Fourth", (kotlin.jvm.functions.Function0) rememberedValue13, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            java.lang.Object rememberedValue14 = composer2.rememberedValue();
            if (rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer2.updateRememberedValue(rememberedValue14);
            }
            buttonGroupItemArr4[4] = new com.paypal.pds.components.ButtonGroupItem("Fifth", (kotlin.jvm.functions.Function0) rememberedValue14, null, null, null, null, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            ButtonGroup(buttonGroupItemArr4, null, com.paypal.pds.components.ButtonSize.Small.INSTANCE, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer2, 3456, 2);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ButtonGroupKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ButtonGroupKt.m21619$r8$lambda$ui1gFgiKTucGvj4s3jZFIdiY98(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
