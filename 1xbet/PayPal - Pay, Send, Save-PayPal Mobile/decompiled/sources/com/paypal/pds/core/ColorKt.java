package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lcom/paypal/pds/core/Color;", "Lkotlin/Function0;", "block", "takeOrElse", "(Lcom/paypal/pds/core/Color;Lkotlin/jvm/functions/Function0;)Lcom/paypal/pds/core/Color;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ColorKt {
    public static final com.paypal.pds.core.Color takeOrElse(com.paypal.pds.core.Color color, kotlin.jvm.functions.Function0<? extends com.paypal.pds.core.Color> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return !kotlin.jvm.internal.Intrinsics.areEqual(color, com.paypal.pds.core.Color.Unspecified.INSTANCE) ? color : function0.invoke();
    }
}
