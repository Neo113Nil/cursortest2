package com.google.android.libraries.places.api.model.kotlin;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "currencyCode", "", "units", "", "nanos", "Lcom/google/android/libraries/places/api/model/Money;", "money", "(Ljava/lang/String;JI)Lcom/google/android/libraries/places/api/model/Money;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MoneyKt {
    public static final com.google.android.libraries.places.api.model.Money money(java.lang.String str, long j, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.android.libraries.places.api.model.Money newInstance = com.google.android.libraries.places.api.model.Money.newInstance(str, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
