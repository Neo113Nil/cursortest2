package com.paypal.oslo.feature.savings.domain.model.savingshub.dto;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/EducationZoneDTO;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/EducationalTileDTO;", "tiles", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/EducationZoneDTO;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTiles"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EducationZoneDTO implements com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> tiles;

    public EducationZoneDTO(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.tiles = list;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> getTiles() {
        return this.tiles;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> list = this.tiles;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EducationZoneDTO(tiles=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.tiles.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO) && kotlin.jvm.internal.Intrinsics.areEqual(this.tiles, ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO) other).tiles);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO copy(java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> tiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tiles, "");
        return new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO(tiles);
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationalTileDTO> component1() {
        return this.tiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO copy$default(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.EducationZoneDTO educationZoneDTO, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = educationZoneDTO.tiles;
        }
        return educationZoneDTO.copy(list);
    }
}
