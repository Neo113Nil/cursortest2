package com.paypal.oslo.feature.controlcenter.api.navigation;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/controlcenter/api/navigation/ControlCenterConfig;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "defaultDestination", "Landroidx/navigation3/runtime/NavKey;", "getDefaultDestination", "()Landroidx/navigation3/runtime/NavKey;", "", "PARENT_NAME", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ControlCenterConfig {
    public static final java.lang.String PARENT_NAME = "Me";
    public static final com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterConfig INSTANCE = new com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterConfig();
    private static final androidx.navigation3.runtime.NavKey defaultDestination = com.paypal.oslo.feature.controlcenter.api.navigation.ControlCenterEntrypoint.INSTANCE;
    public static final int $stable = 8;

    private ControlCenterConfig() {
    }

    public final androidx.navigation3.runtime.NavKey getDefaultDestination() {
        return defaultDestination;
    }
}
