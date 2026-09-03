package com.door.brass.knob.ui.splash;

import com.door.brass.knob.data.db.entity.DessertConfigEntity;
import com.door.brass.knob.data.repository.SplashRepository;
import com.door.brass.knob.ui.splash.SplashDestination;
import com.door.brass.knob.ui.splash.SplashUiState;
import defpackage.yzPsTade5rL7D3;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
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
@DebugMetadata(c = "com.door.brass.knob.ui.splash.SplashViewModel$prepare$1", f = "SplashViewModel.kt", l = {44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SplashViewModel$prepare$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SplashViewModel FsuUJlzzWhYnMlD;
    public final /* synthetic */ boolean UEutaskTsxaI;
    public int Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashViewModel$prepare$1(SplashViewModel splashViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.FsuUJlzzWhYnMlD = splashViewModel;
        this.UEutaskTsxaI = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r8 == r2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f A[Catch: Exception -> 0x0017, CancellationException -> 0x0090, TryCatch #2 {CancellationException -> 0x0090, Exception -> 0x0017, blocks: (B:6:0x0013, B:7:0x0048, B:8:0x004b, B:11:0x0055, B:14:0x005c, B:15:0x0064, B:20:0x0062, B:23:0x001f, B:24:0x003a, B:26:0x003f, B:30:0x002b, B:32:0x002f), top: B:2:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        String str;
        SplashDestination splashDestination;
        SplashViewModel splashViewModel = this.FsuUJlzzWhYnMlD;
        SplashRepository splashRepository = splashViewModel.hRNgd2zGCE5kj;
        MutableStateFlow mutableStateFlow = splashViewModel.ra306ClFT3HT;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        int i = this.Uo5pffGf8LUU;
        DessertConfigEntity dessertConfigEntity = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            mutableStateFlow.setValue(new SplashUiState.Failed(((e2 instanceof UnknownHostException) || (e2 instanceof ConnectException)) ? SplashError.oyjLVtGms9eZwJ0 : ((e2 instanceof SocketTimeoutException) || (e2 instanceof InterruptedIOException)) ? SplashError.b41X89IqSbKt : SplashError.gmXBnHsR2YSm));
        }
        if (i == 0) {
            ResultKt.hRNgd2zGCE5kj(obj);
            mutableStateFlow.setValue(SplashUiState.Loading.yzPsTade5rL7D3);
            if (this.UEutaskTsxaI) {
                this.Uo5pffGf8LUU = 1;
                obj = splashRepository.yzPsTade5rL7D3.yzPsTade5rL7D3(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (dessertConfigEntity == null) {
                this.Uo5pffGf8LUU = 2;
                obj = splashRepository.yzPsTade5rL7D3(this);
            }
            str = dessertConfigEntity.hRNgd2zGCE5kj;
            if (dessertConfigEntity.ra306ClFT3HT) {
                splashDestination = new SplashDestination.Offer(str);
                mutableStateFlow.setValue(new SplashUiState.Ready(splashDestination));
                return Unit.yzPsTade5rL7D3;
            }
            splashDestination = SplashDestination.Cafe.yzPsTade5rL7D3;
            mutableStateFlow.setValue(new SplashUiState.Ready(splashDestination));
            return Unit.yzPsTade5rL7D3;
        }
        if (i != 1) {
            if (i != 2) {
                yzPsTade5rL7D3.kSPEzfraxudm4i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.hRNgd2zGCE5kj(obj);
            dessertConfigEntity = (DessertConfigEntity) obj;
            str = dessertConfigEntity.hRNgd2zGCE5kj;
            if (dessertConfigEntity.ra306ClFT3HT && str != null && str.length() != 0) {
                splashDestination = new SplashDestination.Offer(str);
                mutableStateFlow.setValue(new SplashUiState.Ready(splashDestination));
                return Unit.yzPsTade5rL7D3;
            }
            splashDestination = SplashDestination.Cafe.yzPsTade5rL7D3;
            mutableStateFlow.setValue(new SplashUiState.Ready(splashDestination));
            return Unit.yzPsTade5rL7D3;
        }
        ResultKt.hRNgd2zGCE5kj(obj);
        dessertConfigEntity = (DessertConfigEntity) obj;
        if (dessertConfigEntity == null) {
        }
        str = dessertConfigEntity.hRNgd2zGCE5kj;
        if (dessertConfigEntity.ra306ClFT3HT) {
        }
        splashDestination = SplashDestination.Cafe.yzPsTade5rL7D3;
        mutableStateFlow.setValue(new SplashUiState.Ready(splashDestination));
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new SplashViewModel$prepare$1(this.FsuUJlzzWhYnMlD, this.UEutaskTsxaI, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((SplashViewModel$prepare$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
