package com.paypal.oslo.feature.packagetracking.data.source;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/source/PackageLocalDataSource;", "", "<init>", "()V", "", "packageId", "carrierId", "transactionNumber", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "getPackageDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "", "removePackage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageLocalDataSource {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PackageLocalDataSource() {
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.PackageData getPackageDetail(java.lang.String packageId, java.lang.String carrierId, java.lang.String transactionNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierId, "");
        throw new kotlin.NotImplementedError("PackageLocalDataSource is not implemented for production");
    }

    public final boolean removePackage(java.lang.String packageId, java.lang.String carrierId, java.lang.String transactionNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierId, "");
        throw new kotlin.NotImplementedError("PackageLocalDataSource is not implemented for production");
    }
}
