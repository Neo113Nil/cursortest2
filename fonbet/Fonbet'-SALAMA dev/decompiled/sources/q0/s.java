package q0;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import d6.C0977k;
import e3.C1023h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class s extends Service {

    /* renamed from: y, reason: collision with root package name */
    public static final boolean f15776y = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public I4.j f15777a;

    /* renamed from: b, reason: collision with root package name */
    public final C1023h f15778b = new C1023h(this);

    /* renamed from: c, reason: collision with root package name */
    public final h f15779c = new h(this, "android.media.session.MediaController", -1, -1, null);

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15780d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final r.b f15781e = new r.b();

    /* renamed from: f, reason: collision with root package name */
    public final R1.c f15782f;

    /* renamed from: x, reason: collision with root package name */
    public MediaSessionCompat$Token f15783x;

    public s() {
        R1.c cVar = new R1.c(4);
        cVar.f5887b = this;
        this.f15782f = cVar;
    }

    public final void a(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        I4.j jVar = this.f15777a;
        jVar.j(str, bundle);
        ((s) jVar.f3681e).f15782f.post(new H2.q(jVar, str, bundle));
    }

    public abstract C0977k b(Bundle bundle);

    public abstract void c(String str, n nVar, Bundle bundle);

    public abstract void d(String str, n nVar);

    public final void e(String str, h hVar, Bundle bundle, Bundle bundle2) {
        f fVar = new f(this, str, hVar, str, bundle, bundle2);
        if (bundle == null) {
            ((AudioService) this).c(str, fVar, null);
        } else {
            c(str, fVar, bundle);
        }
        if (fVar.b()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + hVar.f15739a + " id=" + str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((j) this.f15777a.f3678b).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            this.f15777a = new m(this);
        } else if (i7 >= 26) {
            this.f15777a = new l(this);
        } else {
            this.f15777a = new I4.j(this);
        }
        this.f15777a.k();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f15782f.f5887b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
