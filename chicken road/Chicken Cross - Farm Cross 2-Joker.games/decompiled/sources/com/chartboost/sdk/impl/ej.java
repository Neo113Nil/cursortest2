package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.al;
import com.chartboost.sdk.impl.c;
import com.chartboost.sdk.impl.l5;
import com.chartboost.sdk.impl.rj;
import com.chartboost.sdk.impl.xb;
import com.ironsource.U3;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ej extends j2 implements tf {
    public static final a C = new a(null);
    public long A;
    public final d B;
    public final Context n;
    public final String o;
    public final wh p;
    public final rk q;
    public final ld r;
    public final il s;
    public final ae t;
    public final u2 u;
    public final boolean v;
    public hd w;
    public bk x;
    public Set y;
    public ac z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4760a;

        static {
            int[] iArr = new int[gh.values().length];
            try {
                iArr[gh.c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gh.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gh.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4760a = iArr;
        }
    }

    public static final class c extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public Object i;
        public Object j;
        public Object k;
        public Object l;
        public Object m;
        public Object n;
        public Object o;
        public Object p;
        public Object q;
        public int r;
        public /* synthetic */ Object s;
        public int u;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.s = obj;
            this.u |= Integer.MIN_VALUE;
            return ej.this.a(null, null, this);
        }
    }

    public static final class d implements x6 {
        public d() {
        }

        @Override // com.chartboost.sdk.impl.x6
        public void b(boolean z) {
            hd F = ej.this.F();
            if (F != null) {
                F.b(z);
            }
        }
    }

    public static final class e extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            Object a2 = ej.this.a((Context) null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(Context context, String xml, qf renderableConfig, a0 adMarkupConfig, wh trackerComponent, kh telemetryManager, rk viewabilityComponent, ld okHttpNetworkClient, u adFormat, il webViewFactory, Mediation mediation, ae openMeasurementManager, u2 cbIdentity, boolean z) {
        super(renderableConfig, adMarkupConfig, trackerComponent, telemetryManager, adFormat, mediation, null, null, 192, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xml, "xml");
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(trackerComponent, "trackerComponent");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        Intrinsics.checkNotNullParameter(viewabilityComponent, "viewabilityComponent");
        Intrinsics.checkNotNullParameter(okHttpNetworkClient, "okHttpNetworkClient");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(webViewFactory, "webViewFactory");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(cbIdentity, "cbIdentity");
        this.n = context;
        this.o = xml;
        this.p = trackerComponent;
        this.q = viewabilityComponent;
        this.r = okHttpNetworkClient;
        this.s = webViewFactory;
        this.t = openMeasurementManager;
        this.u = cbIdentity;
        this.v = z;
        this.y = new LinkedHashSet();
        this.A = Long.MIN_VALUE;
        this.B = new d();
    }

    public static final CharSequence b(j2 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    @Override // com.chartboost.sdk.impl.j2
    public void D() {
        List A;
        String c2 = u().c();
        hd hdVar = this.w;
        mb.a("VAST starting: auctionId=" + c2 + ", renderableCount=" + ((hdVar == null || (A = hdVar.A()) == null) ? 0 : A.size()), (Throwable) null, 2, (Object) null);
        hd hdVar2 = this.w;
        if (hdVar2 != null) {
            hdVar2.C();
        }
    }

    public final ac E() {
        return this.z;
    }

    public final hd F() {
        return this.w;
    }

    public final bk G() {
        return this.x;
    }

    public final boolean H() {
        hd hdVar = this.w;
        return (hdVar != null ? hdVar.y() : 0) > 0;
    }

    @Override // com.chartboost.sdk.impl.tf
    public void f() {
        tf n = n();
        if (n != null) {
            n.f();
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void i() {
        tf n = n();
        if (n != null) {
            n.i();
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void j() {
        tf n = n();
        if (n != null) {
            n.j();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public Bitmap k() {
        j2 x;
        hd hdVar = this.w;
        if (hdVar == null || (x = hdVar.x()) == null) {
            return null;
        }
        return x.k();
    }

    @Override // com.chartboost.sdk.impl.pf
    public long l() {
        hd hdVar = this.w;
        if (hdVar != null) {
            return hdVar.l();
        }
        return 0L;
    }

    @Override // com.chartboost.sdk.impl.pf
    public boolean m() {
        hd hdVar = this.w;
        return hdVar != null && hdVar.m();
    }

    @Override // com.chartboost.sdk.impl.pf
    public View o() {
        hd hdVar = this.w;
        if (hdVar != null) {
            return hdVar.o();
        }
        return null;
    }

    @Override // com.chartboost.sdk.impl.tf
    public void onError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        tf n = n();
        if (n != null) {
            n.onError(error);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void p() {
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.p();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void q() {
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.q();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void r() {
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.r();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void s() {
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.s();
        }
    }

    @Override // com.chartboost.sdk.impl.j2
    public long w() {
        k5 b2;
        hd hdVar = this.w;
        if (hdVar != null && hdVar.y() == 0) {
            return super.w();
        }
        cj q = A().q();
        if (q == null || (b2 = q.b()) == null) {
            return 0L;
        }
        return b2.a();
    }

    @Override // com.chartboost.sdk.impl.j2
    public long x() {
        k5 b2;
        hd hdVar = this.w;
        if (hdVar != null && hdVar.y() == 0) {
            return super.x();
        }
        cj q = A().q();
        if (q == null || (b2 = q.b()) == null) {
            return 0L;
        }
        return b2.b();
    }

    @Override // com.chartboost.sdk.impl.j2
    public int y() {
        hd hdVar = this.w;
        if (hdVar != null && hdVar.y() == 0) {
            return super.y();
        }
        cj q = A().q();
        if (q != null) {
            return q.c();
        }
        return 0;
    }

    public static final boolean b(kk kkVar) {
        return kkVar.Q();
    }

    public final void a(hd hdVar) {
        this.w = hdVar;
    }

    public static /* synthetic */ ac a(ej ejVar, zb zbVar, int i, String str, ne neVar, Long l, Long l2, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            l2 = null;
        }
        return ejVar.a(zbVar, i, str, neVar, l, l2);
    }

    public final Integer b(Throwable th) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th != null && linkedHashSet.add(th)) {
            if (th instanceof hj) {
                return ((hj) th).a();
            }
            th = th.getCause();
        }
        return null;
    }

    public final ac a(zb zbVar, int i, String str, ne neVar, Long l, Long l2) {
        return new ac(SystemClock.uptimeMillis() - this.A, zbVar, i, str, neVar, l, l2);
    }

    private final List b(String str) {
        Set set = this.y;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (Intrinsics.areEqual(((ii) obj).b(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    @Override // com.chartboost.sdk.impl.pf
    public java.lang.Object a(android.content.Context r39, kotlin.coroutines.Continuation r40) {
        /*
            Method dump skipped, instructions count: 2487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.ej.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final boolean a(kk kkVar) {
        return kkVar.Q();
    }

    @Override // com.chartboost.sdk.impl.j2
    public void a(gh reason) {
        j2 x;
        Intrinsics.checkNotNullParameter(reason, "reason");
        String c2 = u().c();
        hd hdVar = this.w;
        mb.a("VAST stopping: auctionId=" + c2 + ", reason=" + reason + ", currentAdIndex=" + (hdVar != null ? hdVar.y() : -1), (Throwable) null, 2, (Object) null);
        int i = b.f4760a[reason.ordinal()];
        if (i == 1 || i == 2) {
            hd F = F();
            if (F != null) {
                a(rj.e.b);
                a(rj.d.b);
                F.a(reason);
                a((hd) null);
                return;
            }
            return;
        }
        if (i != 3) {
            hd hdVar2 = this.w;
            if (hdVar2 == null || (x = hdVar2.x()) == null) {
                return;
            }
            x.b(reason);
            return;
        }
        hd F2 = F();
        if (F2 != null) {
            F2.a(reason);
            a((hd) null);
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public float a(boolean z) {
        hd hdVar = this.w;
        if (hdVar != null) {
            return hdVar.a(z);
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(float f, boolean z) {
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.a(f, z);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a() {
        tf n = n();
        if (n != null) {
            n.a();
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(boolean z, Integer num, Integer num2, e4 e4Var) {
        j2 x;
        hd hdVar = this.w;
        if (hdVar == null || (x = hdVar.x()) == null) {
            mb.e("Failed to track a click for VAST because no current ad", null, 2, null);
        } else {
            x.a(z, num, num2, e4Var);
        }
    }

    @Override // com.chartboost.sdk.impl.tf
    public void a(ke request) {
        Intrinsics.checkNotNullParameter(request, "request");
        tf n = n();
        if (n != null) {
            n.a(request);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x07de, code lost:
    
        if (r2 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x071e, code lost:
    
        if (kotlin.text.StringsKt.endsWith$default(r5, ".js", false, 2, (java.lang.Object) null) == true) goto L188;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x048c A[LOOP:0: B:30:0x0486->B:32:0x048c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, gj gjVar, Continuation continuation) {
        c cVar;
        int i;
        ArrayList arrayList;
        List arrayList2;
        String str;
        String str2;
        ArrayList arrayList3;
        y5 y5Var;
        zb zbVar;
        cj q;
        String str3;
        ne neVar;
        Long l;
        String b2;
        String b3;
        ub ubVar;
        URL url;
        Long l2;
        ne neVar2;
        Long l3;
        ne neVar3;
        ej ejVar;
        Set set;
        v4 v4Var;
        gj gjVar2;
        ne neVar4;
        List list;
        Long l4;
        int i2;
        Object obj;
        Context context2;
        List list2;
        ArrayList arrayList4;
        v4 v4Var2;
        cj cjVar;
        Long l5;
        ne neVar5;
        zb zbVar2;
        List list3;
        Set set2;
        long b4;
        la a2;
        List<l5> b5;
        ub ubVar2;
        List list4;
        Set set3;
        zb zbVar3;
        ne neVar6;
        Long l6;
        y5 y5Var2;
        int i3;
        ub ubVar3;
        URL url2;
        bk bkVar;
        Collection emptyList;
        boolean z;
        String str4;
        String str5;
        URL url3;
        pf pfVar;
        String str6;
        List b6;
        Context context3 = context;
        gj gjVar3 = gjVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i4 = cVar.u;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.u = i4 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj2 = cVar2.s;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar2.u;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    ae aeVar = this.t;
                    u2 u2Var = this.u;
                    str = "\"";
                    str2 = U3.j.e;
                    mj mjVar = new mj(rb.a(context, aeVar, u2Var, null, 8, null));
                    al.b bVar = al.e;
                    Set b7 = bVar.b(gjVar.b(), mjVar);
                    List a3 = bVar.a(gjVar.b(), mjVar);
                    Iterator it = gjVar.a().iterator();
                    while (it.hasNext()) {
                        com.chartboost.sdk.impl.c cVar3 = (com.chartboost.sdk.impl.c) it.next();
                        c.a aVar = cVar3 instanceof c.a ? (c.a) cVar3 : null;
                        if (aVar != null && (a2 = aVar.a()) != null && (b5 = a2.b()) != null) {
                            for (l5 l5Var : b5) {
                                if (l5Var instanceof l5.a) {
                                    arrayList5.addAll(((l5.a) l5Var).a().a());
                                } else if (l5Var instanceof l5.b) {
                                    l5.b bVar2 = (l5.b) l5Var;
                                    Iterator it2 = bVar2.a().a().iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add((ub) it2.next());
                                        arrayList6.add(bVar2.a().c());
                                        it = it;
                                    }
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            it = it;
                        }
                    }
                    arrayList3 = arrayList6;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    wf wfVar = new wf(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density, null, null, 24, null);
                    cj q2 = A().q();
                    v4 a4 = (q2 == null || !q2.h()) ? null : x4.f5068a.a(arrayList5, wfVar);
                    y5Var = new y5();
                    this.A = SystemClock.uptimeMillis();
                    cj q3 = A().q();
                    if (q3 == null || (zbVar = q3.e()) == null) {
                        zbVar = zb.d;
                    }
                    q = A().q();
                    if (q != null && q.j()) {
                        ne neVar7 = ne.d;
                        b4 = fj.b(q);
                        l = Boxing.boxLong(b4);
                        str3 = "x";
                        neVar = neVar7;
                    } else {
                        str3 = "x";
                        neVar = ne.c;
                        l = null;
                    }
                    xb a5 = yb.f5089a.a(arrayList2, wfVar);
                    if (a5 instanceof xb.b) {
                        List a6 = ((xb.b) a5).a();
                        if (zbVar == zb.e) {
                            zb zbVar4 = zbVar;
                            wb wbVar = new wb(y5Var, (A().q() != null ? r11.f() : 30) * 1000);
                            cVar2.b = this;
                            cVar2.c = context3;
                            cVar2.d = gjVar3;
                            cVar2.e = arrayList;
                            cVar2.f = arrayList2;
                            cVar2.g = arrayList3;
                            cVar2.h = b7;
                            cVar2.i = a3;
                            cVar2.j = a4;
                            cVar2.k = y5Var;
                            cVar2.l = zbVar4;
                            cVar2.m = q;
                            cVar2.n = neVar;
                            cVar2.o = l;
                            list2 = a6;
                            cVar2.p = list2;
                            ne neVar8 = neVar;
                            cVar2.u = 1;
                            Object a7 = wbVar.a(context3, list2, cVar2);
                            if (a7 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arrayList4 = arrayList3;
                            v4Var2 = a4;
                            ejVar = this;
                            cjVar = q;
                            l5 = l;
                            neVar5 = neVar8;
                            zbVar2 = zbVar4;
                            list3 = a3;
                            obj2 = a7;
                            set2 = b7;
                            ubVar2 = (ub) obj2;
                            if (ubVar2 == null) {
                            }
                        } else {
                            ne neVar9 = neVar;
                            ubVar = (ub) CollectionsKt.first(a6);
                            try {
                                url = new URL(ubVar.d());
                                try {
                                    cVar2.b = this;
                                    cVar2.c = context3;
                                    cVar2.d = gjVar3;
                                    cVar2.e = arrayList;
                                    cVar2.f = arrayList2;
                                    cVar2.g = arrayList3;
                                    cVar2.h = b7;
                                    cVar2.i = a3;
                                    cVar2.j = a4;
                                    cVar2.k = y5Var;
                                    cVar2.l = zbVar;
                                    cVar2.m = q;
                                    neVar2 = neVar9;
                                    try {
                                        cVar2.n = neVar2;
                                        set = b7;
                                        l2 = l;
                                        try {
                                            cVar2.o = l2;
                                            cVar2.p = ubVar;
                                            cVar2.q = url;
                                            cVar2.r = 0;
                                            cVar2.u = 2;
                                            Object b8 = cc.b(url, cVar2);
                                            if (b8 == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            v4Var = a4;
                                            gjVar2 = gjVar3;
                                            neVar4 = neVar2;
                                            ejVar = this;
                                            list = a3;
                                            l4 = l2;
                                            i2 = 0;
                                            obj = b8;
                                            context2 = context;
                                            Context context4 = context2;
                                            int i5 = i2;
                                            ArrayList arrayList7 = arrayList3;
                                            mb.a("Supported codecs for " + ubVar.d() + ": " + CollectionsKt.joinToString$default((List) obj, ", ", null, null, 0, null, null, 62, null), (Throwable) null, 2, (Object) null);
                                            context3 = context4;
                                            i3 = i5;
                                            l6 = l4;
                                            neVar6 = neVar4;
                                            list4 = list;
                                            ubVar2 = ubVar;
                                            zbVar3 = zbVar;
                                            cjVar = q;
                                            gjVar3 = gjVar2;
                                            arrayList4 = arrayList7;
                                            set3 = set;
                                            y5Var2 = y5Var;
                                        } catch (Throwable th) {
                                            th = th;
                                            l3 = l2;
                                            neVar3 = neVar2;
                                            ejVar = this;
                                            ubVar3 = ubVar;
                                            ejVar.z = a(ejVar, zbVar, 0, ubVar3.c(), neVar3, l3, null, 32, null);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        l2 = l;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    l2 = l;
                                    neVar2 = neVar9;
                                }
                            } catch (MalformedURLException e2) {
                                this.z = a(this, zbVar, 0, ubVar.c(), neVar9, l, null, 32, null);
                                String d2 = ubVar.d();
                                String str7 = "Invalid video URL format: " + e2.getMessage();
                                kj kjVar = new kj("Unable to find Linear/MediaFile from URI: " + ubVar.d(), 401);
                                kjVar.initCause(e2);
                                Unit unit2 = Unit.INSTANCE;
                                throw new ChartboostError.Load.InvalidAssetUrl(d2, str7, kjVar);
                            }
                        }
                    } else {
                        String str8 = str3;
                        if (!Intrinsics.areEqual(a5, xb.a.b.f5077a)) {
                            if (!Intrinsics.areEqual(a5, xb.a.C0224a.f5076a)) {
                                if (Intrinsics.areEqual(a5, xb.a.c.f5078a)) {
                                    fj.b("No MediaFile elements found in Linear Ad.", "VASTRenderable no MediaFiles found in VAST Linear creative", 400);
                                    throw new KotlinNothingValueException();
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            int size = arrayList2.size();
                            int d3 = wfVar.d();
                            int b9 = wfVar.b();
                            b3 = fj.b(arrayList2);
                            fj.b("No suitable MediaFile found for Linear Ad.", "VASTRenderable no suitable MediaFile: available=" + size + ", container=" + d3 + str8 + b9 + ", specs=[" + b3 + str2, 405);
                            throw new KotlinNothingValueException();
                        }
                        int size2 = arrayList2.size();
                        b2 = fj.b(arrayList2);
                        fj.b("All MediaFiles are VPAID (application/javascript). VPAID is not supported.", "VASTRenderable all MediaFiles are VPAID: available=" + size2 + ", specs=[" + b2 + str2, 403);
                        throw new KotlinNothingValueException();
                    }
                } else if (i == 1) {
                    List list5 = (List) cVar2.p;
                    Long l7 = (Long) cVar2.o;
                    ne neVar10 = (ne) cVar2.n;
                    cjVar = (cj) cVar2.m;
                    zb zbVar5 = (zb) cVar2.l;
                    y5Var = (y5) cVar2.k;
                    v4 v4Var3 = (v4) cVar2.j;
                    List list6 = (List) cVar2.i;
                    Set set4 = (Set) cVar2.h;
                    ?? r15 = (List) cVar2.g;
                    List list7 = (List) cVar2.f;
                    ?? r0 = (List) cVar2.e;
                    gj gjVar4 = (gj) cVar2.d;
                    context3 = (Context) cVar2.c;
                    ejVar = (ej) cVar2.b;
                    ResultKt.throwOnFailure(obj2);
                    l5 = l7;
                    neVar5 = neVar10;
                    zbVar2 = zbVar5;
                    v4Var2 = v4Var3;
                    list3 = list6;
                    str3 = "x";
                    str2 = U3.j.e;
                    set2 = set4;
                    arrayList = r0;
                    gjVar3 = gjVar4;
                    list2 = list5;
                    str = "\"";
                    arrayList4 = r15;
                    arrayList2 = list7;
                    ubVar2 = (ub) obj2;
                    if (ubVar2 == null) {
                        int coerceAtLeast = RangesKt.coerceAtLeast(list2.indexOf(ubVar2), 0);
                        try {
                            v4Var = v4Var2;
                            list4 = list3;
                            set3 = set2;
                            url = new URL(ubVar2.d());
                            zbVar3 = zbVar2;
                            neVar6 = neVar5;
                            l6 = l5;
                            y5Var2 = y5Var;
                            i3 = coerceAtLeast;
                        } catch (MalformedURLException e3) {
                            throw new ChartboostError.Load.InvalidAssetUrl(ubVar2.d(), "Invalid video URL format", e3);
                        }
                    } else {
                        ejVar.z = a(ejVar, zbVar2, list2.size(), "", neVar5, l5, null, 32, null);
                        throw new ChartboostError.Load.UnsupportedCodec("All " + list2.size() + " media file candidates failed probing", null, 2, null);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i6 = cVar2.r;
                    URL url4 = (URL) cVar2.q;
                    ubVar3 = (ub) cVar2.p;
                    l4 = (Long) cVar2.o;
                    neVar4 = (ne) cVar2.n;
                    cj cjVar2 = (cj) cVar2.m;
                    zb zbVar6 = (zb) cVar2.l;
                    y5Var = (y5) cVar2.k;
                    v4 v4Var4 = (v4) cVar2.j;
                    List list8 = (List) cVar2.i;
                    Set set5 = (Set) cVar2.h;
                    ?? r02 = (List) cVar2.g;
                    List list9 = (List) cVar2.f;
                    ?? r03 = (List) cVar2.e;
                    gjVar2 = (gj) cVar2.d;
                    context2 = (Context) cVar2.c;
                    ejVar = (ej) cVar2.b;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        set = set5;
                        str2 = U3.j.e;
                        v4Var = v4Var4;
                        arrayList2 = list9;
                        q = cjVar2;
                        ubVar = ubVar3;
                        obj = obj2;
                        i2 = i6;
                        url = url4;
                        arrayList3 = r02;
                        str = "\"";
                        list = list8;
                        arrayList = r03;
                        str3 = "x";
                        zbVar = zbVar6;
                    } catch (Throwable th4) {
                        th = th4;
                        l3 = l4;
                        zbVar = zbVar6;
                        neVar3 = neVar4;
                        ejVar.z = a(ejVar, zbVar, 0, ubVar3.c(), neVar3, l3, null, 32, null);
                        throw th;
                    }
                    try {
                        Context context42 = context2;
                        int i52 = i2;
                        ArrayList arrayList72 = arrayList3;
                        mb.a("Supported codecs for " + ubVar.d() + ": " + CollectionsKt.joinToString$default((List) obj, ", ", null, null, 0, null, null, 62, null), (Throwable) null, 2, (Object) null);
                        context3 = context42;
                        i3 = i52;
                        l6 = l4;
                        neVar6 = neVar4;
                        list4 = list;
                        ubVar2 = ubVar;
                        zbVar3 = zbVar;
                        cjVar = q;
                        gjVar3 = gjVar2;
                        arrayList4 = arrayList72;
                        set3 = set;
                        y5Var2 = y5Var;
                    } catch (Throwable th5) {
                        th = th5;
                        l3 = l4;
                        neVar3 = neVar4;
                        ubVar3 = ubVar;
                        ejVar.z = a(ejVar, zbVar, 0, ubVar3.c(), neVar3, l3, null, 32, null);
                        throw th;
                    }
                }
                long b10 = (cjVar == null && cjVar.j()) ? fj.b(cjVar) : -1L;
                ejVar.z = a(ejVar, zbVar3, i3, ubVar2.c(), neVar6, l6, null, 32, null);
                int indexOf = arrayList2.indexOf(ubVar2);
                ejVar.x = (indexOf != -1 || indexOf >= arrayList4.size()) ? null : (bk) arrayList4.get(indexOf);
                q7 q7Var = new q7(y5Var2, new z5(), b10, null, 8, null);
                if (url != null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mediaUrl");
                    url2 = null;
                } else {
                    url2 = url;
                }
                qf A = ejVar.A();
                a0 u = ejVar.u();
                w6 f = b4.b.b().f();
                List<ii> c2 = gjVar3.c();
                ArrayList arrayList8 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c2, 10));
                for (ii iiVar : c2) {
                    arrayList8.add(new ii(iiVar.b(), iiVar.f(), iiVar.d(), iiVar.e(), iiVar.c(), 0L, 32, null));
                }
                bkVar = ejVar.x;
                if (bkVar == null && (b6 = bkVar.b()) != null) {
                    emptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(b6, 10));
                    Iterator it3 = b6.iterator();
                    while (it3.hasNext()) {
                        emptyList.add(new ii("click", (String) it3.next(), 0, null, null, 0L, 56, null));
                    }
                } else {
                    emptyList = CollectionsKt.emptyList();
                }
                Set mutableSet = CollectionsKt.toMutableSet(CollectionsKt.plus((Collection) arrayList8, (Iterable) emptyList));
                ejVar.y = mutableSet;
                bk bkVar2 = ejVar.x;
                kk kkVar = new kk(context3, url2, A, u, f, q7Var, mutableSet, bkVar2 == null ? bkVar2.a() : null, ejVar.p, ejVar.B(), ejVar.q, set3, list4, ejVar.t(), ejVar.z(), ejVar.v);
                kkVar.a((tf) ejVar);
                Unit unit3 = Unit.INSTANCE;
                arrayList.add(kkVar);
                if (v4Var != null) {
                    qj a8 = v4Var.a();
                    if (a8 == null) {
                        List h = v4Var.h();
                        String str9 = h != null ? "static:" + h.size() : null;
                        List e4 = v4Var.e();
                        String str10 = e4 != null ? "html:" + e4.size() : null;
                        List f2 = v4Var.f();
                        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{str9, str10, f2 != null ? "iframe:" + f2.size() : null}), ", ", null, null, 0, null, null, 62, null);
                        if (joinToString$default.length() == 0) {
                            joinToString$default = "none";
                        }
                        mb.e("VASTRenderable companion ad has no usable resource: companionSize=" + v4Var.j() + str3 + v4Var.d() + ", resourceTypes=[" + joinToString$default + str2, null, 2, null);
                    } else {
                        List c3 = gjVar3.c();
                        ArrayList arrayList9 = new ArrayList();
                        for (Object obj3 : c3) {
                            if (Intrinsics.areEqual(((ii) obj3).b(), "error")) {
                                arrayList9.add(obj3);
                            }
                        }
                        List mutableList = CollectionsKt.toMutableList((Collection) ejVar.A().h());
                        for (ii iiVar2 : v4Var.i()) {
                            String f3 = iiVar2.f();
                            if (f3 != null) {
                                String b11 = iiVar2.b();
                                if (b11 == null) {
                                    b11 = "unknown";
                                }
                                mutableList.add(new g7(b11, "GET", f3, "", null));
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        String b12 = ejVar.A().b();
                        String n = ejVar.A().n();
                        Map i7 = ejVar.A().i();
                        long c4 = ejVar.A().c();
                        cj q4 = ejVar.A().q();
                        k5 b13 = q4 != null ? q4.b() : null;
                        cj q5 = ejVar.A().q();
                        s8 l8 = ejVar.A().l();
                        int m = ejVar.A().m();
                        boolean e5 = ejVar.A().e();
                        cj q6 = ejVar.A().q();
                        qf qfVar = new qf(b12, n, i7, c4, b13, mutableList, q5, l8, m, e5, false, q6 != null ? q6.d() : true, null, null, null, null, null, 128000, null);
                        if (a8 instanceof u8) {
                            str4 = ((u8) a8).a();
                        } else if (a8 instanceof b9) {
                            str4 = ((b9) a8).a();
                        } else {
                            if (a8 instanceof eh) {
                                eh ehVar = (eh) a8;
                                str4 = ehVar.b();
                                if (Intrinsics.areEqual("application/x-javascript", ehVar.a()) && str4 != null) {
                                    z = true;
                                }
                            } else {
                                mb.e("Unknown VAST companion resource type encountered: " + a8.getClass().getSimpleName(), null, 2, null);
                                z = false;
                                str4 = null;
                            }
                            if (str4 != null || StringsKt.isBlank(str4)) {
                                mb.e("Companion resource content string is null or blank; skipping.", null, 2, null);
                            } else {
                                if (z) {
                                    pfVar = new gl(context3, StringsKt.trimIndent("\n                    <!DOCTYPE html>\n                    <html style=\"width: 100%; height: 100%; margin: 0; padding: 0;\">\n                    <head>\n                        <meta charset=\"UTF-8\">\n                        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n                        <style>\n                            /* Basic CSS Reset & Full-Screen Setup */\n                            html, body {\n                                width: 100%;\n                                height: 100%;\n                                margin: 0;\n                                padding: 0;\n                                overflow: hidden; /* Prevent unexpected scrollbars */\n                                box-sizing: border-box; /* Use border-box sizing globally */\n                                background-color: transparent; /* Start transparent */\n                            }\n                            /* Ensure all elements inherit border-box */\n                            *, *:before, *:after {\n                                box-sizing: inherit;\n                            }\n                        </style>\n                    </head>\n                    <body style=\"position: relative;\">\n                        <script id=\"vast-companion-script\" src=\"" + str4 + "\" defer crossorigin=\"anonymous\"></script>\n                        </body>\n                    </html>\n                    "), null, rc.d, v4Var, ejVar.s, qfVar, ejVar.u(), ejVar.p, ejVar.B(), ejVar.t(), ejVar.q, ejVar.z(), null, ejVar.t, ejVar.u, arrayList9, null, null, 401412, null);
                                } else {
                                    try {
                                        url3 = new URL(str4);
                                        str5 = str;
                                    } catch (MalformedURLException unused) {
                                        str5 = str;
                                        mb.a("Companion content failed URL parsing. Assuming it's an HTML snippet or invalid. Content: \"" + str4 + str5, (Throwable) null, 2, (Object) null);
                                        url3 = null;
                                    }
                                    if (url3 != null) {
                                        String path = url3.getPath();
                                        if (path != null) {
                                            str6 = path.toLowerCase(Locale.ROOT);
                                            Intrinsics.checkNotNullExpressionValue(str6, "toLowerCase(...)");
                                        }
                                        str6 = "";
                                        if (!StringsKt.endsWith$default(str6, ".png", false, 2, (Object) null) && !StringsKt.endsWith$default(str6, ".jpg", false, 2, (Object) null) && !StringsKt.endsWith$default(str6, ".jpeg", false, 2, (Object) null) && !StringsKt.endsWith$default(str6, ".gif", false, 2, (Object) null) && !StringsKt.endsWith$default(str6, ".webp", false, 2, (Object) null)) {
                                            pfVar = new gl(context3, null, url3, rc.d, v4Var, ejVar.s, qfVar, ejVar.u(), ejVar.p, ejVar.B(), ejVar.t(), ejVar.q, ejVar.z(), null, ejVar.t, ejVar.u, arrayList9, null, null, 401410, null);
                                        } else {
                                            pfVar = new l9(context3, url3, v4Var, qfVar, ejVar.u(), ejVar.r, ejVar.p, ejVar.B(), ejVar.t(), ejVar.z(), ejVar.t, ejVar.u, arrayList9);
                                        }
                                    } else if (new Regex("<\\s*(html|body|div|p|a|img|iframe|script|style)\\b", RegexOption.IGNORE_CASE).containsMatchIn(str4)) {
                                        pfVar = new gl(context3, str4, null, rc.d, v4Var, ejVar.s, qfVar, ejVar.u(), ejVar.p, ejVar.B(), ejVar.t(), ejVar.q, ejVar.z(), null, ejVar.t, ejVar.u, arrayList9, null, null, 401412, null);
                                    } else {
                                        mb.e("Cannot determine renderable type from string content heuristics (Not URL, no common HTML tags found). Skipping content: \"" + str4 + str5, null, 2, null);
                                        pfVar = null;
                                    }
                                }
                                if (pfVar != null) {
                                    pfVar.a(ejVar);
                                    Boxing.boxBoolean(arrayList.add(pfVar));
                                }
                            }
                        }
                        z = false;
                        if (str4 != null) {
                        }
                        mb.e("Companion resource content string is null or blank; skipping.", null, 2, null);
                    }
                    Unit unit5 = Unit.INSTANCE;
                }
                return arrayList;
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj22 = cVar22.s;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar22.u;
        if (i != 0) {
        }
        if (cjVar == null) {
        }
        ejVar.z = a(ejVar, zbVar3, i3, ubVar2.c(), neVar6, l6, null, 32, null);
        int indexOf2 = arrayList2.indexOf(ubVar2);
        ejVar.x = (indexOf2 != -1 || indexOf2 >= arrayList4.size()) ? null : (bk) arrayList4.get(indexOf2);
        q7 q7Var2 = new q7(y5Var2, new z5(), b10, null, 8, null);
        if (url != null) {
        }
        qf A2 = ejVar.A();
        a0 u2 = ejVar.u();
        w6 f4 = b4.b.b().f();
        List<ii> c22 = gjVar3.c();
        ArrayList arrayList82 = new ArrayList(CollectionsKt.collectionSizeOrDefault(c22, 10));
        while (r1.hasNext()) {
        }
        bkVar = ejVar.x;
        if (bkVar == null) {
        }
        emptyList = CollectionsKt.emptyList();
        Set mutableSet2 = CollectionsKt.toMutableSet(CollectionsKt.plus((Collection) arrayList82, (Iterable) emptyList));
        ejVar.y = mutableSet2;
        bk bkVar22 = ejVar.x;
        kk kkVar2 = new kk(context3, url2, A2, u2, f4, q7Var2, mutableSet2, bkVar22 == null ? bkVar22.a() : null, ejVar.p, ejVar.B(), ejVar.q, set3, list4, ejVar.t(), ejVar.z(), ejVar.v);
        kkVar2.a((tf) ejVar);
        Unit unit32 = Unit.INSTANCE;
        arrayList.add(kkVar2);
        if (v4Var != null) {
        }
        return arrayList;
    }

    public final Object a(Throwable th, gj gjVar) {
        Throwable vastError;
        Collection<ii> emptyList;
        List c2;
        Integer b2 = b(th);
        int intValue = b2 != null ? b2.intValue() : DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown VAST error";
        }
        if (th instanceof ChartboostError.Load) {
            vastError = (ChartboostError.Load) th;
        } else {
            vastError = new ChartboostError.Load.VastError(message, th);
        }
        mb.b("VAST processing error (" + intValue + "): " + message, th);
        if (gjVar != null && (c2 = gjVar.c()) != null) {
            emptyList = new ArrayList();
            for (Object obj : c2) {
                if (Intrinsics.areEqual(((ii) obj).b(), "error")) {
                    emptyList.add(obj);
                }
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        if (!emptyList.isEmpty()) {
            for (ii iiVar : emptyList) {
                if (!iiVar.c().containsKey("VAST_ERROR_CODE")) {
                    iiVar = ii.a(iiVar, null, null, 0, null, MapsKt.plus(iiVar.c(), TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(intValue))), 0L, 47, null);
                }
                dj.f4736a.a(rj.h.b, new sj(null, iiVar, this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
            }
        } else {
            a(intValue);
            mb.e("VAST error " + intValue + " (" + message + ") occurred, but no <Error> tracking URLs found in VAST.", null, 2, null);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8079constructorimpl(ResultKt.createFailure(vastError));
    }

    public final void a(int i) {
        dj.f4736a.a(rj.h.b, new sj(null, new ii("error", null, 0, null, MapsKt.mapOf(TuplesKt.to("VAST_ERROR_CODE", Integer.valueOf(i))), 0L, 40, null), this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
    }

    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        mb.a("Firing " + list.size() + " accumulated VAST parse error event(s)", (Throwable) null, 2, (Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dj.f4736a.a(rj.h.b, new sj(null, (ii) it.next(), this.n, this.t, this.u, null, null, null, null, null, null, null, null, null, 16353, null));
        }
    }

    private final void a(rj rjVar, ii iiVar) {
        j2 j2Var;
        URL V;
        List A;
        Object obj;
        hd hdVar = this.w;
        if (hdVar == null || (A = hdVar.A()) == null) {
            j2Var = null;
        } else {
            Iterator it = A.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((j2) obj) instanceof kk) {
                        break;
                    }
                }
            }
            j2Var = (j2) obj;
        }
        kk kkVar = j2Var instanceof kk ? (kk) j2Var : null;
        dj djVar = dj.f4736a;
        Context context = this.n;
        ae aeVar = this.t;
        u2 u2Var = this.u;
        Boolean valueOf = kkVar != null ? Boolean.valueOf(kkVar.P()) : null;
        u t = t();
        k5 d2 = A().d();
        djVar.a(rjVar, new sj(null, iiVar, context, aeVar, u2Var, valueOf, t, null, null, kkVar != null ? Long.valueOf(kkVar.T()) : null, d2 != null ? Long.valueOf(d2.b()) : null, kkVar != null ? kkVar.S() : null, (kkVar == null || (V = kkVar.V()) == null) ? null : V.toString(), kkVar != null ? Long.valueOf(kkVar.O()) : null, 385, null));
    }

    private final void a(rj rjVar) {
        Iterator it = b(rjVar.a()).iterator();
        while (it.hasNext()) {
            a(rjVar, (ii) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.pf
    public void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        hd hdVar = this.w;
        if (hdVar != null) {
            hdVar.a(context);
        }
    }
}
