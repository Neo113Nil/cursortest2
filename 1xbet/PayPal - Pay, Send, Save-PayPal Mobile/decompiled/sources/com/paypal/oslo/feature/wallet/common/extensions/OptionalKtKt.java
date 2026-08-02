package com.paypal.oslo.feature.wallet.common.extensions;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u000b*\u0004\u0018\u00018\u00002\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001*\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"T", "Lcom/apollographql/apollo/api/Optional;", "toOptional", "(Ljava/lang/Object;)Lcom/apollographql/apollo/api/Optional;", "", "condition", "Lkotlin/Function0;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "optionalIf", "(ZLkotlin/jvm/functions/Function0;)Lcom/apollographql/apollo/api/Optional;", "A", "B", "Lkotlin/Function1;", "f", "mapOptional", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/apollographql/apollo/api/Optional;", "", "optionalIfNotNullOrBlank", "(Ljava/lang/String;)Lcom/apollographql/apollo/api/Optional;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OptionalKtKt {
    public static final <T> com.apollographql.apollo.api.Optional<T> toOptional(T t) {
        com.apollographql.apollo.api.Optional.Present present;
        return (t == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(t)) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present;
    }

    public static final <T> com.apollographql.apollo.api.Optional<T> optionalIf(boolean z, kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return z ? com.apollographql.apollo.api.Optional.INSTANCE.present(function0.invoke()) : com.apollographql.apollo.api.Optional.Absent.INSTANCE;
    }

    public static final <A, B> com.apollographql.apollo.api.Optional<B> mapOptional(A a2, kotlin.jvm.functions.Function1<? super A, ? extends B> function1) {
        com.apollographql.apollo.api.Optional.Present present;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return (a2 == null || (present = com.apollographql.apollo.api.Optional.INSTANCE.present(function1.invoke(a2))) == null) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : present;
    }

    public static final com.apollographql.apollo.api.Optional<java.lang.String> optionalIfNotNullOrBlank(java.lang.String str) {
        java.lang.String str2 = str;
        return (str2 == null || kotlin.text.StringsKt.isBlank(str2)) ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : com.apollographql.apollo.api.Optional.INSTANCE.present(str);
    }
}
