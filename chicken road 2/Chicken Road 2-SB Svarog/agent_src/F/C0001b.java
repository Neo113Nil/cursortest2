package F;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.util.TypedValue;
import java.util.HashMap;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0001b {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f63f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f64a;

    /* renamed from: b, reason: collision with root package name */
    public final C.a f65b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f66c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f67d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public int f68e;

    public C0001b(io.flutter.embedding.engine.renderer.h hVar, boolean z2) {
        this.f64a = hVar;
        if (C.a.f1e == null) {
            C.a.f1e = new C.a(2);
        }
        this.f65b = C.a.f1e;
        this.f66c = z2;
    }

    public static int b(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 != 1) {
            if (i2 == 5) {
                return 4;
            }
            if (i2 != 6) {
                if (i2 == 2) {
                    return 5;
                }
                if (i2 != 7) {
                    if (i2 == 3) {
                        return 0;
                    }
                    if (i2 != 8) {
                        return -1;
                    }
                }
                return 3;
            }
        }
        return 6;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v7 int, still in use, count: 2, list:
          (r11v7 int) from 0x00a6: IF  (r11v7 int) == (-1 int)  -> B:3:0x000d A[HIDDEN]
          (r11v7 int) from 0x00ac: PHI (r11v2 int) = (r11v1 int), (r11v7 int) binds: [B:90:0x00aa, B:25:0x00a6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:53)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
        */
    public final void a(android.view.MotionEvent r29, int r30, int r31, int r32, android.graphics.Matrix r33, java.nio.ByteBuffer r34, android.content.Context r35) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F.C0001b.a(android.view.MotionEvent, int, int, int, android.graphics.Matrix, java.nio.ByteBuffer, android.content.Context):void");
    }

    public final int c(Context context) {
        if (this.f68e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f68e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f68e;
    }
}
