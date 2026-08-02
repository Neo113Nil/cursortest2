package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/CustomerSettingsMapper;", "", "<init>", "()V", "Lcom/zettle/sdk/core/user/shadow/CustomersSettingsDto;", "from", "Lcom/zettle/android/entities/CustomersSettings;", "map", "(Lcom/zettle/sdk/core/user/shadow/CustomersSettingsDto;)Lcom/zettle/android/entities/CustomersSettings;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CustomerSettingsMapper {
    public final com.zettle.android.entities.CustomersSettings map(com.zettle.sdk.core.user.shadow.CustomersSettingsDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.CustomersSettings.Companion companion = com.zettle.android.entities.CustomersSettings.INSTANCE;
        java.lang.Boolean isEnabled = from.isEnabled();
        return companion.invoke(isEnabled != null ? isEnabled.booleanValue() : false);
    }
}
