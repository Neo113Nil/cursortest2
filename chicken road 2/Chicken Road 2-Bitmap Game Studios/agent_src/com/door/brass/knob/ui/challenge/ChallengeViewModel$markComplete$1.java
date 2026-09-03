package com.door.brass.knob.ui.challenge;

import com.door.brass.knob.data.db.entity.ChallengeEntity;
import com.door.brass.knob.data.repository.ChallengeRepository;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.challenge.ChallengeViewModel$markComplete$1", f = "ChallengeViewModel.kt", l = {69, 71}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class ChallengeViewModel$markComplete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ChallengeViewModel FsuUJlzzWhYnMlD;
    public final /* synthetic */ long UEutaskTsxaI;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeViewModel$markComplete$1(ChallengeViewModel challengeViewModel, long j, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = challengeViewModel;
        this.UEutaskTsxaI = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (r0 == r3) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        Object value;
        Object value2;
        Object ra306ClFT3HT;
        Object value3;
        Object value4;
        Object value5;
        ChallengeViewModel challengeViewModel = this.FsuUJlzzWhYnMlD;
        ChallengeRepository challengeRepository = challengeViewModel.hRNgd2zGCE5kj;
        MutableStateFlow mutableStateFlow = challengeViewModel.ra306ClFT3HT;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        Unit unit = Unit.yzPsTade5rL7D3;
        try {
            try {
                if (i == 0) {
                    ResultKt.hRNgd2zGCE5kj(obj);
                    do {
                        value2 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.i7xAcZoXXiIt(value2, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value2, null, null, null, null, null, true, 223)));
                    long j = this.UEutaskTsxaI;
                    this.Uo5pffGf8LUU = 1;
                    ra306ClFT3HT = challengeRepository.yzPsTade5rL7D3.ra306ClFT3HT(j, this);
                    if (ra306ClFT3HT == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ResultKt.hRNgd2zGCE5kj(obj);
                        do {
                            value5 = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.i7xAcZoXXiIt(value5, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value5, null, null, null, null, null, false, 223)));
                        return unit;
                    }
                    ResultKt.hRNgd2zGCE5kj(obj);
                    ra306ClFT3HT = obj;
                }
                ChallengeEntity challengeEntity = (ChallengeEntity) ra306ClFT3HT;
                if (challengeEntity == null) {
                    do {
                        value4 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.i7xAcZoXXiIt(value4, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value4, null, null, null, null, null, false, 223)));
                } else if (challengeEntity.i7xAcZoXXiIt) {
                    do {
                        value3 = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.i7xAcZoXXiIt(value3, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value3, null, null, null, null, null, false, 223)));
                } else {
                    ChallengeEntity yzPsTade5rL7D3 = ChallengeEntity.yzPsTade5rL7D3(challengeEntity, challengeEntity.b41X89IqSbKt, true, new Long(System.currentTimeMillis()));
                    this.Uo5pffGf8LUU = 2;
                    Object b41X89IqSbKt = challengeRepository.yzPsTade5rL7D3.b41X89IqSbKt(yzPsTade5rL7D3, this);
                    if (b41X89IqSbKt != CoroutineSingletons.oyjLVtGms9eZwJ0) {
                        b41X89IqSbKt = unit;
                    }
                }
                return unit;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.i7xAcZoXXiIt(value, ChallengeUiState.yzPsTade5rL7D3((ChallengeUiState) value, null, null, null, null, null, false, 223)));
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new ChallengeViewModel$markComplete$1(this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((ChallengeViewModel$markComplete$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
