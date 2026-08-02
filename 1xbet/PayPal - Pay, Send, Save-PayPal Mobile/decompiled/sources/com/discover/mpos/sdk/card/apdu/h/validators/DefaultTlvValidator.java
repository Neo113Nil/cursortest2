package com.discover.mpos.sdk.card.apdu.h.validators;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/tlv/validators/DefaultTlvValidator;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "lengthValidator", "contentValidator", "debugTag", "", "(Lcom/discover/mpos/sdk/core/emv/Validator;Lcom/discover/mpos/sdk/core/emv/Validator;Ljava/lang/String;)V", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.h.a.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DefaultTlvValidator implements com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> f2972a;
    private final com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> b;
    private final java.lang.String c;

    private DefaultTlvValidator(com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> validator, com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> validator2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validator2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f2972a = validator;
        this.b = validator2;
        this.c = str;
    }

    public /* synthetic */ DefaultTlvValidator(com.discover.mpos.sdk.core.emv.Validator validator, java.lang.String str) {
        this(validator, new com.discover.mpos.sdk.card.apdu.h.validators.TlvContentPresenceValidator(), str);
    }

    @Override // com.discover.mpos.sdk.core.emv.Validator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean isValid(com.discover.mpos.sdk.core.emv.tlv.Tlv tlv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tlv, "");
        com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> validator = this.f2972a;
        kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Boolean.valueOf(validator != null ? validator.isValid(tlv) : true), java.lang.Boolean.valueOf(this.f2972a == null));
        boolean isValid = this.b.isValid(tlv);
        new java.lang.Object[]{tlv.getTag(), java.lang.Boolean.valueOf(isValid), pair.getFirst(), pair.getSecond()};
        return ((java.lang.Boolean) pair.getFirst()).booleanValue() && isValid;
    }
}
