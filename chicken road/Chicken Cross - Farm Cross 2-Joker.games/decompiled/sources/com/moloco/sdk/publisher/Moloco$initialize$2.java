package com.moloco.sdk.publisher;

import com.moloco.sdk.Init;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.crash.a;
import com.moloco.sdk.internal.publisher.x;
import com.moloco.sdk.internal.publisher.y;
import com.moloco.sdk.internal.services.init.j;
import com.moloco.sdk.internal.services.init.n;
import com.moloco.sdk.internal.x;
import com.moloco.sdk.publisher.init.MolocoInitParams;
import com.moloco.sdk.service_locator.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.moloco.sdk.publisher.Moloco$initialize$2", f = "Moloco.kt", i = {}, l = {149, 151, 174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class Moloco$initialize$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MolocoInitParams $initParam;
    final /* synthetic */ MolocoInitializationListener $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Moloco$initialize$2(MolocoInitParams molocoInitParams, MolocoInitializationListener molocoInitializationListener, Continuation<? super Moloco$initialize$2> continuation) {
        super(2, continuation);
        this.$initParam = molocoInitParams;
        this.$listener = molocoInitializationListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Moloco$initialize$2(this.$initParam, this.$listener, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x initializationHandler;
        com.moloco.sdk.internal.x xVar;
        Set set;
        Object updateAndroidClientMetricsOnInitSuccess;
        Set set2;
        List flatten;
        Moloco moloco;
        boolean shouldInitializeILRD;
        List flatten2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "launched the scope to initialize sdk with thread name: " + Thread.currentThread().getName() + " and dispatcher DispatcherProvider().IO", null, false, 12, null);
            a b = a.d.f10869a.b();
            this.label = 1;
            if (b.a(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                moloco = Moloco.INSTANCE;
                MolocoInitParams molocoInitParams = this.$initParam;
                synchronized (moloco) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(molocoInitParams.getMediationInfo().getName());
                    linkedHashSet.addAll(moloco.getPendingInitByMediator$moloco_sdk_release().keySet());
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            shouldInitializeILRD = Moloco.INSTANCE.shouldInitializeILRD((String) it.next());
                            if (shouldInitializeILRD) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    Moloco.INSTANCE.initializeILRD();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization success", null, false, 12, null);
                Moloco moloco2 = Moloco.INSTANCE;
                synchronized (moloco2) {
                    flatten2 = CollectionsKt.flatten(moloco2.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco2.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus b2 = x.f.b();
                MolocoInitializationListener molocoInitializationListener = this.$listener;
                if (molocoInitializationListener != null) {
                    y.a(molocoInitializationListener, b2);
                }
                Iterator it2 = flatten2.iterator();
                while (it2.hasNext()) {
                    y.a((MolocoInitializationListener) it2.next(), b2);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            xVar = (com.moloco.sdk.internal.x) obj;
            if (!(xVar instanceof x.a)) {
                set2 = Moloco._failedMediations;
                set2.add(this.$initParam.getMediationInfo().getName());
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "Moloco", "Moloco SDK initialization failed", null, false, 12, null);
                Moloco moloco3 = Moloco.INSTANCE;
                synchronized (moloco3) {
                    flatten = CollectionsKt.flatten(moloco3.getPendingInitByMediator$moloco_sdk_release().values());
                    moloco3.getPendingInitByMediator$moloco_sdk_release().clear();
                }
                MolocoInitStatus a2 = com.moloco.sdk.internal.publisher.x.f.a(((j) ((x.a) xVar).a()).toString());
                MolocoInitializationListener molocoInitializationListener2 = this.$listener;
                if (molocoInitializationListener2 != null) {
                    y.a(molocoInitializationListener2, a2);
                }
                Iterator it3 = flatten.iterator();
                while (it3.hasNext()) {
                    y.a((MolocoInitializationListener) it3.next(), a2);
                }
                return Unit.INSTANCE;
            }
            if (!(xVar instanceof x.b)) {
                throw new NoWhenBranchMatchedException();
            }
            set = Moloco._failedMediations;
            set.remove(this.$initParam.getMediationInfo().getName());
            Moloco moloco4 = Moloco.INSTANCE;
            moloco4.processInitConfigs((Init.SDKInitResponse) ((x.b) xVar).a());
            this.label = 3;
            updateAndroidClientMetricsOnInitSuccess = moloco4.updateAndroidClientMetricsOnInitSuccess(this);
            if (updateAndroidClientMetricsOnInitSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
            moloco = Moloco.INSTANCE;
            MolocoInitParams molocoInitParams2 = this.$initParam;
            synchronized (moloco) {
            }
        }
        Moloco moloco5 = Moloco.INSTANCE;
        moloco5.initializeAndroidClientMetrics(this.$initParam);
        initializationHandler = moloco5.getInitializationHandler();
        String appKey = this.$initParam.getAppKey();
        MediationInfo mediationInfo = this.$initParam.getMediationInfo();
        n c = a.f.f10871a.c();
        MetricsRecorder create = MetricsRecorder.INSTANCE.create(this.$initParam.getMediationInfo().getName());
        this.label = 2;
        obj = initializationHandler.a(appKey, mediationInfo, c, create, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        xVar = (com.moloco.sdk.internal.x) obj;
        if (!(xVar instanceof x.a)) {
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Moloco$initialize$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
