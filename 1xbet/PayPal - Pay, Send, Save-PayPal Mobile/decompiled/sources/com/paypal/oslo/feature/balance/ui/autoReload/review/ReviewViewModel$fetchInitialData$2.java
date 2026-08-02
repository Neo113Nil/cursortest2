package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2", f = "ReviewViewModel.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, m = "invokeSuspend", n = {"raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ReviewViewModel$fetchInitialData$2$1", "raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ReviewViewModel$fetchInitialData$2$1", "raise$iv$iv$iv", "$this$invokeSuspend_u24lambda_u240", "balanceIdResult", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ReviewViewModel$fetchInitialData$2$1"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, s = {"L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes11.dex */
final class ReviewViewModel$fetchInitialData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel getOutputSizeshNQ4ISI;

    /* JADX WARN: Can't wrap try/catch for region: R(12:(8:55|56|57|58|59|60|61|62)|64|65|67|68|69|70|71|72|73|(2:78|79)|81) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:53|54|(8:55|56|57|58|59|60|61|62)|63|64|65|67|68|69|70|71|72|73|(2:78|79)|81) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:2)|(1:(1:(1:(72:7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|67|68|69|70|71|72|73|(2:78|79)|81|82|(2:84|(7:85|(1:87)(1:121)|(1:89)|90|(2:92|(3:96|(4:99|(3:101|102|(2:107|108))(1:118)|116|97)|119))|120|109))(2:122|(2:124|(1:125))(2:129|130))|112|113)(2:292|293))(7:294|295|296|297|298|(70:300|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|67|68|69|70|71|72|73|(3:75|78|79)|81|82|(0)(0)|112|113)|301))(4:307|308|309|310))(4:324|325|(1:327)|301)|311|312|(3:314|298|(0))|301|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04d5, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04e7, code lost:
    
        r14.complete();
        r5 = r1.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(r3, r14)).getAll());
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04d2, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x04db, code lost:
    
        r14.complete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04e2, code lost:
    
        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04e4, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04d7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x04ff, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x050f, code lost:
    
        r2.complete();
        r5 = arrow.core.raise.RaiseKt.raisedOrRethrow(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x050b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x050c, code lost:
    
        r19 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0588, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0589, code lost:
    
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0584, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0585, code lost:
    
        r1 = r0;
        r4 = r15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x055b A[Catch: all -> 0x0489, RaiseCancellationException -> 0x048c, TryCatch #33 {RaiseCancellationException -> 0x048c, all -> 0x0489, blocks: (B:63:0x049c, B:73:0x0518, B:75:0x055b, B:78:0x0562, B:79:0x056a, B:81:0x056b, B:146:0x050f, B:149:0x0503, B:150:0x050a, B:172:0x0481, B:173:0x0488, B:169:0x0493, B:65:0x04a7, B:72:0x04fa, B:137:0x04db, B:138:0x04e2, B:134:0x04e7), top: B:53:0x0416, inners: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x05b4  */
    /* JADX WARN: Type inference failed for: r13v21, types: [arrow.core.raise.Raise] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r41v10, types: [arrow.core.raise.DefaultRaise] */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v90 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        arrow.core.raise.DefaultRaise defaultRaise;
        java.lang.Throwable th;
        arrow.core.raise.DefaultRaise defaultRaise2;
        arrow.core.raise.RaiseCancellationException raiseCancellationException;
        java.lang.Object obj2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value2;
        com.paypal.oslo.feature.balance.ui.autoReload.model.FundingInstrumentUi highResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.balance.ui.autoReload.model.ReviewDisclaimerType highSpeedVideoFpsRanges;
        boolean z;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore copy2;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel;
        com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase getAccountTypeUseCase;
        java.lang.Object first;
        arrow.core.raise.DefaultRaise defaultRaise3;
        int i;
        int i2;
        int i3;
        arrow.core.raise.DefaultRaise defaultRaise4;
        java.lang.String str;
        int i4;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel2;
        java.lang.Object highSpeedVideoFpsRangesFor;
        int i5;
        int i6;
        int i7;
        arrow.core.raise.Raise raise;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel3;
        int i8;
        arrow.core.Either either;
        java.lang.Object Camera2StreamConfigurationMap;
        arrow.core.Either either2;
        arrow.core.raise.DefaultRaise defaultRaise5;
        arrow.core.raise.DefaultRaise defaultRaise6;
        arrow.core.raise.RaiseAccumulate raiseAccumulate;
        arrow.core.raise.DefaultRaise defaultRaise7;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow;
        arrow.core.raise.RaiseAccumulate raiseAccumulate2;
        arrow.core.raise.DefaultRaise defaultRaise8;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow2;
        arrow.core.raise.RaiseAccumulate raiseAccumulate3;
        arrow.core.raise.DefaultRaise defaultRaise9;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow3;
        arrow.core.raise.RaiseAccumulate raiseAccumulate4;
        arrow.core.raise.DefaultRaise defaultRaise10;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow4;
        arrow.core.raise.RaiseAccumulate raiseAccumulate5;
        arrow.core.raise.DefaultRaise defaultRaise11;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow5;
        arrow.core.raise.RaiseAccumulate raiseAccumulate6;
        arrow.core.raise.DefaultRaise defaultRaise12;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow6;
        arrow.core.raise.RaiseAccumulate raiseAccumulate7;
        arrow.core.raise.DefaultRaise defaultRaise13;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow7;
        arrow.core.raise.RaiseAccumulate raiseAccumulate8;
        arrow.core.raise.DefaultRaise defaultRaise14;
        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow8;
        arrow.core.raise.DefaultRaise defaultRaise15;
        arrow.core.raise.RaiseAccumulate raiseAccumulate9;
        arrow.core.raise.RaiseAccumulate.Value latestError;
        arrow.core.raise.DefaultRaise defaultRaise16;
        arrow.core.raise.DefaultRaise defaultRaise17;
        arrow.core.raise.DefaultRaise defaultRaise18;
        arrow.core.raise.DefaultRaise defaultRaise19;
        arrow.core.raise.DefaultRaise defaultRaise20;
        arrow.core.raise.DefaultRaise defaultRaise21;
        arrow.core.raise.DefaultRaise defaultRaise22;
        arrow.core.raise.DefaultRaise defaultRaise23;
        arrow.core.raise.DefaultRaise defaultRaise24;
        arrow.core.raise.DefaultRaise defaultRaise25;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.getOutputSizes;
        ?? r4 = 3;
        ?? r42 = 3;
        try {
        } catch (arrow.core.raise.RaiseCancellationException e) {
            e = e;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        if (i9 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            reviewViewModel = this.getOutputSizeshNQ4ISI;
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            arrow.core.raise.DefaultRaise defaultRaise26 = new arrow.core.raise.DefaultRaise(false);
            arrow.core.raise.DefaultRaise defaultRaise27 = defaultRaise26;
            getAccountTypeUseCase = reviewViewModel.getHighSpeedVideoSizesFor;
            kotlinx.coroutines.flow.Flow<java.lang.Boolean> invoke = getAccountTypeUseCase.invoke();
            this.getOutputFormats = reviewViewModel;
            this.getHighSpeedVideoSizesFor = str2;
            this.getInputSizeshNQ4ISI = defaultRaise26;
            this.getOutputMinFrameDuration = defaultRaise27;
            this.getInputFormats = reviewViewModel;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getOutputSizes = 1;
            first = kotlinx.coroutines.flow.FlowKt.first(invoke, this);
            if (first != coroutine_suspended) {
                defaultRaise3 = defaultRaise26;
                i = 0;
                i2 = 0;
                i3 = 0;
                defaultRaise4 = defaultRaise27;
                str = str2;
                i4 = 0;
                reviewViewModel2 = reviewViewModel;
            }
            return coroutine_suspended;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                int i10 = this.getHighSpeedVideoFpsRangesFor;
                int i11 = this.Camera2StreamConfigurationMap;
                i5 = this.getHighSpeedVideoFpsRanges;
                i6 = this.getHighResolutionOutputSizeshNQ4ISI;
                arrow.core.raise.Raise raise2 = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
                arrow.core.raise.DefaultRaise defaultRaise28 = (arrow.core.raise.DefaultRaise) this.getInputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoSizesFor;
                reviewViewModel3 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel) this.getOutputFormats;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    i7 = i10;
                    i8 = i11;
                    raise = raise2;
                    defaultRaise3 = defaultRaise28;
                    highSpeedVideoFpsRangesFor = obj;
                    either = (arrow.core.Either) highSpeedVideoFpsRangesFor;
                    this.getOutputFormats = defaultRaise3;
                    this.getHighSpeedVideoSizesFor = raise;
                    this.getInputSizeshNQ4ISI = either;
                    this.getOutputMinFrameDuration = null;
                    this.getHighResolutionOutputSizeshNQ4ISI = i6;
                    this.getHighSpeedVideoFpsRanges = i5;
                    this.Camera2StreamConfigurationMap = i8;
                    this.getHighSpeedVideoFpsRangesFor = i7;
                    this.getOutputSizes = 3;
                    Camera2StreamConfigurationMap = reviewViewModel3.Camera2StreamConfigurationMap(str, this);
                } catch (arrow.core.raise.RaiseCancellationException e2) {
                    raiseCancellationException = e2;
                    defaultRaise2 = defaultRaise28;
                    defaultRaise2.complete();
                    obj2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise2));
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel4 = this.getOutputSizeshNQ4ISI;
                    if (!(obj2 instanceof arrow.core.Either.Right)) {
                    }
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    defaultRaise = defaultRaise28;
                    defaultRaise.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                if (Camera2StreamConfigurationMap != coroutine_suspended) {
                    either2 = either;
                    arrow.core.Either either3 = (arrow.core.Either) Camera2StreamConfigurationMap;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate10 = new arrow.core.raise.RaiseAccumulate(raise);
                    raiseAccumulate = raiseAccumulate10;
                    defaultRaise7 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise29 = defaultRaise7;
                    defaultRaise25 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise30 = defaultRaise25;
                    raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok((java.lang.String) new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate, defaultRaise29), defaultRaise30, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }).bind(either2));
                    defaultRaise25.complete();
                    defaultRaise7.complete();
                    arrow.core.raise.RaiseAccumulate.Value value3 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow;
                    raiseAccumulate2 = raiseAccumulate10;
                    defaultRaise8 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise31 = defaultRaise8;
                    defaultRaise24 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise32 = defaultRaise24;
                    raisedOrRethrow2 = new arrow.core.raise.RaiseAccumulate.Ok((java.util.List) new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise31), defaultRaise32, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    }).bind(either3));
                    defaultRaise24.complete();
                    defaultRaise8.complete();
                    arrow.core.raise.RaiseAccumulate.Value value4 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow2;
                    raiseAccumulate3 = raiseAccumulate10;
                    defaultRaise9 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise33 = defaultRaise9;
                    defaultRaise23 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise34 = defaultRaise23;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise33), defaultRaise34, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$3
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow3 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise23.complete();
                    defaultRaise9.complete();
                    arrow.core.raise.RaiseAccumulate.Value value5 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow3;
                    raiseAccumulate4 = raiseAccumulate10;
                    defaultRaise10 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise35 = defaultRaise10;
                    defaultRaise22 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise36 = defaultRaise22;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate4, defaultRaise35), defaultRaise36, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$4
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow4 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise22.complete();
                    defaultRaise10.complete();
                    arrow.core.raise.RaiseAccumulate.Value value6 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow4;
                    raiseAccumulate5 = raiseAccumulate10;
                    defaultRaise11 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise37 = defaultRaise11;
                    defaultRaise21 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise38 = defaultRaise21;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate5, defaultRaise37), defaultRaise38, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$5
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow5 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise21.complete();
                    defaultRaise11.complete();
                    arrow.core.raise.RaiseAccumulate.Value value7 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow5;
                    raiseAccumulate6 = raiseAccumulate10;
                    defaultRaise12 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise39 = defaultRaise12;
                    defaultRaise20 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise40 = defaultRaise20;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate6, defaultRaise39), defaultRaise40, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$6
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow6 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise20.complete();
                    defaultRaise12.complete();
                    arrow.core.raise.RaiseAccumulate.Value value8 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow6;
                    raiseAccumulate7 = raiseAccumulate10;
                    defaultRaise13 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise41 = defaultRaise13;
                    defaultRaise19 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise42 = defaultRaise19;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate7, defaultRaise41), defaultRaise42, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$7
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow7 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise19.complete();
                    defaultRaise13.complete();
                    arrow.core.raise.RaiseAccumulate.Value value9 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow7;
                    raiseAccumulate8 = raiseAccumulate10;
                    defaultRaise14 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise43 = defaultRaise14;
                    defaultRaise16 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise44 = defaultRaise16;
                    defaultRaise17 = defaultRaise3;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate8, defaultRaise43), defaultRaise44, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$8
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    raisedOrRethrow8 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise16.complete();
                    defaultRaise18 = defaultRaise17;
                    defaultRaise14.complete();
                    obj = defaultRaise18;
                    arrow.core.raise.RaiseAccumulate.Value value10 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow8;
                    arrow.core.raise.RaiseAccumulate raiseAccumulate11 = raiseAccumulate10;
                    defaultRaise15 = new arrow.core.raise.DefaultRaise(false);
                    arrow.core.raise.DefaultRaise defaultRaise45 = defaultRaise15;
                    arrow.core.raise.DefaultRaise defaultRaise46 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.DefaultRaise defaultRaise47 = defaultRaise46;
                    raiseAccumulate9 = raiseAccumulate10;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate11, defaultRaise45), defaultRaise47, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$9
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow9 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise46.complete();
                    defaultRaise15.complete();
                    java.lang.Object value11 = value3.getValue();
                    java.lang.Object value12 = value4.getValue();
                    java.lang.Object value13 = value5.getValue();
                    java.lang.Object value14 = value6.getValue();
                    java.lang.Object value15 = value7.getValue();
                    java.lang.Object value16 = value8.getValue();
                    java.lang.Object value17 = value9.getValue();
                    java.lang.Object value18 = value10.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData((java.lang.String) value11, (java.util.List) value12);
                    if (raiseAccumulate9.hasErrors()) {
                        latestError.getValue();
                        throw new kotlin.KotlinNothingValueException();
                    }
                    obj.complete();
                    obj2 = new arrow.core.Either.Right(initialData);
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel42 = this.getOutputSizeshNQ4ISI;
                    if (!(obj2 instanceof arrow.core.Either.Right)) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            either2 = (arrow.core.Either) this.getInputSizeshNQ4ISI;
            raise = (arrow.core.raise.Raise) this.getHighSpeedVideoSizesFor;
            arrow.core.raise.DefaultRaise defaultRaise48 = (arrow.core.raise.DefaultRaise) this.getOutputFormats;
            kotlin.ResultKt.throwOnFailure(obj);
            defaultRaise3 = defaultRaise48;
            Camera2StreamConfigurationMap = obj;
            try {
                arrow.core.Either either32 = (arrow.core.Either) Camera2StreamConfigurationMap;
                arrow.core.raise.RaiseAccumulate raiseAccumulate102 = new arrow.core.raise.RaiseAccumulate(raise);
                raiseAccumulate = raiseAccumulate102;
                defaultRaise7 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise292 = defaultRaise7;
                    defaultRaise25 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise302 = defaultRaise25;
                        raisedOrRethrow = new arrow.core.raise.RaiseAccumulate.Ok((java.lang.String) new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate, defaultRaise292), defaultRaise302, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }).bind(either2));
                        defaultRaise25.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e3) {
                        defaultRaise25.complete();
                        raisedOrRethrow = raiseAccumulate.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e3, defaultRaise25)).getAll());
                    } catch (java.lang.Throwable th4) {
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th4);
                    }
                    defaultRaise7.complete();
                } catch (arrow.core.raise.RaiseCancellationException e4) {
                    defaultRaise7.complete();
                    raisedOrRethrow = arrow.core.raise.RaiseKt.raisedOrRethrow(e4, defaultRaise7);
                } catch (java.lang.Throwable th5) {
                    defaultRaise7.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th5);
                }
                arrow.core.raise.RaiseAccumulate.Value value32 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow;
                raiseAccumulate2 = raiseAccumulate102;
                defaultRaise8 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise312 = defaultRaise8;
                    defaultRaise24 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise322 = defaultRaise24;
                        raisedOrRethrow2 = new arrow.core.raise.RaiseAccumulate.Ok((java.util.List) new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate2, defaultRaise312), defaultRaise322, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$2
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        }).bind(either32));
                        defaultRaise24.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e5) {
                        defaultRaise24.complete();
                        raisedOrRethrow2 = raiseAccumulate2.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e5, defaultRaise24)).getAll());
                    } catch (java.lang.Throwable th6) {
                        defaultRaise24.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th6);
                    }
                    defaultRaise8.complete();
                } catch (arrow.core.raise.RaiseCancellationException e6) {
                    defaultRaise8.complete();
                    raisedOrRethrow2 = arrow.core.raise.RaiseKt.raisedOrRethrow(e6, defaultRaise8);
                } catch (java.lang.Throwable th7) {
                    defaultRaise8.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th7);
                }
                arrow.core.raise.RaiseAccumulate.Value value42 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow2;
                raiseAccumulate3 = raiseAccumulate102;
                defaultRaise9 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise332 = defaultRaise9;
                    defaultRaise23 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise342 = defaultRaise23;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate3, defaultRaise332), defaultRaise342, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        raisedOrRethrow3 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise23.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e7) {
                        defaultRaise23.complete();
                        raisedOrRethrow3 = raiseAccumulate3.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e7, defaultRaise23)).getAll());
                    } catch (java.lang.Throwable th8) {
                        defaultRaise23.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th8);
                    }
                    defaultRaise9.complete();
                } catch (arrow.core.raise.RaiseCancellationException e8) {
                    defaultRaise9.complete();
                    raisedOrRethrow3 = arrow.core.raise.RaiseKt.raisedOrRethrow(e8, defaultRaise9);
                } catch (java.lang.Throwable th9) {
                    defaultRaise9.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th9);
                }
                arrow.core.raise.RaiseAccumulate.Value value52 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow3;
                raiseAccumulate4 = raiseAccumulate102;
                defaultRaise10 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise352 = defaultRaise10;
                    defaultRaise22 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise362 = defaultRaise22;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate4, defaultRaise352), defaultRaise362, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$4
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        raisedOrRethrow4 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise22.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e9) {
                        defaultRaise22.complete();
                        raisedOrRethrow4 = raiseAccumulate4.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e9, defaultRaise22)).getAll());
                    } catch (java.lang.Throwable th10) {
                        defaultRaise22.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th10);
                    }
                    defaultRaise10.complete();
                } catch (arrow.core.raise.RaiseCancellationException e10) {
                    defaultRaise10.complete();
                    raisedOrRethrow4 = arrow.core.raise.RaiseKt.raisedOrRethrow(e10, defaultRaise10);
                } catch (java.lang.Throwable th11) {
                    defaultRaise10.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th11);
                }
                arrow.core.raise.RaiseAccumulate.Value value62 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow4;
                raiseAccumulate5 = raiseAccumulate102;
                defaultRaise11 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise372 = defaultRaise11;
                    defaultRaise21 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise382 = defaultRaise21;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate5, defaultRaise372), defaultRaise382, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$5
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        raisedOrRethrow5 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise21.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e11) {
                        defaultRaise21.complete();
                        raisedOrRethrow5 = raiseAccumulate5.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e11, defaultRaise21)).getAll());
                    } catch (java.lang.Throwable th12) {
                        defaultRaise21.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th12);
                    }
                    defaultRaise11.complete();
                } catch (arrow.core.raise.RaiseCancellationException e12) {
                    defaultRaise11.complete();
                    raisedOrRethrow5 = arrow.core.raise.RaiseKt.raisedOrRethrow(e12, defaultRaise11);
                } catch (java.lang.Throwable th13) {
                    defaultRaise11.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th13);
                }
                arrow.core.raise.RaiseAccumulate.Value value72 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow5;
                raiseAccumulate6 = raiseAccumulate102;
                defaultRaise12 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise392 = defaultRaise12;
                    defaultRaise20 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise402 = defaultRaise20;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate6, defaultRaise392), defaultRaise402, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$6
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        raisedOrRethrow6 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise20.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e13) {
                        defaultRaise20.complete();
                        raisedOrRethrow6 = raiseAccumulate6.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e13, defaultRaise20)).getAll());
                    } catch (java.lang.Throwable th14) {
                        defaultRaise20.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th14);
                    }
                    defaultRaise12.complete();
                } catch (arrow.core.raise.RaiseCancellationException e14) {
                    defaultRaise12.complete();
                    raisedOrRethrow6 = arrow.core.raise.RaiseKt.raisedOrRethrow(e14, defaultRaise12);
                } catch (java.lang.Throwable th15) {
                    defaultRaise12.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th15);
                }
                arrow.core.raise.RaiseAccumulate.Value value82 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow6;
                raiseAccumulate7 = raiseAccumulate102;
                defaultRaise13 = new arrow.core.raise.DefaultRaise(false);
                try {
                    arrow.core.raise.DefaultRaise defaultRaise412 = defaultRaise13;
                    defaultRaise19 = new arrow.core.raise.DefaultRaise(false);
                    try {
                        final arrow.core.raise.Raise defaultRaise422 = defaultRaise19;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate7, defaultRaise412), defaultRaise422, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$7
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        raisedOrRethrow7 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise19.complete();
                    } catch (arrow.core.raise.RaiseCancellationException e15) {
                        defaultRaise19.complete();
                        raisedOrRethrow7 = raiseAccumulate7.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(e15, defaultRaise19)).getAll());
                    } catch (java.lang.Throwable th16) {
                        defaultRaise19.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th16);
                    }
                    defaultRaise13.complete();
                } catch (arrow.core.raise.RaiseCancellationException e16) {
                    defaultRaise13.complete();
                    raisedOrRethrow7 = arrow.core.raise.RaiseKt.raisedOrRethrow(e16, defaultRaise13);
                } catch (java.lang.Throwable th17) {
                    defaultRaise13.complete();
                    throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th17);
                }
            } catch (arrow.core.raise.RaiseCancellationException e17) {
                e = e17;
                defaultRaise6 = defaultRaise3;
            } catch (java.lang.Throwable th18) {
                th = th18;
                defaultRaise5 = defaultRaise3;
            }
            try {
                arrow.core.raise.RaiseAccumulate.Value value92 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow7;
                raiseAccumulate8 = raiseAccumulate102;
                defaultRaise14 = new arrow.core.raise.DefaultRaise(false);
                try {
                    try {
                        try {
                            arrow.core.raise.DefaultRaise defaultRaise432 = defaultRaise14;
                            defaultRaise16 = new arrow.core.raise.DefaultRaise(false);
                            try {
                                final arrow.core.raise.Raise defaultRaise442 = defaultRaise16;
                                defaultRaise17 = defaultRaise3;
                            } catch (arrow.core.raise.RaiseCancellationException e18) {
                                e = e18;
                                defaultRaise17 = defaultRaise3;
                            } catch (java.lang.Throwable th19) {
                                th = th19;
                            }
                            try {
                                new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate8, defaultRaise432), defaultRaise442, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                        return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                        arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                });
                                raisedOrRethrow8 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                                defaultRaise16.complete();
                                defaultRaise18 = defaultRaise17;
                            } catch (arrow.core.raise.RaiseCancellationException e19) {
                                e = e19;
                                arrow.core.raise.RaiseCancellationException raiseCancellationException2 = e;
                                defaultRaise16.complete();
                                raisedOrRethrow8 = raiseAccumulate8.mo9683accumulateAllGZgkXh4(((arrow.core.NonEmptyList) arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException2, defaultRaise16)).getAll());
                                defaultRaise18 = defaultRaise17;
                                defaultRaise14.complete();
                                obj = defaultRaise18;
                                arrow.core.raise.RaiseAccumulate.Value value102 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow8;
                                arrow.core.raise.RaiseAccumulate raiseAccumulate112 = raiseAccumulate102;
                                defaultRaise15 = new arrow.core.raise.DefaultRaise(false);
                                arrow.core.raise.DefaultRaise defaultRaise452 = defaultRaise15;
                                arrow.core.raise.DefaultRaise defaultRaise462 = new arrow.core.raise.DefaultRaise(false);
                                final arrow.core.raise.Raise defaultRaise472 = defaultRaise462;
                                raiseAccumulate9 = raiseAccumulate102;
                                new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate112, defaultRaise452), defaultRaise472, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                        return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                        arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                        throw new kotlin.KotlinNothingValueException();
                                    }
                                });
                                arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow92 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                                defaultRaise462.complete();
                                defaultRaise15.complete();
                                java.lang.Object value112 = value32.getValue();
                                java.lang.Object value122 = value42.getValue();
                                java.lang.Object value132 = value52.getValue();
                                java.lang.Object value142 = value62.getValue();
                                java.lang.Object value152 = value72.getValue();
                                java.lang.Object value162 = value82.getValue();
                                java.lang.Object value172 = value92.getValue();
                                java.lang.Object value182 = value102.getValue();
                                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData2 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData((java.lang.String) value112, (java.util.List) value122);
                                if (raiseAccumulate9.hasErrors()) {
                                }
                                obj.complete();
                                obj2 = new arrow.core.Either.Right(initialData2);
                                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel422 = this.getOutputSizeshNQ4ISI;
                                if (!(obj2 instanceof arrow.core.Either.Right)) {
                                }
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th20) {
                                th = th20;
                                java.lang.Throwable th21 = th;
                                defaultRaise16.complete();
                                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th21);
                            }
                            defaultRaise14.complete();
                            obj = defaultRaise18;
                        } catch (arrow.core.raise.RaiseCancellationException e20) {
                            e = e20;
                            arrow.core.raise.RaiseCancellationException raiseCancellationException3 = e;
                            defaultRaise14.complete();
                            raisedOrRethrow8 = arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException3, defaultRaise14);
                            obj = obj;
                            arrow.core.raise.RaiseAccumulate.Value value1022 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow8;
                            arrow.core.raise.RaiseAccumulate raiseAccumulate1122 = raiseAccumulate102;
                            defaultRaise15 = new arrow.core.raise.DefaultRaise(false);
                            arrow.core.raise.DefaultRaise defaultRaise4522 = defaultRaise15;
                            arrow.core.raise.DefaultRaise defaultRaise4622 = new arrow.core.raise.DefaultRaise(false);
                            final arrow.core.raise.Raise defaultRaise4722 = defaultRaise4622;
                            raiseAccumulate9 = raiseAccumulate102;
                            new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate1122, defaultRaise4522), defaultRaise4722, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$9
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                    return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                    arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                    throw new kotlin.KotlinNothingValueException();
                                }
                            });
                            arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow922 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                            defaultRaise4622.complete();
                            defaultRaise15.complete();
                            java.lang.Object value1122 = value32.getValue();
                            java.lang.Object value1222 = value42.getValue();
                            java.lang.Object value1322 = value52.getValue();
                            java.lang.Object value1422 = value62.getValue();
                            java.lang.Object value1522 = value72.getValue();
                            java.lang.Object value1622 = value82.getValue();
                            java.lang.Object value1722 = value92.getValue();
                            java.lang.Object value1822 = value1022.getValue();
                            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData22 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData((java.lang.String) value1122, (java.util.List) value1222);
                            if (raiseAccumulate9.hasErrors()) {
                            }
                            obj.complete();
                            obj2 = new arrow.core.Either.Right(initialData22);
                            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel4222 = this.getOutputSizeshNQ4ISI;
                            if (!(obj2 instanceof arrow.core.Either.Right)) {
                            }
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th22) {
                            th = th22;
                            java.lang.Throwable th23 = th;
                            defaultRaise14.complete();
                            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th23);
                        }
                    } catch (arrow.core.raise.RaiseCancellationException e21) {
                        e = e21;
                        obj = defaultRaise3;
                        arrow.core.raise.RaiseCancellationException raiseCancellationException32 = e;
                        defaultRaise14.complete();
                        raisedOrRethrow8 = arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException32, defaultRaise14);
                        obj = obj;
                        arrow.core.raise.RaiseAccumulate.Value value10222 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow8;
                        arrow.core.raise.RaiseAccumulate raiseAccumulate11222 = raiseAccumulate102;
                        defaultRaise15 = new arrow.core.raise.DefaultRaise(false);
                        arrow.core.raise.DefaultRaise defaultRaise45222 = defaultRaise15;
                        arrow.core.raise.DefaultRaise defaultRaise46222 = new arrow.core.raise.DefaultRaise(false);
                        final arrow.core.raise.Raise defaultRaise47222 = defaultRaise46222;
                        raiseAccumulate9 = raiseAccumulate102;
                        new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate11222, defaultRaise45222), defaultRaise47222, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$9
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                                return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                                arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                                throw new kotlin.KotlinNothingValueException();
                            }
                        });
                        arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow9222 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                        defaultRaise46222.complete();
                        defaultRaise15.complete();
                        java.lang.Object value11222 = value32.getValue();
                        java.lang.Object value12222 = value42.getValue();
                        java.lang.Object value13222 = value52.getValue();
                        java.lang.Object value14222 = value62.getValue();
                        java.lang.Object value15222 = value72.getValue();
                        java.lang.Object value16222 = value82.getValue();
                        java.lang.Object value17222 = value92.getValue();
                        java.lang.Object value18222 = value10222.getValue();
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData222 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData((java.lang.String) value11222, (java.util.List) value12222);
                        if (raiseAccumulate9.hasErrors()) {
                        }
                        obj.complete();
                        obj2 = new arrow.core.Either.Right(initialData222);
                        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel42222 = this.getOutputSizeshNQ4ISI;
                        if (!(obj2 instanceof arrow.core.Either.Right)) {
                        }
                        return kotlin.Unit.INSTANCE;
                    } catch (java.lang.Throwable th24) {
                        th = th24;
                        java.lang.Throwable th232 = th;
                        defaultRaise14.complete();
                        throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th232);
                    }
                    arrow.core.raise.DefaultRaise defaultRaise452222 = defaultRaise15;
                    arrow.core.raise.DefaultRaise defaultRaise462222 = new arrow.core.raise.DefaultRaise(false);
                    final arrow.core.raise.Raise defaultRaise472222 = defaultRaise462222;
                    raiseAccumulate9 = raiseAccumulate102;
                    new arrow.core.raise.RaiseAccumulate(arrow.core.raise.RaiseKt.tolerant(raiseAccumulate11222, defaultRaise452222), defaultRaise472222, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2$invokeSuspend$lambda$0$$inlined$zipOrAccumulate$9
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3) {
                            return invoke((com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) obj3);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Void invoke(com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
                            arrow.core.raise.Raise.this.raise(arrow.core.NonEmptyList.m9567boximpl(arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.listOf(balanceErrorBottomSheetEnum))));
                            throw new kotlin.KotlinNothingValueException();
                        }
                    });
                    arrow.core.raise.RaiseAccumulate.Ok raisedOrRethrow92222 = new arrow.core.raise.RaiseAccumulate.Ok(kotlin.Unit.INSTANCE);
                    defaultRaise462222.complete();
                    defaultRaise15.complete();
                    java.lang.Object value112222 = value32.getValue();
                    java.lang.Object value122222 = value42.getValue();
                    java.lang.Object value132222 = value52.getValue();
                    java.lang.Object value142222 = value62.getValue();
                    java.lang.Object value152222 = value72.getValue();
                    java.lang.Object value162222 = value82.getValue();
                    java.lang.Object value172222 = value92.getValue();
                    java.lang.Object value182222 = value10222.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData2222 = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData((java.lang.String) value112222, (java.util.List) value122222);
                    if (raiseAccumulate9.hasErrors() && (latestError = raiseAccumulate9.getLatestError()) != null) {
                        latestError.getValue();
                        throw new kotlin.KotlinNothingValueException();
                    }
                    obj.complete();
                    obj2 = new arrow.core.Either.Right(initialData2222);
                } finally {
                    defaultRaise15.complete();
                    java.lang.Throwable nonFatalOrThrow = arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
                }
                arrow.core.raise.RaiseAccumulate.Value value102222 = (arrow.core.raise.RaiseAccumulate.Value) raisedOrRethrow8;
                arrow.core.raise.RaiseAccumulate raiseAccumulate112222 = raiseAccumulate102;
                defaultRaise15 = new arrow.core.raise.DefaultRaise(false);
            } catch (arrow.core.raise.RaiseCancellationException e22) {
                e = e22;
                defaultRaise6 = obj;
                r42 = defaultRaise6;
                raiseCancellationException = e;
                defaultRaise2 = r42;
                defaultRaise2.complete();
                obj2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise2));
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel422222 = this.getOutputSizeshNQ4ISI;
                if (!(obj2 instanceof arrow.core.Either.Right)) {
                }
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th25) {
                th = th25;
                defaultRaise5 = obj;
                r4 = defaultRaise5;
                th = th;
                defaultRaise = r4;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel4222222 = this.getOutputSizeshNQ4ISI;
            if (!(obj2 instanceof arrow.core.Either.Right)) {
                com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData initialData3 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.InitialData) ((arrow.core.Either.Right) obj2).getValue();
                java.util.List access$filterFundingInstrumentsByStrategy = com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.access$filterFundingInstrumentsByStrategy(reviewViewModel4222222, initialData3.getHighSpeedVideoFpsRangesFor);
                mutableStateFlow2 = reviewViewModel4222222.getInputFormats;
                com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption access$selectFundingInstrument = com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel.access$selectFundingInstrument(reviewViewModel4222222, access$filterFundingInstrumentsByStrategy, new java.math.BigDecimal(((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) mutableStateFlow2.getValue()).getReloadStrategy().getRechargeAmount().getAmount()));
                mutableStateFlow3 = reviewViewModel4222222.getInputFormats;
                do {
                    value2 = mutableStateFlow3.getValue();
                    com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore reviewUiStateStore = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) value2;
                    java.lang.String str3 = initialData3.getHighSpeedVideoSizes;
                    java.lang.String instrumentId = access$selectFundingInstrument != null ? access$selectFundingInstrument.getInstrumentId() : null;
                    if (instrumentId == null) {
                        instrumentId = "";
                    }
                    java.lang.String str4 = instrumentId;
                    highResolutionOutputSizeshNQ4ISI = reviewViewModel4222222.getHighResolutionOutputSizeshNQ4ISI(access$selectFundingInstrument);
                    highSpeedVideoFpsRanges = reviewViewModel4222222.getHighSpeedVideoFpsRanges(access$selectFundingInstrument);
                    if (!reviewViewModel4222222.getIsBusinessAccount()) {
                        java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list = access$filterFundingInstrumentsByStrategy;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption : list) {
                                if (fundingInstrumentOption instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) {
                                    com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption fundingInstrumentBankOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentBankOption) fundingInstrumentOption;
                                    if (fundingInstrumentBankOption.getMode() == com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode.INSTANT && fundingInstrumentBankOption.getMaximumLimit() != null) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    copy2 = reviewUiStateStore.copy((r35 & 1) != 0 ? reviewUiStateStore.reloadStrategy : null, (r35 & 2) != 0 ? reviewUiStateStore.formattedRechargeAmount : null, (r35 & 4) != 0 ? reviewUiStateStore.currencyCode : null, (r35 & 8) != 0 ? reviewUiStateStore.formattedThresholdAmount : null, (r35 & 16) != 0 ? reviewUiStateStore.startDate : null, (r35 & 32) != 0 ? reviewUiStateStore.formattedStartDate : null, (r35 & 64) != 0 ? reviewUiStateStore.formattedDayOfWeek : null, (r35 & 128) != 0 ? reviewUiStateStore.fundingInstrumentOptions : access$filterFundingInstrumentsByStrategy, (r35 & 256) != 0 ? reviewUiStateStore.hasFiInstantOptionAvailable : z, (r35 & 512) != 0 ? reviewUiStateStore.disclaimerType : highSpeedVideoFpsRanges, (r35 & 1024) != 0 ? reviewUiStateStore.selectedFundingInstrumentId : str4, (r35 & 2048) != 0 ? reviewUiStateStore.fundingInstrumentUi : highResolutionOutputSizeshNQ4ISI, (r35 & 4096) != 0 ? reviewUiStateStore.showFiSelectionSheet : false, (r35 & 8192) != 0 ? reviewUiStateStore.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? reviewUiStateStore.newlyAddedFiId : null, (r35 & 32768) != 0 ? reviewUiStateStore.state : com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready.INSTANCE, (r35 & 65536) != 0 ? reviewUiStateStore.balanceId : str3);
                } while (!mutableStateFlow3.compareAndSet(value2, copy2));
            } else {
                if (!(obj2 instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum = (com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum) kotlin.collections.CollectionsKt.first((java.util.List) arrow.core.NonEmptyList.m9567boximpl(((arrow.core.NonEmptyList) ((arrow.core.Either.Left) obj2).getValue()).getAll()));
                mutableStateFlow = reviewViewModel4222222.getInputFormats;
                do {
                    value = mutableStateFlow.getValue();
                    copy = r5.copy((r35 & 1) != 0 ? r5.reloadStrategy : null, (r35 & 2) != 0 ? r5.formattedRechargeAmount : null, (r35 & 4) != 0 ? r5.currencyCode : null, (r35 & 8) != 0 ? r5.formattedThresholdAmount : null, (r35 & 16) != 0 ? r5.startDate : null, (r35 & 32) != 0 ? r5.formattedStartDate : null, (r35 & 64) != 0 ? r5.formattedDayOfWeek : null, (r35 & 128) != 0 ? r5.fundingInstrumentOptions : null, (r35 & 256) != 0 ? r5.hasFiInstantOptionAvailable : false, (r35 & 512) != 0 ? r5.disclaimerType : null, (r35 & 1024) != 0 ? r5.selectedFundingInstrumentId : null, (r35 & 2048) != 0 ? r5.fundingInstrumentUi : null, (r35 & 4096) != 0 ? r5.showFiSelectionSheet : false, (r35 & 8192) != 0 ? r5.showNoFiSelectedAlert : false, (r35 & 16384) != 0 ? r5.newlyAddedFiId : null, (r35 & 32768) != 0 ? r5.state : new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep.FUNDING_INSTRUMENTS, balanceErrorBottomSheetEnum), (r35 & 65536) != 0 ? ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewUiStateStore) value).balanceId : null);
                } while (!mutableStateFlow.compareAndSet(value, copy));
            }
            return kotlin.Unit.INSTANCE;
        }
        i4 = this.getHighSpeedVideoFpsRangesFor;
        int i12 = this.Camera2StreamConfigurationMap;
        i2 = this.getHighSpeedVideoFpsRanges;
        i3 = this.getHighResolutionOutputSizeshNQ4ISI;
        reviewViewModel = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel) this.getInputFormats;
        ?? r13 = (arrow.core.raise.Raise) this.getOutputMinFrameDuration;
        arrow.core.raise.DefaultRaise defaultRaise49 = (arrow.core.raise.DefaultRaise) this.getInputSizeshNQ4ISI;
        java.lang.String str5 = (java.lang.String) this.getHighSpeedVideoSizesFor;
        com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel5 = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel) this.getOutputFormats;
        try {
            kotlin.ResultKt.throwOnFailure(obj);
            reviewViewModel2 = reviewViewModel5;
            i = i12;
            first = obj;
            defaultRaise4 = r13;
            str = str5;
            defaultRaise3 = defaultRaise49;
        } catch (arrow.core.raise.RaiseCancellationException e23) {
            raiseCancellationException = e23;
            defaultRaise2 = defaultRaise49;
            defaultRaise2.complete();
            obj2 = new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(raiseCancellationException, defaultRaise2));
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel42222222 = this.getOutputSizeshNQ4ISI;
            if (!(obj2 instanceof arrow.core.Either.Right)) {
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th26) {
            th = th26;
            defaultRaise = defaultRaise49;
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
        }
        reviewViewModel.isBusinessAccount = !((java.lang.Boolean) first).booleanValue();
        this.getOutputFormats = reviewViewModel2;
        this.getHighSpeedVideoSizesFor = str;
        this.getInputSizeshNQ4ISI = defaultRaise3;
        this.getOutputMinFrameDuration = defaultRaise4;
        this.getInputFormats = null;
        this.getHighResolutionOutputSizeshNQ4ISI = i3;
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = i4;
        this.getOutputSizes = 2;
        highSpeedVideoFpsRangesFor = reviewViewModel2.getHighSpeedVideoFpsRangesFor(str, this);
        if (highSpeedVideoFpsRangesFor != coroutine_suspended) {
            i5 = i2;
            i6 = i3;
            int i13 = i;
            i7 = i4;
            raise = defaultRaise4;
            reviewViewModel3 = reviewViewModel2;
            i8 = i13;
            either = (arrow.core.Either) highSpeedVideoFpsRangesFor;
            this.getOutputFormats = defaultRaise3;
            this.getHighSpeedVideoSizesFor = raise;
            this.getInputSizeshNQ4ISI = either;
            this.getOutputMinFrameDuration = null;
            this.getHighResolutionOutputSizeshNQ4ISI = i6;
            this.getHighSpeedVideoFpsRanges = i5;
            this.Camera2StreamConfigurationMap = i8;
            this.getHighSpeedVideoFpsRangesFor = i7;
            this.getOutputSizes = 3;
            Camera2StreamConfigurationMap = reviewViewModel3.Camera2StreamConfigurationMap(str, this);
            if (Camera2StreamConfigurationMap != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2(this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReviewViewModel$fetchInitialData$2(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel reviewViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewViewModel$fetchInitialData$2> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = reviewViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
