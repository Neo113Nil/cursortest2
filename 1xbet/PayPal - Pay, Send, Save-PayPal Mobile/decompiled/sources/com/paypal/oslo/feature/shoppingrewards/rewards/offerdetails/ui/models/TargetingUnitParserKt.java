package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a!\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/ParsedTargetingUnit;", "parseTargetingUnitId", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/ParsedTargetingUnit;", "", "findLastDotIndex", "(Ljava/lang/String;)I", "index", "", "hasValidLastDot", "(I)Z", "lastDotIndex", "findSecondLastDotIndex", "(Ljava/lang/String;I)I", "hasValidSecondLastDot", "secondLastDotIndex", "createParsedTargetingUnit", "(Ljava/lang/String;II)Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/models/ParsedTargetingUnit;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TargetingUnitParserKt {
    public static final boolean hasValidLastDot(int i) {
        return i != -1;
    }

    public static final boolean hasValidSecondLastDot(int i) {
        return i != -1;
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit parseTargetingUnitId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int findLastDotIndex = findLastDotIndex(str);
        int findSecondLastDotIndex = findSecondLastDotIndex(str, findLastDotIndex);
        if (hasValidLastDot(findLastDotIndex) && hasValidSecondLastDot(findSecondLastDotIndex)) {
            return createParsedTargetingUnit(str, findSecondLastDotIndex, findLastDotIndex);
        }
        return null;
    }

    public static final int findLastDotIndex(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, 0, false, 6, (java.lang.Object) null);
    }

    public static final int findSecondLastDotIndex(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, i - 1, false, 4, (java.lang.Object) null);
    }

    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit createParsedTargetingUnit(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String substring = str.substring(0, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = str.substring(i + 1, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.String substring3 = str.substring(i2 + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui.models.ParsedTargetingUnit(substring, substring2, substring3);
    }
}
