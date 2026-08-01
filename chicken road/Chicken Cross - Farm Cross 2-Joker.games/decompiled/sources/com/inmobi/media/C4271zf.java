package com.inmobi.media;

import android.view.View;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.zf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4271zf implements Ok, Pi, InterfaceC3694f {

    /* renamed from: a, reason: collision with root package name */
    public final View f7524a;
    public final MediaView b;
    public final Uj c;
    public final AbstractC3724g1 d;
    public final C3671e5 e;
    public final Nd f;
    public final Ed g;
    public final Jd h;

    public C4271zf(View view, MediaView mediaView, Uj renderedStateCache, AbstractC3724g1 adSessionManager, C3671e5 contextualDataHandler, Nd nativeBeaconProcessor, Ed nativeAdUnitComponent, Jd stateMachine) {
        Intrinsics.checkNotNullParameter(renderedStateCache, "renderedStateCache");
        Intrinsics.checkNotNullParameter(adSessionManager, "adSessionManager");
        Intrinsics.checkNotNullParameter(contextualDataHandler, "contextualDataHandler");
        Intrinsics.checkNotNullParameter(nativeBeaconProcessor, "nativeBeaconProcessor");
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.f7524a = view;
        this.b = mediaView;
        this.c = renderedStateCache;
        this.d = adSessionManager;
        this.e = contextualDataHandler;
        this.f = nativeBeaconProcessor;
        this.g = nativeAdUnitComponent;
        this.h = stateMachine;
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        C3685ej c3685ej;
        Z9 z9 = this.g.f6535a.f7489a.c;
        if (z9 == null || (c3685ej = z9.f6988a) == null) {
            return;
        }
        c3685ej.a();
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
    }

    @Override // com.inmobi.media.Pi
    public final void a(InMobiNativeViewData nativeViewData) {
        Intrinsics.checkNotNullParameter(nativeViewData, "nativeViewData");
        this.h.a(new C4135uf(new C4162vf(this.c, new C3912mi(nativeViewData, this.b, this.f7524a), this.e, this.d, this.f, this.g), this.h), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a4, code lost:
    
        if (r9.a(r2, r8, r0) != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.inmobi.media.InterfaceC3694f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        C4216xf c4216xf;
        int i;
        if (continuation instanceof C4216xf) {
            c4216xf = (C4216xf) continuation;
            int i2 = c4216xf.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4216xf.c = i2 - Integer.MIN_VALUE;
                Object obj = c4216xf.f7479a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c4216xf.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC3724g1 abstractC3724g1 = this.d;
                    if (abstractC3724g1.c == null) {
                        Y9 y9 = abstractC3724g1.b;
                        if (y9 != null) {
                            ((Z9) y9).a(AbstractC3724g1.f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        Y9 y92 = abstractC3724g1.b;
                        if (y92 != null) {
                            ((Z9) y92).a(AbstractC3724g1.f, "stopAdSession");
                        }
                        AbstractC4012q5.a(abstractC3724g1.f7114a, new C3667e1(abstractC3724g1, null));
                    }
                    C3877ld c3877ld = (C3877ld) this.g.g.getValue();
                    c4216xf.c = 1;
                    c3877ld.getClass();
                    Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new C3820jd(c3877ld, null), c4216xf);
                    if (withContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        withContext = Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.e.b();
                Jd jd = this.h;
                Vd vd = new Vd();
                c4216xf.c = 2;
            }
        }
        c4216xf = new C4216xf(this, (ContinuationImpl) continuation);
        Object obj2 = c4216xf.f7479a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c4216xf.c;
        if (i != 0) {
        }
        this.e.b();
        Jd jd2 = this.h;
        Vd vd2 = new Vd();
        c4216xf.c = 2;
    }
}
