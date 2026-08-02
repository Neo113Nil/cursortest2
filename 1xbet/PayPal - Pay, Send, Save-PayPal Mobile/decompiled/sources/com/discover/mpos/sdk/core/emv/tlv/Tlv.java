package com.discover.mpos.sdk.core.emv.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u000b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001aR$\u0010\u0004\u001a\u0004\u0018\u00010\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b*\u0010\u001aR\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0083D¢\u0006\u0006\n\u0004\b+\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010!"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "Lcom/discover/mpos/sdk/core/emv/ClearableEmvData;", "", "tag", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/discover/mpos/sdk/core/emv/EmvData;", "emvValue", "(Ljava/lang/String;Lcom/discover/mpos/sdk/core/emv/EmvData;)V", "", "", "lastByteIndex", "length", "(Ljava/lang/String;[BII)V", "", "clear", "()V", "copy", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "isConstructed", "()Z", "tlvLength", "toByteArray", "()[B", "toString", "()Ljava/lang/String;", "getActualLength", "actualLength", "[B", "getContent", "setContent", "([B)V", com.visa.cbp.getEncExpo.warmup, "getLastByteIndex", "getLength", "stringToByteLengthModifier", "Ljava/lang/String;", "getTag"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class Tlv implements com.discover.mpos.sdk.core.emv.ClearableEmvData {
    private byte[] content;
    private final int lastByteIndex;
    private final int length;
    private final int stringToByteLengthModifier;
    private final java.lang.String tag;

    public Tlv(java.lang.String str, byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
        this.content = bArr;
        this.lastByteIndex = i;
        this.length = i2;
        this.stringToByteLengthModifier = 2;
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    public final java.lang.String toHexString() {
        return com.discover.mpos.sdk.core.emv.ClearableEmvData.DefaultImpls.toHexString(this);
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final byte[] getContent() {
        return this.content;
    }

    public final void setContent(byte[] bArr) {
        this.content = bArr;
    }

    public final int getLastByteIndex() {
        return this.lastByteIndex;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Tlv(java.lang.String str, byte[] bArr, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? bArr != null ? bArr.length : 0 : i2);
        bArr = (i3 & 2) != 0 ? null : bArr;
    }

    public final int getLength() {
        return this.length;
    }

    private final int getActualLength() {
        byte[] bArr = this.content;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tlv(java.lang.String str, java.lang.String str2) {
        this(str, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(str2), 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tlv(java.lang.String str, com.discover.mpos.sdk.core.emv.EmvData emvData) {
        this(str, emvData.getB(), 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emvData, "");
    }

    public final boolean isConstructed() {
        byte[] bArr;
        if (((byte) (com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(this.tag)[0] & 32)) != 0 && (bArr = this.content) != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            if (!com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.isZeroOnly(bArr)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.core.emv.tlv.Tlv");
        }
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv = (com.discover.mpos.sdk.core.emv.tlv.Tlv) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.tag, tlv.tag) || getActualLength() != tlv.getActualLength()) {
            return false;
        }
        byte[] bArr = this.content;
        if (bArr != null) {
            if (tlv.content == null) {
                return false;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr);
            byte[] bArr2 = tlv.content;
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArr2);
            if (!java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (tlv.content != null) {
            return false;
        }
        return this.lastByteIndex == tlv.lastByteIndex;
    }

    public final int hashCode() {
        int hashCode = this.tag.hashCode();
        int actualLength = getActualLength();
        byte[] bArr = this.content;
        return (((((hashCode * 31) + actualLength) * 31) + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0)) * 31) + this.lastByteIndex;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Tlv(tag='");
        sb.append(this.tag);
        sb.append("', length=");
        sb.append(getActualLength());
        sb.append(", content=");
        byte[] bArr = this.content;
        sb.append(bArr != null ? com.discover.mpos.sdk.core.emv.tlv.TlvContentStringifier.INSTANCE.stringifierForTag(this.tag).stringify(bArr) : null);
        sb.append(", lastByteIndex=");
        sb.append(this.lastByteIndex);
        sb.append(')');
        return sb.toString();
    }

    @Override // com.discover.mpos.sdk.core.emv.EmvData
    /* renamed from: toByteArray */
    public final byte[] getB() {
        byte[] build;
        byte[] bArr = this.content;
        if (bArr != null) {
            synchronized (bArr) {
                build = new com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder().append(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.hexToByteArray(this.tag)).append(com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexByteArray(getActualLength())).append(bArr).build();
            }
            return build;
        }
        return new byte[0];
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        byte[] bArr = this.content;
        if (bArr != null) {
            com.discover.mpos.sdk.core.extensions.tlv.ByteArrayExtensionsKt.clear(bArr);
        }
        this.content = null;
    }

    public final int tlvLength() {
        int actualLength = getActualLength();
        return (this.tag.length() / this.stringToByteLengthModifier) + com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toHexByteArray(actualLength).length + actualLength;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv copy() {
        java.lang.String str = this.tag;
        byte[] bArr = this.content;
        return new com.discover.mpos.sdk.core.emv.tlv.Tlv(str, bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null, 0, 0, 12, null);
    }
}
