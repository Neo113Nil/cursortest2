package com.paypal.oslo.feature.shaketoreport.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "issueData", "Ljava/io/File;", "file", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportError;", "Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportSuccess;", "sendBugReport", "(Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BugReportRepository {
    java.lang.Object sendBugReport(com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.shaketoreport.domain.BugReportError, com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object sendBugReport$default(com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository bugReportRepository, com.paypal.oslo.feature.shaketoreport.domain.IssueData issueData, java.io.File file, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendBugReport");
        }
        if ((i & 2) != 0) {
            file = null;
        }
        return bugReportRepository.sendBugReport(issueData, file, continuation);
    }
}
