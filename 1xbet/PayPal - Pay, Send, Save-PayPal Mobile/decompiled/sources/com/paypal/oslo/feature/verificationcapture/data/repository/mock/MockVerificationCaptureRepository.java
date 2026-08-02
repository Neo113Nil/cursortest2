package com.paypal.oslo.feature.verificationcapture.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0013\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0015\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n0\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0016H\u0096@¢\u0006\u0004\b\u001e\u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0096@¢\u0006\u0004\b \u0010\u001cR\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/data/repository/mock/MockVerificationCaptureRepository;", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/VerificationCaptureRepository;", "<init>", "()V", "", "imageBytes", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;", "documentType", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;", "documentSide", "", "", "metadata", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/CaptureResult;", "uploadDocument", "([BLcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentSide;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentFileUpload;", "files", "uploadMultipleFiles", "(Ljava/util/List;Lcom/paypal/oslo/feature/verificationcapture/domain/model/DocumentType;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "documentId", "Lkotlin/Result;", "", "removeDocument-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDocument", "getSessionInfo-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionInfo", "initializeSession-IoAF18A", "initializeSession", "completeSession-IoAF18A", "completeSession", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MockVerificationCaptureRepository implements com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public MockVerificationCaptureRepository() {
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    public final java.lang.Object uploadDocument(byte[] bArr, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentSide documentSide, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess("mock_doc_".concat(java.lang.String.valueOf(java.util.UUID.randomUUID())), "SUCCESS", null, 4, null);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    public final java.lang.Object uploadMultipleFiles(java.util.List<com.paypal.oslo.feature.verificationcapture.domain.model.DocumentFileUpload> list, com.paypal.oslo.feature.verificationcapture.domain.model.DocumentType documentType, java.util.Map<java.lang.String, java.lang.String> map, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult> continuation) {
        return new com.paypal.oslo.feature.verificationcapture.domain.model.CaptureResult.UploadSuccess("mock_batch_doc_".concat(java.lang.String.valueOf(java.util.UUID.randomUUID())), "SUCCESS", null, 4, null);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: removeDocument-gIAlu-s */
    public final java.lang.Object mo20603removeDocumentgIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: getSessionInfo-IoAF18A */
    public final java.lang.Object mo20601getSessionInfoIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.Map<java.lang.String, java.lang.String>>> continuation) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        if (str == null) {
            str = "";
        }
        pairArr[0] = kotlin.TuplesKt.to("session_id", str);
        pairArr[1] = kotlin.TuplesKt.to("status", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE);
        return kotlin.Result.m23436constructorimpl(kotlin.collections.MapsKt.mapOf(pairArr));
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: initializeSession-IoAF18A */
    public final java.lang.Object mo20602initializeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> continuation) {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        this.getHighSpeedVideoFpsRanges = obj;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(obj);
    }

    @Override // com.paypal.oslo.feature.verificationcapture.domain.repository.VerificationCaptureRepository
    /* renamed from: completeSession-IoAF18A */
    public final java.lang.Object mo20600completeSessionIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        this.getHighSpeedVideoFpsRanges = null;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
    }
}
