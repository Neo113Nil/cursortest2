package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\u0007"}, d2 = {"Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefaultDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineScope;", "getDefaultScope", "()Lkotlinx/coroutines/CoroutineScope;", "getIODispatcher", "getIOScope", "getMainDispatcher", "getMainScope"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CoroutineDispatcherProvider {
    kotlinx.coroutines.CoroutineDispatcher getDefaultDispatcher();

    kotlinx.coroutines.CoroutineScope getDefaultScope();

    kotlinx.coroutines.CoroutineDispatcher getIODispatcher();

    kotlinx.coroutines.CoroutineScope getIOScope();

    kotlinx.coroutines.CoroutineDispatcher getMainDispatcher();

    kotlinx.coroutines.CoroutineScope getMainScope();
}
