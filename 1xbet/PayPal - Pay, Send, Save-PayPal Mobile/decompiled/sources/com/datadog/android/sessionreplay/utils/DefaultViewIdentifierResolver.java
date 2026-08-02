package com.datadog.android.sessionreplay.utils;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/datadog/android/sessionreplay/utils/DefaultViewIdentifierResolver;", "Lcom/datadog/android/sessionreplay/utils/ViewIdentifierResolver;", "<init>", "()V", "Landroid/view/View;", "parent", "", "childName", "", "resolveChildUniqueIdentifier", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/Long;", "view", "resolveViewId", "(Landroid/view/View;)J", "DATADOG_UNIQUE_IDENTIFIER_KEY_PREFIX", "Ljava/lang/String;", "Ljava/security/SecureRandom;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/security/SecureRandom;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultViewIdentifierResolver implements com.datadog.android.sessionreplay.utils.ViewIdentifierResolver {
    public static final java.lang.String DATADOG_UNIQUE_IDENTIFIER_KEY_PREFIX = "DATADOG_UNIQUE_IDENTIFIER_";
    public static final com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver INSTANCE = new com.datadog.android.sessionreplay.utils.DefaultViewIdentifierResolver();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private static final java.security.SecureRandom Camera2StreamConfigurationMap = new java.security.SecureRandom();

    private DefaultViewIdentifierResolver() {
    }

    @Override // com.datadog.android.sessionreplay.utils.ViewIdentifierResolver
    public final long resolveViewId(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return java.lang.System.identityHashCode(view);
    }

    @Override // com.datadog.android.sessionreplay.utils.ViewIdentifierResolver
    public final java.lang.Long resolveChildUniqueIdentifier(android.view.View parent, java.lang.String childName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childName, "");
        int hashCode = DATADOG_UNIQUE_IDENTIFIER_KEY_PREFIX.concat(java.lang.String.valueOf(childName)).hashCode();
        java.lang.Object tag = parent.getTag(hashCode);
        if (tag != null) {
            if (tag instanceof java.lang.Long) {
                return (java.lang.Long) tag;
            }
            return null;
        }
        long nextInt = Camera2StreamConfigurationMap.nextInt();
        parent.setTag(hashCode, java.lang.Long.valueOf(nextInt));
        return java.lang.Long.valueOf(nextInt);
    }
}
