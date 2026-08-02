package com.datadog.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/datadog/android/compose/HashcodeBackStackKeyResolver;", "", "T", "Lcom/datadog/android/compose/BackStackKeyResolver;", "<init>", "()V", "item", "", "getStableKey", "(Ljava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HashcodeBackStackKeyResolver<T> implements com.datadog.android.compose.BackStackKeyResolver<T> {
    public static final int $stable = 0;

    @Override // com.datadog.android.compose.BackStackKeyResolver
    public final java.lang.String getStableKey(T item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return java.lang.String.valueOf(item.hashCode());
    }
}
