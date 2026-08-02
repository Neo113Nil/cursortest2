package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aO\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {com.datadog.android.sessionreplay.internal.recorder.resources.DefaultImageWireframeHelper.MASK_ALL_CONTENT_LABEL, "", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "cornerRadius", "Lcom/paypal/pds/components/ImageCornerRadius;", "aspectRatio", "Lcom/paypal/pds/components/ImageAspectRatio;", "tint", "Lcom/paypal/pds/core/Color;", "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/ContentScale;Lcom/paypal/pds/components/ImageCornerRadius;Lcom/paypal/pds/components/ImageAspectRatio;Lcom/paypal/pds/core/Color;Landroidx/compose/runtime/Composer;II)V", "ImageCornerRadiusPreview", "(Lcom/paypal/pds/components/ImageCornerRadius;Landroidx/compose/runtime/Composer;I)V", "ImageAspectRatioPreview", "(Lcom/paypal/pds/components/ImageAspectRatio;Landroidx/compose/runtime/Composer;I)V", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Image(final androidx.compose.ui.graphics.painter.Painter painter, final java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.ContentScale contentScale, com.paypal.pds.components.ImageCornerRadius imageCornerRadius, com.paypal.pds.components.ImageAspectRatio imageAspectRatio, com.paypal.pds.core.Color color, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.layout.ContentScale contentScale2;
        int i5;
        int i6;
        int i7;
        com.paypal.pds.core.Color color2;
        final com.paypal.pds.components.ImageCornerRadius imageCornerRadius2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.layout.ContentScale contentScale3;
        final com.paypal.pds.core.Color color3;
        final com.paypal.pds.components.ImageAspectRatio imageAspectRatio2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.ui.graphics.Color m5986boximpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-493629264);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                contentScale2 = contentScale;
                i3 |= startRestartGroup.changed(contentScale2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(imageCornerRadius == null ? -1 : imageCornerRadius.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                int i9 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        i9 = startRestartGroup.changed(imageAspectRatio == null ? -1 : imageAspectRatio.ordinal()) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        color2 = color;
                        i3 |= startRestartGroup.changed(color2) ? 1048576 : 524288;
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            imageCornerRadius2 = imageCornerRadius;
                            modifier3 = modifier2;
                            contentScale3 = contentScale2;
                            color3 = color2;
                            imageAspectRatio2 = imageAspectRatio;
                        } else {
                            androidx.compose.ui.Modifier modifier4 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            androidx.compose.ui.layout.ContentScale crop = i4 != 0 ? androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop() : contentScale2;
                            com.paypal.pds.components.ImageCornerRadius imageCornerRadius3 = i5 != 0 ? com.paypal.pds.components.ImageCornerRadius.None : imageCornerRadius;
                            com.paypal.pds.components.ImageAspectRatio imageAspectRatio3 = i6 != 0 ? com.paypal.pds.components.ImageAspectRatio.Square : imageAspectRatio;
                            if (i7 != 0) {
                                color2 = com.paypal.pds.core.Color.Unspecified.INSTANCE;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-493629264, i3, -1, "com.paypal.pds.components.Image (Image.kt:99)");
                            }
                            androidx.compose.ui.Modifier aspectRatio$default = androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier4), imageAspectRatio3.getValue(), false, 2, null);
                            androidx.compose.ui.graphics.Shape shape = imageCornerRadius3.getShape();
                            if (shape == null || (companion = androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, shape)) == null) {
                                companion = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            androidx.compose.ui.Modifier then = aspectRatio$default.then(companion);
                            com.paypal.pds.core.Color color4 = color2.getIsSpecified() ? color2 : null;
                            if (color4 == null) {
                                startRestartGroup.startReplaceGroup(259281484);
                                startRestartGroup.endReplaceGroup();
                                m5986boximpl = null;
                            } else {
                                startRestartGroup.startReplaceGroup(-1931298731);
                                long value = color4.getValue(startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                m5986boximpl = androidx.compose.ui.graphics.Color.m5986boximpl(value);
                            }
                            androidx.compose.foundation.ImageKt.Image(painter, str, then, (androidx.compose.ui.Alignment) null, crop, 0.0f, m5986boximpl != null ? androidx.compose.ui.graphics.ColorFilter.Companion.m6037tintxETnrds$default(androidx.compose.ui.graphics.ColorFilter.INSTANCE, m5986boximpl.m6006unboximpl(), 0, 2, null) : null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | (i3 & 14) | (i3 & 112) | ((i3 << 3) & 57344), 40);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            color3 = color2;
                            modifier3 = modifier4;
                            contentScale3 = crop;
                            imageCornerRadius2 = imageCornerRadius3;
                            imageAspectRatio2 = imageAspectRatio3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ImageKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.ImageKt.m21898$r8$lambda$C62BSDIaDPYwYr89bOP_HodpZE(androidx.compose.ui.graphics.painter.Painter.this, str, modifier3, contentScale3, imageCornerRadius2, imageAspectRatio2, color3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    color2 = color;
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i3 |= i9;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                color2 = color;
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            contentScale2 = contentScale;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            int i92 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            if (i6 == 0) {
            }
            i3 |= i92;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            color2 = color;
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        contentScale2 = contentScale;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        int i922 = androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        if (i6 == 0) {
        }
        i3 |= i922;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        color2 = color;
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$C62BSDIaDPY-wYr89bOP_HodpZE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21898$r8$lambda$C62BSDIaDPYwYr89bOP_HodpZE(androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.ui.layout.ContentScale contentScale, com.paypal.pds.components.ImageCornerRadius imageCornerRadius, com.paypal.pds.components.ImageAspectRatio imageAspectRatio, com.paypal.pds.core.Color color, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Image(painter, str, modifier, contentScale, imageCornerRadius, imageAspectRatio, color, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KN0fjxLdZOd3XVN7dZBtz9C0nm4(final com.paypal.pds.components.ImageAspectRatio imageAspectRatio, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(544804464);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(imageAspectRatio.ordinal()) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(544804464, i3, -1, "com.paypal.pds.components.ImageAspectRatioPreview (Image.kt:202)");
            }
            Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0), imageAspectRatio.name(), androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing128(), 0.0f, 2, null), null, null, imageAspectRatio, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 384 | ((i3 << 15) & 458752), 88);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ImageKt.$r8$lambda$KN0fjxLdZOd3XVN7dZBtz9C0nm4(com.paypal.pds.components.ImageAspectRatio.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zTtSikjzUUnaIdiNcC-kT84AUIY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21899$r8$lambda$zTtSikjzUUnaIdiNcCkT84AUIY(final com.paypal.pds.components.ImageCornerRadius imageCornerRadius, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1715058336);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(imageCornerRadius.ordinal()) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1715058336, i3, -1, "com.paypal.pds.components.ImageCornerRadiusPreview (Image.kt:183)");
            }
            Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.pds.utils.DebugResources.INSTANCE.getInstance().image128x128(), startRestartGroup, 0), imageCornerRadius.name(), androidx.compose.foundation.layout.SizeKt.m1725defaultMinSizeVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing128(), 0.0f, 2, null), null, imageCornerRadius, null, null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 384 | ((i3 << 12) & 57344), 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ImageKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ImageKt.m21899$r8$lambda$zTtSikjzUUnaIdiNcCkT84AUIY(com.paypal.pds.components.ImageCornerRadius.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
