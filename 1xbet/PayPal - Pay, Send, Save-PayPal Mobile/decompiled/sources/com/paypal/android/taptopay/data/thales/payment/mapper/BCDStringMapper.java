package com.paypal.android.taptopay.data.thales.payment.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/payment/mapper/BCDStringMapper;", "Lcom/paypal/android/taptopay/domain/core/Mapper;", "", "", "<init>", "()V", "input", "map", "([B)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BCDStringMapper implements com.paypal.android.taptopay.domain.core.Mapper<byte[], java.lang.String> {
    @Override // com.paypal.android.taptopay.domain.core.Mapper
    public final java.lang.String map(byte[] input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : input) {
            sb.append((b >> 4) & 15);
            sb.append(b & com.google.common.base.Ascii.SI);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
