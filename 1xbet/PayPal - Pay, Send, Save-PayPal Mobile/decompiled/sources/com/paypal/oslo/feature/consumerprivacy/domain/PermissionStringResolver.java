package com.paypal.oslo.feature.consumerprivacy.domain;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J!\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "", "", "permissionKey", "merchantName", "resolveTitle", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "privilegesData", "resolveDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PermissionStringResolver {
    java.lang.String resolveDescription(java.lang.String permissionKey, java.lang.String merchantName, java.lang.String privilegesData);

    java.lang.String resolveTitle(java.lang.String permissionKey, java.lang.String merchantName);
}
