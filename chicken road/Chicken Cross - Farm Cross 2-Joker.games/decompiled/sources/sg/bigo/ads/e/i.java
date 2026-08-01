package sg.bigo.ads.e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import java.util.Locale;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.u0.AbstractC5492a;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f12746a;

    public i(l lVar) {
        this.f12746a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x022e, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r1.e) < r1.b) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0230, code lost:
    
        r2 = r1.l;
        r0 = new java.lang.Object[]{java.lang.Float.valueOf(r0)};
        r7 = sg.bigo.ads.K0.I.f12345a;
        r0 = java.lang.String.format(java.util.Locale.ENGLISH, "%.4f", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0246, code lost:
    
        if (r2.Q != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0248, code lost:
    
        r2.Q = true;
        r6 = r2.o();
        r7 = ((java.lang.Integer) r2.a((java.lang.Object) 0, "render_style")).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0266, code lost:
    
        if (r2.G.contains("06002029") != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0268, code lost:
    
        sg.bigo.ads.s1.b.a(r2, r0, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x026b, code lost:
    
        r2 = r2.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x026d, code lost:
    
        if (r2 == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026f, code lost:
    
        r2.a(r0, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0272, code lost:
    
        r1.i = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0221, code lost:
    
        if (r1.l.t == false) goto L144;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        View view;
        float f;
        boolean z;
        int i;
        boolean z2;
        l lVar = this.f12746a;
        m mVar = lVar.l;
        if (mVar.u || ((lVar.h && lVar.i) || (view = mVar.l) == null)) {
            AbstractC5446j.a(lVar.k);
            lVar.j = false;
            return;
        }
        Rect rect = new Rect();
        boolean z3 = sg.bigo.ads.J0.a.a(rect, view) || (this.f12746a.l.t() && sg.bigo.ads.P.a.a(this.f12746a.l.k.b.b));
        if (z3) {
            l lVar2 = this.f12746a;
            if (lVar2.g == -1) {
                Context context = view.getContext();
                if (!(context instanceof Activity)) {
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            z = false;
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                        if (context instanceof Activity) {
                            z = AbstractC5492a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
                            break;
                        }
                    }
                } else {
                    z = AbstractC5492a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
                }
                if (!z) {
                    while (true) {
                        if (!(view == null ? false : AbstractC5492a.a(view.getClass(), "io.flutter.plugin.platform.PlatformViewWrapper", "io.flutter.embedding.android.FlutterView"))) {
                            Context context2 = view.getContext();
                            if (!(context2 instanceof Activity)) {
                                while (true) {
                                    if (!(context2 instanceof ContextWrapper)) {
                                        z2 = false;
                                        break;
                                    }
                                    context2 = ((ContextWrapper) context2).getBaseContext();
                                    if (context2 instanceof Activity) {
                                        z2 = AbstractC5492a.a(context2.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
                                        break;
                                    }
                                }
                            } else {
                                z2 = AbstractC5492a.a(context2.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
                            }
                            if (!z2) {
                                Object parent = view.getParent();
                                if (!(parent instanceof View)) {
                                    i = 0;
                                    break;
                                }
                                view = (View) parent;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    lVar2.g = i;
                }
                i = 1;
                lVar2.g = i;
            }
        }
        if (z3) {
            l lVar3 = this.f12746a;
            if (!lVar3.h) {
                if (lVar3.d == 0) {
                    lVar3.d = SystemClock.elapsedRealtime();
                }
                if (lVar3.f) {
                    f = 0.0f;
                } else {
                    f = lVar3.a(rect);
                    View view2 = lVar3.l.l;
                    int i2 = lVar3.c;
                    if ((view2 != null && view2.getMeasuredHeight() > 0 && view2.getMeasuredWidth() > 0 && (i2 == 0 || i2 <= 100.0f * f)) || (sg.bigo.ads.P.a.a(lVar3.l.k.b.b) && !lVar3.l.t)) {
                        lVar3.f = true;
                    }
                }
                long max = lVar3.g == 1 ? Math.max(1 * 1000, lVar3.f12749a) : lVar3.f12749a;
                if (lVar3.f && SystemClock.elapsedRealtime() - lVar3.d >= max) {
                    if (f == 0.0f) {
                        f = lVar3.a(rect);
                    }
                    m mVar2 = lVar3.l;
                    Object[] objArr = {Float.valueOf(f)};
                    Pattern pattern = I.f12345a;
                    String format = String.format(Locale.ENGLISH, "%.4f", objArr);
                    synchronized (mVar2) {
                        mVar2.N.put("show_proportion", format);
                    }
                    lVar3.l.q();
                    lVar3.h = true;
                }
            }
            l lVar4 = this.f12746a;
            if (!lVar4.i) {
                if (lVar4.e == 0) {
                    lVar4.e = SystemClock.elapsedRealtime();
                }
                float a2 = lVar4.a(rect);
                m mVar3 = lVar4.l;
                View view3 = mVar3.l;
                sg.bigo.ads.P.j jVar = mVar3.k;
                int i3 = jVar.b.b;
                int i4 = ((sg.bigo.ads.U0.b) jVar.f12482a).k;
                if (view3 != null && view3.getMeasuredWidth() > 0 && view3.getMeasuredHeight() > 0) {
                    int width = view3.getWidth() * view3.getHeight();
                    if (i3 != 12) {
                    }
                }
                if (sg.bigo.ads.P.a.a(lVar4.l.k.b.b)) {
                }
            }
        }
        l lVar5 = this.f12746a;
        if (!lVar5.h || !lVar5.i) {
            AbstractC5446j.a(2, null, lVar5.k, 500L);
        } else {
            AbstractC5446j.a(lVar5.k);
            lVar5.j = false;
        }
    }
}
