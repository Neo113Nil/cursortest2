package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0095\u0002\u0010\u0000\u001a\u00020\u00012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"InputHandler", "", "onCircleClick", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Circle;", "onGroundOverlayClick", "Lcom/google/android/gms/maps/model/GroundOverlay;", "onPolygonClick", "Lcom/google/android/gms/maps/model/Polygon;", "onPolylineClick", "Lcom/google/android/gms/maps/model/Polyline;", "onMarkerClick", "Lcom/google/android/gms/maps/model/Marker;", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InputHandlerKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputHandler(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function15, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function16, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function17, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function18, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function19, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function110, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function111, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function112;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function113;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function114;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function115;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function116;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function117;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function118;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function119;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function120;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function121;
        kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function122;
        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function123;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-510120299);
        int i16 = i3 & 1;
        if (i16 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i17 = i3 & 2;
        if (i17 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                function112 = function13;
                i4 |= startRestartGroup.changedInstance(function112) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changedInstance(function15) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i4 |= startRestartGroup.changedInstance(function16) ? 131072 : 65536;
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changedInstance(function17) ? 1048576 : 524288;
                        }
                        i10 = i3 & 128;
                        if (i10 != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changedInstance(function18) ? 8388608 : 4194304;
                        }
                        i11 = i3 & 256;
                        if (i11 != 0) {
                            i4 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i4 |= startRestartGroup.changedInstance(function19) ? 67108864 : 33554432;
                        }
                        i12 = i3 & 512;
                        if (i12 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(function110) ? 536870912 : 268435456;
                        }
                        i13 = i3 & 1024;
                        if (i13 != 0) {
                            i15 = i2 | 6;
                        } else {
                            if ((i2 & 6) != 0) {
                                i14 = i2;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
                                    startRestartGroup.skipToGroupEnd();
                                    function113 = function1;
                                    function114 = function12;
                                    function115 = function14;
                                    function116 = function15;
                                    function117 = function16;
                                    function118 = function17;
                                    function119 = function18;
                                    function120 = function19;
                                    function121 = function110;
                                    function122 = function111;
                                    function123 = function112;
                                } else {
                                    function113 = i16 != 0 ? null : function1;
                                    function114 = i17 != 0 ? null : function12;
                                    if (i5 != 0) {
                                        function112 = null;
                                    }
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function124 = i6 != 0 ? null : function14;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function125 = i7 != 0 ? null : function15;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function126 = i8 != 0 ? null : function16;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function127 = i9 != 0 ? null : function17;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function128 = i10 != 0 ? null : function18;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function129 = i11 != 0 ? null : function19;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function130 = i12 != 0 ? null : function110;
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function131 = i13 == 0 ? function111 : null;
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-510120299, i4, i14, "com.google.maps.android.compose.InputHandler (InputHandler.kt:35)");
                                    }
                                    boolean z = (i4 & 14) == 4;
                                    boolean z2 = (i4 & 112) == 32;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function132 = function131;
                                    boolean z3 = (i4 & 896) == 256;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function133 = function130;
                                    boolean z4 = (i4 & 7168) == 2048;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function134 = function129;
                                    boolean z5 = (57344 & i4) == 16384;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function135 = function128;
                                    boolean z6 = (458752 & i4) == 131072;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function136 = function126;
                                    boolean z7 = (3670016 & i4) == 1048576;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean> function137 = function125;
                                    boolean z8 = (29360128 & i4) == 8388608;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit> function138 = function124;
                                    boolean z9 = (234881024 & i4) == 67108864;
                                    boolean z10 = (i4 & 1879048192) == 536870912;
                                    boolean z11 = (i14 & 14) == 4;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if ((z5 | z4 | z | z2 | z3 | z6 | z7 | z8 | z9 | z10 | z11) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function139 = function113;
                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function140 = function114;
                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit> function141 = function112;
                                        final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function142 = function127;
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                com.google.maps.android.compose.InputHandlerNode InputHandler$lambda$0$0;
                                                InputHandler$lambda$0$0 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$0$0(kotlin.jvm.functions.Function1.this, function140, function141, function138, function137, function136, function142, function135, function134, function133, function132);
                                                return InputHandler$lambda$0$0;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                                    if (!(startRestartGroup.getApplier() instanceof com.google.maps.android.compose.MapApplier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(function0);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function113, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$0;
                                            InputHandler$lambda$1$0 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$0((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$0;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function114, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda8
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$1;
                                            InputHandler$lambda$1$1 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$1((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$1;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function112, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polygon, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$2;
                                            InputHandler$lambda$1$2 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$2((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$2;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function138, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Polyline, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$3;
                                            InputHandler$lambda$1$3 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$3((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$3;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function137, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, java.lang.Boolean>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$4;
                                            InputHandler$lambda$1$4 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$4((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$4;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function136, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$5;
                                            InputHandler$lambda$1$5 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$5((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$5;
                                        }
                                    });
                                    kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function143 = function127;
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function143, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$6;
                                            InputHandler$lambda$1$6 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$6((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$6;
                                        }
                                    });
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function135, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$7;
                                            InputHandler$lambda$1$7 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$7((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$7;
                                        }
                                    });
                                    function120 = function134;
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function120, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$8;
                                            InputHandler$lambda$1$8 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$8((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$8;
                                        }
                                    });
                                    function121 = function133;
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function121, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$9;
                                            InputHandler$lambda$1$9 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$9((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$9;
                                        }
                                    });
                                    function122 = function132;
                                    androidx.compose.runtime.Updater.m5310updateimpl(m5299constructorimpl, function122, (kotlin.jvm.functions.Function2<? super T, ? super kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit>, kotlin.Unit>) new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$1$10;
                                            InputHandler$lambda$1$10 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$1$10((com.google.maps.android.compose.InputHandlerNode) obj, (kotlin.jvm.functions.Function1) obj2);
                                            return InputHandler$lambda$1$10;
                                        }
                                    });
                                    startRestartGroup.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    function123 = function112;
                                    function116 = function137;
                                    function115 = function138;
                                    function119 = function135;
                                    function118 = function143;
                                    function117 = function136;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup == null) {
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function144 = function113;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.GroundOverlay, kotlin.Unit> function145 = function114;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function146 = function118;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function147 = function119;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function148 = function120;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function149 = function121;
                                    final kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> function150 = function122;
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.google.maps.android.compose.InputHandlerKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            kotlin.Unit InputHandler$lambda$2;
                                            InputHandler$lambda$2 = com.google.maps.android.compose.InputHandlerKt.InputHandler$lambda$2(kotlin.jvm.functions.Function1.this, function145, function123, function115, function116, function117, function146, function147, function148, function149, function150, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                            return InputHandler$lambda$2;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i15 = i2 | (startRestartGroup.changedInstance(function111) ? 4 : 2);
                        }
                        i14 = i15;
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 128;
                    if (i10 != 0) {
                    }
                    i11 = i3 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i3 & 512;
                    if (i12 != 0) {
                    }
                    i13 = i3 & 1024;
                    if (i13 != 0) {
                    }
                    i14 = i15;
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                }
                i13 = i3 & 1024;
                if (i13 != 0) {
                }
                i14 = i15;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function112 = function13;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i14 = i15;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        function112 = function13;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i14 = i15;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.maps.android.compose.InputHandlerNode InputHandler$lambda$0$0(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function1 function16, kotlin.jvm.functions.Function1 function17, kotlin.jvm.functions.Function1 function18, kotlin.jvm.functions.Function1 function19, kotlin.jvm.functions.Function1 function110, kotlin.jvm.functions.Function1 function111) {
        return new com.google.maps.android.compose.InputHandlerNode(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$0(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnCircleClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$1(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnGroundOverlayClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$2(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnPolygonClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$3(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnPolylineClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$4(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnMarkerClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$5(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnInfoWindowClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$6(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnInfoWindowClose(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$7(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnInfoWindowLongClick(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$8(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnMarkerDrag(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$9(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnMarkerDragEnd(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$1$10(com.google.maps.android.compose.InputHandlerNode inputHandlerNode, kotlin.jvm.functions.Function1 function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputHandlerNode, "");
        inputHandlerNode.setOnMarkerDragStart(function1);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit InputHandler$lambda$2(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function1 function14, kotlin.jvm.functions.Function1 function15, kotlin.jvm.functions.Function1 function16, kotlin.jvm.functions.Function1 function17, kotlin.jvm.functions.Function1 function18, kotlin.jvm.functions.Function1 function19, kotlin.jvm.functions.Function1 function110, kotlin.jvm.functions.Function1 function111, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        InputHandler(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
