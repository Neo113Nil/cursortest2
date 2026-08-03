package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap zaa;

    public AvailabilityException(androidx.collection.ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> googleApi) {
        androidx.collection.ArrayMap arrayMap = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = googleApi.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(arrayMap.get(apiKey) != null, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.ApiKey apiKey : this.zaa.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            arrayList.add(apiKey.zaa() + ": " + java.lang.String.valueOf(connectionResult));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(android.text.TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> hasApiKey) {
        androidx.collection.ArrayMap arrayMap = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        com.google.android.gms.common.internal.Preconditions.checkArgument(arrayMap.get(apiKey) != null, "The given API (" + apiKey.zaa() + ") was not part of the availability request.");
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }
}
