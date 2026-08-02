package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Icon", "", "icon", "Lcom/paypal/pds/core/Icon;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/IconSize;", "tint", "Lcom/paypal/pds/core/Color;", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/IconSize;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "IconSizePreview", "iconSize", "(Lcom/paypal/pds/components/IconSize;Landroidx/compose/runtime/Composer;I)V", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IconKt {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Icon(final com.paypal.pds.core.Icon icon, final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.IconSize iconSize2;
        int i5;
        com.paypal.pds.core.Color color2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.pds.core.Color color3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.graphics.Color m5986boximpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1906220727);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                iconSize2 = iconSize;
                i3 |= startRestartGroup.changed(iconSize2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    color2 = color;
                    i3 |= startRestartGroup.changed(color2) ? 16384 : 8192;
                    if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        color3 = color2;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        com.paypal.pds.components.IconSize iconSize3 = i4 != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : iconSize2;
                        com.paypal.pds.core.Color color4 = i5 != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : color2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1906220727, i3, -1, "com.paypal.pds.components.Icon (Icon.kt:70)");
                        }
                        androidx.compose.ui.graphics.painter.Painter painter = com.paypal.pds.core.IconKt.painter(icon, startRestartGroup, i3 & 14);
                        androidx.compose.ui.Modifier m1740size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(companion), iconSize3.getValue());
                        com.paypal.pds.core.Color color5 = color4.getIsSpecified() ? color4 : null;
                        if (color5 == null) {
                            startRestartGroup.startReplaceGroup(-163703309);
                            startRestartGroup.endReplaceGroup();
                            m5986boximpl = null;
                        } else {
                            startRestartGroup.startReplaceGroup(2072929230);
                            long value = color5.getValue(startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                            m5986boximpl = androidx.compose.ui.graphics.Color.m5986boximpl(value);
                        }
                        androidx.compose.foundation.ImageKt.Image(painter, str, m1740size3ABfNKs, (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, m5986boximpl != null ? androidx.compose.ui.graphics.ColorFilter.Companion.m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, m5986boximpl.m6006unboximpl(), 0, 2, null) : null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | (i3 & 112), 56);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = companion;
                        iconSize2 = iconSize3;
                        color3 = color4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final com.paypal.pds.components.IconSize iconSize4 = iconSize2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.pds.components.IconKt.$r8$lambda$Q5e3XfP3hTNeZLygqJYQjvF1nuA(com.paypal.pds.core.Icon.this, str, modifier3, iconSize4, color3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                color2 = color;
                if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            iconSize2 = iconSize;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            color2 = color;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        iconSize2 = iconSize;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        color2 = color;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q5e3XfP3hTNeZLygqJYQjvF1nuA(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.IconSize iconSize, com.paypal.pds.core.Color color, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Icon(icon, str, modifier, iconSize, color, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$R4Nl-3h9vfhqLtNjX3Ob48U3tw4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21896$r8$lambda$R4Nl3h9vfhqLtNjX3Ob48U3tw4(final com.paypal.pds.components.IconSize iconSize, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-69117778);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(iconSize) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-69117778, i3, -1, "com.paypal.pds.components.IconSizePreview (Icon.kt:123)");
            }
            Icon(com.paypal.pds.core.Icon.DefaultIcon.INSTANCE, null, null, iconSize, kotlin.jvm.internal.Intrinsics.areEqual(iconSize, com.paypal.pds.components.IconSize.Medium.INSTANCE) ? com.paypal.pds.core.Color.BorderBase.INSTANCE : com.paypal.pds.core.Color.Unspecified.INSTANCE, startRestartGroup, ((i3 << 9) & 7168) | 54, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.IconKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.IconKt.m21896$r8$lambda$R4Nl3h9vfhqLtNjX3Ob48U3tw4(com.paypal.pds.components.IconSize.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
