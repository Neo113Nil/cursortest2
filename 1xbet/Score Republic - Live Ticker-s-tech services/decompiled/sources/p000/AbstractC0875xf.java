package p000;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: xf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0875xf {

    /* JADX INFO: renamed from: a */
    public static volatile FirebaseAnalytics f8939a;

    /* JADX INFO: renamed from: b */
    public static final Object f8940b = new Object();

    /* JADX INFO: renamed from: c */
    public static final C0794v8 f8941c = new C0794v8("io.grpc.internal.GrpcAttributes.securityLevel");

    /* JADX INFO: renamed from: d */
    public static final C0794v8 f8942d = new C0794v8("io.grpc.internal.GrpcAttributes.clientEagAttrs");

    /* JADX INFO: renamed from: e */
    public static final String[] f8943e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* JADX INFO: renamed from: f */
    public static final String[] f8944f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: g */
    public static final String[] f8945g = {"items"};

    /* JADX INFO: renamed from: h */
    public static final String[] f8946h = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m5646a(gd1 gd1Var, C0294hp c0294hp, Throwable th, AbstractC0882xm abstractC0882xm) {
        w10 w10Var;
        if (abstractC0882xm instanceof w10) {
            w10Var = (w10) abstractC0882xm;
            int i = w10Var.f8336o;
            if ((i & Integer.MIN_VALUE) != 0) {
                w10Var.f8336o = i - Integer.MIN_VALUE;
            } else {
                w10Var = new w10(abstractC0882xm);
            }
        } else {
            w10Var = new w10(abstractC0882xm);
        }
        Object obj = w10Var.f8335n;
        int i2 = w10Var.f8336o;
        try {
            if (i2 == 0) {
                wo1.m5395v(obj);
                w10Var.f8334m = th;
                w10Var.f8336o = 1;
                Object objMo928e = c0294hp.mo928e(gd1Var, th, w10Var);
                Object obj2 = EnumC0513nn.f5459j;
                if (objMo928e == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = w10Var.f8334m;
                wo1.m5395v(obj);
            }
            return kf1.f4365a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                vt1.m5190a(th2, th);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m5647b(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m5648c(j2, j)));
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public static long m5648c(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5649f(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0180en m5650g(InterfaceC0180en interfaceC0180en, InterfaceC0180en interfaceC0180en2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 4;
        boolean zBooleanValue = ((Boolean) interfaceC0180en.mo1467l(bool, new C0804vi(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0180en2.mo1467l(bool, new C0804vi(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0180en.mo1465i(interfaceC0180en2);
        }
        C0804vi c0804vi = new C0804vi(2);
        C0301hw c0301hw = C0301hw.f3348j;
        InterfaceC0180en interfaceC0180en3 = (InterfaceC0180en) interfaceC0180en.mo1467l(c0301hw, c0804vi);
        Object objMo1467l = interfaceC0180en2;
        if (zBooleanValue2) {
            objMo1467l = interfaceC0180en2.mo1467l(c0301hw, new C0804vi(3));
        }
        return interfaceC0180en3.mo1465i((InterfaceC0180en) objMo1467l);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC0180en m5651j(InterfaceC0476mn interfaceC0476mn, InterfaceC0180en interfaceC0180en) {
        InterfaceC0180en interfaceC0180enM5650g = m5650g(interfaceC0476mn.mo434b(), interfaceC0180en, true);
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        return (interfaceC0180enM5650g == c0960zq || interfaceC0180enM5650g.mo1466j(o31.f5604l) != null) ? interfaceC0180enM5650g : interfaceC0180enM5650g.mo1465i(c0960zq);
    }

    /* JADX INFO: renamed from: l */
    public static void m5652l(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                vt1.m5196h(new IllegalStateException("More produced than requested: " + j3));
                j3 = 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
    }

    /* JADX INFO: renamed from: m */
    public static List m5653m(List list) {
        if (list instanceof qc0) {
            return ((qc0) list).mo3680s();
        }
        if (list instanceof ej0) {
            return ((ej0) list).f2097j;
        }
        return list instanceof RandomAccess ? new cj0(list) : new ej0(list);
    }

    /* JADX INFO: renamed from: p */
    public static final gf1 m5654p(InterfaceC0808vm interfaceC0808vm, InterfaceC0180en interfaceC0180en, Object obj) {
        gf1 gf1Var = null;
        if ((interfaceC0808vm instanceof InterfaceC0550on) && interfaceC0180en.mo1466j(hf1.f3198j) != null) {
            InterfaceC0550on interfaceC0550onMo1182c = (InterfaceC0550on) interfaceC0808vm;
            while (!(interfaceC0550onMo1182c instanceof C0741tt) && (interfaceC0550onMo1182c = interfaceC0550onMo1182c.mo1182c()) != null) {
                if (interfaceC0550onMo1182c instanceof gf1) {
                    gf1Var = (gf1) interfaceC0550onMo1182c;
                    break;
                }
            }
            if (gf1Var != null) {
                gf1Var.m2034e0(interfaceC0180en, obj);
            }
        }
        return gf1Var;
    }

    /* JADX INFO: renamed from: q */
    public static String m5655q(Context context, String str) {
        p80.m3863h(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = vt1.m5201p(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public static String m5656r(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo4522d(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: e */
    public abstract int mo4523e(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: h */
    public abstract void mo5320h(int i, String str, Object... objArr);

    /* JADX INFO: renamed from: i */
    public abstract void mo5321i(String str, int i);

    /* JADX INFO: renamed from: k */
    public abstract int mo4524k(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo5657n(a71 a71Var);

    /* JADX INFO: renamed from: o */
    public abstract void mo5658o(a71 a71Var);
}
