package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.chartboost.sdk.impl.nb;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class ic implements vc {

    /* renamed from: a, reason: collision with root package name */
    public Context f4808a;
    public final WebView b;
    public final rc c;
    public final tc d;
    public final uc e;
    public final zc f;
    public wc g;
    public bd h;
    public Boolean i;
    public qc j;
    public Float k;
    public final Rect l;
    public final Runnable m;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4809a;

        static {
            int[] iArr = new int[yc.values().length];
            try {
                iArr[yc.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yc.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yc.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4809a = iArr;
        }
    }

    public ic(Context context, WebView webView, rc placementType, tc orientationProvider, uc volumeProvider, zc synchronizerTask) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(orientationProvider, "orientationProvider");
        Intrinsics.checkNotNullParameter(volumeProvider, "volumeProvider");
        Intrinsics.checkNotNullParameter(synchronizerTask, "synchronizerTask");
        this.f4808a = context;
        this.b = webView;
        this.c = placementType;
        this.d = orientationProvider;
        this.e = volumeProvider;
        this.f = synchronizerTask;
        this.h = new bd(context);
        this.l = new Rect();
        Runnable runnable = new Runnable() { // from class: com.chartboost.sdk.impl.ic$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ic.a(ic.this);
            }
        };
        this.m = runnable;
        synchronizerTask.a(runnable);
    }

    @Override // com.chartboost.sdk.impl.vc
    public void a(wc wcVar) {
        this.g = wcVar;
    }

    public wc b() {
        return this.g;
    }

    public final boolean c() {
        wc b = b();
        if (b == null) {
            return false;
        }
        b.a(ll.b);
        return true;
    }

    public final void d() {
        if (this.h.a().a()) {
            a(nb.b.b(this.h));
        }
        if (this.h.b().a()) {
            a(nb.b.c(this.h));
        }
        if (this.h.c().a()) {
            nb.a aVar = nb.b;
            a(aVar.d(this.h));
            a(aVar.a(this.h));
        }
        if (this.h.d().a()) {
            a(nb.b.e(this.h));
        }
    }

    public final void e() {
        nb.a aVar = nb.b;
        a(aVar.b());
        a(aVar.b("9.13.0"));
        a(aVar.a(this.c));
        a(aVar.a(sc.c));
        f();
        a(aVar.a());
        this.f.start();
    }

    public final void f() {
        qc a2 = this.d.a();
        if (a2 != null && a2 != this.j) {
            this.j = a2;
            a(nb.b.a(a2, this.d.isLocked()));
        }
        this.h.a(this.b);
        d();
        Float a3 = this.e.a();
        if (!Intrinsics.areEqual(a3, this.k)) {
            this.k = a3;
            a(nb.b.a(a3));
        }
        boolean a4 = a(this.b);
        if (Intrinsics.areEqual(Boolean.valueOf(a4), this.i)) {
            return;
        }
        this.i = Boolean.valueOf(a4);
        a(nb.b.a(a4));
    }

    @Override // com.chartboost.sdk.impl.vc
    public void pause() {
        this.f.pause();
    }

    @Override // com.chartboost.sdk.impl.vc
    public void start() {
        e();
    }

    public static final void a(ic icVar) {
        icVar.f();
    }

    public final boolean b(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        wc b = b();
        if (b == null) {
            return false;
        }
        Map c = c(uri);
        String str = (String) c.get("forceOrientation");
        if (str == null) {
            return false;
        }
        String str2 = (String) c.get("allowOrientationChange");
        b.b(Intrinsics.areEqual(str, U3.i.C) ? ke.d : Intrinsics.areEqual(str, U3.i.D) ? ke.e : str2 != null ? Boolean.parseBoolean(str2) : true ? ke.b : ke.c);
        a(nb.b.a(yc.e));
        return true;
    }

    @Override // com.chartboost.sdk.impl.vc
    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f.cancel();
    }

    public final Map c(Uri uri) {
        List split$default;
        String query = uri.getQuery();
        if (query != null && (split$default = StringsKt.split$default((CharSequence) query, new String[]{U3.j.c}, false, 0, 6, (Object) null)) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(split$default, 10)), 16));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                List split$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{U3.j.b}, false, 2, 2, (Object) null);
                Pair pair = TuplesKt.to((String) split$default2.get(0), split$default2.size() > 1 ? (String) split$default2.get(1) : "");
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }
        return MapsKt.emptyMap();
    }

    @Override // com.chartboost.sdk.impl.vc
    public void a() {
        this.f.a();
    }

    public final boolean a(View view) {
        if (view == null || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(this.l)) {
            return false;
        }
        long height = this.l.height() * this.l.width();
        if (view.getHeight() * view.getWidth() > 0 && height > 0) {
            return view.isShown();
        }
        return false;
    }

    public /* synthetic */ ic(Context context, WebView webView, rc rcVar, tc tcVar, uc ucVar, zc zcVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, webView, rcVar, (i & 8) != 0 ? new hc(context) : tcVar, (i & 16) != 0 ? new jc(context) : ucVar, (i & 32) != 0 ? new ad(null, 0L, null, 7, null) : zcVar);
    }

    @Override // com.chartboost.sdk.impl.vc
    public boolean a(WebResourceRequest request, boolean z, boolean z2) {
        String str;
        Object m8079constructorimpl;
        Uri parse;
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        String scheme = url.getScheme();
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != -1368728362) {
                if (hashCode == 104156535 && scheme.equals(CampaignEx.JSON_KEY_MRAID)) {
                    Intrinsics.checkNotNull(url);
                    return a(url, z2);
                }
            } else if (scheme.equals("cb-log")) {
                String uri = url.toString();
                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                mb.c(uri, null, 2, null);
                return true;
            }
        }
        if (!z2) {
            mb.e("WebView navigation suppressed: no user gesture. uri=" + url, null, 2, null);
            return true;
        }
        if (z) {
            return false;
        }
        String scheme2 = url.getScheme();
        if (scheme2 != null) {
            str = scheme2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        String host = url.getHost();
        try {
            Result.Companion companion = Result.INSTANCE;
            String url2 = this.b.getUrl();
            m8079constructorimpl = Result.m8079constructorimpl((url2 == null || (parse = Uri.parse(url2)) == null) ? null : parse.getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8085isFailureimpl(m8079constructorimpl)) {
            m8079constructorimpl = null;
        }
        String str2 = (String) m8079constructorimpl;
        if (fl.a(str, host, str2)) {
            mb.a("WebView click: ignoring '" + url + "' — no valid clickthrough target (scheme=" + str + ", clickHost=" + host + ", pageHost=" + str2 + ").", (Throwable) null, 2, (Object) null);
            return true;
        }
        wc b = b();
        if (b != null) {
            b.a(url.toString(), jl.c, z2);
        }
        return true;
    }

    public final void a(nb nbVar) {
        mb.a("MRAID command: " + nbVar.a(), (Throwable) null, 2, (Object) null);
        this.b.loadUrl("javascript:" + nbVar.a());
    }

    public final boolean a(Uri uri, boolean z) {
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        try {
            int i = a.f4809a[yc.c.a(host).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return b(uri);
                }
                if (i == 3) {
                    return c();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                return a(uri);
            }
            mb.e("MRAID open command was not preceded with a recognized gesture.", null, 2, null);
            a(nb.b.a(yc.d));
            return true;
        } catch (IllegalArgumentException e) {
            mb.e("Invalid MRAID command: " + host, e);
            return true;
        }
    }

    public final boolean a(Uri uri) {
        String str = (String) c(uri).get("url");
        if (str == null) {
            return false;
        }
        wc b = b();
        if (b != null) {
            b.a(str, jl.b, true);
        }
        a(nb.b.a(yc.d));
        return true;
    }
}
