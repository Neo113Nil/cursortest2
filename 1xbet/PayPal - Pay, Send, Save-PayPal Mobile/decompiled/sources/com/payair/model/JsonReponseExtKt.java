package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/model/Response;", "parse", "(Lcom/payair/hce/communication/JsonResponse;)Lcom/payair/model/Response;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class JsonReponseExtKt {
    public static final /* synthetic */ <T> com.payair.model.Response parse(com.payair.hce.communication.JsonResponse jsonResponse) {
        java.lang.Integer statusCode;
        java.util.ArrayList emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonResponse, "");
        if (jsonResponse.isSuccessful()) {
            try {
                kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(1, "T");
                com.payair.model.Response.Success success = new com.payair.model.Response.Success(jsonResponse);
                com.payair.model.Response.Success success2 = success;
                return success;
            } catch (java.lang.ClassCastException unused) {
                return new com.payair.model.Response.Error(101, null, 2, null);
            }
        }
        java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
        if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
            statusCode = jsonResponse.getStatusCode();
        } else {
            java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
            if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) {
                statusCode = jsonResponse.getStatusCodeFromServer();
            } else {
                statusCode = 100;
            }
        }
        int intValue = statusCode != null ? statusCode.intValue() : 100;
        java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
        if (errors == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.payair.hce.ErrorModel> list = errors;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.payair.hce.ErrorModel errorModel : list) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
                arrayList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel));
            }
            emptyList = arrayList;
        }
        return new com.payair.model.Response.Error(intValue, emptyList);
    }
}
