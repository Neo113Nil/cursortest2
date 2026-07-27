package sg.bigo.ads.h;

import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class R0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12849a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ sg.bigo.ads.C.l e;
    public final /* synthetic */ int f = 11;
    public final /* synthetic */ T0 g;

    public R0(T0 t0, View view, int i, int i2, sg.bigo.ads.C.l lVar) {
        this.g = t0;
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0141, code lost:
    
        if (java.lang.Math.abs(r7 - r16.g.l) < r16.d) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0144, code lost:
    
        if (r9 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0114, code lost:
    
        if (r16.g.m == r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0146, code lost:
    
        r6 = r16.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014a, code lost:
    
        if (r9 != r6.n) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014c, code lost:
    
        r9 = r16.b;
        r2 = r16.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        if (r6.i == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0154, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        r2 = sg.bigo.ads.h.T0.a(r6, r2, r8);
        r6 = r16.g.i;
        r6 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0199, code lost:
    
        if (r9 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019b, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019d, code lost:
    
        r2 = r16.g.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a1, code lost:
    
        r8 = r2;
        r2 = new int[2];
        r3 = r17;
        r3.getLocationOnScreen(r2);
        r6 = r16.g;
        r9 = r16.b;
        r10 = (int) r18.getX();
        r11 = (int) r18.getY();
        r12 = r16.g;
        r13 = ((int) r12.k) - r2[0];
        r12 = ((int) r12.l) - r2[1];
        r2 = r16.f;
        r6.getClass();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cd, code lost:
    
        if (r6 >= 100) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d5, code lost:
    
        if ((r3.getParent() instanceof android.view.ViewGroup) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d9, code lost:
    
        if (r3 == r9) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01dd, code lost:
    
        if ((r3 instanceof sg.bigo.ads.api.NativeAdView) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e0, code lost:
    
        r10 = r10 + r3.getLeft();
        r13 = r13 + r3.getLeft();
        r11 = r11 + r3.getTop();
        r12 = r12 + r3.getTop();
        r3 = (android.view.View) r3.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01fb, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01fd, code lost:
    
        r8.a(r10, r11, r13, r12, r2, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0156, code lost:
    
        r8 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0166, code lost:
    
        if (r9 != r6.o) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0168, code lost:
    
        r9 = r16.b;
        r2 = r16.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016e, code lost:
    
        if (r6.g == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0170, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0174, code lost:
    
        r2 = sg.bigo.ads.h.T0.a(r6, r2, r8);
        r6 = r16.g.g;
        r6 = 25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        r8 = r6.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x017f, code lost:
    
        if (r9 == null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0181, code lost:
    
        r2 = (sg.bigo.ads.d1.u) r6.q.get(r9);
        r6 = r9.getTag();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018f, code lost:
    
        if ((r6 instanceof java.lang.Integer) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0191, code lost:
    
        r6 = ((java.lang.Integer) r6).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0198, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        sg.bigo.ads.d1.u uVar = null;
        if (motionEvent.getActionMasked() == 0) {
            this.g.k = motionEvent.getRawX();
            this.g.l = motionEvent.getRawY();
            this.b.getScrollX();
            this.b.getScrollY();
            this.f12849a = false;
            T0 t0 = this.g;
            float f = t0.l;
            if (f < t0.h) {
                view3 = t0.n;
            } else {
                int i = t0.f;
                view3 = (i <= 0 || f <= ((float) (t0.j - i))) ? null : t0.o;
            }
            t0.m = view3;
            if (view3 == null) {
                View view4 = this.b;
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                ArrayList arrayList = new ArrayList();
                t0.a(view4, rawX, rawY, 0, new int[2], arrayList);
                t0.m = arrayList.size() > 0 ? (View) arrayList.get(arrayList.size() - 1) : null;
            }
            return !this.b.isScrollContainer();
        }
        if (motionEvent.getActionMasked() == 2) {
            if (this.c != 3) {
                return false;
            }
            if (Math.abs(motionEvent.getRawX() - this.g.k) < this.d && Math.abs(motionEvent.getRawY() - this.g.l) < this.d) {
                return false;
            }
            this.f12849a = true;
            return false;
        }
        if (motionEvent.getActionMasked() != 1) {
            return false;
        }
        float rawX2 = motionEvent.getRawX();
        float rawY2 = motionEvent.getRawY();
        T0 t02 = this.g;
        if (rawY2 < t02.h) {
            view2 = t02.n;
        } else {
            int i2 = t02.f;
            view2 = (i2 <= 0 || rawY2 <= ((float) (t02.j - i2))) ? null : t02.o;
        }
        if (view2 == null) {
            View view5 = this.b;
            float rawX3 = motionEvent.getRawX();
            float rawY3 = motionEvent.getRawY();
            t02.getClass();
            ArrayList arrayList2 = new ArrayList();
            t02.a(view5, rawX3, rawY3, 0, new int[2], arrayList2);
            view2 = arrayList2.size() > 0 ? (View) arrayList2.get(arrayList2.size() - 1) : null;
        }
        int i3 = this.c;
        if (i3 != 2) {
            if (i3 == 3) {
                T0 t03 = this.g;
                if (t03.m == view2) {
                    if (!this.f12849a) {
                        if (Math.abs(rawX2 - t03.k) < this.d) {
                        }
                    }
                }
            }
        }
        return Math.abs(rawX2 - this.g.k) < ((float) this.d) && Math.abs(rawY2 - this.g.l) < ((float) this.d);
    }
}
