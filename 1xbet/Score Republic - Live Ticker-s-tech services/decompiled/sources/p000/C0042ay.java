package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ay */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0042ay implements InterfaceC0845wm, ou0, InterfaceC0436lk, y80, r60, InterfaceC0254gm, nw0, InterfaceC0003a2 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f654j;

    public /* synthetic */ C0042ay(C0902y5 c0902y5) {
        this.f654j = 16;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m525a(Object obj, Object obj2) {
        throw new lb1("Fragment " + obj + obj2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m526c(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m527d(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m528e(String str, int i) {
        throw new IllegalArgumentException(str + i);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m529f(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m530g(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m531h(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    @Override // p000.InterfaceC0254gm
    public void accept(Object obj) {
        switch (this.f654j) {
            case 20:
                n80.m3496e("Event Triggered: " + ((String) obj));
                break;
            case 21:
            case 23:
            case 24:
            default:
                n80.m3498g("Cache write error: " + ((Throwable) obj).getMessage());
                break;
            case 22:
                n80.m3497f("App foreground rate limited ? : " + ((Boolean) obj));
                break;
            case 25:
                Locale locale = Locale.US;
                n80.m3497f("Successfully fetched " + ((C0599pz) obj).m4013q().size() + " messages from backend");
                break;
            case 26:
                n80.m3498g("Service fetch error: " + ((Throwable) obj).getMessage());
                break;
        }
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        switch (this.f654j) {
            case 17:
                return ((C0800ve) obj).m5154o();
            case 18:
                List list = (List) obj;
                zg1.m5905p(list, "source is null");
                return new ct0(list);
            case 19:
                return ((C0726te) obj).m4788p();
            default:
                return C0361jj.f3945a;
        }
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        n80.m3497f("Starting InAppMessaging runtime with Installation ID " + ((String) obj));
    }

    @Override // p000.y80
    public Object get() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p000.InterfaceC0845wm
    /* JADX INFO: renamed from: p */
    public Object mo92p(v92 v92Var) throws IOException {
        int i;
        Object obj;
        switch (this.f654j) {
            case 1:
                i = 403;
                break;
            case 2:
                i = -1;
                break;
            default:
                synchronized (v92Var.f8140a) {
                    p80.m3865j("Task is not yet complete", v92Var.f8142c);
                    if (v92Var.f8143d) {
                        throw new CancellationException("Task is already canceled.");
                    }
                    boolean zIsInstance = IOException.class.isInstance(v92Var.f8145f);
                    Exception exc = v92Var.f8145f;
                    if (zIsInstance) {
                        throw ((Throwable) IOException.class.cast(exc));
                    }
                    if (exc != null) {
                        throw new a41(exc);
                    }
                    obj = v92Var.f8144e;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    C0270h1.m2187c("SERVICE_NOT_AVAILABLE");
                    return null;
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    C0270h1.m2187c("INSTANCE_ID_RESET");
                    return null;
                }
                if (string2 != null) {
                    C0270h1.m2187c(string2);
                    return null;
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                C0270h1.m2187c("SERVICE_NOT_AVAILABLE");
                return null;
        }
        return Integer.valueOf(i);
    }

    @Override // p000.InterfaceC0003a2
    public void run() {
        n80.m3496e("Wrote to cache");
    }

    @Override // p000.nw0
    public boolean test(Object obj) {
        switch (this.f654j) {
            case 23:
                return !((Boolean) obj).booleanValue();
            default:
                C0011aa c0011aa = (C0011aa) obj;
                return (TextUtils.isEmpty(c0011aa.f105a) || TextUtils.isEmpty(c0011aa.f106b.f1178a)) ? false : true;
        }
    }

    @Override // p000.InterfaceC0436lk
    /* JADX INFO: renamed from: x */
    public Object mo532x(C0902y5 c0902y5) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(c0902y5);
    }

    public /* synthetic */ C0042ay(int i) {
        this.f654j = i;
    }
}
