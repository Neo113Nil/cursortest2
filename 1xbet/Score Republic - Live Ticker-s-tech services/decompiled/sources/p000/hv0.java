package p000;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hv0 extends mj0 {

    /* JADX INFO: renamed from: n */
    public static final C0794v8 f3339n = new C0794v8("addressTrackerKey");

    /* JADX INFO: renamed from: f */
    public final zu0 f3340f;

    /* JADX INFO: renamed from: g */
    public final gc1 f3341g;

    /* JADX INFO: renamed from: h */
    public final s90 f3342h;

    /* JADX INFO: renamed from: i */
    public final nc1 f3343i;

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f3344j;

    /* JADX INFO: renamed from: k */
    public a81 f3345k;

    /* JADX INFO: renamed from: l */
    public Long f3346l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0875xf f3347m;

    public hv0(AbstractC0477mo abstractC0477mo) {
        nc1 nc1Var = nc1.f5376o;
        AbstractC0875xf abstractC0875xfMo961f = abstractC0477mo.mo961f();
        this.f3347m = abstractC0875xfMo961f;
        this.f3342h = new s90(new r90(this, abstractC0477mo));
        this.f3340f = new zu0();
        gc1 gc1VarMo963h = abstractC0477mo.mo963h();
        a90.m127k(gc1VarMo963h, "syncContext");
        this.f3341g = gc1VarMo963h;
        ScheduledExecutorService scheduledExecutorServiceMo962g = abstractC0477mo.mo962g();
        a90.m127k(scheduledExecutorServiceMo962g, "timeService");
        this.f3344j = scheduledExecutorServiceMo962g;
        this.f3343i = nc1Var;
        abstractC0875xfMo961f.mo5321i("OutlierDetection lb created.", 1);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2339g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C0190ex) it.next()).f2195a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m2340h(zu0 zu0Var, int i) {
        ArrayList arrayList = new ArrayList();
        for (yu0 yu0Var : zu0Var.f9963p.values()) {
            if (yu0Var.m5836c() >= i) {
                arrayList.add(yu0Var);
            }
        }
        return arrayList;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: a */
    public final ja1 mo1387a(jj0 jj0Var) {
        s90 s90Var = this.f3342h;
        zu0 zu0Var = this.f3340f;
        AbstractC0875xf abstractC0875xf = this.f3347m;
        abstractC0875xf.mo5320h(1, "Received resolution result: {0}", jj0Var);
        cv0 cv0Var = (cv0) jj0Var.f3948c;
        ArrayList arrayList = new ArrayList();
        Iterator it = jj0Var.f3946a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C0190ex) it.next()).f2195a);
        }
        zu0Var.f9963p.keySet().retainAll(arrayList);
        Iterator it2 = zu0Var.f9963p.values().iterator();
        while (it2.hasNext()) {
            ((yu0) it2.next()).f9467a = cv0Var;
        }
        HashMap map = zu0Var.f9963p;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            SocketAddress socketAddress = (SocketAddress) obj;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new yu0(cv0Var));
            }
        }
        c71 c71Var = cv0Var.f1468g;
        Long l = cv0Var.f1462a;
        s90Var.m4508i(c71Var.f1156a);
        if (cv0Var.f1466e == null && cv0Var.f1467f == null) {
            a81 a81Var = this.f3345k;
            if (a81Var != null) {
                a81Var.m80d();
                this.f3346l = null;
                for (yu0 yu0Var : zu0Var.f9963p.values()) {
                    if (yu0Var.m5837d()) {
                        yu0Var.m5838e();
                    }
                    yu0Var.f9471e = 0;
                }
            }
        } else {
            Long lValueOf = this.f3346l == null ? l : Long.valueOf(Math.max(0L, l.longValue() - (this.f3343i.m3517H() - this.f3346l.longValue())));
            a81 a81Var2 = this.f3345k;
            if (a81Var2 != null) {
                a81Var2.m80d();
                for (yu0 yu0Var2 : zu0Var.f9963p.values()) {
                    f50 f50Var = yu0Var2.f9468b;
                    ((AtomicLong) f50Var.f2313k).set(0L);
                    ((AtomicLong) f50Var.f2314l).set(0L);
                    f50 f50Var2 = yu0Var2.f9469c;
                    ((AtomicLong) f50Var2.f2313k).set(0L);
                    ((AtomicLong) f50Var2.f2314l).set(0L);
                }
            }
            gc1 gc1Var = this.f3341g;
            RunnableC0702sr runnableC0702sr = new RunnableC0702sr(this, cv0Var, abstractC0875xf, 5);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l.longValue();
            ScheduledExecutorService scheduledExecutorService = this.f3344j;
            gc1Var.getClass();
            fc1 fc1Var = new fc1(runnableC0702sr);
            this.f3345k = new a81(fc1Var, scheduledExecutorService.scheduleWithFixedDelay(new ec1(gc1Var, fc1Var, runnableC0702sr, jLongValue2), jLongValue, jLongValue2, TimeUnit.NANOSECONDS));
        }
        C0831w8 c0831w8 = C0831w8.f8454b;
        s90Var.mo1389d(new jj0(jj0Var.f3946a, jj0Var.f3947b, cv0Var.f1468g.f1157b));
        return ja1.f3875e;
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: c */
    public final void mo1388c(ja1 ja1Var) {
        this.f3342h.mo1388c(ja1Var);
    }

    @Override // p000.mj0
    /* JADX INFO: renamed from: f */
    public final void mo1390f() {
        this.f3342h.mo1390f();
    }
}
