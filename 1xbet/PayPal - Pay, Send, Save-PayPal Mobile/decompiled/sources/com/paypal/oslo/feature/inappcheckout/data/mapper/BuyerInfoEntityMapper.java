package com.paypal.oslo.feature.inappcheckout.data.mapper;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/data/mapper/BuyerInfoEntityMapper;", "", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "contingencyMapper", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;)V", "Lcom/paypal/oslo/feature/inappcheckout/data/dto/BuyerInfoDTO;", "dto", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "convert", "(Lcom/paypal/oslo/feature/inappcheckout/data/dto/BuyerInfoDTO;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BuyerInfoEntity;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/data/mapper/ContingencyMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BuyerInfoEntityMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public BuyerInfoEntityMapper(com.paypal.oslo.feature.inappcheckout.data.mapper.ContingencyMapper contingencyMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencyMapper, "");
        this.getHighSpeedVideoSizes = contingencyMapper;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity convert(com.paypal.oslo.feature.inappcheckout.data.dto.BuyerInfoDTO dto) {
        com.paypal.oslo.feature.inappcheckout.domain.entity.Name name2;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dto, "");
        java.lang.String userId = dto.getUserId();
        if (userId == null) {
            throw new java.lang.IllegalArgumentException("userId cannot be null in success response");
        }
        java.lang.String email = dto.getEmail();
        com.paypal.oslo.feature.inappcheckout.data.dto.BuyerNameDTO name3 = dto.getName();
        if (name3 == null) {
            name2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.Name(null, null);
        } else {
            name2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.Name(name3.getGivenName(), name3.getSurname());
        }
        com.paypal.oslo.feature.inappcheckout.data.dto.ProfileImageDTO profileImage = dto.getProfileImage();
        com.paypal.oslo.feature.inappcheckout.domain.entity.ProfileImage profileImage2 = profileImage != null ? new com.paypal.oslo.feature.inappcheckout.domain.entity.ProfileImage(profileImage.getImagePath()) : null;
        java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> contingencies = dto.getContingencies();
        if (contingencies != null) {
            java.util.List<com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO> list = contingencies;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.getHighSpeedVideoSizes.map((com.paypal.oslo.feature.inappcheckout.data.dto.ContingencyDTO) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.BuyerInfoEntity(userId, name2, profileImage2, arrayList, email);
    }
}
