package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0018\u001a\u00020\u0016J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordParameter;", "", "referenceControlParameter", "", "startRecord", "endRecord", "shortFileIndicator", "odaRecordsCount", "(IIIII)V", "getEndRecord", "()I", "getOdaRecordsCount", "getReferenceControlParameter", "getShortFileIndicator", "getStartRecord", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hasOdaRecords", "hashCode", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.c.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ReadRecordParameter {

    /* renamed from: a, reason: collision with root package name */
    public final int f3173a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ReadRecordParameter(int i, int i2, int i3, int i4, int i5) {
        this.f3173a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadRecordParameter(referenceControlParameter=");
        sb.append(this.f3173a);
        sb.append(", startRecord=");
        sb.append(this.b);
        sb.append(", endRecord=");
        sb.append(this.c);
        sb.append(", shortFileIndicator=");
        sb.append(this.d);
        sb.append(", odaRecordsCount=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f3173a) * 31) + java.lang.Integer.hashCode(this.b)) * 31) + java.lang.Integer.hashCode(this.c)) * 31) + java.lang.Integer.hashCode(this.d)) * 31) + java.lang.Integer.hashCode(this.e);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter readRecordParameter = (com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordParameter) other;
        return this.f3173a == readRecordParameter.f3173a && this.b == readRecordParameter.b && this.c == readRecordParameter.c && this.d == readRecordParameter.d && this.e == readRecordParameter.e;
    }
}
