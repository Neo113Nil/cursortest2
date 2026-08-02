package O9;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayList f20063g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f20064a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f20065b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20066c;

    /* renamed from: d, reason: collision with root package name */
    private final Camera f20067d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f20068e;

    /* renamed from: f, reason: collision with root package name */
    private final Camera.AutoFocusCallback f20069f;

    /* renamed from: O9.a$a, reason: collision with other inner class name */
    final class C0402a implements Handler.Callback {
        C0402a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i11 = message.what;
            a aVar = a.this;
            aVar.getClass();
            if (i11 != 1) {
                return false;
            }
            aVar.f();
            return true;
        }
    }

    final class b implements Camera.AutoFocusCallback {
        b() {
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z11, Camera camera) {
            a.this.f20068e.post(new Runnable() { // from class: O9.b
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    aVar.f20065b = false;
                    aVar.e();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f20063g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Camera camera, g gVar) {
        C0402a c0402a = new C0402a();
        this.f20069f = new b();
        this.f20068e = new Handler(c0402a);
        this.f20067d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        gVar.getClass();
        boolean contains = f20063g.contains(focusMode);
        this.f20066c = contains;
        Log.i("a", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e() {
        if (!this.f20064a && !this.f20068e.hasMessages(1)) {
            Handler handler = this.f20068e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!this.f20066c || this.f20064a || this.f20065b) {
            return;
        }
        try {
            this.f20067d.autoFocus(this.f20069f);
            this.f20065b = true;
        } catch (RuntimeException e11) {
            Log.w("a", "Unexpected exception while focusing", e11);
            e();
        }
    }

    public final void g() {
        this.f20064a = false;
        f();
    }

    public final void h() {
        this.f20064a = true;
        this.f20065b = false;
        this.f20068e.removeMessages(1);
        if (this.f20066c) {
            try {
                this.f20067d.cancelAutoFocus();
            } catch (RuntimeException e11) {
                Log.w("a", "Unexpected exception while cancelling focusing", e11);
            }
        }
    }
}
