package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.tracking.g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b2 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final v6 f4687a;
    public final ph b;
    public final lk c;
    public c0 d;
    public final Mediation e;

    public b2(v6 downloader, ph timeSource, lk videoRepository, c0 adType, Mediation mediation) {
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f4687a = downloader;
        this.b = timeSource;
        this.c = videoRepository;
        this.d = adType;
        this.e = mediation;
    }

    @Override // com.chartboost.sdk.impl.a2
    public void a(final p1 appRequest, String adTypeTraitsName, final w1 assetDownloadedCallback, final i0 adUnitLoaderCallback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(assetDownloadedCallback, "assetDownloadedCallback");
        Intrinsics.checkNotNullParameter(adUnitLoaderCallback, "adUnitLoaderCallback");
        final d0 a2 = appRequest.a();
        if (a2 == null) {
            return;
        }
        u1 u1Var = new u1() { // from class: com.chartboost.sdk.impl.b2$$ExternalSyntheticLambda0
            @Override // com.chartboost.sdk.impl.u1
            public final void a(boolean z) {
                b2.a(b2.this, appRequest, a2, adUnitLoaderCallback, assetDownloadedCallback, z);
            }
        };
        this.f4687a.c();
        this.f4687a.a(ue.e, a2.d(), new AtomicInteger(), (u1) i8.a().a(u1Var), adTypeTraitsName);
    }

    public static final void a(b2 b2Var, p1 p1Var, d0 d0Var, i0 i0Var, w1 w1Var, boolean z) {
        x1 x1Var;
        if (z) {
            x1Var = b2Var.a(p1Var, d0Var, i0Var);
        } else if (!z) {
            x1Var = x1.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        w1Var.a(p1Var, x1Var);
    }

    public final x1 a(p1 p1Var, d0 d0Var, i0 i0Var) {
        i0Var.a(p1Var, g.a.e);
        if (d0Var.D()) {
            if (!this.c.b(d0Var.B())) {
                this.c.a(d0Var.C(), d0Var.B(), false, null);
            }
            return x1.d;
        }
        return x1.c;
    }
}
