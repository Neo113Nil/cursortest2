package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a8\u0010\u0010\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\bH\u0000¨\u0006\u0012"}, d2 = {"LinkableText", "", "text", "", "links", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/InAppCheckoutLink;", "onLinkClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "typography", "Lcom/paypal/pds/core/Typography;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/pds/core/Color;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "handleLinkClick", "linkId", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class LinkableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkableText(final java.lang.String str, final java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink> map, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.pds.core.Typography typography2;
        int i4;
        com.paypal.pds.core.Color color2;
        final com.paypal.pds.core.Typography typography3;
        final com.paypal.pds.core.Color color3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(332484901);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(map) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i5 |= 24576;
            } else if ((i & 24576) == 0) {
                typography2 = typography;
                i5 |= startRestartGroup.changed(typography2) ? 16384 : 8192;
                i4 = i2 & 32;
                if (i4 != 0) {
                    i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    color2 = color;
                    i5 |= startRestartGroup.changed(color2) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        typography3 = typography2;
                        color3 = color2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.pds.core.Typography typography4 = i3 != 0 ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE : typography2;
                        com.paypal.pds.core.Color color4 = i4 != 0 ? com.paypal.pds.core.Color.ContentBase.INSTANCE : color2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(332484901, i5, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.LinkableText (LinkableText.kt:29)");
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                        for (java.util.Map.Entry<java.lang.String, ? extends com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink> entry : map.entrySet()) {
                            arrayList.add(kotlin.TuplesKt.to(entry.getKey(), entry.getValue().name()));
                        }
                        com.paypal.pds.core.RichText richText = com.paypal.pds.core.RichTextKt.toRichText(str, arrayList);
                        boolean changedInstance = startRestartGroup.changedInstance(map);
                        boolean z = (i5 & 896) == 256;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.LinkableTextKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.LinkableTextKt.$r8$lambda$2AuIy90JKJFa2VVzxrB9K5GgB5o(map, function1, (java.lang.String) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                        int i7 = i5 >> 9;
                        com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, companion, color4, null, null, null, false, 0, 0, null, function2, typography4, null, startRestartGroup, ((i5 >> 6) & 112) | (i7 & 896), i7 & 112, 5112);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = companion;
                        typography3 = typography4;
                        color3 = color4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.LinkableTextKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.LinkableTextKt.$r8$lambda$gb_81J6hE70QuyC0161zt5FRavo(str, map, function1, modifier3, typography3, color3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                color2 = color;
                if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            typography2 = typography;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            color2 = color;
            if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        typography2 = typography;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        color2 = color;
        if (startRestartGroup.shouldExecute((74899 & i5) == 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void handleLinkClick(java.util.Map<java.lang.String, ? extends com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink> map, java.lang.String str, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink, kotlin.Unit> function1) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink) obj).name(), str)) {
                    break;
                }
            }
        }
        com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink inAppCheckoutLink = (com.paypal.oslo.feature.inappcheckout.domain.model.InAppCheckoutLink) obj;
        if (inAppCheckoutLink != null) {
            function1.invoke(inAppCheckoutLink);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2AuIy90JKJFa2VVzxrB9K5GgB5o(java.util.Map map, kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        handleLinkClick(map, str2, function1);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gb_81J6hE70QuyC0161zt5FRavo(java.lang.String str, java.util.Map map, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Color color, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        LinkableText(str, map, function1, modifier, typography, color, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
