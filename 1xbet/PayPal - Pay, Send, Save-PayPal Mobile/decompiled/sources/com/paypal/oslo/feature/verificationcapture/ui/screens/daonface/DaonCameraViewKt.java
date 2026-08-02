package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f28\b\u0002\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0001¢\u0006\u0002\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"DaonCameraView", "", "faceSDK", "Lcom/daon/sdk/face/DaonFace;", "analyzer", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceAnalyzer;", "getOvalRect", "Lkotlin/Function0;", "Landroid/graphics/Rect;", "displayWidth", "", "displayHeight", "isPortrait", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "width", "height", "viewFactory", "Lkotlin/Function1;", "Landroid/app/Activity;", "Lcom/daon/sdk/face/CameraView;", "(Lcom/daon/sdk/face/DaonFace;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonFaceAnalyzer;Lkotlin/jvm/functions/Function0;IIZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease", "cameraStarted", "cameraWidth", "cameraHeight"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonCameraViewKt {
    public static final void DaonCameraView(final com.daon.sdk.face.DaonFace daonFace, final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, final kotlin.jvm.functions.Function0<android.graphics.Rect> function0, final int i, final int i2, final boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function1, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function22;
        kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function12;
        final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function23;
        final androidx.compose.ui.Modifier modifier2;
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function24;
        int i6;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.unit.Density density;
        kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function13;
        android.app.Activity activity;
        int i7;
        final kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function14;
        boolean z2;
        java.lang.Object obj;
        androidx.compose.ui.Modifier modifier4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(daonFaceAnalyzer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-886342530);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changedInstance(daonFace) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(daonFaceAnalyzer) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i5 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i8 = i4 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i5 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i9 = i4 & 128;
        if (i9 != 0) {
            i5 |= 12582912;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i3 & 12582912) == 0) {
                i5 |= startRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
            }
        }
        int i10 = i4 & 256;
        if (i10 != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
        }
        if (!startRestartGroup.shouldExecute((i5 & 38347923) != 38347922, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
            function12 = function1;
            function23 = function22;
            modifier2 = modifier;
        } else {
            androidx.compose.ui.Modifier modifier5 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
            if (i9 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            kotlin.Unit unit;
                            ((java.lang.Integer) obj2).intValue();
                            ((java.lang.Integer) obj3).intValue();
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function24 = (kotlin.jvm.functions.Function2) rememberedValue;
            } else {
                function24 = function22;
            }
            kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function15 = i10 != 0 ? null : function1;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-886342530, i5, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraView (DaonCameraView.kt:58)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity2 == null) {
                throw new java.lang.IllegalStateException("DaonCameraView requires Activity context".toString());
            }
            androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                i6 = 0;
                rememberedValue3 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            } else {
                i6 = 0;
            }
            final androidx.compose.runtime.MutableIntState mutableIntState = (androidx.compose.runtime.MutableIntState) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(i6);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final androidx.compose.runtime.MutableIntState mutableIntState2 = (androidx.compose.runtime.MutableIntState) rememberedValue4;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraAspectRatioCalculator();
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraAspectRatioCalculator cameraAspectRatioCalculator = (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraAspectRatioCalculator) rememberedValue5;
            androidx.compose.runtime.MutableIntState mutableIntState3 = mutableIntState;
            int intValue = mutableIntState3.getIntValue();
            androidx.compose.runtime.MutableIntState mutableIntState4 = mutableIntState2;
            int intValue2 = mutableIntState4.getIntValue();
            boolean changed = startRestartGroup.changed(intValue);
            boolean changed2 = startRestartGroup.changed(intValue2);
            boolean z3 = (i5 & 7168) == 2048;
            boolean z4 = (57344 & i5) == 16384;
            boolean z5 = (458752 & i5) == 131072;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if ((z5 || (z4 | changed | changed2 | z3)) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.CameraDimensions calculate = cameraAspectRatioCalculator.calculate(mutableIntState3.getIntValue(), mutableIntState4.getIntValue(), i, i2, z);
                modifier3 = modifier5;
                density = density2;
                function13 = function15;
                activity = activity2;
                i7 = i5;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Aspect ratio calculated", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("camera_width", java.lang.Integer.valueOf(mutableIntState3.getIntValue())), kotlin.TuplesKt.to("camera_height", java.lang.Integer.valueOf(mutableIntState4.getIntValue())), kotlin.TuplesKt.to("display_width", java.lang.Integer.valueOf(i)), kotlin.TuplesKt.to("display_height", java.lang.Integer.valueOf(i2)), kotlin.TuplesKt.to("is_portrait", java.lang.Boolean.valueOf(z)), kotlin.TuplesKt.to("view_width", java.lang.Integer.valueOf(calculate.getViewWidth())), kotlin.TuplesKt.to("view_height", java.lang.Integer.valueOf(calculate.getViewHeight())), kotlin.TuplesKt.to("offset_x", java.lang.Integer.valueOf(calculate.getOffsetX())), kotlin.TuplesKt.to("offset_y", java.lang.Integer.valueOf(calculate.getOffsetY()))), null, 4, null);
                rememberedValue6 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(calculate.getViewWidth()), java.lang.Integer.valueOf(calculate.getViewHeight()), java.lang.Integer.valueOf(calculate.getOffsetX()), java.lang.Integer.valueOf(calculate.getOffsetY())});
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                i7 = i5;
                modifier3 = modifier5;
                activity = activity2;
                density = density2;
                function13 = function15;
            }
            java.util.List list = (java.util.List) rememberedValue6;
            int intValue3 = ((java.lang.Number) list.get(0)).intValue();
            int intValue4 = ((java.lang.Number) list.get(1)).intValue();
            final int intValue5 = ((java.lang.Number) list.get(2)).intValue();
            final int intValue6 = ((java.lang.Number) list.get(3)).intValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] View dimensions set", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("view_width", java.lang.Integer.valueOf(intValue3)), kotlin.TuplesKt.to("view_height", java.lang.Integer.valueOf(intValue4)), kotlin.TuplesKt.to("offset_x", java.lang.Integer.valueOf(intValue5)), kotlin.TuplesKt.to("offset_y", java.lang.Integer.valueOf(intValue6))), null, 4, null);
            boolean z6 = (i7 & 234881024) == 67108864;
            final android.app.Activity activity3 = activity;
            boolean changedInstance = startRestartGroup.changedInstance(activity3);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if ((z6 || changedInstance) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                function14 = function13;
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.$r8$lambda$5x096BAPagNpmIcvvL7qIL7AlCM(kotlin.jvm.functions.Function1.this, activity3, (android.content.Context) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            } else {
                function14 = function13;
            }
            kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue7;
            androidx.compose.ui.unit.Density density3 = density;
            float mo1415toDpu2uoSUM = density3.mo1415toDpu2uoSUM(intValue3);
            float mo1415toDpu2uoSUM2 = density3.mo1415toDpu2uoSUM(intValue4);
            androidx.compose.ui.Modifier modifier6 = modifier3;
            androidx.compose.ui.Modifier m1734requiredSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1734requiredSizeVpY3zN4(modifier6, mo1415toDpu2uoSUM, mo1415toDpu2uoSUM2);
            boolean changed3 = startRestartGroup.changed(intValue5);
            boolean changed4 = startRestartGroup.changed(intValue6);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if ((changed3 | changed4) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.$r8$lambda$WkQvKz2y9QGBOr10yhHJpYuzYnU(intValue5, intValue6, (androidx.compose.ui.unit.Density) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            androidx.compose.ui.Modifier offset = androidx.compose.foundation.layout.OffsetKt.offset(m1734requiredSizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue8);
            boolean changedInstance2 = startRestartGroup.changedInstance(daonFace);
            boolean changedInstance3 = startRestartGroup.changedInstance(activity3);
            boolean z7 = (i7 & 29360128) == 8388608;
            if ((i7 & 896) == 256) {
                obj = daonFaceAnalyzer;
                z2 = true;
            } else {
                z2 = false;
                obj = daonFaceAnalyzer;
            }
            boolean changedInstance4 = startRestartGroup.changedInstance(obj);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | changedInstance3 | z7 | z2) || changedInstance4) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                modifier4 = modifier6;
                final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function25 = function24;
                function12 = function14;
                java.lang.Object obj2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.Camera2StreamConfigurationMap(com.daon.sdk.face.DaonFace.this, activity3, function25, mutableState, mutableIntState, mutableIntState2, function0, daonFaceAnalyzer, (com.daon.sdk.face.CameraView) obj3);
                        return Camera2StreamConfigurationMap;
                    }
                };
                startRestartGroup.updateRememberedValue(obj2);
                rememberedValue9 = obj2;
            } else {
                modifier4 = modifier6;
                function12 = function14;
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function16, offset, (kotlin.jvm.functions.Function1) rememberedValue9, startRestartGroup, 0, 0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance5 = startRestartGroup.changedInstance(daonFace);
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.$r8$lambda$K7M4fbjHNybJpFu1SX8Qkbli338(com.daon.sdk.face.DaonFace.this, (androidx.compose.runtime.DisposableEffectScope) obj3);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(unit, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue10, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            function23 = function24;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends com.daon.sdk.face.CameraView> function17 = function12;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.m20629$r8$lambda$dco2knUVjN2VjGCZh96GhPSGxM(com.daon.sdk.face.DaonFace.this, daonFaceAnalyzer, function0, i, i2, z, modifier2, function23, function17, i3, i4, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ com.daon.sdk.face.CameraView $r8$lambda$5x096BAPagNpmIcvvL7qIL7AlCM(kotlin.jvm.functions.Function1 function1, android.app.Activity activity, android.content.Context context) {
        com.daon.sdk.face.CameraView cameraView;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Creating CameraView", null, null, 6, null);
        if (function1 == null || (cameraView = (com.daon.sdk.face.CameraView) function1.invoke(activity)) == null) {
            cameraView = new com.daon.sdk.face.CameraView(activity);
        }
        cameraView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        return cameraView;
    }

    public static /* synthetic */ void $r8$lambda$ERgxwe4_cLaJ4WX4_sXPw4KUTps(com.daon.sdk.face.DaonFace daonFace, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableIntState mutableIntState2, final kotlin.jvm.functions.Function0 function0, final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, byte[] bArr, android.hardware.Camera camera) {
        if (bArr != null) {
            daonFace.analyze(new com.daon.sdk.face.YUV(bArr, mutableIntState.getIntValue(), mutableIntState2.getIntValue())).addAnalysisListener(new com.daon.sdk.face.Analysis.AnalysisListener() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda6
                @Override // com.daon.sdk.face.Analysis.AnalysisListener
                public final void analysis(com.daon.sdk.face.Result result, com.daon.sdk.face.YUV yuv) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.$r8$lambda$hsonYFNp61If2hUSL1o3H1bkbjg(kotlin.jvm.functions.Function0.this, daonFaceAnalyzer, result, yuv);
                }
            });
        }
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$K7M4fbjHNybJpFu1SX8Qkbli338(final com.daon.sdk.face.DaonFace daonFace, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$DaonCameraView$lambda$17$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Stopping camera and cleaning up", null, null, 6, null);
                com.daon.sdk.face.DaonFace daonFace2 = com.daon.sdk.face.DaonFace.this;
                if (daonFace2 != null) {
                    daonFace2.stop();
                }
            }
        };
    }

    public static /* synthetic */ androidx.compose.ui.unit.IntOffset $r8$lambda$WkQvKz2y9QGBOr10yhHJpYuzYnU(int i, int i2, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32)));
    }

    /* renamed from: $r8$lambda$dco2knUVjN2VjGC-Zh96GhPSGxM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20629$r8$lambda$dco2knUVjN2VjGCZh96GhPSGxM(com.daon.sdk.face.DaonFace daonFace, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, kotlin.jvm.functions.Function0 function0, int i, int i2, boolean z, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i3, int i4, androidx.compose.runtime.Composer composer, int i5) {
        DaonCameraView(daonFace, daonFaceAnalyzer, function0, i, i2, z, modifier, function2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$hsonYFNp61If2hUSL1o3H1bkbjg(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, com.daon.sdk.face.Result result, com.daon.sdk.face.YUV yuv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        android.graphics.Rect rect = (android.graphics.Rect) function0.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNull(yuv);
        daonFaceAnalyzer.processResult(yuv, result, rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit Camera2StreamConfigurationMap(final com.daon.sdk.face.DaonFace daonFace, android.app.Activity activity, kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableIntState mutableIntState, final androidx.compose.runtime.MutableIntState mutableIntState2, final kotlin.jvm.functions.Function0 function0, final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonFaceAnalyzer daonFaceAnalyzer, com.daon.sdk.face.CameraView cameraView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraView, "");
        if (daonFace != null && !((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Starting camera preview (SDK ready)", null, null, 6, null);
            try {
                android.hardware.Camera.Size start = cameraView.start(activity, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_WIDTH, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT);
                if (start == null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Failed to start camera preview", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", "camera_start_returned_null")), null, null, 12, null);
                } else {
                    mutableIntState.setIntValue(start.width);
                    mutableIntState2.setIntValue(start.height);
                    daonFace.setImageSize(mutableIntState.getIntValue(), mutableIntState2.getIntValue());
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Camera started", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("camera_width", java.lang.Integer.valueOf(mutableIntState.getIntValue())), kotlin.TuplesKt.to("camera_height", java.lang.Integer.valueOf(mutableIntState2.getIntValue()))), null, 4, null);
                    mutableState.setValue(java.lang.Boolean.TRUE);
                    function2.invoke(java.lang.Integer.valueOf(mutableIntState.getIntValue()), java.lang.Integer.valueOf(mutableIntState2.getIntValue()));
                    cameraView.setPreviewFrameCallback(new android.hardware.Camera.PreviewCallback() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt$$ExternalSyntheticLambda7
                        @Override // android.hardware.Camera.PreviewCallback
                        public final void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
                            com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonCameraViewKt.$r8$lambda$ERgxwe4_cLaJ4WX4_sXPw4KUTps(com.daon.sdk.face.DaonFace.this, mutableIntState, mutableIntState2, function0, daonFaceAnalyzer, bArr, camera);
                        }
                    });
                }
            } catch (java.lang.Exception e) {
                com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog().e("[DaonCamera] Failed to start camera", e);
            }
        } else {
            if (daonFace == null) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Waiting for SDK initialization...", null, null, 6, null);
            }
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonCamera] Camera already started", null, null, 6, null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
