package com.paypal.oslo.feature.verificationcapture.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/ActivityRetainedDataModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/verificationcapture/data/repository/IdCaptureRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "bindIdCaptureRepository", "(Lcom/paypal/oslo/feature/verificationcapture/data/repository/IdCaptureRepositoryImpl;)Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public abstract class ActivityRetainedDataModule {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.verificationcapture.di.ActivityRetainedDataModule.Companion INSTANCE = new com.paypal.oslo.feature.verificationcapture.di.ActivityRetainedDataModule.Companion(null);

    @dagger.Binds
    public abstract com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository bindIdCaptureRepository(com.paypal.oslo.feature.verificationcapture.data.repository.IdCaptureRepositoryImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/di/ActivityRetainedDataModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonDocumentCaptureDataSource;", "provideDaonDocumentCaptureDataSource", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/verificationcapture/data/datasource/DaonDocumentCaptureDataSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @dagger.Provides
        public final com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource provideDaonDocumentCaptureDataSource(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.paypal.oslo.feature.verificationcapture.data.datasource.DaonDocumentCaptureDataSource(context, null, 2, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
