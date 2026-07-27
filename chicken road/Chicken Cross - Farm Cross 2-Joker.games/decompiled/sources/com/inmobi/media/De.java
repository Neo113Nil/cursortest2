package com.inmobi.media;

import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.inmobi.media.ads.network.inmobiJson.model.JsonAssetObject;
import com.inmobi.media.ads.network.inmobiJson.model.NativeMedia;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* loaded from: classes6.dex */
public final class De extends AbstractC4254z implements Ok, InterfaceC3694f {
    public final Ed b;
    public final Jd c;
    public final AbstractC3724g1 d;
    public final CoroutineScope e;
    public final C4200x f;
    public final Lazy g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public De(Ed nativeAdUnitComponent, Jd stateMachine) {
        super(nativeAdUnitComponent.f6535a);
        NativeMedia media;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "nativeAdUnitComponent");
        Intrinsics.checkNotNullParameter(stateMachine, "stateMachine");
        this.b = nativeAdUnitComponent;
        this.c = stateMachine;
        Intrinsics.checkNotNullParameter(nativeAdUnitComponent, "<this>");
        JsonAssetObject assetsObject = nativeAdUnitComponent.b.getAssetsObject();
        CoroutineScope coroutineScope = nativeAdUnitComponent.f6535a.f7489a.e;
        this.d = Intrinsics.areEqual((assetsObject == null || (media = assetsObject.getMedia()) == null) ? null : media.getType(), "video") ? new Bf(coroutineScope, nativeAdUnitComponent.f6535a.f7489a.c) : new Cd(coroutineScope, nativeAdUnitComponent.f6535a.f7489a.c);
        this.e = AbstractC4012q5.a(k());
        C4227y adComponent = nativeAdUnitComponent.f6535a;
        JsonAssetObject assetsObject2 = nativeAdUnitComponent.b.getAssetsObject();
        Image adChoice = assetsObject2 != null ? assetsObject2.getAdChoice() : null;
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        this.f = new C4200x(adComponent.f7489a.b, adChoice, adComponent.b.f6590a.b.getNative().getAdChoiceConfig(), adComponent.f7489a.c);
        this.g = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.De$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return De.a(De.this);
            }
        });
    }

    public static final Nk a(final De de) {
        return new Nk(new Md(de.f7514a.f7489a.d, null, null, 30), new Function0() { // from class: com.inmobi.media.De$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return De.b(De.this);
            }
        });
    }

    public static final List b(De de) {
        return AbstractC3559a5.a("load_called", de.b.f6535a.b.g);
    }

    @Override // com.inmobi.media.Ok
    public final void c() {
        AbstractC3727g4.a(this.e);
    }

    @Override // com.inmobi.media.Ok
    public final void a() {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadingState", "Initialize Called - starting inflation process");
        }
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new C4049re(this, null), 3, null);
    }

    @Override // com.inmobi.media.InterfaceC3694f
    public final Object a(Continuation continuation) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadingState", "onDestroy");
        }
        Object a2 = this.c.a(new Vd(), this, (ContinuationImpl) continuation);
        return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:10:0x0027, B:11:0x003f, B:13:0x0047, B:20:0x0036), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Deferred deferred, ContinuationImpl continuationImpl) {
        Be be;
        int i;
        Y9 l;
        try {
            if (continuationImpl instanceof Be) {
                be = (Be) continuationImpl;
                int i2 = be.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    be.c = i2 - Integer.MIN_VALUE;
                    Object obj = be.f6475a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = be.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        be.c = 1;
                        obj = deferred.await(be);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    View view = (View) obj;
                    l = l();
                    if (l != null) {
                        ((Z9) l).a("NativeLoadingState", "waitForAdChoiceView - ad choice view inflated successfully");
                    }
                    return view;
                }
            }
            if (i != 0) {
            }
            View view2 = (View) obj;
            l = l();
            if (l != null) {
            }
            return view2;
        } catch (Exception e) {
            Z9 z9 = this.b.f6535a.f7489a.c;
            if (z9 == null) {
                return null;
            }
            z9.b("NativeLoadingState", "AdChoiceView inflation failed: " + e);
            return null;
        }
        be = new Be(this, continuationImpl);
        Object obj2 = be.f6475a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = be.c;
    }

    public final void a(MediaView mediaView, View view, Nd nd) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadingState", "onInflateSuccess - transitioning to loaded state (mediaView: " + (mediaView != null) + ", adChoice: " + (view != null) + ")");
        }
        this.c.a(new C4021qe(mediaView, view, this.d, nd, this.b, this.c), this);
    }

    public final void a(short s) {
        Y9 l = l();
        if (l != null) {
            ((Z9) l).a("NativeLoadingState", "transitionToFailedState - errorCode: " + ((int) s));
        }
        this.c.a(new Xd(s, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), this.b, this.c), this);
    }
}
