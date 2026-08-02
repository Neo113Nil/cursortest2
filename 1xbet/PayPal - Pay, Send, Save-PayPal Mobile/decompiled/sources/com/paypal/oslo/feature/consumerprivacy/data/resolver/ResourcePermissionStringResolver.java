package com.paypal.oslo.feature.consumerprivacy.data.resolver;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/data/resolver/ResourcePermissionStringResolver;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/PermissionStringResolver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "permissionKey", "merchantName", "resolveTitle", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "privilegesData", "resolveDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "p0", "p1", "p2", "Camera2StreamConfigurationMap", "(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ResourcePermissionStringResolver implements com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;
    public static final int $stable = 8;
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("%s");

    @javax.inject.Inject
    public ResourcePermissionStringResolver(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver
    public final java.lang.String resolveTitle(java.lang.String permissionKey, java.lang.String merchantName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("feature_consumer_privacy_connected_apps_permission_");
        sb.append(permissionKey);
        sb.append("_title");
        int identifier = this.Camera2StreamConfigurationMap.getResources().getIdentifier(sb.toString(), "string", this.Camera2StreamConfigurationMap.getPackageName());
        if (identifier != 0) {
            return Camera2StreamConfigurationMap(identifier, merchantName, merchantName);
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.consumerprivacy.domain.PermissionStringResolver
    public final java.lang.String resolveDescription(java.lang.String permissionKey, java.lang.String merchantName, java.lang.String privilegesData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privilegesData, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("feature_consumer_privacy_connected_apps_permission_");
        sb.append(permissionKey);
        sb.append(com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.DESCRIPTION_SUFFIX);
        int identifier = this.Camera2StreamConfigurationMap.getResources().getIdentifier(sb.toString(), "string", this.Camera2StreamConfigurationMap.getPackageName());
        if (identifier != 0) {
            return Camera2StreamConfigurationMap(identifier, merchantName, privilegesData);
        }
        return null;
    }

    private final java.lang.String Camera2StreamConfigurationMap(int p0, java.lang.String p1, java.lang.String p2) {
        java.lang.String string = this.Camera2StreamConfigurationMap.getResources().getString(p0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        int count = kotlin.sequences.SequencesKt.count(kotlin.text.Regex.findAll$default(Camera2StreamConfigurationMap, string, 0, 2, null));
        if (count == 0) {
            return string;
        }
        if (count == 1) {
            java.lang.String string2 = this.Camera2StreamConfigurationMap.getString(p0, p1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
            return string2;
        }
        java.lang.String string3 = this.Camera2StreamConfigurationMap.getString(p0, p1, p2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }
}
