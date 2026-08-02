package com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0000J\u0017\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0002\b J\u0006\u0010\u0017\u001a\u00020\u000bJ\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "content", "", "([B)V", "cardFeatureDescriptorExpectedLength", "", "cardId", "getCardId", "()[B", "contactlessTearingRecoverySupported", "", "getContactlessTearingRecoverySupported", "()Z", "dataContainersSize", "getDataContainersSize", "()I", "dataStorageSupported", "getDataStorageSupported", "extendedLoggingSupported", "getExtendedLoggingSupported", "firstByte", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "isValid", "sfi", "getSfi", "sfiShiftRightCount", "clear", "", "copy", "isMatch", "newCardFeatureDescriptor", "isMatch$mpos_sdk_card_reader_offlineRegularRelease", "toByteArray", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CardFeatureDescriptor implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3144a;
    public final int b;
    public final byte[] c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final int g;
    private final int h;
    private final com.discover.mpos.sdk.core.data.ByteInfo i;
    private final int j;
    private final byte[] k;

    public CardFeatureDescriptor(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.k = bArr;
        this.g = 3;
        this.h = 3;
        boolean z = bArr.length > 3;
        this.f3144a = z;
        com.discover.mpos.sdk.core.data.ByteInfo byteInfo = z ? new com.discover.mpos.sdk.core.data.ByteInfo(kotlin.collections.ArraysKt.first(bArr)) : new com.discover.mpos.sdk.core.data.ByteInfo(null, 1, null);
        this.i = byteInfo;
        int unsignedInt = z ? com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SECOND.ordinal()]) >> 3 : 0;
        this.b = unsignedInt;
        int unsignedInt2 = z ? com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD.ordinal()]) : 0;
        this.j = unsignedInt2;
        this.c = z ? kotlin.collections.ArraysKt.copyOfRange(bArr, com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FOURTH.ordinal(), bArr.length) : new byte[]{0};
        this.d = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIRST) && unsignedInt > 0 && unsignedInt2 > 0;
        this.e = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD);
        this.f = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SECOND);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.k);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray, reason: from getter */
    public final byte[] getK() {
        return this.k;
    }

    public final java.lang.String toString() {
        return toHexString();
    }

    public final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor a() {
        byte[] bArr = this.k;
        return new com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor(java.util.Arrays.copyOf(bArr, bArr.length));
    }
}
