package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import e2.AbstractC0293h;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731oi implements Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8005a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f8006b;

    /* renamed from: c, reason: collision with root package name */
    public final Bi f8007c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f8008d;

    /* renamed from: e, reason: collision with root package name */
    public final Sl f8009e;
    public final C1008zc f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f8010g;

    /* renamed from: h, reason: collision with root package name */
    public final Gn f8011h;

    /* renamed from: i, reason: collision with root package name */
    public final List f8012i;

    /* renamed from: j, reason: collision with root package name */
    public C0725oc f8013j;

    /* renamed from: k, reason: collision with root package name */
    public C0822s6 f8014k;

    public C0731oi(Context context, Gf gf, Bi bi, Handler handler, Sl sl) {
        this.f8005a = context;
        this.f8006b = gf;
        this.f8007c = bi;
        this.f8008d = handler;
        this.f8009e = sl;
        this.f = new C1008zc(context, gf, bi, sl);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f8010g = linkedHashMap;
        this.f8011h = new Gn(new C0783qi(linkedHashMap));
        this.f8012i = AbstractC0293h.S("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Za, io.appmetrica.analytics.impl.InterfaceC0362ab
    public final Za a() {
        return this;
    }

    public final C0731oi b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C0725oc b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0635l0 c0635l0) {
        C0725oc c0725oc;
        try {
            c0725oc = this.f8013j;
            if (c0725oc != null) {
                C1008zc c1008zc = this.f;
                c1008zc.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1008zc.f.f6383b.applyFromAnonymousConfig(appMetricaConfig);
            } else {
                this.f8011h.a(appMetricaConfig.apiKey);
                C1008zc c1008zc2 = this.f;
                c1008zc2.getClass();
                publicLogger.info("Update anonymous config with value " + appMetricaConfig.toJson(), new Object[0]);
                c1008zc2.f.f6383b.applyFromAnonymousConfig(appMetricaConfig);
                c0725oc = new C0725oc(this.f);
                c0725oc.f6448i = new C0905vb(this.f8008d, c0725oc);
                Sl sl = this.f8009e;
                Kh kh = c0725oc.f6442b;
                if (sl != null) {
                    kh.f6383b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0725oc.a(appMetricaConfig, c0635l0);
                c0725oc.k();
                this.f8007c.f.f7163c = new C0705ni(c0725oc);
                this.f8010g.put(appMetricaConfig.apiKey, c0725oc);
                this.f8013j = c0725oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0725oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C0725oc a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0635l0 c0635l0) {
        C0725oc c0725oc;
        try {
            c0725oc = this.f8013j;
            if (c0725oc != null) {
                this.f.a(appMetricaConfig, publicLogger);
                c0725oc.a(appMetricaConfig, c0635l0);
                C0587j4.l().getClass();
                this.f8010g.put(appMetricaConfig.apiKey, c0725oc);
            } else {
                this.f8011h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                c0725oc = new C0725oc(this.f);
                c0725oc.f6448i = new C0905vb(this.f8008d, c0725oc);
                Sl sl = this.f8009e;
                Kh kh = c0725oc.f6442b;
                if (sl != null) {
                    kh.f6383b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                c0725oc.a(appMetricaConfig, c0635l0);
                c0725oc.k();
                this.f8007c.f.f7163c = new C0705ni(c0725oc);
                this.f8010g.put(appMetricaConfig.apiKey, c0725oc);
                C0587j4.l().getClass();
                this.f8013j = c0725oc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0725oc;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.f8010g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey));
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info("AppMetrica", "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized Ya b(ReporterConfig reporterConfig) {
        Ya ya;
        try {
            Ya ya2 = (Ya) this.f8010g.get(reporterConfig.apiKey);
            ya = ya2;
            if (ya2 == null) {
                if (!this.f8012i.contains(reporterConfig.apiKey)) {
                    this.f8009e.i();
                }
                Context context = this.f8005a;
                Fc fc = new Fc(context, this.f8006b, reporterConfig, this.f8007c, new T9(context));
                fc.f6448i = new C0905vb(this.f8008d, fc);
                Sl sl = this.f8009e;
                Kh kh = fc.f6442b;
                if (sl != null) {
                    kh.f6383b.setUuid(sl.g());
                } else {
                    kh.getClass();
                }
                fc.k();
                this.f8010g.put(reporterConfig.apiKey, fc);
                ya = fc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return ya;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final synchronized InterfaceC0388bb a(AppMetricaConfig appMetricaConfig) {
        C0822s6 c0822s6;
        try {
            c0822s6 = this.f8014k;
            if (c0822s6 != null) {
                c0822s6.a(appMetricaConfig);
            } else {
                C0822s6 c0822s62 = new C0822s6(new C0848t6(this.f8006b, this.f.f8674e, this.f8007c, appMetricaConfig));
                this.f8014k = c0822s62;
                c0822s6 = c0822s62;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0822s6;
    }
}
