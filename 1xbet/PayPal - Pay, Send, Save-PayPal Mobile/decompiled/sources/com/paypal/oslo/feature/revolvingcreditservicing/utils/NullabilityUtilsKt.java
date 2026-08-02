package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001aU\u0010\u0007\u001a\u0004\u0018\u00018\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001ak\u0010\u0007\u001a\u0004\u0018\u00018\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\t\"\u0004\b\u0003\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\b\u0010\n\u001a\u0004\u0018\u00018\u00022\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T1", "T2", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "value1", "value2", "Lkotlin/Function2;", "block", "ifAllNotNull", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "T3", "value3", "Lkotlin/Function3;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NullabilityUtilsKt {
    public static final <T1, T2, R> R ifAllNotNull(T1 t1, T2 t2, kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (t1 == null || t2 == null) {
            return null;
        }
        return function2.invoke(t1, t2);
    }

    public static final <T1, T2, T3, R> R ifAllNotNull(T1 t1, T2 t2, T3 t3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        if (t1 == null || t2 == null || t3 == null) {
            return null;
        }
        return function3.invoke(t1, t2, t3);
    }
}
