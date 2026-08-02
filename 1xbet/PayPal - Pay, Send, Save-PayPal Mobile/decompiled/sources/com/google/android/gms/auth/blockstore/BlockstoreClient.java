package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public interface BlockstoreClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    public static final java.lang.String DEFAULT_BYTES_DATA_KEY = "com.google.android.gms.auth.blockstore.DEFAULT_BYTES_DATA_KEY";
    public static final int MAX_ENTRY_COUNT = 16;
    public static final int MAX_SIZE = 4096;

    com.google.android.gms.tasks.Task<java.lang.Boolean> deleteBytes(com.google.android.gms.auth.blockstore.DeleteBytesRequest deleteBytesRequest);

    com.google.android.gms.tasks.Task<java.lang.Boolean> isEndToEndEncryptionAvailable();

    @java.lang.Deprecated
    com.google.android.gms.tasks.Task<byte[]> retrieveBytes();

    com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.RetrieveBytesResponse> retrieveBytes(com.google.android.gms.auth.blockstore.RetrieveBytesRequest retrieveBytesRequest);

    com.google.android.gms.tasks.Task<java.lang.Integer> storeBytes(com.google.android.gms.auth.blockstore.StoreBytesData storeBytesData);
}
