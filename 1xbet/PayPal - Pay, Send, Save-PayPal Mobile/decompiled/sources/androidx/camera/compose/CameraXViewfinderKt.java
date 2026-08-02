package androidx.camera.compose;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u00020\u0010*\u0004\u0018\u00010\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0015X\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002"}, d2 = {"CameraXViewfinder", "", "surfaceRequest", "Landroidx/camera/core/SurfaceRequest;", "modifier", "Landroidx/compose/ui/Modifier;", "implementationMode", "Landroidx/camera/viewfinder/core/ImplementationMode;", "coordinateTransformer", "Landroidx/camera/viewfinder/compose/MutableCoordinateTransformer;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "(Landroidx/camera/core/SurfaceRequest;Landroidx/compose/ui/Modifier;Landroidx/camera/viewfinder/core/ImplementationMode;Landroidx/camera/viewfinder/compose/MutableCoordinateTransformer;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;II)V", "canSupport", "", "Landroidx/camera/compose/SurfaceRequestScope;", "camera-compose", "currentImplementationMode", "viewfinderArgs", "Landroidx/camera/compose/ViewfinderArgs;", "currentArgs", "surfaceRequestScope"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraXViewfinderKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CameraXViewfinder(final androidx.camera.core.SurfaceRequest surfaceRequest, androidx.compose.ui.Modifier modifier, androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer2;
        int i5;
        androidx.compose.ui.Alignment alignment2;
        int i6;
        androidx.compose.ui.layout.ContentScale contentScale2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.camera.viewfinder.core.ImplementationMode implementationMode2;
        androidx.compose.ui.Alignment alignment3;
        androidx.compose.ui.layout.ContentScale contentScale3;
        boolean changedInstance;
        boolean changed;
        java.lang.Object rememberedValue;
        androidx.camera.compose.ViewfinderArgs viewfinderArgs;
        final androidx.camera.viewfinder.core.ImplementationMode implementationMode3;
        final androidx.compose.ui.Alignment alignment4;
        final androidx.compose.ui.layout.ContentScale contentScale4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1071821681);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(surfaceRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    if (startRestartGroup.changed(implementationMode == null ? -1 : implementationMode.ordinal())) {
                        i7 = 256;
                        i3 |= i7;
                    }
                }
                i7 = 128;
                i3 |= i7;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                mutableCoordinateTransformer2 = mutableCoordinateTransformer;
                i3 |= startRestartGroup.changedInstance(mutableCoordinateTransformer2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        contentScale2 = contentScale;
                        i3 |= startRestartGroup.changed(contentScale2) ? 131072 : 65536;
                        if ((74899 & i3) != 74898 && startRestartGroup.getSkipping()) {
                            startRestartGroup.skipToGroupEnd();
                            implementationMode3 = implementationMode;
                            companion = modifier2;
                            alignment4 = alignment2;
                            contentScale4 = contentScale2;
                        } else {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                companion = modifier2;
                                alignment3 = alignment2;
                                contentScale3 = contentScale2;
                                implementationMode2 = implementationMode;
                            } else {
                                companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                if ((i2 & 4) != 0) {
                                    implementationMode2 = androidx.camera.compose.CameraImplementationModeCompat.INSTANCE.chooseCompatibleMode(surfaceRequest.getCamera().getCameraInfo());
                                    i3 &= -897;
                                } else {
                                    implementationMode2 = implementationMode;
                                }
                                if (i4 != 0) {
                                    mutableCoordinateTransformer2 = null;
                                }
                                if (i5 != 0) {
                                    alignment2 = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                                }
                                if (i6 != 0) {
                                    contentScale3 = androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop();
                                    alignment3 = alignment2;
                                } else {
                                    alignment3 = alignment2;
                                    contentScale3 = contentScale2;
                                }
                            }
                            androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer3 = mutableCoordinateTransformer2;
                            int i9 = i3;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1071821681, i9, -1, "androidx.camera.compose.CameraXViewfinder (CameraXViewfinder.kt:102)");
                            }
                            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(implementationMode2, startRestartGroup, (i9 >> 6) & 14);
                            changedInstance = startRestartGroup.changedInstance(surfaceRequest);
                            changed = startRestartGroup.changed(rememberUpdatedState);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!(changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(surfaceRequest, rememberUpdatedState, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) null, surfaceRequest, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, ((i9 << 3) & 112) | 6).getValue();
                            if (viewfinderArgs == null) {
                                startRestartGroup.startReplaceGroup(-1848994217);
                            } else {
                                startRestartGroup.startReplaceGroup(-1848994216);
                                androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(viewfinderArgs, startRestartGroup, 0);
                                boolean changed2 = startRestartGroup.changed(rememberUpdatedState2);
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$surfaceRequestScope$2$1(rememberUpdatedState2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final androidx.camera.compose.SurfaceRequestScope surfaceRequestScope = (androidx.camera.compose.SurfaceRequestScope) androidx.compose.runtime.SnapshotStateKt.produceState(null, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 6).getValue();
                                if (surfaceRequestScope == null) {
                                    startRestartGroup.startReplaceGroup(1261255935);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    startRestartGroup.startReplaceGroup(1261255936);
                                    boolean changed3 = startRestartGroup.changed(surfaceRequestScope);
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.compose.CameraXViewfinderKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return androidx.camera.compose.CameraXViewfinderKt.$r8$lambda$MHd6DBshxyvQt3Cs877KFYHxYpA(androidx.camera.compose.SurfaceRequestScope.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    androidx.compose.runtime.EffectsKt.DisposableEffect(surfaceRequestScope, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
                                    androidx.camera.viewfinder.core.ViewfinderSurfaceRequest camera2StreamConfigurationMap = surfaceRequestScope.getCamera2StreamConfigurationMap();
                                    androidx.camera.viewfinder.core.TransformationInfo getHighSpeedVideoFpsRangesFor = viewfinderArgs.getGetHighSpeedVideoFpsRangesFor();
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                                    boolean changed4 = startRestartGroup.changed(surfaceRequestScope);
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.camera.compose.CameraXViewfinderKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return androidx.camera.compose.CameraXViewfinderKt.$r8$lambda$qLcBsy4wJKSfrEcm1IjpauPnZno(androidx.camera.compose.SurfaceRequestScope.this, (androidx.camera.viewfinder.compose.ViewfinderInitScope) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    androidx.camera.viewfinder.compose.ViewfinderKt.Viewfinder(camera2StreamConfigurationMap, fillMaxSize$default, getHighSpeedVideoFpsRangesFor, mutableCoordinateTransformer3, alignment3, contentScale3, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, i9 & 523264, 0);
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                }
                            }
                            startRestartGroup.endReplaceGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            mutableCoordinateTransformer2 = mutableCoordinateTransformer3;
                            implementationMode3 = implementationMode2;
                            alignment4 = alignment3;
                            contentScale4 = contentScale3;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer4 = mutableCoordinateTransformer2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.camera.compose.CameraXViewfinderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.camera.compose.CameraXViewfinderKt.m1005$r8$lambda$09laHMUOHVwrzedO54AsxJUh0(androidx.camera.core.SurfaceRequest.this, modifier3, implementationMode3, mutableCoordinateTransformer4, alignment4, contentScale4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    contentScale2 = contentScale;
                    if ((74899 & i3) != 74898) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    if (i8 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer32 = mutableCoordinateTransformer2;
                    int i92 = i3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(implementationMode2, startRestartGroup, (i92 >> 6) & 14);
                    changedInstance = startRestartGroup.changedInstance(surfaceRequest);
                    changed = startRestartGroup.changed(rememberUpdatedState3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(changedInstance | changed)) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(surfaceRequest, rememberUpdatedState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) null, surfaceRequest, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, ((i92 << 3) & 112) | 6).getValue();
                    if (viewfinderArgs == null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    mutableCoordinateTransformer2 = mutableCoordinateTransformer32;
                    implementationMode3 = implementationMode2;
                    alignment4 = alignment3;
                    contentScale4 = contentScale3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                contentScale2 = contentScale;
                if ((74899 & i3) != 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                if (i8 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer322 = mutableCoordinateTransformer2;
                int i922 = i3;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State rememberUpdatedState32 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(implementationMode2, startRestartGroup, (i922 >> 6) & 14);
                changedInstance = startRestartGroup.changedInstance(surfaceRequest);
                changed = startRestartGroup.changed(rememberUpdatedState32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changedInstance | changed)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(surfaceRequest, rememberUpdatedState32, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) null, surfaceRequest, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, ((i922 << 3) & 112) | 6).getValue();
                if (viewfinderArgs == null) {
                }
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                mutableCoordinateTransformer2 = mutableCoordinateTransformer322;
                implementationMode3 = implementationMode2;
                alignment4 = alignment3;
                contentScale4 = contentScale3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            mutableCoordinateTransformer2 = mutableCoordinateTransformer;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            contentScale2 = contentScale;
            if ((74899 & i3) != 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer3222 = mutableCoordinateTransformer2;
            int i9222 = i3;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State rememberUpdatedState322 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(implementationMode2, startRestartGroup, (i9222 >> 6) & 14);
            changedInstance = startRestartGroup.changedInstance(surfaceRequest);
            changed = startRestartGroup.changed(rememberUpdatedState322);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(changedInstance | changed)) {
            }
            rememberedValue = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(surfaceRequest, rememberUpdatedState322, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) null, surfaceRequest, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, ((i9222 << 3) & 112) | 6).getValue();
            if (viewfinderArgs == null) {
            }
            startRestartGroup.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            mutableCoordinateTransformer2 = mutableCoordinateTransformer3222;
            implementationMode3 = implementationMode2;
            alignment4 = alignment3;
            contentScale4 = contentScale3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        mutableCoordinateTransformer2 = mutableCoordinateTransformer;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        contentScale2 = contentScale;
        if ((74899 & i3) != 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer32222 = mutableCoordinateTransformer2;
        int i92222 = i3;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.runtime.State rememberUpdatedState3222 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(implementationMode2, startRestartGroup, (i92222 >> 6) & 14);
        changedInstance = startRestartGroup.changedInstance(surfaceRequest);
        changed = startRestartGroup.changed(rememberUpdatedState3222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!(changedInstance | changed)) {
        }
        rememberedValue = (kotlin.jvm.functions.Function2) new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1(surfaceRequest, rememberUpdatedState3222, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        viewfinderArgs = (androidx.camera.compose.ViewfinderArgs) androidx.compose.runtime.SnapshotStateKt.produceState((java.lang.Object) null, surfaceRequest, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.Object>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, ((i92222 << 3) & 112) | 6).getValue();
        if (viewfinderArgs == null) {
        }
        startRestartGroup.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        mutableCoordinateTransformer2 = mutableCoordinateTransformer32222;
        implementationMode3 = implementationMode2;
        alignment4 = alignment3;
        contentScale4 = contentScale3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$09laHM-UOHVwrzedO54AsxJUh-0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1005$r8$lambda$09laHMUOHVwrzedO54AsxJUh0(androidx.camera.core.SurfaceRequest surfaceRequest, androidx.compose.ui.Modifier modifier, androidx.camera.viewfinder.core.ImplementationMode implementationMode, androidx.camera.viewfinder.compose.MutableCoordinateTransformer mutableCoordinateTransformer, androidx.compose.ui.Alignment alignment, androidx.compose.ui.layout.ContentScale contentScale, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CameraXViewfinder(surfaceRequest, modifier, implementationMode, mutableCoordinateTransformer, alignment, contentScale, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$MHd6DBshxyvQt3Cs877KFYHxYpA(final androidx.camera.compose.SurfaceRequestScope surfaceRequestScope, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$lambda$3$3$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(androidx.camera.compose.SurfaceRequestScope.this.getHighSpeedVideoFpsRangesFor, null, 1, null);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qLcBsy4wJKSfrEcm1IjpauPnZno(androidx.camera.compose.SurfaceRequestScope surfaceRequestScope, androidx.camera.viewfinder.compose.ViewfinderInitScope viewfinderInitScope) {
        viewfinderInitScope.onSurfaceSession(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$1$1$2$1$1(surfaceRequestScope, null));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ androidx.camera.viewfinder.core.ImplementationMode access$CameraXViewfinder$lambda$0(androidx.compose.runtime.State state) {
        return (androidx.camera.viewfinder.core.ImplementationMode) state.getValue();
    }

    public static final /* synthetic */ androidx.camera.compose.ViewfinderArgs access$CameraXViewfinder$lambda$3$0(androidx.compose.runtime.State state) {
        return (androidx.camera.compose.ViewfinderArgs) state.getValue();
    }

    public static final /* synthetic */ boolean access$canSupport(androidx.camera.compose.SurfaceRequestScope surfaceRequestScope, androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.viewfinder.core.ImplementationMode implementationMode) {
        return surfaceRequestScope != null && surfaceRequestScope.Camera2StreamConfigurationMap.getWidth() == surfaceRequest.getResolution().getWidth() && surfaceRequestScope.Camera2StreamConfigurationMap.getHeight() == surfaceRequest.getResolution().getHeight() && surfaceRequestScope.Camera2StreamConfigurationMap.getImplementationMode() == implementationMode;
    }
}
