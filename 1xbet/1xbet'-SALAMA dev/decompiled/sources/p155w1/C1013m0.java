package p155w1;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import F1.c;
import F1.n;
import F1.s;
import F2.T0;
import G4.InterfaceC0291y;
import M4.e;
import O1.h;
import R1.i;
import R1.j;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.SentryLogEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.HashMap;
import javax.crypto.Cipher;
import p031e1.k;
import p058i.InterfaceC0905b;
import p105o3.b;
import p120q4.g;
import p141t4.a;
import p151v2.t;

/* JADX INFO: renamed from: w1.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1013m0 implements c, InterfaceC0291y, h, j, W3.j, Continuation, InterfaceC0905b, g, a, FlurryMessagingListener, Z0, Y0, q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C1013m0 f17796b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static A5.h f17797c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f17798d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f17799e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static String f17800f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17801a;

    public /* synthetic */ C1013m0(int i7) {
        this.f17801a = i7;
    }

    public static synchronized void i() {
        if (f17796b == null) {
            f17796b = new C1013m0(0);
        }
    }

    public static void j(Context context, String str) {
        T0 t0E = T0.e();
        synchronized (t0E.f2638e) {
            D.k("MobileAds.initialize() must be called prior to opening debug menu.", t0E.f2639f != null);
            try {
                t0E.f2639f.zzn(new b(context), str);
            } catch (RemoteException e7) {
                J2.j.e("Unable to open debug menu.", e7);
            }
        }
    }

    public static void k(String str) {
        HashMap map = new HashMap();
        map.put("type", k.a(4));
        map.put("token", str);
        new Handler(Looper.getMainLooper()).post(new v1.c(2, map));
    }

    public static boolean l(int i7, FlurryMessage flurryMessage, boolean z4) {
        HashMap map = new HashMap();
        map.put("type", k.a(i7));
        map.put("title", flurryMessage.getTitle());
        map.put(SentryLogEvent.JsonKeys.BODY, flurryMessage.getBody());
        map.put("clickAction", flurryMessage.getClickAction());
        map.put("appData", flurryMessage.getAppData());
        f17798d = false;
        f17799e = !z4;
        new Handler(Looper.getMainLooper()).post(new v1.c(1, map));
        synchronized (f17797c) {
            if (!f17799e) {
                try {
                    f17797c.wait(300L);
                } catch (InterruptedException e7) {
                    Log.e("FlurryFlutterPlugin", "Interrupted Exception!", e7);
                }
            }
        }
        return f17798d;
    }

    public static void m(boolean z4) {
        T0 t0E = T0.e();
        synchronized (t0E.f2638e) {
            D.k("MobileAds.initialize() must be called prior to setting app muted state.", t0E.f2639f != null);
            try {
                t0E.f2639f.zzp(z4);
            } catch (RemoteException e7) {
                J2.j.e("Unable to set app mute state.", e7);
            }
        }
    }

    @Override // R1.j
    public R1.k a(i iVar) {
        int i7 = t.f17159a;
        if (i7 < 23 || i7 < 31) {
            return new e().a(iVar);
        }
        int iG = p151v2.i.g(iVar.f5921c.f283C);
        Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + t.B(iG));
        return new P2(iG).a(iVar);
    }

    @Override // O1.h
    public long b(F1.h hVar) {
        return -1L;
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        switch (this.f17801a) {
            case 12:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // O1.h
    public s e() {
        return new n(-9223372036854775807L);
    }

    @Override // p155w1.Z0
    public Y0 g(int i7) {
        return new C1009l0(26);
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) {
        E e7 = new E(inputStream, 2);
        C1031r0 c1031r0 = new C1031r0();
        c1031r0.f17847a = e7.readUTF();
        return c1031r0;
    }

    @Override // A5.q
    public void onMethodCall(o oVar, r rVar) {
        ((p) rVar).success(null);
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public void onNotificationCancelled(FlurryMessage flurryMessage) {
        if (f17797c != null) {
            l(3, flurryMessage, false);
        }
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public boolean onNotificationClicked(FlurryMessage flurryMessage) {
        if (f17797c != null) {
            return l(2, flurryMessage, true);
        }
        return false;
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public boolean onNotificationReceived(FlurryMessage flurryMessage) {
        if (f17797c != null) {
            return l(1, flurryMessage, true);
        }
        return false;
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public void onTokenRefresh(String str) {
        f17800f = str;
        if (f17797c != null) {
            k(str);
        }
    }

    @Override // p120q4.g
    public boolean p(Object obj) {
        switch (this.f17801a) {
            case zzbbd.zzt.zzm /* 21 */:
                return !((Boolean) obj).booleanValue();
            default:
                return ((p114p4.c) obj).f15709e;
        }
    }

    @Override // p141t4.a
    public v4.p q(v4.k kVar, v4.p pVar, boolean z4) {
        return null;
    }

    @Override // p155w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        C1031r0 c1031r0 = (C1031r0) obj;
        if (c1031r0 == null) {
            return;
        }
        D d7 = new D(outputStream, 2);
        d7.writeUTF(c1031r0.f17847a);
        d7.flush();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new p034e4.e("INTERNAL_ERROR", zzag.zzb(exception != null ? exception.getMessage() : "")));
    }

    public C1013m0(RecyclerView recyclerView) {
        this.f17801a = 2;
    }

    @Override // G4.InterfaceC0291y
    public void run() {
    }

    @Override // F1.c
    public long c(long j) {
        return j;
    }

    @Override // O1.h
    public void f(long j) {
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public void onNonFlurryNotificationReceived(Object obj) {
    }
}
