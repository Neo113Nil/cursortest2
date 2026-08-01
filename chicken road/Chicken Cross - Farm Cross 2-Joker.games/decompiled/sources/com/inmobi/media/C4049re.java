package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.SupervisorKt;

/* renamed from: com.inmobi.media.re, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4049re extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7351a;
    public final /* synthetic */ De b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049re(De de, Continuation continuation) {
        super(2, continuation);
        this.b = de;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4049re(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4049re(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        if (r14 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r14.a(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.inmobi.media.C4077se(r14, null), r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7351a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            De de = this.b;
            Y9 l = de.l();
            if (l != null) {
                ((Z9) l).a("NativeLoadingState", "fireAdLoadCalledBeacons - firing ad load called beacons");
            }
            ((Nk) de.g.getValue()).a(Uf.f6892a);
            De de2 = this.b;
            this.f7351a = 1;
            de2.getClass();
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            De de3 = this.b;
            JsonAssetObject assetsObject = de3.b.b.getAssetsObject();
            if ((assetsObject != null ? assetsObject.getMedia() : null) == null) {
                Y9 l2 = de3.l();
                if (l2 != null) {
                    ((Z9) l2).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - no media assets, skipping");
                }
            } else {
                Y9 l3 = de3.l();
                if (l3 != null) {
                    ((Z9) l3).a("NativeLoadingState", "listenToVideoLoadAndErrorEvents - media assets found, setting up listener");
                }
                BuildersKt__Builders_commonKt.launch$default(de3.e, null, null, new C4134ue(new C4215xe(((C3877ld) de3.b.g.getValue()).e), null, de3), 3, null);
            }
            De de4 = this.b;
            this.f7351a = 3;
            de4.getClass();
            Object supervisorScope = SupervisorKt.supervisorScope(new Ae(de4, null), this);
            if (supervisorScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                supervisorScope = Unit.INSTANCE;
            }
        }
        C4051rg c4051rg = C4051rg.f7353a;
        this.f7351a = 2;
    }
}
