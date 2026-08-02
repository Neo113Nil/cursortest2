package P6;

import A5.f;
import A5.n;
import C1.C0095a;
import D3.k;
import F1.v;
import G4.C;
import G4.InterfaceC0268a;
import G4.InterfaceC0273f;
import G4.InterfaceC0290x;
import G4.InterfaceC0291y;
import G4.Y;
import H4.m;
import H4.o;
import I4.j;
import L4.p;
import R5.C0406b;
import R5.C0417m;
import R5.C0423t;
import W5.AbstractC0486a1;
import Y4.C0569e;
import Y4.I0;
import Y4.K;
import a.AbstractC0603a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.m1;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;
import com.google.protobuf.z0;
import e4.C1027a;
import h0.C1176b;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import j6.c;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import k6.AbstractC1354a;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import t.e;
import t6.h;
import v0.AbstractC1663a;
import w1.F0;
import w1.P2;
import w1.V0;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5721a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5722b = true;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static String B(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("/") && !str.endsWith("/") && !str.contains("//")) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split("/", -1)) {
            if (!TextUtils.isEmpty(str2)) {
                if (sb.length() > 0) {
                    sb.append("/");
                    sb.append(str2);
                } else {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public static void C(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument("UTF-8", Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (openFileOutput == null) {
                        return;
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e7);
                if (openFileOutput == null) {
                    return;
                }
            }
            try {
                openFileOutput.close();
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static C1176b D(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i7 = duplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                j = -1;
                break;
            }
            int i9 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i10 = 0; i10 < j3; i10++) {
                int i11 = duplicate.getInt();
                long j7 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    duplicate.position((int) (j7 + j));
                    C1176b c1176b = new C1176b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c1176b.f5028d = duplicate;
                    c1176b.f5025a = position;
                    int i12 = position - duplicate.getInt(position);
                    c1176b.f5026b = i12;
                    c1176b.f5027c = ((ByteBuffer) c1176b.f5028d).getShort(i12);
                    return c1176b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r3 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002d, code lost:
    
        if (r6 != 4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003a, code lost:
    
        if (r4.getName().equals("locales") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r3 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String E(Context context) {
        String str = "";
        try {
            FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                }
                if (str.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(str));
                }
                return str;
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    public static long F(C0095a c0095a, int i7, int i8) {
        c0095a.D(i7);
        if (c0095a.d() < 5) {
            return -9223372036854775807L;
        }
        int g3 = c0095a.g();
        if ((8388608 & g3) != 0 || ((2096896 & g3) >> 8) != i8 || (g3 & 32) == 0 || c0095a.t() < 7 || c0095a.d() < 7 || (c0095a.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        c0095a.f(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static void I(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            k1.a(view, charSequence);
            return;
        }
        m1 m1Var = m1.f8697B;
        if (m1Var != null && m1Var.f8700a == view) {
            m1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new m1(view, charSequence);
            return;
        }
        m1 m1Var2 = m1.f8698C;
        if (m1Var2 != null && m1Var2.f8700a == view) {
            m1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void J(f fVar, final C0417m c0417m) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0417m == null || (jVar = c0417m.f6191a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0406b, obj, 1);
        if (c0417m != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i7) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0417m c0417m3 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0417m3.getClass();
                                cookieManager.setCookie(str, str2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v02, 0);
                            c0417m.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0416l(0, b7));
                            break;
                        default:
                            C0417m c0417m4 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0406b, obj, 1);
        if (c0417m != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i8) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0417m c0417m3 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0417m3.getClass();
                                cookieManager.setCookie(str, str2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v02, 0);
                            c0417m.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0416l(0, b7));
                            break;
                        default:
                            C0417m c0417m4 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0406b, obj, 1);
        if (c0417m != null) {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i9) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0417m c0417m3 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0417m3.getClass();
                                cookieManager.setCookie(str, str2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v02, 0);
                            c0417m.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0416l(0, b7));
                            break;
                        default:
                            C0417m c0417m4 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0406b, obj, 1);
        if (c0417m == null) {
            f05.M(null);
        } else {
            final int i10 = 3;
            f05.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    switch (i10) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0417m c0417m3 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager = (CookieManager) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            t6.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0417m3.getClass();
                                cookieManager.setCookie(str, str2);
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v02, 0);
                            c0417m.getClass();
                            ((CookieManager) obj7).removeAllCookies(new C0416l(0, b7));
                            break;
                        default:
                            C0417m c0417m4 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj8 = list2.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type android.webkit.CookieManager");
                            CookieManager cookieManager2 = (CookieManager) obj8;
                            Object obj9 = list2.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type android.webkit.WebView");
                            WebView webView = (WebView) obj9;
                            Object obj10 = list2.get(2);
                            t6.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, booleanValue);
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                    }
                }
            });
        }
    }

    public static void K(f fVar, final C0423t c0423t) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0423t == null || (jVar = c0423t.f6213a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f02 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0406b, obj, 1);
        if (c0423t != null) {
            final int i7 = 0;
            f02.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i7) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        } else {
            f02.M(null);
        }
        F0 f03 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0406b, obj, 1);
        if (c0423t != null) {
            final int i8 = 1;
            f03.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i8) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        } else {
            f03.M(null);
        }
        F0 f04 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0406b, obj, 1);
        if (c0423t != null) {
            final int i9 = 2;
            f04.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i9) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        } else {
            f04.M(null);
        }
        F0 f05 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0406b, obj, 1);
        if (c0423t != null) {
            final int i10 = 3;
            f05.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i10) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        } else {
            f05.M(null);
        }
        F0 f06 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0406b, obj, 1);
        if (c0423t != null) {
            final int i11 = 4;
            f06.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i11) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        } else {
            f06.M(null);
        }
        F0 f07 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0406b, obj, 1);
        if (c0423t == null) {
            f07.M(null);
        } else {
            final int i12 = 5;
            f07.M(new A5.b() { // from class: R5.K
                @Override // A5.b
                public final void i(Object obj2, V0 v02) {
                    List w02;
                    List w03;
                    List w04;
                    List w05;
                    List w06;
                    List w07;
                    switch (i12) {
                        case 0:
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                w02 = Y4.D.D(null);
                            } catch (Throwable th) {
                                w02 = AbstractC0603a.w0(th);
                            }
                            v02.f(w02);
                            break;
                        case 1:
                            C0423t c0423t3 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            t6.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj4;
                            Object obj5 = list.get(1);
                            t6.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = booleanValue;
                                w03 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                w03 = AbstractC0603a.w0(th2);
                            }
                            v02.f(w03);
                            break;
                        case 2:
                            C0423t c0423t4 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            t6.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj6;
                            Object obj7 = list2.get(1);
                            t6.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = booleanValue2;
                                w04 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                w04 = AbstractC0603a.w0(th3);
                            }
                            v02.f(w04);
                            break;
                        case 3:
                            C0423t c0423t5 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            t6.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z8 = (Z) obj8;
                            Object obj9 = list3.get(1);
                            t6.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = booleanValue3;
                                w05 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                w05 = AbstractC0603a.w0(th4);
                            }
                            v02.f(w05);
                            break;
                        case 4:
                            C0423t c0423t6 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            t6.h.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z9 = (Z) obj10;
                            Object obj11 = list4.get(1);
                            t6.h.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = booleanValue4;
                                w06 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                w06 = AbstractC0603a.w0(th5);
                            }
                            v02.f(w06);
                            break;
                        default:
                            C0423t c0423t7 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            t6.h.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z10 = (Z) obj12;
                            Object obj13 = list5.get(1);
                            t6.h.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = booleanValue5;
                                w07 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                w07 = AbstractC0603a.w0(th6);
                            }
                            v02.f(w07);
                            break;
                    }
                }
            });
        }
    }

    public static void N(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z4);
        } else if (f5722b) {
            try {
                viewGroup.suppressLayout(z4);
            } catch (NoSuchMethodError unused) {
                f5722b = false;
            }
        }
    }

    public static int O(int i7, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ArrayList P(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object obj = jSONArray.get(i7);
            if (obj instanceof JSONArray) {
                obj = P((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = Q((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static r.b Q(JSONObject jSONObject) {
        r.b bVar = new r.b();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = P((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = Q((JSONObject) obj);
            } else if (obj.equals(JSONObject.NULL)) {
                obj = null;
            }
            bVar.put(next, obj);
        }
        return bVar;
    }

    public static ArrayList R(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof Q5.b) {
            Q5.b bVar = (Q5.b) th;
            arrayList.add(bVar.f5844a);
            arrayList.add(bVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }

    public static void S(I0 i02, p3.f fVar) {
        switch (e.e(i02.R())) {
            case 0:
                fVar.g0(5);
                return;
            case 1:
                fVar.g0(10);
                fVar.g0(i02.H() ? 1L : 0L);
                return;
            case 2:
                fVar.g0(15);
                fVar.e0(i02.M());
                return;
            case 3:
                double K7 = i02.K();
                if (Double.isNaN(K7)) {
                    fVar.g0(13);
                    return;
                }
                fVar.g0(15);
                if (K7 == -0.0d) {
                    fVar.e0(0.0d);
                    return;
                } else {
                    fVar.e0(K7);
                    return;
                }
            case 4:
                z0 Q6 = i02.Q();
                fVar.g0(20);
                fVar.g0(Q6.z());
                fVar.g0(Q6.y());
                return;
            case 5:
                String P7 = i02.P();
                fVar.g0(25);
                fVar.h0(P7);
                fVar.g0(2L);
                return;
            case 6:
                fVar.g0(30);
                fVar.d0(i02.I());
                fVar.g0(2L);
                return;
            case 7:
                String O7 = i02.O();
                fVar.g0(37);
                m y4 = m.y(O7);
                int size = y4.f3312a.size();
                for (int i7 = 5; i7 < size; i7++) {
                    String l7 = y4.l(i7);
                    fVar.g0(60);
                    fVar.h0(l7);
                }
                return;
            case 8:
                b5.b L7 = i02.L();
                fVar.g0(45);
                fVar.e0(L7.y());
                fVar.e0(L7.z());
                return;
            case 9:
                C0569e G2 = i02.G();
                fVar.g0(50);
                Iterator it = G2.a().iterator();
                while (it.hasNext()) {
                    S((I0) it.next(), fVar);
                }
                fVar.g0(2L);
                return;
            case 10:
                I0 i03 = o.f3334a;
                if (o.f3337d.equals(i02.N().y().get("__type__"))) {
                    fVar.g0(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return;
                }
                if (o.j(i02)) {
                    Map y5 = i02.N().y();
                    fVar.g0(53);
                    int A7 = ((I0) y5.get("value")).G().A();
                    fVar.g0(15);
                    fVar.g0(A7);
                    fVar.g0(25);
                    fVar.h0("value");
                    S((I0) y5.get("value"), fVar);
                    return;
                }
                K N7 = i02.N();
                fVar.g0(55);
                for (Map.Entry entry : N7.y().entrySet()) {
                    String str = (String) entry.getKey();
                    I0 i04 = (I0) entry.getValue();
                    fVar.g0(25);
                    fVar.h0(str);
                    S(i04, fVar);
                }
                fVar.g0(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type ".concat(AbstractC0486a1.w(i02.R())));
        }
    }

    public static final void T(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7) {
        if (i7 < 0 || byteBuffer2.remaining() < i7 || byteBuffer3.remaining() < i7 || byteBuffer.remaining() < i7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i8 = 0; i8 < i7; i8++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] U(byte[] bArr, int i7, byte[] bArr2, int i8, int i9) {
        if (i9 < 0 || bArr.length - i9 < i7 || bArr2.length - i9 < i8) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            bArr3[i10] = (byte) (bArr[i10 + i7] ^ bArr2[i10 + i8]);
        }
        return bArr3;
    }

    public static final byte[] V(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return U(bArr, 0, bArr2, 0, bArr.length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static zzahr W(AuthCredential authCredential, String str) {
        D.i(authCredential);
        if (GoogleAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            return new zzahr(googleAuthCredential.f11875a, googleAuthCredential.f11876b, "google.com", null, null, null, str, null, null);
        }
        if (FacebookAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzahr(null, ((FacebookAuthCredential) authCredential).f11846a, "facebook.com", null, null, null, str, null, null);
        }
        if (TwitterAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            return new zzahr(null, twitterAuthCredential.f11891a, "twitter.com", null, twitterAuthCredential.f11892b, null, str, null, null);
        }
        if (GithubAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzahr(null, ((GithubAuthCredential) authCredential).f11874a, "github.com", null, null, null, str, null, null);
        }
        if (PlayGamesAuthCredential.class.isAssignableFrom(authCredential.getClass())) {
            return new zzahr(null, null, "playgames.google.com", null, null, ((PlayGamesAuthCredential) authCredential).f11886a, str, null, null);
        }
        if (!zze.class.isAssignableFrom(authCredential.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        zze zzeVar = (zze) authCredential;
        zzahr zzahrVar = zzeVar.f11954d;
        if (zzahrVar != null) {
            return zzahrVar;
        }
        return new zzahr(zzeVar.f11952b, zzeVar.f11953c, zzeVar.f11951a, null, zzeVar.f11956f, null, str, zzeVar.f11955e, zzeVar.f11957x);
    }

    public static boolean X(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !X((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i7 = 0; i7 < length; i7++) {
                        if (!D.m(Array.get(obj, i7), Array.get(obj2, i7))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static void b(int i7, int i8, int i9) {
        if (i7 < 0 || i8 > i9) {
            StringBuilder g3 = AbstractC1663a.g("fromIndex: ", i7, ", toIndex: ", i8, ", size: ");
            g3.append(i9);
            throw new IndexOutOfBoundsException(g3.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(AbstractC0486a1.e(i7, i8, "fromIndex: ", " > toIndex: "));
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] d(byte[]... bArr) {
        int i7 = 0;
        for (byte[] bArr2 : bArr) {
            if (i7 > com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i7 += bArr2.length;
        }
        byte[] bArr3 = new byte[i7];
        int i8 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
            i8 += bArr4.length;
        }
        return bArr3;
    }

    public static void e(long j, C0095a c0095a, v[] vVarArr) {
        int i7;
        while (true) {
            if (c0095a.d() <= 1) {
                return;
            }
            int i8 = 0;
            while (true) {
                if (c0095a.d() == 0) {
                    i7 = -1;
                    break;
                }
                int t7 = c0095a.t();
                i8 += t7;
                if (t7 != 255) {
                    i7 = i8;
                    break;
                }
            }
            int i9 = 0;
            while (true) {
                if (c0095a.d() == 0) {
                    i9 = -1;
                    break;
                }
                int t8 = c0095a.t();
                i9 += t8;
                if (t8 != 255) {
                    break;
                }
            }
            int i10 = c0095a.f1463a + i9;
            if (i9 == -1 || i9 > c0095a.d()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i10 = c0095a.f1464b;
            } else if (i7 == 4 && i9 >= 8) {
                int t9 = c0095a.t();
                int y4 = c0095a.y();
                int g3 = y4 == 49 ? c0095a.g() : 0;
                int t10 = c0095a.t();
                if (y4 == 47) {
                    c0095a.E(1);
                }
                boolean z4 = t9 == 181 && (y4 == 49 || y4 == 47) && t10 == 3;
                if (y4 == 49) {
                    z4 &= g3 == 1195456820;
                }
                if (z4) {
                    f(j, c0095a, vVarArr);
                }
            }
            c0095a.D(i10);
        }
    }

    public static void f(long j, C0095a c0095a, v[] vVarArr) {
        int t7 = c0095a.t();
        if ((t7 & 64) != 0) {
            c0095a.E(1);
            int i7 = (t7 & 31) * 3;
            int i8 = c0095a.f1463a;
            for (v vVar : vVarArr) {
                c0095a.D(i8);
                vVar.c(i7, c0095a);
                if (j != -9223372036854775807L) {
                    vVar.e(j, 1, i7, 0, null);
                }
            }
        }
    }

    public static boolean g(File file, Resources resources, int i7) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i7);
            try {
                boolean h6 = h(file, inputStream);
                c(inputStream);
                return h6;
            } catch (Throwable th) {
                th = th;
                c(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e7) {
                e = e7;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e8) {
            e = e8;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            c(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1287d i(InterfaceC1287d interfaceC1287d, InterfaceC1287d interfaceC1287d2, Function2 function2) {
        h.e(function2, "<this>");
        if (function2 instanceof AbstractC1354a) {
            return ((AbstractC1354a) function2).create(interfaceC1287d, interfaceC1287d2);
        }
        InterfaceC1292i context = interfaceC1287d2.getContext();
        return context == C1293j.f14068a ? new j6.b(interfaceC1287d2, interfaceC1287d, function2) : new c(interfaceC1287d2, context, function2, interfaceC1287d);
    }

    public static void j(File file) {
        Path path;
        if (Build.VERSION.SDK_INT < 26) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
        try {
            path = file.toPath();
            Files.deleteIfExists(path);
        } catch (IOException e7) {
            throw new IOException("Failed to delete file " + file + ": " + e7);
        }
    }

    public static N6.f k(String str) {
        h.e(str, "<this>");
        byte[] bytes = str.getBytes(C6.a.f1581a);
        h.d(bytes, "this as java.lang.String).getBytes(charset)");
        N6.f fVar = new N6.f(bytes);
        fVar.f4801c = str;
        return fVar;
    }

    public static EmailAuthCredential m(String str, String str2) {
        C1027a c1027a;
        boolean z4 = false;
        if (!TextUtils.isEmpty(str2)) {
            zzap zzapVar = C1027a.f12669d;
            D.e(str2);
            try {
                c1027a = new C1027a(str2);
            } catch (IllegalArgumentException unused) {
                c1027a = null;
            }
            if (c1027a != null) {
                zzap zzapVar2 = C1027a.f12669d;
                String str3 = c1027a.f12671b;
                if ((zzapVar2.containsKey(str3) ? ((Integer) zzapVar2.get(str3)).intValue() : 3) == 4) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            return new EmailAuthCredential(str, null, str2, null, false);
        }
        throw new IllegalArgumentException("Given link is not a valid email link. Please use FirebaseAuth#isSignInWithEmailLink(String) to determine this before calling this function");
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i7 = 0; i7 < 100; i7++) {
            File file = new File(cacheDir, str + i7);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static InterfaceC1287d v(InterfaceC1287d interfaceC1287d) {
        InterfaceC1287d intercepted;
        h.e(interfaceC1287d, "<this>");
        AbstractC1356c abstractC1356c = interfaceC1287d instanceof AbstractC1356c ? (AbstractC1356c) interfaceC1287d : null;
        return (abstractC1356c == null || (intercepted = abstractC1356c.intercepted()) == null) ? interfaceC1287d : intercepted;
    }

    public static boolean w(byte b7) {
        return b7 > -65;
    }

    public static boolean x(String str) {
        int i7 = k.f1727a;
        return str == null || str.isEmpty();
    }

    public static String z(String str, Object... objArr) {
        int indexOf;
        String sb;
        String valueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder k7 = e1.k.k("<", str2, " threw ");
                    k7.append(e7.getClass().getName());
                    k7.append(">");
                    sb = k7.toString();
                }
            }
            objArr[i8] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (indexOf = valueOf.indexOf("%s", i9)) != -1) {
            sb2.append((CharSequence) valueOf, i9, indexOf);
            sb2.append(objArr[i7]);
            i9 = indexOf + 2;
            i7++;
        }
        sb2.append((CharSequence) valueOf, i9, valueOf.length());
        if (i7 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb2.append(", ");
                sb2.append(objArr[i10]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public abstract Object G(String str, p pVar);

    public abstract void H(Runnable runnable, String str);

    public abstract void L();

    public abstract void M();

    public abstract P2 l();

    public abstract InterfaceC0268a n(C4.e eVar);

    public abstract InterfaceC0273f o(C4.e eVar);

    public abstract InterfaceC0290x p(C4.e eVar, InterfaceC0273f interfaceC0273f);

    public abstract InterfaceC0291y q();

    public abstract C r();

    public abstract G4.D s();

    public abstract Y t();

    public abstract boolean y();
}
