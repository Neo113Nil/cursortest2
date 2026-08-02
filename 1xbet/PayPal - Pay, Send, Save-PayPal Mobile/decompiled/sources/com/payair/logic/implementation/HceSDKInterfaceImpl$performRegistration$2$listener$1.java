package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000b"}, d2 = {"Lcom/payair/logic/implementation/HceSDKInterfaceImpl$performRegistration$2$listener$1;", "Lcom/payair/hce/HCERegisterListener;", "", "errorCode", "", "onRegisterOperationUnsuccessful", "(Ljava/lang/Integer;)V", "Lcom/payair/hce/communication/JsonResponse;", "response", "(Lcom/payair/hce/communication/JsonResponse;)V", "onDeviceAuthenticationUnsuccessful", "()V", "onRegistrationCompleted", "onGetCertOperationUnsuccessful", "onGeneratePublicKeyUnsuccessful"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HceSDKInterfaceImpl$performRegistration$2$listener$1 implements com.payair.hce.HCERegisterListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.SafeContinuation f4441a;

    public HceSDKInterfaceImpl$performRegistration$2$listener$1(kotlin.coroutines.SafeContinuation safeContinuation) {
        this.f4441a = safeContinuation;
    }

    @Override // com.payair.hce.HCERegisterListener
    public final void onDeviceAuthenticationUnsuccessful() {
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onDeviceAuthenticationUnsuccessful", null, null, 6, null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.payair.model.Response.Error(102, null, 2, null)));
    }

    @Override // com.payair.hce.HCERegisterListener
    public final void onGeneratePublicKeyUnsuccessful() {
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onGeneratePublicKeyUnsuccessful", null, null, 6, null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.payair.model.Response.Error(103, null, 2, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    @Override // com.payair.hce.HCERegisterListener
    public final void onGetCertOperationUnsuccessful(java.lang.Integer errorCode) {
        java.lang.Object error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onGetCertOperationUnsuccessful ".concat(java.lang.String.valueOf(errorCode)), null, null, 6, null);
        com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
        jsonResponse.setSuccessful(false);
        jsonResponse.setStatusCode(errorCode);
        jsonResponse.setStatusCodeFromServer(errorCode);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        if (jsonResponse.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(jsonResponse);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                statusCode = jsonResponse.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList] */
    @Override // com.payair.hce.HCERegisterListener
    public final void onRegisterOperationUnsuccessful(java.lang.Integer errorCode) {
        java.lang.Object error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onRegisterOperationUnsuccessful ".concat(java.lang.String.valueOf(errorCode)), null, null, 6, null);
        com.payair.hce.communication.JsonResponse jsonResponse = new com.payair.hce.communication.JsonResponse();
        jsonResponse.setSuccessful(false);
        jsonResponse.setStatusCode(errorCode);
        jsonResponse.setStatusCodeFromServer(errorCode);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        if (jsonResponse.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(jsonResponse);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                statusCode = jsonResponse.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(error));
    }

    @Override // com.payair.hce.HCERegisterListener
    public final void onRegistrationCompleted() {
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onRegistrationCompleted", null, null, 6, null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.payair.model.Response.Success(new java.lang.Object())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    @Override // com.payair.hce.HCERegisterListener
    public final void onGetCertOperationUnsuccessful(com.payair.hce.communication.JsonResponse response) {
        java.lang.Object error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onGetCertOperationUnsuccessful ".concat(java.lang.String.valueOf(response)), null, null, 6, null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(response != null ? java.lang.Boolean.valueOf(response.isSuccessful()) : null, java.lang.Boolean.FALSE)) {
            response = new com.payair.hce.communication.JsonResponse();
            response.setSuccessful(false);
        }
        if (response.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(response);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = response.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && response.getStatusCode() != null) {
                statusCode = response.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = response.getStatusCodeFromServer();
                if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && response.getStatusCodeFromServer() != null) {
                    statusCode = response.getStatusCodeFromServer();
                } else {
                    statusCode = 100;
                }
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = response.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    @Override // com.payair.hce.HCERegisterListener
    public final void onRegisterOperationUnsuccessful(com.payair.hce.communication.JsonResponse response) {
        java.lang.Object error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onRegisterOperationUnsuccessful ".concat(java.lang.String.valueOf(response)), null, null, 6, null);
        kotlin.coroutines.SafeContinuation safeContinuation = this.f4441a;
        if (response == null) {
            response = new com.payair.hce.communication.JsonResponse();
            response.setSuccessful(false);
        }
        if (response.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(response);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = response.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && response.getStatusCode() != null) {
                statusCode = response.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = response.getStatusCodeFromServer();
                if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && response.getStatusCodeFromServer() != null) {
                    statusCode = response.getStatusCodeFromServer();
                } else {
                    statusCode = 100;
                }
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = response.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        safeContinuation.resumeWith(kotlin.Result.m23436constructorimpl(error));
    }
}
