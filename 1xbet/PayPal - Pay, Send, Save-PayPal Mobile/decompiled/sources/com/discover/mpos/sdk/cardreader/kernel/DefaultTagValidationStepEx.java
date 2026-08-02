package com.discover.mpos.sdk.cardreader.kernel;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bR\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/DefaultTagValidationStepEx;", "InputData", "Lcom/discover/mpos/sdk/cardreader/kernel/BaseTagValidationStep;", "expectedLengthRange", "Lkotlin/ranges/IntRange;", "lengthValidator", "Lcom/discover/mpos/sdk/core/emv/Validator;", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "(Lkotlin/ranges/IntRange;Lcom/discover/mpos/sdk/core/emv/Validator;)V", "validator", "getValidator", "()Lcom/discover/mpos/sdk/core/emv/Validator;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public abstract class DefaultTagValidationStepEx<InputData> extends com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep<InputData> {

    /* renamed from: a, reason: collision with root package name */
    private final com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> f3010a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultTagValidationStepEx(kotlin.ranges.IntRange intRange, com.discover.mpos.sdk.core.emv.Validator validator, int i) {
        this(validator);
        intRange = (i & 1) != 0 ? null : intRange;
        if ((i & 2) != 0) {
            validator = intRange != null ? new com.discover.mpos.sdk.card.apdu.h.validators.TlvLengthValidator(intRange) : null;
        }
    }

    private DefaultTagValidationStepEx(com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> validator) {
        this.f3010a = validator;
    }

    @Override // com.discover.mpos.sdk.cardreader.kernel.BaseTagValidationStep
    protected final com.discover.mpos.sdk.core.emv.Validator<com.discover.mpos.sdk.core.emv.tlv.Tlv> a() {
        return new com.discover.mpos.sdk.card.apdu.h.validators.DefaultTlvValidator(this.f3010a, b());
    }
}
