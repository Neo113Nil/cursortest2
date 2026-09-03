package com.door.brass.knob.ui.tips;

import com.door.brass.knob.data.db.entity.TipEntity;
import com.door.brass.knob.data.repository.TipRepository;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.tips.TipsViewModel$bookmarkTip$1", f = "TipsViewModel.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class TipsViewModel$bookmarkTip$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ TipsViewModel FsuUJlzzWhYnMlD;
    public final /* synthetic */ long UEutaskTsxaI;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TipsViewModel$bookmarkTip$1(TipsViewModel tipsViewModel, long j, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = tipsViewModel;
        this.UEutaskTsxaI = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r14 == r1) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        TipRepository tipRepository = this.FsuUJlzzWhYnMlD.hRNgd2zGCE5kj;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        Unit unit = Unit.yzPsTade5rL7D3;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            this.Uo5pffGf8LUU = 1;
            obj = tipRepository.yzPsTade5rL7D3.ra306ClFT3HT(this.UEutaskTsxaI, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    return unit;
                }
                defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        TipEntity tipEntity = (TipEntity) obj;
        if (tipEntity != null) {
            boolean z = !tipEntity.b41X89IqSbKt;
            long j = tipEntity.yzPsTade5rL7D3;
            String str = tipEntity.hRNgd2zGCE5kj;
            String str2 = tipEntity.ra306ClFT3HT;
            String str3 = tipEntity.oyjLVtGms9eZwJ0;
            str.getClass();
            str2.getClass();
            str3.getClass();
            TipEntity tipEntity2 = new TipEntity(j, str, str2, str3, z);
            this.Uo5pffGf8LUU = 2;
            Object oyjLVtGms9eZwJ0 = tipRepository.yzPsTade5rL7D3.oyjLVtGms9eZwJ0(tipEntity2, this);
            if (oyjLVtGms9eZwJ0 != coroutineSingletons) {
                oyjLVtGms9eZwJ0 = unit;
            }
            if (oyjLVtGms9eZwJ0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new TipsViewModel$bookmarkTip$1(this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((TipsViewModel$bookmarkTip$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
