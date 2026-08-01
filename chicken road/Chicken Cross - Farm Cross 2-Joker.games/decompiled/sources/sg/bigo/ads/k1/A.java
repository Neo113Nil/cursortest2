package sg.bigo.ads.k1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;
import sg.bigo.ads.j.C5248b;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class A implements sg.bigo.ads.Y.f {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f13013a;
    public final Context b;
    public final FrameLayout c;
    public final sg.bigo.ads.l1.d d;
    public ViewGroup e;
    public final C5284z f;
    public final Q g;
    public InterfaceC5279u h;
    public C5270k i;
    public C5270k j;
    public final C5271l k;
    public final C5271l l;
    public final C5280v m;
    public Integer n;
    public final int o;
    public int p;
    public boolean q;
    public final O r;
    public boolean s;
    public boolean t;
    public C5260a u;
    public final Handler v;
    public int w;
    public final int x;
    public int y;
    public int z;

    public A(Context context, int i) {
        Context applicationContext;
        C5271l c5271l = new C5271l(i);
        C5271l c5271l2 = new C5271l(2);
        C5284z c5284z = new C5284z();
        this.y = 1;
        this.q = true;
        this.z = 3;
        this.s = true;
        this.t = false;
        C5275p c5275p = new C5275p(this);
        C5276q c5276q = new C5276q(this);
        this.w = -1;
        this.v = new Handler(Looper.getMainLooper());
        this.b = context;
        this.f13013a = context instanceof Activity ? new WeakReference((Activity) context) : new WeakReference(null);
        this.x = i;
        this.k = c5271l;
        this.l = c5271l2;
        this.f = c5284z;
        this.m = new C5280v(this);
        this.y = 1;
        float f = context.getResources().getDisplayMetrics().density;
        this.g = new Q(context);
        this.c = new FrameLayout(context);
        sg.bigo.ads.l1.d dVar = new sg.bigo.ads.l1.d(context);
        this.d = dVar;
        dVar.setOnCloseListener(new C5273n(this));
        View view = new View(context);
        view.setOnTouchListener(new ViewOnTouchListenerC5274o());
        dVar.addView(view, new FrameLayout.LayoutParams(-1, -1));
        int i2 = sg.bigo.ads.Y.d.c;
        sg.bigo.ads.Y.d dVar2 = sg.bigo.ads.Y.c.f12622a;
        if (!dVar2.f12623a && (applicationContext = context.getApplicationContext()) != null) {
            dVar2.f12623a = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            applicationContext.registerReceiver(dVar2, intentFilter);
        }
        AbstractC5446j.a(2, null, new sg.bigo.ads.Y.a(dVar2, this), 1L);
        c5271l.c = c5275p;
        c5271l2.c = c5276q;
        this.r = new O();
        this.o = 4871;
    }

    public final void a() {
        C5284z c5284z = this.f;
        C5283y c5283y = c5284z.b;
        if (c5283y != null) {
            c5283y.b.removeCallbacks(c5283y.e);
            c5283y.c = null;
            c5284z.b = null;
        }
        try {
            int i = sg.bigo.ads.Y.d.c;
            sg.bigo.ads.Y.d dVar = sg.bigo.ads.Y.c.f12622a;
            dVar.getClass();
            AbstractC5446j.b(new sg.bigo.ads.Y.b(dVar, this));
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        if (!this.s) {
            this.s = true;
            if (this.u != null) {
                this.b.getContentResolver().unregisterContentObserver(this.u);
                this.u = null;
            }
            C5270k c5270k = this.i;
            if (c5270k != null) {
                c5270k.stopLoading();
                c5270k.loadUrl("");
                c5270k.onPause();
            }
            C5270k c5270k2 = this.j;
            if (c5270k2 != null) {
                c5270k2.stopLoading();
                c5270k2.loadUrl("");
                c5270k2.onPause();
            }
        }
        sg.bigo.ads.K0.X.c(this.d);
        this.k.a();
        this.i = null;
        this.l.a();
        this.j = null;
        f();
        if (this.u != null) {
            this.b.getContentResolver().unregisterContentObserver(this.u);
            this.u = null;
        }
        this.e = null;
        sg.bigo.ads.K0.X.c(this.c);
        sg.bigo.ads.K0.X.c(this.d);
        this.t = true;
    }

    public final void b() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        C5270k c5270k;
        if (this.i == null || (i = this.y) == 1 || i == 5) {
            return;
        }
        if (i == 4 || this.x == 2) {
            f();
        }
        int i2 = this.y;
        if (i2 != 3 && i2 != 4) {
            if (i2 == 2) {
                this.c.setVisibility(4);
                b(5);
                return;
            }
            return;
        }
        C5271l c5271l = this.l;
        if (c5271l.d == null || (c5270k = this.j) == null) {
            this.d.removeView(this.i);
            this.c.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
            this.c.setVisibility(0);
        } else {
            c5271l.a();
            this.j = null;
            this.d.removeView(c5270k);
        }
        C5280v c5280v = this.m;
        C5270k c5270k2 = c5280v.c.i;
        if (c5270k2 != null && c5280v.f13045a > 0 && c5280v.b > 0 && (layoutParams = c5270k2.getLayoutParams()) != null) {
            layoutParams.width = c5280v.f13045a;
            layoutParams.height = c5280v.b;
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            c5280v.c.i.setLayoutParams(layoutParams);
        }
        sg.bigo.ads.K0.X.c(this.d);
        b(2);
    }

    public final boolean c() {
        Activity activity = (Activity) this.f13013a.get();
        if (activity == null) {
            return false;
        }
        if ((this.l.d != null ? this.j : this.i) == null) {
            return false;
        }
        if (this.x != 1) {
            return true;
        }
        this.r.getClass();
        return (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    public final void d() {
        this.s = false;
        e();
        C5270k c5270k = this.i;
        if (c5270k != null) {
            c5270k.onResume();
        }
        C5270k c5270k2 = this.j;
        if (c5270k2 != null) {
            c5270k2.onResume();
        }
    }

    public final void e() {
        int i;
        if (this.t || (i = this.y) == 1 || i == 5 || this.i == null) {
            return;
        }
        Context context = this.b;
        C5260a c5260a = this.u;
        if (c5260a != null && c5260a != null) {
            context.getContentResolver().unregisterContentObserver(this.u);
            this.u = null;
        }
        this.u = new C5260a(this.v, context.getApplicationContext(), new C5278t(this));
        context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.u);
    }

    public final void f() {
        Integer num;
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            if (viewGroup == null) {
                View a2 = sg.bigo.ads.K0.X.a((Context) this.f13013a.get(), this.c);
                viewGroup = a2 instanceof ViewGroup ? (ViewGroup) a2 : this.c;
            }
            this.e = viewGroup;
        }
        this.e.setSystemUiVisibility(this.p);
        Activity activity = (Activity) this.f13013a.get();
        if (activity != null && (num = this.n) != null) {
            InterfaceC5279u interfaceC5279u = this.h;
            if (interfaceC5279u != null && interfaceC5279u.a(activity, num.intValue())) {
                return;
            } else {
                activity.setRequestedOrientation(this.n.intValue());
            }
        }
        this.n = null;
    }

    public final boolean c(int i) {
        if (i == 3) {
            return true;
        }
        Activity activity = (Activity) this.f13013a.get();
        if (activity == null) {
            return false;
        }
        try {
            int i2 = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).configChanges;
            return ((i2 & 128) == 0 || (i2 & 1024) == 0) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void b(boolean z) {
        this.s = true;
        if (this.u != null) {
            this.b.getContentResolver().unregisterContentObserver(this.u);
            this.u = null;
        }
        C5270k c5270k = this.i;
        if (c5270k != null) {
            if (z) {
                c5270k.stopLoading();
                c5270k.loadUrl("");
            }
            c5270k.onPause();
        }
        C5270k c5270k2 = this.j;
        if (c5270k2 != null) {
            if (z) {
                c5270k2.stopLoading();
                c5270k2.loadUrl("");
            }
            c5270k2.onPause();
        }
    }

    public final void b(int i) {
        int i2 = this.y;
        this.y = i;
        C5271l c5271l = this.k;
        c5271l.getClass();
        StringBuilder sb = new StringBuilder("mraidbridge.setState(");
        String a2 = a0.a(i);
        Locale locale = Locale.US;
        c5271l.a(sb.append(JSONObject.quote(a2.toLowerCase(locale))).append(")").toString());
        C5271l c5271l2 = this.l;
        if (c5271l2.f) {
            c5271l2.a("mraidbridge.setState(" + JSONObject.quote(a0.a(i).toLowerCase(locale)) + ")");
        }
        InterfaceC5279u interfaceC5279u = this.h;
        if (interfaceC5279u != null && i != 4 && ((i2 == 4 && i == 2) || i == 5)) {
            interfaceC5279u.a();
        }
        a((r) null);
    }

    public final boolean a(File file, C5248b c5248b) {
        try {
            if (this.i == null) {
                a(c5248b);
            }
            C5270k c5270k = this.i;
            if (c5270k == null) {
                AbstractC5496a.b("MraidController", "fillLocalFolder: mMraidWebView is null after onBeforeFill");
                return false;
            }
            WebSettings settings = c5270k.getSettings();
            settings.setAllowFileAccess(true);
            settings.setAllowFileAccessFromFileURLs(true);
            settings.setAllowUniversalAccessFromFileURLs(true);
            C5271l c5271l = this.k;
            String uri = Uri.fromFile(file).toString();
            C5270k c5270k2 = c5271l.d;
            if (c5270k2 == null) {
                AbstractC5496a.a("MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
            } else {
                c5271l.f = false;
                c5270k2.loadUrl(uri);
            }
            return true;
        } catch (Throwable th) {
            AbstractC5496a.b("MraidController", "fillLocalFolder failed: " + th.getMessage());
            return false;
        }
    }

    public final void a(boolean z) {
        if (z == (!this.d.c.isVisible())) {
            return;
        }
        this.d.setCloseVisible(!z);
    }

    public final void a(String str, boolean z) {
        if (this.i == null) {
            throw new C5272m("Unable to expand after the WebView is destroyed");
        }
        if (this.x == 2) {
            return;
        }
        int i = this.y;
        if (i == 2 || i == 3) {
            int i2 = this.z;
            if (i2 != 3) {
                a(P.a(i2));
            } else if (this.q) {
                f();
            } else {
                Activity activity = (Activity) this.f13013a.get();
                if (activity == null) {
                    throw new C5272m("Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context.");
                }
                a(sg.bigo.ads.I0.f.a(activity));
            }
            boolean z2 = str != null;
            if (z2) {
                C5270k a2 = C5271l.a(this.b);
                this.j = a2;
                if (a2 == null) {
                    return;
                }
                this.l.a(a2);
                C5271l c5271l = this.l;
                C5270k c5270k = c5271l.d;
                if (c5270k == null) {
                    AbstractC5496a.a("MraidBridge", "MRAID bridge called setContentHtml while WebView was not attached");
                } else {
                    c5271l.f = false;
                    c5270k.loadUrl(str);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i3 = this.y;
            if (i3 == 2) {
                ViewGroup viewGroup = this.e;
                if (viewGroup == null) {
                    if (viewGroup == null) {
                        View a3 = sg.bigo.ads.K0.X.a((Context) this.f13013a.get(), this.c);
                        viewGroup = a3 instanceof ViewGroup ? (ViewGroup) a3 : this.c;
                    }
                    this.e = viewGroup;
                }
                this.p = this.e.getSystemUiVisibility();
                ViewGroup viewGroup2 = this.e;
                if (viewGroup2 == null) {
                    if (viewGroup2 == null) {
                        View a4 = sg.bigo.ads.K0.X.a((Context) this.f13013a.get(), this.c);
                        viewGroup2 = a4 instanceof ViewGroup ? (ViewGroup) a4 : this.c;
                    }
                    this.e = viewGroup2;
                }
                this.e.setSystemUiVisibility(this.o);
                if (z2) {
                    this.d.addView(this.j, layoutParams);
                } else {
                    C5280v c5280v = this.m;
                    int measuredWidth = c5280v.c.i.getMeasuredWidth();
                    int measuredHeight = c5280v.c.i.getMeasuredHeight();
                    c5280v.f13045a = measuredWidth;
                    c5280v.b = measuredHeight;
                    this.c.removeView(this.i);
                    this.c.setVisibility(4);
                    this.d.addView(this.i, layoutParams);
                }
                ViewGroup viewGroup3 = this.e;
                if (viewGroup3 == null) {
                    if (viewGroup3 == null) {
                        View a5 = sg.bigo.ads.K0.X.a((Context) this.f13013a.get(), this.c);
                        viewGroup3 = a5 instanceof ViewGroup ? (ViewGroup) a5 : this.c;
                    }
                    this.e = viewGroup3;
                }
                this.e.addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            } else if (i3 == 3 && z2) {
                this.d.removeView(this.i);
                this.c.addView(this.i, layoutParams);
                this.c.setVisibility(4);
                this.d.addView(this.j, layoutParams);
            }
            this.d.setLayoutParams(layoutParams);
            a(z);
            b(4);
        }
    }

    public final void a(String str, sg.bigo.ads.U.j jVar) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!"tel".equalsIgnoreCase(scheme) && !"voicemail".equalsIgnoreCase(scheme) && !"sms".equalsIgnoreCase(scheme) && !"mailto".equalsIgnoreCase(scheme) && !"geo".equalsIgnoreCase(scheme) && !"google.streetview".equalsIgnoreCase(scheme)) {
            InterfaceC5279u interfaceC5279u = this.h;
            if (interfaceC5279u != null) {
                interfaceC5279u.a(str, jVar);
                return;
            }
            return;
        }
        AbstractC5496a.a(2, 6, "MraidController", "Uri scheme " + parse.getScheme() + " is not allowed.");
    }

    public final void a(int i) {
        Activity activity = (Activity) this.f13013a.get();
        if (activity == null || !c(this.z)) {
            throw new C5272m("Attempted to lock orientation to unsupported value: ".concat(P.b(this.z)));
        }
        if (this.n == null) {
            this.n = Integer.valueOf(activity.getRequestedOrientation());
        }
        InterfaceC5279u interfaceC5279u = this.h;
        if (interfaceC5279u == null || !interfaceC5279u.b(activity, i)) {
            activity.setRequestedOrientation(i);
        }
    }

    public final void a(C5248b c5248b) {
        C5270k a2 = C5271l.a(this.b);
        this.i = a2;
        if (a2 == null) {
            return;
        }
        c5248b.a();
        this.k.a(this.i);
        this.c.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
    }

    public final void a(Context context, Intent intent) {
        int rotation;
        if (!"android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) || (rotation = ((WindowManager) this.b.getSystemService("window")).getDefaultDisplay().getRotation()) == this.w) {
            return;
        }
        this.w = rotation;
        a((r) null);
    }

    public final void a(r rVar) {
        C5284z c5284z = this.f;
        C5283y c5283y = c5284z.b;
        if (c5283y != null) {
            c5283y.b.removeCallbacks(c5283y.e);
            c5283y.c = null;
            c5284z.b = null;
        }
        C5270k c5270k = this.l.d != null ? this.j : this.i;
        if (c5270k == null) {
            return;
        }
        C5284z c5284z2 = this.f;
        View[] viewArr = {this.c, c5270k};
        Handler handler = c5284z2.f13049a;
        C5283y c5283y2 = new C5283y(handler, viewArr);
        c5284z2.b = c5283y2;
        c5283y2.c = new RunnableC5277s(this, c5270k, rVar);
        c5283y2.d = 2;
        handler.post(c5283y2.e);
    }
}
