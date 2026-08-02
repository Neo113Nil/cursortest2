package com.google.crypto.tink.tinkkey.internal;

/* loaded from: classes9.dex */
public final class InternalKeyHandle extends com.google.crypto.tink.tinkkey.KeyHandle {
    public InternalKeyHandle(com.google.crypto.tink.tinkkey.TinkKey tinkKey, com.google.crypto.tink.proto.KeyStatusType keyStatusType, int i) {
        super(tinkKey, com.google.crypto.tink.internal.KeyStatusTypeProtoConverter.fromProto(keyStatusType), i);
    }
}
