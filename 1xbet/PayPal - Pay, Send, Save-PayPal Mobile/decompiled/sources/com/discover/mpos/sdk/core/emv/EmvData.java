package com.discover.mpos.sdk.core.emv;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/discover/mpos/sdk/core/emv/EmvData;", "", "", "toByteArray", "()[B", "", "toHexString", "()Ljava/lang/String;"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public interface EmvData {
    byte[] toByteArray();

    java.lang.String toHexString();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    public static final class DefaultImpls {
        public static java.lang.String toHexString(com.discover.mpos.sdk.core.emv.EmvData emvData) {
            return com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(emvData.toByteArray());
        }
    }
}
