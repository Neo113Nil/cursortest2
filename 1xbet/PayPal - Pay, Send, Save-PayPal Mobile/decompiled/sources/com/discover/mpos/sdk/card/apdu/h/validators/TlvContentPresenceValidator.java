package com.discover.mpos.sdk.card.apdu.h.validators;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/tlv/validators/TlvContentPresenceValidator;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "()V", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.h.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TlvContentPresenceValidator implements com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> {
    @Override // com.discover.mpos.sdk.core.emv.Validator
    public final /* synthetic */ boolean isValid(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = tlv;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        return tlv2.getContent() != null;
    }
}
