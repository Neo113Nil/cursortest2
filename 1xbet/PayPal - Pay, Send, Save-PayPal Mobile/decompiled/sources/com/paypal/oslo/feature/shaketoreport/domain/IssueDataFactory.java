package com.paypal.oslo.feature.shaketoreport.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/IssueDataFactory;", "", "", "title", "frequency", "stepsToReproduce", "agileTeamName", "activityName", "employeeEmail", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IssueDataFactory {
    com.paypal.oslo.feature.shaketoreport.domain.IssueData create(java.lang.String title, java.lang.String frequency, java.lang.String stepsToReproduce, java.lang.String agileTeamName, java.lang.String activityName, java.lang.String employeeEmail);
}
