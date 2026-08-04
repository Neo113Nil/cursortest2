package Q0;

import A1.C0045t0;
import A1.W;
import A3.m;
import A5.f;
import A5.n;
import E2.o;
import F2.C0254t;
import I2.J;
import J2.l;
import K5.i;
import N6.g;
import R5.C0406b;
import R5.C0423t;
import R5.C0424u;
import R5.M;
import W5.AbstractC0486a1;
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
import io.sentry.SentryEvent;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031e1.k;
import p034e4.j;
import p042f4.InterfaceC0893b;
import p048g4.q;
import p136t.e;
import p155w1.F0;
import p155w1.V0;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f5736a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f5737b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f5738c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f5739d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f5740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f5741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Class f5742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f5743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Field f5744i;
    public static boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f5745k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f5746l;

    public static String A(p026d4.b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            p014b4.b bVar2 = (p014b4.b) Tasks.await(((p014b4.d) bVar).b(false), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS);
            if (bVar2.f10130b != null) {
                Log.w("StorageUtil", "Error getting App Check token; using placeholder token instead. Error: " + bVar2.f10130b);
            }
            return bVar2.f10129a;
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

    public static String B(InterfaceC0893b interfaceC0893b) {
        String str;
        if (interfaceC0893b != null) {
            try {
                FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0893b;
                str = ((j) Tasks.await(firebaseAuth.h(firebaseAuth.f11854f, false), TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, TimeUnit.MILLISECONDS)).f12687a;
            } catch (InterruptedException e7) {
                e = e7;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (ExecutionException e8) {
                e = e8;
                Log.e("StorageUtil", "error getting token " + e);
            } catch (TimeoutException e9) {
                e = e9;
                Log.e("StorageUtil", "error getting token " + e);
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
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = T4.c.f6351k;
        String strReplace = "";
        if (str.toLowerCase().startsWith("gs://")) {
            String strB = P6.b.B(str.substring(5));
            if (!TextUtils.isEmpty(strB)) {
                String strEncode = Uri.encode(strB);
                D.i(strEncode);
                strReplace = strEncode.replace("%2F", "/");
            }
            return Uri.parse("gs://" + strReplace);
        }
        Uri uri2 = Uri.parse(str);
        String scheme = uri2.getScheme();
        if (scheme == null || !(D.m(scheme.toLowerCase(), "http") || D.m(scheme.toLowerCase(), "https"))) {
            Log.w("StorageUtil", "FirebaseStorage is unable to support the scheme:" + scheme);
            throw new IllegalArgumentException("Uri scheme");
        }
        int iIndexOf = uri2.getAuthority().toLowerCase().indexOf(uri.getAuthority());
        String encodedPath = uri2.getEncodedPath();
        D.i(encodedPath);
        String strReplace2 = encodedPath.replace("%2F", "/");
        if (iIndexOf == 0 && strReplace2.startsWith("/")) {
            int iIndexOf2 = strReplace2.indexOf("/b/", 0);
            int i7 = iIndexOf2 + 3;
            int iIndexOf3 = strReplace2.indexOf("/", i7);
            int iIndexOf4 = strReplace2.indexOf("/o/", 0);
            if (iIndexOf2 == -1 || iIndexOf3 == -1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = strReplace2.substring(i7, iIndexOf3);
            strReplace2 = iIndexOf4 != -1 ? strReplace2.substring(iIndexOf4 + 3) : "";
        } else {
            if (iIndexOf <= 1) {
                Log.w("StorageUtil", "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            strSubstring = uri2.getAuthority().substring(0, iIndexOf - 1);
        }
        D.f(strSubstring, "No bucket specified");
        return new Uri.Builder().scheme("gs").authority(strSubstring).encodedPath(strReplace2).build();
    }

    public static long H(String str) {
        if (str == null) {
            return 0L;
        }
        String strReplaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(strReplaceAll).getTime();
        } catch (ParseException e7) {
            Log.w("StorageUtil", "unable to parse datetime:" + strReplaceAll, e7);
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
        int iR = R(i7, parcel);
        if (iR == 0) {
            return null;
        }
        f0(parcel, iR, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static IBinder M(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iR);
        return strongBinder;
    }

    public static int N(int i7, Parcel parcel) {
        j0(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer O(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        if (iR == 0) {
            return null;
        }
        f0(parcel, iR, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long P(int i7, Parcel parcel) {
        j0(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long Q(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        if (iR == 0) {
            return null;
        }
        f0(parcel, iR, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int R(int i7, Parcel parcel) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void U(f fVar, final C0423t c0423t) {
        I4.j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0423t == null || (jVar = c0423t.f6213a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance", c0406b, obj, 1);
        if (c0423t != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i7) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(jLongValue, (C0422s) jVar2.f3682f);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                    listW1 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(((p148u5.c) c0422s2.f6212b.f12673a).a(str2));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list", c0406b, obj, 1);
        if (c0423t != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i8) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(jLongValue, (C0422s) jVar2.f3682f);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                    listW1 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(((p148u5.c) c0422s2.f6212b.f12673a).a(str2));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName", c0406b, obj, 1);
        if (c0423t == null) {
            f9.M(null);
        } else {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.C
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i9) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                I4.j jVar2 = c0423t2.f6213a;
                                ((C0407c) jVar2.f3679c).a(jLongValue, (C0422s) jVar2.f3682f);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                    listW1 = Y4.D.D(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(((p148u5.c) c0422s2.f6212b.f12673a).a(str2));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                    }
                }
            });
        }
    }

    public static void V(f fVar, final C0424u c0424u) {
        I4.j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0424u == null || (jVar = c0424u.f6214a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically", c0406b, obj, 1);
        if (c0424u != null) {
            final int i8 = 15;
            f8.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows", c0406b, obj, 1);
        if (c0424u != null) {
            final int i9 = 16;
            f9.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i10 = 1;
            f10.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString", c0406b, obj, 1);
        if (c0424u != null) {
            final int i11 = 2;
            f11.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture", c0406b, obj, 1);
        if (c0424u != null) {
            final int i12 = 3;
            f12.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f12.M(null);
        }
        F0 f13 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom", c0406b, obj, 1);
        if (c0424u != null) {
            final int i13 = 4;
            f13.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f13.M(null);
        }
        F0 f14 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode", c0406b, obj, 1);
        if (c0424u != null) {
            final int i14 = 5;
            f14.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f14.M(null);
        }
        F0 f15 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort", c0406b, obj, 1);
        if (c0424u != null) {
            final int i15 = 6;
            f15.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f15.M(null);
        }
        F0 f16 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls", c0406b, obj, 1);
        if (c0424u != null) {
            final int i16 = 7;
            f16.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f16.M(null);
        }
        F0 f17 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls", c0406b, obj, 1);
        if (c0424u != null) {
            final int i17 = 8;
            f17.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f17.M(null);
        }
        F0 f18 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess", c0406b, obj, 1);
        if (c0424u != null) {
            final int i18 = 9;
            f18.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f18.M(null);
        }
        F0 f19 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess", c0406b, obj, 1);
        if (c0424u != null) {
            final int i19 = 10;
            f19.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f19.M(null);
        }
        F0 f20 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled", c0406b, obj, 1);
        if (c0424u != null) {
            final int i20 = 11;
            f20.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f20.M(null);
        }
        F0 f21 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom", c0406b, obj, 1);
        if (c0424u != null) {
            final int i21 = 12;
            f21.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f21.M(null);
        }
        F0 f22 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString", c0406b, obj, 1);
        if (c0424u != null) {
            final int i22 = 13;
            f22.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        } else {
            f22.M(null);
        }
        F0 f23 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode", c0406b, obj, 1);
        if (c0424u == null) {
            f23.M(null);
        } else {
            final int i23 = 14;
            f23.M(new A5.b() { // from class: R5.L
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    List listW6;
                    List listW7;
                    List listW8;
                    List listW9;
                    List listW10;
                    List listW11;
                    List listW12;
                    List listW13;
                    List listW14;
                    List listW15;
                    List listW16;
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
                            boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0424u2.getClass();
                                webSettings.setDomStorageEnabled(zBooleanValue);
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0424u3.getClass();
                                webSettings2.setJavaScriptEnabled(zBooleanValue2);
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0424u5.getClass();
                                webSettings4.setMediaPlaybackRequiresUserGesture(zBooleanValue3);
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0424u6.getClass();
                                webSettings5.setSupportZoom(zBooleanValue4);
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0424u7.getClass();
                                webSettings6.setLoadWithOverviewMode(zBooleanValue5);
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
                            boolean zBooleanValue6 = ((Boolean) obj15).booleanValue();
                            try {
                                c0424u8.getClass();
                                webSettings7.setUseWideViewPort(zBooleanValue6);
                                listW6 = Y4.D.D(null);
                            } catch (Throwable th7) {
                                listW6 = p003a.a.w0(th7);
                            }
                            v6.f(listW6);
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
                            boolean zBooleanValue7 = ((Boolean) obj17).booleanValue();
                            try {
                                c0424u9.getClass();
                                webSettings8.setDisplayZoomControls(zBooleanValue7);
                                listW7 = Y4.D.D(null);
                            } catch (Throwable th8) {
                                listW7 = p003a.a.w0(th8);
                            }
                            v6.f(listW7);
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
                            boolean zBooleanValue8 = ((Boolean) obj19).booleanValue();
                            try {
                                c0424u10.getClass();
                                webSettings9.setBuiltInZoomControls(zBooleanValue8);
                                listW8 = Y4.D.D(null);
                            } catch (Throwable th9) {
                                listW8 = p003a.a.w0(th9);
                            }
                            v6.f(listW8);
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
                            boolean zBooleanValue9 = ((Boolean) obj21).booleanValue();
                            try {
                                c0424u11.getClass();
                                webSettings10.setAllowFileAccess(zBooleanValue9);
                                listW9 = Y4.D.D(null);
                            } catch (Throwable th10) {
                                listW9 = p003a.a.w0(th10);
                            }
                            v6.f(listW9);
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
                            boolean zBooleanValue10 = ((Boolean) obj23).booleanValue();
                            try {
                                c0424u12.getClass();
                                webSettings11.setAllowContentAccess(zBooleanValue10);
                                listW10 = Y4.D.D(null);
                            } catch (Throwable th11) {
                                listW10 = p003a.a.w0(th11);
                            }
                            v6.f(listW10);
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
                            boolean zBooleanValue11 = ((Boolean) obj25).booleanValue();
                            try {
                                c0424u13.getClass();
                                webSettings12.setGeolocationEnabled(zBooleanValue11);
                                listW11 = Y4.D.D(null);
                            } catch (Throwable th12) {
                                listW11 = p003a.a.w0(th12);
                            }
                            v6.f(listW11);
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
                            long jLongValue = ((Long) obj27).longValue();
                            try {
                                c0424u14.getClass();
                                webSettings13.setTextZoom((int) jLongValue);
                                listW12 = Y4.D.D(null);
                            } catch (Throwable th13) {
                                listW12 = p003a.a.w0(th13);
                            }
                            v6.f(listW12);
                            break;
                        case 13:
                            C0424u c0424u15 = c0424u;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj28 = ((List) obj2).get(0);
                            t6.h.c(obj28, "null cannot be cast to non-null type android.webkit.WebSettings");
                            WebSettings webSettings14 = (WebSettings) obj28;
                            try {
                                c0424u15.getClass();
                                listW13 = Y4.D.D(webSettings14.getUserAgentString());
                            } catch (Throwable th14) {
                                listW13 = p003a.a.w0(th14);
                            }
                            v6.f(listW13);
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
                                int iOrdinal = enumC0427x.ordinal();
                                if (iOrdinal == 0) {
                                    webSettings15.setMixedContentMode(0);
                                } else if (iOrdinal == 1) {
                                    webSettings15.setMixedContentMode(2);
                                } else if (iOrdinal == 2) {
                                    webSettings15.setMixedContentMode(1);
                                }
                                listW14 = Y4.D.D(null);
                            } catch (Throwable th15) {
                                listW14 = p003a.a.w0(th15);
                            }
                            v6.f(listW14);
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
                            boolean zBooleanValue12 = ((Boolean) obj32).booleanValue();
                            try {
                                c0424u17.getClass();
                                webSettings16.setJavaScriptCanOpenWindowsAutomatically(zBooleanValue12);
                                listW15 = Y4.D.D(null);
                            } catch (Throwable th16) {
                                listW15 = p003a.a.w0(th16);
                            }
                            v6.f(listW15);
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
                            boolean zBooleanValue13 = ((Boolean) obj34).booleanValue();
                            try {
                                c0424u18.getClass();
                                webSettings17.setSupportMultipleWindows(zBooleanValue13);
                                listW16 = Y4.D.D(null);
                            } catch (Throwable th17) {
                                listW16 = p003a.a.w0(th17);
                            }
                            v6.f(listW16);
                            break;
                    }
                }
            });
        }
    }

    public static final N6.b W(Socket socket) throws IOException {
        int i7 = g.f4802a;
        N6.n nVar = new N6.n(socket);
        OutputStream outputStream = socket.getOutputStream();
        h.d(outputStream, "getOutputStream()");
        return new N6.b(nVar, new N6.b(outputStream, nVar));
    }

    public static void X(int i7, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + R(i7, parcel));
    }

    public static final N6.c Y(Socket socket) throws IOException {
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
        int i7 = parcel.readInt();
        int iR = R(i7, parcel);
        char c3 = (char) i7;
        int iDataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new W("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i7))), parcel);
        }
        int i8 = iR + iDataPosition;
        if (i8 < iDataPosition || i8 > parcel.dataSize()) {
            throw new W(AbstractC0486a1.e(iDataPosition, i8, "Size read is invalid start=", " end="), parcel);
        }
        return i8;
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

    public static void c(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        h.e(th, "<this>");
        h.e(th2, SentryEvent.JsonKeys.EXCEPTION);
        if (th != th2) {
            Integer num = p100n6.a.f15520a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = p093m6.a.f15283a;
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
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    public static zzfgd e0(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string) {
            case "requester_type_0":
                return zzfgd.SCAR_REQUEST_TYPE_ADMOB;
            case "requester_type_1":
                return zzfgd.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case "requester_type_2":
                return zzfgd.SCAR_REQUEST_TYPE_GBID;
            case "requester_type_3":
                return zzfgd.SCAR_REQUEST_TYPE_GOLDENEYE;
            case "requester_type_4":
                return zzfgd.SCAR_REQUEST_TYPE_YAVIN;
            case "requester_type_5":
                return zzfgd.SCAR_REQUEST_TYPE_UNITY;
            case "requester_type_6":
                return zzfgd.SCAR_REQUEST_TYPE_PAW;
            case "requester_type_7":
                return zzfgd.SCAR_REQUEST_TYPE_GUILDER;
            case "requester_type_8":
                return zzfgd.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void f(String str, boolean z4) throws C0045t0 {
        if (!z4) {
            throw C0045t0.a(null, str);
        }
    }

    public static void f0(Parcel parcel, int i7, int i8) {
        if (i7 == i8) {
            return;
        }
        throw new W(k.i(p150v0.a.g("Expected size ", i8, " got ", i7, " (0x"), Integer.toHexString(i7), ")"), parcel);
    }

    public static int g(long j3) {
        int i7 = (int) j3;
        p113p3.f.g(((long) i7) == j3, "Out of range: %s", j3);
        return i7;
    }

    public static Bundle g0(Context context, String str) {
        JSONArray jSONArray;
        int i7;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e7) {
                int i8 = J.f3546b;
                J2.j.c("JSON parsing error", e7);
                jSONArray = null;
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt == 0) {
                i7 = 1;
            } else if (iOptInt != 1) {
                i7 = iOptInt != 2 ? 0 : 3;
            } else {
                i7 = 2;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i7 != 0) {
                List listZzf = zzftw.zzb(zzfss.zzc('/')).zzf(strOptString2);
                if (listZzf.size() > 2 || listZzf.isEmpty()) {
                    obj = null;
                } else {
                    if (listZzf.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZzf.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZzf.get(0), 0);
                        str2 = (String) listZzf.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i10 = i7 - 1;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static p048g4.a h(String str, String str2) {
        R4.a aVar = new R4.a(str, str2);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(R4.a.class));
        return new p048g4.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.e(aVar), hashSet3);
    }

    public static Object h0(Context context, String str, J2.k kVar) throws l {
        try {
            return kVar.zza(l0(context).b(str));
        } catch (Exception e7) {
            throw new l(e7);
        }
    }

    public static BigDecimal i(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i8 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iR);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    public static String i0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str) {
            case "requester_type_0":
                return "0";
            case "requester_type_1":
                return "1";
            case "requester_type_2":
                return "2";
            case "requester_type_3":
                return "3";
            case "requester_type_4":
                return "4";
            case "requester_type_5":
                return "5";
            case "requester_type_6":
                return "6";
            case "requester_type_7":
                return "7";
            case "requester_type_8":
                return "8";
            default:
                return str;
        }
    }

    public static Bundle j(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iR);
        return bundle;
    }

    public static void j0(Parcel parcel, int i7, int i8) {
        int iR = R(i7, parcel);
        if (iR == i8) {
            return;
        }
        throw new W(k.i(p150v0.a.g("Expected size ", i8, " got ", iR, " (0x"), Integer.toHexString(iR), ")"), parcel);
    }

    public static byte[] k(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iR);
        return bArrCreateByteArray;
    }

    public static String k0(zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.f10758c) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static int[] l(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iR);
        return iArrCreateIntArray;
    }

    public static p113p3.d l0(Context context) throws l {
        try {
            return p113p3.d.c(context, p113p3.d.f15683b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e7) {
            throw new l(e7);
        }
    }

    public static Parcelable m(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iR);
        return parcelable;
    }

    public static void m0(Context context) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgg)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzfpy zzfpyVarZzj = zzfpy.zzj(context);
            zzfpz zzfpzVarZzi = zzfpz.zzi(context);
            zzfqa zzfqaVarZza = zzfqa.zza(context);
            zzfpyVarZzj.zzk();
            zzfpyVarZzj.zzl();
            zzfpzVarZzi.zzj();
            zzfqaVarZza.zzb(null);
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
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iR);
        return string;
    }

    public static void n0(zzdqv zzdqvVar, String str, Pair... pairArr) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgR)).booleanValue()) {
            zzbza.zza.execute(new H2.q(zzdqvVar, str, pairArr, 4));
        }
    }

    public static String[] o(int i7, Parcel parcel) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iR);
        return strArrCreateStringArray;
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
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateStringArrayList;
    }

    public static Object[] q(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return objArrCreateTypedArray;
    }

    public static ArrayList r(Parcel parcel, int i7, Parcelable.Creator creator) {
        int iR = R(i7, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iR == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iR);
        return arrayListCreateTypedArrayList;
    }

    public static byte[] s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            int i8 = i7 * 2;
            int iDigit = Character.digit(str.charAt(i8), 16);
            int iDigit2 = Character.digit(str.charAt(i8 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i7] = (byte) ((iDigit * 16) + iDigit2);
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

    public static void v(int i7, String str, String str2, Object... objArr) {
        if (e.e(i7) >= e.e(f5736a)) {
            String strConcat = AbstractC0486a1.h("(25.1.1) [", str, "]: ").concat(String.format(str2, objArr));
            int iE = e.e(i7);
            if (iE == 0) {
                Log.i("Firestore", strConcat);
            } else if (iE == 1) {
                Log.w("Firestore", strConcat);
            } else if (iE == 2) {
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

    public static p048g4.a z(String str, M m7) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(R4.a.class));
        for (Class cls : new Class[0]) {
            p113p3.f.l(cls, "Null interface");
            hashSet.add(q.a(cls));
        }
        p048g4.i iVarB = p048g4.i.b(Context.class);
        if (hashSet.contains(iVarB.f13212a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(iVarB);
        return new p048g4.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new B1.c(13, str, m7), hashSet3);
    }

    public float D(View view) {
        if (f5739d) {
            try {
                return view.getTransitionAlpha();
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
