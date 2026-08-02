package com.ingo.sdk.android.ux.feature.transaction.capture_check_images;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001e\u0010\u001e\u001a\f\u0012\b\u0012\u0006*\u00020!0!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\""}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/capture_check_images/CaptureVoidImageFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "getHighSpeedVideoSizes", "[B", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/ImageBitmap;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "", "Lcom/ingo/sdk/android/ux/feature/transaction/capture_check_images/CaptureVoidImageViewModelImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/android/ux/feature/transaction/capture_check_images/CaptureVoidImageViewModelImpl;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResultLauncher;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CaptureVoidImageFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.view.result.ActivityResultLauncher<android.content.Intent> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private byte[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl getHighSpeedVideoFpsRangesFor = new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    public CaptureVoidImageFragment() {
        androidx.view.result.ActivityResultLauncher<android.content.Intent> registerForActivityResult = registerForActivityResult(new androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult(), new androidx.view.result.ActivityResultCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda5
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.m10678$r8$lambda$7YBaJ01Blm3UWewviESgVCvNeg(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this, (androidx.view.result.ActivityResult) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "");
        this.getHighResolutionOutputSizeshNQ4ISI = registerForActivityResult;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureVoidImage;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment = this;
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(captureVoidImageFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$customerExitVoidFragment(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
            }
        });
        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl = this.getHighSpeedVideoFpsRangesFor;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(captureVoidImageFragment, captureVoidImageViewModelImpl.getVoidImageResponse(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.$r8$lambda$LBib392bsnS4sD1y_JzaBhtDDj4(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this, (com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(captureVoidImageFragment, captureVoidImageViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreate$2$2(this));
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1688779042, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment getHighSpeedVideoFpsRanges;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.MutableState mutableState;
                    androidx.compose.runtime.MutableState mutableState2;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        mutableState = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                        final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment = this.getHighSpeedVideoFpsRanges;
                        kotlin.jvm.functions.Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR (r2v0 'function0' kotlin.jvm.functions.Function0) = 
                              (r12v5 'captureVoidImageFragment' com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment):void (m)] (LINE:5174) call: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            androidx.compose.runtime.Composer r11 = (androidx.compose.runtime.Composer) r11
                            java.lang.Number r12 = (java.lang.Number) r12
                            int r12 = r12.intValue()
                            r12 = r12 & 11
                            r0 = 2
                            if (r12 != r0) goto L17
                            boolean r12 = r11.getSkipping()
                            if (r12 == 0) goto L17
                            r11.skipToGroupEnd()
                            goto L5e
                        L17:
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.runtime.MutableState r1 = com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$getProgressShowing$p(r12)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r2 = new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            r2.<init>(r12)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r3 = new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.ui.platform.ComposeView r0 = r10.getHighSpeedVideoSizes
                            r3.<init>(r12, r0)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2 r4 = new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            r4.<init>(r12)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3 r5 = new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            r5.<init>(r12)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.runtime.MutableState r6 = com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$getVoidImageData$p(r12)
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.runtime.MutableState r7 = r12.getFailure()
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.runtime.MutableState r8 = r12.getFailureAction()
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment r12 = r10.getHighSpeedVideoFpsRanges
                            androidx.compose.runtime.MutableState r9 = r12.getRetryAction()
                            com.ingo.sdk.android.ux.viewprovider.CaptureVoidImageFragmentViewProvider r12 = new com.ingo.sdk.android.ux.viewprovider.CaptureVoidImageFragmentViewProvider
                            r0 = r12
                            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                            int r0 = com.ingo.sdk.android.ux.viewprovider.CaptureVoidImageFragmentViewProvider.$stable
                            r12.View(r11, r0)
                        L5e:
                            kotlin.Unit r11 = kotlin.Unit.INSTANCE
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
                        androidx.compose.runtime.MutableState mutableState;
                        mutableState = captureVoidImageFragment.getHighSpeedVideoSizes;
                        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            captureVoidImageFragment.trackNavigationPressed();
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$customerExitVoidFragment(captureVoidImageFragment);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
                        androidx.compose.runtime.MutableState mutableState;
                        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl;
                        java.lang.String transactionReferenceNumberFromArgs;
                        byte[] bArr;
                        com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$trackSubmitVoidImage(captureVoidImageFragment);
                        mutableState = captureVoidImageFragment.getHighSpeedVideoSizes;
                        mutableState.setValue(java.lang.Boolean.TRUE);
                        captureVoidImageViewModelImpl = captureVoidImageFragment.getHighSpeedVideoFpsRangesFor;
                        transactionReferenceNumberFromArgs = captureVoidImageFragment.getTransactionReferenceNumberFromArgs();
                        bArr = captureVoidImageFragment.Camera2StreamConfigurationMap;
                        java.lang.String encodeToString = android.util.Base64.encodeToString(bArr, 0);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
                        captureVoidImageViewModelImpl.uploadVoidImage(transactionReferenceNumberFromArgs, encodeToString);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
                        androidx.compose.runtime.MutableState mutableState;
                        androidx.view.result.ActivityResultLauncher activityResultLauncher;
                        android.content.Intent buildMiSnapIntent;
                        mutableState = captureVoidImageFragment.getHighSpeedVideoSizes;
                        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.access$trackCaptureVoidPressed(captureVoidImageFragment);
                            activityResultLauncher = captureVoidImageFragment.getHighResolutionOutputSizeshNQ4ISI;
                            buildMiSnapIntent = captureVoidImageFragment.buildMiSnapIntent(com.miteksystems.misnap.core.MiSnapSettings.UseCase.CHECK_FRONT);
                            activityResultLauncher.launch(buildMiSnapIntent);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        androidx.compose.runtime.MutableState mutableState;
                        mutableState = captureVoidImageFragment.getHighSpeedVideoSizes;
                        if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            captureVoidImageFragment.trackMenuPressed();
                            com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_captureVoidImageFragment_to_moreMenuFragment, null, null, null, 14, null);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.getHighSpeedVideoFpsRanges = captureVoidImageFragment;
                        this.getHighSpeedVideoSizes = composeView;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                        if (obj != null) {
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2020544282, true, new com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        /* renamed from: $r8$lambda$7YBaJ01Blm-3UWewviESgVCvNeg, reason: not valid java name */
        public static /* synthetic */ void m10678$r8$lambda$7YBaJ01Blm3UWewviESgVCvNeg(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment, androidx.view.result.ActivityResult activityResult) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityResult, "");
            int i = 0;
            for (java.lang.Object obj : com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.getResults()) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result result = (com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result) obj;
                if (result instanceof com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Success) {
                    captureVoidImageFragment.trackMiSnapSuccess(com.ingo.sdk.kotlin.common.analytics.IPropertyValues.CheckFront);
                    com.miteksystems.misnap.workflow.MiSnapFinalResult result2 = ((com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Success) result).getResult();
                    if (result2 instanceof com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) {
                        byte[] jpegImage = ((com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession) result2).getJpegImage();
                        captureVoidImageFragment.Camera2StreamConfigurationMap = jpegImage;
                        androidx.compose.runtime.MutableState<androidx.compose.ui.graphics.ImageBitmap> mutableState = captureVoidImageFragment.getHighSpeedVideoFpsRanges;
                        android.graphics.Bitmap bitmapFromBytes = captureVoidImageFragment.bitmapFromBytes(jpegImage);
                        mutableState.setValue(bitmapFromBytes != null ? androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(bitmapFromBytes) : null);
                    } else {
                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error Invoking MiTek Document Capture, Did Not Result In Document Session: ".concat(java.lang.String.valueOf(result)), null, null, 6, null);
                    }
                } else if (result instanceof com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error) {
                    com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error error = (com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result.Error) result;
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error Invoking MiTek Document Capture: ".concat(java.lang.String.valueOf(error.getErrorResult())), null, null, 6, null);
                    captureVoidImageFragment.onMisnapError(error, com.ingo.sdk.kotlin.common.analytics.IPropertyValues.CheckFront);
                } else {
                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error Invoking MiTek Document Capture: ".concat(java.lang.String.valueOf(result)), null, null, 6, null);
                    captureVoidImageFragment.onMisnapError(null, com.ingo.sdk.kotlin.common.analytics.IPropertyValues.CheckFront);
                }
                i++;
            }
            com.miteksystems.misnap.workflow.MiSnapWorkflowActivity.Result.INSTANCE.clearResults();
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$EB7mQtvF84RDXKOToXmI3dt4TPs(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            captureVoidImageFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$LBib392bsnS4sD1y_JzaBhtDDj4(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment, com.ingo.sdk.kotlin.common.features.void_image.model.VoidImageResponse voidImageResponse) {
            android.os.Bundle arguments = captureVoidImageFragment.getArguments();
            if (arguments != null) {
                arguments.putBoolean(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_IS_FROM_VOID, true);
            }
            com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(captureVoidImageFragment), com.ingo.sdk.android.R.id.action_captureVoidImageFragment_to_transaction_in_review_fragment, captureVoidImageFragment.getArguments(), null, null, 12, null);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$bLFWJ2YlGzMv03VP4RtGa_0NTvg(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl = captureVoidImageFragment.getHighSpeedVideoFpsRangesFor;
            java.lang.String transactionReferenceNumberFromArgs = captureVoidImageFragment.getTransactionReferenceNumberFromArgs();
            java.lang.String encodeToString = android.util.Base64.encodeToString(captureVoidImageFragment.Camera2StreamConfigurationMap, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            captureVoidImageViewModelImpl.uploadVoidImage(transactionReferenceNumberFromArgs, encodeToString);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$fjpdNDd3i0DbqYbDR-hyWcTUe20, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m10679$r8$lambda$fjpdNDd3i0DbqYbDRhyWcTUe20(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageViewModelImpl captureVoidImageViewModelImpl = captureVoidImageFragment.getHighSpeedVideoFpsRangesFor;
            java.lang.String transactionReferenceNumberFromArgs = captureVoidImageFragment.getTransactionReferenceNumberFromArgs();
            java.lang.String encodeToString = android.util.Base64.encodeToString(captureVoidImageFragment.Camera2StreamConfigurationMap, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            captureVoidImageViewModelImpl.uploadVoidImage(transactionReferenceNumberFromArgs, encodeToString);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$gioMKIzvZdfvve4yoXq6LvD_KeI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            captureVoidImageFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$ku2ujJDOsWIhkBHKjDcp3ozr4hs(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            captureVoidImageFragment.trackDialogDismissPressed();
            captureVoidImageFragment.getFailure().setValue(null);
            captureVoidImageFragment.getFailureAction().setValue(null);
            return kotlin.Unit.INSTANCE;
        }

        public static final /* synthetic */ void access$customerExitVoidFragment(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            android.os.Bundle arguments = captureVoidImageFragment.getArguments();
            java.lang.String string = arguments != null ? arguments.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE) : null;
            if (string != null) {
                kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                json.getSerializersModule();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(captureVoidImageFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, ((com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageRequiredResponse.INSTANCE.serializer(), string)).getTransaction().getTransactionReferenceNumber(), null, 4, null);
                return;
            }
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(captureVoidImageFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, null, null, 4, null);
        }

        public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
            captureVoidImageFragment.getHighSpeedVideoSizes.setValue(java.lang.Boolean.FALSE);
            if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
                java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
                if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                    com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable = (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable;
                    if (apiErrorThrowable.getErrorResponse() instanceof com.ingo.sdk.kotlin.common.core.http.response.ImagePersistenceFailureResponse) {
                        captureVoidImageFragment.getFailure().setValue(failure);
                        captureVoidImageFragment.getFailureAction().setValue(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.$r8$lambda$ku2ujJDOsWIhkBHKjDcp3ozr4hs(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
                            }
                        });
                        return;
                    } else {
                        captureVoidImageFragment.exitOnUnplannedApiError(failure, com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, apiErrorThrowable, captureVoidImageFragment.getTransactionReferenceNumberFromArgs());
                        return;
                    }
                }
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(captureVoidImageFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.$r8$lambda$bLFWJ2YlGzMv03VP4RtGa_0NTvg(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.$r8$lambda$EB7mQtvF84RDXKOToXmI3dt4TPs(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
                    }
                }, com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, false, captureVoidImageFragment.getTransactionReferenceNumberFromArgs(), 8, null);
                return;
            }
            com.ingo.sdk.android.common.core.platform.SdkComposeFragment.handleUnplannedExceptionWithRetry$default(captureVoidImageFragment, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.m10679$r8$lambda$fjpdNDd3i0DbqYbDRhyWcTUe20(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.$r8$lambda$gioMKIzvZdfvve4yoXq6LvD_KeI(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment.this);
                }
            }, com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, false, captureVoidImageFragment.getTransactionReferenceNumberFromArgs(), 8, null);
        }

        public static final /* synthetic */ void access$trackCaptureVoidPressed(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(captureVoidImageFragment.getTransactionReferenceNumberFromArgs());
                defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureVoidImage);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.CaptureVoidFrontImagePressed, defaultProperties);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackSubmitVoidImage(com.ingo.sdk.android.ux.feature.transaction.capture_check_images.CaptureVoidImageFragment captureVoidImageFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(captureVoidImageFragment.getTransactionReferenceNumberFromArgs());
                defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.CaptureVoidImage);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.SubmitVoidedCheck, defaultProperties);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
    }
