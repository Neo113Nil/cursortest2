package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 T2\u00020\u0001:\u0001TB;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0017J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0017J\u001c\u0010(\u001a\u00020\u00172\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*H\u0017J\b\u0010-\u001a\u00020\u0017H\u0017J\u0016\u0010.\u001a\u00020\u00172\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0019H\u0017J\u0010\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u000203H\u0017J\b\u00104\u001a\u00020\u0017H\u0002J\b\u00105\u001a\u00020\u0017H\u0017J\f\u00105\u001a\u00020\u0017*\u00020\u0003H\u0002J\u0018\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020,H\u0017J\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000200H\u0017J\u0018\u0010>\u001a\u00020;2\u0006\u0010<\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0017J\u001c\u0010A\u001a\u00020\u00172\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C0*H\u0017J\b\u0010D\u001a\u00020\u0017H\u0017J\u0018\u0010E\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020CH\u0017J&\u0010I\u001a\u00020\u00172\u0006\u0010F\u001a\u00020G2\u0006\u0010J\u001a\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u0017J\u0016\u0010O\u001a\u00020\u00172\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u0017J\u001e\u0010P\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0MH\u0017J\u0016\u0010S\u001a\u00020\u00172\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0MH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "applicationContext", "Landroid/content/Context;", "overlayController", "Landroidx/window/embedding/OverlayControllerImpl;", "activityWindowInfoCallbackController", "Landroidx/window/embedding/ActivityWindowInfoCallbackController;", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;Landroidx/window/core/ConsumerAdapter;Landroid/content/Context;Landroidx/window/embedding/OverlayControllerImpl;Landroidx/window/embedding/ActivityWindowInfoCallbackController;)V", "getOverlayController$window_release", "()Landroidx/window/embedding/OverlayControllerImpl;", "windowSdkExtensions", "Landroidx/window/WindowSdkExtensions;", "isCustomSplitAttributeCalculatorSet", "", "setRules", "", "rules", "", "Landroidx/window/embedding/EmbeddingRule;", "setEmbeddingCallback", "embeddingCallback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "registerSplitInfoCallback", "isActivityEmbedded", "activity", "Landroid/app/Activity;", "pinTopActivityStack", "taskId", "", "splitPinRule", "Landroidx/window/embedding/SplitPinRule;", "unpinTopActivityStack", "setSplitAttributesCalculator", "calculator", "Lkotlin/Function1;", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitAttributes;", "clearSplitAttributesCalculator", "finishActivityStacks", "activityStacks", "Landroidx/window/embedding/ActivityStack;", "setEmbeddingConfiguration", "embeddingConfig", "Landroidx/window/embedding/EmbeddingConfiguration;", "setDefaultSplitAttributeCalculatorIfNeeded", "invalidateVisibleActivityStacks", "updateSplitAttributes", "splitInfo", "Landroidx/window/embedding/SplitInfo;", "splitAttributes", "setLaunchingActivityStack", "Landroid/os/Bundle;", "options", "activityStack", "setOverlayCreateParams", "overlayCreateParams", "Landroidx/window/embedding/OverlayCreateParams;", "setOverlayAttributesCalculator", "Landroidx/window/embedding/OverlayAttributesCalculatorParams;", "Landroidx/window/embedding/OverlayAttributes;", "clearOverlayAttributesCalculator", "updateOverlayAttributes", "overlayTag", "", "overlayAttributes", "addOverlayInfoCallback", "executor", "Ljava/util/concurrent/Executor;", "overlayInfoCallback", "Landroidx/core/util/Consumer;", "Landroidx/window/embedding/OverlayInfo;", "removeOverlayInfoCallback", "addEmbeddedActivityWindowInfoCallbackForActivity", com.sun.jna.Callback.METHOD_NAME, "Landroidx/window/embedding/EmbeddedActivityWindowInfo;", "removeEmbeddedActivityWindowInfoCallbackForActivity", "Companion", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EmbeddingCompat implements androidx.window.embedding.EmbeddingInterfaceCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.window.embedding.EmbeddingCompat.Companion INSTANCE = new androidx.window.embedding.EmbeddingCompat.Companion(null);
    public static final boolean DEBUG = true;
    private final androidx.window.extensions.embedding.ActivityEmbeddingComponent Camera2StreamConfigurationMap;
    private final androidx.window.embedding.ActivityWindowInfoCallbackController getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.core.ConsumerAdapter getHighSpeedVideoFpsRanges;
    private final androidx.window.embedding.EmbeddingAdapter getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizes;
    private final androidx.window.WindowSdkExtensions getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private final androidx.window.embedding.OverlayControllerImpl getOutputMinFrameDuration;

    public EmbeddingCompat(androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent, androidx.window.embedding.EmbeddingAdapter embeddingAdapter, androidx.window.core.ConsumerAdapter consumerAdapter, android.content.Context context, androidx.window.embedding.OverlayControllerImpl overlayControllerImpl, androidx.window.embedding.ActivityWindowInfoCallbackController activityWindowInfoCallbackController) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityEmbeddingComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerAdapter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = activityEmbeddingComponent;
        this.getHighSpeedVideoFpsRangesFor = embeddingAdapter;
        this.getHighSpeedVideoFpsRanges = consumerAdapter;
        this.getHighSpeedVideoSizes = context;
        this.getOutputMinFrameDuration = overlayControllerImpl;
        this.getHighResolutionOutputSizeshNQ4ISI = activityWindowInfoCallbackController;
        this.getInputFormats = androidx.window.WindowSdkExtensions.INSTANCE.getInstance();
    }

    /* renamed from: getOverlayController$window_release, reason: from getter */
    public final androidx.window.embedding.OverlayControllerImpl getGetOutputMinFrameDuration() {
        return this.getOutputMinFrameDuration;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void setRules(java.util.Set<? extends androidx.window.embedding.EmbeddingRule> rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rules, "");
        java.util.Iterator<? extends androidx.window.embedding.EmbeddingRule> it = rules.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next() instanceof androidx.window.embedding.SplitRule) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(androidx.window.embedding.SplitController.INSTANCE.getInstance(this.getHighSpeedVideoSizes).getSplitSupportStatus(), androidx.window.embedding.SplitController.SplitSupportStatus.SPLIT_AVAILABLE)) {
                    androidx.window.core.BuildConfig.INSTANCE.getVerificationMode();
                    androidx.window.core.VerificationMode verificationMode = androidx.window.core.VerificationMode.LOG;
                    return;
                }
            }
        }
        this.Camera2StreamConfigurationMap.setEmbeddingRules(this.getHighSpeedVideoFpsRangesFor.translate(this.getHighSpeedVideoSizes, rules));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void setEmbeddingCallback(final androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingCallback, "");
        int extensionVersion = this.getInputFormats.getExtensionVersion();
        if (extensionVersion == 1) {
            this.getHighSpeedVideoFpsRanges.addConsumer(this.Camera2StreamConfigurationMap, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.util.List.class), "setSplitInfoCallback", new kotlin.jvm.functions.Function1() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.window.embedding.EmbeddingCompat.getHighSpeedVideoFpsRangesFor(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface.this, this, (java.util.List) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
            return;
        }
        if (2 <= extensionVersion && extensionVersion < 5) {
            Camera2StreamConfigurationMap(embeddingCallback);
        } else {
            if (5 > extensionVersion || extensionVersion > Integer.MAX_VALUE) {
                return;
            }
            Camera2StreamConfigurationMap(embeddingCallback);
            this.Camera2StreamConfigurationMap.registerActivityStackCallback(new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), new androidx.window.embedding.ActivityStackConsumer(embeddingCallback, this.getHighSpeedVideoFpsRangesFor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, androidx.window.embedding.EmbeddingCompat embeddingCompat, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof androidx.window.extensions.embedding.SplitInfo) {
                arrayList.add(obj);
            }
        }
        embeddingCallbackInterface.onSplitInfoChanged(embeddingCompat.getHighSpeedVideoFpsRangesFor.translate(arrayList));
        return kotlin.Unit.INSTANCE;
    }

    private final void Camera2StreamConfigurationMap(final androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        this.Camera2StreamConfigurationMap.setSplitInfoCallback(new androidx.window.reflection.Consumer2() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda1
            @Override // androidx.window.reflection.Consumer2
            public final void accept(java.lang.Object obj) {
                androidx.window.embedding.EmbeddingCompat.getHighSpeedVideoSizes(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface.this, this, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, androidx.window.embedding.EmbeddingCompat embeddingCompat, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        embeddingCallbackInterface.onSplitInfoChanged(embeddingCompat.getHighSpeedVideoFpsRangesFor.translate((java.util.List<? extends androidx.window.extensions.embedding.SplitInfo>) list));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final boolean isActivityEmbedded(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        return this.Camera2StreamConfigurationMap.isActivityEmbedded(activity);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final boolean pinTopActivityStack(int taskId, androidx.window.embedding.SplitPinRule splitPinRule) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitPinRule, "");
        this.getInputFormats.requireExtensionVersion$window_release(5);
        return this.Camera2StreamConfigurationMap.pinTopActivityStack(taskId, this.getHighSpeedVideoFpsRangesFor.translateSplitPinRule(this.getHighSpeedVideoSizes, splitPinRule));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void unpinTopActivityStack(int taskId) {
        this.getInputFormats.requireExtensionVersion$window_release(5);
        this.Camera2StreamConfigurationMap.unpinTopActivityStack(taskId);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void setSplitAttributesCalculator(kotlin.jvm.functions.Function1<? super androidx.window.embedding.SplitAttributesCalculatorParams, androidx.window.embedding.SplitAttributes> calculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculator, "");
        this.getInputFormats.requireExtensionVersion$window_release(2);
        this.Camera2StreamConfigurationMap.setSplitAttributesCalculator(this.getHighSpeedVideoFpsRangesFor.translateSplitAttributesCalculator(calculator));
        this.getInputSizeshNQ4ISI = true;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void clearSplitAttributesCalculator() {
        this.getInputFormats.requireExtensionVersion$window_release(2);
        this.Camera2StreamConfigurationMap.clearSplitAttributesCalculator();
        this.getInputSizeshNQ4ISI = false;
        getHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void finishActivityStacks(java.util.Set<androidx.window.embedding.ActivityStack> activityStacks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStacks, "");
        this.getInputFormats.requireExtensionVersion$window_release(5);
        androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent = this.Camera2StreamConfigurationMap;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = activityStacks.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((androidx.window.embedding.ActivityStack) it.next()).getToken$window_release());
        }
        activityEmbeddingComponent.finishActivityStacksWithTokens(linkedHashSet);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void setEmbeddingConfiguration(androidx.window.embedding.EmbeddingConfiguration embeddingConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(embeddingConfig, "");
        this.getInputFormats.requireExtensionVersion$window_release(5);
        this.getHighSpeedVideoFpsRangesFor.setEmbeddingConfiguration(embeddingConfig);
        getHighSpeedVideoFpsRangesFor();
        if (this.getInputFormats.getExtensionVersion() >= 8) {
            try {
                this.Camera2StreamConfigurationMap.setAutoSaveEmbeddingState(embeddingConfig.getIsAutoSaveEmbeddingState());
            } catch (java.lang.Throwable unused) {
            }
        }
        this.Camera2StreamConfigurationMap.invalidateTopVisibleSplitAttributes();
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (this.getInputFormats.getExtensionVersion() < 5 || this.getInputSizeshNQ4ISI || this.getHighSpeedVideoFpsRangesFor.getGetHighResolutionOutputSizeshNQ4ISI() == null) {
            return;
        }
        this.Camera2StreamConfigurationMap.setSplitAttributesCalculator(new androidx.window.extensions.core.util.function.Function() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda2
            public final java.lang.Object apply(java.lang.Object obj) {
                androidx.window.extensions.embedding.SplitAttributes highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.window.embedding.EmbeddingCompat.getHighSpeedVideoFpsRanges(androidx.window.embedding.EmbeddingCompat.this, (androidx.window.extensions.embedding.SplitAttributesCalculatorParams) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.window.extensions.embedding.SplitAttributes getHighSpeedVideoFpsRanges(androidx.window.embedding.EmbeddingCompat embeddingCompat, androidx.window.extensions.embedding.SplitAttributesCalculatorParams splitAttributesCalculatorParams) {
        if (splitAttributesCalculatorParams.areDefaultConstraintsSatisfied()) {
            androidx.window.embedding.EmbeddingAdapter embeddingAdapter = embeddingCompat.getHighSpeedVideoFpsRangesFor;
            androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = splitAttributesCalculatorParams.getDefaultSplitAttributes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultSplitAttributes, "");
            return embeddingAdapter.translateSplitAttributes(embeddingAdapter.translate$window_release(defaultSplitAttributes));
        }
        return embeddingCompat.getHighSpeedVideoFpsRangesFor.translateSplitAttributes(new androidx.window.embedding.SplitAttributes.Builder().setSplitType(androidx.window.embedding.SplitAttributes.SplitType.SPLIT_TYPE_EXPAND).build());
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void invalidateVisibleActivityStacks() {
        this.getInputFormats.requireExtensionVersion$window_release(3);
        getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap);
    }

    private final void getHighSpeedVideoSizes(androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent) {
        activityEmbeddingComponent.invalidateTopVisibleSplitAttributes();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void updateSplitAttributes(androidx.window.embedding.SplitInfo splitInfo, androidx.window.embedding.SplitAttributes splitAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(splitAttributes, "");
        this.getInputFormats.requireExtensionVersion$window_release(3);
        if (this.getInputFormats.getExtensionVersion() >= 5) {
            this.Camera2StreamConfigurationMap.updateSplitAttributes(splitInfo.getToken$window_release(), this.getHighSpeedVideoFpsRangesFor.translateSplitAttributes(splitAttributes));
        } else {
            this.Camera2StreamConfigurationMap.updateSplitAttributes(splitInfo.getBinder$window_release(), this.getHighSpeedVideoFpsRangesFor.translateSplitAttributes(splitAttributes));
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final android.os.Bundle setLaunchingActivityStack(android.os.Bundle options, androidx.window.embedding.ActivityStack activityStack) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStack, "");
        this.getInputFormats.requireExtensionVersion$window_release(5);
        androidx.window.embedding.ActivityEmbeddingOptionsImpl.INSTANCE.setActivityStackToken$window_release(options, activityStack.getToken$window_release());
        return options;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final android.os.Bundle setOverlayCreateParams(android.os.Bundle options, androidx.window.embedding.OverlayCreateParams overlayCreateParams) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayCreateParams, "");
        androidx.window.embedding.ActivityEmbeddingOptionsImpl.INSTANCE.setOverlayCreateParams$window_release(options, overlayCreateParams);
        return options;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void setOverlayAttributesCalculator(kotlin.jvm.functions.Function1<? super androidx.window.embedding.OverlayAttributesCalculatorParams, androidx.window.embedding.OverlayAttributes> calculator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calculator, "");
        this.getInputFormats.requireExtensionVersion$window_release(8);
        androidx.window.embedding.OverlayControllerImpl overlayControllerImpl = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNull(overlayControllerImpl);
        overlayControllerImpl.setOverlayAttributesCalculator$window_release(calculator);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void clearOverlayAttributesCalculator() {
        this.getInputFormats.requireExtensionVersion$window_release(8);
        androidx.window.embedding.OverlayControllerImpl overlayControllerImpl = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNull(overlayControllerImpl);
        overlayControllerImpl.setOverlayAttributesCalculator$window_release(null);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void updateOverlayAttributes(java.lang.String overlayTag, androidx.window.embedding.OverlayAttributes overlayAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayAttributes, "");
        this.getInputFormats.requireExtensionVersion$window_release(8);
        androidx.window.embedding.OverlayControllerImpl overlayControllerImpl = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNull(overlayControllerImpl);
        overlayControllerImpl.updateOverlayAttributes$window_release(overlayTag, overlayAttributes);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void addOverlayInfoCallback(java.lang.String overlayTag, java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.window.embedding.OverlayInfo> overlayInfoCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayTag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayInfoCallback, "");
        androidx.window.embedding.OverlayControllerImpl overlayControllerImpl = this.getOutputMinFrameDuration;
        if (overlayControllerImpl != null) {
            overlayControllerImpl.addOverlayInfoCallback(overlayTag, executor, overlayInfoCallback);
        } else {
            overlayInfoCallback.accept(new androidx.window.embedding.OverlayInfo(overlayTag, null, null));
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void removeOverlayInfoCallback(androidx.core.util.Consumer<androidx.window.embedding.OverlayInfo> overlayInfoCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overlayInfoCallback, "");
        androidx.window.embedding.OverlayControllerImpl overlayControllerImpl = this.getOutputMinFrameDuration;
        if (overlayControllerImpl != null) {
            overlayControllerImpl.removeOverlayInfoCallback(overlayInfoCallback);
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void addEmbeddedActivityWindowInfoCallbackForActivity(android.app.Activity activity, androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.window.embedding.ActivityWindowInfoCallbackController activityWindowInfoCallbackController = this.getHighResolutionOutputSizeshNQ4ISI;
        if (activityWindowInfoCallbackController != null) {
            activityWindowInfoCallbackController.addCallback(activity, callback);
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public final void removeEmbeddedActivityWindowInfoCallbackForActivity(androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        androidx.window.embedding.ActivityWindowInfoCallbackController activityWindowInfoCallbackController = this.getHighResolutionOutputSizeshNQ4ISI;
        if (activityWindowInfoCallbackController != null) {
            activityWindowInfoCallbackController.removeCallback(callback);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "<init>", "()V", "DEBUG", "", "TAG", "", "isEmbeddingAvailable", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "emptyActivityEmbeddingProxy", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEmbeddingAvailable() {
            try {
                java.lang.ClassLoader classLoader = androidx.window.embedding.EmbeddingCompat.class.getClassLoader();
                if (classLoader == null) {
                    return false;
                }
                androidx.window.core.ConsumerAdapter consumerAdapter = new androidx.window.core.ConsumerAdapter(classLoader);
                androidx.window.extensions.WindowExtensions windowExtensions = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowExtensions, "");
                return new androidx.window.embedding.SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent() != null;
            } catch (java.lang.NoClassDefFoundError | java.lang.UnsupportedOperationException unused) {
                return false;
            }
        }

        public final androidx.window.extensions.embedding.ActivityEmbeddingComponent embeddingComponent() {
            if (isEmbeddingAvailable()) {
                java.lang.ClassLoader classLoader = androidx.window.embedding.EmbeddingCompat.class.getClassLoader();
                if (classLoader != null) {
                    androidx.window.core.ConsumerAdapter consumerAdapter = new androidx.window.core.ConsumerAdapter(classLoader);
                    androidx.window.extensions.WindowExtensions windowExtensions = androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowExtensions, "");
                    androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent = new androidx.window.embedding.SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent();
                    if (activityEmbeddingComponent != null) {
                        return activityEmbeddingComponent;
                    }
                }
                return getHighSpeedVideoFpsRangesFor();
            }
            return getHighSpeedVideoFpsRangesFor();
        }

        private final androidx.window.extensions.embedding.ActivityEmbeddingComponent getHighSpeedVideoFpsRangesFor() {
            java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(androidx.window.embedding.EmbeddingCompat.class.getClassLoader(), new java.lang.Class[]{androidx.window.extensions.embedding.ActivityEmbeddingComponent.class}, new java.lang.reflect.InvocationHandler() { // from class: androidx.window.embedding.EmbeddingCompat$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.reflect.InvocationHandler
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.window.embedding.EmbeddingCompat.Companion.Camera2StreamConfigurationMap(obj, method, objArr);
                    return Camera2StreamConfigurationMap;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNull(newProxyInstance, "");
            return (androidx.window.extensions.embedding.ActivityEmbeddingComponent) newProxyInstance;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.Unit Camera2StreamConfigurationMap(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
            return kotlin.Unit.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
