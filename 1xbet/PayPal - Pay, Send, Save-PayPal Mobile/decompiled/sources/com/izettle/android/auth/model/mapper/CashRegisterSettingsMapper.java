package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/model/mapper/CashRegisterSettingsMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "Lcom/zettle/android/entities/CashRegisterSettings;", "<init>", "()V", "from", "inverseMap", "(Lcom/zettle/android/entities/CashRegisterSettings;)Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;", "map", "(Lcom/izettle/android/auth/dto/CashRegisterSettingsDto;)Lcom/zettle/android/entities/CashRegisterSettings;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CashRegisterSettingsMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.CashRegisterSettingsDto, com.zettle.android.entities.CashRegisterSettings> {
    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.CashRegisterSettingsDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.CashRegisterSettings> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.CashRegisterSettings> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.CashRegisterSettingsDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.CashRegisterSettings map(com.izettle.android.auth.dto.CashRegisterSettingsDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.CashRegisterSettings.Companion companion = com.zettle.android.entities.CashRegisterSettings.INSTANCE;
        com.zettle.android.entities.TssOptInOut tss = from.getTss();
        if (tss == null) {
            tss = com.zettle.android.entities.TssOptInOut.NO_TSS_OPT_IN_OUT_DECISION;
        }
        return companion.invoke(tss);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.CashRegisterSettingsDto inverseMap(com.zettle.android.entities.CashRegisterSettings from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        return new com.izettle.android.auth.dto.CashRegisterSettingsDto(from.getTss());
    }
}
