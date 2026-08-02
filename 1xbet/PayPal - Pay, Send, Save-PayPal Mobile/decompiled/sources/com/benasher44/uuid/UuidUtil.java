package com.benasher44.uuid;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a-\u0010\u0007\u001a\u00060\u0000j\u0002`\u00012\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\"&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011\"&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u000f\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0019\u0010\u0011\"\u0014\u0010\u001b\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000b"}, d2 = {"Ljava/util/UUID;", "Lcom/benasher44/uuid/getHighSpeedVideoFpsRangesFor;", "namespace", "", "name", "Lcom/benasher44/uuid/UuidHasher;", "hasher", "nameBasedUuidOf", "(Ljava/util/UUID;Ljava/lang/String;Lcom/benasher44/uuid/UuidHasher;)Ljava/util/UUID;", "", "UUID_BYTES", com.visa.cbp.getEncExpo.warmup, "", "", "UUID_CHARS", "Ljava/util/List;", "getUUID_CHARS", "()Ljava/util/List;", "getUUID_CHARS$annotations", "()V", "Lkotlin/ranges/IntRange;", "UUID_CHAR_RANGES", "getUUID_CHAR_RANGES", "getUUID_CHAR_RANGES$annotations", "UUID_HYPHEN_INDICES", "getUUID_HYPHEN_INDICES", "getUUID_HYPHEN_INDICES$annotations", "UUID_STRING_LENGTH"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UuidUtil {
    public static final int UUID_BYTES = 16;
    public static final int UUID_STRING_LENGTH = 36;
    private static final java.util.List<kotlin.ranges.IntRange> UUID_CHAR_RANGES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.ranges.IntRange[]{kotlin.ranges.RangesKt.until(0, 8), kotlin.ranges.RangesKt.until(9, 13), kotlin.ranges.RangesKt.until(14, 18), kotlin.ranges.RangesKt.until(19, 23), kotlin.ranges.RangesKt.until(24, 36)});
    private static final java.util.List<java.lang.Integer> UUID_HYPHEN_INDICES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{8, 13, 18, 23});
    private static final java.util.List<java.lang.Character> UUID_CHARS = kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9'), (java.lang.Iterable) new kotlin.ranges.CharRange('a', 'f'));

    public static /* synthetic */ void getUUID_CHARS$annotations() {
    }

    public static /* synthetic */ void getUUID_CHAR_RANGES$annotations() {
    }

    public static /* synthetic */ void getUUID_HYPHEN_INDICES$annotations() {
    }

    public static final java.util.List<kotlin.ranges.IntRange> getUUID_CHAR_RANGES() {
        return UUID_CHAR_RANGES;
    }

    public static final java.util.List<java.lang.Integer> getUUID_HYPHEN_INDICES() {
        return UUID_HYPHEN_INDICES;
    }

    public static final java.util.List<java.lang.Character> getUUID_CHARS() {
        return UUID_CHARS;
    }

    public static final java.util.UUID nameBasedUuidOf(java.util.UUID uuid, java.lang.String str, com.benasher44.uuid.UuidHasher uuidHasher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuidHasher, "");
        uuidHasher.update(com.benasher44.uuid.UuidKt.getBytes(uuid));
        uuidHasher.update(kotlin.text.StringsKt.encodeToByteArray(str));
        byte[] digest = uuidHasher.digest();
        digest[6] = (byte) (((byte) (uuidHasher.getGetHighSpeedVideoFpsRanges() << 4)) | ((byte) (digest[6] & com.google.common.base.Ascii.SI)));
        digest[8] = (byte) (((byte) (digest[8] & 63)) | Byte.MIN_VALUE);
        byte[] copyOf = java.util.Arrays.copyOf(digest, 16);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        return com.benasher44.uuid.UuidKt.uuidOf(copyOf);
    }
}
