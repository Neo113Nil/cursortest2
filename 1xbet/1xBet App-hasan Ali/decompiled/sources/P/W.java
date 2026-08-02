package P;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0776av;
import com.google.android.gms.internal.ads.AbstractC0952et;
import com.google.android.gms.internal.ads.AbstractC1044gv;
import com.google.android.gms.internal.ads.AbstractC1260lo;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.C0741a4;
import com.google.android.gms.internal.ads.C0843cH;
import com.google.android.gms.internal.ads.C1112iH;
import com.google.android.gms.internal.ads.C1292mb;
import com.google.android.gms.internal.ads.C1407p;
import com.google.android.gms.internal.ads.C1456q3;
import com.google.android.gms.internal.ads.C1761wv;
import com.google.android.gms.internal.ads.C3;
import com.google.android.gms.internal.ads.InterfaceC0977fH;
import com.google.android.gms.internal.ads.Mm;
import com.google.android.gms.internal.ads.RunnableC1081hn;
import com.google.android.gms.internal.ads.RunnableC1303mm;
import com.google.android.gms.internal.ads.X3;
import com.google.android.gms.internal.ads.XG;
import com.google.android.gms.internal.ads.YG;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import l3.C2054a;
import q.AbstractC2291f;
import q.AbstractC2292g;
import q.AbstractC2293h;
import q.BinderC2290e;
import w2.C2544b;
import w2.C2546d;
import w2.C2548f;

/* loaded from: classes.dex */
public final class W implements InterfaceC0977fH {

    /* renamed from: o, reason: collision with root package name */
    public static volatile int f4410o = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4411k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4412l;

    /* renamed from: m, reason: collision with root package name */
    public Object f4413m;

    /* renamed from: n, reason: collision with root package name */
    public Object f4414n;

    public /* synthetic */ W(Context context, Object obj, Object obj2, boolean z3) {
        this.f4412l = context;
        this.f4413m = obj;
        this.f4414n = obj2;
        this.f4411k = z3;
    }

    public static W f(Context context, ExecutorService executorService, boolean z3) {
        D3.f fVar = new D3.f();
        if (z3) {
            executorService.execute(new RunnableC1081hn(11, context, fVar));
        } else {
            executorService.execute(new RunnableC1303mm(14, fVar));
        }
        return new W(context, executorService, fVar.f946a, z3);
    }

    public G.v a() {
        Intent intent = (Intent) this.f4412l;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f4411k);
        ((C2054a) this.f4413m).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            String a5 = AbstractC2292g.a();
            if (!TextUtils.isEmpty(a5)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", a5);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
        }
        if (i >= 34) {
            if (((ActivityOptions) this.f4414n) == null) {
                this.f4414n = AbstractC2291f.a();
            }
            AbstractC2293h.a((ActivityOptions) this.f4414n, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f4414n;
        return new G.v(21, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0977fH
    public C1761wv b(int i, C1292mb c1292mb, int[] iArr) {
        XG xg = new XG((C1112iH) this.f4412l);
        int i5 = ((int[]) this.f4414n)[i];
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i6 = 0;
        int i7 = 0;
        while (i6 < c1292mb.f14495a) {
            int i8 = i;
            C1292mb c1292mb2 = c1292mb;
            YG yg = new YG(i8, c1292mb2, i6, (C0843cH) this.f4413m, iArr[i6], this.f4411k, xg);
            int length = objArr.length;
            int i9 = i7 + 1;
            int d5 = AbstractC0776av.d(length, i9);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i7] = yg;
            i6++;
            i7 = i9;
            i = i8;
            c1292mb = c1292mb2;
        }
        return AbstractC1044gv.k(i7, objArr);
    }

    public void c(boolean z3) {
        C2548f c2548f = (C2548f) this.f4414n;
        synchronized (c2548f) {
            try {
                if (this.f4411k) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.l.a(((C2544b) this.f4412l).f20500g, this)) {
                    C2548f.b(c2548f, this, z3);
                }
                this.f4411k = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public L4.z d(int i) {
        L4.z zVar;
        C2548f c2548f = (C2548f) this.f4414n;
        synchronized (c2548f) {
            if (this.f4411k) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f4413m)[i] = true;
            Object obj = ((C2544b) this.f4412l).f20498d.get(i);
            C2546d c2546d = c2548f.f20523z;
            L4.z zVar2 = (L4.z) obj;
            if (!c2546d.c(zVar2)) {
                H2.e.a(c2546d.h(zVar2));
            }
            zVar = (L4.z) obj;
        }
        return zVar;
    }

    public boolean e() {
        boolean z3;
        synchronized (this.f4412l) {
            z3 = this.f4411k;
        }
        return z3;
    }

    public void g(int i, long j5, Exception exc) {
        j(i, j5, exc, null, null);
    }

    public void h(int i, long j5) {
        j(i, j5, null, null, null);
    }

    public boolean i(C1407p c1407p, Mm mm) {
        boolean canBeSpatialized;
        boolean equals = Objects.equals(c1407p.f14904m, "audio/eac3-joc");
        int i = c1407p.f14886B;
        if (equals && i == 16) {
            i = 12;
        } else if (Objects.equals(c1407p.f14904m, "audio/iamf") && i == -1) {
            i = 6;
        }
        int m5 = AbstractC1260lo.m(i);
        if (m5 == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(m5);
        int i5 = c1407p.f14887C;
        if (i5 != -1) {
            channelMask.setSampleRate(i5);
        }
        canBeSpatialized = ((Spatializer) this.f4412l).canBeSpatialized((AudioAttributes) mm.a().f10741l, channelMask.build());
        return canBeSpatialized;
    }

    public D3.o j(int i, long j5, Exception exc, String str, String str2) {
        if (!this.f4411k) {
            D3.o oVar = (D3.o) this.f4414n;
            ExecutorService executorService = (ExecutorService) this.f4413m;
            Aq aq = new Aq(2, (byte) 0);
            oVar.getClass();
            D3.o oVar2 = new D3.o();
            oVar.f967b.e(new D3.i(executorService, aq, oVar2, 0));
            oVar.i();
            return oVar2;
        }
        Context context = (Context) this.f4412l;
        X3 w5 = C0741a4.w();
        String packageName = context.getPackageName();
        w5.e();
        C0741a4.x((C0741a4) w5.f10141l, packageName);
        w5.e();
        C0741a4.B((C0741a4) w5.f10141l, j5);
        int i5 = f4410o;
        w5.e();
        C0741a4.D((C0741a4) w5.f10141l, i5);
        if (exc != null) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            w5.e();
            C0741a4.C((C0741a4) w5.f10141l, stringWriter2);
            String name = exc.getClass().getName();
            w5.e();
            C0741a4.A((C0741a4) w5.f10141l, name);
        }
        if (str2 != null) {
            w5.e();
            C0741a4.y((C0741a4) w5.f10141l, str2);
        }
        if (str != null) {
            w5.e();
            C0741a4.z((C0741a4) w5.f10141l, str);
        }
        D3.o oVar3 = (D3.o) this.f4414n;
        ExecutorService executorService2 = (ExecutorService) this.f4413m;
        C2.h hVar = new C2.h(i, 8, w5);
        oVar3.getClass();
        D3.o oVar4 = new D3.o();
        oVar3.f967b.e(new D3.i(executorService2, hVar, oVar4, 0));
        oVar3.i();
        return oVar4;
    }

    public W(C3 c32) {
        this.f4411k = false;
        this.f4412l = null;
        this.f4413m = null;
        this.f4414n = c32;
    }

    public /* synthetic */ W(C1112iH c1112iH, C0843cH c0843cH, boolean z3, int[] iArr) {
        this.f4412l = c1112iH;
        this.f4413m = c0843cH;
        this.f4411k = z3;
        this.f4414n = iArr;
    }

    public W(Object obj, C1456q3 c1456q3) {
        this.f4411k = false;
        this.f4412l = obj;
        this.f4413m = c1456q3;
        this.f4414n = null;
    }

    public W(Spatializer spatializer) {
        int immersiveAudioLevel;
        this.f4412l = spatializer;
        immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
        this.f4411k = immersiveAudioLevel != 0;
    }

    public W(int i) {
        switch (i) {
            case 6:
                this.f4412l = new Intent("android.intent.action.VIEW");
                this.f4413m = new C2054a(4);
                this.f4411k = true;
                break;
            default:
                this.f4412l = new Object();
                this.f4413m = new ArrayList();
                this.f4414n = new ArrayList();
                this.f4411k = true;
                break;
        }
    }

    public W(m2.g gVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f4412l = intent;
        this.f4413m = new C2054a(4);
        this.f4411k = true;
        if (gVar != null) {
            intent.setPackage(((ComponentName) gVar.f17997o).getPackageName());
            BinderC2290e binderC2290e = (BinderC2290e) gVar.f17996n;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC2290e);
            intent.putExtras(bundle);
        }
    }

    public W(C2548f c2548f, C2544b c2544b) {
        this.f4414n = c2548f;
        this.f4412l = c2544b;
        c2548f.getClass();
        this.f4413m = new boolean[2];
    }
}
