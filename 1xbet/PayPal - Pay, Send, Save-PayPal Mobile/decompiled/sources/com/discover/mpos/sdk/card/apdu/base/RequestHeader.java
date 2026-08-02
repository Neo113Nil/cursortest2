package com.discover.mpos.sdk.card.apdu.base;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010\u001c"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "", "classByte", "instruction", "Lkotlin/Pair;", "parameterPair", "<init>", "(IILkotlin/Pair;)V", "component1", "()I", "component2", "component3", "()Lkotlin/Pair;", "copy", "(IILkotlin/Pair;)Lcom/discover/mpos/sdk/card/apdu/base/RequestHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toByteArray", "()[B", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "firstByteIndex", "fourthByteIndex", "headerLength", "Lkotlin/Pair;", "secondByteIndex", "thirdByteIndex"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class RequestHeader implements com.discover.mpos.sdk.core.emv.EmvData {
    private final int classByte;
    private final int firstByteIndex;
    private final int fourthByteIndex;
    private final int headerLength;
    private final int instruction;
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> parameterPair;
    private final int secondByteIndex;
    private final int thirdByteIndex;

    public RequestHeader(int i, int i2, kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        this.classByte = i;
        this.instruction = i2;
        this.parameterPair = pair;
        this.secondByteIndex = 1;
        this.thirdByteIndex = 2;
        this.fourthByteIndex = 3;
        this.headerLength = 4;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.EmvData.DefaultImpls.toHexString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        byte[] bArr = new byte[this.headerLength];
        bArr[this.firstByteIndex] = (byte) this.classByte;
        bArr[this.secondByteIndex] = (byte) this.instruction;
        bArr[this.thirdByteIndex] = (byte) this.parameterPair.getFirst().intValue();
        bArr[this.fourthByteIndex] = (byte) this.parameterPair.getSecond().intValue();
        return bArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestHeader(classByte=");
        sb.append(this.classByte);
        sb.append(", instruction=");
        sb.append(this.instruction);
        sb.append(", parameterPair=");
        sb.append(this.parameterPair);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.classByte);
        int hashCode2 = java.lang.Integer.hashCode(this.instruction);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = this.parameterPair;
        return (((hashCode * 31) + hashCode2) * 31) + (pair != null ? pair.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.card.apdu.base.RequestHeader)) {
            return false;
        }
        com.discover.mpos.sdk.card.apdu.base.RequestHeader requestHeader = (com.discover.mpos.sdk.card.apdu.base.RequestHeader) other;
        return this.classByte == requestHeader.classByte && this.instruction == requestHeader.instruction && kotlin.jvm.internal.Intrinsics.areEqual(this.parameterPair, requestHeader.parameterPair);
    }

    public final com.discover.mpos.sdk.card.apdu.base.RequestHeader copy(int classByte, int instruction, kotlin.Pair<java.lang.Integer, java.lang.Integer> parameterPair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterPair, "");
        return new com.discover.mpos.sdk.card.apdu.base.RequestHeader(classByte, instruction, parameterPair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.discover.mpos.sdk.card.apdu.base.RequestHeader copy$default(com.discover.mpos.sdk.card.apdu.base.RequestHeader requestHeader, int i, int i2, kotlin.Pair pair, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = requestHeader.classByte;
        }
        if ((i3 & 2) != 0) {
            i2 = requestHeader.instruction;
        }
        if ((i3 & 4) != 0) {
            pair = requestHeader.parameterPair;
        }
        return requestHeader.copy(i, i2, pair);
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> component3() {
        return this.parameterPair;
    }

    /* renamed from: component2, reason: from getter */
    private final int getInstruction() {
        return this.instruction;
    }

    /* renamed from: component1, reason: from getter */
    private final int getClassByte() {
        return this.classByte;
    }
}
