package com.discover.mpos.sdk.core.emv.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/tlv/TlvValueFormat;", "", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "tlv", "Lcom/discover/mpos/sdk/core/emv/tlv/ValueFormat;", "format", "<init>", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/ValueFormat;)V", "component1", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "component2", "()Lcom/discover/mpos/sdk/core/emv/tlv/ValueFormat;", "copy", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;Lcom/discover/mpos/sdk/core/emv/tlv/ValueFormat;)Lcom/discover/mpos/sdk/core/emv/tlv/TlvValueFormat;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/discover/mpos/sdk/core/emv/tlv/ValueFormat;", "getFormat", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getTlv"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final /* data */ class TlvValueFormat {
    private final com.discover.mpos.sdk.core.emv.tlv.ValueFormat format;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;

    public TlvValueFormat(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.ValueFormat valueFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueFormat, "");
        this.tlv = tlv;
        this.format = valueFormat;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getTlv() {
        return this.tlv;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.ValueFormat getFormat() {
        return this.format;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TlvValueFormat(tlv=");
        sb.append(this.tlv);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = this.tlv;
        int hashCode = tlv != null ? tlv.hashCode() : 0;
        com.discover.mpos.sdk.core.emv.tlv.ValueFormat valueFormat = this.format;
        return (hashCode * 31) + (valueFormat != null ? valueFormat.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat)) {
            return false;
        }
        com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat tlvValueFormat = (com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tlv, tlvValueFormat.tlv) && kotlin.jvm.internal.Intrinsics.areEqual(this.format, tlvValueFormat.format);
    }

    public final com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat copy(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.ValueFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        return new com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat(tlv, format);
    }

    /* renamed from: component2, reason: from getter */
    public final com.discover.mpos.sdk.core.emv.tlv.ValueFormat getFormat() {
        return this.format;
    }

    /* renamed from: component1, reason: from getter */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getTlv() {
        return this.tlv;
    }

    public static /* synthetic */ com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat copy$default(com.discover.mpos.sdk.core.emv.tlv.TlvValueFormat tlvValueFormat, com.discover.mpos.sdk.core.emv.tlv.Tlv tlv, com.discover.mpos.sdk.core.emv.tlv.ValueFormat valueFormat, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tlv = tlvValueFormat.tlv;
        }
        if ((i & 2) != 0) {
            valueFormat = tlvValueFormat.format;
        }
        return tlvValueFormat.copy(tlv, valueFormat);
    }
}
