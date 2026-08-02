package X10;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.J;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    LayoutInflater f33961a;

    /* renamed from: b, reason: collision with root package name */
    Handler f33962b;

    /* renamed from: c, reason: collision with root package name */
    d f33963c;

    /* renamed from: d, reason: collision with root package name */
    private final J<C0603c> f33964d;

    final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            C0603c c0603c = (C0603c) message.obj;
            if (c0603c.f33972f) {
                c.this.f33963c.d(c0603c);
                return true;
            }
            if (c0603c.f33970d == null) {
                c0603c.f33970d = c.this.f33961a.inflate(c0603c.f33969c, (ViewGroup) c0603c.f33968b, false);
            }
            AJ.d dVar = c0603c.f33971e;
            View view = c0603c.f33970d;
            int i11 = c0603c.f33969c;
            androidx.recyclerview.widget.g gVar = c0603c.f33968b;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            dVar.f639b.invoke(view);
            c.this.f33963c.d(c0603c);
            return true;
        }
    }

    private static class b extends LayoutInflater {

        /* renamed from: a, reason: collision with root package name */
        private static final String[] f33966a = {"android.widget.", "android.webkit.", "android.app."};

        b(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public final LayoutInflater cloneInContext(Context context) {
            return new b(context);
        }

        @Override // android.view.LayoutInflater
        protected final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            String[] strArr = f33966a;
            for (int i11 = 0; i11 < 3; i11++) {
                try {
                    createView = createView(str, strArr[i11], attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X10.c$c, reason: collision with other inner class name */
    static class C0603c {

        /* renamed from: a, reason: collision with root package name */
        c f33967a;

        /* renamed from: b, reason: collision with root package name */
        androidx.recyclerview.widget.g f33968b;

        /* renamed from: c, reason: collision with root package name */
        int f33969c;

        /* renamed from: d, reason: collision with root package name */
        View f33970d;

        /* renamed from: e, reason: collision with root package name */
        AJ.d f33971e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f33972f;

        C0603c() {
        }
    }

    private static class d extends Thread {

        /* renamed from: c, reason: collision with root package name */
        private static final d f33973c;

        /* renamed from: a, reason: collision with root package name */
        private ArrayBlockingQueue<C0603c> f33974a;

        /* renamed from: b, reason: collision with root package name */
        private x2.h<C0603c> f33975b;

        static {
            d dVar = new d();
            dVar.f33974a = new ArrayBlockingQueue<>(10);
            dVar.f33975b = new x2.h<>(10);
            f33973c = dVar;
            dVar.start();
        }

        public static d b() {
            return f33973c;
        }

        public final void a(C0603c c0603c) {
            try {
                this.f33974a.put(c0603c);
            } catch (InterruptedException e11) {
                throw new RuntimeException("Failed to enqueue async inflate request", e11);
            }
        }

        public final C0603c c() {
            C0603c a11 = this.f33975b.a();
            return a11 == null ? new C0603c() : a11;
        }

        public final void d(C0603c c0603c) {
            c0603c.f33971e = null;
            c0603c.f33967a = null;
            c0603c.f33968b = null;
            c0603c.f33969c = 0;
            c0603c.f33970d = null;
            c0603c.f33972f = false;
            this.f33975b.b(c0603c);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            C0603c take;
            while (true) {
                try {
                    take = this.f33974a.take();
                    try {
                    } catch (RuntimeException e11) {
                        Log.w("CancellableAsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e11);
                    }
                } catch (InterruptedException e12) {
                    Log.w("CancellableAsyncLayoutInflater", e12);
                }
                if (take.f33972f) {
                    d(take);
                } else {
                    take.f33970d = take.f33967a.f33961a.inflate(take.f33969c, (ViewGroup) take.f33968b, false);
                    Message.obtain(take.f33967a.f33962b, 0, take).sendToTarget();
                }
            }
        }
    }

    public c(@NonNull Context context) {
        a aVar = new a();
        this.f33961a = new b(context);
        this.f33962b = new Handler(aVar);
        this.f33963c = d.b();
        this.f33964d = new J<>((Object) null);
    }

    public final void a() {
        X10.b block = new X10.b();
        J<C0603c> j11 = this.f33964d;
        j11.getClass();
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = j11.f38646a;
        int i11 = j11.f38647b;
        for (int i12 = 0; i12 < i11; i12++) {
            block.invoke(objArr[i12]);
        }
        j11.c();
    }

    public final void b(int i11, androidx.recyclerview.widget.g gVar, @NonNull AJ.d dVar) {
        C0603c c11 = this.f33963c.c();
        c11.f33967a = this;
        c11.f33969c = i11;
        c11.f33968b = gVar;
        c11.f33971e = dVar;
        c11.f33972f = false;
        this.f33964d.b(c11);
        this.f33963c.a(c11);
    }
}
