package com.discover.mpos.sdk.core.extensions.tlv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0007¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\t\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u0010J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0004\b\t\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0006J\u001e\u0010\u0018\u001a\u00020\u0000*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "", "array", "<init>", "([B)V", "()V", "Lcom/discover/mpos/sdk/core/emv/EmvData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "append", "(Lcom/discover/mpos/sdk/core/emv/EmvData;)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "builder", "(Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "", "byte", "(Ljava/lang/Byte;)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "([B)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "", "tlvs", "(Ljava/util/List;)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "build", "()[B", "", "clear", "plus", "([B[B)Lcom/discover/mpos/sdk/core/extensions/tlv/ByteArrayBuilder;", "", "listOfArrays", "Ljava/util/List;", "", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class ByteArrayBuilder implements com.discover.mpos.sdk.core.emv.Clearable {
    private final java.util.List<byte[]> listOfArrays;
    private int size;

    public ByteArrayBuilder() {
        this.listOfArrays = new java.util.ArrayList();
    }

    public ByteArrayBuilder(byte[] bArr) {
        this();
        append(bArr);
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append(byte[] array) {
        if (array != null) {
            this.listOfArrays.add(array);
            this.size += array.length;
        }
        return this;
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append(com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        this.listOfArrays.addAll(builder.listOfArrays);
        this.size += builder.size;
        return this;
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder plus(byte[] bArr, byte[] bArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        return append(bArr2);
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append(com.discover.mpos.sdk.core.emv.EmvData data) {
        return append(data != null ? data.getB() : null);
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append(java.lang.Byte r3) {
        return r3 != null ? append(new byte[]{r3.byteValue()}) : this;
    }

    public final com.discover.mpos.sdk.core.extensions.tlv.ByteArrayBuilder append(java.util.List<? extends com.discover.mpos.sdk.core.emv.EmvData> tlvs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlvs, "");
        java.util.Iterator<T> it = tlvs.iterator();
        while (it.hasNext()) {
            append(((com.discover.mpos.sdk.core.emv.EmvData) it.next()).getB());
        }
        return this;
    }

    public final byte[] build() {
        byte[] bArr = new byte[this.size];
        int i = 0;
        for (byte[] bArr2 : this.listOfArrays) {
            java.lang.System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            i += bArr2.length;
        }
        return bArr;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.listOfArrays.clear();
        this.size = 0;
    }
}
