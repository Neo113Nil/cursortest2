package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/model/mapper/PayPalQrcSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;", "Lcom/zettle/android/entities/PayPalQrcSettings;", "<init>", "()V", "from", "inverseMap", "(Lcom/zettle/android/entities/PayPalQrcSettings;)Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;", "map", "(Lcom/izettle/android/auth/dto/PayPalQrcSettingsDto;)Lcom/zettle/android/entities/PayPalQrcSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PayPalQrcSettingsMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.PayPalQrcSettingsDto, com.zettle.android.entities.PayPalQrcSettings> {
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.PayPalQrcSettingsDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.PayPalQrcSettings> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.PayPalQrcSettings> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.PayPalQrcSettingsDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.PayPalQrcSettings map(com.izettle.android.auth.dto.PayPalQrcSettingsDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.PayPalQrcSettings.Companion companion = com.zettle.android.entities.PayPalQrcSettings.INSTANCE;
        java.lang.Boolean isEnabled = from.getIsEnabled();
        boolean booleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
        java.lang.Boolean isCheckoutEnabled = from.getIsCheckoutEnabled();
        boolean booleanValue2 = isCheckoutEnabled != null ? isCheckoutEnabled.booleanValue() : false;
        java.lang.Boolean isActivated = from.getIsActivated();
        return companion.invoke(booleanValue, booleanValue2, isActivated != null ? isActivated.booleanValue() : false);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.PayPalQrcSettingsDto inverseMap(com.zettle.android.entities.PayPalQrcSettings from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return new com.izettle.android.auth.dto.PayPalQrcSettingsDto(java.lang.Boolean.valueOf(from.isEnabled()), java.lang.Boolean.valueOf(from.isCheckoutEnabled()), java.lang.Boolean.valueOf(from.isActivated()));
    }
}
