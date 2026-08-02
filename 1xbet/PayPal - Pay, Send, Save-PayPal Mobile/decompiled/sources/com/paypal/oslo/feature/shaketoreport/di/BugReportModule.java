package com.paypal.oslo.feature.shaketoreport.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H!¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH!¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH!¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/di/BugReportModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/shaketoreport/data/repository/BugReportRepositoryImpl;", "bugReportRepository", "Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "provideBugReportRepository$shake_to_report_prodRelease", "(Lcom/paypal/oslo/feature/shaketoreport/data/repository/BugReportRepositoryImpl;)Lcom/paypal/oslo/feature/shaketoreport/domain/repository/BugReportRepository;", "Lcom/paypal/oslo/feature/shaketoreport/utils/IssueDataFactoryImpl;", "factory", "Lcom/paypal/oslo/feature/shaketoreport/domain/IssueDataFactory;", "provideIssueDataFactory$shake_to_report_prodRelease", "(Lcom/paypal/oslo/feature/shaketoreport/utils/IssueDataFactoryImpl;)Lcom/paypal/oslo/feature/shaketoreport/domain/IssueDataFactory;", "Lcom/paypal/oslo/feature/shaketoreport/utils/ScreenshotConverterImpl;", "converter", "Lcom/paypal/oslo/feature/shaketoreport/domain/ScreenshotConverter;", "provideScreenshotConverter$shake_to_report_prodRelease", "(Lcom/paypal/oslo/feature/shaketoreport/utils/ScreenshotConverterImpl;)Lcom/paypal/oslo/feature/shaketoreport/domain/ScreenshotConverter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes14.dex */
public abstract class BugReportModule {
    public static final int $stable = 0;

    @dagger.Binds
    public abstract com.paypal.oslo.feature.shaketoreport.domain.repository.BugReportRepository provideBugReportRepository$shake_to_report_prodRelease(com.paypal.oslo.feature.shaketoreport.data.repository.BugReportRepositoryImpl bugReportRepository);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.shaketoreport.domain.IssueDataFactory provideIssueDataFactory$shake_to_report_prodRelease(com.paypal.oslo.feature.shaketoreport.utils.IssueDataFactoryImpl factory);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.shaketoreport.domain.ScreenshotConverter provideScreenshotConverter$shake_to_report_prodRelease(com.paypal.oslo.feature.shaketoreport.utils.ScreenshotConverterImpl converter);
}
