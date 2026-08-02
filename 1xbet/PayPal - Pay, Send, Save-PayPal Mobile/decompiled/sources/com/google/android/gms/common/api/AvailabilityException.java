package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public class AvailabilityException extends java.lang.Exception {
    private final androidx.collection.ArrayMap zaa;

    public AvailabilityException(androidx.collection.ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.GoogleApi<? extends com.google.android.gms.common.api.Api.ApiOptions> googleApi) {
        androidx.collection.ArrayMap arrayMap = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = googleApi.getApiKey();
        V v = arrayMap.get(apiKey);
        java.lang.String zaa = apiKey.zaa();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The given API (");
        sb.append(zaa);
        sb.append(") was not part of the availability request.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(v != 0, sb.toString());
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = true;
        for (com.google.android.gms.common.api.internal.ApiKey apiKey : this.zaa.keySet()) {
            com.google.android.gms.common.ConnectionResult connectionResult = (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            java.lang.String zaa = apiKey.zaa();
            java.lang.String valueOf = java.lang.String.valueOf(connectionResult);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(zaa);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(android.text.TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.google.android.gms.common.ConnectionResult getConnectionResult(com.google.android.gms.common.api.HasApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> hasApiKey) {
        androidx.collection.ArrayMap arrayMap = this.zaa;
        com.google.android.gms.common.api.internal.ApiKey<? extends com.google.android.gms.common.api.Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        V v = arrayMap.get(apiKey);
        java.lang.String zaa = apiKey.zaa();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The given API (");
        sb.append(zaa);
        sb.append(") was not part of the availability request.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(v != 0, sb.toString());
        return (com.google.android.gms.common.ConnectionResult) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.ConnectionResult) this.zaa.get(apiKey));
    }
}
