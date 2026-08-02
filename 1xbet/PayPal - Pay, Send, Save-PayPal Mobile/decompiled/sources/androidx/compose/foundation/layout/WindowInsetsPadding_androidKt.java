package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u0011\u0010\u0006\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0011\u0010\b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0002\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\u0002\u001a\u0011\u0010\r\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0002\u001aE\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u00112\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u000e¢\u0006\u0002\b\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "safeDrawingPadding", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "safeGesturesPadding", "safeContentPadding", "systemBarsPadding", "displayCutoutPadding", "statusBarsPadding", "imePadding", "navigationBarsPadding", "captionBarPadding", "waterfallPadding", "systemGesturesPadding", "mandatorySystemGesturesPadding", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p0", "Landroidx/compose/foundation/layout/WindowInsetsHolder;", "Landroidx/compose/foundation/layout/WindowInsets;", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getInputSizeshNQ4ISI(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getSafeDrawing();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getOutputFormats(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getSafeGestures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getInputFormats(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getSafeContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoSizesFor(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getSystemBars();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getDisplayCutout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getOutputMinFrameDuration(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getStatusBars();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoSizes(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getIme();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getNavigationBars();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRanges(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getCaptionBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getOutputMinFrameDurationlomOqCM(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getWaterfall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getOutputStallDuration(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getSystemGestures();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.layout.WindowInsets getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.layout.WindowInsetsHolder windowInsetsHolder) {
        return windowInsetsHolder.getMandatorySystemGestures();
    }

    private static final androidx.compose.ui.Modifier getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.WindowInsetsHolder, ? extends androidx.compose.foundation.layout.WindowInsets> function12) {
        return modifier.then(new androidx.compose.foundation.layout.SystemInsetsPaddingModifierElement(function1, function12));
    }

    public static final androidx.compose.ui.Modifier safeDrawingPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeDrawingPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets inputSizeshNQ4ISI;
                inputSizeshNQ4ISI = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getInputSizeshNQ4ISI((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return inputSizeshNQ4ISI;
            }
        });
    }

    public static final androidx.compose.ui.Modifier safeGesturesPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeGesturesPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets outputFormats;
                outputFormats = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getOutputFormats((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return outputFormats;
            }
        });
    }

    public static final androidx.compose.ui.Modifier safeContentPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeContentPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets inputFormats;
                inputFormats = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getInputFormats((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return inputFormats;
            }
        });
    }

    public static final androidx.compose.ui.Modifier systemBarsPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemBarsPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets highSpeedVideoSizesFor;
                highSpeedVideoSizesFor = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getHighSpeedVideoSizesFor((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return highSpeedVideoSizesFor;
            }
        });
    }

    public static final androidx.compose.ui.Modifier displayCutoutPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("displayCutoutPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
    }

    public static final androidx.compose.ui.Modifier statusBarsPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("statusBarsPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets outputMinFrameDuration;
                outputMinFrameDuration = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getOutputMinFrameDuration((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return outputMinFrameDuration;
            }
        });
    }

    public static final androidx.compose.ui.Modifier imePadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imePadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getHighSpeedVideoSizes((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return highSpeedVideoSizes;
            }
        });
    }

    public static final androidx.compose.ui.Modifier navigationBarsPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("navigationBarsPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.Camera2StreamConfigurationMap((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return Camera2StreamConfigurationMap;
            }
        });
    }

    public static final androidx.compose.ui.Modifier captionBarPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("captionBarPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getHighSpeedVideoFpsRanges((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    public static final androidx.compose.ui.Modifier waterfallPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("waterfallPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets outputMinFrameDurationlomOqCM;
                outputMinFrameDurationlomOqCM = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getOutputMinFrameDurationlomOqCM((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return outputMinFrameDurationlomOqCM;
            }
        });
    }

    public static final androidx.compose.ui.Modifier systemGesturesPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemGesturesPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets outputStallDuration;
                outputStallDuration = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getOutputStallDuration((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return outputStallDuration;
            }
        });
    }

    public static final androidx.compose.ui.Modifier mandatorySystemGesturesPadding(androidx.compose.ui.Modifier modifier) {
        return getHighResolutionOutputSizeshNQ4ISI(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                inspectorInfo.setName("mandatorySystemGesturesPadding");
            }
        } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                androidx.compose.foundation.layout.WindowInsets highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.getHighSpeedVideoFpsRangesFor((androidx.compose.foundation.layout.WindowInsetsHolder) obj);
                return highSpeedVideoFpsRangesFor;
            }
        });
    }
}
