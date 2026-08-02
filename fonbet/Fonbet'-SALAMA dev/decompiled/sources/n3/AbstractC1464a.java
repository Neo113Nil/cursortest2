package n3;

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
import I2.C0306n;
import I4.j;
import P.c0;
import R5.C0406b;
import R5.T;
import V.l;
import V.m;
import V.n;
import V.o;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
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
import d1.C0951d;
import d1.C0952e;
import e4.C1036j;
import e4.InterfaceC1042p;
import f6.C1116i;
import g0.C1121c;
import g0.p;
import g0.q;
import g4.C1128a;
import g4.C1134g;
import g4.C1135h;
import g4.C1136i;
import g4.C1137j;
import g4.C1144q;
import g6.AbstractC1170s;
import g6.C1169r;
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
import o1.AbstractC1499i;
import o1.C1494d;
import o1.C1498h;
import t.e;
import t6.h;
import v2.AbstractC1664a;
import w1.C1718l0;
import w1.F0;
import w1.V0;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1464a implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public static Context f15346a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f15347b;

    /* renamed from: c, reason: collision with root package name */
    public static long f15348c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f15349d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f15350e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f15351f;

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
            if (f15349d == null) {
                f15348c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f15349d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f15349d.invoke(null, Long.valueOf(f15348c))).booleanValue();
        } catch (Exception e7) {
            y("isTagEnabled", e7);
            return false;
        }
    }

    public static synchronized boolean E(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC1464a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f15346a;
            if (context2 != null && (bool = f15347b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f15347b = null;
            if (m3.c.h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f15347b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f15347b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f15347b = Boolean.FALSE;
                }
            }
            f15346a = applicationContext;
            return f15347b.booleanValue();
        }
    }

    public static long F(int i7, byte[] bArr) {
        return (((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16)) & 4294967295L;
    }

    public static int G(int i7, RoundingMode roundingMode) {
        if (i7 <= 0) {
            throw new IllegalArgumentException(AbstractC0486a1.f(i7, "x (", ") must be > 0"));
        }
        switch (G3.b.f2869a[roundingMode.ordinal()]) {
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
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i7);
                return (31 - numberOfLeadingZeros) + ((~(~(((-1257966797) >>> numberOfLeadingZeros) - i7))) >>> 31);
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
                Double valueOf = Double.valueOf(phoneMultiFactorInfo.f11884c);
                J j = new J();
                j.f2291a = str2;
                j.f2292b = valueOf;
                j.f2293c = "phone";
                String str3 = phoneMultiFactorInfo.f11882a;
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                j.f2294d = str3;
                j.f2295e = str;
                arrayList2.add(j);
            } else {
                String e7 = multiFactorInfo.e();
                Double valueOf2 = Double.valueOf(multiFactorInfo.j());
                String a2 = multiFactorInfo.a();
                String k7 = multiFactorInfo.k();
                J j3 = new J();
                j3.f2291a = e7;
                j3.f2292b = valueOf2;
                j3.f2293c = k7;
                if (a2 == null) {
                    throw new IllegalStateException("Nonnull field \"uid\" is null.");
                }
                j3.f2294d = a2;
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
        int hashCode = authCredential.hashCode();
        C0188f.f2361z.put(Integer.valueOf(hashCode), authCredential);
        String j = authCredential.j();
        String k7 = authCredential.k();
        Long valueOf = Long.valueOf(hashCode);
        String str = authCredential instanceof OAuthCredential ? ((zze) ((OAuthCredential) authCredential)).f11953c : null;
        G g3 = new G();
        if (j == null) {
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }
        g3.f2275a = j;
        if (k7 == null) {
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        g3.f2276b = k7;
        g3.f2277c = valueOf;
        g3.f2278d = str;
        return g3;
    }

    public static O K(AuthResult authResult) {
        zzx zzxVar = (zzx) authResult;
        zzv zzvVar = zzxVar.f11937b;
        F f7 = null;
        if (zzvVar != null) {
            Boolean valueOf = Boolean.valueOf(zzvVar.f11935d);
            String str = zzvVar.f11932a;
            boolean equals = "github.com".equals(str);
            r.b bVar = zzvVar.f11934c;
            String str2 = equals ? (String) bVar.getOrDefault("login", null) : "twitter.com".equals(str) ? (String) bVar.getOrDefault("screen_name", null) : null;
            F f8 = new F();
            f8.f2270a = valueOf;
            f8.f2271b = str;
            f8.f2272c = str2;
            f8.f2273d = null;
            f8.f2274e = bVar;
            f7 = f8;
        }
        G J5 = J(zzxVar.f11938c);
        P L7 = L(zzxVar.f11936a);
        O o7 = new O();
        o7.f2307a = L7;
        o7.f2308b = f7;
        o7.f2309c = J5;
        return o7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if ("".equals(r4) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0046, code lost:
    
        if ("".equals(r8) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static P L(FirebaseUser firebaseUser) {
        Long l7;
        Long l8;
        String uri;
        String uri2;
        ArrayList arrayList = null;
        if (firebaseUser == null) {
            return null;
        }
        zzad zzadVar = (zzad) firebaseUser;
        zzz zzzVar = zzadVar.f11909b;
        String str = zzzVar.f11941c;
        String str2 = zzzVar.f11944f;
        Boolean valueOf = Boolean.valueOf(zzzVar.f11946y);
        Boolean valueOf2 = Boolean.valueOf(firebaseUser.k());
        zzaf zzafVar = zzadVar.f11916z;
        if (zzafVar != null) {
            l7 = Long.valueOf(zzafVar.f11918b);
            l8 = Long.valueOf(zzadVar.f11916z.f11917a);
        } else {
            l7 = null;
            l8 = null;
        }
        zzz zzzVar2 = zzadVar.f11909b;
        String str3 = zzzVar2.f11945x;
        Uri b7 = zzzVar2.b();
        if (b7 != null) {
            uri = b7.toString();
        }
        uri = null;
        String str4 = zzadVar.f11909b.f11939a;
        String j = firebaseUser.j();
        Q q7 = new Q();
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        q7.f2312a = str4;
        q7.f2313b = str2;
        q7.f2314c = str;
        q7.f2315d = uri;
        q7.f2316e = str3;
        q7.f2317f = valueOf2;
        q7.f2318g = valueOf;
        q7.f2319h = null;
        q7.f2320i = j;
        q7.j = null;
        q7.f2321k = l7;
        q7.f2322l = l8;
        ArrayList arrayList2 = zzadVar.f11912e;
        ArrayList arrayList3 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                InterfaceC1042p interfaceC1042p = (InterfaceC1042p) it.next();
                if (interfaceC1042p != null && !"firebase".equals(interfaceC1042p.g())) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("displayName", interfaceC1042p.e());
                    hashMap.put("email", interfaceC1042p.i());
                    hashMap.put("isEmailVerified", Boolean.valueOf(interfaceC1042p.c()));
                    hashMap.put("phoneNumber", interfaceC1042p.d());
                    Uri b8 = interfaceC1042p.b();
                    if (b8 != null) {
                        uri2 = b8.toString();
                    }
                    uri2 = null;
                    hashMap.put("photoUrl", uri2);
                    hashMap.put("uid", interfaceC1042p.a() == null ? "" : interfaceC1042p.a());
                    hashMap.put("providerId", interfaceC1042p.g());
                    hashMap.put("isAnonymous", Boolean.FALSE);
                    arrayList3.add(hashMap);
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

    public static I M(C1036j c1036j) {
        String str = c1036j.f12681a;
        Map map = (Map) c1036j.f12682b.get("firebase");
        String str2 = map != null ? (String) map.get("sign_in_provider") : null;
        Integer num = (Integer) c1036j.f12682b.get("auth_time");
        Long valueOf = Long.valueOf((num == null ? 0L : num.longValue()) * 1000);
        Integer num2 = (Integer) c1036j.f12682b.get("exp");
        Long valueOf2 = Long.valueOf((num2 == null ? 0L : num2.longValue()) * 1000);
        Integer num3 = (Integer) c1036j.f12682b.get("iat");
        Long valueOf3 = Long.valueOf((num3 != null ? num3.longValue() : 0L) * 1000);
        Map map2 = c1036j.f12682b;
        Map map3 = (Map) map2.get("firebase");
        String str3 = map3 != null ? (String) map3.get("sign_in_second_factor") : null;
        I i7 = new I();
        i7.f2284a = str;
        i7.f2285b = valueOf2;
        i7.f2286c = valueOf;
        i7.f2287d = valueOf3;
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
            return C1169r.f13304a;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            h.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC1170s.K0(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void S(f fVar, final T t7) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        A5.n c0406b = (t7 == null || (jVar = t7.f6101a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getCName", c0406b, obj, 1);
        if (t7 != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    switch (i7) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                w02 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                w03 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                w04 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                w05 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getDName", c0406b, obj, 1);
        if (t7 != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    switch (i8) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                w02 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                w03 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                w04 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                w05 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getOName", c0406b, obj, 1);
        if (t7 != null) {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    switch (i9) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                w02 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                w03 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                w04 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                w05 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.getUName", c0406b, obj, 1);
        if (t7 == null) {
            f05.M(null);
        } else {
            final int i10 = 3;
            f05.M(new A5.b() { // from class: R5.H
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    switch (i10) {
                        case 0:
                            T t8 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName = (SslCertificate.DName) obj3;
                            try {
                                t8.getClass();
                                w02 = Y4.D.D(dName.getCName());
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            T t9 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName2 = (SslCertificate.DName) obj4;
                            try {
                                t9.getClass();
                                w03 = Y4.D.D(dName2.getDName());
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            T t10 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName3 = (SslCertificate.DName) obj5;
                            try {
                                t10.getClass();
                                w04 = Y4.D.D(dName3.getOName());
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        default:
                            T t11 = t7;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate.DName");
                            SslCertificate.DName dName4 = (SslCertificate.DName) obj6;
                            try {
                                t11.getClass();
                                w05 = Y4.D.D(dName4.getUName());
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                    }
                }
            });
        }
    }

    public static void T(Function2 function2, AbstractC0109a abstractC0109a, AbstractC0109a abstractC0109a2) {
        try {
            I6.a.h(P6.b.v(P6.b.i(abstractC0109a, abstractC0109a2, function2)), C1116i.f13008a, null);
        } catch (Throwable th) {
            abstractC0109a2.resumeWith(AbstractC0603a.h(th));
            throw th;
        }
    }

    public static int U(int i7) {
        int e7 = e.e(i7);
        if (e7 == 0) {
            return 0;
        }
        int i8 = 1;
        if (e7 != 1) {
            i8 = 2;
            if (e7 != 2) {
                i8 = 3;
                if (e7 != 3) {
                    i8 = 4;
                    if (e7 != 4) {
                        if (e7 == 5) {
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
            Iterator it = arrayList.iterator();
            Field field = null;
            while (it.hasNext()) {
                Object next = it.next();
                if (field == null) {
                    field = next.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(next));
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
            String zzd = zzagsVar.zzd();
            String zzc = zzagsVar.zzc();
            long zza = zzagsVar.zza();
            String zze = zzagsVar.zze();
            D.e(zze);
            return new PhoneMultiFactorInfo(zzd, zzc, zza, zze);
        }
        if (zzagsVar.zzb() == null) {
            return null;
        }
        String zzd2 = zzagsVar.zzd();
        String zzc2 = zzagsVar.zzc();
        long zza2 = zzagsVar.zza();
        zzahp zzb = zzagsVar.zzb();
        D.j(zzb, "totpInfo cannot be null.");
        return new TotpMultiFactorInfo(zzd2, zzc2, zza2, zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0952e e(byte[] bArr) {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e7;
        C0952e c0952e = new C0952e();
        if (bArr == null) {
            return c0952e;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            c0952e.f12353a.add(new C0951d(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
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
                        return c0952e;
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
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
        return c0952e;
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
            MultiFactorInfo d02 = d0((zzags) it.next());
            if (d02 != null) {
                arrayList.add(d02);
            }
        }
        return arrayList;
    }

    public static y2.j[] g0(String str) {
        String[] split = str.split("\\s*,\\s*");
        int length = split.length;
        y2.j[] jVarArr = new y2.j[length];
        for (int i7 = 0; i7 < split.length; i7++) {
            String trim = split[i7].trim();
            if (trim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] split2 = trim.split("[xX]");
                split2[0] = split2[0].trim();
                split2[1] = split2[1].trim();
                try {
                    jVarArr[i7] = new y2.j("FULL_WIDTH".equals(split2[0]) ? -1 : Integer.parseInt(split2[0]), "AUTO_HEIGHT".equals(split2[1]) ? -2 : Integer.parseInt(split2[1]));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
            } else if ("BANNER".equals(trim)) {
                jVarArr[i7] = y2.j.f18155i;
            } else if ("LARGE_BANNER".equals(trim)) {
                jVarArr[i7] = y2.j.f18156k;
            } else if ("FULL_BANNER".equals(trim)) {
                jVarArr[i7] = y2.j.j;
            } else if ("LEADERBOARD".equals(trim)) {
                jVarArr[i7] = y2.j.f18157l;
            } else if ("MEDIUM_RECTANGLE".equals(trim)) {
                jVarArr[i7] = y2.j.f18158m;
            } else if ("SMART_BANNER".equals(trim)) {
                jVarArr[i7] = y2.j.f18160o;
            } else if ("WIDE_SKYSCRAPER".equals(trim)) {
                jVarArr[i7] = y2.j.f18159n;
            } else if ("FLUID".equals(trim)) {
                jVarArr[i7] = y2.j.f18161p;
            } else {
                if (!"ICON".equals(trim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(trim));
                }
                jVarArr[i7] = y2.j.f18163r;
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
        long F7 = F(0, bArr) & 67108863;
        long F8 = (F(3, bArr) >> 2) & 67108611;
        long F9 = (F(6, bArr) >> 4) & 67092735;
        long F10 = (F(9, bArr) >> 6) & 66076671;
        long F11 = (F(12, bArr) >> 8) & 1048575;
        long j = F8 * 5;
        long j3 = F9 * 5;
        long j7 = F10 * 5;
        long j8 = F11 * 5;
        int i7 = 17;
        byte[] bArr3 = new byte[17];
        long j9 = 0;
        int i8 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i8 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i8);
            System.arraycopy(bArr2, i8, bArr3, b7, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i7, b7);
            }
            long F12 = j13 + (F(b7, bArr3) & 67108863);
            long F13 = j9 + ((F(3, bArr3) >> 2) & 67108863);
            long F14 = j10 + ((F(6, bArr3) >> 4) & 67108863);
            long F15 = j11 + ((F(9, bArr3) >> 6) & 67108863);
            long F16 = j12 + (((F(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j14 = (F16 * j) + (F15 * j3) + (F14 * j7) + (F13 * j8) + (F12 * F7);
            long j15 = (F16 * j3) + (F15 * j7) + (F14 * j8) + (F13 * F7) + (F12 * F8);
            long j16 = (F16 * j7) + (F15 * j8) + (F14 * F7) + (F13 * F8) + (F12 * F9);
            long j17 = (F16 * j8) + (F15 * F7) + (F14 * F8) + (F13 * F9) + (F12 * F10);
            long j18 = F15 * F8;
            long j19 = F16 * F7;
            long j20 = j15 + (j14 >> 26);
            long j21 = j16 + (j20 >> 26);
            long j22 = j17 + (j21 >> 26);
            long j23 = j19 + j18 + (F14 * F9) + (F13 * F10) + (F12 * F11) + (j22 >> 26);
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
        long F17 = F(16, bArr) + j48;
        long F18 = F(20, bArr) + j49 + (F17 >> 32);
        long F19 = F(24, bArr) + j50 + (F18 >> 32);
        long F20 = (F(28, bArr) + j51 + (F19 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        V(bArr4, F17 & 4294967295L, 0);
        V(bArr4, F18 & 4294967295L, 4);
        V(bArr4, F19 & 4294967295L, 8);
        V(bArr4, F20, 12);
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q m(Context context) {
        ProviderInfo providerInfo;
        j jVar;
        ApplicationInfo applicationInfo;
        C1718l0 c1121c = Build.VERSION.SDK_INT >= 28 ? new C1121c(17) : new C1718l0(17);
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
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] k7 = c1121c.k(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : k7) {
                    arrayList.add(signature.toByteArray());
                }
                jVar = new j(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e7) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e7);
            }
            if (jVar != null) {
                return null;
            }
            return new q(new p(jVar, context));
        }
        jVar = null;
        if (jVar != null) {
        }
    }

    public static void q(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i7 = 0;
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (C1134g c1134g : (Set) it2.next()) {
                        for (C1136i c1136i : c1134g.f13201a.f13185c) {
                            if (c1136i.f13208c == 0) {
                                Set<C1134g> set = (Set) hashMap.get(new C1135h(c1136i.f13206a, c1136i.f13207b == 2));
                                if (set != null) {
                                    for (C1134g c1134g2 : set) {
                                        c1134g.f13202b.add(c1134g2);
                                        c1134g2.f13203c.add(c1134g);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C1134g c1134g3 = (C1134g) it4.next();
                    if (c1134g3.f13203c.isEmpty()) {
                        hashSet2.add(c1134g3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C1134g c1134g4 = (C1134g) hashSet2.iterator().next();
                    hashSet2.remove(c1134g4);
                    i7++;
                    Iterator it5 = c1134g4.f13202b.iterator();
                    while (it5.hasNext()) {
                        C1134g c1134g5 = (C1134g) it5.next();
                        c1134g5.f13203c.remove(c1134g4);
                        if (c1134g5.f13203c.isEmpty()) {
                            hashSet2.add(c1134g5);
                        }
                    }
                }
                if (i7 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    C1134g c1134g6 = (C1134g) it6.next();
                    if (!c1134g6.f13203c.isEmpty() && !c1134g6.f13202b.isEmpty()) {
                        arrayList2.add(c1134g6.f13201a);
                    }
                }
                throw new C1137j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C1128a c1128a = (C1128a) it.next();
            C1134g c1134g7 = new C1134g(c1128a);
            for (C1144q c1144q : c1128a.f13184b) {
                boolean z4 = c1128a.f13187e == 0;
                C1135h c1135h = new C1135h(c1144q, !z4);
                if (!hashMap.containsKey(c1135h)) {
                    hashMap.put(c1135h, new HashSet());
                }
                Set set2 = (Set) hashMap.get(c1135h);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + c1144q + ".");
                }
                set2.add(c1134g7);
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
        switch (G3.b.f2869a[roundingMode.ordinal()]) {
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
                int abs = Math.abs(i10);
                int abs2 = abs - (Math.abs(i8) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i9 & 1) != 0))) {
                            return i9;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i9;
                }
                break;
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
            boolean booleanValue = e7.f2268f.booleanValue();
            String str3 = e7.f2269g;
            c0306n.f3633c = str2;
            c0306n.f3634d = booleanValue;
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
        String str2;
        String str3;
        String str4;
        String str5;
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
        String str6 = (String) obj;
        str = (String) map.get("secret");
        str2 = (String) map.get("idToken");
        str3 = (String) map.get("accessToken");
        str4 = (String) map.get("rawNonce");
        switch (str6) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return new TwitterAuthCredential(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get("serverAuthCode");
                Objects.requireNonNull(obj2);
                return new PlayGamesAuthCredential((String) obj2);
            case "google.com":
                return new GoogleAuthCredential(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return new FacebookAuthCredential(str3);
            case "oauth":
                Object obj3 = map.get("providerId");
                Objects.requireNonNull(obj3);
                String str7 = (String) obj3;
                D.e(str7);
                String str8 = str3 != null ? str3 : null;
                if (str4 == null) {
                    Objects.requireNonNull(str2);
                    str5 = null;
                } else {
                    Objects.requireNonNull(str2);
                    str5 = str4;
                }
                D.f(str7, "Must specify a non-empty providerId");
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str8)) {
                    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
                }
                return new zze(str7, str2, str8, null, null, null, str5);
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
                Objects.requireNonNull(str);
                D.e(str9);
                D.e(str);
                return new EmailAuthCredential(str9, str, null, null, false);
            case "github.com":
                Objects.requireNonNull(str3);
                return new GithubAuthCredential(str3);
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
        int a2 = l.a(appCompatTextView);
        int d7 = l.d(appCompatTextView);
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i7 < 28 || (appCompatTextView.getInputType() & 15) != 3) {
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
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(n.b(m.a(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new N.c(textPaint, textDirectionHeuristic, a2, d7);
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

    public abstract void N(C1498h c1498h, C1498h c1498h2);

    public abstract void O(C1498h c1498h, Thread thread);

    public abstract boolean f(AbstractC1499i abstractC1499i, C1494d c1494d, C1494d c1494d2);

    public abstract boolean g(AbstractC1499i abstractC1499i, Object obj, Object obj2);

    public abstract boolean h(AbstractC1499i abstractC1499i, C1498h c1498h, C1498h c1498h2);

    public Metadata n(S1.c cVar) {
        ByteBuffer byteBuffer = cVar.f1697d;
        byteBuffer.getClass();
        AbstractC1664a.f(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
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
