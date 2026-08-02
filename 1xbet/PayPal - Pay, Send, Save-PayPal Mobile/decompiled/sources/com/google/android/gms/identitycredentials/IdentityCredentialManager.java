package com.google.android.gms.identitycredentials;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IdentityCredentialManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.gms.identitycredentials.IdentityCredentialManager.Companion INSTANCE = new com.google.android.gms.identitycredentials.IdentityCredentialManager.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lcom/google/android/gms/identitycredentials/IdentityCredentialManager$Companion;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;", "getClient", "(Landroid/app/Activity;)Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;", "Landroid/content/Context;", "context", "(Landroid/content/Context;)Lcom/google/android/gms/identitycredentials/IdentityCredentialClient;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @kotlin.jvm.JvmStatic
        public final com.google.android.gms.identitycredentials.IdentityCredentialClient getClient(android.app.Activity activity) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "");
            return new com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient(activity);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.gms.identitycredentials.IdentityCredentialClient getClient(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return new com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient(context);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.identitycredentials.IdentityCredentialClient getClient(android.content.Context context) {
        return INSTANCE.getClient(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.gms.identitycredentials.IdentityCredentialClient getClient(android.app.Activity activity) {
        return INSTANCE.getClient(activity);
    }

    private IdentityCredentialManager() {
    }
}
