package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.otherchecks.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u0011\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/otherchecks/model/CryptogramInformationData;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "byteInfoList", "", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "(Ljava/util/List;)V", "byteArray", "", "([B)V", "byteInfo", "eighthValue", "", "fifthValue", "isAAC", "()Z", "isARQC", "isPaymentSystemSpecificCryptogram", "isRFU", "isTC", "seventhValue", "sixthValue", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.c.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CryptogramInformationData extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3041a;
    public final boolean b;
    public final boolean c;
    private final com.discover.mpos.sdk.core.data.ByteInfo d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    public CryptogramInformationData(byte[] bArr) {
        super(bArr, 1);
        com.discover.mpos.sdk.core.data.ByteInfo byteInfo = getByteInfoList().get(0);
        this.d = byteInfo;
        boolean bitValue = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIFTH);
        this.e = bitValue;
        boolean bitValue2 = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH);
        this.f = bitValue2;
        boolean bitValue3 = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH);
        this.g = bitValue3;
        boolean bitValue4 = byteInfo.getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
        this.h = bitValue4;
        this.i = bitValue3 && bitValue4;
        this.f3041a = !bitValue3 && bitValue4;
        this.b = bitValue3 && !bitValue4;
        this.c = (bitValue3 || bitValue4) ? false : true;
        this.j = (bitValue || bitValue2) ? false : true;
    }
}
