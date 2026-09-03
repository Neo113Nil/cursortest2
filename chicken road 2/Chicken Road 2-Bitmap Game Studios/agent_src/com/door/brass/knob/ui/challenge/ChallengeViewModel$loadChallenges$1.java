package com.door.brass.knob.ui.challenge;

import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.challenge.ChallengeViewModel$loadChallenges$1", f = "ChallengeViewModel.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChallengeViewModel$loadChallenges$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ChallengeViewModel FsuUJlzzWhYnMlD;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeViewModel$loadChallenges$1(ChallengeViewModel challengeViewModel, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = challengeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            final ChallengeViewModel challengeViewModel = this.FsuUJlzzWhYnMlD;
            FlowUtil$createFlow$$inlined$map$1 all = challengeViewModel.hRNgd2zGCE5kj.yzPsTade5rL7D3.getAll();
            FlowCollector flowCollector = new FlowCollector() { // from class: com.door.brass.knob.ui.challenge.ChallengeViewModel$loadChallenges$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object ra306ClFT3HT(Object obj2, Continuation continuation) {
                    Object value;
                    ChallengeUiState challengeUiState;
                    List list = (List) obj2;
                    MutableStateFlow mutableStateFlow = ChallengeViewModel.this.ra306ClFT3HT;
                    do {
                        value = mutableStateFlow.getValue();
                        challengeUiState = (ChallengeUiState) value;
                    } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3(challengeUiState, list, ChallengeViewModel.gmXBnHsR2YSm(challengeUiState, list), null, null, null, false, 252)));
                    return Unit.yzPsTade5rL7D3;
                }
            };
            this.Uo5pffGf8LUU = 1;
            if (all.yzPsTade5rL7D3(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
        }
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new ChallengeViewModel$loadChallenges$1(this.FsuUJlzzWhYnMlD, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((ChallengeViewModel$loadChallenges$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
