package com.paypal.oslo.feature.shaketoreport.utils;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/utils/IssueDataFactoryImpl;", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueDataFactory;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "title", "frequency", "stepsToReproduce", "agileTeamName", "activityName", "employeeEmail", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "create", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shaketoreport/domain/IssueData;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IssueDataFactoryImpl implements com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public IssueDataFactoryImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory
    public final com.paypal.oslo.feature.shaketoreport.domain.IssueData create(java.lang.String title, java.lang.String frequency, java.lang.String stepsToReproduce, java.lang.String agileTeamName, java.lang.String activityName, java.lang.String employeeEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stepsToReproduce, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agileTeamName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(employeeEmail, "");
        return com.paypal.oslo.feature.shaketoreport.utils.DeviceInfoUtilKt.createIssueDataWithDeviceInfo$default(this.getHighSpeedVideoFpsRangesFor, title, frequency, stepsToReproduce, agileTeamName, activityName, null, null, employeeEmail, 96, null);
    }
}
