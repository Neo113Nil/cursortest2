package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.R;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.impl.rh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 {
    public static final a u = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f5049a;
    public final p5 b;
    public final u c;
    public final a0 d;
    public final Mediation e;
    public final pa f;
    public final el g;
    public final d5 h;
    public final c5 i;
    public final th j;
    public rh k;
    public h2 l;
    public final kb m;
    public final kh n;
    public boolean o;
    public final Set p;
    public boolean q;
    public final int r;
    public final int s;
    public a1 t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5050a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[y0.values().length];
            try {
                iArr[y0.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y0.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y0.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y0.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5050a = iArr;
            int[] iArr2 = new int[z0.values().length];
            try {
                iArr2[z0.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[z0.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[z0.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[z0.e.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[z0.f.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[z0.g.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[z0.h.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            b = iArr2;
        }
    }

    public w0(ConstraintLayout host, p5 p5Var, u adFormat, a0 adMarkupConfig, Mediation mediation) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.f5049a = host;
        this.b = p5Var;
        this.c = adFormat;
        this.d = adMarkupConfig;
        this.e = mediation;
        kb kbVar = new kb(d());
        this.m = kbVar;
        this.n = b4.b.b().t();
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(...)");
        this.p = newSetFromMap;
        u uVar = u.b;
        this.r = adFormat != uVar ? a(16) : 0;
        this.s = adFormat != uVar ? a(4) : 0;
        pa paVar = new pa(d(), null, 0, null, new Function1() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.a(w0.this, (String) obj);
            }
        }, 14, null);
        this.f = paVar;
        if (adFormat == uVar) {
            paVar.a(false);
        }
        el elVar = new el(d(), null, 0, null, null, new Function1() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return w0.a(w0.this, ((Boolean) obj).booleanValue());
            }
        }, 30, null);
        this.g = elVar;
        Context d = d();
        String string = d().getString(R.string.timer_notification_icon_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = d().getString(R.string.close_button_description);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = d().getString(R.string.skip_button_description);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        d5 d5Var = new d5(d, null, 0, string, string2, string3, null, new Function0() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.a(w0.this);
            }
        }, new Function0() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.b(w0.this);
            }
        }, 70, null);
        d5.a(d5Var, false, 1, null);
        this.h = d5Var;
        this.i = new c5(d5Var);
        th thVar = new th(d(), null, 0, null, null, 30, null);
        thVar.setVisibility(8);
        this.j = thVar;
        if (p5Var != null) {
            h2 a2 = me.f4879a.a(d(), p5Var, new Function0() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w0.c(w0.this);
                }
            });
            this.l = a2;
            host.addView(a2);
            a(this, true, (String) null, 2, (Object) null);
        }
        host.addView(elVar);
        host.addView(paVar);
        host.addView(thVar);
        host.addView(d5Var);
        int a3 = a(80);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(a3, a3);
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.leftToLeft = 0;
        layoutParams.rightToRight = 0;
        Unit unit = Unit.INSTANCE;
        host.addView(kbVar, layoutParams);
        o();
        n();
    }

    public static final Unit b(w0 w0Var) {
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.c();
        }
        return Unit.INSTANCE;
    }

    public static final Unit c(w0 w0Var) {
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.b();
        }
        return Unit.INSTANCE;
    }

    public final void a(a1 a1Var) {
        this.t = a1Var;
    }

    public final Context d() {
        Context context = this.f5049a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return context;
    }

    public final Resources e() {
        return this.f5049a.getResources();
    }

    public final void f(boolean z) {
        this.h.c(z);
        this.h.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void g(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
        this.g.setImportantForAccessibility(z ? 1 : 2);
    }

    public final boolean h() {
        return this.m.getVisibility() == 0;
    }

    public final boolean i() {
        return this.i.b() != null;
    }

    public final boolean j() {
        rh b2 = this.i.b();
        return (b2 != null ? b2.d() : null) == rh.b.b;
    }

    public final void k() {
        rh rhVar = this.k;
        if (rhVar != null) {
            rhVar.e();
        }
    }

    public final void l() {
        this.i.c();
    }

    public final void m() {
        this.i.d();
    }

    public final void o() {
        this.f.setId(View.generateViewId());
        this.g.setId(View.generateViewId());
        this.h.setId(View.generateViewId());
        this.j.setId(View.generateViewId());
        h2 h2Var = this.l;
        if (h2Var != null) {
            h2Var.setId(View.generateViewId());
        }
        this.m.setId(View.generateViewId());
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f5049a);
        constraintSet.constrainWidth(this.g.getId(), -2);
        constraintSet.constrainHeight(this.g.getId(), -2);
        constraintSet.connect(this.g.getId(), 1, 0, 1, this.r);
        constraintSet.connect(this.g.getId(), 3, 0, 3, this.s);
        constraintSet.constrainWidth(this.f.getId(), -2);
        constraintSet.constrainHeight(this.f.getId(), -2);
        constraintSet.connect(this.f.getId(), 1, this.g.getId(), 2, a(8));
        constraintSet.setGoneMargin(this.f.getId(), 1, 0);
        constraintSet.connect(this.f.getId(), 3, 0, 3, this.s);
        constraintSet.constrainWidth(this.h.getId(), -2);
        constraintSet.constrainHeight(this.h.getId(), -2);
        constraintSet.connect(this.h.getId(), 2, 0, 2, this.r);
        constraintSet.connect(this.h.getId(), 3, 0, 3, this.s);
        h2 h2Var2 = this.l;
        if (h2Var2 != null) {
            constraintSet.constrainWidth(h2Var2.getId(), 0);
            constraintSet.connect(h2Var2.getId(), 1, 0, 1, this.r);
            constraintSet.connect(h2Var2.getId(), 2, 0, 2, this.r);
            constraintSet.connect(h2Var2.getId(), 4, 0, 4);
        }
        constraintSet.applyTo(this.f5049a);
    }

    public final void p() {
        if (h()) {
            return;
        }
        this.m.b();
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((wk) it.next()).a(this.m, uk.h);
        }
    }

    public final void q() {
        rh rhVar = this.k;
        if (rhVar != null) {
            rhVar.h();
        }
        a(z0.h, true);
        this.j.a(0L, 1L);
        a();
    }

    public final void r() {
        rh rhVar = this.k;
        if (rhVar != null) {
            rhVar.g();
        }
    }

    public final void s() {
        this.i.e();
    }

    public static final Unit a(w0 w0Var, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.g();
        }
        return Unit.INSTANCE;
    }

    public static final Unit d(w0 w0Var) {
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.d();
        }
        kh khVar = w0Var.n;
        z6 z6Var = new z6(w0Var.d.c(), CollectionsKt.emptyList(), a7.d, null, null, null, null, null, w0Var.e, 240, null);
        List e = w0Var.d.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.g.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), null, 8, null));
        }
        kh.a(khVar, z6Var, arrayList2, (g7.b) null, lh.a(w0Var.d.e(), g7.b.f), 4, (Object) null);
        return Unit.INSTANCE;
    }

    public final void c(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
        this.f.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void e(boolean z) {
        this.h.b(z);
        this.h.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void h(boolean z) {
        this.g.setMuted(z);
    }

    public final void t() {
        this.g.setAccessibilityTraversalBefore(this.h.getId());
        this.j.setAccessibilityTraversalBefore(-1);
    }

    public final void u() {
        this.g.setAccessibilityTraversalBefore(this.j.getId());
        this.j.setAccessibilityTraversalBefore(this.h.getId());
    }

    public static final Unit a(w0 w0Var, boolean z) {
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.a(z);
        }
        return Unit.INSTANCE;
    }

    public final void b(long j) {
        rh rhVar = this.k;
        if (rhVar != null) {
            rhVar.a();
        }
        this.j.a(uh.b, d().getString(R.string.reward_timer_running), d().getString(R.string.reward_timer_complete));
        if (j > 0) {
            rh rhVar2 = new rh(j, null, null, 4, null);
            rhVar2.a(this.j);
            this.k = rhVar2;
        } else {
            this.k = null;
        }
        a();
        c();
    }

    public final void n() {
        this.f.setAccessibilityTraversalBefore(this.g.getId());
        this.g.setAccessibilityTraversalBefore(this.h.getId());
        h2 h2Var = this.l;
        if (h2Var != null) {
            this.h.setAccessibilityTraversalBefore(h2Var.getId());
        }
    }

    public static final Unit a(w0 w0Var) {
        a1 a1Var = w0Var.t;
        if (a1Var != null) {
            a1Var.e();
        }
        return Unit.INSTANCE;
    }

    public final boolean g() {
        return this.h.getCloseButton().getVisibility() == 0;
    }

    public final void c() {
        if (this.q) {
            return;
        }
        this.q = true;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            this.j.a((wk) it.next(), uk.j);
        }
    }

    public final void f() {
        if (h()) {
            this.m.a();
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((wk) it.next()).a(this.m);
            }
        }
    }

    public final void a(long j) {
        c5.a(this.i, j, uh.c, null, null, new Function0() { // from class: com.chartboost.sdk.impl.w0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w0.d(w0.this);
            }
        }, 12, null);
    }

    public final void a() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.f5049a);
        constraintSet.clear(this.j.getId(), 1);
        constraintSet.clear(this.j.getId(), 2);
        constraintSet.clear(this.j.getId(), 3);
        constraintSet.clear(this.j.getId(), 4);
        constraintSet.connect(this.j.getId(), 2, this.h.getId(), 1, a(8));
        constraintSet.connect(this.j.getId(), 3, this.h.getId(), 3);
        constraintSet.applyTo(this.f5049a);
    }

    public final void b(boolean z) {
        h2 h2Var = this.l;
        if (h2Var != null) {
            int i = 0;
            h2Var.setVisibility(z ? 0 : 8);
            h2Var.setImportantForAccessibility(z ? 1 : 2);
            if (!z || this.o) {
                return;
            }
            this.o = true;
            kh khVar = this.n;
            z6 z6Var = new z6(this.d.c(), CollectionsKt.emptyList(), a7.c, q5.a(this.b), null, null, null, null, this.e, 240, null);
            List e = this.d.e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e) {
                if (Intrinsics.areEqual(((g7) obj).d(), g7.b.g.b())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            int size = arrayList.size();
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                g7 g7Var = (g7) obj2;
                arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), null, 8, null));
            }
            kh.a(khVar, z6Var, arrayList2, (g7.b) null, lh.a(this.d.e(), g7.b.f), 4, (Object) null);
        }
    }

    public final void a(boolean z, y0 position, x0 margin, x0 padding, x0 size, String imageUrl, String clickthroughUrl, boolean z2) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        a(z0.b, z);
        if (z) {
            this.f.a(size);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.f5049a);
            constraintSet.clear(this.f.getId(), 1);
            constraintSet.clear(this.f.getId(), 2);
            constraintSet.clear(this.f.getId(), 3);
            constraintSet.clear(this.f.getId(), 4);
            int i = b.f5050a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.g.getId(), 1, 0, 1, this.r + a(margin.b()));
                constraintSet.connect(this.f.getId(), 1, this.g.getId(), 2, a(8));
                constraintSet.setGoneMargin(this.f.getId(), 1, 0);
                constraintSet.connect(this.f.getId(), 3, 0, 3, this.s + a(margin.a()));
                constraintSet.connect(this.g.getId(), 3, 0, 3, this.s + a(margin.a()));
                constraintSet.connect(this.h.getId(), 3, 0, 3, this.s + a(margin.a()));
            } else if (i == 2) {
                constraintSet.connect(this.f.getId(), 2, 0, 2, this.r + a(margin.b()));
                constraintSet.connect(this.f.getId(), 3, 0, 3, this.s + a(margin.a()));
            } else if (i == 3) {
                constraintSet.connect(this.f.getId(), 1, 0, 1, this.r + a(margin.b()));
                constraintSet.connect(this.f.getId(), 4, 0, 4, a(margin.a()));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintSet.connect(this.f.getId(), 2, 0, 2, this.r + a(margin.b()));
                constraintSet.connect(this.f.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this.f5049a);
            if (imageUrl.length() > 0) {
                this.f.b(imageUrl);
            }
            this.f.setClickthroughUrl(clickthroughUrl);
            this.f.setEnableSponsorText(z2);
        }
    }

    public final void a(boolean z, y0 position, x0 margin, x0 padding, x0 size) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(size, "size");
        if (!z) {
            this.h.setVisibility(8);
        }
        if (z) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this.f5049a);
            constraintSet.clear(this.h.getId(), 1);
            constraintSet.clear(this.h.getId(), 2);
            constraintSet.clear(this.h.getId(), 3);
            constraintSet.clear(this.h.getId(), 4);
            int i = b.f5050a[position.ordinal()];
            if (i == 1) {
                constraintSet.connect(this.h.getId(), 1, 0, 1, this.r + a(margin.b()));
                constraintSet.connect(this.h.getId(), 3, 0, 3, this.s + a(margin.a()));
            } else if (i == 2) {
                constraintSet.connect(this.h.getId(), 2, 0, 2, this.r + a(margin.b()));
                constraintSet.connect(this.h.getId(), 3, 0, 3, this.s + a(margin.a()));
            } else if (i == 3) {
                constraintSet.connect(this.h.getId(), 1, 0, 1, this.r + a(margin.b()));
                constraintSet.connect(this.h.getId(), 4, 0, 4, a(margin.a()));
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                constraintSet.connect(this.h.getId(), 2, 0, 2, this.r + a(margin.b()));
                constraintSet.connect(this.h.getId(), 4, 0, 4, a(margin.a()));
            }
            constraintSet.applyTo(this.f5049a);
        }
    }

    public static /* synthetic */ void a(w0 w0Var, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        w0Var.a(z, str);
    }

    public final void a(boolean z, String ctaTextTitle) {
        h2 h2Var;
        Intrinsics.checkNotNullParameter(ctaTextTitle, "ctaTextTitle");
        if (this.l == null) {
            return;
        }
        a(z0.g, z);
        if (z && (h2Var = this.l) != null) {
            h2Var.setCustomContentDescription(ctaTextTitle);
        }
    }

    public final void a(z0 chip, boolean z) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        switch (b.b[chip.ordinal()]) {
            case 1:
                c(z);
                return;
            case 2:
                g(z);
                return;
            case 3:
                a(z);
                return;
            case 4:
                e(z);
                return;
            case 5:
                f(z);
                return;
            case 6:
                b(z);
                return;
            case 7:
                d(z);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void a(boolean z) {
        this.h.a(z);
        this.h.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void a(wk tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        if (this.p.add(tracker)) {
            this.f.a(tracker, uk.f);
            this.g.a(tracker, uk.i);
            if (this.c != u.b) {
                tracker.a(this.h, uk.k);
            }
            h2 h2Var = this.l;
            if (h2Var != null) {
                h2Var.a(tracker, uk.e);
            }
            if (this.q) {
                this.j.a(tracker, uk.j);
            }
            if (h()) {
                tracker.a(this.m, uk.h);
            }
        }
    }

    public final int a(double d) {
        return (int) (d * e().getDisplayMetrics().density);
    }

    public final int a(int i) {
        return (int) (i * e().getDisplayMetrics().density);
    }

    public final void b() {
        this.i.a();
        rh rhVar = this.k;
        if (rhVar != null) {
            rhVar.a();
        }
        this.k = null;
        f();
        this.p.clear();
        this.q = false;
    }

    public final void d(boolean z) {
        this.j.setVisibility(z ? 0 : 8);
        if (z) {
            u();
        } else {
            t();
        }
    }
}
