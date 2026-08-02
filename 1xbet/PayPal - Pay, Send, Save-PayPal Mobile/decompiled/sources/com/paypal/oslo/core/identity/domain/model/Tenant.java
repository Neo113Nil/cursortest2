package com.paypal.oslo.core.identity.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/Tenant;", "", "<init>", "(Ljava/lang/String;I)V", "PAYPAL", "XOOM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Tenant {
    public static final com.paypal.oslo.core.identity.domain.model.Tenant PAYPAL;
    public static final com.paypal.oslo.core.identity.domain.model.Tenant XOOM;
    private static final /* synthetic */ com.paypal.oslo.core.identity.domain.model.Tenant[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private Tenant(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.identity.domain.model.Tenant tenant = new com.paypal.oslo.core.identity.domain.model.Tenant("PAYPAL", 0);
        PAYPAL = tenant;
        com.paypal.oslo.core.identity.domain.model.Tenant tenant2 = new com.paypal.oslo.core.identity.domain.model.Tenant("XOOM", 1);
        XOOM = tenant2;
        com.paypal.oslo.core.identity.domain.model.Tenant[] tenantArr = {tenant, tenant2};
        getHighResolutionOutputSizeshNQ4ISI = tenantArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(tenantArr);
    }

    public static com.paypal.oslo.core.identity.domain.model.Tenant[] values() {
        return (com.paypal.oslo.core.identity.domain.model.Tenant[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.core.identity.domain.model.Tenant valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.identity.domain.model.Tenant) java.lang.Enum.valueOf(com.paypal.oslo.core.identity.domain.model.Tenant.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.identity.domain.model.Tenant> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
