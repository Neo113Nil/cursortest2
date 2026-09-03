package com.door.brass.knob.data.device;

import com.door.brass.knob.data.remote.dto.DessertProbeRequest;
import defpackage.yzPsTade5rL7D3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/door/brass/knob/data/remote/dto/DessertProbeRequest;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.device.PantrySignalCollector$collect$2", f = "PantrySignalCollector.kt", l = {31, 32, 33}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class PantrySignalCollector$collect$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super DessertProbeRequest>, Object> {
    public Deferred FsuUJlzzWhYnMlD;
    public String MRfxZSx8l5UG62U;
    public String UEutaskTsxaI;
    public Object Uo5pffGf8LUU;
    public int kSPEzfraxudm4i;
    public /* synthetic */ Object uypNJrpDByoB;
    public final /* synthetic */ PantrySignalCollector yRx9jbDCTnXb3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PantrySignalCollector$collect$2(PantrySignalCollector pantrySignalCollector, Continuation continuation) {
        super(2, continuation);
        this.yRx9jbDCTnXb3 = pantrySignalCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r2 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        Deferred yzPsTade5rL7D3;
        Deferred deferred;
        String str;
        Object VODAQ12R2Y9teQ;
        String str2;
        String str3;
        CoroutineScope coroutineScope = (CoroutineScope) this.uypNJrpDByoB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.kSPEzfraxudm4i;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            PantrySignalCollector pantrySignalCollector = this.yRx9jbDCTnXb3;
            Deferred yzPsTade5rL7D32 = BuildersKt.yzPsTade5rL7D3(coroutineScope, new PantrySignalCollector$collect$2$advertisingId$1(pantrySignalCollector, null));
            Deferred yzPsTade5rL7D33 = BuildersKt.yzPsTade5rL7D3(coroutineScope, new PantrySignalCollector$collect$2$installReferrer$1(pantrySignalCollector, null));
            yzPsTade5rL7D3 = BuildersKt.yzPsTade5rL7D3(coroutineScope, new PantrySignalCollector$collect$2$androidId$1(pantrySignalCollector, null));
            this.uypNJrpDByoB = null;
            this.Uo5pffGf8LUU = yzPsTade5rL7D33;
            this.FsuUJlzzWhYnMlD = yzPsTade5rL7D3;
            this.kSPEzfraxudm4i = 1;
            obj = yzPsTade5rL7D32.VODAQ12R2Y9teQ(this);
            if (obj != coroutineSingletons) {
                deferred = yzPsTade5rL7D33;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = this.MRfxZSx8l5UG62U;
                str2 = this.UEutaskTsxaI;
                ResultKt.hRNgd2zGCE5kj(obj);
                return new DessertProbeRequest(str2, str3, (String) obj);
            }
            String str4 = this.UEutaskTsxaI;
            Deferred deferred2 = this.FsuUJlzzWhYnMlD;
            ResultKt.hRNgd2zGCE5kj(obj);
            VODAQ12R2Y9teQ = obj;
            str = str4;
            yzPsTade5rL7D3 = deferred2;
            String str5 = (String) VODAQ12R2Y9teQ;
            this.uypNJrpDByoB = null;
            this.Uo5pffGf8LUU = null;
            this.FsuUJlzzWhYnMlD = null;
            this.UEutaskTsxaI = str;
            this.MRfxZSx8l5UG62U = str5;
            this.kSPEzfraxudm4i = 3;
            Object VODAQ12R2Y9teQ2 = yzPsTade5rL7D3.VODAQ12R2Y9teQ(this);
            if (VODAQ12R2Y9teQ2 != coroutineSingletons) {
                String str6 = str;
                obj = VODAQ12R2Y9teQ2;
                str2 = str6;
                str3 = str5;
                return new DessertProbeRequest(str2, str3, (String) obj);
            }
            return coroutineSingletons;
        }
        yzPsTade5rL7D3 = this.FsuUJlzzWhYnMlD;
        deferred = (Deferred) this.Uo5pffGf8LUU;
        ResultKt.hRNgd2zGCE5kj(obj);
        str = (String) obj;
        this.uypNJrpDByoB = null;
        this.Uo5pffGf8LUU = null;
        this.FsuUJlzzWhYnMlD = yzPsTade5rL7D3;
        this.UEutaskTsxaI = str;
        this.kSPEzfraxudm4i = 2;
        VODAQ12R2Y9teQ = deferred.VODAQ12R2Y9teQ(this);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        PantrySignalCollector$collect$2 pantrySignalCollector$collect$2 = new PantrySignalCollector$collect$2(this.yRx9jbDCTnXb3, continuation);
        pantrySignalCollector$collect$2.uypNJrpDByoB = obj;
        return pantrySignalCollector$collect$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((PantrySignalCollector$collect$2) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
