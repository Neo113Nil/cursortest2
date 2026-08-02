package com.ingo.sdk.kotlin.common.features.customer_enrollment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentRepositoryImpl;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentRepository;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentApi;", "customerEnrollmentApi", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "locationProvider", "<init>", "(Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentApi;Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;)V", "", "ssn", "dob", "mobilePhoneNumber", "Lcom/ingo/sdk/kotlin/common/core/functional/Either;", "Lcom/ingo/sdk/kotlin/common/core/exception/Failure;", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/model/CustomerEnrollmentResponse;", "completeEnrollment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/ingo/sdk/kotlin/common/features/customer_enrollment/CustomerEnrollmentApi;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;", "getLocationProvider", "()Lcom/ingo/sdk/kotlin/common/features/location/LocationProvider;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CustomerEnrollmentRepositoryImpl implements com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi getHighSpeedVideoFpsRanges;
    private final com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider;

    public CustomerEnrollmentRepositoryImpl(com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi customerEnrollmentApi, com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerEnrollmentApi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationProvider, "");
        this.getHighSpeedVideoFpsRanges = customerEnrollmentApi;
        this.locationProvider = locationProvider;
    }

    public final com.ingo.sdk.kotlin.common.features.location.LocationProvider getLocationProvider() {
        return this.locationProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r11 != r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completeEnrollment(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.ingo.sdk.kotlin.common.core.functional.Either<? extends com.ingo.sdk.kotlin.common.core.exception.Failure, com.ingo.sdk.kotlin.common.features.customer_enrollment.model.CustomerEnrollmentResponse>> continuation) {
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1 customerEnrollmentRepositoryImpl$completeEnrollment$1;
        int i;
        if (continuation instanceof com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1) {
            customerEnrollmentRepositoryImpl$completeEnrollment$1 = (com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1) continuation;
            if ((customerEnrollmentRepositoryImpl$completeEnrollment$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                customerEnrollmentRepositoryImpl$completeEnrollment$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1 customerEnrollmentRepositoryImpl$completeEnrollment$12 = customerEnrollmentRepositoryImpl$completeEnrollment$1;
                java.lang.Object obj = customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.ingo.sdk.kotlin.common.features.location.LocationProvider locationProvider = this.locationProvider;
                    customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighResolutionOutputSizeshNQ4ISI = str;
                    customerEnrollmentRepositoryImpl$completeEnrollment$12.Camera2StreamConfigurationMap = str2;
                    customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoSizes = str3;
                    customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoFpsRanges = 1;
                    obj = locationProvider.getLocationData(customerEnrollmentRepositoryImpl$completeEnrollment$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    str3 = (java.lang.String) customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoSizes;
                    str2 = (java.lang.String) customerEnrollmentRepositoryImpl$completeEnrollment$12.Camera2StreamConfigurationMap;
                    str = (java.lang.String) customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi customerEnrollmentApi = this.getHighSpeedVideoFpsRanges;
                customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighResolutionOutputSizeshNQ4ISI = null;
                customerEnrollmentRepositoryImpl$completeEnrollment$12.Camera2StreamConfigurationMap = null;
                customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoSizes = null;
                customerEnrollmentRepositoryImpl$completeEnrollment$12.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object completeEnrollment = customerEnrollmentApi.completeEnrollment(str, str2, str3, (com.ingo.sdk.kotlin.common.features.location.LocationData) obj, customerEnrollmentRepositoryImpl$completeEnrollment$12);
                return completeEnrollment != coroutine_suspended ? coroutine_suspended : completeEnrollment;
            }
        }
        customerEnrollmentRepositoryImpl$completeEnrollment$1 = new com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1(this, continuation);
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentRepositoryImpl$completeEnrollment$1 customerEnrollmentRepositoryImpl$completeEnrollment$122 = customerEnrollmentRepositoryImpl$completeEnrollment$1;
        java.lang.Object obj2 = customerEnrollmentRepositoryImpl$completeEnrollment$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customerEnrollmentRepositoryImpl$completeEnrollment$122.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        com.ingo.sdk.kotlin.common.features.customer_enrollment.CustomerEnrollmentApi customerEnrollmentApi2 = this.getHighSpeedVideoFpsRanges;
        customerEnrollmentRepositoryImpl$completeEnrollment$122.getHighResolutionOutputSizeshNQ4ISI = null;
        customerEnrollmentRepositoryImpl$completeEnrollment$122.Camera2StreamConfigurationMap = null;
        customerEnrollmentRepositoryImpl$completeEnrollment$122.getHighSpeedVideoSizes = null;
        customerEnrollmentRepositoryImpl$completeEnrollment$122.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object completeEnrollment2 = customerEnrollmentApi2.completeEnrollment(str, str2, str3, (com.ingo.sdk.kotlin.common.features.location.LocationData) obj2, customerEnrollmentRepositoryImpl$completeEnrollment$122);
        if (completeEnrollment2 != coroutine_suspended2) {
        }
    }
}
