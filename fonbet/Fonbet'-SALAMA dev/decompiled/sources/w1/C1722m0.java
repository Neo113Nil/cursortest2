package w1;

import G4.InterfaceC0291y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;
import com.flurry.android.marketing.messaging.notification.FlurryMessage;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e4.C1031e;
import i.InterfaceC1224b;
import io.sentry.SentryLogEvent;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.HashMap;
import javax.crypto.Cipher;
import o3.BinderC1507b;
import t4.InterfaceC1609a;

/* renamed from: w1.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1722m0 implements F1.c, InterfaceC0291y, O1.h, R1.j, W3.j, Continuation, InterfaceC1224b, q4.g, InterfaceC1609a, FlurryMessagingListener, Z0, Y0, A5.q {

    /* renamed from: b, reason: collision with root package name */
    public static C1722m0 f17790b = null;

    /* renamed from: c, reason: collision with root package name */
    public static A5.h f17791c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f17792d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f17793e = false;

    /* renamed from: f, reason: collision with root package name */
    public static String f17794f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17795a;

    public /* synthetic */ C1722m0(int i7) {
        this.f17795a = i7;
    }

    public static synchronized void i() {
        synchronized (C1722m0.class) {
            if (f17790b == null) {
                f17790b = new C1722m0(0);
            }
        }
    }

    public static void j(Context context, String str) {
        F2.T0 e7 = F2.T0.e();
        synchronized (e7.f2638e) {
            com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to opening debug menu.", e7.f2639f != null);
            try {
                e7.f2639f.zzn(new BinderC1507b(context), str);
            } catch (RemoteException e8) {
                J2.j.e("Unable to open debug menu.", e8);
            }
        }
    }

    public static void k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", e1.k.a(4));
        hashMap.put("token", str);
        new Handler(Looper.getMainLooper()).post(new v1.c(2, hashMap));
    }

    public static boolean l(int i7, FlurryMessage flurryMessage, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", e1.k.a(i7));
        hashMap.put("title", flurryMessage.getTitle());
        hashMap.put(SentryLogEvent.JsonKeys.BODY, flurryMessage.getBody());
        hashMap.put("clickAction", flurryMessage.getClickAction());
        hashMap.put("appData", flurryMessage.getAppData());
        f17792d = false;
        f17793e = !z4;
        new Handler(Looper.getMainLooper()).post(new v1.c(1, hashMap));
        synchronized (f17791c) {
            if (!f17793e) {
                try {
                    f17791c.wait(300L);
                } catch (InterruptedException e7) {
                    Log.e("FlurryFlutterPlugin", "Interrupted Exception!", e7);
                }
            }
        }
        return f17792d;
    }

    public static void m(boolean z4) {
        F2.T0 e7 = F2.T0.e();
        synchronized (e7.f2638e) {
            com.google.android.gms.common.internal.D.k("MobileAds.initialize() must be called prior to setting app muted state.", e7.f2639f != null);
            try {
                e7.f2639f.zzp(z4);
            } catch (RemoteException e8) {
                J2.j.e("Unable to set app mute state.", e8);
            }
        }
    }

    @Override // R1.j
    public R1.k a(R1.i iVar) {
        int i7 = v2.t.f17153a;
        if (i7 < 23 || i7 < 31) {
            return new M4.e().a(iVar);
        }
        int g3 = v2.i.g(iVar.f5921c.f283C);
        Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + v2.t.B(g3));
        return new P2(g3).a(iVar);
    }

    @Override // O1.h
    public long b(F1.h hVar) {
        return -1L;
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        switch (this.f17795a) {
            case 12:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // O1.h
    public F1.s e() {
        return new F1.n(-9223372036854775807L);
    }

    @Override // w1.Z0
    public Y0 g(int i7) {
        return new C1718l0(26);
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        E e7 = new E(inputStream, 2);
        C1740r0 c1740r0 = new C1740r0();
        c1740r0.f17841a = e7.readUTF();
        return c1740r0;
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        ((A5.p) rVar).success(null);
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public void onNotificationCancelled(FlurryMessage flurryMessage) {
        if (f17791c != null) {
            l(3, flurryMessage, false);
        }
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public boolean onNotificationClicked(FlurryMessage flurryMessage) {
        if (f17791c != null) {
            return l(2, flurryMessage, true);
        }
        return false;
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public boolean onNotificationReceived(FlurryMessage flurryMessage) {
        if (f17791c != null) {
            return l(1, flurryMessage, true);
        }
        return false;
    }

    @Override // com.flurry.android.marketing.messaging.FlurryMessagingListener
    public void onTokenRefresh(String str) {
        f17794f = str;
        if (f17791c != null) {
            k(str);
        }
    }

    @Override // q4.g
    public boolean p(Object obj) {
        switch (this.f17795a) {
            case zzbbd.zzt.zzm /* 21 */:
                return !((Boolean) obj).booleanValue();
            default:
                return ((p4.c) obj).f15703e;
        }
    }

    @Override // t4.InterfaceC1609a
    public v4.p q(v4.k kVar, v4.p pVar, boolean z4) {
        return null;
    }

    @Override // w1.Y0
    public void s(Object obj, OutputStream outputStream) {
        C1740r0 c1740r0 = (C1740r0) obj;
        if (c1740r0 == null) {
            return;
        }
        D d7 = new D(outputStream, 2);
        d7.writeUTF(c1740r0.f17841a);
        d7.flush();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new C1031e("INTERNAL_ERROR", zzag.zzb(exception != null ? exception.getMessage() : "")));
    }

    public C1722m0(RecyclerView recyclerView) {
        this.f17795a = 2;
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
