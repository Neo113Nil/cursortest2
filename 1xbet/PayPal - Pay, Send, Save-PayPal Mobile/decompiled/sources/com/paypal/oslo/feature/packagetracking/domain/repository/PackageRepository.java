package com.paypal.oslo.feature.packagetracking.domain.repository;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J6\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ6\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\f\u0010\nJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0006H¦@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001c0\u00062\u0006\u0010\u0018\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H¦@¢\u0006\u0004\b\u0018\u0010\u0017J,\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u000bH¦@¢\u0006\u0004\b!\u0010\u001eJ4\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H¦@¢\u0006\u0004\b#\u0010\nJ.\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006H¦@¢\u0006\u0004\b&\u0010\u0017J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010'\u001a\u00020\u000bH¦@¢\u0006\u0004\b(\u0010\u001eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "", "", "carrierId", "trackingNumber", "transactionNumber", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/PackageData;", "getPackageDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "removePackage", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "getAuthorizationUrl", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provider", "authorizationCode", "state", "authorizePackageTracking", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserEmailProvider", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImportedData", "Lcom/paypal/oslo/feature/packagetracking/domain/model/DeAuthorizeData;", "deAuthorize", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deAuthorizeAll", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceRefresh", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "getEmailLinkStatus", "nickname", "updatePackageNickname", "markPackageAsDelivered", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAmazonTrackingPreference", "enabled", "saveAmazonTrackingPreference"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PackageRepository {
    java.lang.Object authorizePackageTracking(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation);

    java.lang.Object deAuthorize(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData>> continuation);

    java.lang.Object deAuthorizeAll(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData>>> continuation);

    java.lang.Object deleteImportedData(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation);

    java.lang.Object getAmazonTrackingPreference(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation);

    java.lang.Object getAuthorizationUrl(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.String>> continuation);

    java.lang.Object getEmailLinkStatus(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink>>> continuation);

    java.lang.Object getPackageDetail(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation);

    java.lang.Object getUserEmailProvider(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider>> continuation);

    java.lang.Object markPackageAsDelivered(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, com.paypal.oslo.feature.packagetracking.domain.model.PackageData>> continuation);

    java.lang.Object removePackage(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation);

    java.lang.Object saveAmazonTrackingPreference(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.Boolean>> continuation);

    java.lang.Object updatePackageNickname(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, java.lang.String>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object getEmailLinkStatus$default(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEmailLinkStatus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return packageRepository.getEmailLinkStatus(z, continuation);
    }
}
