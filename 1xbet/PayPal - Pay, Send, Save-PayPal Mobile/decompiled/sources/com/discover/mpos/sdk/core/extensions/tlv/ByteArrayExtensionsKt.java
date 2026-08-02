package com.discover.mpos.sdk.core.extensions.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\u00020\u000b*\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010 \u001a\u00020\u0014*\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!\u001a\u001b\u0010\"\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#\u001a\u001b\u0010\"\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010$\u001a-\u0010&\u001a\u00020%*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'\u001a\u001d\u0010(\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010$\u001a+\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020\u00142\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020)\"\u00020\u0002¢\u0006\u0004\b-\u0010.\u001a-\u00101\u001a\u00020\u000b*\u00020\u00142\u0006\u0010/\u001a\u00020\u00142\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b1\u00102\u001a\u0013\u00103\u001a\u00020\u0000*\u00020\u0007H\u0002¢\u0006\u0004\b3\u0010\n\u001a\u0011\u00104\u001a\u00020\u0000*\u00020\u0014¢\u0006\u0004\b4\u00105\u001a\u001b\u00107\u001a\u0004\u0018\u00010\u000b*\u00020\u00142\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b7\u00108\u001a\u001b\u0010;\u001a\u00020:*\u00020\u00142\b\b\u0002\u00109\u001a\u00020\u0000¢\u0006\u0004\b;\u0010<\u001a+\u0010>\u001a\b\u0012\u0004\u0012\u00020,0+*\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u00002\b\b\u0002\u00109\u001a\u00020\u0000¢\u0006\u0004\b>\u0010?\u001a\u0019\u0010A\u001a\u00020\u0000*\u00020\u00142\u0006\u0010@\u001a\u00020\u0014¢\u0006\u0004\bA\u0010B\u001a7\u0010F\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020:0E*\u00020\u00142\u0006\u0010C\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u0000¢\u0006\u0004\bF\u0010G\"\u0014\u0010H\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010I\"\u0014\u0010K\u001a\u00020J8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010L\"\u0014\u0010M\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010I\"\u0014\u0010N\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010I\"\u0014\u0010O\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010P"}, d2 = {"", "checkFromStart", "", "hexString", "startTag", "isTagAtStart", "(ZLjava/lang/String;Ljava/lang/String;)Z", "", "tagFirstByte", "isTagMoreThanOneBit", "(B)Z", "", "startTagLength", "(Ljava/lang/String;)I", "startTagIndex", "tagIndexNotFound", "(I)Z", "regionStartIndex", "tagStartIndex", "(Ljava/lang/String;Ljava/lang/String;I)I", "", com.paypal.oslo.downloads.impl.engine.ResumeHandler.ACCEPT_RANGES_BYTES, "tagValueBytesLength", "([B)I", "", "clear", "([B)V", "index", "computeTagLength", "([BI)I", "fromIndex", "toIndex", "copyOfRangeOrEmpty", "([BII)[B", "dataRegion", "([BI)[B", "([BLjava/lang/String;)[B", "Lcom/discover/mpos/sdk/core/extensions/tlv/DataRegion;", "extendedDataRegion", "([BLjava/lang/String;IZ)Lcom/discover/mpos/sdk/core/extensions/tlv/DataRegion;", "failSafeDataRegion", "", "tags", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getFilteredTlvs", "([B[Ljava/lang/String;)Ljava/util/List;", "array", "startIndex", "indexOf", "([B[BIZ)I", "isMsbOne", "isZeroOnly", "([B)Z", "tag", "lengthByteCountForTag", "([BLjava/lang/String;)Ljava/lang/Integer;", "isBerTlv", "Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "parseLength", "([BZ)Lcom/discover/mpos/sdk/core/extensions/tlv/DataLength;", "shouldSplitConstructed", "split", "([BZZ)Ljava/util/List;", "prefix", "startsWith", "([B[B)Z", "contentIndex", "tagLength", "Lkotlin/Pair;", "tlvFromContent", "([BIIZ)Lkotlin/Pair;", "BYTE_LENGTH_IN_STRING", com.visa.cbp.getEncExpo.warmup, "", "BYTE_LENGTH_IN_STRING_F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "BYTE_SHIFT_STEP", "MINIMUM_TAG_LENGTH", "PADDING", "B"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteArrayExtensionsKt {
    private static final int BYTE_LENGTH_IN_STRING = 2;
    private static final float BYTE_LENGTH_IN_STRING_F = 2.0f;
    private static final int BYTE_SHIFT_STEP = 8;
    private static final int MINIMUM_TAG_LENGTH = 1;
    private static final byte PADDING = -1;

    private static final boolean isMsbOne(byte b) {
        return (b & 128) == 128;
    }

    public static final boolean isTagMoreThanOneBit(byte b) {
        return ((byte) (b & com.google.common.base.Ascii.US)) == 31;
    }

    private static final boolean tagIndexNotFound(int i) {
        return i < 0;
    }

    public static final byte[] dataRegion(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return failSafeDataRegion(bArr, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(i));
    }

    public static final byte[] dataRegion(byte[] bArr, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return failSafeDataRegion(bArr, str);
    }

    public static /* synthetic */ java.util.List split$default(byte[] bArr, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return split(bArr, z, z2);
    }

    public static final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> split(byte[] bArr, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!isZeroOnly(bArr)) {
            int i = 0;
            while (i < bArr.length) {
                int computeTagLength = computeTagLength(bArr, i);
                if (computeTagLength > 1 && bArr[i] == -1) {
                    i++;
                    computeTagLength--;
                }
                kotlin.Pair<com.discover.mpos.sdk.core.emv.tlv.Tlv, com.discover.mpos.sdk.core.extensions.tlv.DataLength> tlvFromContent = tlvFromContent(bArr, i, computeTagLength, z2);
                arrayList.add(tlvFromContent.getFirst());
                if (z && tlvFromContent.getFirst().isConstructed()) {
                    i += computeTagLength + tlvFromContent.getSecond().getBytesForStorage();
                } else {
                    i = tlvFromContent.getFirst().getLastByteIndex();
                }
            }
        }
        return arrayList;
    }

    public static final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> getFilteredTlvs(byte[] bArr, java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> split$default = split$default(bArr, false, false, 3, null);
        if (strArr.length == 0) {
            return split$default;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : split$default) {
            if (kotlin.collections.ArraysKt.contains(strArr, ((com.discover.mpos.sdk.core.emv.tlv.Tlv) obj).getTag())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final int computeTagLength(byte[] bArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return (isTagMoreThanOneBit(bArr[i]) ? tagValueBytesLength(kotlin.collections.ArraysKt.copyOfRange(bArr, i + 1, bArr.length)) : 0) + 1;
    }

    public static /* synthetic */ kotlin.Pair tlvFromContent$default(byte[] bArr, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return tlvFromContent(bArr, i, i2, z);
    }

    public static final kotlin.Pair<com.discover.mpos.sdk.core.emv.tlv.Tlv, com.discover.mpos.sdk.core.extensions.tlv.DataLength> tlvFromContent(byte[] bArr, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = i2 + i;
        java.lang.String hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, i3));
        com.discover.mpos.sdk.core.extensions.tlv.DataLength parseLength = parseLength(kotlin.collections.ArraysKt.copyOfRange(bArr, i3, bArr.length), z);
        int bytesForStorage = i3 + parseLength.getBytesForStorage();
        int lengthValue = parseLength.getLengthValue() + bytesForStorage;
        return kotlin.TuplesKt.to(new com.discover.mpos.sdk.core.emv.tlv.Tlv(hexString, kotlin.collections.ArraysKt.copyOfRange(bArr, bytesForStorage, lengthValue), lengthValue, parseLength.getLengthValue()), parseLength);
    }

    private static final byte[] failSafeDataRegion(byte[] bArr, java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(extendedDataRegion$default(bArr, str, 0, false, 6, null).getDataBytes());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
        if (m23439exceptionOrNullimpl != null) {
            com.discover.mpos.sdk.core.DiscoverMPos.Companion companion3 = com.discover.mpos.sdk.core.DiscoverMPos.INSTANCE;
            new java.lang.Object[]{str, bArr, m23439exceptionOrNullimpl.getMessage()};
            m23436constructorimpl = null;
        }
        return (byte[]) m23436constructorimpl;
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.extensions.tlv.DataRegion extendedDataRegion$default(byte[] bArr, java.lang.String str, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return extendedDataRegion(bArr, str, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.discover.mpos.sdk.core.extensions.tlv.DataRegion extendedDataRegion(byte[] bArr, java.lang.String str, int i, boolean z) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr);
        int tagStartIndex = tagStartIndex(hexString, str, i);
        int startTagLength = startTagLength(str);
        boolean isTagAtStart = isTagAtStart(z, hexString, str);
        byte[] bArr2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        if (isTagAtStart || tagIndexNotFound(tagStartIndex) || (i2 = tagStartIndex + startTagLength) >= bArr.length) {
            return new com.discover.mpos.sdk.core.extensions.tlv.DataRegion(bArr2, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        }
        com.discover.mpos.sdk.core.extensions.tlv.DataLength parseLength$default = parseLength$default(kotlin.collections.ArraysKt.copyOfRange(bArr, i2, bArr.length), false, 1, null);
        int bytesForStorage = i2 + parseLength$default.getBytesForStorage();
        return new com.discover.mpos.sdk.core.extensions.tlv.DataRegion(kotlin.collections.ArraysKt.copyOfRange(bArr, bytesForStorage, parseLength$default.getLengthValue() + bytesForStorage), parseLength$default);
    }

    public static final java.lang.Integer lengthByteCountForTag(byte[] bArr, java.lang.String str) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int tagStartIndex$default = tagStartIndex$default(com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr), str, 0, 4, null);
        int roundToInt = kotlin.math.MathKt.roundToInt(str.length() / 2.0f);
        if (tagIndexNotFound(tagStartIndex$default) || (i = tagStartIndex$default + roundToInt) >= bArr.length) {
            return null;
        }
        return java.lang.Integer.valueOf(parseLength$default(kotlin.collections.ArraysKt.copyOfRange(bArr, i, bArr.length), false, 1, null).getLengthValue());
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.extensions.tlv.DataLength parseLength$default(byte[] bArr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return parseLength(bArr, z);
    }

    public static final com.discover.mpos.sdk.core.extensions.tlv.DataLength parseLength(byte[] bArr, boolean z) {
        int i;
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = 0;
        if (bArr.length == 0) {
            return new com.discover.mpos.sdk.core.extensions.tlv.DataLength(0, 0, 3, null);
        }
        int unsignedInt = com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[0]);
        int i4 = unsignedInt & 128;
        if (z && i4 == 128) {
            i2 = (unsignedInt ^ i4) + 1;
            i = 1;
        } else {
            i = 0;
            i2 = 1;
        }
        if (i > bArr.length || i2 > bArr.length) {
            i2 = bArr.length;
        } else {
            int i5 = i2 > 1 ? i2 - 2 : 0;
            while (i < i2) {
                i3 |= com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[i]) << (i5 * 8);
                i5--;
                i++;
            }
        }
        return new com.discover.mpos.sdk.core.extensions.tlv.DataLength(i3, i2);
    }

    public static final int tagValueBytesLength(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        int length = bArr.length;
        int i = 1;
        for (int i2 = 0; i2 < length && isMsbOne(bArr[i2]); i2++) {
            i++;
        }
        return i;
    }

    public static final byte[] copyOfRangeOrEmpty(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            try {
                byte[] copyOfRange = kotlin.collections.ArraysKt.copyOfRange(bArr, i, i2);
                if (copyOfRange != null) {
                    return copyOfRange;
                }
            } catch (java.lang.IndexOutOfBoundsException unused) {
                return new byte[0];
            }
        }
        return new byte[0];
    }

    public static /* synthetic */ int indexOf$default(byte[] bArr, byte[] bArr2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return indexOf(bArr, bArr2, i, z);
    }

    public static final int indexOf(byte[] bArr, byte[] bArr2, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        int length = bArr.length - bArr2.length;
        if (i > length) {
            return -1;
        }
        while (true) {
            int i2 = 0;
            while (i2 < bArr2.length && bArr2[i2] == bArr[i + i2]) {
                i2++;
            }
            if (i2 == bArr2.length) {
                return i;
            }
            if (z || i == length) {
                return -1;
            }
            i++;
        }
    }

    public static final void clear(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.collections.ArraysKt.fill$default(bArr, (byte) 0, 0, 0, 6, (java.lang.Object) null);
    }

    private static final boolean isTagAtStart(boolean z, java.lang.String str, java.lang.String str2) {
        return z && !kotlin.text.StringsKt.startsWith$default(str, str2, false, 2, (java.lang.Object) null);
    }

    private static final int startTagLength(java.lang.String str) {
        return kotlin.math.MathKt.roundToInt(str.length() / 2.0f);
    }

    static /* synthetic */ int tagStartIndex$default(java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return tagStartIndex(str, str2, i);
    }

    private static final int tagStartIndex(java.lang.String str, java.lang.String str2, int i) {
        int indexOf = kotlin.text.StringsKt.indexOf((java.lang.CharSequence) str, str2, i, true);
        return indexOf >= 0 ? kotlin.math.MathKt.roundToInt(indexOf / 2.0f) : indexOf;
    }

    public static final boolean startsWith(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        if (bArr.length < bArr2.length) {
            return false;
        }
        int length = bArr2.length;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (bArr2[i] != bArr[i2]) {
                z = false;
            }
            i++;
            i2++;
        }
        return z;
    }

    public static final boolean isZeroOnly(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }
}
