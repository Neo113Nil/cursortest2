package io.sentry.android.core;

import A1.C0046u;
import A1.K;
import A1.N;
import android.content.res.Configuration;
import com.google.android.gms.common.internal.w;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14396d;

    public /* synthetic */ m(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f14393a = 0;
        this.f14395c = appComponentsBreadcrumbsIntegration;
        this.f14394b = j;
        this.f14396d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f14396d;
        long j = this.f14394b;
        Object obj2 = this.f14395c;
        switch (this.f14393a) {
            case 0:
                ((AppComponentsBreadcrumbsIntegration) obj2).lambda$onConfigurationChanged$0(j, (Configuration) obj);
                break;
            case 1:
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2((BufferCaptureStrategy) obj2, (Function2) obj, j);
                break;
            default:
                w wVar = (w) obj2;
                wVar.getClass();
                int i7 = v2.t.f17153a;
                N n2 = ((K) wVar.f11336c).f109a;
                B1.h hVar = n2.f169q;
                B1.a M7 = hVar.M();
                hVar.N(M7, 26, new B1.e(M7, obj, j));
                if (n2.f139N == obj) {
                    n2.f164l.k(26, new C0046u(4));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, long j, int i7) {
        this.f14393a = i7;
        this.f14395c = obj;
        this.f14396d = obj2;
        this.f14394b = j;
    }
}
