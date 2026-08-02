package p000;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g92 implements InterfaceC0350j8 {

    /* JADX INFO: renamed from: n */
    public static g92 f2670n;

    /* JADX INFO: renamed from: j */
    public int f2671j;

    /* JADX INFO: renamed from: k */
    public final Object f2672k;

    /* JADX INFO: renamed from: l */
    public final Object f2673l;

    /* JADX INFO: renamed from: m */
    public Object f2674m;

    public g92(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f2674m = new s62(this);
        this.f2671j = 1;
        this.f2673l = scheduledExecutorService;
        this.f2672k = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized g92 m2004d(Context context) {
        try {
            if (f2670n == null) {
                f2670n = new g92(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new hr0("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2670n;
    }

    /* JADX INFO: renamed from: a */
    public void m2005a(boolean z, wu0 wu0Var, C0539oc c0539oc, boolean z2) {
        a90.m127k(c0539oc, "source");
        int iMin = Math.min(wu0Var.f8671c, ((wu0) wu0Var.f8675g.f2674m).f8671c);
        C0539oc c0539oc2 = wu0Var.f8669a;
        boolean z3 = c0539oc2.f5698k > 0;
        int i = (int) c0539oc.f5698k;
        if (z3 || iMin < i) {
            if (!z3 && iMin > 0) {
                wu0Var.m5417b(iMin, c0539oc, false);
            }
            c0539oc2.mo1553f(c0539oc, (int) c0539oc.f5698k);
            wu0Var.f8674f = z | wu0Var.f8674f;
        } else {
            wu0Var.m5417b(i, c0539oc, z);
        }
        if (z2) {
            try {
                ((C0597px) this.f2673l).flush();
            } catch (IOException e) {
                dd0.m1163h(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2006b(wu0 wu0Var, int i) {
        if (wu0Var == null) {
            ((wu0) this.f2674m).m5416a(i);
            m2007c();
            return;
        }
        wu0Var.m5416a(i);
        xu0 xu0Var = new xu0();
        wu0Var.m5418c(Math.min(wu0Var.f8671c, ((wu0) wu0Var.f8675g.f2674m).f8671c), xu0Var);
        if (xu0Var.f9057j > 0) {
            try {
                ((C0597px) this.f2673l).flush();
            } catch (IOException e) {
                dd0.m1163h(e);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public void m2007c() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2672k
            ot0 r0 = (p000.ot0) r0
            wu0[] r1 = r0.m3775i()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.f2674m
            wu0 r2 = (p000.wu0) r2
            int r2 = r2.f8671c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.f8671c
            oc r10 = r8.f8669a
            long r11 = r10.f5698k
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.f8672d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.f8672d
            int r11 = r11 + r9
            r8.f8672d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.f8671c
            long r10 = r10.f5698k
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.f8672d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            xu0 r1 = new xu0
            r1.<init>()
            wu0[] r0 = r0.m3775i()
            int r2 = r0.length
            r3 = r4
        L75:
            if (r3 >= r2) goto L83
            r5 = r0[r3]
            int r6 = r5.f8672d
            r5.m5418c(r6, r1)
            r5.f8672d = r4
            int r3 = r3 + 1
            goto L75
        L83:
            int r0 = r1.f9057j
            if (r0 <= 0) goto L93
            java.lang.Object r13 = r13.f2673l     // Catch: java.io.IOException -> L8f
            px r13 = (p000.C0597px) r13     // Catch: java.io.IOException -> L8f
            r13.flush()     // Catch: java.io.IOException -> L8f
            return
        L8f:
            r13 = move-exception
            p000.dd0.m1163h(r13)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g92.m2007c():void");
    }

    @Override // p000.InterfaceC0350j8
    public ListenableFuture call() {
        n72 n72Var = (n72) this.f2672k;
        do1 do1Var = (do1) this.f2673l;
        int i = this.f2671j;
        ArrayList arrayList = (ArrayList) this.f2674m;
        ListenableFuture listenableFutureM2993d = k70.m2993d(do1Var);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) k70.m2991b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) n72Var.f5324b).get(i2) != null) {
                    dd0.m1158c();
                    return null;
                }
                z32 z32Var = new z32(1);
                int i3 = ja2.f3889a;
                listenableFutureM2993d = k70.m2996g(listenableFutureM2993d, new n72(4, s92.m4509a(), z32Var), EnumC0113ct.f1449j);
            }
        }
        return listenableFutureM2993d;
    }

    /* JADX INFO: renamed from: e */
    public synchronized v92 m2008e(a82 a82Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a82Var.toString()));
            }
            if (!((s62) this.f2674m).m4489d(a82Var)) {
                s62 s62Var = new s62(this);
                this.f2674m = s62Var;
                s62Var.m4489d(a82Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a82Var.f66b.f6465a;
    }

    public /* synthetic */ g92(n72 n72Var, do1 do1Var, int i, ArrayList arrayList) {
        this.f2672k = n72Var;
        this.f2673l = do1Var;
        this.f2671j = i;
        this.f2674m = arrayList;
    }

    public g92(ot0 ot0Var, C0597px c0597px) {
        this.f2672k = ot0Var;
        this.f2673l = c0597px;
        this.f2671j = 65535;
        this.f2674m = new wu0(this, 0, 65535, null);
    }
}
