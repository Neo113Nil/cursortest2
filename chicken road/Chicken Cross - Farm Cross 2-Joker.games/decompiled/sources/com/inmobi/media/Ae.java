package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes6.dex */
public final class Ae extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Nd f6455a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ De d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ae(De de, Continuation continuation) {
        super(2, continuation);
        this.d = de;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Ae ae = new Ae(this.d, continuation);
        ae.c = obj;
        return ae;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Ae ae = new Ae(this.d, (Continuation) obj2);
        ae.c = (CoroutineScope) obj;
        return ae.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
    
        if (r15 == r0) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Deferred async$default;
        Deferred async$default2;
        NativeMedia media;
        View view;
        AbstractC3646d7 abstractC3646d7;
        Nd nd;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.c;
            Y9 l = this.d.l();
            if (l != null) {
                ((Z9) l).a("NativeLoadingState", "loadMediaViews - building experience loader");
            }
            De de = this.d;
            Ed nativeAdUnitComponent = de.b;
            AbstractC3724g1 adSessionManager = de.d;
            Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
            Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
            JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
            String type = (assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType();
            async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C4270ze(Intrinsics.areEqual(type, "static") ? new C3603bl(nativeAdUnitComponent, adSessionManager) : Intrinsics.areEqual(type, "video") ? new C3831jo(nativeAdUnitComponent, adSessionManager) : new Om(nativeAdUnitComponent, adSessionManager), null), 3, null);
            async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new C4242ye(this.d, null), 3, null);
            De de2 = this.d;
            this.c = async$default;
            this.b = 1;
            obj = de2.a(async$default2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nd = this.f6455a;
                    view = (View) this.c;
                    ResultKt.throwOnFailure(obj);
                    this.d.a(null, view, nd);
                    return Unit.INSTANCE;
                }
                view = (View) this.c;
                ResultKt.throwOnFailure(obj);
                abstractC3646d7 = (AbstractC3646d7) obj;
                if (!(abstractC3646d7 instanceof C3561a7)) {
                    Y9 l2 = this.d.l();
                    if (l2 != null) {
                        ((Z9) l2).a("NativeLoadingState", "Experience Result Failure - errorCode: " + ((int) ((C3561a7) abstractC3646d7).f7005a));
                    }
                    this.d.a(((C3561a7) abstractC3646d7).f7005a);
                } else {
                    if (!(abstractC3646d7 instanceof C3589b7)) {
                        if (!(abstractC3646d7 instanceof C3618c7)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Y9 l3 = this.d.l();
                        if (l3 != null) {
                            ((Z9) l3).a("NativeLoadingState", "Experience Result UnAvailable - no media view");
                        }
                        De de3 = this.d;
                        C4197wn c4197wn = ((C3618c7) abstractC3646d7).f7042a;
                        C3639d0 c3639d0 = de3.f7514a.f7489a.d;
                        Ed ed = de3.b;
                        Intrinsics.checkNotNullParameter(ed, "<this>");
                        Nd nd2 = new Nd(c4197wn, c3639d0, new Yj(ed.f6535a.b.g));
                        C3877ld c3877ld = (C3877ld) this.d.b.g.getValue();
                        this.c = view;
                        this.f6455a = nd2;
                        this.b = 3;
                        c3877ld.getClass();
                        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3820jd(c3877ld, null), this);
                        if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext != coroutine_suspended) {
                            nd = nd2;
                            this.d.a(null, view, nd);
                        }
                        return coroutine_suspended;
                    }
                    Y9 l4 = this.d.l();
                    if (l4 != null) {
                        ((Z9) l4).a("NativeLoadingState", "Experience Result Success - mediaView loaded");
                    }
                    De de4 = this.d;
                    C3589b7 c3589b7 = (C3589b7) abstractC3646d7;
                    C4197wn c4197wn2 = c3589b7.b;
                    C3639d0 c3639d02 = de4.f7514a.f7489a.d;
                    Ed ed2 = de4.b;
                    Intrinsics.checkNotNullParameter(ed2, "<this>");
                    this.d.a(c3589b7.f7025a, view, new Nd(c4197wn2, c3639d02, new Yj(ed2.f6535a.b.g)));
                }
                return Unit.INSTANCE;
            }
            async$default = (Deferred) this.c;
            ResultKt.throwOnFailure(obj);
        }
        View view2 = (View) obj;
        this.c = view2;
        this.b = 2;
        Object await = async$default.await(this);
        if (await != coroutine_suspended) {
            view = view2;
            obj = await;
            abstractC3646d7 = (AbstractC3646d7) obj;
            if (!(abstractC3646d7 instanceof C3561a7)) {
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
