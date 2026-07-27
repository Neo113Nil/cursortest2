package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.k9;
import com.chartboost.sdk.impl.qf;
import com.chartboost.sdk.internal.interruption.InterruptionController;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class m extends ConstraintLayout implements xa, x6, a1, tf {

    /* renamed from: a, reason: collision with root package name */
    public final hd f4865a;
    public l b;
    public final u c;
    public final Mediation d;
    public final c6 e;
    public final wg f;
    public View g;
    public boolean h;
    public boolean i;
    public GestureDetector j;
    public boolean k;
    public ImageView l;
    public Float m;
    public Float n;
    public final p5 o;
    public final w0 p;
    public xf q;
    public final CoroutineScope r;
    public Job s;
    public Job t;
    public long u;
    public long v;
    public Job w;
    public long x;
    public long y;

    public static final class a extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.d, this.e, continuation);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.e.c(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = new b(this.d, this.e, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope) && !this.e.k) {
                this.e.k = true;
                this.e.p.q();
                l adContainerListener$ChartboostMonetization_9_13_0_release = this.e.getAdContainerListener$ChartboostMonetization_9_13_0_release();
                if (adContainerListener$ChartboostMonetization_9_13_0_release != null) {
                    adContainerListener$ChartboostMonetization_9_13_0_release.b();
                } else {
                    mb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class c extends SuspendLambda implements Function2 {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ long d;
        public final /* synthetic */ m e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, m mVar, Continuation continuation) {
            super(2, continuation);
            this.d = j;
            this.e = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(this.d, this.e, continuation);
            cVar.c = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.c;
                long j = this.d * 1000;
                this.c = coroutineScope2;
                this.b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.c;
                ResultKt.throwOnFailure(obj);
            }
            if (CoroutineScopeKt.isActive(coroutineScope) && this.e.p.j()) {
                this.e.p.a(z0.f, true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ m(Context context, hd hdVar, l lVar, u uVar, Mediation mediation, c6 c6Var, wg wgVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, hdVar, lVar, r4, mediation, r6, r7);
        wg wgVar2;
        u uVar2 = (i & 8) != 0 ? u.b : uVar;
        c6 w5Var = (i & 32) != 0 ? new w5(context) : c6Var;
        if ((i & 64) != 0) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("cbPrefs", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            wgVar2 = new wg(sharedPreferences);
        } else {
            wgVar2 = wgVar;
        }
    }

    public final void A() {
        Job launch$default;
        if (this.c != u.b && this.p.i()) {
            long v = this.f4865a.v();
            if (v >= 0) {
                if (this.p.j() || v == 0) {
                    this.p.a(z0.f, true);
                } else {
                    Job job = this.s;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new c(v, this, null), 3, null);
                    this.s = launch$default;
                }
            }
            this.p.s();
        }
    }

    public final void B() {
        if (this.q == null || this.c == u.b) {
            return;
        }
        j2 x = this.f4865a.x();
        int y = x != null ? x.y() : 0;
        xf xfVar = this.q;
        wf b2 = xfVar != null ? xfVar.b() : null;
        Insets c2 = b2 != null ? b2.c() : null;
        if (c2 != null) {
            k9.a aVar = k9.c;
            setPadding(aVar.b(y) ? 0 : c2.left, aVar.d(y) ? 0 : c2.top, aVar.c(y) ? 0 : c2.right, aVar.a(y) ? 0 : c2.bottom);
            final View view = this.g;
            if (view != null) {
                post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.b(m.this, view);
                    }
                });
            }
        }
    }

    @Override // com.chartboost.sdk.impl.a1
    public void c() {
        c(true);
    }

    @Override // com.chartboost.sdk.impl.a1
    public void d() {
        qf A;
        l lVar = this.b;
        if (lVar != null) {
            lVar.f();
        }
        this.p.a(z0.f, false);
        if (this.f4865a.m()) {
            this.p.a(z0.e, true);
            j2 x = this.f4865a.x();
            long c2 = (x == null || (A = x.A()) == null) ? -1L : A.c();
            if (this.f4865a.l() <= 0 && c2 > 0) {
                a(c2 * 1000);
            }
        } else if (this.c != u.b) {
            this.p.a(z0.d, true);
        }
        pf.a(this.f4865a, b7.b, (r5) null, 2, (Object) null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getAction() == 0) {
            if (a(ev.getX(), ev.getY())) {
                if (this.g != null) {
                    this.m = Float.valueOf(ev.getX() - r0.getLeft());
                    this.n = Float.valueOf(ev.getY() - r0.getTop());
                } else {
                    this.m = Float.valueOf(ev.getX());
                    this.n = Float.valueOf(ev.getY());
                }
            } else {
                this.m = null;
                this.n = null;
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // com.chartboost.sdk.impl.a1
    public void e() {
        k();
    }

    @Override // com.chartboost.sdk.impl.tf
    public void f() {
        l lVar = this.b;
        if (lVar != null) {
            lVar.d();
        }
    }

    @Override // com.chartboost.sdk.impl.a1
    public void g() {
        a0 u;
        l lVar;
        j2 x = this.f4865a.x();
        if (x == null || (u = x.u()) == null) {
            u = this.f4865a.u();
        }
        String a2 = u.h().a();
        if (a2.length() <= 0 || (lVar = this.b) == null) {
            return;
        }
        lVar.a(a2);
    }

    public final l getAdContainerListener$ChartboostMonetization_9_13_0_release() {
        return this.b;
    }

    public final xf getRenderingContainerCalculator() {
        return this.q;
    }

    public final void h() {
        ImageView imageView = this.l;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            Bitmap bitmap = bitmapDrawable != null ? bitmapDrawable.getBitmap() : null;
            removeView(imageView);
            imageView.setImageDrawable(null);
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }
        this.l = null;
    }

    @Override // com.chartboost.sdk.impl.tf
    public void i() {
        this.p.f();
    }

    @Override // com.chartboost.sdk.impl.tf
    public void j() {
        this.p.p();
    }

    public final void k() {
        a0 u;
        j2 x = this.f4865a.x();
        if (x == null || (u = x.u()) == null) {
            u = this.f4865a.u();
        }
        Integer j = u.j();
        int intValue = j != null ? j.intValue() : -1;
        if (this.c == u.d && !this.k && intValue < 0) {
            this.k = true;
            l lVar = this.b;
            if (lVar != null) {
                lVar.b();
            } else {
                mb.e("AdContainerListener null when onAdRewarded()", null, 2, null);
            }
        }
        Job job = this.t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.t = null;
        Job job2 = this.w;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.w = null;
        this.f4865a.a(gh.c);
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.e();
        } else {
            mb.e("AdContainerListener null when onAdClosed()", null, 2, null);
        }
    }

    public final void l() {
        h();
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.s = null;
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.t = null;
        Job job3 = this.w;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.w = null;
        CoroutineScopeKt.cancel$default(this.r, "AdContainerView destroyed", null, 2, null);
        this.f4865a.a(gh.e);
        this.p.b();
        removeAllViews();
    }

    public final void m() {
        l lVar = this.b;
        if (lVar != null) {
            lVar.a();
        } else {
            mb.e("AdContainerListener null when onAdDismissed()", null, 2, null);
        }
    }

    public final boolean n() {
        return this.p.g();
    }

    public final boolean o() {
        return this.f4865a.x() instanceof gl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
        Job job = this.s;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.s = null;
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.t = null;
        Job job3 = this.w;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
        }
        this.w = null;
        CoroutineScopeKt.cancel$default(this.r, "AdContainerView detached from window", null, 2, null);
        InterruptionController interruptionController = InterruptionController.f5128a;
        interruptionController.b((xa) this);
        if (!o()) {
            interruptionController.a();
        }
        interruptionController.b((x6) this);
        this.p.b();
        if (this.c != u.b) {
            this.f4865a.a(gh.e);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ChartboostError.Render.WebViewMraidUnload) {
            mb.a("MRAID unload() called. Skipping the current renderable.", (Throwable) null, 2, (Object) null);
            Job job = this.s;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            d();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        GestureDetector gestureDetector = this.j;
        return gestureDetector != null ? gestureDetector.onTouchEvent(event) : super.onTouchEvent(event);
    }

    public final void p() {
        this.f4865a.p();
    }

    public final void q() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f4865a.q();
        this.p.l();
        this.p.k();
        t();
        s();
    }

    public final void r() {
        if (this.h) {
            this.h = false;
            this.f4865a.r();
            B();
            this.p.h(this.f4865a.B());
            this.p.s();
            this.p.r();
            v();
            u();
        }
    }

    public final void s() {
        Job job = this.w;
        if (job == null || !job.isActive()) {
            return;
        }
        this.x = RangesKt.coerceAtLeast(this.x - (SystemClock.uptimeMillis() - this.y), 0L);
        Job job2 = this.w;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void setAdContainerListener$ChartboostMonetization_9_13_0_release(l lVar) {
        this.b = lVar;
    }

    public final void setAdViewForTesting$ChartboostMonetization_9_13_0_release(View view) {
        this.g = view;
    }

    public final void setRenderingContainerCalculator(xf xfVar) {
        this.q = xfVar;
        B();
    }

    public final void t() {
        Job job = this.t;
        if (job == null || !job.isActive()) {
            return;
        }
        this.u = RangesKt.coerceAtLeast(this.u - (SystemClock.uptimeMillis() - this.v), 0L);
        Job job2 = this.t;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
    }

    public final void u() {
        long j = this.x;
        if (j <= 0) {
            return;
        }
        a(j);
    }

    public final void v() {
        if (this.k) {
            return;
        }
        long j = this.u;
        if (j <= 0) {
            return;
        }
        b(j);
    }

    public final void w() {
        a0 u;
        qf A;
        j2 x = this.f4865a.x();
        if (x != null && (A = x.A()) != null) {
            A.i();
        }
        j2 x2 = this.f4865a.x();
        if (x2 == null || (u = x2.u()) == null) {
            u = this.f4865a.u();
        }
        oa h = u.h();
        m2 k = u.k();
        if (k == null) {
            k = m2.d.a();
        }
        w0 w0Var = this.p;
        y0 y0Var = y0.d;
        x0 x0Var = new x0(k.e().b(), k.e().a());
        x0 x0Var2 = new x0(k.f().b(), k.f().a());
        x0 x0Var3 = new x0(k.g().b(), k.g().a());
        String b2 = h.b();
        if (b2 == null) {
            b2 = "";
        }
        String str = b2;
        String a2 = h.a();
        if (a2 == null) {
            a2 = "https://docs.chartboost.com/opt-out";
        }
        w0Var.a(true, y0Var, x0Var, x0Var2, x0Var3, str, a2, (r19 & 128) != 0 ? false : false);
        w0 w0Var2 = this.p;
        z0 z0Var = z0.c;
        w0Var2.a(z0Var, false);
        this.p.a(z0.f, false);
        w0 w0Var3 = this.p;
        z0 z0Var2 = z0.e;
        w0Var3.a(z0Var2, false);
        w0 w0Var4 = this.p;
        z0 z0Var3 = z0.d;
        w0Var4.a(z0Var3, false);
        this.p.a(z0.g, false);
        if (this.c == u.b) {
            return;
        }
        long w = this.f4865a.w();
        long l = this.f4865a.l();
        boolean z = l > 0 && !(this.f4865a.x() instanceof gl);
        if (w > 0 && z) {
            w = Math.min(w, l);
        } else if (w <= 0) {
            w = l;
        }
        boolean z2 = w > 0;
        if (!this.p.j()) {
            if (z2) {
                this.p.a(w * 1000);
            } else if (this.f4865a.m()) {
                this.p.a(z0Var2, true);
                this.p.a(z0Var3, false);
            } else {
                this.p.a(z0Var2, false);
                this.p.a(z0Var3, true);
            }
        }
        this.p.a(z0Var, this.f4865a.x() instanceof ej);
        m2 l2 = u.l();
        if (l2 == null) {
            l2 = m2.d.a();
        }
        this.p.a(true, y0.e, new x0(l2.e().b(), l2.e().a()), new x0(l2.f().b(), l2.f().a()), new x0(l2.g().b(), l2.g().a()));
        j2 x3 = this.f4865a.x();
        ej ejVar = x3 instanceof ej ? (ej) x3 : null;
        boolean z3 = (ejVar != null && ejVar.H()) || this.f4865a.y() > 0;
        Integer j = u.j();
        int intValue = j != null ? j.intValue() : -1;
        if (this.c == u.d) {
            if (this.k) {
                this.p.q();
            } else if (z3 && u.b() && intValue > 0) {
                this.k = true;
                Job job = this.t;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.p.q();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.b();
                }
            } else {
                Job job2 = this.t;
                if (job2 != null && job2.isActive()) {
                    this.p.a(z0.h, true);
                } else if (intValue > 0) {
                    this.p.b(intValue * 1000);
                } else if (intValue == 0) {
                    this.p.b(0L);
                    this.p.q();
                }
            }
        }
        p5 p5Var = this.o;
        if (p5Var != null) {
            w0.a(this.p, !z3 || p5Var.d(), (String) null, 2, (Object) null);
        }
    }

    public final void x() {
        Bitmap k;
        j2 x = this.f4865a.x();
        if (x == null || (k = x.k()) == null) {
            return;
        }
        Bitmap a2 = l2.a(k, 0, 2, null);
        k.recycle();
        if (a2 == null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(a2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.l = imageView;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        addView(imageView, 0, layoutParams);
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void y() {
        a0 u;
        if (this.i) {
            return;
        }
        this.i = true;
        if (!o()) {
            InterruptionController.f5128a.i();
        }
        this.f4865a.C();
        this.p.h(this.f4865a.B());
        j2 x = this.f4865a.x();
        if (x == null || (u = x.u()) == null) {
            u = this.f4865a.u();
        }
        Integer j = u.j();
        int intValue = j != null ? j.intValue() : -1;
        if (this.c == u.d && !this.k && this.t == null) {
            if (intValue == 0) {
                this.k = true;
                this.p.q();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.b();
                }
            } else if (intValue > 0) {
                this.p.a(z0.h, true);
                this.p.r();
                b(intValue * 1000);
            }
        }
        A();
    }

    public final void z() {
        View o = this.f4865a.o();
        if (o != null) {
            a(o);
            w();
            A();
        }
    }

    public final void c(boolean z) {
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.w = null;
        this.f4865a.c(z);
        j2 x = this.f4865a.x();
        if (x != null) {
            x.b(gh.b);
        }
        if (this.f4865a.m()) {
            z();
        } else {
            k();
        }
    }

    public final boolean a(float f, float f2) {
        View view = this.g;
        return view != null && f >= ((float) view.getLeft()) && f < ((float) view.getRight()) && f2 >= ((float) view.getTop()) && f2 < ((float) view.getBottom());
    }

    public final void b(long j) {
        Job launch$default;
        this.u = j;
        this.v = SystemClock.uptimeMillis();
        Job job = this.t;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new b(j, this, null), 3, null);
        this.t = launch$default;
    }

    public final void b(View view) {
        j2 x = this.f4865a.x();
        if (x instanceof gl) {
            qf A = ((gl) x).A();
            if (A.j() == qf.b.e) {
                return;
            }
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width <= 0 || height <= 0) {
                return;
            }
            m6 b2 = rf.f4996a.b(A, this.e, width, height);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(b2.b(), b2.a());
            layoutParams.topToTop = 0;
            layoutParams.bottomToBottom = 0;
            layoutParams.leftToLeft = 0;
            layoutParams.rightToRight = 0;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, hd multiRenderable, l lVar, u adFormat, Mediation mediation, c6 densityProvider, wg sharedPrefsHelper) {
        super(context);
        Object obj;
        List<Object> A;
        wk b2;
        wk b3;
        qf A2;
        cj q;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        Intrinsics.checkNotNullParameter(sharedPrefsHelper, "sharedPrefsHelper");
        this.f4865a = multiRenderable;
        this.b = lVar;
        this.c = adFormat;
        this.d = mediation;
        this.e = densityProvider;
        this.f = sharedPrefsHelper;
        Iterator it = multiRenderable.A().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            cj q2 = ((j2) obj).A().q();
            if ((q2 != null ? q2.a() : null) != null) {
                break;
            }
        }
        j2 j2Var = (j2) obj;
        p5 a2 = (j2Var == null || (A2 = j2Var.A()) == null || (q = A2.q()) == null) ? null : q.a();
        this.o = a2;
        w0 w0Var = new w0(this, a2, this.c, this.f4865a.u(), this.d);
        this.p = w0Var;
        this.r = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        InterruptionController interruptionController = InterruptionController.f5128a;
        interruptionController.a((xa) this);
        interruptionController.a((x6) this);
        w0Var.a(this);
        this.f4865a.a(this);
        View o = this.f4865a.o();
        if (o != null) {
            a(o);
        }
        w();
        j2 x = this.f4865a.x();
        if (x != null) {
            cj q3 = x.A().q();
            if (q3 != null ? q3.i() : true) {
                a(this, this, false, 2, null);
            }
        }
        for (Object obj2 : this.f4865a.A()) {
            if (obj2 instanceof ej) {
                hd F = ((ej) obj2).F();
                if (F != null && (A = F.A()) != null) {
                    for (Object obj3 : A) {
                        if ((obj3 instanceof vk) && (b2 = ((vk) obj3).b()) != null) {
                            this.p.a(b2);
                        }
                    }
                }
            } else if ((obj2 instanceof vk) && (b3 = ((vk) obj2).b()) != null) {
                this.p.a(b3);
            }
        }
    }

    public static /* synthetic */ void a(m mVar, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mVar.a(view, z);
    }

    public final void a(final View view, boolean z) {
        this.j = z ? new GestureDetector(view.getContext(), new n(0.0f, new Function2() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m.a(m.this, view, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, 1, null)) : null;
    }

    public static final Unit a(m mVar, View view, float f, float f2) {
        if (mVar.g != null && mVar.a(f, f2)) {
            n6 n6Var = n6.f4889a;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int a2 = n6Var.a((int) (f - r3.getLeft()), context);
            int top = (int) (f2 - r3.getTop());
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            pf.a(mVar.f4865a, true, Integer.valueOf(a2), Integer.valueOf(n6Var.a(top, context2)), null, 8, null);
        } else {
            pf.a(mVar.f4865a, true, null, null, null, 8, null);
        }
        return Unit.INSTANCE;
    }

    public final void a(long j) {
        Job launch$default;
        this.x = j;
        this.y = SystemClock.uptimeMillis();
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.r, null, null, new a(j, this, null), 3, null);
        this.w = launch$default;
    }

    public final void a(final View view) {
        h();
        removeView(this.g);
        this.g = view;
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, 0);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        super.addView(view, 0, layoutParams);
        if (this.f4865a.x() instanceof gl) {
            post(new Runnable() { // from class: com.chartboost.sdk.impl.m$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    m.a(m.this, view);
                }
            });
        }
        w();
    }

    @Override // com.chartboost.sdk.impl.x6
    public void b(boolean z) {
        this.f4865a.b(z);
        this.p.h(this.f4865a.B());
    }

    public static final void b(m mVar, View view) {
        if (mVar.isAttachedToWindow()) {
            mVar.b(view);
        }
    }

    @Override // com.chartboost.sdk.impl.a1
    public void b() {
        List emptyList;
        Integer num;
        Integer num2;
        bk G;
        j2 x = this.f4865a.x();
        if (x == null) {
            mb.e("CTA clicked but currentAd is null.", null, 2, null);
            return;
        }
        ej ejVar = x instanceof ej ? (ej) x : null;
        cj q = x.A().q();
        p5 a2 = q != null ? q.a() : null;
        if (a2 == null || (emptyList = a2.c()) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        String a3 = (ejVar == null || (G = ejVar.G()) == null) ? null : G.a();
        Float f = this.m;
        if (f != null) {
            float floatValue = f.floatValue();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            num = Integer.valueOf(n6.f4889a.a((int) floatValue, context));
        } else {
            num = null;
        }
        Float f2 = this.n;
        if (f2 != null) {
            float floatValue2 = f2.floatValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            num2 = Integer.valueOf(n6.f4889a.a((int) floatValue2, context2));
        } else {
            num2 = null;
        }
        this.m = null;
        this.n = null;
        x.a(true, num, num2, (e4) new e4.a(emptyList, a3));
    }

    public static final void a(m mVar, View view) {
        if (mVar.isAttachedToWindow()) {
            mVar.b(view);
        }
    }

    @Override // com.chartboost.sdk.impl.xa
    public void a(Set activeInterruptions) {
        Intrinsics.checkNotNullParameter(activeInterruptions, "activeInterruptions");
        if (activeInterruptions.isEmpty()) {
            r();
        } else {
            q();
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a() {
        View o;
        a0 u;
        if (!o()) {
            InterruptionController.f5128a.a();
        }
        if (!this.f4865a.m()) {
            x();
            j2 x = this.f4865a.x();
            if (x == null || (u = x.u()) == null) {
                u = this.f4865a.u();
            }
            Integer j = u.j();
            int intValue = j != null ? j.intValue() : -1;
            if (this.c == u.d && !this.k && u.b() && intValue > 0) {
                this.k = true;
                Job job = this.t;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.p.q();
                l lVar = this.b;
                if (lVar != null) {
                    lVar.b();
                }
            }
        }
        j2 x2 = this.f4865a.x();
        if (x2 != null) {
            x2.b(gh.g);
        }
        if (!this.f4865a.m() || (o = this.f4865a.o()) == null) {
            return;
        }
        this.f4865a.c(false);
        a(o);
        if (!this.p.j()) {
            this.p.m();
        }
        w();
        A();
        if (!o()) {
            InterruptionController.f5128a.i();
        }
        this.f4865a.C();
        j2 x3 = this.f4865a.x();
        if (x3 != null) {
            cj q = x3.A().q();
            a((View) this, q != null ? q.i() : true);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a(ke request) {
        Intrinsics.checkNotNullParameter(request, "request");
        l lVar = this.b;
        if (lVar != null) {
            lVar.a(request);
        }
    }

    @Override // com.chartboost.sdk.impl.a1
    public void a(boolean z) {
        if (z) {
            pf.a((pf) this.f4865a, false, 1, (Object) null);
        } else {
            pf.a((pf) this.f4865a, 0.0f, false, 3, (Object) null);
        }
        this.f.b("cb_video_mute_state", z);
    }
}
