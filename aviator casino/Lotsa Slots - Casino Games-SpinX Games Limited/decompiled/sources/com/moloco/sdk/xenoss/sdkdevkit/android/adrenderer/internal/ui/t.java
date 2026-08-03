package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

/* loaded from: classes5.dex */
public final class t {
    public static final kotlin.Unit a(androidx.compose.ui.graphics.painter.Painter painter, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, long j, long j2, long j3, androidx.compose.ui.graphics.Shape shape, long j4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(painter, function0, modifier, z, str, j, j2, j3, shape, j4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit a(int i, androidx.compose.runtime.Composer composer, int i2) {
        a(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final androidx.compose.ui.graphics.painter.Painter painter, final kotlin.jvm.functions.Function0<kotlin.Unit> onClick, androidx.compose.ui.Modifier modifier, boolean z, java.lang.String str, long j, long j2, long j3, androidx.compose.ui.graphics.Shape shape, long j4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        androidx.compose.ui.Modifier modifier3;
        boolean z3;
        java.lang.String str2;
        long j6;
        long j7;
        int i9;
        long j8;
        long j9;
        androidx.compose.ui.graphics.Shape shape2;
        long j10;
        long j11;
        java.lang.Object rememberedValue;
        int currentCompositeKeyHash;
        long j12;
        androidx.compose.runtime.Composer m1641constructorimpl;
        long j13;
        final long j14;
        final androidx.compose.ui.graphics.Shape shape3;
        final boolean z4;
        final java.lang.String str3;
        final long j15;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i10;
        int i11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "painter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2002285559);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(str) ? 16384 : 8192;
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0 && startRestartGroup.changed(j)) {
                            i11 = 131072;
                            i3 |= i11;
                        }
                        i11 = 65536;
                        i3 |= i11;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(j3)) {
                            i10 = 8388608;
                            i3 |= i10;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((100663296 & i) == 0) {
                        i3 |= startRestartGroup.changed(shape) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i8 = i2 & 512;
                        if (i8 != 0) {
                            i3 |= 805306368;
                            j5 = j4;
                        } else {
                            j5 = j4;
                            if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changed(j5) ? 536870912 : 268435456;
                            }
                        }
                        if ((306783379 & i3) != 306783378 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            str3 = str;
                            j12 = j2;
                            shape3 = shape;
                            z4 = z2;
                            j14 = j5;
                            j13 = j;
                            j15 = j3;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                j10 = j2;
                                i9 = i3;
                                modifier3 = modifier2;
                                z3 = z2;
                                j8 = j5;
                                str2 = str;
                                j6 = j;
                                j9 = j3;
                                shape2 = shape;
                            } else {
                                modifier3 = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                z3 = i4 != 0 ? true : z2;
                                str2 = i5 != 0 ? null : str;
                                if ((i2 & 32) != 0) {
                                    j6 = androidx.compose.material.MaterialTheme.INSTANCE.getColors(startRestartGroup, androidx.compose.material.MaterialTheme.$stable).m1315getPrimary0d7_KjU();
                                    i3 &= -458753;
                                } else {
                                    j6 = j;
                                }
                                long b = i6 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j2;
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                    j7 = b;
                                } else {
                                    j7 = j3;
                                }
                                androidx.compose.ui.graphics.Shape f = i7 != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : shape;
                                if (i8 != 0) {
                                    i9 = i3;
                                    j8 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e();
                                } else {
                                    i9 = i3;
                                    j8 = j5;
                                }
                                j9 = j7;
                                shape2 = f;
                                j10 = b;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                j11 = j6;
                                androidx.compose.runtime.ComposerKt.traceEventStart(-2002285559, i9, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GenericIconButton (GenericIconButton.kt:46)");
                            } else {
                                j11 = j6;
                            }
                            androidx.compose.ui.Modifier m212backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                            androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                            startRestartGroup.startReplaceableGroup(-1646978394);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = androidx.compose.foundation.interaction.InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            androidx.compose.ui.Modifier m243clickableO2vRcR0 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m212backgroundbw27NRU$default, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo, z3, str2, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                            startRestartGroup.startReplaceableGroup(733328855);
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                            startRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                            j12 = j10;
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion.getConstructor();
                            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR0);
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                            startRestartGroup.startReplaceableGroup(2058660585);
                            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.material.IconKt.m1412Iconww6aTOc(painter, str2, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endNode();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            j13 = j11;
                            j14 = j8;
                            shape3 = shape2;
                            z4 = z3;
                            str3 = str2;
                            j15 = j9;
                            modifier2 = modifier3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier4 = modifier2;
                            final long j16 = j13;
                            final long j17 = j12;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(androidx.compose.ui.graphics.painter.Painter.this, onClick, modifier4, z4, str3, j16, j17, j15, shape3, j14, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i2 & 512;
                    if (i8 != 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    j9 = j7;
                    shape2 = f;
                    j10 = b;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.ui.Modifier m212backgroundbw27NRU$default2 = androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                    androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo2 = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                    startRestartGroup.startReplaceableGroup(-1646978394);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    androidx.compose.ui.Modifier m243clickableO2vRcR02 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m212backgroundbw27NRU$default2, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo2, z3, str2, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                    androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                    startRestartGroup.startReplaceableGroup(733328855);
                    androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                    startRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                    j12 = j10;
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = companion2.getConstructor();
                    kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR02);
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!m1641constructorimpl.getInserting()) {
                    }
                    m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                    startRestartGroup.startReplaceableGroup(2058660585);
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.material.IconKt.m1412Iconww6aTOc(painter, str2, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    j13 = j11;
                    j14 = j8;
                    shape3 = shape2;
                    z4 = z3;
                    str3 = str2;
                    j15 = j9;
                    modifier2 = modifier3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((196608 & i) == 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                j9 = j7;
                shape2 = f;
                j10 = b;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.ui.Modifier m212backgroundbw27NRU$default22 = androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
                androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo22 = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
                startRestartGroup.startReplaceableGroup(-1646978394);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier m243clickableO2vRcR022 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m212backgroundbw27NRU$default22, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo22, z3, str2, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
                androidx.compose.ui.Alignment center22 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.node.ComposeUiNode.Companion companion22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
                j12 = j10;
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = companion22.getConstructor();
                kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR022);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                }
                m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash22 = companion22.getSetCompositeKeyHash();
                if (!m1641constructorimpl.getInserting()) {
                }
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                androidx.compose.material.IconKt.m1412Iconww6aTOc(painter, str2, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                j13 = j11;
                j14 = j8;
                shape3 = shape2;
                z4 = z3;
                str3 = str2;
                j15 = j9;
                modifier2 = modifier3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((196608 & i) == 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            i8 = i2 & 512;
            if (i8 != 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            j9 = j7;
            shape2 = f;
            j10 = b;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.ui.Modifier m212backgroundbw27NRU$default222 = androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
            androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo222 = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
            startRestartGroup.startReplaceableGroup(-1646978394);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier m243clickableO2vRcR0222 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m212backgroundbw27NRU$default222, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo222, z3, str2, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
            androidx.compose.ui.Alignment center222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            j12 = j10;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor222 = companion222.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR0222);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy222, companion222.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap222, companion222.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash222 = companion222.getSetCompositeKeyHash();
            if (!m1641constructorimpl.getInserting()) {
            }
            m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
            modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material.IconKt.m1412Iconww6aTOc(painter, str2, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            j13 = j11;
            j14 = j8;
            shape3 = shape2;
            z4 = z3;
            str3 = str2;
            j15 = j9;
            modifier2 = modifier3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((196608 & i) == 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i2 & 512;
        if (i8 != 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        j9 = j7;
        shape2 = f;
        j10 = b;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.ui.Modifier m212backgroundbw27NRU$default2222 = androidx.compose.foundation.BackgroundKt.m212backgroundbw27NRU$default(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(modifier3, j10), shape2), j8, null, 2, null);
        androidx.compose.foundation.Indication m1601rememberRipple9IZ8Weo2222 = androidx.compose.material.ripple.RippleKt.m1601rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6);
        startRestartGroup.startReplaceableGroup(-1646978394);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier m243clickableO2vRcR02222 = androidx.compose.foundation.ClickableKt.m243clickableO2vRcR0(m212backgroundbw27NRU$default2222, (androidx.compose.foundation.interaction.MutableInteractionSource) rememberedValue, m1601rememberRipple9IZ8Weo2222, z3, str2, androidx.compose.ui.semantics.Role.m3785boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m3792getButtono7Vup1c()), onClick);
        androidx.compose.ui.Alignment center2222 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
        androidx.compose.ui.node.ComposeUiNode.Companion companion2222 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
        j12 = j10;
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2222 = companion2222.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf2222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(m243clickableO2vRcR02222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy2222, companion2222.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap2222, companion2222.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2222 = companion2222.getSetCompositeKeyHash();
        if (!m1641constructorimpl.getInserting()) {
        }
        m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
        modifierMaterializerOf2222.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.material.IconKt.m1412Iconww6aTOc(painter, str2, androidx.compose.foundation.layout.SizeKt.m618size6HolHcs(androidx.compose.ui.Modifier.INSTANCE, j9), j11, startRestartGroup, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 >> 6) & 7168), 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        j13 = j11;
        j14 = j8;
        shape3 = shape2;
        z4 = z3;
        str3 = str2;
        j15 = j9;
        modifier2 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void a(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1484935213);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1484935213, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.Preview (GenericIconButton.kt:73)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.c.a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n.f7642a.a(), startRestartGroup, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }
}
