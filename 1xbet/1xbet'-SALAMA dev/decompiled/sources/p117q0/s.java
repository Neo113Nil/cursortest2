package p117q0;

import H2.q;
import I4.j;
import R1.c;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import com.ryanheise.audioservice.AudioService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import p028d6.k;
import p033e3.h;
import p122r.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends Service {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f15782y = Log.isLoggable("MBServiceCompat", 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f15784b = new h(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f15785c = new h(this, "android.media.session.MediaController", -1, -1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f15786d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f15787e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f15788f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public MediaSessionCompat$Token f15789x;

    public s() {
        c cVar = new c(4);
        cVar.f5887b = this;
        this.f15788f = cVar;
    }

    public final void a(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        j jVar = this.f15783a;
        jVar.j(str, bundle);
        ((s) jVar.f3681e).f15788f.post(new q(jVar, str, bundle));
    }

    public abstract k b(Bundle bundle);

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
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + hVar.f15745a + " id=" + str);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return ((j) this.f15783a.f3678b).onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            this.f15783a = new m(this);
        } else if (i7 >= 26) {
            this.f15783a = new l(this);
        } else {
            this.f15783a = new j(this);
        }
        this.f15783a.k();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f15788f.f5887b = null;
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
