package com.door.brass.knob.data.device;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import defpackage.yzPsTade5rL7D3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.device.InstallReferrerSource$read$2", f = "InstallReferrerSource.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class InstallReferrerSource$read$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ InstallReferrerSource FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerSource$read$2(InstallReferrerSource installReferrerSource, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = installReferrerSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        if (i != 0) {
            if (i == 1) {
                ResultKt.hRNgd2zGCE5kj(obj);
                return obj;
            }
            yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ResultKt.hRNgd2zGCE5kj(obj);
        this.Uo5pffGf8LUU = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.hRNgd2zGCE5kj(this));
        cancellableContinuationImpl.pu0JZhzR2Or6();
        final InstallReferrerSource installReferrerSource = this.FsuUJlzzWhYnMlD;
        final InstallReferrerClient yzPsTade5rL7D3 = new InstallReferrerClient.Builder(installReferrerSource.yzPsTade5rL7D3).yzPsTade5rL7D3();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        cancellableContinuationImpl.XrorSzThrtvJ4A(new Function1<Throwable, Unit>(installReferrerSource, yzPsTade5rL7D3) { // from class: com.door.brass.knob.data.device.InstallReferrerSource$awaitReferrer$2$1
            public final /* synthetic */ InstallReferrerClient oyjLVtGms9eZwJ0;

            {
                this.oyjLVtGms9eZwJ0 = yzPsTade5rL7D3;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object uypNJrpDByoB(Object obj2) {
                try {
                    this.oyjLVtGms9eZwJ0.yzPsTade5rL7D3();
                } catch (Throwable th) {
                    new Result.Failure(th);
                }
                return Unit.yzPsTade5rL7D3;
            }
        });
        try {
            yzPsTade5rL7D3.ra306ClFT3HT(new InstallReferrerSource$awaitReferrer$2$2(yzPsTade5rL7D3, atomicBoolean, installReferrerSource, cancellableContinuationImpl));
        } catch (Exception e) {
            Log.w("DeviceSignals", "Could not start the install referrer connection", e);
            InstallReferrerSource.yzPsTade5rL7D3(atomicBoolean, cancellableContinuationImpl, yzPsTade5rL7D3, "");
        }
        Object exVmIuryuB8HeQ = cancellableContinuationImpl.exVmIuryuB8HeQ();
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.oyjLVtGms9eZwJ0;
        return exVmIuryuB8HeQ == coroutineSingletons ? coroutineSingletons : exVmIuryuB8HeQ;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new InstallReferrerSource$read$2(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((InstallReferrerSource$read$2) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
