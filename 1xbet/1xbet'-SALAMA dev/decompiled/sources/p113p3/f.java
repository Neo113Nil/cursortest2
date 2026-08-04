package p113p3;

import A1.C0045t0;
import A5.b;
import A5.n;
import C1.C0095a;
import D6.C0138v;
import D6.E;
import H4.e;
import H4.m;
import I2.J;
import I4.j;
import I6.t;
import J2.g;
import R5.C0406b;
import R5.C0413i;
import R5.C0421q;
import W5.AbstractC0486a1;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.ClientCertRequest;
import android.widget.TextView;
import androidx.fragment.app.a0;
import com.google.android.gms.internal.ads.zzbdu;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.crypto.tink.shaded.protobuf.AbstractC0829i;
import com.google.firebase.auth.FirebaseAuth;
import com.google.protobuf.AbstractC0867k;
import j5.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import p023d1.o;
import p031e1.k;
import p031e1.l;
import p042f4.C0894c;
import p150v0.a;
import p155w1.C1013m0;
import p155w1.F0;
import p155w1.L;
import p155w1.V0;
import t6.d;
import t6.h;
import t6.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ClassLoader f15696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Thread f15697c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15698a;

    public /* synthetic */ f(int i7) {
        this.f15698a = i7;
    }

    public static m A(String str) {
        List listEmptyList;
        int length = str.length();
        O("Invalid path \"%s\"", length >= 2, str);
        if (length == 2) {
            O("Non-empty path \"%s\" had length 2", str.charAt(0) == 1 && str.charAt(1) == 1, str);
            listEmptyList = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i7 = 0;
            while (i7 < length) {
                int iIndexOf = str.indexOf(1, i7);
                if (iIndexOf < 0 || iIndexOf > length2) {
                    throw new IllegalArgumentException(AbstractC0486a1.h("Invalid encoded resource path: \"", str, "\""));
                }
                int i8 = iIndexOf + 1;
                char cCharAt = str.charAt(i8);
                if (cCharAt == 1) {
                    String strSubstring = str.substring(i7, iIndexOf);
                    if (sb.length() != 0) {
                        sb.append(strSubstring);
                        strSubstring = sb.toString();
                        sb.setLength(0);
                    }
                    arrayList.add(strSubstring);
                } else if (cCharAt == 16) {
                    sb.append(str.substring(i7, iIndexOf));
                    sb.append((char) 0);
                } else {
                    if (cCharAt != 17) {
                        throw new IllegalArgumentException(AbstractC0486a1.h("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb.append(str.substring(i7, i8));
                }
                i7 = iIndexOf + 2;
            }
            listEmptyList = arrayList;
        }
        m mVar = m.f3331b;
        return listEmptyList.isEmpty() ? m.f3331b : new m(listEmptyList);
    }

    public static boolean B(Method method, d dVar) {
        Class clsA = dVar.a();
        h.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return method.getReturnType().equals(clsA);
    }

    public static String C(e eVar) {
        StringBuilder sb = new StringBuilder();
        int size = eVar.f3312a.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String strL = eVar.l(i7);
            int length = strL.length();
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = strL.charAt(i8);
                if (cCharAt == 0) {
                    sb.append((char) 1);
                    sb.append((char) 16);
                } else if (cCharAt != 1) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) 1);
                    sb.append((char) 17);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }

    public static String E(AbstractC0829i abstractC0829i) {
        StringBuilder sb = new StringBuilder(abstractC0829i.size());
        for (int i7 = 0; i7 < abstractC0829i.size(); i7++) {
            byte bL = abstractC0829i.l(i7);
            if (bL == 34) {
                sb.append("\\\"");
            } else if (bL == 39) {
                sb.append("\\'");
            } else if (bL != 92) {
                switch (bL) {
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
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bL < 32 || bL > 126) {
                            sb.append('\\');
                            sb.append((char) (((bL >>> 6) & 3) + 48));
                            sb.append((char) (((bL >>> 3) & 7) + 48));
                            sb.append((char) ((bL & 7) + 48));
                        } else {
                            sb.append((char) bL);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void F(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public static int H(double d7, double d8) {
        if (d7 < d8) {
            return -1;
        }
        if (d7 > d8) {
            return 1;
        }
        if (d7 == d8) {
            return 0;
        }
        if (Double.isNaN(d8)) {
            return !Double.isNaN(d7) ? 1 : 0;
        }
        return -1;
    }

    public static int J(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static final int N(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 >= i8) {
                return i8;
            }
            int i10 = i8 % i9;
            if (i10 < 0) {
                i10 += i9;
            }
            int i11 = i7 % i9;
            if (i11 < 0) {
                i11 += i9;
            }
            int i12 = (i10 - i11) % i9;
            if (i12 < 0) {
                i12 += i9;
            }
            return i8 - i12;
        }
        if (i9 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i7 <= i8) {
            return i8;
        }
        int i13 = -i9;
        int i14 = i7 % i13;
        if (i14 < 0) {
            i14 += i13;
        }
        int i15 = i8 % i13;
        if (i15 < 0) {
            i15 += i13;
        }
        int i16 = (i14 - i15) % i13;
        if (i16 < 0) {
            i16 += i13;
        }
        return i8 + i16;
    }

    public static void O(String str, boolean z4, Object... objArr) {
        if (z4) {
            return;
        }
        F(str, objArr);
        throw null;
    }

    public static void P(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        F(str, objArr);
        throw null;
    }

    public static void S(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final byte[] V(InputStream inputStream) throws IOException {
        h.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        u(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        h.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static void Y(A5.f fVar, final C0413i c0413i) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0413i == null || (jVar = c0413i.f6174a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.cancel", c0406b, obj, 1);
        if (c0413i != null) {
            final int i7 = 0;
            f7.M(new b() { // from class: R5.z
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i7) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0413i2.getClass();
                                clientCertRequest.cancel();
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0413i3.getClass();
                                clientCertRequest2.ignore();
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        default:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0413i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.ignore", c0406b, obj, 1);
        if (c0413i != null) {
            final int i8 = 1;
            f8.M(new b() { // from class: R5.z
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i8) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0413i2.getClass();
                                clientCertRequest.cancel();
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0413i3.getClass();
                                clientCertRequest2.ignore();
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        default:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0413i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.proceed", c0406b, obj, 1);
        if (c0413i == null) {
            f9.M(null);
        } else {
            final int i9 = 2;
            f9.M(new b() { // from class: R5.z
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i9) {
                        case 0:
                            C0413i c0413i2 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest = (ClientCertRequest) obj3;
                            try {
                                c0413i2.getClass();
                                clientCertRequest.cancel();
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            break;
                        case 1:
                            C0413i c0413i3 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest2 = (ClientCertRequest) obj4;
                            try {
                                c0413i3.getClass();
                                clientCertRequest2.ignore();
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        default:
                            C0413i c0413i4 = c0413i;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj5 = list.get(0);
                            t6.h.c(obj5, "null cannot be cast to non-null type android.webkit.ClientCertRequest");
                            ClientCertRequest clientCertRequest3 = (ClientCertRequest) obj5;
                            Object obj6 = list.get(1);
                            t6.h.c(obj6, "null cannot be cast to non-null type java.security.PrivateKey");
                            PrivateKey privateKey = (PrivateKey) obj6;
                            Object obj7 = list.get(2);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.collections.List<java.security.cert.X509Certificate>");
                            List list2 = (List) obj7;
                            try {
                                c0413i4.getClass();
                                clientCertRequest3.proceed(privateKey, (X509Certificate[]) list2.toArray(new X509Certificate[0]));
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            break;
                    }
                }
            });
        }
    }

    public static void Z(A5.f fVar, final C0421q c0421q) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0421q == null || (jVar = c0421q.f6203a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c0406b, obj, 1);
        if (c0421q != null) {
            final int i7 = 0;
            f7.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i7) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c0406b, obj, 1);
        if (c0421q != null) {
            final int i8 = 1;
            f8.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i8) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c0406b, obj, 1);
        if (c0421q != null) {
            final int i9 = 2;
            f9.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i9) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c0406b, obj, 1);
        if (c0421q != null) {
            final int i10 = 3;
            f10.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i10) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c0406b, obj, 1);
        if (c0421q != null) {
            final int i11 = 4;
            f11.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i11) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c0406b, obj, 1);
        if (c0421q == null) {
            f12.M(null);
        } else {
            final int i12 = 5;
            f12.M(new b() { // from class: R5.I
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    List listW3;
                    List listW4;
                    List listW5;
                    switch (i12) {
                        case 0:
                            C0421q c0421q2 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj3 = list.get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type android.view.View");
                            View view = (View) obj3;
                            Object obj4 = list.get(1);
                            t6.h.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj4).longValue();
                            Object obj5 = list.get(2);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue2 = ((Long) obj5).longValue();
                            try {
                                c0421q2.getClass();
                                view.scrollTo((int) jLongValue, (int) jLongValue2);
                                listW0 = Y4.D.D(null);
                                break;
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
                            return;
                        case 1:
                            C0421q c0421q3 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type android.view.View");
                            View view2 = (View) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue3 = ((Long) obj7).longValue();
                            Object obj8 = list2.get(2);
                            t6.h.c(obj8, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue4 = ((Long) obj8).longValue();
                            try {
                                c0421q3.getClass();
                                view2.scrollBy((int) jLongValue3, (int) jLongValue4);
                                listW1 = Y4.D.D(null);
                                break;
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            return;
                        case 2:
                            C0421q c0421q4 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj9 = ((List) obj2).get(0);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.view.View");
                            View view3 = (View) obj9;
                            try {
                                c0421q4.getClass();
                                listW2 = Y4.D.D(new g0(view3.getScrollX(), view3.getScrollY()));
                                break;
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
                            return;
                        case 3:
                            C0421q c0421q5 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj10 = list3.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type android.view.View");
                            View view4 = (View) obj10;
                            Object obj11 = list3.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj11).booleanValue();
                            try {
                                c0421q5.getClass();
                                view4.setVerticalScrollBarEnabled(zBooleanValue);
                                listW3 = Y4.D.D(null);
                                break;
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
                            return;
                        case 4:
                            C0421q c0421q6 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj12 = list4.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type android.view.View");
                            View view5 = (View) obj12;
                            Object obj13 = list4.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj13).booleanValue();
                            try {
                                c0421q6.getClass();
                                view5.setHorizontalScrollBarEnabled(zBooleanValue2);
                                listW4 = Y4.D.D(null);
                                break;
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
                            return;
                        default:
                            C0421q c0421q7 = c0421q;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj14 = list5.get(0);
                            t6.h.c(obj14, "null cannot be cast to non-null type android.view.View");
                            View view6 = (View) obj14;
                            Object obj15 = list5.get(1);
                            t6.h.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
                            EnumC0428y enumC0428y = (EnumC0428y) obj15;
                            try {
                                c0421q7.getClass();
                                int iOrdinal = enumC0428y.ordinal();
                                if (iOrdinal == 0) {
                                    view6.setOverScrollMode(0);
                                } else if (iOrdinal == 1) {
                                    view6.setOverScrollMode(1);
                                } else if (iOrdinal == 2) {
                                    view6.setOverScrollMode(2);
                                } else if (iOrdinal == 3) {
                                    EnumC0428y enumC0428y2 = EnumC0428y.UNKNOWN;
                                    c0421q7.f6203a.getClass();
                                    throw new IllegalArgumentException(enumC0428y2 + " doesn't represent a native value.");
                                }
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            return;
                    }
                }
            });
        }
    }

    public static final boolean a(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        h.e(bArr, "a");
        h.e(bArr2, "b");
        for (int i10 = 0; i10 < i9; i10++) {
            if (bArr[i10 + i7] != bArr2[i10 + i8]) {
                return false;
            }
        }
        return true;
    }

    public static Q1.e a0(int i7, F1.h hVar, C0095a c0095a) throws C0045t0 {
        Q1.e eVarB = Q1.e.b(hVar, c0095a);
        while (true) {
            int i8 = eVarB.f5785a;
            if (i8 == i7) {
                return eVarB;
            }
            a.j(i8, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = eVarB.f5786b + 8;
            if (j > 2147483647L) {
                throw C0045t0.c("Chunk is too large (~2GB+) to skip; id: " + i8);
            }
            hVar.q((int) j);
            eVarB = Q1.e.b(hVar, c0095a);
        }
    }

    public static String b(int i7, int i8, String str) {
        if (i7 < 0) {
            return P6.b.z("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return P6.b.z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException(k.d(i8, "negative size: "));
    }

    public static final Object b0(t tVar, t tVar2, Function2 function2) throws Throwable {
        Object c0138v;
        Object objD;
        try {
            s.a(2, function2);
            c0138v = function2.invoke(tVar2, tVar);
        } catch (Throwable th) {
            c0138v = new C0138v(false, th);
        }
        j6.a aVar = j6.a.f14648a;
        if (c0138v == aVar || (objD = tVar.D(c0138v)) == E.f1782e) {
            return aVar;
        }
        if (objD instanceof C0138v) {
            throw ((C0138v) objD).f1882a;
        }
        return E.v(objD);
    }

    public static void c(int i7, String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(P6.b.z(str, Integer.valueOf(i7)));
        }
    }

    public static final boolean c0(String str, s6.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static void d(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void e(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void g(boolean z4, String str, long j) {
        if (!z4) {
            throw new IllegalArgumentException(P6.b.z(str, Long.valueOf(j)));
        }
    }

    public static void h(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(P6.b.z(str, obj));
        }
    }

    public static void i(int i7, int i8) {
        String strZ;
        if (i7 < 0 || i7 >= i8) {
            if (i7 < 0) {
                strZ = P6.b.z("%s (%s) must not be negative", "index", Integer.valueOf(i7));
            } else {
                if (i8 < 0) {
                    throw new IllegalArgumentException(k.d(i8, "negative size: "));
                }
                strZ = P6.b.z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i8));
            }
            throw new IndexOutOfBoundsException(strZ);
        }
    }

    public static boolean j(F1.h hVar) {
        C0095a c0095a = new C0095a(8);
        int i7 = Q1.e.b(hVar, c0095a).f5785a;
        if (i7 != 1380533830 && i7 != 1380333108) {
            return false;
        }
        hVar.c((byte[]) c0095a.f1465c, 0, 4, false);
        c0095a.D(0);
        int iG = c0095a.g();
        if (iG == 1463899717) {
            return true;
        }
        L.k(iG, "Unsupported form type: ", "WavHeaderReader");
        return false;
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader k0() {
        SecurityException e7;
        Thread thread;
        ThreadGroup threadGroup;
        if (f15696b == null) {
            Thread thread2 = f15697c;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f15697c.getContextClassLoader();
                    } catch (SecurityException e8) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e8.getMessage());
                    }
                }
                f15696b = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i7 = 0;
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i8];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i8++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i7 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i7];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i7++;
                                }
                                if (thread == null) {
                                    try {
                                        e eVar = new e(threadGroup, "GmsDynamite");
                                        try {
                                            eVar.setContextClassLoader(null);
                                            eVar.start();
                                            thread = eVar;
                                        } catch (SecurityException e9) {
                                            e7 = e9;
                                            thread = eVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e7.getMessage());
                                        }
                                    } catch (SecurityException e10) {
                                        e7 = e10;
                                    }
                                }
                            } catch (SecurityException e11) {
                                e7 = e11;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f15697c = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f15697c.getContextClassLoader();
                    }
                }
                f15696b = contextClassLoader;
            }
        }
        return f15696b;
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void l0(Context context) {
        boolean z4;
        Object obj = g.f3814b;
        if (((Boolean) zzbdu.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (g.f3814b) {
                        z4 = g.f3815c;
                    }
                    if (z4) {
                        return;
                    }
                    I3.b bVarZzb = new H2.h(context).zzb();
                    int i7 = J.f3546b;
                    J2.j.f("Updating ad debug logging enablement.");
                    zzbzd.zza(bVarZzb, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e7) {
                J2.j.h("Fail to determine debug setting.", e7);
            }
        }
    }

    public static final void m(long j, long j3, long j7) {
        if ((j3 | j7) < 0 || j3 > j || j - j3 < j7) {
            StringBuilder sbJ = k.j("size=", " offset=", j);
            sbJ.append(j3);
            sbJ.append(" byteCount=");
            sbJ.append(j7);
            throw new ArrayIndexOutOfBoundsException(sbJ.toString());
        }
    }

    public static void n(int i7, int i8) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(b(i7, i8, "index"));
        }
    }

    public static void o(int i7, int i8, int i9) {
        String strB;
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            if (i7 < 0 || i7 > i9) {
                strB = b(i7, i9, "start index");
            } else {
                strB = (i8 < 0 || i8 > i9) ? b(i8, i9, "end index") : P6.b.z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
            }
            throw new IndexOutOfBoundsException(strB);
        }
    }

    public static void q(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void r(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void s(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalStateException(P6.b.z(str, obj));
        }
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final long u(InputStream inputStream, OutputStream outputStream, int i7) throws IOException {
        h.e(inputStream, "<this>");
        byte[] bArr = new byte[i7];
        int i8 = inputStream.read(bArr);
        long j = 0;
        while (i8 >= 0) {
            outputStream.write(bArr, 0, i8);
            j += (long) i8;
            i8 = inputStream.read(bArr);
        }
        return j;
    }

    public static byte[] z(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            byte b7 = (byte) ((bArr[i7] << 1) & 254);
            bArr2[i7] = b7;
            if (i7 < 15) {
                bArr2[i7] = (byte) (((byte) ((bArr[i7 + 1] >> 7) & 1)) | b7);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public void D(o oVar) {
        List listSingletonList = Collections.singletonList(oVar);
        l lVar = (l) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        p031e1.e eVar = new p031e1.e(lVar, listSingletonList);
        if (eVar.f12531k) {
            p023d1.n.d().i(p031e1.e.f12527l, AbstractC0486a1.h("Already enqueued work ids (", TextUtils.join(", ", eVar.f12530i), ")"), new Throwable[0]);
        } else {
            lVar.f12553x.G(new p096n1.c(eVar));
        }
    }

    public M.f G(M.f[] fVarArr, int i7) {
        new C1013m0(5);
        int i8 = (i7 & 1) == 0 ? 400 : 700;
        boolean z4 = (i7 & 2) != 0;
        M.f fVar = null;
        int i9 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (M.f fVar2 : fVarArr) {
            int iAbs = (Math.abs(fVar2.f4534c - i8) * 2) + (fVar2.f4535d == z4 ? 0 : 1);
            if (fVar == null || i9 > iAbs) {
                fVar = fVar2;
                i9 = iAbs;
            }
        }
        return fVar;
    }

    public abstract Object I(String str);

    public abstract String K();

    public boolean L() {
        return Boolean.TRUE.equals(I("noResult"));
    }

    public abstract c M();

    public abstract boolean Q();

    public boolean R() {
        throw null;
    }

    public abstract void T(Throwable th);

    public abstract void U(F0 f7);

    public abstract void X(boolean z4);

    public abstract void d0(AbstractC0867k abstractC0867k);

    public abstract void e0(double d7);

    @Override // j5.c
    public void f(Serializable serializable) {
        M().f(serializable);
    }

    public abstract void f0();

    public abstract void g0(long j);

    public abstract void h0(String str);

    public Task i0(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        boolean z4;
        C0894c c0894c = new C0894c(3);
        c0894c.f12939b = this;
        Q3.o oVarM = firebaseAuth.m();
        if (oVarM != null) {
            synchronized (oVarM.f5822a) {
                try {
                    zzagm zzagmVar = (zzagm) oVarM.f5824c;
                    z4 = zzagmVar != null && zzagmVar.zzc("EMAIL_PASSWORD_PROVIDER");
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z4) {
                return oVarM.r(str, Boolean.FALSE, recaptchaAction).continueWithTask(c0894c).continueWithTask(new p072k1.g(str, oVarM, recaptchaAction, c0894c));
            }
        }
        Task taskJ0 = j0(null);
        F0 f7 = new F0(13, false);
        f7.f17379b = recaptchaAction;
        f7.f17380c = firebaseAuth;
        f7.f17381d = str;
        f7.f17382e = c0894c;
        return taskJ0.continueWithTask(f7);
    }

    public abstract Task j0(String str);

    @Override // j5.c
    public void p(String str, HashMap map) {
        M().p(str, map);
    }

    public String toString() {
        switch (this.f15698a) {
            case 27:
                return K() + " " + ((String) I("sql")) + " " + ((List) I("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract Typeface v(Context context, H.f fVar, Resources resources, int i7);

    public abstract Typeface w(Context context, M.f[] fVarArr, int i7);

    public Typeface x(Context context, InputStream inputStream) {
        File fileU = P6.b.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (P6.b.h(fileU, inputStream)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public Typeface y(Context context, Resources resources, int i7, String str, int i8) {
        File fileU = P6.b.u(context);
        if (fileU == null) {
            return null;
        }
        try {
            if (P6.b.g(fileU, resources, i7)) {
                return Typeface.createFromFile(fileU.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileU.delete();
        }
    }

    public f() {
        this.f15698a = 6;
        new ConcurrentHashMap();
    }

    public f(a0 a0Var) {
        this.f15698a = 19;
        h.e(a0Var, "operation");
    }

    public void W(boolean z4) {
    }
}
