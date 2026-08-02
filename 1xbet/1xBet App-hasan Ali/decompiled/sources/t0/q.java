package t0;

import android.view.MotionEvent;
import h0.C1988b;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C2404a f19497a = new C2404a(1000);

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f19498b;

    static {
        new C2404a(1007);
        new C2404a(1008);
        new C2404a(1002);
        f19498b = new StackTraceElement[0];
    }

    public static final boolean a(s sVar) {
        return !sVar.f19506h && sVar.f19503d;
    }

    public static final boolean b(s sVar) {
        return (sVar.b() || !sVar.f19506h || sVar.f19503d) ? false : true;
    }

    public static final boolean c(s sVar) {
        return sVar.f19506h && !sVar.f19503d;
    }

    public static final boolean d(s sVar, long j5, long j6) {
        int i = sVar.i == 1 ? 1 : 0;
        long j7 = sVar.f19502c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32)) * f;
        float f5 = ((int) (j5 >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f;
        return (intBitsToFloat > f5) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j5 & 4294967295L)) + intBitsToFloat4);
    }

    public static final long e(s sVar, boolean z3) {
        long g5 = C1988b.g(sVar.f19502c, sVar.f19505g);
        if (z3 || !sVar.b()) {
            return g5;
        }
        return 0L;
    }

    public static final void f(j jVar, long j5, i4.c cVar, boolean z3) {
        D3.l lVar = jVar.f19486b;
        MotionEvent motionEvent = lVar != null ? (MotionEvent) ((G.v) lVar.f963n).f1750m : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z3) {
            motionEvent.setAction(3);
        }
        int i = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        motionEvent.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i5));
        cVar.c(motionEvent);
        motionEvent.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i5));
        motionEvent.setAction(action);
    }
}
