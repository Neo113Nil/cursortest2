package com.payair.logic.remote.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/model/AssetDto;", "Lcom/payair/model/Asset;", "toAsset", "(Lcom/payair/logic/remote/model/AssetDto;)Lcom/payair/model/Asset;", "Lcom/payair/logic/remote/model/MediaContentsDto;", "Lcom/payair/model/MediaContents;", "toMediaContent", "(Lcom/payair/logic/remote/model/MediaContentsDto;)Lcom/payair/model/MediaContents;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetDtoKt {
    public static final com.payair.model.MediaContents toMediaContent(com.payair.logic.remote.model.MediaContentsDto mediaContentsDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaContentsDto, "");
        java.util.List<com.payair.logic.remote.model.AssetDto> mediaContents = mediaContentsDto.getMediaContents();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(mediaContents, 10));
        java.util.Iterator<T> it = mediaContents.iterator();
        while (it.hasNext()) {
            arrayList.add(toAsset((com.payair.logic.remote.model.AssetDto) it.next()));
        }
        return new com.payair.model.MediaContents(arrayList);
    }

    public static final com.payair.model.Asset toAsset(com.payair.logic.remote.model.AssetDto assetDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetDto, "");
        return new com.payair.model.Asset(com.payair.model.AssetType.INSTANCE.enumByValue(assetDto.getType()), assetDto.getData(), assetDto.getHeight(), assetDto.getWidth());
    }
}
