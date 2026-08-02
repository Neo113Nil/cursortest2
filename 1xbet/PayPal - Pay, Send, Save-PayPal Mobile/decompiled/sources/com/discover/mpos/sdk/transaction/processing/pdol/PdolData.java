package com.discover.mpos.sdk.transaction.processing.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0002\u0010\u0007B\u000f\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00120\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001cR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "pdolSourceHex", "", "(Ljava/lang/String;)V", "pdolData", "(Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;)V", "pdolContent", "", "([B)V", "isNotEmpty", "", "()Z", "privatePdol", "", "Lcom/discover/mpos/sdk/transaction/processing/pdol/Pdol;", "clear", "", "forEach", "action", "Lkotlin/Function1;", "get", "tag", "operatorSpecificUpdate", "update", "Lcom/discover/mpos/sdk/data/external/readdatarecord/PdolUpdate;", "parsePdol", "", "toByteArray", "toHexString", "toString", "toTlvs", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class PdolData implements com.discover.mpos.sdk.core.emv.Clearable, com.discover.mpos.sdk.core.emv.EmvData {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List<com.discover.mpos.sdk.transaction.processing.pdol.Pdol> f3273a;
    private final byte[] b;

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/discover/mpos/sdk/transaction/processing/pdol/Pdol;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.processing.a.b$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<com.discover.mpos.sdk.transaction.processing.pdol.Pdol, java.lang.CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.discover.mpos.sdk.transaction.processing.pdol.PdolData.a f3274a = new com.discover.mpos.sdk.transaction.processing.pdol.PdolData.a();

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.CharSequence invoke(com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol) {
            com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol2 = pdol;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdol2, "");
            byte[] bArr = pdol2.b;
            if (bArr == null) {
                bArr = new byte[0];
            }
            return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(bArr);
        }

        a() {
            super(1);
        }
    }

    public PdolData(byte[] bArr) {
        this.b = bArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f3273a = arrayList;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        arrayList.addAll(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdolData(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData) {
        this(new byte[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdolData, "");
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a2 = pdolData.a();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(a2, 10));
        java.util.Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).copy());
        }
        java.util.ArrayList<com.discover.mpos.sdk.core.emv.tlv.Tlv> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (com.discover.mpos.sdk.core.emv.tlv.Tlv tlv : arrayList2) {
            arrayList3.add(new com.discover.mpos.sdk.transaction.processing.pdol.Pdol(new com.discover.mpos.sdk.transaction.processing.pdol.PdolTag(tlv.getTag(), tlv.getLength()), tlv.getContent()));
        }
        this.f3273a = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) arrayList3);
    }

    public final com.discover.mpos.sdk.transaction.processing.pdol.Pdol a(java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.f3273a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.discover.mpos.sdk.transaction.processing.pdol.Pdol) obj).f3272a.b, str)) {
                break;
            }
        }
        return (com.discover.mpos.sdk.transaction.processing.pdol.Pdol) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(kotlin.jvm.functions.Function1<? super com.discover.mpos.sdk.transaction.processing.pdol.Pdol, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Iterator<T> it = this.f3273a.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getK() {
        com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
        java.util.Iterator<T> it = this.f3273a.iterator();
        while (it.hasNext()) {
            byteArrayBuilder.append(((com.discover.mpos.sdk.transaction.processing.pdol.Pdol) it.next()).b);
        }
        return byteArrayBuilder.build();
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        java.util.Iterator<T> it = this.f3273a.iterator();
        while (it.hasNext()) {
            ((com.discover.mpos.sdk.transaction.processing.pdol.Pdol) it.next()).clear();
        }
        this.f3273a.clear();
    }

    private final java.util.List<com.discover.mpos.sdk.transaction.processing.pdol.Pdol> b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        byte[] bArr = this.b;
        if (bArr != null) {
            int i = 0;
            while (i < bArr.length) {
                int tagValueBytesLength = com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.isTagMoreThanOneBit(bArr[i]) ? com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.tagValueBytesLength(kotlin.collections.ArraysKt.copyOfRange(bArr, 1, bArr.length)) + 1 : 1;
                int i2 = i + tagValueBytesLength;
                arrayList.add(new com.discover.mpos.sdk.transaction.processing.pdol.Pdol(new com.discover.mpos.sdk.transaction.processing.pdol.PdolTag(com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(kotlin.collections.ArraysKt.copyOfRange(bArr, i, i2)), com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toUnsignedInt(bArr[i2]))));
                i += tagValueBytesLength + 1;
            }
        }
        return arrayList;
    }

    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> a() {
        java.util.List<com.discover.mpos.sdk.transaction.processing.pdol.Pdol> list = this.f3273a;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (com.discover.mpos.sdk.transaction.processing.pdol.Pdol pdol : list) {
            arrayList.add(new com.discover.mpos.sdk.core.emv.tlv.Tlv(pdol.f3272a.b, pdol.b, 0, 0, 12, null));
        }
        return arrayList;
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.f3273a, "", null, null, 0, null, com.discover.mpos.sdk.transaction.processing.pdol.PdolData.a.f3274a, 30, null);
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return toString();
    }
}
