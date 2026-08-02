package p000;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.net.ProxySelector;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x80 implements q71, fi1, qu0, lx0, nb1, InterfaceC0043az, iq0, InterfaceC0766uh, xp1, at1, ju1 {

    /* JADX INFO: renamed from: k */
    public static x80 f8855k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ x80 f8856l = new x80(24);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ x80 f8857m = new x80(25);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ x80 f8858n = new x80(26);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ x80 f8859o = new x80(27);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ x80 f8860p = new x80(28);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ x80 f8861q = new x80(29);

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8862j;

    public /* synthetic */ x80(int i) {
        this.f8862j = i;
    }

    /* JADX INFO: renamed from: e */
    public static C0047b2 m5607e(wo0 wo0Var, yo0 yo0Var) {
        xc1 xc1Var;
        C0312i6 c0312i6M5608h = m5608h(wo0Var);
        if (!yo0Var.equals(yo0.m5817o())) {
            String strM5818n = !TextUtils.isEmpty(yo0Var.m5818n()) ? yo0Var.m5818n() : null;
            if (yo0Var.m5820q()) {
                dp0 dp0VarM5819p = yo0Var.m5819p();
                String strM1279p = !TextUtils.isEmpty(dp0VarM5819p.m1279p()) ? dp0VarM5819p.m1279p() : null;
                String strM1278o = !TextUtils.isEmpty(dp0VarM5819p.m1278o()) ? dp0VarM5819p.m1278o() : null;
                if (TextUtils.isEmpty(strM1278o)) {
                    C0270h1.m2190f("Text model must have a color");
                    return null;
                }
                xc1Var = new xc1(strM1279p, strM1278o);
            } else {
                xc1Var = null;
            }
            if (TextUtils.isEmpty(strM5818n)) {
                C0270h1.m2190f("Button model must have a color");
                return null;
            }
            if (xc1Var == null) {
                C0270h1.m2190f("Button model must have text");
                return null;
            }
            c0312i6M5608h.f3448l = new C0909yc(xc1Var, strM5818n);
        }
        return new C0047b2((String) c0312i6M5608h.f3447k, (C0909yc) c0312i6M5608h.f3448l);
    }

    /* JADX INFO: renamed from: h */
    public static C0312i6 m5608h(wo0 wo0Var) {
        C0312i6 c0312i6 = new C0312i6(3, false);
        if (!TextUtils.isEmpty(wo0Var.m5369n())) {
            String strM5369n = wo0Var.m5369n();
            if (!TextUtils.isEmpty(strM5369n)) {
                c0312i6.f3447k = strM5369n;
            }
        }
        return c0312i6;
    }

    /* JADX INFO: renamed from: l */
    public static xc1 m5609l(dp0 dp0Var) {
        String strM1278o = !TextUtils.isEmpty(dp0Var.m1278o()) ? dp0Var.m1278o() : null;
        String strM1279p = !TextUtils.isEmpty(dp0Var.m1279p()) ? dp0Var.m1279p() : null;
        if (!TextUtils.isEmpty(strM1278o)) {
            return new xc1(strM1279p, strM1278o);
        }
        C0270h1.m2190f("Text model must have a color");
        return null;
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: E */
    public gq1 mo304E(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // p000.ju1
    /* JADX INFO: renamed from: a */
    public Object mo153a() {
        switch (this.f8862j) {
            case 25:
                return new Boolean(((Boolean) jr1.f4078b.get()).booleanValue());
            case 26:
                return new Boolean(((Boolean) vr1.f8256a.get()).booleanValue());
            case 27:
                List list = jx1.f4164a;
                ar1.f615k.get();
                return (String) br1.f968a.m99w(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 28:
                List list2 = jx1.f4164a;
                return (String) nr1.f5509c.get();
            default:
                List list3 = jx1.f4164a;
                ar1.f615k.get();
                return Integer.valueOf((int) ((Long) br1.f968a.m97u(68, 10000L, "measurement.upload.max_conversions_per_day").get()).longValue());
        }
    }

    @Override // p000.q71
    /* JADX INFO: renamed from: b */
    public void mo154b(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }

    @Override // p000.q71, p000.InterfaceC0043az
    /* JADX INFO: renamed from: c */
    public Object mo155c() {
        switch (this.f8862j) {
            case 1:
                ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, ca0.m910e("grpc-timer-%d"));
                try {
                    scheduledExecutorServiceNewScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(scheduledExecutorServiceNewScheduledThreadPool, Boolean.TRUE);
                    break;
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    dd0.m1163h(e2);
                    return null;
                }
                return Executors.unconfigurableScheduledExecutorService(scheduledExecutorServiceNewScheduledThreadPool);
            default:
                try {
                    return new q41(MessageDigest.getInstance("SHA-256"));
                } catch (NoSuchAlgorithmException e3) {
                    dd0.m1163h(e3);
                    return null;
                }
        }
    }

    @Override // p000.at1
    /* JADX INFO: renamed from: d */
    public /* synthetic */ String mo481d(String str, String str2) {
        return null;
    }

    @Override // p000.fi1
    /* JADX INFO: renamed from: f */
    public di1 mo1870f(Class cls) {
        return new rj0();
    }

    @Override // p000.InterfaceC0766uh
    /* JADX INFO: renamed from: g */
    public long mo159g() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.nb1
    public Object get() {
        return ProxySelector.getDefault();
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: j */
    public void mo161j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p000.lx0
    /* JADX INFO: renamed from: k */
    public void mo162k(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // p000.xp1
    /* JADX INFO: renamed from: r */
    public boolean mo320r(Class cls) {
        return false;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        return new xa1(f71Var.m1658d(Uri.class, ParcelFileDescriptor.class), 0);
    }

    @Override // p000.qu0
    /* JADX INFO: renamed from: i */
    public void mo2594i(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
