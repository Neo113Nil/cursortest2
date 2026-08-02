package com.discover.mpos.sdk.card.apdu.h.validators;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/tlv/validators/TlvLengthValidatorForMultiplier;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "multiplier", "", "(I)V", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.h.a.d, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TlvLengthValidatorForMultiplier implements com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> {

    /* renamed from: a, reason: collision with root package name */
    private final int f2974a = 4;

    @Override // com.discover.mpos.sdk.core.emv.Validator
    public final /* synthetic */ boolean isValid(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = tlv;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        int length = tlv2.getLength();
        return length > 0 && length % this.f2974a == 0;
    }
}
