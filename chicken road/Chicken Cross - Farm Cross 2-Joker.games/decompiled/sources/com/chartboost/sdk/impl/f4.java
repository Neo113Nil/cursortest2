package com.chartboost.sdk.impl;

import android.os.SystemClock;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.e4;
import com.chartboost.sdk.impl.g7;
import com.chartboost.sdk.impl.l4;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public final qf f4764a;
    public final a0 b;
    public final kh c;
    public final Mediation d;
    public boolean e;
    public boolean f;
    public final boolean g;
    public volatile Long h;
    public final Map i;
    public final Lazy j;

    public f4(qf renderableConfig, a0 adMarkupConfig, kh telemetryManager, Mediation mediation) {
        Intrinsics.checkNotNullParameter(renderableConfig, "renderableConfig");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        Intrinsics.checkNotNullParameter(telemetryManager, "telemetryManager");
        this.f4764a = renderableConfig;
        this.b = adMarkupConfig;
        this.c = telemetryManager;
        this.d = mediation;
        this.g = renderableConfig.e();
        this.i = new ConcurrentHashMap();
        this.j = LazyKt.lazy(new Function0() { // from class: com.chartboost.sdk.impl.f4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f4.a(f4.this);
            }
        });
    }

    public static final List a(f4 f4Var) {
        return CollectionsKt.distinct(f4Var.a(g7.b.f));
    }

    public final List b() {
        return (List) this.j.getValue();
    }

    public final boolean a(e4 clickContext, boolean z, String clickId) {
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        boolean z2 = false;
        if (!z) {
            mb.a("Click ignored due to lack of user gesture. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            a(clickContext, "Clickthrough has failed.", "CB_509", "CB_RENDER_CLICK_IGNORED_NO_GESTURE", "Click ignored due to no matching user gesture recognized. Click already tracked for this ad: " + (this.h != null) + ".");
            return false;
        }
        boolean z3 = clickContext instanceof e4.c;
        boolean z4 = z3 ? this.f : this.e;
        boolean z5 = this.g;
        if (z5 && z4) {
            z2 = true;
        }
        if (z2) {
            mb.a("Click deduplicated. Event: " + clickContext, (Throwable) null, 2, (Object) null);
            a(clickContext, "Clickthrough has failed.", "CB_510", "CB_RENDER_CLICK_IGNORED_BUSY", "Click ignored due to SDK being busy. Click already tracked for this ad: " + z4 + ".");
        } else {
            mb.a("Handling click tracking. Event: " + clickContext + ", Dedupe: " + z5 + ", FirstTracked: " + z4, (Throwable) null, 2, (Object) null);
            List a2 = a(clickContext.b());
            List h = this.f4764a.h();
            g7.b bVar = g7.b.c;
            List distinct = CollectionsKt.distinct(CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) a2, (Iterable) a(h, bVar)), (Iterable) a(this.b.e(), bVar)));
            if (!distinct.isEmpty()) {
                q4 c = clickContext.c();
                kh.a(this.c, new g4(this.b.c(), CollectionsKt.emptyList(), c, clickContext.a(), this.f4764a.g(), this.f4764a.f(), null, null, null, null, null, this.d, 1984, null), distinct, (g7.b) null, b(), 4, (Object) null);
                mb.a("Submitted " + distinct.size() + " unique click trackers for clickType: " + c.b() + ".", (Throwable) null, 2, (Object) null);
                long uptimeMillis = SystemClock.uptimeMillis();
                this.i.put(clickId, Long.valueOf(uptimeMillis));
                if (this.h == null) {
                    this.h = Long.valueOf(uptimeMillis);
                }
            }
            if (this.g) {
                if (z3) {
                    this.f = true;
                } else {
                    this.e = true;
                }
                mb.a("First " + (z3 ? "companion" : "video") + " click tracked. Subsequent clicks of the same type will be deduplicated.", (Throwable) null, 2, (Object) null);
            }
        }
        return !z2;
    }

    public final void a(e4 clickContext, String str, String str2, String str3, String str4) {
        long j;
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        List a2 = a();
        if (a2.isEmpty()) {
            mb.a("No click_error trackers configured. Skipping click_error event.", (Throwable) null, 2, (Object) null);
            return;
        }
        Long l = this.h;
        if (l != null) {
            j = SystemClock.uptimeMillis() - l.longValue();
        } else {
            j = -1;
        }
        g4 g4Var = new g4(this.b.c(), CollectionsKt.emptyList(), clickContext.c(), clickContext.a(), this.f4764a.g(), this.f4764a.f(), str, str2, str3, str4, Long.valueOf(j), this.d);
        List distinct = CollectionsKt.distinct(a2);
        kh.a(this.c, g4Var, distinct, (g7.b) null, b(), 4, (Object) null);
        mb.a("Submitted " + distinct.size() + " unique click_error trackers. Latency: " + j + " ms.", (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e4 clickContext, l4 clickResult, String clickId) {
        String str;
        String a2;
        l4.d c;
        String str2;
        l4.c b;
        String b2;
        Intrinsics.checkNotNullParameter(clickContext, "clickContext");
        Intrinsics.checkNotNullParameter(clickResult, "clickResult");
        Intrinsics.checkNotNullParameter(clickId, "clickId");
        List a3 = a(g7.b.e);
        if (a3.isEmpty()) {
            mb.a("No click_result trackers configured. Skipping click_result event.", (Throwable) null, 2, (Object) null);
            return;
        }
        Long l = (Long) this.i.get(clickId);
        long uptimeMillis = l != null ? SystemClock.uptimeMillis() - l.longValue() : -1L;
        q4 c2 = clickContext.c();
        String str3 = "Click already tracked for this ad: " + (this.h != null) + ".";
        l4.b a4 = clickResult.a();
        String c3 = a4 != null ? a4.c() : null;
        if (Intrinsics.areEqual(c3, "CB_RENDER_CLICK_IGNORED_BUSY")) {
            str3 = "Click ignored due to SDK being busy. " + str3;
            String a5 = clickResult.a().a();
            if (a5 != null && !StringsKt.isBlank(a5)) {
                str3 = str3 + " [path: " + a5 + U3.j.e;
            }
        } else if (Intrinsics.areEqual(c3, "CB_RENDER_INVALID_CLICKTHROUGH_URL")) {
            if (!clickResult.a().e() && (a2 = clickResult.a().a()) != null && !StringsKt.isBlank(a2)) {
                str3 = a2 + ServerSentEventKt.SPACE + str3;
            }
        } else {
            l4.b a6 = clickResult.a();
            if (a6 == null) {
                str = null;
                String c4 = this.b.c();
                List emptyList = CollectionsKt.emptyList();
                String a7 = clickContext.a();
                String g = this.f4764a.g();
                String f = this.f4764a.f();
                l4.d c5 = clickResult.c();
                l4.c b3 = clickResult.b();
                l4.b a8 = clickResult.a();
                String d = a8 == null ? a8.d() : null;
                l4.b a9 = clickResult.a();
                String b4 = a9 == null ? a9.b() : null;
                l4.b a10 = clickResult.a();
                m4 m4Var = new m4(c4, emptyList, c2, a7, g, f, c5, b3, d, b4, a10 == null ? a10.c() : null, str, Long.valueOf(uptimeMillis), this.d);
                List distinct = CollectionsKt.distinct(a3);
                kh.a(this.c, m4Var, distinct, (g7.b) null, b(), 4, (Object) null);
                int size = distinct.size();
                c = clickResult.c();
                str2 = "";
                if (c != null || (r2 = c.b()) == null) {
                    String str4 = "";
                }
                b = clickResult.b();
                if (b != null && (b2 = b.b()) != null) {
                    str2 = b2;
                }
                mb.a("Submitted " + size + " unique click_result trackers. source=" + str4 + ", method=" + str2 + ", error=" + (clickResult.a() != null) + ", latency=" + uptimeMillis + " ms.", (Throwable) null, 2, (Object) null);
            }
            str3 = a6.a();
        }
        str = str3;
        String c42 = this.b.c();
        List emptyList2 = CollectionsKt.emptyList();
        String a72 = clickContext.a();
        String g2 = this.f4764a.g();
        String f2 = this.f4764a.f();
        l4.d c52 = clickResult.c();
        l4.c b32 = clickResult.b();
        l4.b a82 = clickResult.a();
        if (a82 == null) {
        }
        l4.b a92 = clickResult.a();
        if (a92 == null) {
        }
        l4.b a102 = clickResult.a();
        m4 m4Var2 = new m4(c42, emptyList2, c2, a72, g2, f2, c52, b32, d, b4, a102 == null ? a102.c() : null, str, Long.valueOf(uptimeMillis), this.d);
        List distinct2 = CollectionsKt.distinct(a3);
        kh.a(this.c, m4Var2, distinct2, (g7.b) null, b(), 4, (Object) null);
        int size2 = distinct2.size();
        c = clickResult.c();
        str2 = "";
        if (c != null) {
        }
        String str42 = "";
        b = clickResult.b();
        if (b != null) {
            str2 = b2;
        }
        mb.a("Submitted " + size2 + " unique click_result trackers. source=" + str42 + ", method=" + str2 + ", error=" + (clickResult.a() != null) + ", latency=" + uptimeMillis + " ms.", (Throwable) null, 2, (Object) null);
    }

    public final List a() {
        return a(g7.b.d);
    }

    public final List a(g7.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a(this.f4764a.h(), bVar));
        arrayList.addAll(a(this.b.e(), bVar));
        return arrayList;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xh((String) it.next(), "GET", null, null));
        }
        return arrayList;
    }

    public final List a(List list, g7.b bVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (Intrinsics.areEqual(((g7) obj).d(), bVar.b())) {
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
            String e = g7Var.e();
            String upperCase = g7Var.c().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String a2 = g7Var.a();
            if (a2 == null || StringsKt.isBlank(a2)) {
                a2 = null;
            }
            arrayList2.add(new xh(e, upperCase, a2, g7Var.b()));
        }
        return arrayList2;
    }
}
