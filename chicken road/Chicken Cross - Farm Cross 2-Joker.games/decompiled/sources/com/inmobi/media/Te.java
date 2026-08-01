package com.inmobi.media;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes6.dex */
public final class Te implements InterfaceC3679ed {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f6871a;
    public final C3692ep b;
    public final Z9 c;
    public final ArrayList d;
    public final CoroutineScope e;
    public final AtomicBoolean f;
    public Kh g;
    public final MutableSharedFlow h;
    public final RelativeLayout i;
    public final MediaPlayer j;
    public final C3597bf k;
    public final C4116tp l;
    public final Dp m;
    public final Se n;
    public final MutableSharedFlow o;

    public Te(Context context, CoroutineScope coroutineScope, C3692ep config, Z9 z9) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f6871a = coroutineScope;
        this.b = config;
        this.c = z9;
        this.d = new ArrayList();
        this.e = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
        this.f = new AtomicBoolean(false);
        this.g = Kh.f6674a;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.h = MutableSharedFlow$default;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.i = relativeLayout;
        Context context2 = relativeLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        MediaPlayer a2 = AbstractC3720fp.a(context2);
        this.j = a2;
        this.k = new C3597bf(relativeLayout, coroutineScope, a2, config, MutableSharedFlow$default);
        this.l = new C4116tp(a2, coroutineScope, config.c.f, MutableSharedFlow$default);
        this.m = new Dp(coroutineScope, a2, relativeLayout, config, z9);
        this.n = new Se(this);
        this.o = MutableSharedFlow$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        Re re;
        int i;
        Qo qo;
        Z9 z9;
        if (continuationImpl instanceof Re) {
            re = (Re) continuationImpl;
            int i2 = re.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                re.c = i2 - Integer.MIN_VALUE;
                Object obj = re.f6827a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = re.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.g != Kh.f6674a) {
                        throw new C3652dd();
                    }
                    this.g = Kh.b;
                    AbstractC4012q5.a(this.h, this.f6871a, Po.f6789a);
                    Z9 z92 = this.c;
                    if (z92 != null) {
                        z92.a("NativeMediaPlayer", "Media Player Load started");
                    }
                    MediaPlayer mediaPlayer = this.j;
                    Z9 z93 = this.c;
                    re.c = 1;
                    obj = AbstractC3579ap.a(mediaPlayer, arrayList, z93, re);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                qo = (Qo) obj;
                z9 = this.c;
                if (z9 != null) {
                    z9.a("NativeMediaPlayer", "Media Player Load Status " + qo);
                }
                if (qo instanceof Ro) {
                    if (!(qo instanceof No)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.g = Kh.g;
                    AbstractC4012q5.a(this.h, this.f6871a, new C3635co());
                    throw new C3652dd();
                }
                AbstractC4012q5.a(this.h, this.f6871a, new So(((Ro) qo).f6835a));
                this.g = Kh.c;
                MediaPlayer mediaPlayer2 = this.j;
                Intrinsics.checkNotNullParameter(mediaPlayer2, "<this>");
                try {
                    mediaPlayer2.seekTo(0);
                } catch (IllegalStateException unused) {
                }
                Dp dp = this.m;
                Se surfaceViewabilityListener = this.n;
                dp.getClass();
                Intrinsics.checkNotNullParameter(surfaceViewabilityListener, "surfaceViewabilityListener");
                AbstractC4012q5.a(dp.f6520a, new C4281zp(dp, surfaceViewabilityListener, null));
                C3597bf c3597bf = this.k;
                AbstractC4012q5.a(c3597bf.b, new Xe(c3597bf, null));
                return this.i;
            }
        }
        re = new Re(this, continuationImpl);
        Object obj2 = re.f6827a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = re.c;
        if (i != 0) {
        }
        qo = (Qo) obj2;
        z9 = this.c;
        if (z9 != null) {
        }
        if (qo instanceof Ro) {
        }
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.a("NativeMediaPlayer", "destroy called");
            }
            this.g = Kh.h;
            AbstractC4012q5.a(this.d);
            this.m.b();
            C3597bf c3597bf = this.k;
            c3597bf.g.removeAllViews();
            c3597bf.f.d();
            this.l.c();
            this.i.removeAllViews();
            BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new Pe(this, null), 3, null);
        }
    }
}
