package com.door.brass.knob.data.device;

import defpackage.yzPsTade5rL7D3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.device.PantrySignalCollector$collect$2$installReferrer$1", f = "PantrySignalCollector.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class PantrySignalCollector$collect$2$installReferrer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ PantrySignalCollector FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PantrySignalCollector$collect$2$installReferrer$1(PantrySignalCollector pantrySignalCollector, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = pantrySignalCollector;
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
        InstallReferrerSource installReferrerSource = this.FsuUJlzzWhYnMlD.hRNgd2zGCE5kj;
        this.Uo5pffGf8LUU = 1;
        Object hRNgd2zGCE5kj = installReferrerSource.hRNgd2zGCE5kj(this);
        return hRNgd2zGCE5kj == coroutineSingletons ? coroutineSingletons : hRNgd2zGCE5kj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new PantrySignalCollector$collect$2$installReferrer$1(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((PantrySignalCollector$collect$2$installReferrer$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
