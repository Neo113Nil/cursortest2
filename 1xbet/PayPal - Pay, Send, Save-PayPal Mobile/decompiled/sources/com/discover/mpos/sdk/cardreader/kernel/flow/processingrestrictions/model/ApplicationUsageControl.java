package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u0011\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0014\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;", "Lcom/discover/mpos/sdk/core/emv/EmvByteInfoList;", "byteInfoList", "", "Lcom/discover/mpos/sdk/core/data/ByteInfo;", "(Ljava/util/List;)V", "byteArray", "", "([B)V", "tlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "isATM", "", "()Z", "isDomesticCashTransaction", "isDomesticCashbackAllowed", "isDomesticGoods", "isDomesticService", "isInternationCashbackAllowed", "isInternationalCashTransaction", "isInternationalGoods", "isInternationalService", "isOtherThanATM", "leftMostData", "", "rightMostData", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ApplicationUsageControl extends com.discover.mpos.sdk.core.emv.EmvByteInfoList {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3164a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    private ApplicationUsageControl(byte[] bArr) {
        super(bArr, 2);
        this.i = 1;
        this.j = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
        this.k = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH);
        this.f3164a = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SIXTH);
        this.b = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIFTH);
        this.c = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FOURTH);
        this.d = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.THIRD);
        this.l = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SECOND);
        this.e = getByteInfoList().get(this.h).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.FIRST);
        this.f = getByteInfoList().get(1).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.EIGHTH);
        this.g = getByteInfoList().get(1).getBitValue(com.discover.mpos.sdk.core.data.ByteInfo.BitIndex.SEVENTH);
    }

    public ApplicationUsageControl(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        this(tlv != null ? tlv.getContent() : null);
    }
}
