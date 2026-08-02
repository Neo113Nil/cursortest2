package com.discover.mpos.sdk.core.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/discover/mpos/sdk/core/data/RootTlv;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "tlv", "<init>", "(Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;)V", "", "clear", "()V", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getTlv", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class RootTlv implements com.discover.mpos.sdk.core.emv.Clearable {
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv tlv;

    public RootTlv(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        this.tlv = tlv;
    }

    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getTlv() {
        return this.tlv;
    }

    @Override // com.discover.mpos.sdk.core.emv.Clearable
    public final void clear() {
        this.tlv.clear();
    }
}
