package com.google.android.datatransport.cct.internal;

@com.google.firebase.encoders.annotations.Encodable
/* loaded from: classes8.dex */
public abstract class BatchedLogRequest {
    @com.google.firebase.encoders.annotations.Encodable.Field(name = "logRequest")
    public abstract java.util.List<com.google.android.datatransport.cct.internal.LogRequest> getLogRequests();

    public static com.google.android.datatransport.cct.internal.BatchedLogRequest create(java.util.List<com.google.android.datatransport.cct.internal.LogRequest> list) {
        return new com.google.android.datatransport.cct.internal.AutoValue_BatchedLogRequest(list);
    }

    public static com.google.firebase.encoders.DataEncoder createDataEncoder() {
        return new com.google.firebase.encoders.json.JsonDataEncoderBuilder().configureWith(com.google.android.datatransport.cct.internal.AutoBatchedLogRequestEncoder.CONFIG).ignoreNullValues(true).build();
    }
}
