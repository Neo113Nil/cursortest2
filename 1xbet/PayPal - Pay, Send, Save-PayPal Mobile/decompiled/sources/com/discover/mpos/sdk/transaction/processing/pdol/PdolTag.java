package com.discover.mpos.sdk.transaction.processing.pdol;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolTag;", "", "tag", "", "length", "", "(Ljava/lang/String;I)V", "isMandatory", "", "()Z", "getLength", "()I", "getTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class PdolTag {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3275a;
    public final java.lang.String b;
    public final int c;

    public PdolTag(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.b = str;
        this.c = i;
        this.f3275a = com.discover.mpos.sdk.transaction.processing.pdol.d.f3276a.contains(str);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.b);
        sb.append(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexByteArray(this.c));
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.b;
        return ((str != null ? str.hashCode() : 0) * 31) + java.lang.Integer.hashCode(this.c);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.transaction.processing.pdol.PdolTag)) {
            return false;
        }
        com.discover.mpos.sdk.transaction.processing.pdol.PdolTag pdolTag = (com.discover.mpos.sdk.transaction.processing.pdol.PdolTag) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, pdolTag.b) && this.c == pdolTag.c;
    }
}
