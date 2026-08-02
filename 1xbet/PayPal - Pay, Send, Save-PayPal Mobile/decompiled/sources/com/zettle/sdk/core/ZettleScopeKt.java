package com.zettle.sdk.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlinx/coroutines/Job;", "monitoredLaunch", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "getAsMonitored", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/CoroutineScope;", "asMonitored"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ZettleScopeKt {
    public static final kotlinx.coroutines.Job monitoredLaunch(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, com.zettle.sdk.core.ZettleScope.INSTANCE.getExceptionHandler(), null, new com.zettle.sdk.core.ZettleScopeKt$monitoredLaunch$1(function1, null), 2, null);
        return launch$default;
    }

    public static final kotlinx.coroutines.CoroutineScope getAsMonitored(kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return kotlinx.coroutines.CoroutineScopeKt.plus(coroutineScope, com.zettle.sdk.core.ZettleScope.INSTANCE.getExceptionHandler());
    }
}
