package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statements/StatementError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2", f = "StatementsRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, 131}, m = "invokeSuspend", n = {"$this$withContext", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-StatementsRepositoryImpl$downloadStatement$2$1", "$this$withContext", "$this$invokeSuspend_u24lambda_u240", "response", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "$i$a$-runCatching-StatementsRepositoryImpl$downloadStatement$2$1"}, nl = {125, 138}, s = {"L$0", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class StatementsRepositoryImpl$downloadStatement$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError, ? extends java.lang.String>>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    private /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e7 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x001e, B:8:0x00e1, B:10:0x00e7, B:11:0x010a, B:18:0x00f9, B:20:0x00fd, B:21:0x010f, B:22:0x0114, B:26:0x003d, B:27:0x006e, B:29:0x0076, B:31:0x0083, B:33:0x008c, B:35:0x0096, B:40:0x004a), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9 A[Catch: all -> 0x0116, TryCatch #0 {all -> 0x0116, blocks: (B:7:0x001e, B:8:0x00e1, B:10:0x00e7, B:11:0x010a, B:18:0x00f9, B:20:0x00fd, B:21:0x010f, B:22:0x0114, B:26:0x003d, B:27:0x006e, B:29:0x0076, B:31:0x0083, B:33:0x008c, B:35:0x0096, B:40:0x004a), top: B:2:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.revolvingcreditservicing.data.api.StatementService statementService;
        int i;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.paypal.oslo.feature.revolvingcreditservicing.data.storage.FileStorage fileStorage;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        kotlinx.coroutines.CoroutineScope coroutineScope2 = (kotlinx.coroutines.CoroutineScope) this.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.getInputFormats;
        try {
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            statementsRepositoryImpl = this.getOutputFormats;
            str = this.getHighSpeedVideoSizes;
            str2 = this.Camera2StreamConfigurationMap;
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            statementService = statementsRepositoryImpl.Camera2StreamConfigurationMap;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope2);
            this.getHighSpeedVideoFpsRanges = statementsRepositoryImpl;
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoSizesFor = str2;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope2);
            i = 0;
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getInputFormats = 1;
            obj = statementService.getStatementDetailsPDF(str, str2, this);
            if (obj != coroutine_suspended) {
                coroutineScope = coroutineScope2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            either = (arrow.core.Either) obj;
            if (!(either instanceof arrow.core.Either.Left)) {
                right = new arrow.core.Either.Left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.FileWriteError.INSTANCE);
            } else {
                if (!(either instanceof arrow.core.Either.Right)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(right);
            return kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) == null ? arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.Network.INSTANCE) : m23436constructorimpl;
        }
        i = this.getHighSpeedVideoFpsRangesFor;
        coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputMinFrameDuration;
        str2 = (java.lang.String) this.getHighSpeedVideoSizesFor;
        str = (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI;
        statementsRepositoryImpl = (com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl) this.getHighSpeedVideoFpsRanges;
        kotlin.ResultKt.throwOnFailure(obj);
        retrofit2.Response response = (retrofit2.Response) obj;
        if (!response.isSuccessful()) {
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl.access$mapHttpError(statementsRepositoryImpl, response.code()));
        }
        final okhttp3.ResponseBody responseBody = (okhttp3.ResponseBody) response.body();
        if (responseBody == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError.Unknown(null));
        }
        fileStorage = statementsRepositoryImpl.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("statement_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(".pdf");
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.functions.Function1<? super java.io.OutputStream, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj3) {
                kotlin.Unit highSpeedVideoFpsRangesFor;
                highSpeedVideoFpsRangesFor = com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2.getHighSpeedVideoFpsRangesFor(okhttp3.ResponseBody.this, (java.io.OutputStream) obj3);
                return highSpeedVideoFpsRangesFor;
            }
        };
        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope2);
        this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(response);
        this.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(responseBody);
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getInputFormats = 2;
        obj = fileStorage.saveFile("downloads", obj2, function1, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        either = (arrow.core.Either) obj;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(right);
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(okhttp3.ResponseBody responseBody, java.io.OutputStream outputStream) {
        java.io.InputStream byteStream = responseBody.byteStream();
        try {
            kotlin.io.ByteStreamsKt.copyTo(byteStream, outputStream, 8192);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(byteStream, null);
            return kotlin.Unit.INSTANCE;
        } finally {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statements.StatementError, ? extends java.lang.String>> continuation) {
        return ((com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2 statementsRepositoryImpl$downloadStatement$2 = new com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2(this.getOutputFormats, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        statementsRepositoryImpl$downloadStatement$2.getInputSizeshNQ4ISI = obj;
        return statementsRepositoryImpl$downloadStatement$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StatementsRepositoryImpl$downloadStatement$2(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl statementsRepositoryImpl, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.StatementsRepositoryImpl$downloadStatement$2> continuation) {
        super(2, continuation);
        this.getOutputFormats = statementsRepositoryImpl;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
    }
}
