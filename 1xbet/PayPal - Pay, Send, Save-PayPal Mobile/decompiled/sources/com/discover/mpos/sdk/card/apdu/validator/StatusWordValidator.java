package com.discover.mpos.sdk.card.apdu.validator;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/card/apdu/validator/StatusWordValidator;", "Lcom/discover/mpos/sdk/core/emv/Validator;", "", "()V", "isValid", "", "toValidate", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.card.apdu.i.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class StatusWordValidator implements com.discover.mpos.sdk.core.emv.Validator<byte[]> {
    @Override // com.discover.mpos.sdk.core.emv.Validator
    public final /* synthetic */ boolean isValid(byte[] bArr) {
        byte[] bArr2 = bArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr2, "");
        return com.discover.mpos.sdk.card.apdu.emv.StatusCodes.SUCCESS.a(bArr2);
    }
}
