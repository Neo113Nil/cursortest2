package com.paypal.oslo.feature.consumerprivacy.domain;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/FallbackPermissionStringResolver;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "<init>", "()V", "", "permissionKey", "merchantName", "resolveTitle", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "privilegesData", "resolveDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FallbackPermissionStringResolver implements com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.domain.FallbackPermissionStringResolver INSTANCE = new com.paypal.oslo.feature.consumerprivacy.domain.FallbackPermissionStringResolver();

    private FallbackPermissionStringResolver() {
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver
    public final java.lang.String resolveTitle(java.lang.String permissionKey, java.lang.String merchantName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        return null;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver
    public final java.lang.String resolveDescription(java.lang.String permissionKey, java.lang.String merchantName, java.lang.String privilegesData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privilegesData, "");
        return null;
    }
}
