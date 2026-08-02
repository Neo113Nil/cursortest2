package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/data/Track2EquivalentData;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "content", "", "([B)V", "expirationDate", "Lcom/discover/mpos/sdk/data/CardDate;", "getExpirationDate", "()Lcom/discover/mpos/sdk/data/CardDate;", "expirationDate$delegate", "Lkotlin/Lazy;", "hexContent", "monthFirstDigitIndex", "", "monthSecondDigitIndex", "pan", "getPan", "()[B", "pan$delegate", "separatorByte", "", "clear", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.f, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class Track2EquivalentData implements com.discover.mpos.sdk.core.emv.Clearable {

    /* renamed from: a, reason: collision with root package name */
    final byte f3214a = 13;
    final byte[] b;
    final int c;
    final int d;
    public final kotlin.Lazy e;
    private final kotlin.Lazy f;

    public Track2EquivalentData(byte[] bArr) {
        byte[] hexToByteArray;
        this.b = (bArr == null || (hexToByteArray = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.hexToByteArray(bArr)) == null) ? new byte[0] : hexToByteArray;
        this.c = 2;
        this.d = 3;
        this.f = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.data.Track2EquivalentData.b());
        this.e = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.data.Track2EquivalentData.a());
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(a());
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(this.b);
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.data.f$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            int indexOf = kotlin.collections.ArraysKt.indexOf(com.discover.mpos.sdk.data.Track2EquivalentData.this.b, com.discover.mpos.sdk.data.Track2EquivalentData.this.f3214a);
            byte[] copyOfRange = indexOf >= 0 ? kotlin.collections.ArraysKt.copyOfRange(com.discover.mpos.sdk.data.Track2EquivalentData.this.b, 0, indexOf) : null;
            return copyOfRange == null ? new byte[0] : copyOfRange;
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/discover/mpos/sdk/data/CardDate;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.data.f$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.discover.mpos.sdk.data.CardDate> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ com.discover.mpos.sdk.data.CardDate invoke() {
            int indexOf = kotlin.collections.ArraysKt.indexOf(com.discover.mpos.sdk.data.Track2EquivalentData.this.b, com.discover.mpos.sdk.data.Track2EquivalentData.this.f3214a);
            int i = indexOf + 1;
            if (i <= 0) {
                return null;
            }
            return new com.discover.mpos.sdk.data.CardDate(com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.secNumToInt(com.discover.mpos.sdk.data.Track2EquivalentData.this.b, i, indexOf + 2), com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.secNumToInt(com.discover.mpos.sdk.data.Track2EquivalentData.this.b, com.discover.mpos.sdk.data.Track2EquivalentData.this.c + i, i + com.discover.mpos.sdk.data.Track2EquivalentData.this.d));
        }

        a() {
            super(0);
        }
    }

    public final byte[] a() {
        return (byte[]) this.f.getValue();
    }
}
