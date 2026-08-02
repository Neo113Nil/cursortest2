package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    public static final Status f4718o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p */
    public static final Status f4719p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q */
    public static final Object f4720q = new Object();

    /* JADX INFO: renamed from: r */
    public static l90 f4721r;

    /* JADX INFO: renamed from: a */
    public long f4722a;

    /* JADX INFO: renamed from: b */
    public boolean f4723b;

    /* JADX INFO: renamed from: c */
    public uc1 f4724c;

    /* JADX INFO: renamed from: d */
    public dm1 f4725d;

    /* JADX INFO: renamed from: e */
    public final Context f4726e;

    /* JADX INFO: renamed from: f */
    public final h90 f4727f;

    /* JADX INFO: renamed from: g */
    public final a81 f4728g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f4729h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f4730i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f4731j;

    /* JADX INFO: renamed from: k */
    public final C0165e8 f4732k;

    /* JADX INFO: renamed from: l */
    public final C0165e8 f4733l;

    /* JADX INFO: renamed from: m */
    public final bm1 f4734m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f4735n;

    public l90(Context context, Looper looper) {
        h90 h90Var = h90.f3130e;
        this.f4722a = 10000L;
        this.f4723b = false;
        this.f4729h = new AtomicInteger(1);
        this.f4730i = new AtomicInteger(0);
        this.f4731j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f4732k = new C0165e8();
        this.f4733l = new C0165e8();
        this.f4735n = true;
        this.f4726e = context;
        bm1 bm1Var = new bm1(looper, this);
        Looper.getMainLooper();
        this.f4734m = bm1Var;
        this.f4727f = h90Var;
        this.f4728g = new a81(8);
        PackageManager packageManager = context.getPackageManager();
        if (a90.f83f == null) {
            a90.f83f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (a90.f83f.booleanValue()) {
            this.f4735n = false;
        }
        bm1Var.sendMessage(bm1Var.obtainMessage(6));
    }

    /* JADX INFO: renamed from: b */
    public static Status m3190b(C0679s4 c0679s4, C0253gl c0253gl) {
        String str = (String) c0679s4.f7026b.f3448l;
        String strValueOf = String.valueOf(c0253gl);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(17, sb.toString(), c0253gl.f2797l, c0253gl);
    }

    /* JADX INFO: renamed from: c */
    public static l90 m3191c(Context context) {
        l90 l90Var;
        HandlerThread handlerThread;
        synchronized (f4720q) {
            if (f4721r == null) {
                synchronized (j72.f3839g) {
                    try {
                        handlerThread = j72.f3841i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            j72.f3841i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = j72.f3841i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = h90.f3129d;
                f4721r = new l90(applicationContext, looper);
            }
            l90Var = f4721r;
        }
        return l90Var;
    }

    /* JADX INFO: renamed from: a */
    public final el1 m3192a(g90 g90Var) {
        C0679s4 c0679s4 = g90Var.f2662f;
        ConcurrentHashMap concurrentHashMap = this.f4731j;
        el1 el1Var = (el1) concurrentHashMap.get(c0679s4);
        if (el1Var == null) {
            el1Var = new el1(this, g90Var);
            concurrentHashMap.put(c0679s4, el1Var);
        }
        if (el1Var.f2110c.mo3893r()) {
            this.f4733l.add(c0679s4);
        }
        el1Var.m1457r();
        return el1Var;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3193d() {
        int i;
        if (this.f4723b) {
            return false;
        }
        o31.m3628n().getClass();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f4728g.f63k;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3194e(C0253gl c0253gl, int i) {
        h90 h90Var = this.f4727f;
        h90Var.getClass();
        Context context = this.f4726e;
        if (!yd0.m5773l(context)) {
            int i2 = c0253gl.f2796k;
            PendingIntent activity = c0253gl.f2797l;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentM2574a = h90Var.m2574a(i2, context, null);
                if (intentM2574a != null) {
                    activity = PendingIntent.getActivity(context, 0, intentM2574a, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.f1337k;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                h90Var.m2240f(context, i2, PendingIntent.getActivity(context, 0, intent, zl1.f9861a | 134217728));
                Integer num = c0253gl.f2799n;
                int iIntValue = num == null ? -1 : num.intValue();
                al1 al1Var = new al1(iIntValue, c0253gl.f2796k, System.currentTimeMillis(), context.getPackageName(), false);
                if (h90Var.f3131c == null) {
                    h90Var.f3131c = new dm1(context, dm1.f1750k, InterfaceC0420l4.f4668a, f90.f2350c);
                }
                dm1 dm1Var = h90Var.f3131c;
                dm1Var.getClass();
                m81 m81VarM3350b = m81.m3350b();
                m81VarM3350b.f5011m = new C0451lz[]{t22.f7263h};
                m81VarM3350b.f5009k = false;
                m81VarM3350b.f5010l = new an0(13, al1Var);
                dm1Var.m2002b(2, m81VarM3350b.m3354a());
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3195f(C0253gl c0253gl, int i) {
        if (m3194e(c0253gl, i)) {
            return;
        }
        bm1 bm1Var = this.f4734m;
        bm1Var.sendMessage(bm1Var.obtainMessage(5, i, 0, c0253gl));
    }

    /* JADX WARN: Code duplicated, block: B:167:0x033d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0343  */
    /* JADX WARN: Code duplicated, block: B:171:0x0381  */
    /* JADX WARN: Code duplicated, block: B:173:0x038b  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v7 el1, still in use, count: 2, list:
          (r3v7 el1) from 0x0335: IGET (r3v7 el1) A[WRAPPED] (LINE:822) el1.h int
          (r3v7 el1) from 0x033b: PHI (r3 I:??) = (r3v4 el1), (r3v7 el1) binds: [B:165:0x033a, B:221:0x033b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.l90.handleMessage(android.os.Message):boolean");
    }
}
