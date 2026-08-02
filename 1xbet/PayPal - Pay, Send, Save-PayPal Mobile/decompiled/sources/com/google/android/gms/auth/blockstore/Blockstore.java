package com.google.android.gms.auth.blockstore;

/* loaded from: classes8.dex */
public final class Blockstore {
    public static com.google.android.gms.auth.blockstore.BlockstoreClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.auth_blockstore.zzaa(context);
    }

    private Blockstore() {
    }
}
