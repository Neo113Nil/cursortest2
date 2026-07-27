package n2;

import B0.f;
import B0.l;
import B0.o;
import B4.h;
import B4.k;
import D3.g;
import E.C0028c;
import G0.C0060j;
import M2.A;
import M2.C0097a;
import M2.C0099c;
import M2.C0107k;
import M2.D;
import M2.F;
import M2.u;
import M2.z;
import N1.q;
import R4.r;
import R4.s;
import V0.j;
import V0.n;
import a.AbstractC0169a;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.C0215j;
import b2.AbstractC0279e;
import com.android.billingclient.api.Purchase;
import com.google.firebase.messaging.FirebaseMessaging;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.notifications.internal.common.NotificationConstants;
import f4.C0430g;
import f4.C0438o;
import f4.C0440q;
import g2.C0452d;
import g2.C0453e;
import g2.EnumC0450b;
import g4.C0471p;
import h2.C0480a;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.C0793l9;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import k4.C1216b;
import k4.C1224j;
import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.e;
import z4.InterfaceC1586c;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1341c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11465a;

    public /* synthetic */ AbstractC1341c(int i2) {
        this.f11465a = i2;
    }

    public static InterfaceC1223i A(InterfaceC1221g interfaceC1221g, InterfaceC1223i context) {
        i.e(context, "context");
        return context == C1224j.f10720a ? interfaceC1221g : (InterfaceC1223i) context.q(interfaceC1221g, new C1216b(1));
    }

    public static final byte[] B(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        d(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        i.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final String C(String value) {
        i.e(value, "value");
        StringBuilder sb = new StringBuilder(value.length());
        for (int i2 = 0; i2 < value.length(); i2++) {
            char charAt = value.charAt(i2);
            if (k.S(",[]{}\\", charAt)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean F(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final C0430g G(String str, String str2) {
        return new C0430g(str, str2);
    }

    public static z H(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3541555) {
            if (hashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return z.SUBS;
        }
        return z.INAPP;
    }

    public static ArrayList I(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F f3 = (F) it.next();
            e eVar = new e();
            eVar.f12265a = f3.f1822a;
            eVar.f12266b = J(f3.f1823b);
            arrayList.add(eVar.o());
        }
        return arrayList;
    }

    public static String J(z zVar) {
        int ordinal = zVar.ordinal();
        if (ordinal == 0) {
            return "inapp";
        }
        if (ordinal == 1) {
            return "subs";
        }
        throw new C0099c("UNKNOWN_TYPE", "Unknown product type: " + zVar, null);
    }

    public static final C0438o K(String str) {
        int i2;
        int i3;
        AbstractC0169a.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i6 = 0;
        char charAt = str.charAt(0);
        if (i.g(charAt, 48) < 0) {
            i2 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i2 = 0;
        }
        int i7 = 119304647;
        int i8 = 119304647;
        while (i2 < length) {
            int digit = Character.digit((int) str.charAt(i2), 10);
            if (digit < 0) {
                return null;
            }
            int i9 = i6 ^ Integer.MIN_VALUE;
            if (Integer.compare(i9, i8 ^ Integer.MIN_VALUE) > 0) {
                if (i8 == i7) {
                    i3 = i2;
                    i8 = (int) (((-1) & 4294967295L) / (10 & 4294967295L));
                    if (Integer.compare(i9, i8 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            i3 = i2;
            int i10 = i6 * 10;
            int i11 = i10 + digit;
            if (Integer.compare(i11 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i2 = i3 + 1;
            i6 = i11;
            i7 = 119304647;
        }
        return new C0438o(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0440q L(String str) {
        int i2;
        long j2;
        i.e(str, "<this>");
        int i3 = 10;
        AbstractC0169a.b(10);
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            int i6 = 1;
            if (i.g(charAt, 48) >= 0) {
                i2 = 0;
            } else if (length != 1 && charAt == '+') {
                i2 = 1;
            }
            long j6 = 10;
            long j7 = 0;
            long j8 = 0;
            long j9 = 512409557603043100L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i3);
                if (digit >= 0) {
                    int i7 = length;
                    long j10 = j8 ^ Long.MIN_VALUE;
                    if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                        if (j9 == 512409557603043100L) {
                            if (j6 >= j7) {
                                long j11 = (Long.MAX_VALUE / j6) << i6;
                                if ((((-1) - (j11 * j6)) ^ Long.MIN_VALUE) < (j6 ^ Long.MIN_VALUE)) {
                                    i6 = 0;
                                }
                                j2 = j11 + i6;
                            } else if (Long.MAX_VALUE < (j6 ^ Long.MIN_VALUE)) {
                                j9 = j7;
                                if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                                }
                            } else {
                                j2 = 1;
                            }
                            j9 = j2;
                            if (Long.compare(j10, j9 ^ Long.MIN_VALUE) > 0) {
                            }
                        }
                    }
                    long j12 = j8 * j6;
                    long j13 = (digit & 4294967295L) + j12;
                    if (Long.compare(j13 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) >= 0) {
                        i2++;
                        j8 = j13;
                        length = i7;
                        i3 = 10;
                        i6 = 1;
                        j7 = 0;
                    }
                }
            }
            return new C0440q(j8);
        }
        return null;
    }

    public static void M(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void a(s sVar) {
        i.e(sVar, "<this>");
        if ((sVar instanceof s ? sVar : null) != null) {
            return;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + t.a(sVar.getClass()));
    }

    public static Object b(int i2, Object obj) {
        if (i2 == Integer.MAX_VALUE) {
            return obj;
        }
        if (!(obj instanceof List)) {
            if (!(obj instanceof String)) {
                return obj;
            }
            String str = (String) obj;
            return str.length() < i2 ? obj : str.substring(0, i2);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(i2, it.next()));
        }
        return arrayList;
    }

    public static final r c(O4.b bVar) {
        i.e(bVar, "<this>");
        r rVar = bVar instanceof r ? (r) bVar : null;
        if (rVar != null) {
            return rVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + t.a(bVar.getClass()));
    }

    public static final long d(InputStream inputStream, OutputStream outputStream, int i2) {
        byte[] bArr = new byte[i2];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j2 += read;
            read = inputStream.read(bArr);
        }
        return j2;
    }

    public static N1.a e(String str, String str2) {
        C0480a c0480a = new C0480a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C0480a.class));
        return new N1.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new g(11, c0480a), hashSet3);
    }

    public static void f(String str, String str2, Object obj) {
        String s2 = s(str);
        if (Log.isLoggable(s2, 3)) {
            Log.d(s2, String.format(str2, obj));
        }
    }

    public static boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            K1.g.c();
            K1.g c2 = K1.g.c();
            c2.a();
            Context context = c2.f1387a;
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

    public static void h(String str, String str2, Exception exc) {
        String s2 = s(str);
        if (Log.isLoggable(s2, 6)) {
            Log.e(s2, str2, exc);
        }
    }

    public static final boolean i(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static M2.r j(C0060j c0060j) {
        M2.q qVar;
        int i2 = c0060j.f862a;
        if (i2 != 12) {
            qVar = M2.q.ERROR;
            switch (i2) {
                case -2:
                    qVar = M2.q.FEATURE_NOT_SUPPORTED;
                    break;
                case -1:
                    qVar = M2.q.SERVICE_DISCONNECTED;
                    break;
                case 0:
                    qVar = M2.q.OK;
                    break;
                case 1:
                    qVar = M2.q.USER_CANCELED;
                    break;
                case 2:
                    qVar = M2.q.SERVICE_UNAVAILABLE;
                    break;
                case 3:
                    qVar = M2.q.BILLING_UNAVAILABLE;
                    break;
                case 4:
                    qVar = M2.q.ITEM_UNAVAILABLE;
                    break;
                case 5:
                    qVar = M2.q.DEVELOPER_ERROR;
                    break;
                case 7:
                    qVar = M2.q.ITEM_ALREADY_OWNED;
                    break;
                case 8:
                    qVar = M2.q.ITEM_NOT_OWNED;
                    break;
            }
        } else {
            qVar = M2.q.NETWORK_ERROR;
        }
        String str = c0060j.f863b;
        M2.r rVar = new M2.r();
        rVar.f1909a = qVar;
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"debugMessage\" is null.");
        }
        rVar.f1910b = str;
        return rVar;
    }

    public static N1.a k(String str, C0028c c0028c) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(C0480a.class));
        for (Class cls : new Class[0]) {
            f.g(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        N1.i a6 = N1.i.a(Context.class);
        if (hashSet.contains(a6.f2019a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(a6);
        return new N1.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new C0097a(str, 10, c0028c), hashSet3);
    }

    public static List l(List list) {
        Iterator it;
        l lVar;
        ArrayList arrayList;
        C0107k c0107k;
        C0107k c0107k2;
        D d6;
        u uVar;
        JSONArray optJSONArray;
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            String optString = purchase.f4943c.optString("orderId");
            if (TextUtils.isEmpty(optString)) {
                optString = null;
            }
            JSONObject jSONObject = purchase.f4943c;
            String optString2 = jSONObject.optString("packageName");
            Long valueOf = Long.valueOf(jSONObject.optLong("purchaseTime"));
            String b6 = purchase.b();
            ArrayList a6 = purchase.a();
            Boolean valueOf2 = Boolean.valueOf(jSONObject.optBoolean("autoRenewing"));
            String optString3 = jSONObject.optString("developerPayload");
            Boolean valueOf3 = Boolean.valueOf(jSONObject.optBoolean("acknowledged", true));
            char c2 = jSONObject.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2;
            D d7 = D.UNSPECIFIED;
            if (c2 != 0) {
                if (c2 == 1) {
                    d7 = D.PURCHASED;
                } else if (c2 == 2) {
                    d7 = D.PENDING;
                }
            }
            Long valueOf4 = Long.valueOf(jSONObject.optInt("quantity", 1));
            String optString4 = jSONObject.optString("obfuscatedAccountId");
            String optString5 = jSONObject.optString("obfuscatedProfileId");
            if (optString4 == null && optString5 == null) {
                arrayList = arrayList2;
                it = it2;
                lVar = null;
            } else {
                it = it2;
                arrayList = arrayList2;
                lVar = new l(optString4, 1, optString5);
            }
            if (lVar != null) {
                c0107k = new C0107k();
                c0107k.f1878a = (String) lVar.f163b;
                c0107k.f1879b = (String) lVar.f164c;
            } else {
                c0107k = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
            B1.g gVar = optJSONObject == null ? null : new B1.g(3, optJSONObject);
            if (gVar != null) {
                JSONObject jSONObject2 = (JSONObject) gVar.f215b;
                String optString6 = jSONObject2.optString("purchaseToken");
                ArrayList arrayList3 = new ArrayList();
                c0107k2 = c0107k;
                if (!jSONObject2.has("productIds") || (optJSONArray = jSONObject2.optJSONArray("productIds")) == null) {
                    d6 = d7;
                } else {
                    d6 = d7;
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        arrayList3.add(optJSONArray.optString(i2));
                    }
                }
                uVar = new u();
                uVar.f1916a = arrayList3;
                if (optString6 == null) {
                    throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
                }
                uVar.f1917b = optString6;
            } else {
                c0107k2 = c0107k;
                d6 = d7;
                uVar = null;
            }
            A a7 = new A();
            a7.f1792a = optString;
            if (optString2 == null) {
                throw new IllegalStateException("Nonnull field \"packageName\" is null.");
            }
            a7.f1793b = optString2;
            a7.f1794c = valueOf;
            if (b6 == null) {
                throw new IllegalStateException("Nonnull field \"purchaseToken\" is null.");
            }
            a7.f1795d = b6;
            String str = purchase.f4942b;
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signature\" is null.");
            }
            a7.f1796e = str;
            a7.f1797f = a6;
            a7.f1798g = valueOf2;
            String str2 = purchase.f4941a;
            if (str2 == null) {
                throw new IllegalStateException("Nonnull field \"originalJson\" is null.");
            }
            a7.f1799h = str2;
            if (optString3 == null) {
                throw new IllegalStateException("Nonnull field \"developerPayload\" is null.");
            }
            a7.f1800i = optString3;
            a7.f1801j = valueOf3;
            a7.f1802k = valueOf4;
            a7.f1803l = d6;
            a7.f1804m = c0107k2;
            a7.f1805n = uVar;
            arrayList2 = arrayList;
            arrayList2.add(a7);
            it2 = it;
        }
        return arrayList2;
    }

    public static T4.s m(String str) {
        i.e(str, "<this>");
        B4.i a6 = T4.s.f2931b.a(0, str);
        if (a6 == null) {
            throw new IllegalArgumentException(o.j("No subtype found for: \"", str, '\"'));
        }
        if (((B4.f) a6.f313d) == null) {
            a6.f313d = new B4.f(a6);
        }
        B4.f fVar = (B4.f) a6.f313d;
        i.b(fVar);
        String str2 = (String) fVar.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        i.d(lowerCase, "toLowerCase(...)");
        if (((B4.f) a6.f313d) == null) {
            a6.f313d = new B4.f(a6);
        }
        B4.f fVar2 = (B4.f) a6.f313d;
        i.b(fVar2);
        String lowerCase2 = ((String) fVar2.get(2)).toLowerCase(locale);
        i.d(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) a6.f311b;
        int i2 = K1.b.s0(matcher.start(), matcher.end()).f12440b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new T4.s(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            B4.i a7 = T4.s.f2932c.a(i3, str);
            if (a7 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String substring = str.substring(i3);
                i.d(substring, "substring(...)");
                sb.append(substring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(o.l(sb, str, '\"').toString());
            }
            h hVar = (h) a7.f312c;
            B4.e d6 = hVar.d(1);
            String str3 = d6 != null ? d6.f303a : null;
            Matcher matcher2 = (Matcher) a7.f311b;
            if (str3 == null) {
                i2 = K1.b.s0(matcher2.start(), matcher2.end()).f12440b;
            } else {
                B4.e d7 = hVar.d(2);
                String str4 = d7 != null ? d7.f303a : null;
                if (str4 == null) {
                    B4.e d8 = hVar.d(3);
                    i.b(d8);
                    str4 = d8.f303a;
                } else if (k.j0(str4, '\'') && str4.length() > 0 && AbstractC0169a.m(str4.charAt(k.U(str4)), '\'', false) && str4.length() > 2) {
                    str4 = str4.substring(1, str4.length() - 1);
                    i.d(str4, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i2 = K1.b.s0(matcher2.start(), matcher2.end()).f12440b;
            }
        }
    }

    public static InterfaceC1221g n(InterfaceC1221g interfaceC1221g, InterfaceC1222h key) {
        i.e(key, "key");
        if (i.a(interfaceC1221g.getKey(), key)) {
            return interfaceC1221g;
        }
        return null;
    }

    public static float o(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return I.d.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class p(InterfaceC1586c interfaceC1586c) {
        i.e(interfaceC1586c, "<this>");
        Class a6 = ((kotlin.jvm.internal.c) interfaceC1586c).a();
        if (!a6.isPrimitive()) {
            return a6;
        }
        String name = a6.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a6;
    }

    public static String q(int i2) {
        switch (i2) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return AbstractC0279e.d(i2, "unknown status code: ");
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case C0793l9.f8681C /* 19 */:
                return "REMOTE_EXCEPTION";
            case C0793l9.f8682D /* 20 */:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case C0793l9.f8683E /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static String r(byte[] bArr) {
        int o2;
        C0215j c0215j = new C0215j(bArr);
        boolean z = false;
        while (!z) {
            int i2 = c0215j.f4463b;
            int i3 = c0215j.f4462a;
            if (i2 == i3) {
                c0215j.f4464c = 0;
                o2 = 0;
            } else {
                o2 = c0215j.o();
                c0215j.f4464c = o2;
                if ((o2 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + c0215j.f4464c);
                }
            }
            if (o2 != 0) {
                byte[] bArr2 = (byte[]) c0215j.f4465d;
                if (o2 == 18) {
                    int o5 = c0215j.o();
                    if (o5 > 0) {
                        int i6 = c0215j.f4463b;
                        if (o5 <= i3 - i6) {
                            String str = new String(bArr2, i6, o5, StandardCharsets.UTF_8);
                            c0215j.f4463b += o5;
                            return str;
                        }
                    }
                    if (o5 == 0) {
                        return "";
                    }
                    if (o5 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i7 = o2 & 7;
                if (i7 == 0) {
                    if (i3 - c0215j.f4463b >= 10) {
                        for (int i8 = 0; i8 < 10; i8++) {
                            int i9 = c0215j.f4463b;
                            c0215j.f4463b = i9 + 1;
                            if (bArr2[i9] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i10 = 0; i10 < 10; i10++) {
                        int i11 = c0215j.f4463b;
                        if (i11 == i3) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        c0215j.f4463b = i11 + 1;
                        if (bArr2[i11] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i7 == 1) {
                    c0215j.z(8);
                } else if (i7 == 2) {
                    c0215j.z(c0215j.o());
                } else {
                    if (i7 != 5) {
                        throw new IOException(AbstractC0279e.d(o2, "Invalid wire type: "));
                    }
                    c0215j.z(4);
                }
            } else {
                z = true;
            }
        }
        return "";
    }

    public static String s(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static String t(String tableName, String triggerType) {
        i.e(tableName, "tableName");
        i.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List u(String str, List list) {
        i.e(list, "list");
        boolean z = list instanceof C1342d;
        List list2 = list;
        if (z) {
            list2 = ((C1342d) list).f11467b;
        }
        if (list2 == C0471p.f5750a || (list2 instanceof C1339a)) {
            return list2;
        }
        C1339a c1339a = new C1339a(list2);
        if (c1339a.contains(null)) {
            throw new IllegalArgumentException(str.concat(".contains(null)").toString());
        }
        return c1339a;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v(Intent intent) {
        long parseLong;
        if (F(intent)) {
            w(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : g()) {
            S0.f fVar = (S0.f) FirebaseMessaging.f5320l.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            C0452d c0452d = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get(NotificationConstants.GOOGLE_TTL_KEY);
                if (obj instanceof Integer) {
                    i2 = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        i2 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i3 = i2;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        K1.g c2 = K1.g.c();
                        Object obj2 = Z1.c.f3753m;
                        string = (String) f.b(((Z1.c) c2.b(Z1.d.class)).c());
                    } catch (InterruptedException | ExecutionException e3) {
                        throw new RuntimeException(e3);
                    }
                }
                String str2 = string;
                K1.g c6 = K1.g.c();
                c6.a();
                String packageName = c6.f1387a.getPackageName();
                EnumC0450b enumC0450b = j.L(extras) ? EnumC0450b.DISPLAY_NOTIFICATION : EnumC0450b.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID);
                }
                String str3 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str = string3;
                }
                String str4 = str != null ? str : "";
                String string4 = extras.getString("collapse_key");
                String str5 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str6 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str7 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e6) {
                        Log.w("FirebaseMessaging", "error parsing project number", e6);
                    }
                    c0452d = new C0452d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC0450b, packageName, str5, i3, str4, str6, str7);
                }
                K1.g c7 = K1.g.c();
                c7.a();
                K1.i iVar = c7.f1389c;
                String str8 = iVar.f1405e;
                if (str8 != null) {
                    try {
                        parseLong = Long.parseLong(str8);
                    } catch (NumberFormatException e7) {
                        Log.w("FirebaseMessaging", "error parsing sender ID", e7);
                    }
                    c0452d = new C0452d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC0450b, packageName, str5, i3, str4, str6, str7);
                }
                c7.a();
                String str9 = iVar.f1402b;
                if (str9.startsWith("1:")) {
                    String[] split = str9.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    if (split.length >= 2) {
                        String str10 = split[1];
                        if (!str10.isEmpty()) {
                            try {
                                parseLong = Long.parseLong(str10);
                            } catch (NumberFormatException e8) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e8);
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    try {
                        parseLong = Long.parseLong(str9);
                    } catch (NumberFormatException e9) {
                        Log.w("FirebaseMessaging", "error parsing app ID", e9);
                    }
                }
                c0452d = new C0452d(parseLong > 0 ? parseLong : 0L, str3, str2, enumC0450b, packageName, str5, i3, str4, str6, str7);
            }
            if (c0452d == null) {
                return;
            }
            try {
                ((n) fVar).a("FCM_CLIENT_EVENT_LOGGING", new S0.c("proto"), new C0028c(23)).k(new S0.a(new C0453e(c0452d), new S0.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e10) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e10);
            }
        }
    }

    public static void w(Bundle bundle, String str) {
        try {
            K1.g.c();
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
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e3);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e6) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e6);
                }
            }
            String str2 = j.L(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (K1.g.c().b(L1.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static InterfaceC1223i x(InterfaceC1221g interfaceC1221g, InterfaceC1222h key) {
        i.e(key, "key");
        return i.a(interfaceC1221g.getKey(), key) ? C1224j.f10720a : interfaceC1221g;
    }

    public static float y(EdgeEffect edgeEffect, float f3, float f6) {
        if (Build.VERSION.SDK_INT >= 31) {
            return I.d.c(edgeEffect, f3, f6);
        }
        I.c.a(edgeEffect, f3, f6);
        return f3;
    }

    public static T4.s z(String str) {
        i.e(str, "<this>");
        try {
            return m(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public abstract void E(boolean z);

    public int hashCode() {
        switch (this.f11465a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f11465a) {
            case 7:
                String b6 = t.a(getClass()).b();
                i.b(b6);
                return b6;
            default:
                return super.toString();
        }
    }

    public void D(boolean z) {
    }
}
