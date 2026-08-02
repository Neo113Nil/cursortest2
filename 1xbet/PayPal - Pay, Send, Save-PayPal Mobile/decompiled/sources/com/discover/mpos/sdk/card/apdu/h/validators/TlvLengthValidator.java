package com.discover.mpos.sdk.card.apdu.h.validators;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/tlv/validators/TlvLengthValidator;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "lengthRange", "Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.h.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class TlvLengthValidator implements com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.ranges.IntRange f2973a;

    public TlvLengthValidator(kotlin.ranges.IntRange intRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intRange, "");
        this.f2973a = intRange;
    }

    @Override // com.discover.mpos.sdk.core.emv.Validator
    public final /* synthetic */ boolean isValid(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        com.discover.mpos.sdk.core.emv.tlv.Tlv tlv2 = tlv;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv2, "");
        return this.f2973a.contains(tlv2.getLength());
    }
}
