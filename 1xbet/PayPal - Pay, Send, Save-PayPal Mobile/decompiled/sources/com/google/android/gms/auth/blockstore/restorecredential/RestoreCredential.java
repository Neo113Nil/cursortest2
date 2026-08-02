package com.google.android.gms.auth.blockstore.restorecredential;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredential;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredentialClient;", "getRestoreCredentialClient", "(Landroid/content/Context;)Lcom/google/android/gms/auth/blockstore/restorecredential/RestoreCredentialClient;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RestoreCredential {
    public static final com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential INSTANCE = new com.google.android.gms.auth.blockstore.restorecredential.RestoreCredential();

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.auth.blockstore.restorecredential.RestoreCredentialClient getRestoreCredentialClient(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.google.android.gms.auth.blockstore.restorecredential.internal.InternalRestoreCredentialClient(context);
    }

    private RestoreCredential() {
    }
}
