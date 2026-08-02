package p000;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d71 implements InterfaceC0707sw {

    /* JADX INFO: renamed from: a */
    public static final String[] f1567a = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: b */
    public static final kg0 f1568b = new kg0(2);

    /* JADX INFO: renamed from: c */
    public static String f1569c;

    /* JADX INFO: renamed from: d */
    public static Boolean f1570d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC0808vm m1106a(AbstractC0526o abstractC0526o, AbstractC0526o abstractC0526o2, v60 v60Var) {
        v60Var.getClass();
        if (v60Var instanceof AbstractC0243gb) {
            return ((AbstractC0243gb) v60Var).mo1491k(abstractC0526o2, abstractC0526o);
        }
        InterfaceC0180en interfaceC0180en = abstractC0526o2.f5570n;
        return interfaceC0180en == C0301hw.f3348j ? new bf0(abstractC0526o2, abstractC0526o, v60Var) : new cf0(abstractC0526o2, interfaceC0180en, v60Var, abstractC0526o);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1107b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            w00.m5221b();
            w00 w00VarM5221b = w00.m5221b();
            w00VarM5221b.m5224a();
            Context context = w00VarM5221b.f8318a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1108c(C0762ud c0762ud) {
        StringBuilder sb = new StringBuilder(c0762ud.size());
        for (int i = 0; i < c0762ud.size(); i++) {
            byte bMo4064b = c0762ud.mo4064b(i);
            if (bMo4064b == 34) {
                sb.append("\\\"");
            } else if (bMo4064b == 39) {
                sb.append("\\'");
            } else if (bMo4064b != 92) {
                switch (bMo4064b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo4064b < 32 || bMo4064b > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo4064b >>> 6) & 3) + 48));
                            sb.append((char) (((bMo4064b >>> 3) & 7) + 48));
                            sb.append((char) ((bMo4064b & 7) + 48));
                        } else {
                            sb.append((char) bMo4064b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public static Set m1109d(String str, Map map) {
        ia1 ia1VarValueOf;
        List listM5383h = wo1.m5383h(str, map);
        if (listM5383h == null) {
            return null;
        }
        EnumSet enumSetNoneOf = EnumSet.noneOf(ia1.class);
        for (Object obj : listM5383h) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                AbstractC0959zp.m5972A(obj, "Status code %s is not integral", ((double) iIntValue) == d.doubleValue());
                ia1VarValueOf = ja1.m2834d(iIntValue).f3886a;
                AbstractC0959zp.m5972A(obj, "Status code %s is not valid", ia1VarValueOf.f3521j == d.intValue());
            } else {
                if (!(obj instanceof String)) {
                    StringBuilder sb = new StringBuilder("Can not convert status code ");
                    sb.append(obj);
                    Class<?> cls = obj.getClass();
                    sb.append(" to Status.Code, because its type is ");
                    sb.append(cls);
                    throw new C0694sj(sb.toString(), 8);
                }
                try {
                    ia1VarValueOf = ia1.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new C0694sj("Status code " + obj + " is not valid", e, 8);
                }
            }
            enumSetNoneOf.add(ia1VarValueOf);
        }
        return Collections.unmodifiableSet(enumSetNoneOf);
    }

    /* JADX INFO: renamed from: e */
    public static List m1110e(Map map) {
        String strM5388m;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            List listM5383h = wo1.m5383h("loadBalancingConfig", map);
            if (listM5383h == null) {
                listM5383h = null;
            } else {
                wo1.m5379d(listM5383h);
            }
            arrayList.addAll(listM5383h);
        }
        if (arrayList.isEmpty() && (strM5388m = wo1.m5388m("loadBalancingPolicy", map)) != null) {
            arrayList.add(Collections.singletonMap(strM5388m.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0808vm m1111f(InterfaceC0808vm interfaceC0808vm) {
        interfaceC0808vm.getClass();
        AbstractC0882xm abstractC0882xm = interfaceC0808vm instanceof AbstractC0882xm ? (AbstractC0882xm) interfaceC0808vm : null;
        if (abstractC0882xm == null || (interfaceC0808vm = abstractC0882xm.f8993l) != null) {
            return interfaceC0808vm;
        }
        AbstractC0292hn abstractC0292hn = (AbstractC0292hn) abstractC0882xm.mo475d().mo1466j(o31.f5604l);
        InterfaceC0808vm c0704st = abstractC0292hn != null ? new C0704st(abstractC0292hn, abstractC0882xm) : abstractC0882xm;
        abstractC0882xm.f8993l = c0704st;
        return c0704st;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0181  */
    /* JADX WARN: Code duplicated, block: B:106:0x019a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:130:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0176 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e0 A[PHI: r6
      0x00e0: PHI (r6v23 java.lang.String) = (r6v22 java.lang.String), (r6v35 java.lang.String) binds: [B:44:0x00c8, B:48:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x013e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x014e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0169  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static void m1112g(Intent intent) {
        int iIntValue;
        int i;
        String string;
        fp0 fp0Var;
        String string2;
        Object[] objArr;
        String string3;
        String str;
        String string4;
        String str2;
        String string5;
        String str3;
        String string6;
        String str4;
        String string7;
        String str5;
        long j;
        long j2;
        w00 w00VarM5221b;
        r10 r10Var;
        String str6;
        String str7;
        String[] strArrSplit;
        String str8;
        if (m1115p(intent)) {
            m1113h(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : m1107b()) {
            oe1 oe1Var = (oe1) FirebaseMessaging.f1384k.get();
            if (oe1Var == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            hp0 hp0Var = null;
            str = null;
            String str9 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            iIntValue = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                            i = 0;
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            w00 w00VarM5221b2 = w00.m5221b();
                            Object obj2 = l10.f4629m;
                            w00VarM5221b2.m5224a();
                            string = (String) hn0.m2310a(((l10) w00VarM5221b2.f8321d.mo2281a(m10.class)).m3141c());
                        } catch (InterruptedException | ExecutionException e) {
                            dd0.m1163h(e);
                            return;
                        }
                    }
                    String str10 = string;
                    w00 w00VarM5221b3 = w00.m5221b();
                    w00VarM5221b3.m5224a();
                    String packageName = w00VarM5221b3.f8318a.getPackageName();
                    if (an0.m300u(extras)) {
                        fp0Var = fp0.f2468l;
                    } else {
                        fp0Var = fp0.f2467k;
                    }
                    fp0 fp0Var2 = fp0Var;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 != null) {
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                        objArr = 2;
                    } else {
                        string2 = extras.getString("google.priority");
                        if ("high".equals(string2)) {
                            objArr = 1;
                        } else if ("normal".equals(string2)) {
                            objArr = 2;
                        } else {
                            objArr = 0;
                        }
                    }
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    if (string3 != null) {
                        str = string3;
                    } else {
                        str = "";
                    }
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str9 = string4;
                    }
                    if (str9 != null) {
                        str2 = str9;
                    } else {
                        str2 = "";
                    }
                    string5 = extras.getString("collapse_key");
                    if (string5 != null) {
                        str3 = string5;
                    } else {
                        str3 = "";
                    }
                    string6 = extras.getString("google.c.a.m_l");
                    if (string6 != null) {
                        str4 = string6;
                    } else {
                        str4 = "";
                    }
                    string7 = extras.getString("google.c.a.c_l");
                    if (string7 != null) {
                        str5 = string7;
                    } else {
                        str5 = "";
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            j = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e2) {
                            Log.w("FirebaseMessaging", "error parsing project number", e2);
                            w00VarM5221b = w00.m5221b();
                            r10Var = w00VarM5221b.f8320c;
                            w00VarM5221b.m5224a();
                            str6 = r10Var.f6654e;
                            if (str6 != null) {
                                try {
                                    j = Long.parseLong(str6);
                                } catch (NumberFormatException e3) {
                                    Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                    w00VarM5221b.m5224a();
                                    str7 = r10Var.f6651b;
                                    if (str7.startsWith("1:")) {
                                        strArrSplit = str7.split(":");
                                        if (strArrSplit.length < 2) {
                                            j = 0;
                                        } else {
                                            str8 = strArrSplit[1];
                                            if (str8.isEmpty()) {
                                                j = 0;
                                            } else {
                                                try {
                                                    j = Long.parseLong(str8);
                                                } catch (NumberFormatException e4) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                    j = 0;
                                                }
                                            }
                                        }
                                    } else {
                                        try {
                                            j = Long.parseLong(str7);
                                        } catch (NumberFormatException e5) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                            j = 0;
                                        }
                                    }
                                }
                            } else {
                                w00VarM5221b.m5224a();
                                str7 = r10Var.f6651b;
                                if (str7.startsWith("1:")) {
                                    j = Long.parseLong(str7);
                                } else {
                                    strArrSplit = str7.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str8 = strArrSplit[1];
                                        if (str8.isEmpty()) {
                                            j = 0;
                                        } else {
                                            j = Long.parseLong(str8);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        w00VarM5221b = w00.m5221b();
                        r10Var = w00VarM5221b.f8320c;
                        w00VarM5221b.m5224a();
                        str6 = r10Var.f6654e;
                        if (str6 != null) {
                            j = Long.parseLong(str6);
                        } else {
                            w00VarM5221b.m5224a();
                            str7 = r10Var.f6651b;
                            if (str7.startsWith("1:")) {
                                j = Long.parseLong(str7);
                            } else {
                                strArrSplit = str7.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str8 = strArrSplit[1];
                                    if (str8.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str8);
                                    }
                                }
                            }
                        }
                    }
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = 0;
                    }
                    hp0Var = new hp0(j2, str, str10, fp0Var2, packageName, str3, i3, i, str2, str4, str5);
                }
                i = iIntValue;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    w00 w00VarM5221b4 = w00.m5221b();
                    Object obj3 = l10.f4629m;
                    w00VarM5221b4.m5224a();
                    string = (String) hn0.m2310a(((l10) w00VarM5221b4.f8321d.mo2281a(m10.class)).m3141c());
                }
                String str11 = string;
                w00 w00VarM5221b5 = w00.m5221b();
                w00VarM5221b5.m5224a();
                String packageName2 = w00VarM5221b5.f8318a.getPackageName();
                if (an0.m300u(extras)) {
                    fp0Var = fp0.f2468l;
                } else {
                    fp0Var = fp0.f2467k;
                }
                fp0 fp0Var3 = fp0Var;
                string2 = extras.getString("google.delivered_priority");
                if (string2 != null) {
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                } else if ("1".equals(extras.getString("google.priority_reduced"))) {
                    objArr = 2;
                } else {
                    string2 = extras.getString("google.priority");
                    if ("high".equals(string2)) {
                        objArr = 1;
                    } else if ("normal".equals(string2)) {
                        objArr = 2;
                    } else {
                        objArr = 0;
                    }
                }
                if (objArr == 2) {
                    i2 = 5;
                } else if (objArr == 1) {
                    i2 = 10;
                }
                int i4 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                    string3 = extras.getString("message_id");
                }
                if (string3 != null) {
                    str = string3;
                } else {
                    str = "";
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str9 = string4;
                }
                if (str9 != null) {
                    str2 = str9;
                } else {
                    str2 = "";
                }
                string5 = extras.getString("collapse_key");
                if (string5 != null) {
                    str3 = string5;
                } else {
                    str3 = "";
                }
                string6 = extras.getString("google.c.a.m_l");
                if (string6 != null) {
                    str4 = string6;
                } else {
                    str4 = "";
                }
                string7 = extras.getString("google.c.a.c_l");
                if (string7 != null) {
                    str5 = string7;
                } else {
                    str5 = "";
                }
                if (extras.containsKey("google.c.sender.id")) {
                    j = Long.parseLong(extras.getString("google.c.sender.id"));
                } else {
                    w00VarM5221b = w00.m5221b();
                    r10Var = w00VarM5221b.f8320c;
                    w00VarM5221b.m5224a();
                    str6 = r10Var.f6654e;
                    if (str6 != null) {
                        j = Long.parseLong(str6);
                    } else {
                        w00VarM5221b.m5224a();
                        str7 = r10Var.f6651b;
                        if (str7.startsWith("1:")) {
                            j = Long.parseLong(str7);
                        } else {
                            strArrSplit = str7.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str8 = strArrSplit[1];
                                if (str8.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str8);
                                }
                            }
                        }
                    }
                }
                if (j > 0) {
                    j2 = j;
                } else {
                    j2 = 0;
                }
                hp0Var = new hp0(j2, str, str11, fp0Var3, packageName2, str3, i4, i, str2, str4, str5);
            }
            if (hp0Var == null) {
                return;
            }
            try {
                ((pe1) oe1Var).m3901a("FCM_CLIENT_EVENT_LOGGING", new C0818vw("proto"), new dd0(14)).m3490b(new C0832w9(new ip0(hp0Var), new C0426la(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e6) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m1113h(Bundle bundle, String str) {
        try {
            w00.m5221b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = an0.m300u(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            w00 w00VarM5221b = w00.m5221b();
            w00VarM5221b.m5224a();
            InterfaceC0826w3 interfaceC0826w3 = (InterfaceC0826w3) w00VarM5221b.f8321d.mo2281a(InterfaceC0826w3.class);
            if (interfaceC0826w3 != null) {
                interfaceC0826w3.mo4425f("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX INFO: renamed from: o */
    public static dr0 m1114o(List list, oj0 oj0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b71 b71Var = (b71) it.next();
            String str = b71Var.f746a;
            nj0 nj0VarM3694b = oj0Var.m3694b(str);
            if (nj0VarM3694b != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(d71.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                dr0 dr0VarMo1104c = nj0VarM3694b.mo1104c(b71Var.f747b);
                return dr0VarMo1104c.f1802a != null ? dr0VarMo1104c : new dr0(new c71(nj0VarM3694b, dr0VarMo1104c.f1803b));
            }
            arrayList.add(str);
        }
        return new dr0(ja1.f3877g.m2840h("None of " + arrayList + " specified by Service Config are available."));
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1115p(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    /* JADX INFO: renamed from: q */
    public static List m1116q(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map.size() != 1) {
                throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
            }
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            arrayList.add(new b71(str, wo1.m5387l(str, map)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: r */
    public static Object m1117r(v60 v60Var, Object obj, InterfaceC0808vm interfaceC0808vm) {
        v60Var.getClass();
        InterfaceC0180en interfaceC0180enMo475d = interfaceC0808vm.mo475d();
        Object df0Var = interfaceC0180enMo475d == C0301hw.f3348j ? new df0(interfaceC0808vm) : new ef0(interfaceC0808vm, interfaceC0180enMo475d);
        xe1.m5634a(2, v60Var);
        return v60Var.mo1490g(obj, df0Var);
    }

    /* JADX INFO: renamed from: t */
    public static ht1 m1118t(dp1 dp1Var, f71 f71Var, ArrayList arrayList, boolean z) {
        ht1 ht1VarMo749a;
        wo1.m5398y("reduce", 1, arrayList);
        wo1.m5399z("reduce", 2, arrayList);
        ht1 ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
        if (!(ht1VarM96t instanceof bs1)) {
            C0270h1.m2190f("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            ht1VarMo749a = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
            if (ht1VarMo749a instanceof nq1) {
                C0270h1.m2190f("Failed to parse initial value");
                return null;
            }
        } else {
            if (dp1Var.m1282s() == 0) {
                C0270h1.m2191g("Empty array with no initial value error");
                return null;
            }
            ht1VarMo749a = null;
        }
        bs1 bs1Var = (bs1) ht1VarM96t;
        int iM1282s = dp1Var.m1282s();
        int i = z ? 0 : iM1282s - 1;
        int i2 = z ? iM1282s - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (ht1VarMo749a == null) {
            ht1VarMo749a = dp1Var.m1283t(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (dp1Var.m1285v(i)) {
                ht1VarMo749a = bs1Var.mo749a(f71Var, Arrays.asList(ht1VarMo749a, dp1Var.m1283t(i), new gr1(Double.valueOf(i)), dp1Var));
                if (ht1VarMo749a instanceof nq1) {
                    C0270h1.m2191g("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return ht1VarMo749a;
    }

    /* JADX INFO: renamed from: w */
    public static dp1 m1119w(dp1 dp1Var, f71 f71Var, ft1 ft1Var, Boolean bool, Boolean bool2) {
        dp1 dp1Var2 = new dp1();
        Iterator itM1281r = dp1Var.m1281r();
        while (itM1281r.hasNext()) {
            int iIntValue = ((Integer) itM1281r.next()).intValue();
            if (dp1Var.m1285v(iIntValue)) {
                ht1 ht1VarMo749a = ft1Var.mo749a(f71Var, Arrays.asList(dp1Var.m1283t(iIntValue), new gr1(Double.valueOf(iIntValue)), dp1Var));
                if (ht1VarMo749a.mo752e().equals(bool)) {
                    break;
                }
                if (bool2 == null || ht1VarMo749a.mo752e().equals(bool2)) {
                    dp1Var2.m1284u(iIntValue, ht1VarMo749a);
                }
            }
        }
        return dp1Var2;
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo1120i(ja1 ja1Var, np0 np0Var);

    /* JADX INFO: renamed from: j */
    public abstract void mo1121j(Throwable th);

    /* JADX INFO: renamed from: k */
    public abstract void mo1122k(np0 np0Var);

    /* JADX INFO: renamed from: l */
    public abstract void mo1123l(f71 f71Var);

    /* JADX INFO: renamed from: m */
    public abstract void mo1124m(Object obj);

    /* JADX INFO: renamed from: s */
    public abstract int mo1126s();

    /* JADX INFO: renamed from: u */
    public abstract db2 mo1127u(int i);

    /* JADX INFO: renamed from: v */
    public abstract Object mo1128v(int i);

    /* JADX INFO: renamed from: x */
    public abstract Object mo1129x(db2 db2Var);

    /* JADX INFO: renamed from: n */
    public void mo1125n() {
    }
}
