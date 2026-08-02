package J2;

import Q2.C0387u0;
import T2.G;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.Jt;
import i0.AbstractC2002g;
import i0.C2006k;
import i0.F;
import m3.v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2694a;

    /* renamed from: b, reason: collision with root package name */
    public int f2695b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2696c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2697d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2698e;

    public b() {
        this.f2694a = 2;
        this.f2696c = null;
        this.f2697d = null;
        this.f2695b = 0;
        this.f2698e = new Object();
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f2696c).getStrokeCap();
        int i = strokeCap == null ? -1 : AbstractC2002g.f17277a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f2696c).getStrokeJoin();
        int i = strokeJoin == null ? -1 : AbstractC2002g.f17278b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f) {
        ((Paint) this.f2696c).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void d(int i) {
        if (this.f2695b == i) {
            return;
        }
        this.f2695b = i;
        int i5 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f2696c;
        if (i5 >= 29) {
            paint.setBlendMode(F.q(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(F.y(i)));
        }
    }

    public void e(long j5) {
        ((Paint) this.f2696c).setColor(F.u(j5));
    }

    public void f(C2006k c2006k) {
        this.f2698e = c2006k;
        ((Paint) this.f2696c).setColorFilter(c2006k != null ? c2006k.f17283a : null);
    }

    public void g(int i) {
        ((Paint) this.f2696c).setFilterBitmap(!(i == 0));
    }

    public void h(Shader shader) {
        this.f2697d = shader;
        ((Paint) this.f2696c).setShader(shader);
    }

    public void i(int i) {
        ((Paint) this.f2696c).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i) {
        ((Paint) this.f2696c).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(float f) {
        ((Paint) this.f2696c).setStrokeWidth(f);
    }

    public void l(int i) {
        ((Paint) this.f2696c).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public C0387u0 m() {
        b bVar = (b) this.f2698e;
        return new C0387u0(this.f2695b, (String) this.f2696c, (String) this.f2697d, bVar == null ? null : new C0387u0(bVar.f2695b, (String) bVar.f2696c, (String) bVar.f2697d, null, null), null);
    }

    public Looper n() {
        Looper looper;
        synchronized (this.f2698e) {
            try {
                if (this.f2695b != 0) {
                    v.f("Invalid state: handlerThread should already been initialized.", (HandlerThread) this.f2696c);
                } else if (((HandlerThread) this.f2696c) == null) {
                    G.m("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f2696c = handlerThread;
                    handlerThread.start();
                    this.f2697d = new Jt(((HandlerThread) this.f2696c).getLooper(), 0);
                    G.m("Looper thread started.");
                } else {
                    G.m("Resuming the looper thread");
                    this.f2698e.notifyAll();
                }
                this.f2695b++;
                looper = ((HandlerThread) this.f2696c).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f2695b);
        jSONObject.put("Message", (String) this.f2696c);
        jSONObject.put("Domain", (String) this.f2697d);
        b bVar = (b) this.f2698e;
        if (bVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", bVar.o());
        return jSONObject;
    }

    public String toString() {
        switch (this.f2694a) {
            case 0:
                try {
                    return o().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public b(int i, String str, String str2, b bVar) {
        this.f2694a = 0;
        this.f2695b = i;
        this.f2696c = str;
        this.f2697d = str2;
        this.f2698e = bVar;
    }

    public b(InterfaceC0677Re interfaceC0677Re) {
        this.f2694a = 1;
        this.f2696c = interfaceC0677Re.getLayoutParams();
        ViewParent parent = interfaceC0677Re.getParent();
        this.f2698e = interfaceC0677Re.c0();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f2697d = viewGroup;
            this.f2695b = viewGroup.indexOfChild(interfaceC0677Re.K());
            viewGroup.removeView(interfaceC0677Re.K());
            interfaceC0677Re.p0(true);
            return;
        }
        throw new S2.g("Could not get the parent of the WebView for an overlay.");
    }

    public b(Paint paint) {
        this.f2694a = 3;
        this.f2696c = paint;
        this.f2695b = 3;
    }
}
