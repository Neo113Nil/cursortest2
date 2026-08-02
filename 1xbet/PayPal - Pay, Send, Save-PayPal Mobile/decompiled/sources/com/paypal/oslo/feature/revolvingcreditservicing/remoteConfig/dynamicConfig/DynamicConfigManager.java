package com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.dynamicConfig;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/remoteConfig/dynamicConfig/DynamicConfigManager;", "", "", "", "secondaryActionsOrder", "()Ljava/util/List;", "", "preApprovalRequired", "()Z", "shouldRequestAppUpdate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DynamicConfigManager {
    boolean preApprovalRequired();

    java.util.List<java.lang.String> secondaryActionsOrder();

    boolean shouldRequestAppUpdate();
}
