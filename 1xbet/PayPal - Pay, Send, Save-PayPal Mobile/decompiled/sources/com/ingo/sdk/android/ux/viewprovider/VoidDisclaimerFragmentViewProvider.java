package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B½\u0001\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0002\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR(\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00028\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001e"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/VoidDisclaimerFragmentViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "Lkotlin/Function0;", "", "failureAction", "retryAction", "navigationClicked", "nextClicked", "moreMenuClicked", "", "progressShowing", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/VoidDisclaimer;", "voidDisclaimer", "openAppSettings", "showLocationDeniedDialog", "showLocationRationaleDialog", "launchPermissionRequest", "<init>", "(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Lcom/ingo/sdk/kotlin/common/features/configuration/model/VoidDisclaimer;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/ingo/sdk/kotlin/common/features/configuration/model/VoidDisclaimer;", "getOutputFormats", "getInputFormats", "getOutputMinFrameDuration"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VoidDisclaimerFragmentViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizesFor;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputMinFrameDuration;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction;

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> getFailure() {
        return this.failure;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getFailureAction() {
        return this.failureAction;
    }

    @Override // com.ingo.sdk.android.core.ux.composable.IngoComposable
    public final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> getRetryAction() {
        return this.retryAction;
    }

    public /* synthetic */ VoidDisclaimerFragmentViewProvider(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.MutableState mutableState3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.MutableState mutableState4, com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer, kotlin.jvm.functions.Function0 function04, androidx.compose.runtime.MutableState mutableState5, androidx.compose.runtime.MutableState mutableState6, kotlin.jvm.functions.Function0 function05, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableState, mutableState2, mutableState3, function0, function02, function03, mutableState4, voidDisclaimer, function04, mutableState5, mutableState6, (i & 2048) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function05);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoidDisclaimerFragmentViewProvider(androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState2, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4, com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer, kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState5, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState6, kotlin.jvm.functions.Function0<kotlin.Unit> function05) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voidDisclaimer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function05, "");
        this.failure = mutableState;
        this.failureAction = mutableState2;
        this.retryAction = mutableState3;
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = function02;
        this.getHighResolutionOutputSizeshNQ4ISI = function03;
        this.getHighSpeedVideoSizes = mutableState4;
        this.getHighSpeedVideoFpsRangesFor = voidDisclaimer;
        this.getOutputFormats = function04;
        this.getHighSpeedVideoSizesFor = mutableState5;
        this.getOutputMinFrameDuration = mutableState6;
        this.getInputSizeshNQ4ISI = function05;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1306542601);
        java.lang.Object[] objArr = new java.lang.Object[0];
        startRestartGroup.startReplaceGroup(1849434622);
        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.runtime.MutableState mutableStateOf$default;
                    mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    return mutableStateOf$default;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceGroup();
        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.m5464rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) null, (java.lang.String) null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, com.datadog.android.BuildConfig.SDK_VERSION_CODE, 6);
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
        if (obj != null) {
            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(32988347, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
                        currentTheme = com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.this.currentTheme(composer3, 8);
                        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(186225023, true, new com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.this), composer3, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1888000074, true, new com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.this, mutableState), composer3, 54), composer3, 805306416, 444);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider getHighSpeedVideoSizes;

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        androidx.compose.runtime.MutableState mutableState;
                        androidx.compose.runtime.Composer composer2 = composer;
                        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                            mutableState = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
                            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                final com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider = this.getHighSpeedVideoSizes;
                                kotlin.jvm.functions.Function0 function0 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR (r2v1 'function0' kotlin.jvm.functions.Function0) = 
                                      (r3v0 'voidDisclaimerFragmentViewProvider' com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider A[DONT_INLINE])
                                     A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider):void (m)] (LINE:3068) call: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 27 more
                                    */
                                /*
                                    this = this;
                                    r0 = r15
                                    r12 = r16
                                    androidx.compose.runtime.Composer r12 = (androidx.compose.runtime.Composer) r12
                                    r1 = r17
                                    java.lang.Number r1 = (java.lang.Number) r1
                                    int r1 = r1.intValue()
                                    r1 = r1 & 11
                                    r2 = 2
                                    if (r1 != r2) goto L1c
                                    boolean r1 = r12.getSkipping()
                                    if (r1 == 0) goto L1c
                                    r12.skipToGroupEnd()
                                    goto L4c
                                L1c:
                                    com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider r1 = r0.getHighSpeedVideoSizes
                                    androidx.compose.runtime.MutableState r1 = com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.access$getProgressShowing$p(r1)
                                    java.lang.Object r1 = r1.getValue()
                                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                                    boolean r1 = r1.booleanValue()
                                    if (r1 != 0) goto L4c
                                    r1 = 0
                                    com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0 r2 = new com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda0
                                    com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider r3 = r0.getHighSpeedVideoSizes
                                    r2.<init>(r3)
                                    r3 = 0
                                    r4 = 0
                                    r5 = 0
                                    r7 = 0
                                    com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda1 r8 = new com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$1$$ExternalSyntheticLambda1
                                    com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider r9 = r0.getHighSpeedVideoSizes
                                    r8.<init>(r9)
                                    r9 = 0
                                    r10 = 1
                                    r11 = 0
                                    r13 = 100663296(0x6000000, float:2.4074124E-35)
                                    r14 = 701(0x2bd, float:9.82E-43)
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
                                L4c:
                                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }

                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                androidx.compose.runtime.MutableState mutableState;
                                kotlin.jvm.functions.Function0 function0;
                                mutableState = voidDisclaimerFragmentViewProvider.getHighSpeedVideoSizes;
                                if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                    function0 = voidDisclaimerFragmentViewProvider.getHighSpeedVideoFpsRanges;
                                    function0.invoke();
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                androidx.compose.runtime.MutableState mutableState;
                                kotlin.jvm.functions.Function0 function0;
                                mutableState = voidDisclaimerFragmentViewProvider.getHighSpeedVideoSizes;
                                if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                    function0 = voidDisclaimerFragmentViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                    function0.invoke();
                                }
                                return kotlin.Unit.INSTANCE;
                            }

                            AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                this.getHighSpeedVideoSizes = voidDisclaimerFragmentViewProvider;
                            }
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                            final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
                            final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider getHighSpeedVideoSizes;

                            @Override // kotlin.jvm.functions.Function3
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                                com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer;
                                com.ingo.sdk.kotlin.common.features.configuration.model.VoidDisclaimer voidDisclaimer2;
                                androidx.compose.runtime.MutableState mutableState;
                                androidx.compose.runtime.MutableState mutableState2;
                                androidx.compose.runtime.MutableState mutableState3;
                                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4;
                                java.lang.String str;
                                androidx.compose.runtime.MutableState mutableState5;
                                int i;
                                kotlin.jvm.functions.Function0<kotlin.Unit> function0;
                                androidx.compose.runtime.MutableState mutableState6;
                                androidx.compose.runtime.MutableState mutableState7;
                                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                                androidx.compose.runtime.Composer composer2 = composer;
                                int intValue = num.intValue();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                                if ((intValue & 14) == 0) {
                                    intValue |= composer2.changed(paddingValues2) ? 4 : 2;
                                }
                                if ((intValue & 91) != 18 || !composer2.getSkipping()) {
                                    androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), paddingValues2);
                                    final com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider = this.getHighSpeedVideoSizes;
                                    androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState8 = this.getHighSpeedVideoFpsRangesFor;
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, padding);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                        m5299constructorimpl2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                        m5299constructorimpl2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, verticalScroll$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.25f, false, 2, null), composer2, 0);
                                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f));
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                                    int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor4);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                        m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                        m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.ingo.sdk.android.ux.R.drawable.ic_alert_status_icon, composer2, 0);
                                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_voided_check_alert_content_description, composer2, 0);
                                    currentTheme = voidDisclaimerFragmentViewProvider.currentTheme(composer2, 8);
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.IngoIcon(painterResource, stringResource, 120, android.graphics.Color.parseColor(currentTheme.getAlertColor()), null, false, null, composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 112);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                    voidDisclaimer = voidDisclaimerFragmentViewProvider.getHighSpeedVideoFpsRangesFor;
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, voidDisclaimer.getTitle(), com.ingo.sdk.android.core.ux.theme.TypeKt.getIngoTypography().getHeadlineSmall(), androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 0, 241);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f)), composer2, 6);
                                    composer2.startReplaceGroup(2086630912);
                                    voidDisclaimer2 = voidDisclaimerFragmentViewProvider.getHighSpeedVideoFpsRangesFor;
                                    java.util.Iterator<T> it = voidDisclaimer2.getDisclaimers().iterator();
                                    while (it.hasNext()) {
                                        com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10646PrimaryTextDw6XN6w(null, (java.lang.String) it.next(), null, androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk(), null, 0, 0L, 0, composer2, 0, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(8.0f)), composer2, 6);
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.endNode();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 0.75f, false, 2, null), composer2, 0);
                                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.ingo.sdk.android.ux.R.string.ingo_begin_review, composer2, 0);
                                    kotlin.jvm.functions.Function0 function02 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0399: CONSTRUCTOR (r3v29 'function02' kotlin.jvm.functions.Function0) = 
                                          (r11v0 'voidDisclaimerFragmentViewProvider' com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider A[DONT_INLINE])
                                         A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider):void (m)] (LINE:9124) call: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$2$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 21 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 1430
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$View$1.AnonymousClass2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                }

                                public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState2;
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    mutableState.setValue(bool);
                                    mutableState2 = voidDisclaimerFragmentViewProvider.getHighSpeedVideoSizesFor;
                                    mutableState2.setValue(bool);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState;
                                    kotlin.jvm.functions.Function0 function0;
                                    mutableState = voidDisclaimerFragmentViewProvider.getOutputMinFrameDuration;
                                    mutableState.setValue(java.lang.Boolean.FALSE);
                                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "LAUNCHING PERMISSION REQUEST", null, 2, null);
                                    function0 = voidDisclaimerFragmentViewProvider.getInputSizeshNQ4ISI;
                                    function0.invoke();
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
                                    com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState2;
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    mutableState.setValue(bool);
                                    mutableState2 = voidDisclaimerFragmentViewProvider.getOutputMinFrameDuration;
                                    mutableState2.setValue(bool);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState;
                                    mutableState = voidDisclaimerFragmentViewProvider.getHighSpeedVideoSizesFor;
                                    mutableState.setValue(java.lang.Boolean.FALSE);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    kotlin.jvm.functions.Function0 function0;
                                    function0 = voidDisclaimerFragmentViewProvider.Camera2StreamConfigurationMap;
                                    function0.invoke();
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState2;
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    mutableState.setValue(bool);
                                    mutableState2 = voidDisclaimerFragmentViewProvider.getOutputMinFrameDuration;
                                    mutableState2.setValue(bool);
                                    return kotlin.Unit.INSTANCE;
                                }

                                public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.MutableState mutableState, com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider) {
                                    androidx.compose.runtime.MutableState mutableState2;
                                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                                    mutableState.setValue(bool);
                                    mutableState2 = voidDisclaimerFragmentViewProvider.getHighSpeedVideoSizesFor;
                                    mutableState2.setValue(bool);
                                    return kotlin.Unit.INSTANCE;
                                }

                                AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
                                    this.getHighSpeedVideoSizes = voidDisclaimerFragmentViewProvider;
                                    this.getHighSpeedVideoFpsRangesFor = mutableState;
                                }
                            }
                        }, startRestartGroup, 54), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.$r8$lambda$z2YXfR3uoouOFGc1Kt2HUhgaZHo(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                }

                public static /* synthetic */ kotlin.Unit $r8$lambda$z2YXfR3uoouOFGc1Kt2HUhgaZHo(com.ingo.sdk.android.ux.viewprovider.VoidDisclaimerFragmentViewProvider voidDisclaimerFragmentViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
                    voidDisclaimerFragmentViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return kotlin.Unit.INSTANCE;
                }
            }
