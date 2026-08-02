package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0016\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a7\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u000e\u001a#\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0019\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u001a"}, d2 = {"segmentsToRichText", "Lcom/paypal/pds/core/RichText;", "segments", "", "Lcom/paypal/oslo/feature/home/ui/util/StyledTextSegment;", "HomeSectionHeader", "", "modifier", "Landroidx/compose/ui/Modifier;", "title", "", "loading", "", "centerHorizontally", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZLandroidx/compose/runtime/Composer;II)V", "topPaddingIf", "condition", "padding", "Landroidx/compose/ui/unit/Dp;", "topPaddingIf-wH6b6FI", "(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;", "SectionHeaderPlainTextPreview", "(Landroidx/compose/runtime/Composer;I)V", "SectionHeaderWithStrongPreview", "SectionHeaderWithLineBreakPreview", "SectionHeaderShimmerPreview", "home_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HomeCollectionHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeSectionHeader(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        java.lang.String str2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        androidx.compose.ui.Modifier.Companion companion;
        java.lang.String str3;
        final boolean z5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-244298793);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                        str3 = str2;
                        z5 = z3;
                    } else {
                        companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str4 = i7 != 0 ? null : str2;
                        boolean z6 = i4 != 0 ? false : z3;
                        boolean z7 = i5 != 0 ? false : z4;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-244298793, i3, -1, "com.paypal.oslo.feature.home.ui.HomeSectionHeader (HomeCollectionHeader.kt:72)");
                        }
                        if (str4 == null) {
                            startRestartGroup.startReplaceGroup(2064408071);
                            startRestartGroup.endReplaceGroup();
                            str3 = str4;
                        } else {
                            startRestartGroup.startReplaceGroup(2064408072);
                            final java.util.List<com.paypal.oslo.feature.home.ui.util.StyledTextSegment> parse = com.paypal.oslo.feature.home.ui.util.HtmlTextParser.INSTANCE.parse(str4);
                            com.paypal.pds.core.RichText invoke = com.paypal.pds.core.RichText.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$thSP2LUoPwoCuf_hBDOptaN0cf0(parse, (com.paypal.pds.core.Builder) obj);
                                }
                            });
                            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                            androidx.compose.ui.text.style.TextAlign.Companion companion3 = androidx.compose.ui.text.style.TextAlign.INSTANCE;
                            int m8443getCentere0LSkKk = z7 ? companion3.m8443getCentere0LSkKk() : companion3.m8448getStarte0LSkKk();
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            float spacing4 = com.paypal.pds.core.ConstantsKt.getSpacing4();
                            if (z6) {
                                companion2 = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, spacing4, 0.0f, 0.0f, 13, null);
                            } else {
                                companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            str3 = str4;
                            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, com.paypal.pds.components.ShimmerKt.shimmer(fillMaxWidth$default.then(companion2), z6, com.paypal.pds.components.ShimmerStyle.Text.INSTANCE, startRestartGroup, ((i3 >> 3) & 112) | 384, 0), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk), null, false, 0, 0, null, null, headingMedium, null, startRestartGroup, 0, 48, 6124);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z5 = z6;
                        z4 = z7;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = companion;
                        final java.lang.String str5 = str3;
                        final boolean z8 = z4;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$XtjQ8WdwCq_OXpXWbuVdldmuFLo(androidx.compose.ui.Modifier.this, str5, z5, z8, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0wSOwEPCy920hHBzIsifJ_uUXFU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1560277255);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1560277255, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.SectionHeaderShimmerPreview (HomeCollectionHeader.kt:135)");
            }
            HomeSectionHeader(null, "Title with Description", true, false, startRestartGroup, 432, 9);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$0wSOwEPCy920hHBzIsifJ_uUXFU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8QS5TKGzTCxvVaA4WYDTVAk6Nu0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1122718339);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1122718339, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.SectionHeaderWithStrongPreview (HomeCollectionHeader.kt:111)");
            }
            HomeSectionHeader(null, "Get the <strong>PayPal</strong> Card", false, true, startRestartGroup, 3120, 5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$8QS5TKGzTCxvVaA4WYDTVAk6Nu0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LLxY0akLkVLNUcnmHuaLfJmN65k(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1080801935);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1080801935, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.SectionHeaderPlainTextPreview (HomeCollectionHeader.kt:100)");
            }
            HomeSectionHeader(null, "Plain Title Only", false, false, startRestartGroup, 48, 13);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$LLxY0akLkVLNUcnmHuaLfJmN65k(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XtjQ8WdwCq_OXpXWbuVdldmuFLo(androidx.compose.ui.Modifier modifier, java.lang.String str, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        HomeSectionHeader(modifier, str, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$thSP2LUoPwoCuf_hBDOptaN0cf0(java.util.List list, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.home.ui.util.StyledTextSegment styledTextSegment = (com.paypal.oslo.feature.home.ui.util.StyledTextSegment) it.next();
            if (styledTextSegment instanceof com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Plain) {
                com.paypal.pds.core.Builder.append$default(builder, ((com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Plain) styledTextSegment).getText(), com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
            } else {
                if (!(styledTextSegment instanceof com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Strong)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.pds.core.Builder.append$default(builder, ((com.paypal.oslo.feature.home.ui.util.StyledTextSegment.Strong) styledTextSegment).getText(), com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z_f7ZpONigeWlkHJezr1XzojB4s(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2072995133);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2072995133, updateChangedFlags, -1, "com.paypal.oslo.feature.home.ui.SectionHeaderWithLineBreakPreview (HomeCollectionHeader.kt:123)");
            }
            HomeSectionHeader(null, "Get the<strong>PayPal</strong><br>Credit Card", false, true, startRestartGroup, 3120, 5);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.home.ui.HomeCollectionHeaderKt.$r8$lambda$z_f7ZpONigeWlkHJezr1XzojB4s(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
