package L3;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import m3.C8072n;
import m3.RunnableC8070l;

/* renamed from: L3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3572l extends Surface {

    /* renamed from: d, reason: collision with root package name */
    private static int f16367d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f16368e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16369a;

    /* renamed from: b, reason: collision with root package name */
    private final a f16370b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16371c;

    /* renamed from: L3.l$a */
    private static class a extends HandlerThread implements Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private RunnableC8070l f16372a;

        /* renamed from: b, reason: collision with root package name */
        private Handler f16373b;

        /* renamed from: c, reason: collision with root package name */
        private Error f16374c;

        /* renamed from: d, reason: collision with root package name */
        private RuntimeException f16375d;

        /* renamed from: e, reason: collision with root package name */
        private C3572l f16376e;

        private void b(int i11) throws C8072n.a {
            this.f16372a.getClass();
            this.f16372a.b(i11);
            this.f16376e = new C3572l(this, this.f16372a.a(), i11 != 0);
        }

        public final C3572l a(int i11) {
            boolean z11;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.f16373b = handler;
            this.f16372a = new RunnableC8070l(handler);
            synchronized (this) {
                z11 = false;
                this.f16373b.obtainMessage(1, i11, 0).sendToTarget();
                while (this.f16376e == null && this.f16375d == null && this.f16374c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f16375d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f16374c;
            if (error != null) {
                throw error;
            }
            C3572l c3572l = this.f16376e;
            c3572l.getClass();
            return c3572l;
        }

        public final void c() {
            this.f16373b.getClass();
            this.f16373b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            try {
                if (i11 == 1) {
                    try {
                        try {
                            b(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                            return true;
                        } catch (RuntimeException e11) {
                            m3.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                            this.f16375d = e11;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e12) {
                        m3.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                        this.f16374c = e12;
                        synchronized (this) {
                            notify();
                        }
                    } catch (C8072n.a e13) {
                        m3.s.d("PlaceholderSurface", "Failed to initialize placeholder surface", e13);
                        this.f16375d = new IllegalStateException(e13);
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i11 == 2) {
                    try {
                        this.f16372a.getClass();
                        this.f16372a.c();
                        return true;
                    } catch (Throwable th2) {
                        try {
                            m3.s.d("PlaceholderSurface", "Failed to release placeholder surface", th2);
                        } finally {
                            quit();
                        }
                    }
                }
                return true;
            } catch (Throwable th3) {
                synchronized (this) {
                    notify();
                    throw th3;
                }
            }
        }
    }

    C3572l(a aVar, SurfaceTexture surfaceTexture, boolean z11) {
        super(surfaceTexture);
        this.f16370b = aVar;
        this.f16369a = z11;
    }

    public static synchronized boolean a() {
        int i11;
        boolean z11;
        synchronized (C3572l.class) {
            try {
                if (!f16368e) {
                    try {
                    } catch (C8072n.a e11) {
                        m3.s.c("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e11.getMessage());
                    }
                    if (C8072n.h()) {
                        i11 = C8072n.i() ? 1 : 2;
                        f16367d = i11;
                        f16368e = true;
                    }
                    i11 = 0;
                    f16367d = i11;
                    f16368e = true;
                }
                z11 = f16367d != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    public static C3572l b(boolean z11) {
        G10.a.h(!z11 || a());
        return new a("ExoPlayer:PlaceholderSurface").a(z11 ? f16367d : 0);
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f16370b) {
            try {
                if (!this.f16371c) {
                    this.f16370b.c();
                    this.f16371c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
