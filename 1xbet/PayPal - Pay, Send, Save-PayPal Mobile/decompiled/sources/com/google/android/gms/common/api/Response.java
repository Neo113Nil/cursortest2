package com.google.android.gms.common.api;

/* loaded from: classes8.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public void setResult(T t) {
        this.zza = t;
    }

    protected T getResult() {
        return (T) this.zza;
    }

    public Response(T t) {
        this.zza = t;
    }

    public Response() {
    }
}
