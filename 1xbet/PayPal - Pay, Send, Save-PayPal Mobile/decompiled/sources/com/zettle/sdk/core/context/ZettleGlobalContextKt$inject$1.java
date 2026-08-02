package com.zettle.sdk.core.context;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0001\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class ZettleGlobalContextKt$inject$1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T> {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.util.List<java.lang.Object>> $Camera2StreamConfigurationMap;
    final /* synthetic */ com.zettle.sdk.core.context.ZettleGlobalContext $getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext = this.$getHighSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return (T) zettleGlobalContext.get(new com.zettle.sdk.core.context.KeyTag<>(java.lang.Object.class), this.$Camera2StreamConfigurationMap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ZettleGlobalContextKt$inject$1(com.zettle.sdk.core.context.ZettleGlobalContext zettleGlobalContext, kotlin.jvm.functions.Function0<? extends java.util.List<? extends java.lang.Object>> function0) {
        super(0);
        this.$getHighSpeedVideoFpsRanges = zettleGlobalContext;
        this.$Camera2StreamConfigurationMap = function0;
    }
}
