package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Up implements Mp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11822a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11823b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11824c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f11825d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11826e;
    public final Qw f;

    public Up(V9 v9, Context context, ScheduledExecutorService scheduledExecutorService, Qw qw, int i, boolean z3, boolean z5) {
        this.f11826e = context;
        this.f11825d = scheduledExecutorService;
        this.f = qw;
        this.f11823b = z3;
        this.f11824c = z5;
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final int a() {
        switch (this.f11822a) {
            case 0:
                return 40;
            default:
                return 50;
        }
    }

    @Override // com.google.android.gms.internal.ads.Mp
    public final E3.a d() {
        switch (this.f11822a) {
            case 0:
                C0634Ld c0634Ld = new C0634Ld();
                U2.e eVar = C0379q.f.f5048a;
                j3.f fVar = j3.f.f17514b;
                Context context = (Context) this.f11826e;
                int c5 = fVar.c(context, 12451000);
                if (c5 == 0 || c5 == 2) {
                    AbstractC0613Id.f9539a.execute(new Kw(12, context, c0634Ld));
                }
                Hw r5 = Hw.r(c0634Ld);
                final int i = 0;
                InterfaceC1311mu interfaceC1311mu = new InterfaceC1311mu(this) { // from class: com.google.android.gms.internal.ads.Tp

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Up f11692b;

                    {
                        this.f11692b = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
                    
                        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8800a3)).booleanValue() == false) goto L14;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
                    
                        r2 = com.google.android.gms.internal.ads.Ot.g((android.content.Context) r0.f11826e);
                        java.util.Objects.requireNonNull(r9);
                        r3 = r9.f3749a;
                        java.util.Objects.requireNonNull(r3);
                        r4 = ((android.content.Context) r0.f11826e).getPackageName();
                        r5 = ((java.lang.Long) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8832g3)).longValue();
                        r7 = r0.f11824c;
                        r2.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
                    
                        monitor-enter(com.google.android.gms.internal.ads.Ot.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
                    
                        r0 = r2.a(r3, r4, r5, r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
                    
                        monitor-exit(com.google.android.gms.internal.ads.Ot.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
                    
                        r1 = r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
                    
                        P2.o.f4767B.f4774g.i("AdIdInfoSignalSource.getPaidV1", r0);
                        r1 = new E4.a(7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
                    
                        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.b3)).booleanValue() != false) goto L34;
                     */
                    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object apply(Object obj) {
                        switch (i) {
                            case 0:
                                Up up = this.f11692b;
                                N2.a aVar = (N2.a) obj;
                                up.getClass();
                                E4.a aVar2 = new E4.a(7);
                                if (!up.f11823b) {
                                    break;
                                }
                                if (up.f11823b) {
                                    break;
                                }
                                return new Po(aVar, null, aVar2, 3);
                            default:
                                Up up2 = this.f11692b;
                                up2.getClass();
                                U2.e eVar2 = C0379q.f.f5048a;
                                ContentResolver contentResolver = ((Context) up2.f11826e).getContentResolver();
                                return new Po(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new E4.a(7), 3);
                        }
                    }
                };
                Qw qw = this.f;
                final int i5 = 1;
                return AbstractC1400ot.U((Hw) AbstractC1400ot.l0(AbstractC1400ot.h0(r5, interfaceC1311mu, qw), ((Long) Q2.r.f5053d.f5056c.a(F7.f8772V0)).longValue(), TimeUnit.MILLISECONDS, this.f11825d), Throwable.class, new InterfaceC1311mu(this) { // from class: com.google.android.gms.internal.ads.Tp

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Up f11692b;

                    {
                        this.f11692b = this;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
                    
                        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8800a3)).booleanValue() == false) goto L14;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
                    
                        r2 = com.google.android.gms.internal.ads.Ot.g((android.content.Context) r0.f11826e);
                        java.util.Objects.requireNonNull(r9);
                        r3 = r9.f3749a;
                        java.util.Objects.requireNonNull(r3);
                        r4 = ((android.content.Context) r0.f11826e).getPackageName();
                        r5 = ((java.lang.Long) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.f8832g3)).longValue();
                        r7 = r0.f11824c;
                        r2.getClass();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
                    
                        monitor-enter(com.google.android.gms.internal.ads.Ot.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0099, code lost:
                    
                        r0 = r2.a(r3, r4, r5, r7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
                    
                        monitor-exit(com.google.android.gms.internal.ads.Ot.class);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
                    
                        r1 = r0;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
                    
                        P2.o.f4767B.f4774g.i("AdIdInfoSignalSource.getPaidV1", r0);
                        r1 = new E4.a(7);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
                    
                        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.b3)).booleanValue() != false) goto L34;
                     */
                    @Override // com.google.android.gms.internal.ads.InterfaceC1311mu
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object apply(Object obj) {
                        switch (i5) {
                            case 0:
                                Up up = this.f11692b;
                                N2.a aVar = (N2.a) obj;
                                up.getClass();
                                E4.a aVar2 = new E4.a(7);
                                if (!up.f11823b) {
                                    break;
                                }
                                if (up.f11823b) {
                                    break;
                                }
                                return new Po(aVar, null, aVar2, 3);
                            default:
                                Up up2 = this.f11692b;
                                up2.getClass();
                                U2.e eVar2 = C0379q.f.f5048a;
                                ContentResolver contentResolver = ((Context) up2.f11826e).getContentResolver();
                                return new Po(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new E4.a(7), 3);
                        }
                    }
                }, qw);
            default:
                String str = null;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.E6)).booleanValue() && this.f11824c) {
                    return AbstractC1400ot.c0(new To(str, 5));
                }
                if (!this.f11823b) {
                    return AbstractC1400ot.c0(new To(str, 5));
                }
                Mw mw = Mw.f10750l;
                C1364o1 c1364o1 = new C1364o1(14);
                C0606Hd c0606Hd = (C0606Hd) this.f;
                return AbstractC1400ot.U(AbstractC1400ot.l0(AbstractC1400ot.h0(mw, c1364o1, c0606Hd), ((Long) AbstractC1595t8.f15635b.s()).longValue(), TimeUnit.MILLISECONDS, this.f11825d), Exception.class, new C1383oc(6, this), c0606Hd);
        }
    }

    public Up(C0568Cd c0568Cd, boolean z3, boolean z5, C0606Hd c0606Hd, ScheduledExecutorService scheduledExecutorService) {
        this.f11826e = c0568Cd;
        this.f11823b = z3;
        this.f11824c = z5;
        this.f = c0606Hd;
        this.f11825d = scheduledExecutorService;
    }
}
