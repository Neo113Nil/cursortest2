package p000;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg1 {

    /* JADX INFO: renamed from: c */
    public static volatile Handler f9757c;

    /* JADX INFO: renamed from: a */
    public static final char[] f9755a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f9756b = new char[64];

    /* JADX INFO: renamed from: d */
    public static final char[] f9758d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: e */
    public static final C0794v8 f9759e = new C0794v8("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");

    /* JADX INFO: renamed from: f */
    public static final C0794v8 f9760f = new C0794v8("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");

    /* JADX INFO: renamed from: g */
    public static final C0794v8 f9761g = new C0794v8("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    /* JADX INFO: renamed from: h */
    public static final String[] f9762h = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: i */
    public static final String[] f9763i = {"ad_impression"};

    /* JADX INFO: renamed from: j */
    public static final String[] f9764j = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: k */
    public static final String[] f9765k = {"ad_impression"};

    /* JADX INFO: renamed from: l */
    public static final String[] f9766l = {"ad_impression", "in_app_purchase"};

    /* JADX INFO: renamed from: m */
    public static final String[] f9767m = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: n */
    public static final String[] f9768n = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    /* JADX INFO: renamed from: a */
    public static final String m5890a(Object[] objArr, int i, int i2, AbstractC0416l0 abstractC0416l0) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == abstractC0416l0) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static void m5891b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        C0270h1.m2190f("You must call this method on the main thread");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5892c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public static final void m5893d(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0095 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005c, B:29:0x0070, B:31:0x0078, B:33:0x007e, B:35:0x0084, B:38:0x0095, B:39:0x009d, B:40:0x009e, B:41:0x00a5, B:20:0x0047, B:24:0x0052), top: B:58:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r1.mo583j(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0092 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5894e(u10 u10Var, kx0 kx0Var, boolean z, AbstractC0882xm abstractC0882xm) throws Throwable {
        v10 v10Var;
        C0613qc c0613qc;
        InterfaceC0690sf interfaceC0690sf;
        C0613qc c0613qc2;
        u10 u10Var2;
        Object obj;
        g72 g72Var;
        InterfaceC0690sf interfaceC0690sf2;
        InterfaceC0690sf interfaceC0690sf3;
        if (abstractC0882xm instanceof v10) {
            v10Var = (v10) abstractC0882xm;
            int i = v10Var.f7997r;
            if ((i & Integer.MIN_VALUE) != 0) {
                v10Var.f7997r = i - Integer.MIN_VALUE;
            } else {
                v10Var = new v10(abstractC0882xm);
            }
        } else {
            v10Var = new v10(abstractC0882xm);
        }
        Object objM4054b = v10Var.f7996q;
        int i2 = v10Var.f7997r;
        EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
        try {
            if (i2 == 0) {
                wo1.m5395v(objM4054b);
                if (u10Var instanceof gd1) {
                    throw ((gd1) u10Var).f2709j;
                }
                C0650rc c0650rc = kx0Var.f4590o;
                c0650rc.getClass();
                c0613qc = new C0613qc(c0650rc);
                interfaceC0690sf2 = kx0Var;
                v10Var.f7992m = u10Var;
                v10Var.f7993n = interfaceC0690sf2;
                v10Var.f7994o = c0613qc;
                v10Var.f7995p = z;
                v10Var.f7997r = 1;
                objM4054b = c0613qc.m4054b(v10Var);
                if (objM4054b == enumC0513nn) {
                    C0613qc c0613qc3 = c0613qc;
                    u10Var2 = u10Var;
                    c0613qc2 = c0613qc3;
                    interfaceC0690sf = interfaceC0690sf2;
                    if (!((Boolean) objM4054b).booleanValue()) {
                        if (z) {
                            interfaceC0690sf.mo4319e(null);
                        }
                        return kf1.f4365a;
                    }
                    obj = c0613qc2.f6461j;
                    g72Var = AbstractC0724tc.f7426p;
                    if (obj == g72Var) {
                        throw new IllegalStateException("`hasNext()` has not been invoked");
                    }
                    c0613qc2.f6461j = g72Var;
                    if (obj == AbstractC0724tc.f7422l) {
                        Throwable thM4329q = c0613qc2.f6463l.m4329q();
                        int i3 = v91.f8139a;
                        throw thM4329q;
                    }
                    v10Var.f7992m = u10Var2;
                    v10Var.f7993n = interfaceC0690sf;
                    v10Var.f7994o = c0613qc2;
                    v10Var.f7995p = z;
                    v10Var.f7997r = 2;
                }
                interfaceC0690sf3 = interfaceC0690sf;
                return enumC0513nn;
            }
            if (i2 == 1) {
                z = v10Var.f7995p;
                c0613qc2 = v10Var.f7994o;
                InterfaceC0690sf interfaceC0690sf4 = v10Var.f7993n;
                u10Var2 = v10Var.f7992m;
                wo1.m5395v(objM4054b);
                interfaceC0690sf = interfaceC0690sf4;
                if (!((Boolean) objM4054b).booleanValue()) {
                    if (z) {
                        interfaceC0690sf.mo4319e(null);
                    }
                    return kf1.f4365a;
                }
                obj = c0613qc2.f6461j;
                g72Var = AbstractC0724tc.f7426p;
                if (obj == g72Var) {
                    throw new IllegalStateException("`hasNext()` has not been invoked");
                }
                c0613qc2.f6461j = g72Var;
                if (obj == AbstractC0724tc.f7422l) {
                    Throwable thM4329q2 = c0613qc2.f6463l.m4329q();
                    int i4 = v91.f8139a;
                    throw thM4329q2;
                }
                v10Var.f7992m = u10Var2;
                v10Var.f7993n = interfaceC0690sf;
                v10Var.f7994o = c0613qc2;
                v10Var.f7995p = z;
                v10Var.f7997r = 2;
            } else {
                if (i2 != 2) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = v10Var.f7995p;
                c0613qc2 = v10Var.f7994o;
                InterfaceC0690sf interfaceC0690sf5 = v10Var.f7993n;
                u10Var2 = v10Var.f7992m;
                wo1.m5395v(objM4054b);
                interfaceC0690sf3 = interfaceC0690sf5;
            }
            interfaceC0690sf3 = interfaceC0690sf;
            u10 u10Var3 = u10Var2;
            c0613qc = c0613qc2;
            u10Var = u10Var3;
            interfaceC0690sf2 = interfaceC0690sf3;
            v10Var.f7992m = u10Var;
            v10Var.f7993n = interfaceC0690sf2;
            v10Var.f7994o = c0613qc;
            v10Var.f7995p = z;
            v10Var.f7997r = 1;
            objM4054b = c0613qc.m4054b(v10Var);
            if (objM4054b == enumC0513nn) {
                C0613qc c0613qc4 = c0613qc;
                u10Var2 = u10Var;
                c0613qc2 = c0613qc4;
                interfaceC0690sf = interfaceC0690sf2;
                if (!((Boolean) objM4054b).booleanValue()) {
                    if (z) {
                        interfaceC0690sf.mo4319e(null);
                    }
                    return kf1.f4365a;
                }
                obj = c0613qc2.f6461j;
                g72Var = AbstractC0724tc.f7426p;
                if (obj == g72Var) {
                    throw new IllegalStateException("`hasNext()` has not been invoked");
                }
                c0613qc2.f6461j = g72Var;
                if (obj == AbstractC0724tc.f7422l) {
                    Throwable thM4329q3 = c0613qc2.f6463l.m4329q();
                    int i5 = v91.f8139a;
                    throw thM4329q3;
                }
                v10Var.f7992m = u10Var2;
                v10Var.f7993n = interfaceC0690sf;
                v10Var.f7994o = c0613qc2;
                v10Var.f7995p = z;
                v10Var.f7997r = 2;
            }
            interfaceC0690sf3 = interfaceC0690sf;
            return enumC0513nn;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    kx0Var.mo4319e(cancellationException);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0104cn m5895f(InterfaceC0104cn interfaceC0104cn, InterfaceC0144dn interfaceC0144dn) {
        interfaceC0144dn.getClass();
        if (af0.m187a(interfaceC0104cn.getKey(), interfaceC0144dn)) {
            return interfaceC0104cn;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static int m5896g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = bitmap.getConfig();
        sb.append("[");
        sb.append(width);
        sb.append("x");
        sb.append(height);
        sb.append("] ");
        sb.append(config);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: h */
    public static int m5897h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = yg1.f9302a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m5898i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static Handler m5899j() {
        if (f9757c == null) {
            synchronized (zg1.class) {
                try {
                    if (f9757c == null) {
                        f9757c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f9757c;
    }

    /* JADX INFO: renamed from: k */
    public static int m5900k(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* JADX INFO: renamed from: l */
    public static int m5901l(int i, Object obj) {
        return m5900k(obj == null ? 0 : obj.hashCode(), i);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m5902m(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m5903n(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static InterfaceC0180en m5904o(InterfaceC0104cn interfaceC0104cn, InterfaceC0144dn interfaceC0144dn) {
        interfaceC0144dn.getClass();
        return af0.m187a(interfaceC0104cn.getKey(), interfaceC0144dn) ? C0301hw.f3348j : interfaceC0104cn;
    }

    /* JADX INFO: renamed from: p */
    public static void m5905p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h(str);
    }

    /* JADX INFO: renamed from: q */
    public static void m5906q(String str, int i) {
        if (i > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m5907r(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
