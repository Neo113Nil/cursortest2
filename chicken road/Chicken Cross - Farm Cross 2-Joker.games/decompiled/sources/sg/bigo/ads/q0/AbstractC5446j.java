package sg.bigo.ads.q0;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.WeakHashMap;
import sg.bigo.ads.z0.RunnableC5528c;

/* renamed from: sg.bigo.ads.q0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5446j {

    /* renamed from: a, reason: collision with root package name */
    public static HandlerThread f13257a;
    public static HandlerC5438b b;
    public static HandlerThread c;
    public static HandlerC5438b d;
    public static HandlerThread e;
    public static HandlerC5438b f;
    public static HandlerC5438b g;
    public static final WeakHashMap h = new WeakHashMap();
    public static final boolean i = false;
    public static ArrayList j;

    public static synchronized void a() {
        synchronized (AbstractC5446j.class) {
            if (f13257a == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
                f13257a = handlerThread;
                handlerThread.start();
                b = new HandlerC5438b("BGAd-Background", f13257a.getLooper());
            }
        }
    }

    public static synchronized void b() {
        synchronized (AbstractC5446j.class) {
            if (g == null) {
                g = new HandlerC5438b("BGAd-Background.Main + 38", Looper.getMainLooper());
            }
        }
    }

    public static synchronized void c() {
        synchronized (AbstractC5446j.class) {
            if (e == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
                e = handlerThread;
                handlerThread.start();
                f = new HandlerC5438b("BGAd-Normal", e.getLooper());
            }
        }
    }

    public static synchronized void d() {
        synchronized (AbstractC5446j.class) {
            if (c == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
                c = handlerThread;
                handlerThread.start();
                d = new HandlerC5438b("BGAd-Work", c.getLooper());
            }
        }
    }

    public static boolean e() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void a(int i2, Runnable runnable) {
        a(i2, null, runnable, 0L);
    }

    public static void b(Runnable runnable) {
        if (e()) {
            runnable.run();
        } else {
            a(2, runnable);
        }
    }

    public static synchronized void a(int i2, RunnableC5528c runnableC5528c, Runnable runnable, long j2) {
        HandlerC5438b handlerC5438b;
        synchronized (AbstractC5446j.class) {
            if (runnable == null) {
                return;
            }
            if (g == null) {
                b();
            }
            if (i2 == 0) {
                if (f13257a == null) {
                    a();
                }
                handlerC5438b = b;
            } else if (i2 == 1) {
                if (c == null) {
                    d();
                }
                handlerC5438b = d;
            } else if (i2 != 3) {
                handlerC5438b = g;
            } else {
                if (e == null) {
                    c();
                }
                handlerC5438b = f;
            }
            if (handlerC5438b == null) {
                return;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = g.getLooper();
            }
            RunnableC5444h runnableC5444h = new RunnableC5444h(runnableC5528c, myLooper, handlerC5438b, new RunnableC5441e(runnable, myLooper));
            WeakHashMap weakHashMap = h;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new C5445i(runnableC5444h, Integer.valueOf(i2)));
            }
            handlerC5438b.postDelayed(runnableC5444h, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003e, code lost:
    
        if (r2 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void a(Runnable runnable) {
        HandlerC5438b handlerC5438b;
        synchronized (AbstractC5446j.class) {
            if (runnable == null) {
                return;
            }
            WeakHashMap weakHashMap = h;
            C5445i c5445i = (C5445i) weakHashMap.get(runnable);
            if (c5445i == null) {
                return;
            }
            Runnable runnable2 = c5445i.f13256a;
            if (runnable2 != null) {
                int intValue = c5445i.b.intValue();
                if (intValue == 1024) {
                    runnable2.run();
                } else if (intValue == 0) {
                    handlerC5438b = b;
                } else if (intValue == 1) {
                    handlerC5438b = d;
                    if (handlerC5438b != null) {
                        handlerC5438b.removeCallbacks(runnable2);
                    }
                } else if (intValue == 2) {
                    handlerC5438b = g;
                    if (handlerC5438b != null) {
                        handlerC5438b.removeCallbacks(runnable2);
                    }
                } else if (intValue == 3 && (handlerC5438b = f) != null) {
                    handlerC5438b.removeCallbacks(runnable2);
                }
                synchronized (weakHashMap) {
                    weakHashMap.remove(runnable);
                }
            }
        }
    }
}
