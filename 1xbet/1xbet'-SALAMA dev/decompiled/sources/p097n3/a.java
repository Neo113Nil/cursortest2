package p097n3;

import A1.AbstractC0021h;
import A5.f;
import C0.C;
import C0.u;
import C0.v;
import D6.AbstractC0109a;
import E5.C0188f;
import E5.E;
import E5.F;
import E5.G;
import E5.I;
import E5.J;
import E5.O;
import E5.P;
import E5.Q;
import G3.b;
import I2.C0306n;
import P.c0;
import R5.C0406b;
import R5.T;
import V.l;
import V.m;
import V.n;
import V.o;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.OAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzv;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import com.google.firebase.auth.zze;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function2;
import p023d1.d;
import p034e4.j;
import p034e4.p;
import p044f6.i;
import p046g0.q;
import p048g4.g;
import p050g6.r;
import p050g6.s;
import p090m3.c;
import p136t.e;
import p155w1.C1009l0;
import p155w1.F0;
import p155w1.V0;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f15352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f15353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f15354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f15355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f15356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Method f15357f;

    public static int A(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i7 != 5) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static int B(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static int C(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        if (i7 == 2) {
            return 3;
        }
        if (i7 == 3) {
            return 4;
        }
        if (i7 == 4) {
            return 5;
        }
        if (i7 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Could not convert ", " to State"));
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 29) {
            return N0.a.c();
        }
        try {
            if (f15355d == null) {
                f15354c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f15355d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f15355d.invoke(null, Long.valueOf(f15354c))).booleanValue();
        } catch (Exception e7) {
            y("isTagEnabled", e7);
            return false;
        }
    }

    public static synchronized boolean E(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f15352a;
        if (context2 != null && (bool = f15353b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f15353b = null;
        if (c.h()) {
            f15353b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f15353b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f15353b = Boolean.FALSE;
            }
        }
        f15352a = applicationContext;
        return f15353b.booleanValue();
    }

    public static long F(int i7, byte[] bArr) {
        return ((long) (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16))) & 4294967295L;
    }

    public static int G(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "x (", ") must be > 0"));
        }
        switch (b.f2869a[roundingMode.ordinal()]) {
            case 1:
                if (!((i7 > 0) & (((i7 + (-1)) & i7) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i7 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i7))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i7);
    }

    public static ArrayList H(P p5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p5.f2310a.b());
        arrayList.add(p5.f2311b);
        return arrayList;
    }

    public static ArrayList I(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfo = (MultiFactorInfo) it.next();
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                String str = ((PhoneMultiFactorInfo) multiFactorInfo).f11885d;
                PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) multiFactorInfo;
                String str2 = phoneMultiFactorInfo.f11883b;
                Double dValueOf = Double.valueOf(phoneMultiFactorInfo.f11884c);
                J j = new J();
                j.f2291a = str2;
                j.f2292b = dValueOf;
                j.f2293c = "phone";
                String str3 = phoneMultiFactorInfo.f11882a;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                j.f2294d = str3;
                j.f2295e = str;
                arrayList2.add(j);
            } else {
                String strE = multiFactorInfo.e();
                Double dValueOf2 = Double.valueOf(multiFactorInfo.j());
                String strA = multiFactorInfo.a();
                String strK = multiFactorInfo.k();
                J j3 = new J();
                j3.f2291a = strE;
                j3.f2292b = dValueOf2;
                j3.f2293c = strK;
                if (strA == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                j3.f2294d = strA;
                j3.f2295e = null;
                arrayList2.add(j3);
            }
        }
        return arrayList2;
    }

    public static G J(AuthCredential authCredential) {
        if (authCredential == null) {
            return null;
        }
        int iHashCode = authCredential.hashCode();
        C0188f.f2361z.put(Integer.valueOf(iHashCode), authCredential);
        String strJ = authCredential.j();
        String strK = authCredential.k();
        Long lValueOf = Long.valueOf(iHashCode);
        String str = authCredential instanceof OAuthCredential ? ((zze) ((OAuthCredential) authCredential)).f11953c : null;
        G g3 = new G();
        if (strJ == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        g3.f2275a = strJ;
        if (strK == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        g3.f2276b = strK;
        g3.f2277c = lValueOf;
        g3.f2278d = str;
        return g3;
    }

    public static O K(AuthResult authResult) {
        String str;
        zzx zzxVar = (zzx) authResult;
        zzv zzvVar = zzxVar.f11937b;
        F f7 = null;
        if (zzvVar != null) {
            Boolean boolValueOf = Boolean.valueOf(zzvVar.f11935d);
            String str2 = zzvVar.f11932a;
            boolean zEquals = "github.com".equals(str2);
            p122r.b bVar = zzvVar.f11934c;
            if (zEquals) {
                str = (String) bVar.getOrDefault("login", null);
            } else {
                str = "twitter.com".equals(str2) ? (String) bVar.getOrDefault("screen_name", null) : null;
            }
            F f8 = new F();
            f8.f2270a = boolValueOf;
            f8.f2271b = str2;
            f8.f2272c = str;
            f8.f2273d = null;
            f8.f2274e = bVar;
            f7 = f8;
        }
        G gJ = J(zzxVar.f11938c);
        P pL = L(zzxVar.f11936a);
        O o7 = new O();
        o7.f2307a = pL;
        o7.f2308b = f7;
        o7.f2309c = gJ;
        return o7;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    public static P L(FirebaseUser firebaseUser) {
        Long lValueOf;
        Long lValueOf2;
        String string;
        String string2;
        ArrayList arrayList = null;
        if (firebaseUser == null) {
            return null;
        }
        zzad zzadVar = (zzad) firebaseUser;
        zzz zzzVar = zzadVar.f11909b;
        String str = zzzVar.f11941c;
        String str2 = zzzVar.f11944f;
        Boolean boolValueOf = Boolean.valueOf(zzzVar.f11946y);
        Boolean boolValueOf2 = Boolean.valueOf(firebaseUser.k());
        zzaf zzafVar = zzadVar.f11916z;
        if (zzafVar != null) {
            lValueOf = Long.valueOf(zzafVar.f11918b);
            lValueOf2 = Long.valueOf(zzadVar.f11916z.f11917a);
        } else {
            lValueOf = null;
            lValueOf2 = null;
        }
        zzz zzzVar2 = zzadVar.f11909b;
        String str3 = zzzVar2.f11945x;
        Uri uriB = zzzVar2.b();
        if (uriB == null) {
            string = null;
        } else {
            string = uriB.toString();
            if ("".equals(string)) {
                string = null;
            }
        }
        String str4 = zzadVar.f11909b.f11939a;
        String strJ = firebaseUser.j();
        Q q7 = new Q();
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        q7.f2312a = str4;
        q7.f2313b = str2;
        q7.f2314c = str;
        q7.f2315d = string;
        q7.f2316e = str3;
        q7.f2317f = boolValueOf2;
        q7.f2318g = boolValueOf;
        q7.f2319h = null;
        q7.f2320i = strJ;
        q7.j = null;
        q7.f2321k = lValueOf;
        q7.f2322l = lValueOf2;
        ArrayList arrayList2 = zzadVar.f11912e;
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2 != null) {
            for (p pVar : new ArrayList(arrayList2)) {
                if (pVar != null && !"firebase".equals(pVar.g())) {
                    HashMap map = new HashMap();
                    map.put("displayName", pVar.e());
                    map.put("email", pVar.i());
                    map.put("isEmailVerified", Boolean.valueOf(pVar.c()));
                    map.put("phoneNumber", pVar.d());
                    Uri uriB2 = pVar.b();
                    if (uriB2 == null) {
                        string2 = null;
                    } else {
                        string2 = uriB2.toString();
                        if ("".equals(string2)) {
                            string2 = null;
                        }
                    }
                    map.put("photoUrl", string2);
                    map.put("uid", pVar.a() == null ? "" : pVar.a());
                    map.put("providerId", pVar.g());
                    map.put("isAnonymous", Boolean.FALSE);
                    arrayList3.add(map);
                }
            }
            arrayList = arrayList3;
        }
        P p5 = new P();
        p5.f2310a = q7;
        if (arrayList == null) {
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }
        p5.f2311b = arrayList;
        return p5;
    }

    public static I M(j jVar) {
        String str = jVar.f12687a;
        Map map = (Map) jVar.f12688b.get("firebase");
        String str2 = map != null ? (String) map.get("sign_in_provider") : null;
        Integer num = (Integer) jVar.f12688b.get("auth_time");
        Long lValueOf = Long.valueOf((num == null ? 0L : num.longValue()) * 1000);
        Integer num2 = (Integer) jVar.f12688b.get("exp");
        Long lValueOf2 = Long.valueOf((num2 == null ? 0L : num2.longValue()) * 1000);
        Integer num3 = (Integer) jVar.f12688b.get("iat");
        Long lValueOf3 = Long.valueOf((num3 != null ? num3.longValue() : 0L) * 1000);
        Map map2 = jVar.f12688b;
        Map map3 = (Map) map2.get("firebase");
        String str3 = map3 != null ? (String) map3.get("sign_in_second_factor") : null;
        I i7 = new I();
        i7.f2284a = str;
        i7.f2285b = lValueOf2;
        i7.f2286c = lValueOf;
        i7.f2287d = lValueOf3;
        i7.f2288e = str2;
        i7.f2289f = map2;
        i7.f2290g = str3;
        return i7;
    }

    public static void P(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            n.d(textView, i7);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), i7 + i8, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void Q(TextView textView, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i8 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i7 > Math.abs(i8)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i7 - i8);
        }
    }

    public static Set R(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f13310a;
        }
        if (length == 1) {
            Set setSingleton = Collections.singleton(objArr[0]);
            h.d(setSingleton, "singleton(...)");
            return setSingleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(s.K0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void S(f fVar, final T t7) {
        I4.j jVar;
        h.e(fVar, "binaryMessenger");
        A5.n c0406b = (t7 == null || (jVar = t7.f6101a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0406b, obj, 1);
        if (t7 != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    switch (i7) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                listW0 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                listW1 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                listW2 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                listW3 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0406b, obj, 1);
        if (t7 != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    switch (i8) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                listW0 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                listW1 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                listW2 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                listW3 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0406b, obj, 1);
        if (t7 != null) {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    switch (i9) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                listW0 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                listW1 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                listW2 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                listW3 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0406b, obj, 1);
        if (t7 == null) {
            f10.M(null);
        } else {
            final int i10 = 3;
            f10.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    switch (i10) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                listW0 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                listW1 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                listW2 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                listW3 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            break;
                    }
                }
            });
        }
    }

    public static void T(Function2 function2, AbstractC0109a abstractC0109a, AbstractC0109a abstractC0109a2) {
        try {
            I6.a.h(P6.b.v(P6.b.i(abstractC0109a, abstractC0109a2, function2)), i.f13014a, null);
        } catch (Throwable th) {
            abstractC0109a2.resumeWith(p003a.a.h(th));
            throw th;
        }
    }

    public static int U(int i7) {
        int iE = e.e(i7);
        if (iE == 0) {
            return 0;
        }
        int i8 = 1;
        if (iE != 1) {
            i8 = 2;
            if (iE != 2) {
                i8 = 3;
                if (iE != 3) {
                    i8 = 4;
                    if (iE != 4) {
                        if (iE == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + AbstractC0486a1.z(i7) + " to int");
                    }
                }
            }
        }
        return i8;
    }

    public static void V(byte[] bArr, long j, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j);
            i8++;
            j >>= 8;
        }
    }

    public static String W(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static ActionMode.Callback X(ActionMode.Callback callback) {
        return (!(callback instanceof o) || Build.VERSION.SDK_INT < 26) ? callback : ((o) callback).f6628a;
    }

    public static ActionMode.Callback Y(ActionMode.Callback callback, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        return (i7 < 26 || i7 > 27 || (callback instanceof o) || callback == null) ? callback : new o(callback, textView);
    }

    public static ArrayList Z(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof H5.n) {
            H5.n nVar = (H5.n) th;
            arrayList.add(nVar.f3387a);
            arrayList.add(nVar.getMessage());
            arrayList.add(nVar.f3388b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static void a0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void b0(Parcel parcel, Parcelable parcelable, int i7) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i7);
        }
    }

    public static ArrayList c0(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            Field field = null;
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException e7) {
            e = e7;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        } catch (NoSuchFieldException e8) {
            e = e8;
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e);
            return new ArrayList();
        }
    }

    public static Object d(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static MultiFactorInfo d0(zzags zzagsVar) {
        if (zzagsVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzagsVar.zze())) {
            String strZzd = zzagsVar.zzd();
            String strZzc = zzagsVar.zzc();
            long jZza = zzagsVar.zza();
            String strZze = zzagsVar.zze();
            D.e(strZze);
            return new PhoneMultiFactorInfo(strZzd, strZzc, jZza, strZze);
        }
        if (zzagsVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzagsVar.zzd();
        String strZzc2 = zzagsVar.zzc();
        long jZza2 = zzagsVar.zza();
        zzahp zzahpVarZzb = zzagsVar.zzb();
        D.j(zzahpVarZzb, "totpInfo cannot be null.");
        return new TotpMultiFactorInfo(strZzd2, strZzc2, jZza2, zzahpVarZzb);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static p023d1.e e(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e7;
        p023d1.e eVar = new p023d1.e();
        if (bArr == null) {
            return eVar;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i7 = objectInputStream.readInt(); i7 > 0; i7--) {
                            eVar.f12359a.add(new d(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e9) {
                        e7 = e9;
                        e7.printStackTrace();
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e12) {
                        e12.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e13) {
                objectInputStream = null;
                e7 = e13;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return eVar;
    }

    public static Object e0(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            J2.j.e("Unexpected exception.", th);
            zzbtl.zza(context).zzh(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }

    public static ArrayList f0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo multiFactorInfoD0 = d0((zzags) it.next());
            if (multiFactorInfoD0 != null) {
                arrayList.add(multiFactorInfoD0);
            }
        }
        return arrayList;
    }

    public static p167y2.j[] g0(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        p167y2.j[] jVarArr = new p167y2.j[length];
        for (int i7 = 0; i7 < strArrSplit.length; i7++) {
            String strTrim = strArrSplit[i7].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    jVarArr[i7] = new p167y2.j("FULL_WIDTH".equals(strArrSplit2[0]) ? -1 : Integer.parseInt(strArrSplit2[0]), "AUTO_HEIGHT".equals(strArrSplit2[1]) ? -2 : Integer.parseInt(strArrSplit2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18161i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18162k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18163l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18164m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18166o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18165n;
            } else if ("FLUID".equals(strTrim)) {
                jVarArr[i7] = p167y2.j.f18167p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                jVarArr[i7] = p167y2.j.f18169r;
            }
        }
        if (length != 0) {
            return jVarArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b7 = 0;
        long jF = F(0, bArr) & 67108863;
        long jF2 = (F(3, bArr) >> 2) & 67108611;
        long jF3 = (F(6, bArr) >> 4) & 67092735;
        long jF4 = (F(9, bArr) >> 6) & 66076671;
        long jF5 = (F(12, bArr) >> 8) & 1048575;
        long j = jF2 * 5;
        long j3 = jF3 * 5;
        long j7 = jF4 * 5;
        long j8 = jF5 * 5;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j9 = 0;
        int i8 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i8 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i8);
            System.arraycopy(bArr2, i8, bArr3, b7, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i7, b7);
            }
            long jF6 = j13 + (F(b7, bArr3) & 67108863);
            long jF7 = j9 + ((F(3, bArr3) >> 2) & 67108863);
            long jF8 = j10 + ((F(6, bArr3) >> 4) & 67108863);
            long jF9 = j11 + ((F(9, bArr3) >> 6) & 67108863);
            long jF10 = j12 + (((F(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j14 = (jF10 * j) + (jF9 * j3) + (jF8 * j7) + (jF7 * j8) + (jF6 * jF);
            long j15 = (jF10 * j3) + (jF9 * j7) + (jF8 * j8) + (jF7 * jF) + (jF6 * jF2);
            long j16 = (jF10 * j7) + (jF9 * j8) + (jF8 * jF) + (jF7 * jF2) + (jF6 * jF3);
            long j17 = (jF10 * j8) + (jF9 * jF) + (jF8 * jF2) + (jF7 * jF3) + (jF6 * jF4);
            long j18 = jF9 * jF2;
            long j19 = jF10 * jF;
            long j20 = j15 + (j14 >> 26);
            long j21 = j16 + (j20 >> 26);
            long j22 = j17 + (j21 >> 26);
            long j23 = j19 + j18 + (jF8 * jF3) + (jF7 * jF4) + (jF6 * jF5) + (j22 >> 26);
            long j24 = j23 >> 26;
            j12 = j23 & 67108863;
            long j25 = (j24 * 5) + (j14 & 67108863);
            long j26 = j25 & 67108863;
            j9 = (j20 & 67108863) + (j25 >> 26);
            i8 += 16;
            j10 = j21 & 67108863;
            j11 = j22 & 67108863;
            b7 = 0;
            i7 = 17;
            j13 = j26;
        }
        long j27 = j10 + (j9 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j11 + (j27 >> 26);
        long j30 = j29 & 67108863;
        long j31 = j12 + (j29 >> 26);
        long j32 = j31 & 67108863;
        long j33 = ((j31 >> 26) * 5) + j13;
        long j34 = j33 >> 26;
        long j35 = j33 & 67108863;
        long j36 = (j9 & 67108863) + j34;
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = j36 + (j37 >> 26);
        long j40 = j28 + (j39 >> 26);
        long j41 = j30 + (j40 >> 26);
        long j42 = (j32 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = ~j43;
        long j45 = (j36 & j43) | (j39 & 67108863 & j44);
        long j46 = (j28 & j43) | (j40 & 67108863 & j44);
        long j47 = (j30 & j43) | (j41 & 67108863 & j44);
        long j48 = ((j35 & j43) | (j38 & j44) | (j45 << 26)) & 4294967295L;
        long j49 = ((j45 >> 6) | (j46 << 20)) & 4294967295L;
        long j50 = ((j46 >> 12) | (j47 << 14)) & 4294967295L;
        long j51 = ((((j42 & j44) | (j32 & j43)) << 8) | (j47 >> 18)) & 4294967295L;
        long jF11 = F(16, bArr) + j48;
        long jF12 = F(20, bArr) + j49 + (jF11 >> 32);
        long jF13 = F(24, bArr) + j50 + (jF12 >> 32);
        long jF14 = (F(28, bArr) + j51 + (jF13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        V(bArr4, jF11 & 4294967295L, 0);
        V(bArr4, jF12 & 4294967295L, 4);
        V(bArr4, jF13 & 4294967295L, 8);
        V(bArr4, jF14, 12);
        return bArr4;
    }

    public static int k(C c3, AbstractC0021h abstractC0021h, View view, View view2, u uVar, boolean z4) {
        if (uVar.p() == 0 || c3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z4) {
            return Math.min(abstractC0021h.i(), abstractC0021h.d(view2) - abstractC0021h.e(view));
        }
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static int l(C c3, AbstractC0021h abstractC0021h, View view, View view2, u uVar, boolean z4) {
        if (uVar.p() == 0 || c3.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z4) {
            return c3.a();
        }
        abstractC0021h.d(view2);
        abstractC0021h.e(view);
        ((v) view.getLayoutParams()).getClass();
        throw null;
    }

    public static q m(Context context) {
        ProviderInfo providerInfo;
        I4.j jVar;
        ApplicationInfo applicationInfo;
        C1009l0 cVar = Build.VERSION.SDK_INT >= 28 ? new p046g0.c(17) : new C1009l0(17);
        PackageManager packageManager = context.getPackageManager();
        i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            jVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrK = cVar.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrK) {
                    arrayList.add(signature.toByteArray());
                }
                jVar = new I4.j(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
                jVar = null;
            }
        }
        if (jVar == null) {
            return null;
        }
        return new q(new p046g0.p(jVar, context));
    }

    public static void q(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (g gVar : (Set) it2.next()) {
                        for (p048g4.i iVar : gVar.f13207a.f13191c) {
                            if (iVar.f13214c == 0) {
                                Set<g> set = (Set) map.get(new p048g4.h(iVar.f13212a, iVar.f13213b == 2));
                                if (set != null) {
                                    for (g gVar2 : set) {
                                        gVar.f13208b.add(gVar2);
                                        gVar2.f13209c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<g> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (g gVar3 : hashSet) {
                    if (gVar3.f13209c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    g gVar4 = (g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i7++;
                    for (g gVar5 : gVar4.f13208b) {
                        gVar5.f13209c.remove(gVar4);
                        if (gVar5.f13209c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (g gVar6 : hashSet) {
                    if (!gVar6.f13209c.isEmpty() && !gVar6.f13208b.isEmpty()) {
                        arrayList2.add(gVar6.f13207a);
                    }
                }
                throw new p048g4.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            p048g4.a aVar = (p048g4.a) it.next();
            g gVar7 = new g(aVar);
            for (p048g4.q qVar : aVar.f13190b) {
                boolean z4 = aVar.f13193e == 0;
                p048g4.h hVar = new p048g4.h(qVar, !z4);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set2 = (Set) map.get(hVar);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(gVar7);
            }
        }
    }

    public static int r(int i7, int i8, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i7 ^ i8) >> 31) | 1;
        switch (b.f2869a[roundingMode.ordinal()]) {
            case 1:
                if (i10 == 0) {
                    return i9;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i9;
            case 3:
                if (i11 >= 0) {
                    return i9;
                }
                break;
            case 4:
                break;
            case 5:
                if (i11 <= 0) {
                    return i9;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i10);
                int iAbs2 = iAbs - (Math.abs(i8) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i9 & 1) != 0))) {
                            return i9;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i9;
                }
            default:
                throw new AssertionError();
        }
        return i9 + i11;
    }

    public static boolean t(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static ActionCodeSettings u(E e7) {
        C0306n c0306n = new C0306n(1);
        c0306n.f3631a = e7.f2263a;
        String str = e7.f2264b;
        if (str != null) {
            c0306n.f3637g = str;
        }
        c0306n.f3635e = e7.f2265c.booleanValue();
        String str2 = e7.f2267e;
        if (str2 != null) {
            boolean zBooleanValue = e7.f2268f.booleanValue();
            String str3 = e7.f2269g;
            c0306n.f3633c = str2;
            c0306n.f3634d = zBooleanValue;
            c0306n.f3636f = str3;
        }
        String str4 = e7.f2266d;
        if (str4 != null) {
            c0306n.f3632b = str4;
        }
        if (c0306n.f3631a != null) {
            return new ActionCodeSettings(c0306n);
        }
        throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
    }

    public static AuthCredential v(Map map) {
        String str;
        if (map.get("token") != null) {
            Integer num = (Integer) map.get("token");
            num.getClass();
            AuthCredential authCredential = (AuthCredential) C0188f.f2361z.get(num);
            if (authCredential != null) {
                return authCredential;
            }
            throw Y4.D.w();
        }
        Object obj = map.get("signInMethod");
        Objects.requireNonNull(obj);
        String str2 = (String) obj;
        String str3 = (String) map.get("secret");
        String str4 = (String) map.get("idToken");
        String str5 = (String) map.get("accessToken");
        String str6 = (String) map.get("rawNonce");
        switch (str2) {
            case "twitter.com":
                Objects.requireNonNull(str5);
                Objects.requireNonNull(str3);
                return new TwitterAuthCredential(str5, str3);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return new PlayGamesAuthCredential((String) obj2);
            case "google.com":
                return new GoogleAuthCredential(str4, str5);
            case "facebook.com":
                Objects.requireNonNull(str5);
                return new FacebookAuthCredential(str5);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                String str7 = (String) obj3;
                D.e(str7);
                String str8 = str5 != null ? str5 : null;
                if (str6 == null) {
                    Objects.requireNonNull(str4);
                    str = null;
                } else {
                    Objects.requireNonNull(str4);
                    str = str6;
                }
                D.f(str7, "Must specify a non-empty providerId");
                if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str8)) {
                    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
                }
                return new zze(str7, str4, str8, null, null, null, str);
            case "phone":
                Object obj4 = map.get("verificationId");
                Objects.requireNonNull(obj4);
                Object obj5 = map.get("smsCode");
                Objects.requireNonNull(obj5);
                return PhoneAuthCredential.n((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get("email");
                Objects.requireNonNull(obj6);
                String str9 = (String) obj6;
                Objects.requireNonNull(str3);
                D.e(str9);
                D.e(str3);
                return new EmailAuthCredential(str9, str3, null, null, false);
            case "github.com":
                Objects.requireNonNull(str5);
                return new GithubAuthCredential(str5);
            case "emailLink":
                Object obj7 = map.get("email");
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return P6.b.m((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static Drawable w(Context context, int i7) {
        return C0.b().c(context, i7);
    }

    public static N.c x(AppCompatTextView appCompatTextView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            return new N.c(n.c(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = l.a(appCompatTextView);
        int iD = l.d(appCompatTextView);
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i7 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z4 = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z4) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(n.b(m.a(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new N.c(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static void y(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static int z(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0486a1.f(i7, "Could not convert ", " to BackoffPolicy"));
    }

    public abstract void N(p103o1.h hVar, p103o1.h hVar2);

    public abstract void O(p103o1.h hVar, Thread thread);

    public abstract boolean f(p103o1.i iVar, p103o1.d dVar, p103o1.d dVar2);

    public abstract boolean g(p103o1.i iVar, Object obj, Object obj2);

    public abstract boolean h(p103o1.i iVar, p103o1.h hVar, p103o1.h hVar2);

    public Metadata n(S1.c cVar) {
        ByteBuffer byteBuffer = cVar.f1697d;
        byteBuffer.getClass();
        p151v2.a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (cVar.f(Integer.MIN_VALUE)) {
            return null;
        }
        return o(cVar, byteBuffer);
    }

    public abstract Metadata o(S1.c cVar, ByteBuffer byteBuffer);

    public abstract String p(byte[] bArr, int i7, int i8);

    public abstract int s(String str, byte[] bArr, int i7, int i8);

    @Override // P.c0
    public void a() {
    }

    @Override // P.c0
    public void b() {
    }
}
