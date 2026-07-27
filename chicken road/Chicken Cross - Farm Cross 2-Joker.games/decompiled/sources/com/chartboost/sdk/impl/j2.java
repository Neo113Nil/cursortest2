package com.chartboost.sdk.impl;

import android.net.Uri;
import androidx.compose.material.MenuKt;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.g7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public abstract class j2 extends pf {
    public final qf d;
    public final a0 e;
    public final kh f;
    public final u g;
    public final Mediation h;
    public final Lazy i;
    public final Lazy j;
    public final long k;
    public final long l;
    public final int m;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4817a;

        static {
            int[] iArr = new int[b7.values().length];
            try {
                iArr[b7.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b7.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4817a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ j2(qf qfVar, a0 a0Var, wh whVar, kh khVar, u uVar, Mediation mediation, CoroutineDispatcher coroutineDispatcher, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qfVar, a0Var, whVar, khVar, uVar, mediation, r9, (i & 128) != 0 ? new Function0() { // from class: com.chartboost.sdk.impl.j2$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                yi a2;
                a2 = j2.a(CoroutineDispatcher.this);
                return a2;
            }
        } : function0);
        final CoroutineDispatcher io2 = (i & 64) != 0 ? Dispatchers.getIO() : coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yi a(CoroutineDispatcher coroutineDispatcher) {
        return new yi(new xi(null, null, 3, null), null, null, null, coroutineDispatcher, 14, null);
    }

    public final qf A() {
        return this.d;
    }

    public final kh B() {
        return this.f;
    }

    public final yi C() {
        return (yi) this.i.getValue();
    }

    public void D() {
        List h = this.d.h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.l.b())) {
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
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh khVar = this.f;
        ba baVar = new ba(this.e.c(), CollectionsKt.emptyList(), null, null, null, null, this.h, 60, null);
        g7.b bVar = g7.b.l;
        if (arrayList2.isEmpty()) {
            bVar = null;
        }
        khVar.a(baVar, arrayList2, bVar, CollectionsKt.distinct(a(g7.b.f.b())));
        a(this, (ChartboostError.Render) null, 1, (Object) null);
    }

    public abstract void a(gh ghVar);

    public final void b(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (reason != gh.f && this.i.isInitialized()) {
            C().close();
        }
        a(reason);
    }

    public final u t() {
        return this.g;
    }

    public final a0 u() {
        return this.e;
    }

    public final f4 v() {
        return (f4) this.j.getValue();
    }

    public long w() {
        return this.l;
    }

    public long x() {
        return this.k;
    }

    public int y() {
        return this.m;
    }

    public final Mediation z() {
        return this.h;
    }

    public static final f4 a(j2 j2Var) {
        return new f4(j2Var.d, j2Var.e, j2Var.f, j2Var.h);
    }

    public void b(boolean z) {
        kh khVar = this.f;
        ch chVar = new ch(this.e.c(), CollectionsKt.emptyList(), z, null, null, null, null, this.h, MenuKt.InTransitionDuration, null);
        List plus = CollectionsKt.plus((Collection) this.d.h(), (Iterable) this.e.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : plus) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.p.b())) {
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
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, chVar, arrayList2, (g7.b) null, CollectionsKt.distinct(a(g7.b.f.b())), 4, (Object) null);
    }

    public void a(String str, boolean z) {
        tf n;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        a(this, str, z, (e4) null, uuid, 4, (Object) null);
        if (!v().a(new e4.b(CollectionsKt.emptyList(), str), z, uuid) || (n = n()) == null) {
            return;
        }
        n.f();
    }

    public j2(qf renderableConfig, a0 adMarkupConfig, wh trackerComponent, kh telemetryManager, u adFormat, Mediation mediation, CoroutineDispatcher ioDispatcher, Function0 urlResolverFactory) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(urlResolverFactory, "urlResolverFactory");
        this.d = renderableConfig;
        this.e = adMarkupConfig;
        this.f = telemetryManager;
        this.g = adFormat;
        this.h = mediation;
        this.i = LazyKt.lazy(urlResolverFactory);
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.j2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j2.a(j2.this);
            }
        });
        k5 d = renderableConfig.d();
        this.k = d != null ? d.b() : 0L;
        k5 d2 = renderableConfig.d();
        this.l = d2 != null ? d2.a() : 0L;
        this.m = renderableConfig.m();
    }

    public static /* synthetic */ void a(j2 j2Var, String str, boolean z, e4 e4Var, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performClickthrough");
        }
        if ((i & 4) != 0) {
            e4Var = null;
        }
        if ((i & 8) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        j2Var.a(str, z, e4Var, str2);
    }

    public final void a(String str, boolean z, e4 e4Var, final String clickId) {
        String str2;
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        final e4 bVar = e4Var == null ? new e4.b(CollectionsKt.emptyList(), str) : e4Var;
        if (str == null) {
            v().a(bVar, l4.d.b("Missing clickthrough URL"), clickId);
            return;
        }
        String scheme = Uri.parse(str).getScheme();
        if (scheme == null || scheme.length() == 0 || StringsKt.equals(scheme, "about", true)) {
            if (scheme != null && scheme.length() != 0) {
                str2 = "Ineligible URI scheme: " + str;
            } else {
                str2 = "Missing URI scheme: " + str;
            }
            a(new ChartboostError.Render.InvalidClickthroughUrl(str, "Invalid clickthrough URL format", new IllegalArgumentException(str2)));
        }
        C().a(str, i4.d, null, z, this.d.g(), this.d.f(), this.e.g(), new Function1() { // from class: com.chartboost.sdk.impl.j2$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j2.a(j2.this, bVar, clickId, (l4) obj);
            }
        }, false);
    }

    public static final Unit a(j2 j2Var, e4 e4Var, String str, l4 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        j2Var.v().a(e4Var, result, str);
        return Unit.INSTANCE;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(b7 type, r5 r5Var) {
        r5 r5Var2;
        a7 a7Var;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == b7.c) {
            if (r5Var == null) {
                cj q = this.d.q();
                r5Var = q5.a(q != null ? q.a() : null);
            }
            r5Var2 = r5Var;
        } else {
            r5Var2 = null;
        }
        int i = a.f4817a[type.ordinal()];
        if (i == 1) {
            a7Var = a7.d;
        } else if (i == 2) {
            a7Var = a7.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        a7 a7Var2 = a7Var;
        kh khVar = this.f;
        z6 z6Var = new z6(this.e.c(), CollectionsKt.emptyList(), a7Var2, r5Var2, null, null, null, null, this.h, 240, null);
        List h = this.d.h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h) {
            if (Intrinsics.areEqual(((g7) obj).d(), g7.b.g.b())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            g7 g7Var = (g7) obj2;
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        kh.a(khVar, z6Var, arrayList2, (g7.b) null, CollectionsKt.distinct(a(g7.b.f.b())), 4, (Object) null);
    }

    public static /* synthetic */ void a(j2 j2Var, ChartboostError.Render render, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackRender");
        }
        if ((i & 1) != 0) {
            render = null;
        }
        j2Var.a(render);
    }

    public final void a(ChartboostError.Render render) {
        List a2;
        if (!Chartboost.isSdkStarted()) {
            mb.b("SDK not initialized. Cannot track render event for auction " + this.e.c() + (render != null ? " (triggered by error handler): " + render : ""), (Throwable) null, 2, (Object) null);
            return;
        }
        String a3 = render != null ? lb.a(lb.f4860a, 0, 1, null) : null;
        if (render != null) {
            mb.a("Tracking render error: auctionId=" + this.e.c() + ", errorCode=" + render.getCode() + ", errorConstant=" + render.getConstant() + ", logContextSize=" + (a3 != null ? a3.length() : 0), (Throwable) null, 2, (Object) null);
        }
        try {
            kh khVar = this.f;
            nf nfVar = new nf(this.e.c(), CollectionsKt.emptyList(), render != null ? render.getMessage() : null, render != null ? render.getCode() : null, render != null ? render.getConstant() : null, render != null ? render.getCauseDescription() : null, this.h, a3);
            if (render != null) {
                a2 = CollectionsKt.distinct(a(g7.b.i.b()));
            } else {
                a2 = a(g7.b.h.b());
            }
            kh.a(khVar, nfVar, a2, (g7.b) null, CollectionsKt.distinct(a(g7.b.f.b())), 4, (Object) null);
        } catch (Exception e) {
            mb.b("Failed to track " + (render != null ? "render error" : "render") + " event for auction " + this.e.c(), e);
        }
    }

    public final List a(String str) {
        List plus = CollectionsKt.plus((Collection) this.d.h(), (Iterable) this.e.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : plus) {
            if (Intrinsics.areEqual(((g7) obj).d(), str)) {
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
            arrayList2.add(new xh(g7Var.e(), g7Var.c(), g7Var.a(), g7Var.b()));
        }
        return arrayList2;
    }
}
