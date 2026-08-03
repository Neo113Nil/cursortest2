package androidx.compose.material;

/* compiled from: ListItem.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0090\u0001\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\tH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0013\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0002\b\tH\u0002¢\u0006\u0002\u0010\u001d\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"BaselinesOffsetColumn", "", "offsets", "", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ListItem", "icon", "secondaryText", "singleLineSecondaryText", "", "overlineText", "trailing", "text", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "OffsetToBaselineOrCenter", "offset", "OffsetToBaselineOrCenter-Kz89ssw", "(FLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "applyTextStyle", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "contentAlpha", "", "(Landroidx/compose/ui/text/TextStyle;FLkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function2;", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0058  */
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ListItem(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> text, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        int i5;
        boolean z2;
        int i6;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        int i7;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        final androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> applyTextStyle;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> applyTextStyle2;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> applyTextStyle3;
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> applyTextStyle4;
        androidx.compose.ui.Modifier semantics;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-450923337);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(ListItem)P(1!1,3,4!1,6)81@3397L10,83@3480L4,84@3570L6,85@3671L4,86@3764L4:ListItem.kt#jmzs0o");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function25 = function22;
                i3 |= startRestartGroup.changed(function25) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((57344 & i) == 0) {
                        function26 = function23;
                        i3 |= startRestartGroup.changed(function26) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((458752 & i) == 0) {
                            function27 = function24;
                            i3 |= startRestartGroup.changed(function27) ? 131072 : 65536;
                            if ((i2 & 64) == 0) {
                                i3 |= 1572864;
                            } else if ((i & 3670016) == 0) {
                                i3 |= startRestartGroup.changed(text) ? 1048576 : 524288;
                            }
                            if ((i3 & 2995931) == 599186 || !startRestartGroup.getSkipping()) {
                                companion = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                function28 = i9 == 0 ? null : function2;
                                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214 = i4 == 0 ? null : function25;
                                boolean z4 = i5 == 0 ? true : z2;
                                if (i6 != 0) {
                                    function26 = null;
                                }
                                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = i7 == 0 ? function27 : null;
                                androidx.compose.material.Typography typography = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                                applyTextStyle = applyTextStyle(typography.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
                                applyTextStyle2 = applyTextStyle(typography.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
                                applyTextStyle3 = applyTextStyle(typography.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
                                applyTextStyle4 = applyTextStyle(typography.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
                                semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        invoke2(semanticsPropertyReceiver);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                });
                                if (applyTextStyle2 == null || applyTextStyle3 != null) {
                                    function29 = function26;
                                    if ((applyTextStyle3 != null && z4) || applyTextStyle2 == null) {
                                        startRestartGroup.startReplaceableGroup(-210280382);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "95@4139L184");
                                        androidx.compose.material.TwoLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                        startRestartGroup.endReplaceableGroup();
                                    } else {
                                        startRestartGroup.startReplaceableGroup(-210280168);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                                        androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                                        startRestartGroup.endReplaceableGroup();
                                    }
                                } else {
                                    startRestartGroup.startReplaceableGroup(-210280579);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "91@3942L61");
                                    function29 = function26;
                                    androidx.compose.material.OneLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle4, startRestartGroup, (i3 & 112) | 24576, 0);
                                    startRestartGroup.endReplaceableGroup();
                                }
                                function210 = function214;
                                function211 = function29;
                                function212 = function215;
                                function213 = function28;
                                z3 = z4;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                companion = modifier;
                                function213 = function2;
                                function210 = function25;
                                z3 = z2;
                                function211 = function26;
                                function212 = function27;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                return;
                            }
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i10) {
                                    androidx.compose.material.ListItemKt.ListItem(androidx.compose.ui.Modifier.this, function213, function210, z3, function211, function212, text, composer2, i | 1, i2);
                                }
                            });
                            return;
                        }
                        function27 = function24;
                        if ((i2 & 64) == 0) {
                        }
                        if ((i3 & 2995931) == 599186) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        androidx.compose.material.Typography typography2 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                        applyTextStyle = applyTextStyle(typography2.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
                        applyTextStyle2 = applyTextStyle(typography2.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
                        applyTextStyle3 = applyTextStyle(typography2.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
                        applyTextStyle4 = applyTextStyle(typography2.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
                        semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return kotlin.Unit.INSTANCE;
                            }
                        });
                        if (applyTextStyle2 == null) {
                        }
                        function29 = function26;
                        if (applyTextStyle3 != null) {
                        }
                        startRestartGroup.startReplaceableGroup(-210280168);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                        androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                        startRestartGroup.endReplaceableGroup();
                        function210 = function214;
                        function211 = function29;
                        function212 = function215;
                        function213 = function28;
                        z3 = z4;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    function26 = function23;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function27 = function24;
                    if ((i2 & 64) == 0) {
                    }
                    if ((i3 & 2995931) == 599186) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    androidx.compose.material.Typography typography22 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                    applyTextStyle = applyTextStyle(typography22.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
                    applyTextStyle2 = applyTextStyle(typography22.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
                    applyTextStyle3 = applyTextStyle(typography22.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
                    applyTextStyle4 = applyTextStyle(typography22.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
                    semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return kotlin.Unit.INSTANCE;
                        }
                    });
                    if (applyTextStyle2 == null) {
                    }
                    function29 = function26;
                    if (applyTextStyle3 != null) {
                    }
                    startRestartGroup.startReplaceableGroup(-210280168);
                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                    androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                    startRestartGroup.endReplaceableGroup();
                    function210 = function214;
                    function211 = function29;
                    function212 = function215;
                    function213 = function28;
                    z3 = z4;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function26 = function23;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function27 = function24;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                androidx.compose.material.Typography typography222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
                applyTextStyle = applyTextStyle(typography222.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
                kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
                applyTextStyle2 = applyTextStyle(typography222.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
                applyTextStyle3 = applyTextStyle(typography222.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
                applyTextStyle4 = applyTextStyle(typography222.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
                semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return kotlin.Unit.INSTANCE;
                    }
                });
                if (applyTextStyle2 == null) {
                }
                function29 = function26;
                if (applyTextStyle3 != null) {
                }
                startRestartGroup.startReplaceableGroup(-210280168);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
                androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
                startRestartGroup.endReplaceableGroup();
                function210 = function214;
                function211 = function29;
                function212 = function215;
                function213 = function28;
                z3 = z4;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function25 = function22;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function26 = function23;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function27 = function24;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            androidx.compose.material.Typography typography2222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
            applyTextStyle = applyTextStyle(typography2222.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
            kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
            applyTextStyle2 = applyTextStyle(typography2222.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
            applyTextStyle3 = applyTextStyle(typography2222.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
            applyTextStyle4 = applyTextStyle(typography2222.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
            semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return kotlin.Unit.INSTANCE;
                }
            });
            if (applyTextStyle2 == null) {
            }
            function29 = function26;
            if (applyTextStyle3 != null) {
            }
            startRestartGroup.startReplaceableGroup(-210280168);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
            androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
            startRestartGroup.endReplaceableGroup();
            function210 = function214;
            function211 = function29;
            function212 = function215;
            function213 = function28;
            z3 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function25 = function22;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function26 = function23;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function27 = function24;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        androidx.compose.material.Typography typography22222 = androidx.compose.material.MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6);
        applyTextStyle = applyTextStyle(typography22222.getSubtitle1(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), text);
        kotlin.jvm.internal.Intrinsics.checkNotNull(applyTextStyle);
        applyTextStyle2 = applyTextStyle(typography22222.getBody2(), androidx.compose.material.ContentAlpha.INSTANCE.getMedium(startRestartGroup, 6), function214);
        applyTextStyle3 = applyTextStyle(typography22222.getOverline(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function26);
        applyTextStyle4 = applyTextStyle(typography22222.getCaption(), androidx.compose.material.ContentAlpha.INSTANCE.getHigh(startRestartGroup, 6), function215);
        semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(companion, true, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$ListItem$semanticsModifier$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics2, "$this$semantics");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }
        });
        if (applyTextStyle2 == null) {
        }
        function29 = function26;
        if (applyTextStyle3 != null) {
        }
        startRestartGroup.startReplaceableGroup(-210280168);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "104@4355L184");
        androidx.compose.material.ThreeLine.INSTANCE.ListItem(semantics, function28, applyTextStyle, applyTextStyle2, applyTextStyle3, applyTextStyle4, startRestartGroup, (i3 & 112) | 1572864, 0);
        startRestartGroup.endReplaceableGroup();
        function210 = function214;
        function211 = function29;
        function212 = function215;
        function213 = function28;
        z3 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BaselinesOffsetColumn(final java.util.List<androidx.compose.ui.unit.Dp> list, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1631148337);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(BaselinesOffsetColumn)P(2,1)352@13107L1127:ListItem.kt#jmzs0o");
        if ((i2 & 2) != 0) {
            modifier = androidx.compose.ui.Modifier.INSTANCE;
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i3) {
                return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list2, i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
                int i3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
                long m4415copyZbe2FdA$default = androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, Integer.MAX_VALUE, 3, null);
                java.util.List<? extends androidx.compose.ui.layout.Measurable> list2 = measurables;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((androidx.compose.ui.layout.Measurable) it.next()).mo3402measureBRTryo0(m4415copyZbe2FdA$default));
                }
                final java.util.ArrayList arrayList2 = arrayList;
                java.util.Iterator it2 = arrayList2.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    i4 = java.lang.Math.max(i4, ((androidx.compose.ui.layout.Placeable) it2.next()).getWidth());
                }
                int size = arrayList2.size();
                final java.lang.Integer[] numArr = new java.lang.Integer[size];
                for (int i5 = 0; i5 < size; i5++) {
                    numArr[i5] = 0;
                }
                java.util.List<androidx.compose.ui.unit.Dp> list3 = list;
                int size2 = arrayList2.size();
                int i6 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    androidx.compose.ui.layout.Placeable placeable = (androidx.compose.ui.layout.Placeable) arrayList2.get(i7);
                    if (i7 > 0) {
                        int i8 = i7 - 1;
                        i3 = ((androidx.compose.ui.layout.Placeable) arrayList2.get(i8)).getHeight() - ((androidx.compose.ui.layout.Placeable) arrayList2.get(i8)).get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                    } else {
                        i3 = 0;
                    }
                    int max = java.lang.Math.max(0, (Layout.mo309roundToPx0680j_4(list3.get(i7).m4492unboximpl()) - placeable.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) - i3);
                    numArr[i7] = java.lang.Integer.valueOf(max + i6);
                    i6 += max + placeable.getHeight();
                }
                return androidx.compose.ui.layout.MeasureScope.CC.layout$default(Layout, i4, i6, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                        java.util.List<androidx.compose.ui.layout.Placeable> list4 = arrayList2;
                        java.lang.Integer[] numArr2 = numArr;
                        int size3 = list4.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, list4.get(i9), 0, numArr2[i9].intValue(), 0.0f, 4, null);
                        }
                    }
                }, 4, null);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = startRestartGroup.consume(localDensity);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
        java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier2);
        int i3 = (((((i >> 6) & 14) | (i & 112)) << 9) & 7168) | 6;
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$BaselinesOffsetColumn$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i4) {
                androidx.compose.material.ListItemKt.BaselinesOffsetColumn(list, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OffsetToBaselineOrCenter-Kz89ssw, reason: not valid java name */
    public static final void m1415OffsetToBaselineOrCenterKz89ssw(final float f, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1062692685);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(OffsetToBaselineOrCenter)P(2:c#ui.unit.Dp,1)394@14762L806:ListItem.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(androidx.compose.ui.layout.IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i5) {
                    return androidx.compose.ui.layout.MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i5);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final androidx.compose.ui.layout.MeasureResult mo39measure3p2s80s(androidx.compose.ui.layout.MeasureScope Layout, java.util.List<? extends androidx.compose.ui.layout.Measurable> measurables, long j) {
                    int max;
                    final int m4611getYimpl;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(measurables, "measurables");
                    final androidx.compose.ui.layout.Placeable mo3402measureBRTryo0 = measurables.get(0).mo3402measureBRTryo0(androidx.compose.ui.unit.Constraints.m4415copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                    int i5 = mo3402measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                    if (i5 != Integer.MIN_VALUE) {
                        m4611getYimpl = Layout.mo309roundToPx0680j_4(f) - i5;
                        max = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), mo3402measureBRTryo0.getHeight() + m4611getYimpl);
                    } else {
                        max = java.lang.Math.max(androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(j), mo3402measureBRTryo0.getHeight());
                        m4611getYimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(androidx.compose.ui.Alignment.INSTANCE.getCenter().mo1748alignKFBX0sM(androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g(), androidx.compose.ui.unit.IntSizeKt.IntSize(0, max - mo3402measureBRTryo0.getHeight()), Layout.getLayoutDirection()));
                    }
                    return androidx.compose.ui.layout.MeasureScope.CC.layout$default(Layout, mo3402measureBRTryo0.getWidth(), max, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$1$measure$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(androidx.compose.ui.layout.Placeable.PlacementScope layout) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(layout, androidx.compose.ui.layout.Placeable.this, 0, m4611getYimpl, 0.0f, 4, null);
                        }
                    }, 4, null);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.Density> localDensity = androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localDensity);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) consume;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.unit.LayoutDirection> localLayoutDirection = androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localLayoutDirection);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) consume2;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ViewConfiguration> localViewConfiguration = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localViewConfiguration);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) consume3;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(modifier);
            int i5 = ((((i3 & 112) | ((i3 >> 6) & 14)) << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i5 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$OffsetToBaselineOrCenter$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                androidx.compose.material.ListItemKt.m1415OffsetToBaselineOrCenterKz89ssw(f, modifier2, function2, composer2, i | 1, i2);
            }
        });
    }

    private static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> applyTextStyle(final androidx.compose.ui.text.TextStyle textStyle, final float f, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        if (function2 == null) {
            return null;
        }
        return androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-830176860, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                invoke(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.runtime.Composer composer, int i) {
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C423@15773L123:ListItem.kt#jmzs0o");
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                androidx.compose.runtime.ProvidedValue[] providedValueArr = {androidx.compose.material.ContentAlphaKt.getLocalContentAlpha().provides(java.lang.Float.valueOf(f))};
                final androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider((androidx.compose.runtime.ProvidedValue<?>[]) providedValueArr, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, 1665877604, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material.ListItemKt$applyTextStyle$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        invoke(composer2, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer2, int i2) {
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C424@15853L33:ListItem.kt#jmzs0o");
                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        } else {
                            androidx.compose.material.TextKt.ProvideTextStyle(androidx.compose.ui.text.TextStyle.this, function22, composer2, 0);
                        }
                    }
                }), composer, 56);
            }
        });
    }
}
