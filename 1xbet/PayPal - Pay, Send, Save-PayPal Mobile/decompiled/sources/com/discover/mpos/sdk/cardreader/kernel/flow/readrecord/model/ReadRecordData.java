package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordData;", "", "aflTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "readRecordParameters", "", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordParameter;", "parser", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/ApplicationFileLocatorParser;", "gpoTlvs", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Ljava/util/List;Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/ApplicationFileLocatorParser;Ljava/util/List;)V", "getAflTlv", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "setAflTlv", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "getGpoTlvs", "()Ljava/util/List;", "getParser", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/ApplicationFileLocatorParser;", "getReadRecordParameters", "setReadRecordParameters", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.c.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ReadRecordData {

    /* renamed from: a, reason: collision with root package name */
    public com.discover.mpos.sdk.core.emv.tlv.Tlv f3172a;
    public java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter> b;
    public final com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser c;
    public final java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> d;

    private ReadRecordData(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter> list, com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser applicationFileLocatorParser, java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationFileLocatorParser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.f3172a = tlv;
        this.b = list;
        this.c = applicationFileLocatorParser;
        this.d = list2;
    }

    public /* synthetic */ ReadRecordData(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, java.util.List list, com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser applicationFileLocatorParser, java.util.List list2, int i) {
        this((i & 1) != 0 ? null : tlv, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? new com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser() : applicationFileLocatorParser, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadRecordData(aflTlv=");
        sb.append(this.f3172a);
        sb.append(", readRecordParameters=");
        sb.append(this.b);
        sb.append(", parser=");
        sb.append(this.c);
        sb.append(", gpoTlvs=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.f3172a;
        int hashCode = tlv != null ? tlv.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter> list = this.b;
        int hashCode2 = list != null ? list.hashCode() : 0;
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow.ApplicationFileLocatorParser applicationFileLocatorParser = this.c;
        int hashCode3 = applicationFileLocatorParser != null ? applicationFileLocatorParser.hashCode() : 0;
        java.util.List<com.discover.mpos.sdk.core.emv.tlv.Tlv> list2 = this.d;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData readRecordData = (com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3172a, readRecordData.f3172a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, readRecordData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, readRecordData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, readRecordData.d);
    }

    public ReadRecordData() {
        this(null, null, null, null, 15);
    }
}
