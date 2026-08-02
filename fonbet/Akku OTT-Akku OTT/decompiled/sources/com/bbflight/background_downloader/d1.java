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

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$Companion$processProgressUpdate$2", f = "TaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
@SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processProgressUpdate$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,856:1\n113#2:857\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processProgressUpdate$2\n*L\n271#1:857\n*E\n"})
/* loaded from: classes3.dex */
public final class d1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ double b;
    public final /* synthetic */ long c;
    public final /* synthetic */ SharedPreferences d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(M0 m0, double d, long j, SharedPreferences sharedPreferences, Continuation<? super d1> continuation) {
        super(1, continuation);
        this.a = m0;
        this.b = d;
        this.c = j;
        this.d = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new d1(this.a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((d1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TaskWorker.Companion companion = TaskWorker.INSTANCE;
        String str = this.a.a;
        b.a aVar = kotlinx.serialization.json.b.d;
        U0 u0 = new U0(this.a, this.b, this.c);
        aVar.getClass();
        TaskWorker.Companion.a(companion, "com.bbflight.background_downloader.progressUpdateMap.v2", str, aVar.b(U0.Companion.serializer(), u0), this.d);
        return Unit.INSTANCE;
    }
}
