package T2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Jt;
import com.google.android.gms.internal.ads.Rl;
import com.google.android.gms.internal.ads.Ul;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n.AbstractC2107A;

/* renamed from: T2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5706a;

    /* renamed from: b, reason: collision with root package name */
    public final Ul f5707b;

    /* renamed from: c, reason: collision with root package name */
    public String f5708c;

    /* renamed from: d, reason: collision with root package name */
    public String f5709d;

    /* renamed from: e, reason: collision with root package name */
    public String f5710e;
    public String f;

    /* renamed from: h, reason: collision with root package name */
    public final int f5712h;
    public PointF i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f5713j;

    /* renamed from: k, reason: collision with root package name */
    public final Jt f5714k;

    /* renamed from: g, reason: collision with root package name */
    public int f5711g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0424b f5715l = new RunnableC0424b(this, 1);

    public C0432j(Context context) {
        this.f5706a = context;
        this.f5712h = ViewConfiguration.get(context).getScaledTouchSlop();
        P2.o oVar = P2.o.f4767B;
        oVar.f4785s.n();
        this.f5714k = (Jt) oVar.f4785s.f2697d;
        this.f5707b = oVar.f4780n.f5727g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z3) {
        if (!z3) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f5711g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f5711g;
        if (i == -1) {
            return;
        }
        RunnableC0424b runnableC0424b = this.f5715l;
        Jt jt = this.f5714k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.f5711g = 5;
                this.f5713j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                jt.postDelayed(runnableC0424b, ((Long) Q2.r.f5053d.f5056c.a(F7.f8927x4)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z3 = false;
                for (int i5 = 0; i5 < historySize; i5++) {
                    z3 |= !d(motionEvent.getHistoricalX(0, i5), motionEvent.getHistoricalY(0, i5), motionEvent.getHistoricalX(1, i5), motionEvent.getHistoricalY(1, i5));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z3) {
                    return;
                }
            }
            this.f5711g = -1;
            jt.removeCallbacks(runnableC0424b);
        }
    }

    public final void b() {
        String str;
        Context context = this.f5706a;
        try {
            if (!(context instanceof Activity)) {
                U2.j.h("Can not create dialog without Activity Context");
                return;
            }
            P2.o oVar = P2.o.f4767B;
            C0435m c0435m = oVar.f4780n;
            synchronized (c0435m.f5722a) {
                str = c0435m.f5724c;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != oVar.f4780n.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e3 = e(arrayList, "Ad information", true);
            final int e5 = e(arrayList, str2, true);
            final int e6 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.O8)).booleanValue();
            final int e7 = e(arrayList, "Open ad inspector", booleanValue);
            final int e8 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder j5 = L.j(context);
            j5.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: T2.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final C0432j c0432j = C0432j.this;
                    c0432j.getClass();
                    if (i != e3) {
                        if (i == e5) {
                            U2.j.d("Debug mode [Creative Preview] selected.");
                            AbstractC0613Id.f9539a.execute(new RunnableC0424b(c0432j, 2));
                            return;
                        }
                        if (i == e6) {
                            U2.j.d("Debug mode [Troubleshooting] selected.");
                            AbstractC0613Id.f9539a.execute(new RunnableC0424b(c0432j, 6));
                            return;
                        }
                        int i5 = e7;
                        Ul ul = c0432j.f5707b;
                        if (i == i5) {
                            final C0606Hd c0606Hd = AbstractC0613Id.f;
                            C0606Hd c0606Hd2 = AbstractC0613Id.f9539a;
                            if (ul.f()) {
                                c0606Hd.execute(new RunnableC0424b(c0432j, 5));
                                return;
                            } else {
                                final int i6 = 1;
                                c0606Hd2.execute(new Runnable() { // from class: T2.e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                C0432j c0432j2 = c0432j;
                                                c0432j2.getClass();
                                                P2.o oVar2 = P2.o.f4767B;
                                                C0435m c0435m2 = oVar2.f4780n;
                                                String str4 = c0432j2.f5709d;
                                                String str5 = c0432j2.f5710e;
                                                Context context2 = c0432j2.f5706a;
                                                if (!c0435m2.f(context2, str4, str5)) {
                                                    oVar2.f4780n.b(context2, c0432j2.f5709d, c0432j2.f5710e);
                                                    break;
                                                } else {
                                                    c0606Hd.execute(new RunnableC0424b(c0432j2, 4));
                                                    break;
                                                }
                                            default:
                                                C0432j c0432j3 = c0432j;
                                                c0432j3.getClass();
                                                P2.o oVar3 = P2.o.f4767B;
                                                C0435m c0435m3 = oVar3.f4780n;
                                                String str6 = c0432j3.f5709d;
                                                String str7 = c0432j3.f5710e;
                                                Context context3 = c0432j3.f5706a;
                                                if (!c0435m3.f(context3, str6, str7)) {
                                                    oVar3.f4780n.b(context3, c0432j3.f5709d, c0432j3.f5710e);
                                                    break;
                                                } else {
                                                    c0606Hd.execute(new RunnableC0424b(c0432j3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i == e8) {
                            final C0606Hd c0606Hd3 = AbstractC0613Id.f;
                            C0606Hd c0606Hd4 = AbstractC0613Id.f9539a;
                            if (ul.f()) {
                                c0606Hd3.execute(new RunnableC0424b(c0432j, 0));
                                return;
                            } else {
                                final int i7 = 0;
                                c0606Hd4.execute(new Runnable() { // from class: T2.e
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                C0432j c0432j2 = c0432j;
                                                c0432j2.getClass();
                                                P2.o oVar2 = P2.o.f4767B;
                                                C0435m c0435m2 = oVar2.f4780n;
                                                String str4 = c0432j2.f5709d;
                                                String str5 = c0432j2.f5710e;
                                                Context context2 = c0432j2.f5706a;
                                                if (!c0435m2.f(context2, str4, str5)) {
                                                    oVar2.f4780n.b(context2, c0432j2.f5709d, c0432j2.f5710e);
                                                    break;
                                                } else {
                                                    c0606Hd3.execute(new RunnableC0424b(c0432j2, 4));
                                                    break;
                                                }
                                            default:
                                                C0432j c0432j3 = c0432j;
                                                c0432j3.getClass();
                                                P2.o oVar3 = P2.o.f4767B;
                                                C0435m c0435m3 = oVar3.f4780n;
                                                String str6 = c0432j3.f5709d;
                                                String str7 = c0432j3.f5710e;
                                                Context context3 = c0432j3.f5706a;
                                                if (!c0435m3.f(context3, str6, str7)) {
                                                    oVar3.f4780n.b(context3, c0432j3.f5709d, c0432j3.f5710e);
                                                    break;
                                                } else {
                                                    c0606Hd3.execute(new RunnableC0424b(c0432j3, 3));
                                                    break;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = c0432j.f5706a;
                    if (!(context2 instanceof Activity)) {
                        U2.j.h("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c0432j.f5708c;
                    final String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        L l5 = P2.o.f4767B.f4771c;
                        HashMap l6 = L.l(build);
                        for (String str6 : l6.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) l6.get(str6));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str5 = trim;
                        }
                    }
                    L l7 = P2.o.f4767B.f4771c;
                    AlertDialog.Builder j6 = L.j(context2);
                    j6.setMessage(str5);
                    j6.setTitle("Ad Information");
                    j6.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: T2.c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i8) {
                            C0432j c0432j2 = C0432j.this;
                            c0432j2.getClass();
                            L l8 = P2.o.f4767B.f4771c;
                            L.p(c0432j2.f5706a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                        }
                    });
                    j6.setNegativeButton("Close", new DialogInterfaceOnClickListenerC0426d());
                    j6.create().show();
                }
            });
            j5.create().show();
        } catch (WindowManager.BadTokenException e9) {
            G.n("", e9);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int e3 = e(arrayList, "None", true);
        final int e5 = e(arrayList, "Shake", true);
        final int e6 = e(arrayList, "Flick", true);
        int ordinal = this.f5707b.f11802r.ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? e3 : e6 : e5;
        L l5 = P2.o.f4767B.f4771c;
        AlertDialog.Builder j5 = L.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        j5.setTitle("Setup gesture");
        j5.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterfaceOnClickListenerC0429g(0, atomicInteger));
        j5.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC0429g(1, this));
        j5.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: T2.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C0432j c0432j = C0432j.this;
                c0432j.getClass();
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    int i6 = atomicInteger2.get();
                    int i7 = e5;
                    Ul ul = c0432j.f5707b;
                    if (i6 == i7) {
                        ul.k(Rl.f11448l, true);
                    } else if (atomicInteger2.get() == e6) {
                        ul.k(Rl.f11449m, true);
                    } else {
                        ul.k(Rl.f11447k, true);
                    }
                }
                c0432j.b();
            }
        });
        j5.setOnCancelListener(new DialogInterfaceOnCancelListenerC0431i(0, this));
        j5.create().show();
    }

    public final boolean d(float f, float f5, float f6, float f7) {
        float abs = Math.abs(this.i.x - f);
        int i = this.f5712h;
        return abs < ((float) i) && Math.abs(this.i.y - f5) < ((float) i) && Math.abs(this.f5713j.x - f6) < ((float) i) && Math.abs(this.f5713j.y - f7) < ((float) i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f5708c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.f5710e);
        sb.append(",Ad Unit ID: ");
        return AbstractC2107A.u(sb, this.f5709d, "}");
    }
}
