package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a-\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\n\u001a\u00020\t2\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u0007\"\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "paypalPartnerId", "consumerId", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "createTapToPayReference", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TapToPayReference;", "", "refArguments", "", "verifyReferenceArgument", "([Ljava/lang/String;)V"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PaymentUtilsKt {
    public static /* synthetic */ com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference createTapToPayReference$default(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return createTapToPayReference(str, str2, str3);
    }

    public static final com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference createTapToPayReference(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        verifyReferenceArgument(str, str2, str3);
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Builder builder = new com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference.Builder(str);
        if (str2 != null) {
            if (kotlin.text.StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                builder.paypalPartnerId(str2);
            }
        }
        if (str3 != null) {
            if ((kotlin.text.StringsKt.isBlank(str3) ? null : str3) != null) {
                builder.put("consumerId", str3);
            }
        }
        return builder.build();
    }

    public static final void verifyReferenceArgument(java.lang.String... strArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        for (java.lang.String str : kotlin.collections.ArraysKt.filterNotNull(strArr)) {
            java.lang.String str2 = str;
            if (kotlin.text.StringsKt.isBlank(str2) || str2.length() == 0 || str.length() > 128) {
                throw new com.zettle.sdk.features.ActionValidationError(new java.lang.IllegalArgumentException("reference can't be empty, blank or longer than 128 characters"));
            }
        }
    }
}
