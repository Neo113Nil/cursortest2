package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.l2;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final k f11905a;
    public final com.vungle.ads.internal.model.b b;
    public final com.vungle.ads.internal.util.s c;
    public final int d;
    public final AtomicBoolean e;
    public final AtomicInteger f;
    public final List g;
    public l2 h;
    public l2 i;

    public /* synthetic */ l(k kVar, com.vungle.ads.internal.model.b bVar) {
        this(kVar, bVar, null, 3);
    }

    public final com.vungle.ads.internal.model.b a() {
        return this.b;
    }

    public final int b() {
        return this.f.get();
    }

    public final com.vungle.ads.internal.util.s c() {
        return this.c;
    }

    public final List d() {
        List retryReasons = this.g;
        Intrinsics.checkNotNullExpressionValue(retryReasons, "retryReasons");
        return CollectionsKt.toList(retryReasons);
    }

    public final boolean e() {
        return this.e.get();
    }

    public final void f() {
        if (this.i != null) {
            return;
        }
        l2 l2Var = new l2(Sdk.SDKMetric.SDKMetricType.ASSET_PARTIAL_DOWNLOAD_DURATION_MS);
        this.i = l2Var;
        l2Var.e();
    }

    public final void g() {
        l2 l2Var = new l2(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.h = l2Var;
        l2Var.e();
    }

    public final void h() {
        l2 l2Var = this.i;
        if (l2Var != null) {
            l2Var.d();
            AnalyticsClient.INSTANCE.a(l2Var, this.c, com.iab.omid.library.vungle.internal.l.a("percentage=").append(this.b.e).append(" url=").append(this.b.b).toString());
        }
    }

    public final void i() {
        l2 l2Var = this.h;
        if (l2Var != null) {
            l2Var.d();
            AnalyticsClient.INSTANCE.a(l2Var, this.c, this.b.b);
        }
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("DownloadRequest{priority=").append(this.f11905a).append(", url='").append(this.b.b).append("', path='").append(this.b.c).append("', cancelled=").append(this.e).append(", retryAttempt=").append(this.f.get()).append(", maxRetries=").append(this.d).append(", logEntry=").append(this.c).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public l(k priority, com.vungle.ads.internal.model.b asset, com.vungle.ads.internal.util.s sVar, int i) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f11905a = priority;
        this.b = asset;
        this.c = sVar;
        this.d = i;
        this.e = new AtomicBoolean(false);
        this.f = new AtomicInteger(0);
        this.g = Collections.synchronizedList(new ArrayList());
    }

    public final void a(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.g.add(reason);
    }
}
