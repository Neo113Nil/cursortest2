package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u00020\u00182\b\b\u0001\u0010#\u001a\u00020$H\u0003¢\u0006\u0002\u0010%\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"/\u0010\t\u001a\u00020\u0002*\u00020\n2\u0006\u0010\b\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010*\u0004\b\u000b\u0010\f\"/\u0010\u0011\u001a\u00020\u0006*\u00020\n2\u0006\u0010\b\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016*\u0004\b\u0012\u0010\f¨\u0006&"}, d2 = {"PaymentCardModeKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lcom/paypal/pds/components/PaymentCardMode;", "getPaymentCardModeKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "PaymentCardCornerRadiusKey", "Lcom/paypal/pds/components/PaymentCardCornerRadius;", "getPaymentCardCornerRadiusKey", "<set-?>", "paymentCardMode", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getPaymentCardMode$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getPaymentCardMode", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/paypal/pds/components/PaymentCardMode;", "setPaymentCardMode", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/paypal/pds/components/PaymentCardMode;)V", "paymentCardCornerRadius", "getPaymentCardCornerRadius$delegate", "getPaymentCardCornerRadius", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/paypal/pds/components/PaymentCardCornerRadius;", "setPaymentCardCornerRadius", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Lcom/paypal/pds/components/PaymentCardCornerRadius;)V", "PaymentCard", "", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "mode", "cornerRadius", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/PaymentCardMode;Lcom/paypal/pds/components/PaymentCardCornerRadius;Landroidx/compose/runtime/Composer;II)V", "PaymentCardPreview", "parameter", "Lcom/paypal/pds/components/PaymentCardPreviewParameter;", "(Lcom/paypal/pds/components/PaymentCardPreviewParameter;Landroidx/compose/runtime/Composer;I)V", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PaymentCardKt {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.paypal.pds.components.PaymentCardKt.class, "paymentCardMode", "getPaymentCardMode(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/paypal/pds/components/PaymentCardMode;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.paypal.pds.components.PaymentCardKt.class, "paymentCardCornerRadius", "getPaymentCardCornerRadius(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Lcom/paypal/pds/components/PaymentCardCornerRadius;", 1))};
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.PaymentCardMode> getHighSpeedVideoFpsRanges = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PaymentCardMode", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    private static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.PaymentCardCornerRadius> Camera2StreamConfigurationMap = new androidx.compose.ui.semantics.SemanticsPropertyKey<>("PaymentCardCornerRadius", (kotlin.jvm.functions.Function2) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null);

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.PaymentCardMode> getPaymentCardModeKey() {
        return getHighSpeedVideoFpsRanges;
    }

    public static final androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.PaymentCardCornerRadius> getPaymentCardCornerRadiusKey() {
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentCard(final androidx.compose.ui.graphics.painter.Painter painter, final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.PaymentCardMode paymentCardMode, com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6;
        final com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.pds.components.PaymentCardMode paymentCardMode2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius3;
        androidx.compose.ui.Modifier.Companion m1742sizeVpY3zN4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1493293284);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(paymentCardMode == null ? -1 : paymentCardMode.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(paymentCardCornerRadius == null ? -1 : paymentCardCornerRadius.ordinal()) ? 16384 : 8192;
            }
            i6 = i3;
            if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
                startRestartGroup.skipToGroupEnd();
                paymentCardCornerRadius2 = paymentCardCornerRadius;
                modifier3 = modifier2;
                paymentCardMode2 = paymentCardMode;
            } else {
                androidx.compose.ui.Modifier modifier4 = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                com.paypal.pds.components.PaymentCardMode paymentCardMode3 = i4 != 0 ? com.paypal.pds.components.PaymentCardMode.Display : paymentCardMode;
                com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius4 = i5 != 0 ? com.paypal.pds.components.PaymentCardCornerRadius.Radius24 : paymentCardCornerRadius;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1493293284, i6, -1, "com.paypal.pds.components.PaymentCard (PaymentCard.kt:116)");
                }
                int i8 = com.paypal.pds.components.PaymentCardKt.WhenMappings.$EnumSwitchMapping$0[paymentCardMode3.ordinal()];
                if (i8 == 1) {
                    paymentCardCornerRadius3 = com.paypal.pds.components.PaymentCardCornerRadius.Radius4;
                } else {
                    if (i8 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    paymentCardCornerRadius3 = paymentCardCornerRadius4;
                }
                int i9 = com.paypal.pds.components.PaymentCardKt.WhenMappings.$EnumSwitchMapping$0[paymentCardMode3.ordinal()];
                if (i9 == 1) {
                    m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize32());
                } else {
                    if (i9 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    m1742sizeVpY3zN4 = androidx.compose.ui.Modifier.INSTANCE;
                }
                final com.paypal.pds.components.PaymentCardMode paymentCardMode4 = paymentCardMode3;
                androidx.compose.ui.Modifier m22099borderDzVHIIc = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(m1742sizeVpY3zN4.then(modifier4)), paymentCardCornerRadius3.getShape()), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderMuted.INSTANCE, paymentCardCornerRadius3.getShape(), startRestartGroup, 432, 0);
                boolean z = (i6 & 7168) == 2048;
                boolean changed = startRestartGroup.changed(paymentCardCornerRadius3.ordinal());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.PaymentCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.pds.components.PaymentCardKt.$r8$lambda$6bFpbXkmj192KDcQ1dIFSLsIsrw(com.paypal.pds.components.PaymentCardMode.this, paymentCardCornerRadius3, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.foundation.ImageKt.Image(painter, str, androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m22099borderDzVHIIc, true, (kotlin.jvm.functions.Function1) rememberedValue), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getFillBounds(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 24576 | (i6 & 14) | (i6 & 112), 104);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                paymentCardMode2 = paymentCardMode4;
                paymentCardCornerRadius2 = paymentCardCornerRadius4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PaymentCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.pds.components.PaymentCardKt.$r8$lambda$_MEjSqvf9u5FS2ppRBbs70Kczdk(androidx.compose.ui.graphics.painter.Painter.this, str, modifier3, paymentCardMode2, paymentCardCornerRadius2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 9363) == 9362, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6bFpbXkmj192KDcQ1dIFSLsIsrw(com.paypal.pds.components.PaymentCardMode paymentCardMode, com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertyKey<com.paypal.pds.components.PaymentCardMode> semanticsPropertyKey = getHighSpeedVideoFpsRanges;
        kotlin.reflect.KProperty<?>[] kPropertyArr = getHighSpeedVideoSizes;
        semanticsPropertyKey.setValue(semanticsPropertyReceiver, kPropertyArr[0], paymentCardMode);
        Camera2StreamConfigurationMap.setValue(semanticsPropertyReceiver, kPropertyArr[1], paymentCardCornerRadius);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_MEjSqvf9u5FS2ppRBbs70Kczdk(androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.PaymentCardMode paymentCardMode, com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PaymentCard(painter, str, modifier, paymentCardMode, paymentCardCornerRadius, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zbb8zKcHUzv04wOMsXzpNnhPCTg(final com.paypal.pds.components.PaymentCardPreviewParameter paymentCardPreviewParameter, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.Modifier.Companion companion2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1803818660);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentCardPreviewParameter) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1803818660, i3, -1, "com.paypal.pds.components.PaymentCardPreview (PaymentCard.kt:221)");
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0);
            java.lang.String str = paymentCardPreviewParameter.getHighSpeedVideoFpsRangesFor;
            com.paypal.pds.components.PaymentCardMode paymentCardMode = paymentCardPreviewParameter.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.pds.components.PaymentCardCornerRadius paymentCardCornerRadius = paymentCardPreviewParameter.getHighSpeedVideoFpsRanges;
            if (paymentCardPreviewParameter.getHighResolutionOutputSizeshNQ4ISI == com.paypal.pds.components.PaymentCardMode.Display) {
                companion = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(370.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(246.0f));
            } else {
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (paymentCardPreviewParameter.Camera2StreamConfigurationMap) {
                startRestartGroup.startReplaceGroup(-1068527480);
                companion2 = com.paypal.pds.core.ModifierExtensionsKt.elevationLevel3(androidx.compose.ui.Modifier.INSTANCE, paymentCardPreviewParameter.getHighSpeedVideoFpsRanges.getShape(), startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1068437642);
                startRestartGroup.endReplaceGroup();
                companion2 = androidx.compose.ui.Modifier.INSTANCE;
            }
            PaymentCard(painterResource, str, companion.then(companion2), paymentCardMode, paymentCardCornerRadius, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.PaymentCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.PaymentCardKt.$r8$lambda$zbb8zKcHUzv04wOMsXzpNnhPCTg(com.paypal.pds.components.PaymentCardPreviewParameter.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.pds.components.PaymentCardMode.values().length];
            try {
                iArr[com.paypal.pds.components.PaymentCardMode.Thumbnail.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.pds.components.PaymentCardMode.Display.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
