package io.sentry.android.core;

import A1.C0046u;
import A1.K;
import A1.N;
import android.content.res.Configuration;
import com.google.android.gms.common.internal.w;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14402d;

    public /* synthetic */ m(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f14399a = 0;
        this.f14401c = appComponentsBreadcrumbsIntegration;
        this.f14400b = j;
        this.f14402d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f14402d;
        long j = this.f14400b;
        Object obj2 = this.f14401c;
        switch (this.f14399a) {
            case 0:
                ((AppComponentsBreadcrumbsIntegration) obj2).lambda$onConfigurationChanged$0(j, (Configuration) obj);
                break;
            case 1:
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2((BufferCaptureStrategy) obj2, (Function2) obj, j);
                break;
            default:
                w wVar = (w) obj2;
                wVar.getClass();
                int i7 = p151v2.t.f17159a;
                N n2 = ((K) wVar.f11336c).f109a;
                B1.h hVar = n2.f169q;
                B1.a aVarM = hVar.M();
                hVar.N(aVarM, 26, new B1.e(aVarM, obj, j));
                if (n2.f139N == obj) {
                    n2.f164l.k(26, new C0046u(4));
                }
                break;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, long j, int i7) {
        this.f14399a = i7;
        this.f14401c = obj;
        this.f14402d = obj2;
        this.f14400b = j;
    }
}
