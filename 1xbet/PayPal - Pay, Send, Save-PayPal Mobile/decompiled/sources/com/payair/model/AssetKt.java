package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0017\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/payair/model/Asset;", "", "getByteFormatData", "(Lcom/payair/model/Asset;)[B", "byteFormatData", "", "getStringFormatData", "(Lcom/payair/model/Asset;)Ljava/lang/String;", "stringFormatData"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssetKt {
    public static final byte[] getByteFormatData(com.payair.model.Asset asset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asset, "");
        int i = com.payair.model.AssetKt.WhenMappings.$EnumSwitchMapping$0[asset.getAssetType().ordinal()];
        if (i == 1 || i == 2) {
            return codec.binary.Base64.decodeBase64(asset.getRawData());
        }
        return null;
    }

    public static final java.lang.String getStringFormatData(com.payair.model.Asset asset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asset, "");
        int i = com.payair.model.AssetKt.WhenMappings.$EnumSwitchMapping$0[asset.getAssetType().ordinal()];
        if (i != 3 && i != 4) {
            return null;
        }
        byte[] decodeBase64 = codec.binary.Base64.decodeBase64(asset.getRawData());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decodeBase64, "");
        java.nio.charset.Charset defaultCharset = java.nio.charset.Charset.defaultCharset();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultCharset, "");
        return new java.lang.String(decodeBase64, defaultCharset);
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.AssetType.values().length];
            try {
                iArr[com.payair.model.AssetType.IMAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.AssetType.PDF.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.AssetType.TEXT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.model.AssetType.HTML.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
