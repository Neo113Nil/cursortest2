package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.h;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.publisher.A;
import com.moloco.sdk.internal.publisher.C;
import com.moloco.sdk.internal.publisher.C4796k;
import com.moloco.sdk.internal.publisher.nativead.model.b;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class d {
    public static final int l = 8;

    /* renamed from: a, reason: collision with root package name */
    public final String f10648a;
    public final C4782e b;
    public final com.moloco.sdk.internal.publisher.nativead.model.b c;
    public final InterfaceC4805f d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final AdFormatType f;
    public final i g;
    public final r h;
    public final MetricsRecorder i;
    public final A j;
    public final a k;

    public d(String adUnitId, C4782e bid, com.moloco.sdk.internal.publisher.nativead.model.b ortbResponse, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, AdFormatType adFormatType, i persistentHttpRequest, r externalLinkHandler, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10648a = adUnitId;
        this.b = bid;
        this.c = ortbResponse;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = adFormatType;
        this.g = persistentHttpRequest;
        this.h = externalLinkHandler;
        this.i = metricsRecorder;
        this.j = a();
        this.k = b();
    }

    public final A a() {
        A a2;
        final C4782e c4782e = this.b;
        a2 = C.a(null, this.d, this.e, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.a(C4782e.this);
            }
        }, new Function0() { // from class: com.moloco.sdk.internal.publisher.nativead.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.a(d.this);
            }
        }, (r24 & 32) != 0 ? com.moloco.sdk.internal.A.b() : null, (r24 & 64) != 0 ? h.a() : null, this.f, r9, (r24 & 512) != 0 ? new com.moloco.sdk.internal.client_metrics_data.a(this.i) : null, (r24 & 1024) != 0 ? null : null);
        return a2;
    }

    public final a b() {
        com.moloco.sdk.internal.publisher.nativead.model.b bVar = this.c;
        return new a(bVar.c(), bVar.b(), this.g);
    }

    public final void c() {
        b.c d = this.c.d();
        if (d != null) {
            this.k.a(d.a());
            this.h.a(d.c());
        }
        this.j.onAdClicked(MolocoAdKt.createAdInfo$default(this.f10648a, null, null, 6, null));
    }

    public final void d() {
        this.k.a();
        A.a.a(this.j, MolocoAdKt.createAdInfo$default(this.f10648a, null, null, 6, null), null, 2, null);
    }

    public static final D a(C4782e c4782e) {
        return c4782e.getExt().getSdkEvents();
    }

    public static final C4796k a(d dVar) {
        String str = dVar.b.getCom.ironsource.o2.y java.lang.String();
        if (str != null) {
            return new C4796k(str, Float.valueOf(dVar.b.getPrice()));
        }
        return null;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f10649a;
        public List<b.C1493b> b;
        public final i c;
        public final Set<String> d;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.d$a$a, reason: collision with other inner class name */
        public static final class C1490a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1490a f10650a = new C1490a();
            public static final int b = 1;
            public static final int c = 0;
        }

        public static final class b {

            /* renamed from: a, reason: collision with root package name */
            public static final b f10651a = new b();
            public static final int b = 1;
            public static final int c = 0;
        }

        public a(List<String> list, List<b.C1493b> list2, i persistentHttpRequest) {
            Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
            this.f10649a = list;
            this.b = list2;
            this.c = persistentHttpRequest;
            this.d = new LinkedHashSet();
        }

        public final void a() {
            List<String> list = this.f10649a;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    this.c.a((String) it.next());
                }
            }
            this.f10649a = null;
            List<b.C1493b> list2 = this.b;
            if (list2 != null) {
                for (b.C1493b c1493b : list2) {
                    if (c1493b.c() != null && c1493b.a() == 1 && c1493b.b() == 1) {
                        this.c.a(c1493b.c());
                    }
                }
            }
            this.b = null;
        }

        public final void a(List<String> urls) {
            Intrinsics.checkNotNullParameter(urls, "urls");
            for (String str : urls) {
                if (!this.d.contains(str)) {
                    this.c.a(str);
                    this.d.add(str);
                }
            }
        }
    }
}
