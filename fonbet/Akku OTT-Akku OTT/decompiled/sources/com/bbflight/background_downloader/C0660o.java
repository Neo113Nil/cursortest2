package com.bbflight.background_downloader;

import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$methodAllTasks$workInfos$1", f = "BDPlugin.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0660o extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super List<WorkInfo>>, Object> {
    public final /* synthetic */ WorkManager a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0660o(WorkManager workManager, Continuation<? super C0660o> continuation) {
        super(2, continuation);
        this.a = workManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0660o(this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super List<WorkInfo>> continuation) {
        return ((C0660o) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return this.a.getWorkInfosByTag("BackgroundDownloader").get();
    }
}
