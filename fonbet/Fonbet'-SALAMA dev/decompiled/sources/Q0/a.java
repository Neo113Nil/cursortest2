package Q0;

import A1.C0045t0;
import A1.W;
import A3.m;
import A5.f;
import A5.n;
import E2.o;
import F2.C0254t;
import H2.q;
import I2.J;
import I4.j;
import J2.l;
import K5.i;
import N6.g;
import R5.C0406b;
import R5.C0423t;
import R5.C0424u;
import R5.M;
import W5.AbstractC0486a1;
import a.AbstractC0603a;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.webkit.WebSettings;
import b4.C0782b;
import b4.C0784d;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzfba;
import com.google.android.gms.internal.ads.zzfgd;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqa;
import com.google.android.gms.internal.ads.zzfss;
import com.google.android.gms.internal.ads.zzftw;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d4.InterfaceC0965b;
import e1.k;
import e4.C1036j;
import f4.InterfaceC1090b;
import g4.C1128a;
import g4.C1136i;
import g4.C1144q;
import io.sentry.SentryEvent;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function1;
import m6.AbstractC1440a;
import n6.AbstractC1482a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.e;
import t6.h;
import u5.C1649c;
import v0.AbstractC1663a;
import w1.F0;
import w1.V0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f5736a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static Field f5737b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5738c = false;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f5739d = true;

    /* renamed from: e, reason: collision with root package name */
    public static Field f5740e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f5741f;

    /* renamed from: g, reason: collision with root package name */
    public static Class f5742g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f5743h;

    /* renamed from: i, reason: collision with root package name */
    public static Field f5744i;
    public static boolean j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f5745k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f5746l;

    public static String A(InterfaceC0965b interfaceC0965b) {
        if (interfaceC0965b == null) {
            return null;
        }
        try {
            C0782b c0782b = (C0782b) Tasks.await(((C0784d) interfaceC0965b).b(false), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
            if (c0782b.f10130b != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + c0782b.f10130b);
            }
            return c0782b.f10129a;
        } catch (InterruptedException e7) {
            e = e7;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (ExecutionException e8) {
            e = e8;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        } catch (TimeoutException e9) {
            e = e9;
            Log.e("StorageUtil", "Unexpected error getting App Check token: " + e);
            return null;
        }
    }

    public static String B(InterfaceC1090b interfaceC1090b) {
        String str;
        if (interfaceC1090b != null) {
            try {
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC1090b;
                str = ((C1036j) Tasks.await(firebaseAuth.h(firebaseAuth.f11854f, false), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS)).f12681a;
            } catch (InterruptedException e7) {
                e = e7;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (ExecutionException e8) {
                e = e8;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            } catch (TimeoutException e9) {
                e = e9;
                Log.e("StorageUtil", "error getting token " + e);
                return null;
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    public static String C(int i7) {
        switch (i7) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return k.d(i7, "unknown status code: ");
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
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case zzbbd.zzt.zzm /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean E() {
        return e.e(f5736a) >= 0;
    }

    public static w F(String str, FirebaseAuth firebaseAuth) {
        D.e(str);
        D.i(firebaseAuth);
        if (!"facebook.com".equals(str) || zzafb.zza(firebaseAuth.f11849a)) {
            return new w(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static Uri G(String str) {
        String str2;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = T4.c.f6351k;
        str2 = "";
        if (str.toLowerCase().startsWith("gs://")) {
            String B7 = P6.b.B(str.substring(5));
            if (!TextUtils.isEmpty(B7)) {
                String encode = Uri.encode(B7);
                D.i(encode);
                str2 = encode.replace("%2F", "/");
            }
            return Uri.parse("gs://" + str2);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme == null || !(D.m(scheme.toLowerCase(), "http") || D.m(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String encodedPath = parse.getEncodedPath();
        D.i(encodedPath);
        String replace = encodedPath.replace("%2F", "/");
        if (indexOf == 0 && replace.startsWith("/")) {
            int indexOf2 = replace.indexOf("/b/", 0);
            int i7 = indexOf2 + 3;
            int indexOf3 = replace.indexOf("/", i7);
            int indexOf4 = replace.indexOf("/o/", 0);
            if (indexOf2 == -1 || indexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = replace.substring(i7, indexOf3);
            replace = indexOf4 != -1 ? replace.substring(indexOf4 + 3) : "";
        } else {
            if (indexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            substring = parse.getAuthority().substring(0, indexOf - 1);
        }
        D.f(substring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(substring).encodedPath(replace).build();
    }

    public static long H(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e7) {
            Log.w("StorageUtil", "unable to parse datetime:" + replaceAll, e7);
            return 0L;
        }
    }

    public static i I(Exception exc) {
        String str;
        String str2 = "An unknown error occurred";
        String str3 = "UNKNOWN";
        if (exc == null) {
            return new i("UNKNOWN", "An unknown error occurred");
        }
        String str4 = "An unknown error occurred:" + exc.getMessage();
        if (exc instanceof com.google.firebase.storage.i) {
            int i7 = ((com.google.firebase.storage.i) exc).f12027a;
            if (i7 == -13040) {
                str = "canceled";
            } else if (i7 == -13031) {
                str = "invalid-checksum";
            } else if (i7 == -13030) {
                str = "retry-limit-exceeded";
            } else if (i7 == -13021) {
                str = "unauthorized";
            } else if (i7 != -13020) {
                switch (i7) {
                    case -13013:
                        str = "quota-exceeded";
                        break;
                    case -13012:
                        str = "project-not-found";
                        break;
                    case -13011:
                        str = "bucket-not-found";
                        break;
                    case -13010:
                        str = "object-not-found";
                        break;
                    default:
                        str = "unknown";
                        break;
                }
            } else {
                str = "unauthenticated";
            }
            if (i7 == -13040) {
                str2 = "User cancelled the operation.";
            } else if (i7 == -13031) {
                str2 = "File on the client does not match the checksum of the file received by the server.";
            } else if (i7 == -13030) {
                str2 = "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
            } else if (i7 == -13021) {
                str2 = "User is not authorized to perform the desired action.";
            } else if (i7 != -13020) {
                switch (i7) {
                    case -13013:
                        str2 = "Quota on your Firebase Storage bucket has been exceeded.";
                        break;
                    case -13012:
                        str2 = "No project is configured for Firebase Storage.";
                        break;
                    case -13011:
                        str2 = "No bucket is configured for Firebase Storage.";
                        break;
                    case -13010:
                        str2 = "No object exists at the desired reference.";
                        break;
                }
            } else {
                str2 = "User is unauthenticated. Authenticate and try again.";
            }
            str4 = str2;
            str3 = str;
        }
        return new i(str3, str4);
    }

    public static boolean K(int i7, Parcel parcel) {
        j0(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static Double L(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        if (R6 == 0) {
            return null;
        }
        f0(parcel, R6, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder M(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + R6);
        return readStrongBinder;
    }

    public static int N(int i7, Parcel parcel) {
        j0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer O(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        if (R6 == 0) {
            return null;
        }
        f0(parcel, R6, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long P(int i7, Parcel parcel) {
        j0(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long Q(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        if (R6 == 0) {
            return null;
        }
        f0(parcel, R6, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int R(int i7, Parcel parcel) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void U(f fVar, final C0423t c0423t) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0423t == null || (jVar = c0423t.f6213a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0406b, obj, 1);
        if (c0423t != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i7) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(longValue, (C0422s) jVar2.f3682f);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            return;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s = (C0422s) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0423t3.getClass();
                                try {
                                    String[] list2 = c0422s.f6211a.list(str);
                                    w03 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            return;
                        default:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s2 = (C0422s) obj6;
                            Object obj7 = list3.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0423t4.getClass();
                                w04 = Y4.D.D(((C1649c) c0422s2.f6212b.f12667a).a(str2));
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            return;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0406b, obj, 1);
        if (c0423t != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i8) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(longValue, (C0422s) jVar2.f3682f);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            return;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s = (C0422s) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0423t3.getClass();
                                try {
                                    String[] list2 = c0422s.f6211a.list(str);
                                    w03 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            return;
                        default:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s2 = (C0422s) obj6;
                            Object obj7 = list3.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0423t4.getClass();
                                w04 = Y4.D.D(((C1649c) c0422s2.f6212b.f12667a).a(str2));
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            return;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0406b, obj, 1);
        if (c0423t == null) {
            f04.M(null);
        } else {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i9) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(longValue, (C0422s) jVar2.f3682f);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            return;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s = (C0422s) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                c0423t3.getClass();
                                try {
                                    String[] list2 = c0422s.f6211a.list(str);
                                    w03 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            return;
                        default:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C0422s c0422s2 = (C0422s) obj6;
                            Object obj7 = list3.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                c0423t4.getClass();
                                w04 = Y4.D.D(((C1649c) c0422s2.f6212b.f12667a).a(str2));
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            return;
                    }
                }
            });
        }
    }

    public static void V(f fVar, final C0424u c0424u) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0424u == null || (jVar = c0424u.f6214a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i7) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c0406b, obj, 1);
        if (c0424u != null) {
            final int i8 = 15;
            f03.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i8) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c0406b, obj, 1);
        if (c0424u != null) {
            final int i9 = 16;
            f04.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i9) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i10 = 1;
            f05.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i10) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c0406b, obj, 1);
        if (c0424u != null) {
            final int i11 = 2;
            f06.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i11) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c0406b, obj, 1);
        if (c0424u != null) {
            final int i12 = 3;
            f07.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i12) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f07.M(null);
        }
        F0 f08 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c0406b, obj, 1);
        if (c0424u != null) {
            final int i13 = 4;
            f08.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i13) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f08.M(null);
        }
        F0 f09 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c0406b, obj, 1);
        if (c0424u != null) {
            final int i14 = 5;
            f09.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i14) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f09.M(null);
        }
        F0 f010 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c0406b, obj, 1);
        if (c0424u != null) {
            final int i15 = 6;
            f010.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i15) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f010.M(null);
        }
        F0 f011 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c0406b, obj, 1);
        if (c0424u != null) {
            final int i16 = 7;
            f011.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i16) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f011.M(null);
        }
        F0 f012 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c0406b, obj, 1);
        if (c0424u != null) {
            final int i17 = 8;
            f012.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i17) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f012.M(null);
        }
        F0 f013 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c0406b, obj, 1);
        if (c0424u != null) {
            final int i18 = 9;
            f013.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i18) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f013.M(null);
        }
        F0 f014 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c0406b, obj, 1);
        if (c0424u != null) {
            final int i19 = 10;
            f014.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i19) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f014.M(null);
        }
        F0 f015 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i20 = 11;
            f015.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i20) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f015.M(null);
        }
        F0 f016 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c0406b, obj, 1);
        if (c0424u != null) {
            final int i21 = 12;
            f016.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i21) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f016.M(null);
        }
        F0 f017 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c0406b, obj, 1);
        if (c0424u != null) {
            final int i22 = 13;
            f017.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i22) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        } else {
            f017.M(null);
        }
        F0 f018 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c0406b, obj, 1);
        if (c0424u == null) {
            f018.M(null);
        } else {
            final int i23 = 14;
            f018.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    List w08;
                    List w09;
                    List w010;
                    List w011;
                    List w012;
                    List w013;
                    List w014;
                    List w015;
                    List w016;
                    List w017;
                    List w018;
                    switch (i23) {
                        case 0:
                            C0424u c0424u2 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings = (WebSettings) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(booleanValue);
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0424u c0424u3 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj5 = list2.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings2 = (WebSettings) obj5;
                            Object obj6 = list2.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(booleanValue2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0424u c0424u4 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj7 = list3.get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings3 = (WebSettings) obj7;
                            String str = (String) list3.get(1);
                            try {
                                c0424u4.getClass();
                                webSettings3.setUserAgentString(str);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0424u c0424u5 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj8 = list4.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings4 = (WebSettings) obj8;
                            Object obj9 = list4.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(booleanValue3);
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0424u c0424u6 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj10 = list5.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings5 = (WebSettings) obj10;
                            Object obj11 = list5.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(booleanValue4);
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        case 5:
                            C0424u c0424u7 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj2;
                            Object obj12 = list6.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings6 = (WebSettings) obj12;
                            Object obj13 = list6.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(booleanValue5);
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                        case 6:
                            C0424u c0424u8 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj2;
                            Object obj14 = list7.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings7 = (WebSettings) obj14;
                            Object obj15 = list7.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(booleanValue6);
                                w08 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                w08 = AbstractC0603a.w0(th7);
                            }
                            v02.f(w08);
                            break;
                        case 7:
                            C0424u c0424u9 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj2;
                            Object obj16 = list8.get(0);
                            t6.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings8 = (WebSettings) obj16;
                            Object obj17 = list8.get(1);
                            t6.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(booleanValue7);
                                w09 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                w09 = AbstractC0603a.w0(th8);
                            }
                            v02.f(w09);
                            break;
                        case 8:
                            C0424u c0424u10 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj2;
                            Object obj18 = list9.get(0);
                            t6.h.c(obj18, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings9 = (WebSettings) obj18;
                            Object obj19 = list9.get(1);
                            t6.h.c(obj19, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(booleanValue8);
                                w010 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                w010 = AbstractC0603a.w0(th9);
                            }
                            v02.f(w010);
                            break;
                        case 9:
                            C0424u c0424u11 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj2;
                            Object obj20 = list10.get(0);
                            t6.h.c(obj20, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings10 = (WebSettings) obj20;
                            Object obj21 = list10.get(1);
                            t6.h.c(obj21, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(booleanValue9);
                                w011 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                w011 = AbstractC0603a.w0(th10);
                            }
                            v02.f(w011);
                            break;
                        case 10:
                            C0424u c0424u12 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj2;
                            Object obj22 = list11.get(0);
                            t6.h.c(obj22, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings11 = (WebSettings) obj22;
                            Object obj23 = list11.get(1);
                            t6.h.c(obj23, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(booleanValue10);
                                w012 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                w012 = AbstractC0603a.w0(th11);
                            }
                            v02.f(w012);
                            break;
                        case 11:
                            C0424u c0424u13 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list12 = (List) obj2;
                            Object obj24 = list12.get(0);
                            t6.h.c(obj24, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings12 = (WebSettings) obj24;
                            Object obj25 = list12.get(1);
                            t6.h.c(obj25, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(booleanValue11);
                                w013 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                w013 = AbstractC0603a.w0(th12);
                            }
                            v02.f(w013);
                            break;
                        case 12:
                            C0424u c0424u14 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj2;
                            Object obj26 = list13.get(0);
                            t6.h.c(obj26, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings13 = (WebSettings) obj26;
                            Object obj27 = list13.get(1);
                            t6.h.c(obj27, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) longValue);
                                w014 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                w014 = AbstractC0603a.w0(th13);
                            }
                            v02.f(w014);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                w015 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                w015 = AbstractC0603a.w0(th14);
                            }
                            v02.f(w015);
                            break;
                        case 14:
                            C0424u c0424u16 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list14 = (List) obj2;
                            Object obj29 = list14.get(0);
                            t6.h.c(obj29, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings15 = (WebSettings) obj29;
                            Object obj30 = list14.get(1);
                            t6.h.c(obj30, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode");
                            EnumC0427x enumC0427x = (EnumC0427x) obj30;
                            try {
                                c0424u16.getClass();
                                int ordinal = enumC0427x.ordinal();
                                if (ordinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (ordinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (ordinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                w016 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                w016 = AbstractC0603a.w0(th15);
                            }
                            v02.f(w016);
                            break;
                        case 15:
                            C0424u c0424u17 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj2;
                            Object obj31 = list15.get(0);
                            t6.h.c(obj31, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings16 = (WebSettings) obj31;
                            Object obj32 = list15.get(1);
                            t6.h.c(obj32, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(booleanValue12);
                                w017 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                w017 = AbstractC0603a.w0(th16);
                            }
                            v02.f(w017);
                            break;
                        default:
                            C0424u c0424u18 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list16 = (List) obj2;
                            Object obj33 = list16.get(0);
                            t6.h.c(obj33, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings17 = (WebSettings) obj33;
                            Object obj34 = list16.get(1);
                            t6.h.c(obj34, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(booleanValue13);
                                w018 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                w018 = AbstractC0603a.w0(th17);
                            }
                            v02.f(w018);
                            break;
                    }
                }
            });
        }
    }

    public static final N6.b W(Socket socket) {
        int i7 = g.f4802a;
        N6.n nVar = new N6.n(socket);
        OutputStream outputStream = socket.getOutputStream();
        h.d(outputStream, "getOutputStream()");
        return new N6.b(nVar, new N6.b(outputStream, nVar));
    }

    public static void X(int i7, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + R(i7, parcel));
    }

    public static final N6.c Y(Socket socket) {
        int i7 = g.f4802a;
        N6.n nVar = new N6.n(socket);
        InputStream inputStream = socket.getInputStream();
        h.d(inputStream, "getInputStream()");
        return new N6.c(nVar, new N6.c(inputStream, nVar));
    }

    public static int[] Z(Collection collection) {
        if (collection instanceof H3.a) {
            ((H3.a) collection).getClass();
            return Arrays.copyOfRange((int[]) null, 0, 0);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            Object obj = array[i7];
            obj.getClass();
            iArr[i7] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", mVar.f658a);
            bundle.putLong("event_timestamp", mVar.f659b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static int a0(Parcel parcel) {
        int readInt = parcel.readInt();
        int R6 = R(readInt, parcel);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new W("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i7 = R6 + dataPosition;
        if (i7 < dataPosition || i7 > parcel.dataSize()) {
            throw new W(AbstractC0486a1.e(dataPosition, i7, "Size read is invalid start=", " end="), parcel);
        }
        return i7;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, Object obj, int i7, int i8) {
        for (Object obj2 : spannableStringBuilder.getSpans(i7, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i7 && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i7, i8, 33);
    }

    public static void b0(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new W(P6.b.z(str, obj));
        }
    }

    public static void c(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, SentryEvent.JsonKeys.EXCEPTION);
        if (th != th2) {
            Integer num = AbstractC1482a.f15514a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1440a.f15277a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void d(StringBuilder sb, Object obj, Function1 function1) {
        if (function1 != null) {
            sb.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static int e() {
        h.e(null, "<this>");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfgd e0(Bundle bundle) {
        char c3;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
        }
        return zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;
    }

    public static void f(String str, boolean z4) {
        if (!z4) {
            throw C0045t0.a(null, str);
        }
    }

    public static void f0(Parcel parcel, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        throw new W(k.i(AbstractC1663a.g("Expected size ", i8, " got ", i7, " (0x"), Integer.toHexString(i7), ")"), parcel);
    }

    public static int g(long j3) {
        int i7 = (int) j3;
        p3.f.g(((long) i7) == j3, "Out of range: %s", j3);
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bundle g0(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e7) {
                int i7 = J.f3546b;
                J2.j.c("JSON parsing error", e7);
            }
            if (jSONArray != null) {
                return Bundle.EMPTY;
            }
            Bundle bundle = new Bundle();
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i8);
                String optString = optJSONObject.optString("bk");
                String optString2 = optJSONObject.optString("sk");
                int optInt = optJSONObject.optInt("type", -1);
                int i9 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i9 != 0) {
                    List zzf = zzftw.zzb(zzfss.zzc('/')).zzf(optString2);
                    if (zzf.size() > 2 || zzf.isEmpty()) {
                        obj = null;
                    } else {
                        if (zzf.size() == 1) {
                            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                            str2 = (String) zzf.get(0);
                        } else {
                            sharedPreferences = context.getSharedPreferences((String) zzf.get(0), 0);
                            str2 = (String) zzf.get(1);
                        }
                        obj = sharedPreferences.getAll().get(str2);
                    }
                    if (obj != null) {
                        int i10 = i9 - 1;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (obj instanceof Boolean) {
                                    bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                                }
                            } else if (obj instanceof Integer) {
                                bundle.putInt(optString, ((Integer) obj).intValue());
                            } else if (obj instanceof Long) {
                                bundle.putLong(optString, ((Long) obj).longValue());
                            } else if (obj instanceof Float) {
                                bundle.putFloat(optString, ((Float) obj).floatValue());
                            }
                        } else if (obj instanceof String) {
                            bundle.putString(optString, (String) obj);
                        }
                    }
                }
            }
            return bundle;
        }
        jSONArray = null;
        if (jSONArray != null) {
        }
    }

    public static C1128a h(String str, String str2) {
        R4.a aVar = new R4.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1144q.a(R4.a.class));
        return new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(aVar), hashSet3);
    }

    public static Object h0(Context context, String str, J2.k kVar) {
        try {
            return kVar.zza(l0(context).b(str));
        } catch (Exception e7) {
            throw new l(e7);
        }
    }

    public static BigDecimal i(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + R6);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String i0(String str) {
        char c3;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static Bundle j(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + R6);
        return readBundle;
    }

    public static void j0(Parcel parcel, int i7, int i8) {
        int R6 = R(i7, parcel);
        if (R6 == i8) {
            return;
        }
        throw new W(k.i(AbstractC1663a.g("Expected size ", i8, " got ", R6, " (0x"), Integer.toHexString(R6), ")"), parcel);
    }

    public static byte[] k(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + R6);
        return createByteArray;
    }

    public static String k0(zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.f10758c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static int[] l(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + R6);
        return createIntArray;
    }

    public static p3.d l0(Context context) {
        try {
            return p3.d.c(context, p3.d.f15677b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e7) {
            throw new l(e7);
        }
    }

    public static Parcelable m(Parcel parcel, int i7, Parcelable.Creator creator) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + R6);
        return parcelable;
    }

    public static void m0(Context context) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfpy zzj = zzfpy.zzj(context);
            zzfpz zzi = zzfpz.zzi(context);
            zzfqa zza = zzfqa.zza(context);
            zzj.zzk();
            zzj.zzl();
            zzi.zzj();
            zza.zzb(null);
        } catch (IOException e7) {
            o.f1952C.f1961g.zzw(e7, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e8) {
            o.f1952C.f1961g.zzw(e8, "clearStorageOnIdlessMode_scar");
        }
    }

    public static String n(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + R6);
        return readString;
    }

    public static void n0(zzdqv zzdqvVar, String str, Pair... pairArr) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgR)).booleanValue()) {
            zzbza.zza.execute(new q(zzdqvVar, str, pairArr, 4));
        }
    }

    public static String[] o(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + R6);
        return createStringArray;
    }

    public static int o0(zzfba zzfbaVar) {
        if (zzfbaVar.zzr) {
            return 2;
        }
        zzm zzmVar = zzfbaVar.zzd;
        zzc zzcVar = zzmVar.f10748J;
        String str = zzmVar.f10753O;
        if (zzcVar == null && str == null) {
            return 1;
        }
        if (zzcVar == null || str == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    public static ArrayList p(int i7, Parcel parcel) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + R6);
        return createStringArrayList;
    }

    public static Object[] q(Parcel parcel, int i7, Parcelable.Creator creator) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + R6);
        return createTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i7, Parcelable.Creator creator) {
        int R6 = R(i7, parcel);
        int dataPosition = parcel.dataPosition();
        if (R6 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + R6);
        return createTypedArrayList;
    }

    public static byte[] s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            int digit = Character.digit(str.charAt(i8), 16);
            int digit2 = Character.digit(str.charAt(i8 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i7] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static int u(int i7, int i8, RoundingMode roundingMode) {
        if (i8 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i9 = i7 / i8;
        int i10 = i7 - (i8 * i9);
        if (i10 == 0) {
            return i9;
        }
        int i11 = ((i7 ^ i8) >> 31) | 1;
        switch (F4.d.f2749a[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i9;
            case 3:
                break;
            case 4:
                if (i11 <= 0) {
                    return i9;
                }
                break;
            case 5:
                if (i11 >= 0) {
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

    public static void v(int i7, String str, String str2, Object... objArr) {
        if (e.e(i7) >= e.e(f5736a)) {
            String concat = AbstractC0486a1.h("(25.1.1) [", str, "]: ").concat(String.format(str2, objArr));
            int e7 = e.e(i7);
            if (e7 == 0) {
                Log.i("Firestore", concat);
            } else if (e7 == 1) {
                Log.w("Firestore", concat);
            } else if (e7 == 2) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static String w(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            int i7 = b7 & 255;
            sb.append("0123456789abcdef".charAt(i7 / 16));
            sb.append("0123456789abcdef".charAt(i7 % 16));
        }
        return sb.toString();
    }

    public static void y(int i7, Parcel parcel) {
        if (parcel.dataPosition() != i7) {
            throw new W(k.d(i7, "Overread allowed size end="), parcel);
        }
    }

    public static C1128a z(String str, M m7) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C1144q.a(R4.a.class));
        for (Class cls : new Class[0]) {
            p3.f.l(cls, "Null interface");
            hashSet.add(C1144q.a(cls));
        }
        C1136i b7 = C1136i.b(Context.class);
        if (hashSet.contains(b7.f13206a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(b7);
        return new C1128a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.c(13, str, m7), hashSet3);
    }

    public float D(View view) {
        float transitionAlpha;
        if (f5739d) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f5739d = false;
            }
        }
        return view.getAlpha();
    }

    public abstract int J(byte[] bArr, int i7, int i8);

    public void S(View view, float f7) {
        if (f5739d) {
            try {
                view.setTransitionAlpha(f7);
                return;
            } catch (NoSuchMethodError unused) {
                f5739d = false;
            }
        }
        view.setAlpha(f7);
    }

    public void T(View view, int i7) {
        if (!f5738c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f5737b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f5738c = true;
        }
        Field field = f5737b;
        if (field != null) {
            try {
                f5737b.setInt(view, i7 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void c0(Object obj, Object obj2);

    public abstract void d0(byte[] bArr, int i7, int i8);

    public abstract String t(byte[] bArr, int i7, int i8);

    public abstract int x(String str, byte[] bArr, int i7, int i8);
}
