package com.bbflight.background_downloader;

import android.content.SharedPreferences;
import com.bbflight.background_downloader.TaskWorker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.b;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$Companion$processResumeData$2", f = "TaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
@SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processResumeData$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,856:1\n113#2:857\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processResumeData$2\n*L\n314#1:857\n*E\n"})
/* loaded from: classes3.dex */
public final class e1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ E0 a;
    public final /* synthetic */ SharedPreferences b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(E0 e0, SharedPreferences sharedPreferences, Continuation<? super e1> continuation) {
        super(1, continuation);
        this.a = e0;
        this.b = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new e1(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((e1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TaskWorker.Companion companion = TaskWorker.INSTANCE;
        E0 e0 = this.a;
        String str = e0.a.a;
        b.a aVar = kotlinx.serialization.json.b.d;
        aVar.getClass();
        TaskWorker.Companion.a(companion, "com.bbflight.background_downloader.resumeDataMap.v2", str, aVar.b(E0.Companion.serializer(), e0), this.b);
        return Unit.INSTANCE;
    }
}
