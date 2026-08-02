package I2;

import F2.C0254t;
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
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdtl;
import com.google.android.gms.internal.ads.zzdtp;
import com.google.android.gms.internal.ads.zzfpq;
import com.google.android.gms.internal.ads.zzgbn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3614a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdtp f3615b;

    /* renamed from: c, reason: collision with root package name */
    public String f3616c;

    /* renamed from: d, reason: collision with root package name */
    public String f3617d;

    /* renamed from: e, reason: collision with root package name */
    public String f3618e;

    /* renamed from: f, reason: collision with root package name */
    public String f3619f;

    /* renamed from: h, reason: collision with root package name */
    public final int f3621h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f3622i;
    public PointF j;

    /* renamed from: k, reason: collision with root package name */
    public final zzfpq f3623k;

    /* renamed from: g, reason: collision with root package name */
    public int f3620g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0295c f3624l = new RunnableC0295c(this, 1);

    public C0303k(Context context) {
        this.f3614a = context;
        this.f3621h = ViewConfiguration.get(context).getScaledTouchSlop();
        E2.o oVar = E2.o.f1952C;
        oVar.f1972s.l();
        this.f3623k = (zzfpq) oVar.f1972s.f17138c;
        this.f3615b = (zzdtp) oVar.f1967n.f3637g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z4) {
        if (!z4) {
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
            this.f3620g = 0;
            this.f3622i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i7 = this.f3620g;
        if (i7 == -1) {
            return;
        }
        RunnableC0295c runnableC0295c = this.f3624l;
        zzfpq zzfpqVar = this.f3623k;
        if (i7 == 0) {
            if (actionMasked == 5) {
                this.f3620g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                zzfpqVar.postDelayed(runnableC0295c, ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzeR)).longValue());
                return;
            }
            return;
        }
        if (i7 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z4 = false;
                for (int i8 = 0; i8 < historySize; i8++) {
                    z4 |= !d(motionEvent.getHistoricalX(0, i8), motionEvent.getHistoricalY(0, i8), motionEvent.getHistoricalX(1, i8), motionEvent.getHistoricalY(1, i8));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z4) {
                    return;
                }
            }
            this.f3620g = -1;
            zzfpqVar.removeCallbacks(runnableC0295c);
        }
    }

    public final void b() {
        String str;
        Context context = this.f3614a;
        try {
            if (!(context instanceof Activity)) {
                int i7 = J.f3546b;
                J2.j.f("Can not create dialog without Activity Context");
                return;
            }
            E2.o oVar = E2.o.f1952C;
            C0306n c0306n = oVar.f1967n;
            synchronized (c0306n.f3636f) {
                str = c0306n.f3632b;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != oVar.f1967n.h() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e7 = e(arrayList, "Ad information", true);
            final int e8 = e(arrayList, str2, true);
            final int e9 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue();
            final int e10 = e(arrayList, "Open ad inspector", booleanValue);
            final int e11 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder j = P.j(context);
            j.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: I2.g
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    final int i9 = 0;
                    int i10 = e7;
                    final C0303k c0303k = C0303k.this;
                    if (i8 == i10) {
                        if (!(c0303k.f3614a instanceof Activity)) {
                            int i11 = J.f3546b;
                            J2.j.f("Can not create dialog without Activity Context");
                            return;
                        }
                        String str4 = c0303k.f3616c;
                        final String str5 = "No debug information";
                        if (!TextUtils.isEmpty(str4)) {
                            Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                            StringBuilder sb = new StringBuilder();
                            P p5 = E2.o.f1952C.f1957c;
                            HashMap l7 = P.l(build);
                            for (String str6 : l7.keySet()) {
                                sb.append(str6);
                                sb.append(" = ");
                                sb.append((String) l7.get(str6));
                                sb.append("\n\n");
                            }
                            String trim = sb.toString().trim();
                            if (!TextUtils.isEmpty(trim)) {
                                str5 = trim;
                            }
                        }
                        P p7 = E2.o.f1952C.f1957c;
                        AlertDialog.Builder j3 = P.j(c0303k.f3614a);
                        j3.setMessage(str5);
                        j3.setTitle("Ad Information");
                        j3.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: I2.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i12) {
                                P p8 = E2.o.f1952C.f1957c;
                                P.p(C0303k.this.f3614a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str5), "Share via"));
                            }
                        });
                        j3.setNegativeButton("Close", new DialogInterfaceOnClickListenerC0297e());
                        j3.create().show();
                        return;
                    }
                    if (i8 == e8) {
                        int i12 = J.f3546b;
                        J2.j.b("Debug mode [Creative Preview] selected.");
                        zzbza.zza.execute(new RunnableC0295c(c0303k, 2));
                        return;
                    }
                    if (i8 == e9) {
                        int i13 = J.f3546b;
                        J2.j.b("Debug mode [Troubleshooting] selected.");
                        zzbza.zza.execute(new RunnableC0295c(c0303k, 6));
                        return;
                    }
                    if (i8 == e10) {
                        zzdtp zzdtpVar = c0303k.f3615b;
                        final zzgbn zzgbnVar = zzbza.zzf;
                        zzgbn zzgbnVar2 = zzbza.zza;
                        if (zzdtpVar.zzq()) {
                            zzgbnVar.execute(new RunnableC0295c(c0303k, 5));
                            return;
                        } else {
                            final int i14 = 1;
                            zzgbnVar2.execute(new Runnable() { // from class: I2.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            E2.o oVar2 = E2.o.f1952C;
                                            C0306n c0306n2 = oVar2.f1967n;
                                            C0303k c0303k2 = c0303k;
                                            if (!c0306n2.f(c0303k2.f3614a, c0303k2.f3617d, c0303k2.f3618e)) {
                                                String str7 = c0303k2.f3617d;
                                                String str8 = c0303k2.f3618e;
                                                oVar2.f1967n.b(c0303k2.f3614a, str7, str8);
                                                break;
                                            } else {
                                                zzgbnVar.execute(new RunnableC0295c(c0303k2, 4));
                                                break;
                                            }
                                        default:
                                            E2.o oVar3 = E2.o.f1952C;
                                            C0306n c0306n3 = oVar3.f1967n;
                                            C0303k c0303k3 = c0303k;
                                            if (!c0306n3.f(c0303k3.f3614a, c0303k3.f3617d, c0303k3.f3618e)) {
                                                String str9 = c0303k3.f3617d;
                                                String str10 = c0303k3.f3618e;
                                                oVar3.f1967n.b(c0303k3.f3614a, str9, str10);
                                                break;
                                            } else {
                                                zzgbnVar.execute(new RunnableC0295c(c0303k3, 3));
                                                break;
                                            }
                                    }
                                }
                            });
                            return;
                        }
                    }
                    if (i8 == e11) {
                        zzdtp zzdtpVar2 = c0303k.f3615b;
                        final zzgbn zzgbnVar3 = zzbza.zzf;
                        zzgbn zzgbnVar4 = zzbza.zza;
                        if (zzdtpVar2.zzq()) {
                            zzgbnVar3.execute(new RunnableC0295c(c0303k, i9));
                        } else {
                            zzgbnVar4.execute(new Runnable() { // from class: I2.f
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i9) {
                                        case 0:
                                            E2.o oVar2 = E2.o.f1952C;
                                            C0306n c0306n2 = oVar2.f1967n;
                                            C0303k c0303k2 = c0303k;
                                            if (!c0306n2.f(c0303k2.f3614a, c0303k2.f3617d, c0303k2.f3618e)) {
                                                String str7 = c0303k2.f3617d;
                                                String str8 = c0303k2.f3618e;
                                                oVar2.f1967n.b(c0303k2.f3614a, str7, str8);
                                                break;
                                            } else {
                                                zzgbnVar3.execute(new RunnableC0295c(c0303k2, 4));
                                                break;
                                            }
                                        default:
                                            E2.o oVar3 = E2.o.f1952C;
                                            C0306n c0306n3 = oVar3.f1967n;
                                            C0303k c0303k3 = c0303k;
                                            if (!c0306n3.f(c0303k3.f3614a, c0303k3.f3617d, c0303k3.f3618e)) {
                                                String str9 = c0303k3.f3617d;
                                                String str10 = c0303k3.f3618e;
                                                oVar3.f1967n.b(c0303k3.f3614a, str9, str10);
                                                break;
                                            } else {
                                                zzgbnVar3.execute(new RunnableC0295c(c0303k3, 3));
                                                break;
                                            }
                                    }
                                }
                            });
                        }
                    }
                }
            });
            j.create().show();
        } catch (WindowManager.BadTokenException e12) {
            J.l("", e12);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int e7 = e(arrayList, "None", true);
        final int e8 = e(arrayList, "Shake", true);
        final int e9 = e(arrayList, "Flick", true);
        int ordinal = this.f3615b.zza().ordinal();
        final int i7 = ordinal != 1 ? ordinal != 2 ? e7 : e9 : e8;
        P p5 = E2.o.f1952C.f1957c;
        AlertDialog.Builder j = P.j(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i7);
        j.setTitle("Setup gesture");
        j.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i7, new DialogInterfaceOnClickListenerC0300h(atomicInteger, 0));
        j.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC0300h(this, 1));
        j.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: I2.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AtomicInteger atomicInteger2 = atomicInteger;
                int i9 = atomicInteger2.get();
                C0303k c0303k = C0303k.this;
                if (i9 != i7) {
                    if (atomicInteger2.get() == e8) {
                        c0303k.f3615b.zzm(zzdtl.SHAKE);
                    } else if (atomicInteger2.get() == e9) {
                        c0303k.f3615b.zzm(zzdtl.FLICK);
                    } else {
                        c0303k.f3615b.zzm(zzdtl.NONE);
                    }
                }
                c0303k.b();
            }
        });
        j.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: I2.j
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0303k.this.b();
            }
        });
        j.create().show();
    }

    public final boolean d(float f7, float f8, float f9, float f10) {
        float abs = Math.abs(this.f3622i.x - f7);
        int i7 = this.f3621h;
        return abs < ((float) i7) && Math.abs(this.f3622i.y - f8) < ((float) i7) && Math.abs(this.j.x - f9) < ((float) i7) && Math.abs(this.j.y - f10) < ((float) i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f3616c);
        sb.append(",DebugSignal: ");
        sb.append(this.f3619f);
        sb.append(",AFMA Version: ");
        sb.append(this.f3618e);
        sb.append(",Ad Unit ID: ");
        return e1.k.i(sb, this.f3617d, "}");
    }
}
