package com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002J\u0006\u0010\u001f\u001a\u00020\u000bJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u000eR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/oda/flow/icc/DataToBeAuthenticated;", "", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "(Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;)V", "applicationFileLocator", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ApplicationFileLocator;", "staticDataToBeAuthenticated", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "aip", "", "(Ljava/util/List;Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;[B)V", "getAip", "()[B", "applicationInterchangeProfile", "getApplicationInterchangeProfile", "applicationInterchangeProfile$delegate", "Lkotlin/Lazy;", "concatenatedDataRecords", "getConcatenatedDataRecords", "concatenatedDataRecords$delegate", "largeRecordRange", "Lkotlin/ranges/IntRange;", "shortRecordRange", "getStaticDataToBeAuthenticated", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "computeTlvData", "shortFileIndicator", "", "rrContent", "concatenate", "isAnyDataRecordNeedingAuthentication", "", "isApplicationInterchangeProfileMissing", "isStaticDataToBeAuthenticatedPresent", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DataToBeAuthenticated {

    /* renamed from: a, reason: collision with root package name */
    final kotlin.ranges.IntRange f3048a;
    final kotlin.ranges.IntRange b;
    final java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> c;
    final com.discover.mpos.sdk.core.emv.tlv.Tlv d;
    final byte[] e;
    private final kotlin.Lazy f;
    private final kotlin.Lazy g;

    private DataToBeAuthenticated(java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> list, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.c = list;
        this.d = tlv;
        this.e = bArr;
        this.f3048a = new kotlin.ranges.IntRange(1, 10);
        this.b = new kotlin.ranges.IntRange(11, 30);
        this.f = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.b());
        this.g = com.discover.mpos.sdk.core.extensions.UtilExtensionsKt.unsafeLazy(new com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.a());
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.a$b */
    static final class b extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder byteArrayBuilder = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder();
            java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> list = com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.this.c;
            java.util.ArrayList<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator) obj).b.e > 0) {
                    arrayList.add(obj);
                }
            }
            for (com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator applicationFileLocator : arrayList) {
                int i = applicationFileLocator.b.e;
                for (int i2 = 0; i2 < i; i2++) {
                    com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated dataToBeAuthenticated = com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.this;
                    int i3 = applicationFileLocator.b.d;
                    byte[] byteArray = applicationFileLocator.f3171a.get(i2).getContent().getE();
                    if (!dataToBeAuthenticated.f3048a.contains(i3)) {
                        byteArray = dataToBeAuthenticated.b.contains(i3) ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.READ_RECORD_RESPONSE_MESSAGE_TEMPLATE.getTag(), byteArray, 0, 0, 12, null).getE() : new byte[0];
                    }
                    byteArrayBuilder.append(byteArray);
                }
            }
            return byteArrayBuilder.build();
        }

        b() {
            super(0);
        }
    }

    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.d.b.a.a$a */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<byte[]> {
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            byte[] content;
            com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.this.d;
            if (tlv == null || (content = tlv.getContent()) == null || !java.util.Arrays.equals(content, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_INTERCHANGE_PROFILE.getTag()))) {
                return null;
            }
            return com.discover.mpos.sdk.cardreader.kernel.flow.oda.flow.icc.DataToBeAuthenticated.this.e;
        }

        a() {
            super(0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DataToBeAuthenticated(com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        this(r0, r1, r5 != null ? r5.getContent() : null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ApplicationFileLocator> list = processingData.l;
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) processingData.v.a(processingData, com.discover.mpos.sdk.transaction.processing.ProcessingData.f3244a[16]);
        com.discover.mpos.sdk.core.emv.tlv.Tlv c = processingData.c(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_INTERCHANGE_PROFILE.getTag());
    }

    public final byte[] b() {
        return (byte[]) this.g.getValue();
    }

    public final byte[] a() {
        return (byte[]) this.f.getValue();
    }
}
