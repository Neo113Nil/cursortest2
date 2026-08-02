package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/model/mapper/KeyInSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "Lcom/zettle/android/entities/KeyInSettings;", "<init>", "()V", "from", "inverseMap", "(Lcom/zettle/android/entities/KeyInSettings;)Lcom/izettle/android/auth/dto/KeyInSettingsDto;", "map", "(Lcom/izettle/android/auth/dto/KeyInSettingsDto;)Lcom/zettle/android/entities/KeyInSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class KeyInSettingsMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.KeyInSettingsDto, com.zettle.android.entities.KeyInSettings> {
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.KeyInSettingsDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.KeyInSettings> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.KeyInSettings> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.KeyInSettingsDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.KeyInSettings map(com.izettle.android.auth.dto.KeyInSettingsDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.KeyInSettings.Companion companion = com.zettle.android.entities.KeyInSettings.INSTANCE;
        java.lang.Boolean isEnabled = from.getIsEnabled();
        boolean booleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
        java.lang.Boolean isCheckoutEnabled = from.getIsCheckoutEnabled();
        boolean booleanValue2 = isCheckoutEnabled != null ? isCheckoutEnabled.booleanValue() : false;
        java.lang.Boolean isActivated = from.getIsActivated();
        boolean booleanValue3 = isActivated != null ? isActivated.booleanValue() : false;
        java.lang.String eopStatus = from.getEopStatus();
        if (eopStatus == null) {
            eopStatus = null;
        }
        return companion.invoke(booleanValue, booleanValue2, booleanValue3, eopStatus);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.KeyInSettingsDto inverseMap(com.zettle.android.entities.KeyInSettings from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        boolean isEnabled = from.isEnabled();
        boolean isCheckoutEnabled = from.isCheckoutEnabled();
        boolean isActivated = from.isActivated();
        return new com.izettle.android.auth.dto.KeyInSettingsDto(java.lang.Boolean.valueOf(isEnabled), java.lang.Boolean.valueOf(isCheckoutEnabled), java.lang.Boolean.valueOf(isActivated), from.getEopStatus());
    }
}
