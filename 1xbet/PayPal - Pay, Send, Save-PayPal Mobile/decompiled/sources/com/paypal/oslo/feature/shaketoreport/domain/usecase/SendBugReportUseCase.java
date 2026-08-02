package com.paypal.oslo.feature.shaketoreport.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/usecase/SendBugReportUseCase;", "", "Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "bugReportRepository", "<init>", "(Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;)V", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "issueData", "Ljava/io/File;", "file", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "invoke", "(Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SendBugReportUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SendBugReportUseCase(com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository bugReportRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugReportRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = bugReportRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.shaketoreport.domain.usecase.SendBugReportUseCase sendBugReportUseCase, com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            file = null;
        }
        return sendBugReportUseCase.invoke(issueData, file, continuation);
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.shaketoreport.domain.BugReportError, com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.sendBugReport(issueData, file, continuation);
    }
}
