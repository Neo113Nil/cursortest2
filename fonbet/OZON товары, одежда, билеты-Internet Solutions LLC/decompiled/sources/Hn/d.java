package Hn;

import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;
import io.sentry.util.m;
import kotlin.jvm.functions.Function1;
import qc.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements g, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11220b;

    public /* synthetic */ d(m mVar, ILogger iLogger) {
        this.f11219a = 2;
        this.f11220b = iLogger;
    }

    @Override // qc.g
    public void accept(Object obj) {
        ((Function1) this.f11220b).invoke(obj);
    }

    @Override // io.sentry.util.l.a
    public Object g() {
        switch (this.f11219a) {
            case 1:
                return ((SentryAndroidOptions) this.f11220b).getExecutorService();
            default:
                return Boolean.valueOf(m.b("androidx.core.app.FrameMetricsAggregator", (ILogger) this.f11220b));
        }
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f11219a = i11;
        this.f11220b = obj;
    }
}
