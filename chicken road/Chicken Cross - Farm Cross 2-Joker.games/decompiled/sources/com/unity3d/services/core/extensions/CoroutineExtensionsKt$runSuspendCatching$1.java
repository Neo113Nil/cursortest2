package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoroutineExtensions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
@DebugMetadata(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt", f = "CoroutineExtensions.kt", i = {}, l = {15}, m = "runSuspendCatching", n = {}, s = {})
/* loaded from: classes7.dex */
final class CoroutineExtensionsKt$runSuspendCatching$1<R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    CoroutineExtensionsKt$runSuspendCatching$1(Continuation<? super CoroutineExtensionsKt$runSuspendCatching$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object runSuspendCatching = CoroutineExtensionsKt.runSuspendCatching(null, this);
        return runSuspendCatching == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? runSuspendCatching : Result.m8078boximpl(runSuspendCatching);
    }
}
