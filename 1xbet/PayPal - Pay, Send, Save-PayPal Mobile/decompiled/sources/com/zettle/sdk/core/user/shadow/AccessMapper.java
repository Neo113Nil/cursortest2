package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/AccessMapper;", "", "<init>", "()V", "Lcom/zettle/sdk/core/user/shadow/AccessDto;", "from", "Lcom/zettle/android/entities/Access;", "map", "(Lcom/zettle/sdk/core/user/shadow/AccessDto;)Lcom/zettle/android/entities/Access;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AccessMapper {
    public final com.zettle.android.entities.Access map(com.zettle.sdk.core.user.shadow.AccessDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return com.zettle.android.entities.Access.INSTANCE.invoke(from.getEMoney(), from.getApiMerchantDbaData(), from.getApiOrganization(), from.getInvoice(), from.getCashRegister(), from.getLibrary(), from.getAccountSettings(), from.getExtendedReportInsights());
    }
}
