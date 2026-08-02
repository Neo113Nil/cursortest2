package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"TileOverlay", "", "tileProvider", "Lcom/google/android/gms/maps/model/TileProvider;", "fadeIn", "", "transparency", "", "visible", "zIndex", "onClick", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/TileOverlay;", "(Lcom/google/android/gms/maps/model/TileProvider;ZFZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "state", "Lcom/google/maps/android/compose/TileOverlayState;", "(Lcom/google/android/gms/maps/model/TileProvider;Lcom/google/maps/android/compose/TileOverlayState;ZFZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberTileOverlayState", "(Landroidx/compose/runtime/Composer;I)Lcom/google/maps/android/compose/TileOverlayState;", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TileOverlayKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$0$0(com.google.android.gms.maps.model.TileOverlay tileOverlay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlay, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0045  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "For compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void TileOverlay(final com.google.android.gms.maps.model.TileProvider tileProvider, boolean z, float f, boolean z2, float f2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f3;
        int i5;
        boolean z3;
        int i6;
        float f4;
        int i7;
        kotlin.jvm.functions.Function1 function12;
        final boolean z4;
        final float f5;
        final boolean z5;
        final float f6;
        final kotlin.jvm.functions.Function1 function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileProvider, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1712508128);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(tileProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z3 = z2;
                    i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        f4 = f2;
                        i3 |= startRestartGroup.changed(f4) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function12 = function1;
                            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                z4 = z;
                                f5 = f3;
                                z5 = z3;
                                f6 = f4;
                                function13 = function12;
                            } else {
                                boolean z6 = i8 != 0 ? true : z;
                                float f7 = i4 != 0 ? 0.0f : f3;
                                boolean z7 = i5 == 0 ? z3 : true;
                                float f8 = i6 != 0 ? 0.0f : f4;
                                if (i7 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                kotlin.Unit TileOverlay$lambda$0$0;
                                                TileOverlay$lambda$0$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$0$0((com.google.android.gms.maps.model.TileOverlay) obj);
                                                return TileOverlay$lambda$0$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1712508128, i3, -1, "com.google.maps.android.compose.TileOverlay (TileOverlay.kt:51)");
                                }
                                int i9 = i3 << 3;
                                TileOverlay(tileProvider, rememberTileOverlayState(startRestartGroup, 0), z6, f7, z7, f8, function12, startRestartGroup, (i3 & 14) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function13 = function12;
                                z4 = z6;
                                z5 = z7;
                                f5 = f7;
                                f6 = f8;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$1;
                                        TileOverlay$lambda$1 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$1(com.google.android.gms.maps.model.TileProvider.this, z4, f5, z5, f6, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        return TileOverlay$lambda$1;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function12 = function1;
                        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f4 = f2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function12 = function1;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z3 = z2;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                f4 = f2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function12 = function1;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z3 = z2;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            f4 = f2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function12 = function1;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z3 = z2;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        f4 = f2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function12 = function1;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$2$0(com.google.android.gms.maps.model.TileOverlay tileOverlay) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlay, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TileOverlay(final com.google.android.gms.maps.model.TileProvider tileProvider, com.google.maps.android.compose.TileOverlayState tileOverlayState, boolean z, float f, boolean z2, float f2, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.google.maps.android.compose.TileOverlayState tileOverlayState2;
        boolean z3;
        int i4;
        float f3;
        int i5;
        boolean z4;
        int i6;
        float f4;
        int i7;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function13;
        final boolean z5;
        final float f5;
        final boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float f6;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function14;
        boolean z7;
        final com.google.maps.android.compose.TileOverlayState tileOverlayState3;
        final com.google.maps.android.compose.MapApplier mapApplier;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        java.lang.Object rememberedValue;
        com.google.maps.android.compose.MapApplier mapApplier2;
        com.google.maps.android.compose.TileOverlayState tileOverlayState4;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function15;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileProvider, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-378552693);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(tileProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                tileOverlayState2 = tileOverlayState;
                if (startRestartGroup.changed(tileOverlayState2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                tileOverlayState2 = tileOverlayState;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            tileOverlayState2 = tileOverlayState;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f4 = f2;
                    } else {
                        f4 = f2;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                        }
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if ((i2 & 2) != 0) {
                                tileOverlayState2 = rememberTileOverlayState(startRestartGroup, 0);
                                i3 &= -113;
                            }
                            if (i9 != 0) {
                                z3 = true;
                            }
                            if (i4 != 0) {
                                f3 = 0.0f;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            }
                            if (i6 != 0) {
                                f4 = 0.0f;
                            }
                            if (i7 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            kotlin.Unit TileOverlay$lambda$2$0;
                                            TileOverlay$lambda$2$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$2$0((com.google.android.gms.maps.model.TileOverlay) obj);
                                            return TileOverlay$lambda$2$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                f6 = f4;
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                z7 = z3;
                                final float f7 = f3;
                                tileOverlayState3 = tileOverlayState2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-378552693, i3, -1, "com.google.maps.android.compose.TileOverlay (TileOverlay.kt:85)");
                                }
                                mapApplier = (com.google.maps.android.compose.MapApplier) startRestartGroup.getApplier();
                                changedInstance = startRestartGroup.changedInstance(mapApplier);
                                changedInstance2 = startRestartGroup.changedInstance(tileProvider);
                                z8 = (i3 & 896) != 256;
                                z9 = (i3 & 7168) != 2048;
                                z10 = (57344 & i3) != 16384;
                                z11 = (458752 & i3) != 131072;
                                z12 = (((i3 & 112) ^ 48) <= 32 && startRestartGroup.changed(tileOverlayState3)) || (i3 & 48) == 32;
                                z13 = (i3 & 3670016) == 1048576;
                                rememberedValue = startRestartGroup.rememberedValue();
                                if ((!z13 && !(z10 | changedInstance | changedInstance2 | z8 | z9 | z11 | z12)) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit> function16 = function14;
                                    final boolean z14 = z7;
                                    mapApplier2 = mapApplier;
                                    final boolean z15 = z4;
                                    tileOverlayState4 = tileOverlayState3;
                                    function15 = function14;
                                    final float f8 = f6;
                                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            com.google.maps.android.compose.TileOverlayNode TileOverlay$lambda$3$0;
                                            TileOverlay$lambda$3$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$3$0(com.google.maps.android.compose.MapApplier.this, tileOverlayState3, function16, tileProvider, z14, f7, z15, f8);
                                            return TileOverlay$lambda$3$0;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(function0);
                                    rememberedValue = function0;
                                } else {
                                    mapApplier2 = mapApplier;
                                    tileOverlayState4 = tileOverlayState3;
                                    function15 = function14;
                                }
                                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                                if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(function02);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function15, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$0;
                                        TileOverlay$lambda$4$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$0((com.google.maps.android.compose.TileOverlayNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                        return TileOverlay$lambda$4$0;
                                    }
                                });
                                final com.google.maps.android.compose.MapApplier mapApplier3 = mapApplier2;
                                final boolean z16 = z7;
                                final boolean z17 = z4;
                                final float f9 = f6;
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, tileProvider, (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.TileProvider, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$1;
                                        TileOverlay$lambda$4$1 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$1(com.google.maps.android.compose.MapApplier.this, tileProvider, z16, f7, z17, f9, (com.google.maps.android.compose.TileOverlayNode) obj, (com.google.android.gms.maps.model.TileProvider) obj2);
                                        return TileOverlay$lambda$4$1;
                                    }
                                });
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z7), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$2;
                                        TileOverlay$lambda$4$2 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$2((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Boolean) obj2).booleanValue());
                                        return TileOverlay$lambda$4$2;
                                    }
                                });
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f7), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$3;
                                        TileOverlay$lambda$4$3 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$3((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Float) obj2).floatValue());
                                        return TileOverlay$lambda$4$3;
                                    }
                                });
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Boolean.valueOf(z4), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$4;
                                        TileOverlay$lambda$4$4 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$4((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Boolean) obj2).booleanValue());
                                        return TileOverlay$lambda$4$4;
                                    }
                                });
                                androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, java.lang.Float.valueOf(f6), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit TileOverlay$lambda$4$5;
                                        TileOverlay$lambda$4$5 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$5((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Float) obj2).floatValue());
                                        return TileOverlay$lambda$4$5;
                                    }
                                });
                                startRestartGroup.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function13 = function15;
                                z6 = z7;
                                f3 = f7;
                                z5 = z4;
                                f5 = f6;
                                tileOverlayState2 = tileOverlayState4;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                        }
                        f6 = f4;
                        z7 = z3;
                        function14 = function12;
                        final float f72 = f3;
                        tileOverlayState3 = tileOverlayState2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        mapApplier = (com.google.maps.android.compose.MapApplier) startRestartGroup.getApplier();
                        changedInstance = startRestartGroup.changedInstance(mapApplier);
                        changedInstance2 = startRestartGroup.changedInstance(tileProvider);
                        if ((i3 & 896) != 256) {
                        }
                        if ((i3 & 7168) != 2048) {
                        }
                        if ((57344 & i3) != 16384) {
                        }
                        if ((458752 & i3) != 131072) {
                        }
                        if (((i3 & 112) ^ 48) <= 32) {
                        }
                        if ((i3 & 3670016) == 1048576) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(z13 | z10 | changedInstance | changedInstance2 | z8 | z9 | z11 | z12)) {
                        }
                        final kotlin.jvm.functions.Function1 function162 = function14;
                        final boolean z142 = z7;
                        mapApplier2 = mapApplier;
                        final boolean z152 = z4;
                        tileOverlayState4 = tileOverlayState3;
                        function15 = function14;
                        final float f82 = f6;
                        kotlin.jvm.functions.Function0 function03 = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                com.google.maps.android.compose.TileOverlayNode TileOverlay$lambda$3$0;
                                TileOverlay$lambda$3$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$3$0(com.google.maps.android.compose.MapApplier.this, tileOverlayState3, function162, tileProvider, z142, f72, z152, f82);
                                return TileOverlay$lambda$3$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(function03);
                        rememberedValue = function03;
                        kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue;
                        if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                        }
                        startRestartGroup.startNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, function15, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.TileOverlay, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$0;
                                TileOverlay$lambda$4$0 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$0((com.google.maps.android.compose.TileOverlayNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                return TileOverlay$lambda$4$0;
                            }
                        });
                        final com.google.maps.android.compose.MapApplier mapApplier32 = mapApplier2;
                        final boolean z162 = z7;
                        final boolean z172 = z4;
                        final float f92 = f6;
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, tileProvider, (kotlin.jvm.functions.Function2<? super T, ? super com.google.android.gms.maps.model.TileProvider, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$1;
                                TileOverlay$lambda$4$1 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$1(com.google.maps.android.compose.MapApplier.this, tileProvider, z162, f72, z172, f92, (com.google.maps.android.compose.TileOverlayNode) obj, (com.google.android.gms.maps.model.TileProvider) obj2);
                                return TileOverlay$lambda$4$1;
                            }
                        });
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, java.lang.Boolean.valueOf(z7), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$2;
                                TileOverlay$lambda$4$2 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$2((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Boolean) obj2).booleanValue());
                                return TileOverlay$lambda$4$2;
                            }
                        });
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, java.lang.Float.valueOf(f72), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$3;
                                TileOverlay$lambda$4$3 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$3((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Float) obj2).floatValue());
                                return TileOverlay$lambda$4$3;
                            }
                        });
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, java.lang.Boolean.valueOf(z4), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Boolean, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$4;
                                TileOverlay$lambda$4$4 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$4((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Boolean) obj2).booleanValue());
                                return TileOverlay$lambda$4$4;
                            }
                        });
                        androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl2, java.lang.Float.valueOf(f6), (kotlin.jvm.functions.Function2<? super T, ? super java.lang.Float, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$4$5;
                                TileOverlay$lambda$4$5 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$4$5((com.google.maps.android.compose.TileOverlayNode) obj, ((java.lang.Float) obj2).floatValue());
                                return TileOverlay$lambda$4$5;
                            }
                        });
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        function13 = function15;
                        z6 = z7;
                        f3 = f72;
                        z5 = z4;
                        f5 = f6;
                        tileOverlayState2 = tileOverlayState4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        function13 = function12;
                        z5 = z4;
                        boolean z18 = z3;
                        f5 = f4;
                        z6 = z18;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final float f10 = f3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.TileOverlayKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit TileOverlay$lambda$5;
                                TileOverlay$lambda$5 = com.google.maps.android.compose.TileOverlayKt.TileOverlay$lambda$5(com.google.android.gms.maps.model.TileProvider.this, tileOverlayState2, z6, f10, z5, f5, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                return TileOverlay$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.TileOverlayNode TileOverlay$lambda$3$0(com.google.maps.android.compose.MapApplier mapApplier, com.google.maps.android.compose.TileOverlayState tileOverlayState, kotlin.jvm.functions.Function1 function1, com.google.android.gms.maps.model.TileProvider tileProvider, boolean z, float f, boolean z2, float f2) {
        com.google.android.gms.maps.GoogleMap map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions = new com.google.android.gms.maps.model.TileOverlayOptions();
            tileOverlayOptions.tileProvider(tileProvider);
            tileOverlayOptions.fadeIn(z);
            tileOverlayOptions.transparency(f);
            tileOverlayOptions.visible(z2);
            tileOverlayOptions.zIndex(f2);
            com.google.android.gms.maps.model.TileOverlay addTileOverlay = map.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new com.google.maps.android.compose.TileOverlayNode(addTileOverlay, tileOverlayState, function1);
            }
        }
        throw new java.lang.IllegalStateException("Error adding tile overlay".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$0(com.google.maps.android.compose.TileOverlayNode tileOverlayNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        tileOverlayNode.setOnTileOverlayClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$1(com.google.maps.android.compose.MapApplier mapApplier, com.google.android.gms.maps.model.TileProvider tileProvider, boolean z, float f, boolean z2, float f2, com.google.maps.android.compose.TileOverlayNode tileOverlayNode, com.google.android.gms.maps.model.TileProvider tileProvider2) {
        com.google.android.gms.maps.GoogleMap map;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileProvider2, "");
        tileOverlayNode.getTileOverlay().remove();
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions = new com.google.android.gms.maps.model.TileOverlayOptions();
            tileOverlayOptions.tileProvider(tileProvider);
            tileOverlayOptions.fadeIn(z);
            tileOverlayOptions.transparency(f);
            tileOverlayOptions.visible(z2);
            tileOverlayOptions.zIndex(f2);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.google.android.gms.maps.model.TileOverlay addTileOverlay = map.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                tileOverlayNode.setTileOverlay(addTileOverlay);
                tileOverlayNode.getTileOverlayState().setTileOverlay$maps_compose_release(tileOverlayNode.getTileOverlay());
                return kotlin.Unit.INSTANCE;
            }
        }
        throw new java.lang.IllegalStateException("Error adding tile overlay".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$2(com.google.maps.android.compose.TileOverlayNode tileOverlayNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        tileOverlayNode.getTileOverlay().setFadeIn(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$3(com.google.maps.android.compose.TileOverlayNode tileOverlayNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        tileOverlayNode.getTileOverlay().setTransparency(f);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$4(com.google.maps.android.compose.TileOverlayNode tileOverlayNode, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        tileOverlayNode.getTileOverlay().setVisible(z);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$4$5(com.google.maps.android.compose.TileOverlayNode tileOverlayNode, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tileOverlayNode, "");
        tileOverlayNode.getTileOverlay().setZIndex(f);
        return kotlin.Unit.INSTANCE;
    }

    public static final com.google.maps.android.compose.TileOverlayState rememberTileOverlayState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1570127269, i, -1, "com.google.maps.android.compose.rememberTileOverlayState (TileOverlay.kt:153)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.google.maps.android.compose.TileOverlayState.INSTANCE.invoke();
            composer.updateRememberedValue(rememberedValue);
        }
        com.google.maps.android.compose.TileOverlayState tileOverlayState = (com.google.maps.android.compose.TileOverlayState) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return tileOverlayState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$5(com.google.android.gms.maps.model.TileProvider tileProvider, com.google.maps.android.compose.TileOverlayState tileOverlayState, boolean z, float f, boolean z2, float f2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TileOverlay(tileProvider, tileOverlayState, z, f, z2, f2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit TileOverlay$lambda$1(com.google.android.gms.maps.model.TileProvider tileProvider, boolean z, float f, boolean z2, float f2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TileOverlay(tileProvider, z, f, z2, f2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
