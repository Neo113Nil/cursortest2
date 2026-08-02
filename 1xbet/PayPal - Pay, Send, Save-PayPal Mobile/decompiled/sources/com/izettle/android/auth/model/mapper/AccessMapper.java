package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/model/mapper/AccessMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/AccessDto;", "Lcom/zettle/android/entities/Access;", "<init>", "()V", "from", "inverseMap", "(Lcom/zettle/android/entities/Access;)Lcom/izettle/android/auth/dto/AccessDto;", "map", "(Lcom/izettle/android/auth/dto/AccessDto;)Lcom/zettle/android/entities/Access;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AccessMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.AccessDto, com.zettle.android.entities.Access> {
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.AccessDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.Access> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.Access> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.AccessDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.Access map(com.izettle.android.auth.dto.AccessDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return com.zettle.android.entities.Access.INSTANCE.invoke(from.getEMoney(), from.getApiMerchantDbaData(), from.getApiOrganization(), from.getInvoice(), from.getCashRegister(), from.getLibrary(), from.getAccountSettings(), from.getExtendedReportInsights());
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.AccessDto inverseMap(com.zettle.android.entities.Access from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return new com.izettle.android.auth.dto.AccessDto(from.getEMoney(), from.getApiMerchantDbaData(), from.getApiOrganization(), from.getInvoice(), from.getCashRegister(), from.getLibrary(), from.getAccountSettings(), from.getExtendedReportInsights());
    }
}
