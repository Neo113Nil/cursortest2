package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nJ\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0019H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082D¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/discover/mpos/sdk/data/CardDate;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "", "month", "(II)V", "dateBytes", "", "([B)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "date$delegate", "Lkotlin/Lazy;", "dateWithDay", "dateWithoutDay", "dayPosition", "initialYear", "monthPosition", "mothsThreshold", "yearPosition", "clear", "", "fullDateFormat", "Ljava/util/Calendar;", "isAfter", "", "then", "isBefore", "shortDateFormat", "toByteArray", "yearAndMonth", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class CardDate implements com.discover.mpos.sdk.core.emv.ClearableEmvData {

    /* renamed from: a, reason: collision with root package name */
    final int f3205a;
    final int b;
    final int c;
    final byte[] d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final kotlin.Lazy i;

    public CardDate(byte[] bArr) {
        this.d = bArr;
        this.f = 1;
        this.f3205a = 2;
        this.g = 2000;
        this.b = 3;
        this.c = 2;
        this.h = 1;
        this.i = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.data.CardDate.a());
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardDate(int i, int i2) {
        this(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(java.lang.String.format("%02d%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)}, 2))));
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
    }

    final java.util.Calendar b() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i = this.g;
        byte[] bArr = this.d;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
        calendar.set(1, i + java.lang.Integer.parseInt(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(bArr[this.e])));
        calendar.set(2, java.lang.Integer.parseInt(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(this.d[this.f])) - this.h);
        return calendar;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getK() {
        byte[] copyOf;
        byte[] bArr = this.d;
        return (bArr == null || (copyOf = java.util.Arrays.copyOf(bArr, bArr.length)) == null) ? new byte[0] : copyOf;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        java.util.Date a2 = a();
        if (a2 != null) {
            a2.setTime(0L);
        }
        byte[] bArr = this.d;
        if (bArr != null) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(bArr);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.data.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.util.Date> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ java.util.Date invoke() {
            java.util.Calendar calendar;
            byte[] bArr = com.discover.mpos.sdk.data.CardDate.this.d;
            java.lang.Integer valueOf = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
            int i = com.discover.mpos.sdk.data.CardDate.this.b;
            if (valueOf != null && valueOf.intValue() == i) {
                com.discover.mpos.sdk.data.CardDate cardDate = com.discover.mpos.sdk.data.CardDate.this;
                calendar = cardDate.b();
                byte[] bArr2 = cardDate.d;
                kotlin.jvm.internal.Intrinsics.checkNotNull(bArr2);
                calendar.set(5, java.lang.Integer.parseInt(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexString(bArr2[cardDate.f3205a])));
            } else {
                int i2 = com.discover.mpos.sdk.data.CardDate.this.c;
                if (valueOf == null || valueOf.intValue() != i2) {
                    calendar = null;
                } else {
                    calendar = com.discover.mpos.sdk.data.CardDate.this.b();
                    calendar.set(5, calendar.getActualMaximum(5));
                }
            }
            if (calendar != null) {
                return calendar.getTime();
            }
            return null;
        }

        a() {
            super(0);
        }
    }

    public final java.util.Date a() {
        return (java.util.Date) this.i.getValue();
    }
}
