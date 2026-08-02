package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B§\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0005\u0012\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0005\u0012\u0014\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00058\u0015X\u0094\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b$\u0010%R(\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00058\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b&\u0010%R(\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00058\u0015X\u0095\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b'\u0010%R\"\u0010(\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-"}, d2 = {"Lcom/ingo/sdk/android/ux/viewprovider/AcceptLegalDocumentsViewProvider;", "Lcom/ingo/sdk/android/core/ux/composable/IngoComposable;", "Lkotlin/Function0;", "", "navigationClicked", "Landroidx/compose/runtime/MutableState;", "Lcom/ingo/sdk/kotlin/common/core/http/response/LegalDocument;", "legalDocumentToAccept", "", "progressShowing", "Landroidx/lifecycle/MutableLiveData;", "", "legalDocumentHtmlString", "apiStatusMessage", "acceptDocumentClicked", "declineDocumentClicked", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", com.paypal.oslo.feature.bankingbundle.data.repository.ApiTracking.RESULT_FAILURE, "failureAction", "retryAction", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/lifecycle/MutableLiveData;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", "View", "(Landroidx/compose/runtime/Composer;I)V", "getOutputMinFrameDuration", "Lkotlin/jvm/functions/Function0;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor", "getOutputFormats", "getHighSpeedVideoSizes", "Landroidx/lifecycle/MutableLiveData;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getFailure", "()Landroidx/compose/runtime/MutableState;", "getFailureAction", "getRetryAction", "cachedHtml", "Ljava/lang/String;", "getCachedHtml", "()Ljava/lang/String;", "setCachedHtml", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AcceptLegalDocumentsViewProvider extends com.ingo.sdk.android.core.ux.composable.IngoComposable {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizesFor;
    private java.lang.String cachedHtml;
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure;
    private final androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.http.response.LegalDocument> getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<java.lang.String> Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptLegalDocumentsViewProvider(kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.http.response.LegalDocument> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.view.MutableLiveData<java.lang.String> mutableLiveData, androidx.compose.runtime.MutableState<java.lang.String> mutableState3, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> mutableState4, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState5, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> mutableState6) {
        super(null, null, null, 7, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState6, "");
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
        this.getHighSpeedVideoSizes = mutableState2;
        this.Camera2StreamConfigurationMap = mutableLiveData;
        this.getHighSpeedVideoFpsRanges = mutableState3;
        this.getInputSizeshNQ4ISI = function02;
        this.getHighSpeedVideoSizesFor = function03;
        this.failure = mutableState4;
        this.failureAction = mutableState5;
        this.retryAction = mutableState6;
        this.cachedHtml = "";
    }

    public final java.lang.String getCachedHtml() {
        return this.cachedHtml;
    }

    public final void setCachedHtml(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.cachedHtml = str;
    }

    public final void View(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1894884683);
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
        if (obj != null) {
            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1854974095, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    com.ingo.sdk.kotlin.ux.IngoSdkColorTheme currentTheme;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    if ((num.intValue() & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.ui.Modifier.INSTANCE);
                        currentTheme = com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.this.currentTheme(composer3, 8);
                        androidx.compose.material3.ScaffoldKt.m3648ScaffoldTvnljyQ(imePadding, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1550778835, true, new com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.this), composer3, 54), null, null, null, 0, androidx.compose.ui.graphics.ColorKt.Color(android.graphics.Color.parseColor(currentTheme.getBackgroundColor())), 0L, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1176646398, true, new com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.this), composer3, 54), composer3, 805306416, 444);
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                    final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider getHighSpeedVideoFpsRanges;

                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                        androidx.compose.runtime.MutableState mutableState;
                        androidx.compose.runtime.MutableState mutableState2;
                        java.lang.String str;
                        androidx.compose.runtime.MutableState mutableState3;
                        androidx.compose.runtime.Composer composer2 = composer;
                        if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                            mutableState = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                                mutableState2 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
                                com.ingo.sdk.kotlin.common.core.http.response.LegalDocument legalDocument = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) mutableState2.getValue();
                                if (legalDocument == null || (str = legalDocument.getTitle()) == null) {
                                    str = "";
                                }
                                int i = com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24;
                                mutableState3 = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes;
                                boolean booleanValue = ((java.lang.Boolean) mutableState3.getValue()).booleanValue();
                                final com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider = this.getHighSpeedVideoFpsRanges;
                                com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(str, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0075: INVOKE 
                                      (r1v14 'str' java.lang.String)
                                      (wrap:kotlin.jvm.functions.Function0:0x005b: CONSTRUCTOR 
                                      (r5v0 'acceptLegalDocumentsViewProvider' com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider A[DONT_INLINE])
                                     A[MD:(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider):void (m), WRAPPED] (LINE:2065) call: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider):void type: CONSTRUCTOR)
                                      (r3v0 'i' int)
                                      (null java.lang.String)
                                      (0 long)
                                      false
                                      (null kotlin.jvm.functions.Function0)
                                      (wrap:boolean:NOT (r2v5 'booleanValue' boolean) A[WRAPPED])
                                      false
                                      (0 int)
                                      (r12v1 'composer2' androidx.compose.runtime.Composer)
                                      (wrap:int:SGET  A[WRAPPED] androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE int)
                                      (856 int)
                                     STATIC call: com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.TopAppBar-Hzv_svQ(java.lang.String, kotlin.jvm.functions.Function0, int, java.lang.String, long, boolean, kotlin.jvm.functions.Function0, boolean, boolean, int, androidx.compose.runtime.Composer, int, int):void A[MD:(java.lang.String, kotlin.jvm.functions.Function0<kotlin.Unit>, int, java.lang.String, long, boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, int, androidx.compose.runtime.Composer, int, int):void (m)] (LINE:2065) in method: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 27 more
                                    */
                                /*
                                    this = this;
                                    r0 = r16
                                    r12 = r17
                                    androidx.compose.runtime.Composer r12 = (androidx.compose.runtime.Composer) r12
                                    r1 = r18
                                    java.lang.Number r1 = (java.lang.Number) r1
                                    int r1 = r1.intValue()
                                    r1 = r1 & 11
                                    r2 = 2
                                    if (r1 != r2) goto L1d
                                    boolean r1 = r12.getSkipping()
                                    if (r1 == 0) goto L1d
                                    r12.skipToGroupEnd()
                                    goto L78
                                L1d:
                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider r1 = r0.getHighSpeedVideoFpsRanges
                                    androidx.compose.runtime.MutableState r1 = com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.access$getProgressShowing$p(r1)
                                    java.lang.Object r1 = r1.getValue()
                                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                                    boolean r1 = r1.booleanValue()
                                    if (r1 != 0) goto L78
                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider r1 = r0.getHighSpeedVideoFpsRanges
                                    androidx.compose.runtime.MutableState r1 = com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.access$getLegalDocumentToAccept$p(r1)
                                    java.lang.Object r1 = r1.getValue()
                                    com.ingo.sdk.kotlin.common.core.http.response.LegalDocument r1 = (com.ingo.sdk.kotlin.common.core.http.response.LegalDocument) r1
                                    if (r1 == 0) goto L43
                                    java.lang.String r1 = r1.getTitle()
                                    if (r1 != 0) goto L45
                                L43:
                                    java.lang.String r1 = ""
                                L45:
                                    int r3 = com.ingo.sdk.android.ux.R.drawable.ic_baseline_close_24
                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider r2 = r0.getHighSpeedVideoFpsRanges
                                    androidx.compose.runtime.MutableState r2 = com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.access$getProgressShowing$p(r2)
                                    java.lang.Object r2 = r2.getValue()
                                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                                    boolean r2 = r2.booleanValue()
                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$1$$ExternalSyntheticLambda0 r4 = new com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$1$$ExternalSyntheticLambda0
                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider r5 = r0.getHighSpeedVideoFpsRanges
                                    r4.<init>(r5)
                                    r5 = 0
                                    r6 = 0
                                    r8 = 0
                                    r9 = 0
                                    r10 = r2 ^ 1
                                    r11 = 0
                                    r13 = 0
                                    r14 = 196608(0x30000, float:2.75506E-40)
                                    r15 = 856(0x358, float:1.2E-42)
                                    r2 = r4
                                    r4 = r5
                                    r5 = r6
                                    r7 = r8
                                    r8 = r9
                                    r9 = r10
                                    r10 = r11
                                    r11 = r13
                                    r13 = r14
                                    r14 = r15
                                    com.ingo.sdk.android.core.ux.composable.IngoCoreComposablesKt.m10649TopAppBarHzv_svQ(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
                                L78:
                                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }

                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                kotlin.jvm.functions.Function0 function0;
                                function0 = acceptLegalDocumentsViewProvider.getHighResolutionOutputSizeshNQ4ISI;
                                function0.invoke();
                                return kotlin.Unit.INSTANCE;
                            }

                            AnonymousClass1(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                this.getHighSpeedVideoFpsRanges = acceptLegalDocumentsViewProvider;
                            }
                        }

                        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        /* renamed from: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                            final /* synthetic */ com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider getHighSpeedVideoSizes;

                            @Override // kotlin.jvm.functions.Function3
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                                androidx.view.MutableLiveData mutableLiveData;
                                androidx.compose.runtime.MutableState mutableState;
                                androidx.compose.runtime.MutableState mutableState2;
                                androidx.compose.runtime.MutableState mutableState3;
                                java.lang.String str;
                                java.lang.String str2;
                                androidx.compose.foundation.layout.PaddingValues paddingValues2 = paddingValues;
                                androidx.compose.runtime.Composer composer2 = composer;
                                int intValue = num.intValue();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues2, "");
                                if ((intValue & 14) == 0) {
                                    intValue |= composer2.changed(paddingValues2) ? 4 : 2;
                                }
                                if ((intValue & 91) != 18 || !composer2.getSkipping()) {
                                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, paddingValues2), 0.0f, 1, null);
                                    final com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider = this.getHighSpeedVideoSizes;
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
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
                                    androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxHeight$default);
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
                                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, weight$default);
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
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                        m5299constructorimpl3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                        m5299constructorimpl3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer2, 48);
                                    int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default2);
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
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                        m5299constructorimpl4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                        m5299constructorimpl4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, 0);
                                    int currentCompositeKeyHash5 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor5);
                                    } else {
                                        composer2.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash5))) {
                                        m5299constructorimpl5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash5));
                                        m5299constructorimpl5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    mutableLiveData = acceptLegalDocumentsViewProvider.Camera2StreamConfigurationMap;
                                    final androidx.compose.runtime.State observeAsState = androidx.compose.runtime.livedata.LiveDataAdapterKt.observeAsState(mutableLiveData, "", composer2, 56);
                                    composer2.startReplaceGroup(-1225390765);
                                    java.lang.Object value = observeAsState.getValue();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                                    if (!kotlin.text.StringsKt.isBlank((java.lang.CharSequence) value)) {
                                        androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                        composer2.startReplaceGroup(1849434622);
                                        java.lang.Object rememberedValue = composer2.rememberedValue();
                                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                            rememberedValue = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0362: CONSTRUCTOR (r1v85 'rememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:7417) call: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.2.invoke(androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda1, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 33 more
                                                */
                                            /*
                                                Method dump skipped, instructions count: 1375
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.AnonymousClass2.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                                        }

                                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider, androidx.compose.runtime.State state, final android.webkit.WebView webView) {
                                            androidx.view.MutableLiveData mutableLiveData;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "");
                                            java.lang.String cachedHtml = acceptLegalDocumentsViewProvider.getCachedHtml();
                                            mutableLiveData = acceptLegalDocumentsViewProvider.Camera2StreamConfigurationMap;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(cachedHtml, mutableLiveData.getValue())) {
                                                java.lang.Object value = state.getValue();
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
                                                acceptLegalDocumentsViewProvider.setCachedHtml((java.lang.String) value);
                                                webView.post(
                                                /*  JADX ERROR: Method code generation error
                                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0028: INVOKE 
                                                      (r5v0 'webView' android.webkit.WebView)
                                                      (wrap:java.lang.Runnable:0x0025: CONSTRUCTOR 
                                                      (r5v0 'webView' android.webkit.WebView A[DONT_INLINE])
                                                      (r3v0 'acceptLegalDocumentsViewProvider' com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider A[DONT_INLINE])
                                                     A[MD:(android.webkit.WebView, com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider):void (m), WRAPPED] (LINE:1112) call: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda0.<init>(android.webkit.WebView, com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider):void type: CONSTRUCTOR)
                                                     VIRTUAL call: android.view.View.post(java.lang.Runnable):boolean A[MD:(java.lang.Runnable):boolean (c)] (LINE:1112) in method: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.2.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider, androidx.compose.runtime.State, android.webkit.WebView):kotlin.Unit, file: classes9.dex
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
                                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                    	... 21 more
                                                    */
                                                /*
                                                    java.lang.String r0 = ""
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                                                    java.lang.String r1 = r3.getCachedHtml()
                                                    androidx.lifecycle.MutableLiveData r2 = com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.access$getLegalDocumentHtmlString$p(r3)
                                                    java.lang.Object r2 = r2.getValue()
                                                    boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                                                    if (r1 != 0) goto L2b
                                                    java.lang.Object r4 = r4.getValue()
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
                                                    java.lang.String r4 = (java.lang.String) r4
                                                    r3.setCachedHtml(r4)
                                                    com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda0 r4 = new com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1$2$$ExternalSyntheticLambda0
                                                    r4.<init>(r5, r3)
                                                    r5.post(r4)
                                                L2b:
                                                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                                                    return r3
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$View$1.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider, androidx.compose.runtime.State, android.webkit.WebView):kotlin.Unit");
                                            }

                                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor() {
                                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Dismiss Action Clicked But Empty", null, 2, null);
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                                kotlin.jvm.functions.Function0 function0;
                                                function0 = acceptLegalDocumentsViewProvider.getInputSizeshNQ4ISI;
                                                function0.invoke();
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(android.webkit.WebView webView, com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "POSTING LOAD DATA", null, 2, null);
                                                webView.loadDataWithBaseURL(null, acceptLegalDocumentsViewProvider.getCachedHtml(), "text/html", "UTF-8", null);
                                            }

                                            public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                                kotlin.jvm.functions.Function0 function0;
                                                function0 = acceptLegalDocumentsViewProvider.getHighSpeedVideoSizesFor;
                                                function0.invoke();
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public static /* synthetic */ android.webkit.WebView getHighSpeedVideoSizes(android.content.Context context) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                                                return new android.webkit.WebView(context);
                                            }

                                            AnonymousClass2(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider) {
                                                this.getHighSpeedVideoSizes = acceptLegalDocumentsViewProvider;
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                                return com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.m10708$r8$lambda$IqDH0YNBNq4us9ThykE7n3Tng(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider.this, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }

                            /* renamed from: $r8$lambda$I-qDH0YNBNq4us9T-hykE7n3Tng, reason: not valid java name */
                            public static /* synthetic */ kotlin.Unit m10708$r8$lambda$IqDH0YNBNq4us9ThykE7n3Tng(com.ingo.sdk.android.ux.viewprovider.AcceptLegalDocumentsViewProvider acceptLegalDocumentsViewProvider, int i, androidx.compose.runtime.Composer composer, int i2) {
                                acceptLegalDocumentsViewProvider.View(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                return kotlin.Unit.INSTANCE;
                            }
                        }
