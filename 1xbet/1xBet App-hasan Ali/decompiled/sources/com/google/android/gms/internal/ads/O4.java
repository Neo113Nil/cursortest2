package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class O4 implements N4 {

    /* renamed from: H, reason: collision with root package name */
    public static volatile C0965f5 f10903H = null;

    /* renamed from: I, reason: collision with root package name */
    public static final Object f10904I = new Object();
    public static boolean J = false;
    public static long K;

    /* renamed from: L, reason: collision with root package name */
    public static U4 f10905L;

    /* renamed from: M, reason: collision with root package name */
    public static C1233l5 f10906M;

    /* renamed from: N, reason: collision with root package name */
    public static C1721w f10907N;

    /* renamed from: O, reason: collision with root package name */
    public static C0905dr f10908O;

    /* renamed from: P, reason: collision with root package name */
    public static U4 f10909P;

    /* renamed from: C, reason: collision with root package name */
    public final DisplayMetrics f10912C;

    /* renamed from: D, reason: collision with root package name */
    public final C1529ro f10913D;

    /* renamed from: E, reason: collision with root package name */
    public final D3.l f10914E;

    /* renamed from: F, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1143j5 f10915F;

    /* renamed from: G, reason: collision with root package name */
    public final HashMap f10916G;

    /* renamed from: k, reason: collision with root package name */
    public MotionEvent f10917k;

    /* renamed from: t, reason: collision with root package name */
    public double f10926t;

    /* renamed from: u, reason: collision with root package name */
    public double f10927u;

    /* renamed from: v, reason: collision with root package name */
    public double f10928v;

    /* renamed from: w, reason: collision with root package name */
    public float f10929w;

    /* renamed from: x, reason: collision with root package name */
    public float f10930x;

    /* renamed from: y, reason: collision with root package name */
    public float f10931y;

    /* renamed from: z, reason: collision with root package name */
    public float f10932z;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedList f10918l = new LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public long f10919m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f10920n = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f10921o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f10922p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f10923q = 0;

    /* renamed from: r, reason: collision with root package name */
    public long f10924r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f10925s = 0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f10910A = false;

    /* renamed from: B, reason: collision with root package name */
    public boolean f10911B = false;

    public O4(Context context, D3.l lVar) {
        try {
            D4.b();
            this.f10912C = context.getResources().getDisplayMetrics();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
                this.f10913D = new C1529ro(5);
            }
        } catch (Throwable unused) {
        }
        this.f10916G = new HashMap();
        this.f10914E = lVar;
    }

    public static C0965f5 o(Context context, boolean z3) {
        if (f10903H == null) {
            synchronized (f10904I) {
                try {
                    if (f10903H == null) {
                        C0965f5 c5 = C0965f5.c(context, z3, f10909P);
                        if (c5.f13452q) {
                            try {
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8845j3)).booleanValue()) {
                                    c5.e("w4g9FXzOzEwcEeCpaSre5nXuOUCFa92GFetfeeKgPQcF4KCZSoB1ybtd0ZEBGNIA", "edZBbMBYITINvHy1TGuBnyHrwyVIJEJzJQocfZ8d7ZI=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            c5.e("mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", Context.class);
                            c5.e("dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", Context.class);
                            c5.e("fN18KlRCFMPT8X1qMJmuHpIW+XVsrRSfMnh+5QiArw3xyALVJ87b0VfJ0mW1R0L9", "GJYSDgYrAgCxY14XYxunZiSr8dTk91g66tw4qbpYxV8=", Context.class);
                            c5.e("BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", Context.class);
                            c5.e("P/SJPs6J09HHrsHH3yRlYUs/9QaX+N9sbuXBCqzOk0Vtsso6vN6yQG3sif+Q9+N4", "MRnsFh7aI+oC8kg1+amaEJuIrxjLkR8/37mSauK2nHU=", Context.class);
                            Class cls = Boolean.TYPE;
                            c5.e("GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", Context.class, cls);
                            c5.e("rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", Context.class);
                            c5.e("IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", Context.class);
                            c5.e("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=", MotionEvent.class, DisplayMetrics.class);
                            c5.e("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=", MotionEvent.class, DisplayMetrics.class);
                            c5.e("y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", new Class[0]);
                            c5.e("ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", new Class[0]);
                            c5.e("IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", new Class[0]);
                            c5.e("bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", new Class[0]);
                            c5.e("bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", new Class[0]);
                            c5.e("SB9y9R9TfrBrk/vvw6hLKELaohqG/NwYydNqAtO02nMZ4t1KTWLQTj+uV3qwKJ+5", "zJhT7qghLWaTsmehrEh6IjKTMRAYPpUw83GIeS8cyos=", new Class[0]);
                            c5.e("oRkhOtgSewU4ggMi3si9uC+Dt7XbP2h/HAjAAMrrDLJEH1okiq6gMjsyB44PqaXr", "iO2i4E5kKwgdMIyURHCZV/iLx1KtGqgpgsfiaMoXkaQ=", Context.class, cls, String.class);
                            c5.e("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", StackTraceElement[].class);
                            c5.e("mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", View.class, DisplayMetrics.class, cls, cls);
                            c5.e("dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", Context.class, cls);
                            c5.e("gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", View.class, Activity.class, cls);
                            c5.e("IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", Long.TYPE);
                            c5.e("3Zd6ToP6YGdtLSvr/9LlH3RQ74jHr5f7QlQE5jiIZQZu/jwK9FxbxcEE4M1niHI2", "5EH0wgVOsOOfycPFtjiDLlWMUl1WsId7lt7tllT9vVA=", new Class[0]);
                            try {
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8863m3)).booleanValue()) {
                                    c5.e("VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            c5.e("yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", Context.class);
                            try {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8869n3)).booleanValue()) {
                                        Class cls2 = Long.TYPE;
                                        c5.e("zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", NetworkCapabilities.class, cls2, cls2);
                                    }
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
                                    c5.e("nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
                                    Class cls3 = Long.TYPE;
                                    c5.e("e9GN1ULeRXoIWzbGPleyg0VqwusIk+Y8UB0jj4l1lcVfEVgEFoeRxD7pvq3YAOeu", "j+KOJWcuW5eAeYurIvI/WDWaxjjVmMhwZuok18XlZ7Q=", cls3, cls3, cls3, cls3);
                                }
                            } catch (IllegalStateException unused5) {
                            }
                            try {
                                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8668C2)).booleanValue()) {
                                    c5.e("SGrqoKjotUFKi0Pm8mPdGLEIFA6B5bcdqpg0gya/IITzjxrSi23eKYMffqn0zLlM", "JlPicGd8nbcQ8ZbmhNqFQR3s817OLQa0+uauZ8OF17M=", long[].class, Context.class, View.class);
                                }
                            } catch (IllegalStateException unused6) {
                            }
                        }
                        f10903H = c5;
                    }
                } finally {
                }
            }
        }
        return f10903H;
    }

    public static C1010g5 q(C0965f5 c0965f5, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d5 = c0965f5.d("zquiBLNsiJH5keRetXBCNmjSlO+FJBcpgfDbltZRb+WTF5I/NRR9hCGZxARfGH0K", "1hqMb526iXwDuGjyfOFzL8CpmWwTXgqej4g8gq9uBJ4=");
        if (d5 == null || motionEvent == null) {
            throw new Y4();
        }
        try {
        } catch (IllegalAccessException | InvocationTargetException e3) {
            e = e3;
        }
        try {
            return new C1010g5((String) d5.invoke(null, motionEvent, displayMetrics));
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new Y4(e);
        }
    }

    public static final void u(List list) {
        ExecutorService executorService;
        if (f10903H == null || (executorService = f10903H.f13439b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) Q2.r.f5053d.f5056c.a(F7.f8931y2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            StringWriter stringWriter = new StringWriter();
            e3.printStackTrace(new PrintWriter(stringWriter));
            Log.d("O4", "class methods got exception: " + stringWriter.toString());
        }
    }

    public static O4 v(Context context, D3.l lVar) {
        synchronized (O4.class) {
            try {
                if (!J) {
                    K = System.currentTimeMillis() / 1000;
                    f10903H = o(context, lVar.f961l);
                    A7 a7 = F7.f8869n3;
                    Q2.r rVar = Q2.r.f5053d;
                    if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                        f10905L = U4.m(context);
                    }
                    ExecutorService executorService = f10903H.f13439b;
                    if (((Boolean) rVar.f5056c.a(F7.f8875o3)).booleanValue() && executorService != null) {
                        f10906M = C1233l5.a(context, executorService);
                    }
                    if (((Boolean) rVar.f5056c.a(F7.f8674D2)).booleanValue()) {
                        f10907N = new C1721w();
                    }
                    if (((Boolean) rVar.f5056c.a(F7.f8703I2)).booleanValue() || ((C0786b4) lVar.f963n).B()) {
                        f10909P = new U4(context, executorService);
                    }
                    if (((Boolean) rVar.f5056c.a(F7.f8679E2)).booleanValue() || ((C0786b4) lVar.f963n).A()) {
                        f10908O = new C0905dr(context, executorService, (C0786b4) lVar.f963n, f10909P);
                    }
                    J = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new O4(context, lVar);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final synchronized void a(MotionEvent motionEvent) {
        Long l5;
        try {
            if (this.f10910A) {
                p();
                this.f10910A = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f10926t = 0.0d;
                this.f10927u = motionEvent.getRawX();
                this.f10928v = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d5 = rawX - this.f10927u;
                double d6 = rawY - this.f10928v;
                this.f10926t += Math.sqrt((d6 * d6) + (d5 * d5));
                this.f10927u = rawX;
                this.f10928v = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.f10917k = obtain;
                        this.f10918l.add(obtain);
                        if (this.f10918l.size() > 6) {
                            ((MotionEvent) this.f10918l.remove()).recycle();
                        }
                        this.f10921o++;
                        this.f10923q = j(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.f10920n += motionEvent.getHistorySize() + 1;
                        C1010g5 n5 = n(motionEvent);
                        Long l6 = n5.f13555j;
                        if (l6 != null && n5.f13558m != null) {
                            this.f10924r = l6.longValue() + n5.f13558m.longValue() + this.f10924r;
                        }
                        if (this.f10912C != null && (l5 = n5.f13556k) != null && n5.f13559n != null) {
                            this.f10925s = l5.longValue() + n5.f13559n.longValue() + this.f10925s;
                        }
                    } else if (action2 == 3) {
                        this.f10922p++;
                    }
                } catch (Y4 unused) {
                }
            } else {
                this.f10929w = motionEvent.getX();
                this.f10930x = motionEvent.getY();
                this.f10931y = motionEvent.getRawX();
                this.f10932z = motionEvent.getRawY();
                this.f10919m++;
            }
            this.f10911B = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void b(View view) {
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8662B2)).booleanValue()) {
            if (this.f10915F == null) {
                C0965f5 c0965f5 = f10903H;
                this.f10915F = new ViewOnAttachStateChangeListenerC1143j5(c0965f5.f13438a, c0965f5.f13453r);
            }
            this.f10915F.a(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String c(Context context) {
        char[] cArr = AbstractC1055h5.f13710a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return r(context, null, 1, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final void d(StackTraceElement[] stackTraceElementArr) {
        C1529ro c1529ro;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue() || (c1529ro = this.f10913D) == null) {
            return;
        }
        c1529ro.f15382l = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String e(Context context, View view, Activity activity) {
        return r(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String f(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String g(Context context, String str, View view) {
        return r(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final String h(Context context, String str, View view, Activity activity) {
        return r(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.N4
    public final synchronized void i(int i, int i5, int i6) {
        try {
            if (this.f10917k != null) {
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8914v2)).booleanValue()) {
                    p();
                } else {
                    this.f10917k.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.f10912C;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.f10917k = MotionEvent.obtain(0L, i6, 1, i * f, i5 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.f10917k = null;
            }
            this.f10911B = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long j(StackTraceElement[] stackTraceElementArr) {
        Method d5 = f10903H.d("xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=");
        if (d5 == null || stackTraceElementArr == null) {
            throw new Y4();
        }
        try {
            return new T4((String) d5.invoke(null, stackTraceElementArr)).f11622h.longValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new Y4(e3);
        }
    }

    public final C0919e4 k(Context context, View view, Activity activity) {
        C1233l5 c1233l5 = f10906M;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            C1721w c1721w = f10907N;
            c1721w.f16079h = c1721w.f16078g;
            c1721w.f16078g = SystemClock.uptimeMillis();
        }
        C0919e4 W4 = C1367o4.W();
        D3.l lVar = this.f10914E;
        if (!TextUtils.isEmpty((String) lVar.f962m)) {
            W4.e();
            C1367o4.C0((C1367o4) W4.f10141l, (String) lVar.f962m);
        }
        t(o(context, lVar.f961l), W4, view, activity, true, context);
        return W4;
    }

    public final C0919e4 l(Context context) {
        ArrayList arrayList;
        C1233l5 c1233l5 = f10906M;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            C1721w c1721w = f10907N;
            c1721w.f16074b = c1721w.f16073a;
            c1721w.f16073a = SystemClock.uptimeMillis();
        }
        C0919e4 W4 = C1367o4.W();
        D3.l lVar = this.f10914E;
        if (!TextUtils.isEmpty((String) lVar.f962m)) {
            W4.e();
            C1367o4.C0((C1367o4) W4.f10141l, (String) lVar.f962m);
        }
        boolean z3 = lVar.f961l;
        C0965f5 o5 = o(context, z3);
        if (o5.f13439b != null) {
            if (z3) {
                int a5 = o5.a();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(s(o5, context, W4));
                arrayList2.add(new C1413p5(o5, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", W4, a5, 24, 7));
                arrayList = arrayList2;
            } else {
                arrayList = s(o5, context, W4);
            }
            u(arrayList);
        }
        return W4;
    }

    public final C0919e4 m(Context context, View view, Activity activity) {
        C1233l5 c1233l5 = f10906M;
        if (c1233l5 != null && c1233l5.f14321d) {
            c1233l5.f14319b = System.currentTimeMillis();
        }
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
            f10907N.b(context, view);
        }
        C0919e4 W4 = C1367o4.W();
        D3.l lVar = this.f10914E;
        String str = (String) lVar.f962m;
        W4.e();
        C1367o4.C0((C1367o4) W4.f10141l, str);
        t(o(context, lVar.f961l), W4, view, activity, false, context);
        return W4;
    }

    public final C1010g5 n(MotionEvent motionEvent) {
        Method d5 = f10903H.d("kP6ItNwnvZ5+WyUcaZ02EOdpRTj+BEXM0VKXOe+cRQHvvVlFaFzrbSSXSpAmSH7O", "CbvMM1RmBqY6HgXPSjmPhmgdiwuju3NT+G66/tI7UPk=");
        if (d5 == null || motionEvent == null) {
            throw new Y4();
        }
        try {
            return new C1010g5((String) d5.invoke(null, motionEvent, this.f10912C));
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new Y4(e3);
        }
    }

    public final void p() {
        this.f10923q = 0L;
        this.f10919m = 0L;
        this.f10920n = 0L;
        this.f10921o = 0L;
        this.f10922p = 0L;
        this.f10924r = 0L;
        this.f10925s = 0L;
        LinkedList linkedList = this.f10918l;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.f10917k;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.f10917k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String r(Context context, String str, int i, View view, Activity activity) {
        M4 m42;
        String str2;
        int i5;
        Exception exc;
        C0919e4 c0919e4;
        int i6;
        int i7;
        byte[] d5;
        int i8;
        int i9 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8925x2)).booleanValue();
        if (booleanValue) {
            m42 = f10903H != null ? f10903H.f13448m : null;
            str2 = "be";
        } else {
            m42 = null;
            str2 = null;
        }
        try {
            if (i9 == 3) {
                c0919e4 = k(context, view, activity);
                try {
                    this.f10910A = true;
                    i8 = 1002;
                } catch (Exception e3) {
                    exc = e3;
                    i5 = 3;
                    if (booleanValue) {
                        if (i9 != i5) {
                        }
                        i6 = i7;
                        m42.a(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (c0919e4 != null) {
                    }
                    return Integer.toString(5);
                }
            } else if (i9 == 2) {
                c0919e4 = m(context, view, activity);
                i8 = 1008;
            } else {
                c0919e4 = l(context);
                i8 = 1000;
            }
            if (!booleanValue || m42 == null) {
                i5 = 3;
            } else {
                try {
                    i5 = 3;
                } catch (Exception e5) {
                    e = e5;
                    i5 = 3;
                }
                try {
                    m42.a(i8, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e6) {
                    e = e6;
                    exc = e;
                    if (booleanValue && m42 != null) {
                        if (i9 != i5) {
                            i7 = 1003;
                        } else if (i9 == 2) {
                            i7 = 1009;
                        } else {
                            i6 = 1001;
                            i9 = 1;
                            m42.a(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i6 = i7;
                        m42.a(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (c0919e4 != null) {
                    }
                    return Integer.toString(5);
                }
            }
        } catch (Exception e7) {
            i5 = 3;
            exc = e7;
            c0919e4 = null;
        }
        long currentTimeMillis222 = System.currentTimeMillis();
        if (c0919e4 != null) {
            try {
                if (((C1367o4) c0919e4.b()).a(null) != 0) {
                    C1367o4 c1367o4 = (C1367o4) c0919e4.b();
                    boolean z3 = D4.f8159a;
                    C1771x4 a5 = D4.a(str, c1367o4.d());
                    if (a5 == null) {
                        C0919e4 W4 = C1367o4.W();
                        W4.e();
                        C1367o4.H((C1367o4) W4.f10141l, 4096L);
                        d5 = D4.d(((C1367o4) W4.b()).d(), str, true);
                    } else {
                        d5 = ((C1816y4) a5.b()).d();
                    }
                    String encodeToString = Base64.encodeToString(d5, 11);
                    if (!booleanValue || m42 == null) {
                        return encodeToString;
                    }
                    m42.a(i9 == i5 ? 1006 : i9 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis222, str2, null);
                    return encodeToString;
                }
            } catch (Exception e8) {
                String num = Integer.toString(7);
                if (!booleanValue || m42 == null) {
                    return num;
                }
                m42.a(i9 == i5 ? 1007 : i9 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, e8);
                return num;
            }
        }
        return Integer.toString(5);
    }

    public final ArrayList s(C0965f5 c0965f5, Context context, C0919e4 c0919e4) {
        long j5;
        int a5 = c0965f5.a();
        ArrayList arrayList = new ArrayList();
        if (!c0965f5.f13452q) {
            c0919e4.e();
            C1367o4.H((C1367o4) c0919e4.f10141l, 16384L);
            return arrayList;
        }
        C1368o5 c1368o5 = new C1368o5(c0965f5, c0919e4, a5, context, (C0786b4) this.f10914E.f963n, f10908O);
        int i = a5;
        arrayList.add(c1368o5);
        arrayList.add(new C1458q5(c0965f5, c0919e4, K, i));
        arrayList.add(new C1413p5(c0965f5, c0919e4, i, 2));
        arrayList.add(new C1278m5(c0965f5, c0919e4, i, context));
        C0919e4 c0919e42 = c0919e4;
        arrayList.add(new C1413p5(c0965f5, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c0919e4, i, 33, 3));
        arrayList.add(new C1323n5(c0965f5, c0919e42, i, context));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 6));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 9));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 10));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 0));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 1));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 13));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 5));
        arrayList.add(new C1413p5(c0965f5, c0919e42, i, 12));
        arrayList.add(new C1682v5(c0965f5, c0919e42, i));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8869n3)).booleanValue()) {
                C1233l5 c1233l5 = f10906M;
                long j6 = -1;
                if (c1233l5 != null) {
                    long j7 = c1233l5.f14321d ? c1233l5.f14319b - c1233l5.f14318a : -1L;
                    long j8 = c1233l5.f14320c;
                    c1233l5.f14320c = -1L;
                    j6 = j7;
                    j5 = j8;
                } else {
                    j5 = -1;
                }
                C1637u5 c1637u5 = new C1637u5(c0965f5, c0919e42, i, f10905L, j6, j5);
                i = i;
                arrayList.add(c1637u5);
            }
        }
        A7 a7 = F7.f8863m3;
        Q2.r rVar = Q2.r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            C1413p5 c1413p5 = new C1413p5(c0965f5, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c0919e42, i, 73, 11);
            c0919e42 = c0919e42;
            arrayList.add(c1413p5);
        }
        C0919e4 c0919e43 = c0919e42;
        arrayList.add(new C1413p5(c0965f5, "yo4AnI5HYhoV2EsbpvhPGv0ZIHdCUEOv2Gre1uIL5QmSqEaPxW/DTBG1l9mfjeJL", "v4ERF2BZ8VhfOGsNaLYR31bPmiZ7/cUjCjYq2SCVO2Q=", c0919e43, i, 76, 8));
        if (((Boolean) rVar.f5056c.a(F7.f8887q3)).booleanValue()) {
            arrayList.add(new C1413p5(c0965f5, c0919e43, i, 4));
        }
        return arrayList;
    }

    public final void t(C0965f5 c0965f5, C0919e4 c0919e4, View view, Activity activity, boolean z3, Context context) {
        List list;
        MotionEvent motionEvent;
        int i = 1;
        if (c0965f5.f13452q) {
            synchronized (this) {
                try {
                    try {
                        C1010g5 q5 = q(c0965f5, this.f10917k, this.f10912C);
                        Long l5 = q5.f13553g;
                        if (l5 != null) {
                            long longValue = l5.longValue();
                            c0919e4.e();
                            C1367o4.R((C1367o4) c0919e4.f10141l, longValue);
                        }
                        Long l6 = q5.f13554h;
                        if (l6 != null) {
                            long longValue2 = l6.longValue();
                            c0919e4.e();
                            C1367o4.S((C1367o4) c0919e4.f10141l, longValue2);
                        }
                        Long l7 = q5.i;
                        if (l7 != null) {
                            long longValue3 = l7.longValue();
                            c0919e4.e();
                            C1367o4.P((C1367o4) c0919e4.f10141l, longValue3);
                        }
                        if (this.f10911B) {
                            Long l8 = q5.f13555j;
                            if (l8 != null) {
                                long longValue4 = l8.longValue();
                                c0919e4.e();
                                C1367o4.O((C1367o4) c0919e4.f10141l, longValue4);
                            }
                            Long l9 = q5.f13556k;
                            if (l9 != null) {
                                long longValue5 = l9.longValue();
                                c0919e4.e();
                                C1367o4.L((C1367o4) c0919e4.f10141l, longValue5);
                            }
                        }
                    } catch (Y4 unused) {
                    }
                    C1187k4 w5 = C1232l4.w();
                    if (this.f10919m > 0) {
                        DisplayMetrics displayMetrics = this.f10912C;
                        char[] cArr = AbstractC1055h5.f13710a;
                        if ((displayMetrics == null || displayMetrics.density == 0.0f) ? false : true) {
                            long a5 = AbstractC1055h5.a(this.f10926t, displayMetrics);
                            w5.e();
                            C1232l4.A((C1232l4) w5.f10141l, a5);
                            long a6 = AbstractC1055h5.a(this.f10931y - this.f10929w, this.f10912C);
                            w5.e();
                            C1232l4.N((C1232l4) w5.f10141l, a6);
                            long a7 = AbstractC1055h5.a(this.f10932z - this.f10930x, this.f10912C);
                            w5.e();
                            C1232l4.O((C1232l4) w5.f10141l, a7);
                            long a8 = AbstractC1055h5.a(this.f10929w, this.f10912C);
                            w5.e();
                            C1232l4.G((C1232l4) w5.f10141l, a8);
                            long a9 = AbstractC1055h5.a(this.f10930x, this.f10912C);
                            w5.e();
                            C1232l4.I((C1232l4) w5.f10141l, a9);
                            if (this.f10911B && (motionEvent = this.f10917k) != null) {
                                long a10 = AbstractC1055h5.a(((this.f10929w - this.f10931y) + motionEvent.getRawX()) - this.f10917k.getX(), this.f10912C);
                                if (a10 != 0) {
                                    w5.e();
                                    C1232l4.L((C1232l4) w5.f10141l, a10);
                                }
                                long a11 = AbstractC1055h5.a(((this.f10930x - this.f10932z) + this.f10917k.getRawY()) - this.f10917k.getY(), this.f10912C);
                                if (a11 != 0) {
                                    w5.e();
                                    C1232l4.M((C1232l4) w5.f10141l, a11);
                                }
                            }
                        }
                    }
                    try {
                        C1010g5 n5 = n(this.f10917k);
                        Long l10 = n5.f13553g;
                        if (l10 != null) {
                            long longValue6 = l10.longValue();
                            w5.e();
                            C1232l4.H((C1232l4) w5.f10141l, longValue6);
                        }
                        Long l11 = n5.f13554h;
                        if (l11 != null) {
                            long longValue7 = l11.longValue();
                            w5.e();
                            C1232l4.J((C1232l4) w5.f10141l, longValue7);
                        }
                        long longValue8 = n5.i.longValue();
                        w5.e();
                        C1232l4.F((C1232l4) w5.f10141l, longValue8);
                        if (this.f10911B) {
                            Long l12 = n5.f13556k;
                            if (l12 != null) {
                                long longValue9 = l12.longValue();
                                w5.e();
                                C1232l4.D((C1232l4) w5.f10141l, longValue9);
                            }
                            Long l13 = n5.f13555j;
                            if (l13 != null) {
                                long longValue10 = l13.longValue();
                                w5.e();
                                C1232l4.E((C1232l4) w5.f10141l, longValue10);
                            }
                            Long l14 = n5.f13557l;
                            if (l14 != null) {
                                int i5 = l14.longValue() != 0 ? 2 : 1;
                                w5.e();
                                C1232l4.Q((C1232l4) w5.f10141l, i5);
                            }
                            long j5 = this.f10920n;
                            if (j5 > 0) {
                                DisplayMetrics displayMetrics2 = this.f10912C;
                                char[] cArr2 = AbstractC1055h5.f13710a;
                                Long valueOf = displayMetrics2 != null && (displayMetrics2.density > 0.0f ? 1 : (displayMetrics2.density == 0.0f ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.f10925s / j5)) : null;
                                if (valueOf != null) {
                                    long longValue11 = valueOf.longValue();
                                    w5.e();
                                    C1232l4.y((C1232l4) w5.f10141l, longValue11);
                                } else {
                                    w5.e();
                                    C1232l4.x((C1232l4) w5.f10141l);
                                }
                                long round = Math.round(this.f10924r / this.f10920n);
                                w5.e();
                                C1232l4.z((C1232l4) w5.f10141l, round);
                            }
                            Long l15 = n5.f13560o;
                            if (l15 != null) {
                                long longValue12 = l15.longValue();
                                w5.e();
                                C1232l4.B((C1232l4) w5.f10141l, longValue12);
                            }
                            Long l16 = n5.f13561p;
                            if (l16 != null) {
                                long longValue13 = l16.longValue();
                                w5.e();
                                C1232l4.K((C1232l4) w5.f10141l, longValue13);
                            }
                            Long l17 = n5.f13562q;
                            if (l17 != null) {
                                int i6 = l17.longValue() != 0 ? 2 : 1;
                                w5.e();
                                C1232l4.P((C1232l4) w5.f10141l, i6);
                            }
                        }
                    } catch (Y4 unused2) {
                    }
                    long j6 = this.f10923q;
                    if (j6 > 0) {
                        w5.e();
                        C1232l4.C((C1232l4) w5.f10141l, j6);
                    }
                    C1232l4 c1232l4 = (C1232l4) w5.b();
                    c0919e4.e();
                    C1367o4.V((C1367o4) c0919e4.f10141l, c1232l4);
                    long j7 = this.f10919m;
                    if (j7 > 0) {
                        c0919e4.e();
                        C1367o4.M((C1367o4) c0919e4.f10141l, j7);
                    }
                    long j8 = this.f10920n;
                    if (j8 > 0) {
                        c0919e4.e();
                        C1367o4.N((C1367o4) c0919e4.f10141l, j8);
                    }
                    long j9 = this.f10921o;
                    if (j9 > 0) {
                        c0919e4.e();
                        C1367o4.Q((C1367o4) c0919e4.f10141l, j9);
                    }
                    long j10 = this.f10922p;
                    if (j10 > 0) {
                        c0919e4.e();
                        C1367o4.K((C1367o4) c0919e4.f10141l, j10);
                    }
                    try {
                        int size = this.f10918l.size() - 1;
                        if (size > 0) {
                            c0919e4.e();
                            C1367o4.w0((C1367o4) c0919e4.f10141l);
                            for (int i7 = 0; i7 < size; i7++) {
                                C1010g5 q6 = q(f10903H, (MotionEvent) this.f10918l.get(i7), this.f10912C);
                                C1187k4 w6 = C1232l4.w();
                                long longValue14 = q6.f13553g.longValue();
                                w6.e();
                                C1232l4.H((C1232l4) w6.f10141l, longValue14);
                                long longValue15 = q6.f13554h.longValue();
                                w6.e();
                                C1232l4.J((C1232l4) w6.f10141l, longValue15);
                                C1232l4 c1232l42 = (C1232l4) w6.b();
                                c0919e4.e();
                                C1367o4.v0((C1367o4) c0919e4.f10141l, c1232l42);
                            }
                        }
                    } catch (Y4 unused3) {
                        c0919e4.e();
                        C1367o4.w0((C1367o4) c0919e4.f10141l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            if (c0965f5.f13439b != null) {
                int a12 = c0965f5.a();
                arrayList.add(new A4(i, c0965f5, c0919e4));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 2));
                arrayList.add(new C1458q5(c0965f5, c0919e4, K, a12));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 0));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 9));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 10));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 1));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 6));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 13));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 5));
                arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 12));
                arrayList.add(new C1502r5(c0965f5, c0919e4, a12, new Throwable().getStackTrace()));
                arrayList.add(new C1502r5(c0965f5, c0919e4, a12, view));
                arrayList.add(new C1682v5(c0965f5, c0919e4, a12));
                A7 a72 = F7.f8937z2;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a72)).booleanValue()) {
                    arrayList.add(new C1278m5(c0965f5, c0919e4, a12, view, activity));
                }
                if (((Boolean) rVar.f5056c.a(F7.f8887q3)).booleanValue()) {
                    arrayList.add(new C1413p5(c0965f5, c0919e4, a12, 4));
                }
                if (!z3) {
                    try {
                        if (((Boolean) rVar.f5056c.a(F7.f8668C2)).booleanValue()) {
                            arrayList.add(new C1547s5(c0965f5, c0919e4, a12, this.f10916G, view, context));
                        }
                    } catch (IllegalStateException unused4) {
                    }
                    try {
                        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8674D2)).booleanValue()) {
                            arrayList.add(new C1502r5(c0965f5, c0919e4, a12, f10907N));
                        }
                    } catch (IllegalStateException unused5) {
                    }
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8712K2)).booleanValue()) {
                        arrayList.add(new C1502r5(c0965f5, c0919e4, a12, this.f10913D));
                    }
                } else if (((Boolean) rVar.f5056c.a(F7.f8662B2)).booleanValue()) {
                    arrayList.add(new C1727w5(c0965f5, c0919e4, a12, this.f10915F));
                }
            }
            list = arrayList;
        } else {
            c0919e4.e();
            C1367o4.H((C1367o4) c0919e4.f10141l, 16384L);
            list = Arrays.asList(new A4(i, c0965f5, c0919e4));
        }
        u(list);
    }
}
