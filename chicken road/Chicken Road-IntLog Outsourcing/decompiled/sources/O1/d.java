package O1;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f2240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f2241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f2242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f2244f;

    public /* synthetic */ d(g gVar, Runnable runnable, long j2, long j6, TimeUnit timeUnit, int i2) {
        this.f2239a = i2;
        this.f2240b = gVar;
        this.f2241c = runnable;
        this.f2242d = j2;
        this.f2243e = j6;
        this.f2244f = timeUnit;
    }

    @Override // O1.h
    public final ScheduledFuture a(B1.g gVar) {
        switch (this.f2239a) {
            case 0:
                g gVar2 = this.f2240b;
                gVar2.getClass();
                return gVar2.f2254b.scheduleAtFixedRate(new e(gVar2, this.f2241c, gVar, 0), this.f2242d, this.f2243e, this.f2244f);
            default:
                g gVar3 = this.f2240b;
                gVar3.getClass();
                return gVar3.f2254b.scheduleWithFixedDelay(new e(gVar3, this.f2241c, gVar, 2), this.f2242d, this.f2243e, this.f2244f);
        }
    }
}
