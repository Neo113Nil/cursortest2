package com.ingo.sdk.android.ux.viewprovider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "invoke", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List $getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1 $getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.$getHighSpeedVideoSizes.invoke(this.$getHighSpeedVideoFpsRanges.get(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryListFragmentViewProvider$View$1$2$invoke$lambda$11$lambda$10$lambda$8$lambda$7$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        super(1);
        this.$getHighSpeedVideoSizes = function1;
        this.$getHighSpeedVideoFpsRanges = list;
    }
}
