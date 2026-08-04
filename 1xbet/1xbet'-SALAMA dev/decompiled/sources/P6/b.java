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
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import p065i6.d;
import p065i6.i;
import p136t.e;
import p155w1.F0;
import p155w1.P2;
import p155w1.V0;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5721a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5722b = true;

    public static MappedByteBuffer A(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
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

    /* JADX WARN: Code duplicated, block: B:32:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void C(Context context, String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e7) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e7);
                if (fileOutputStreamOpenFileOutput != null) {
                    fileOutputStreamOpenFileOutput.close();
                }
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static p052h0.b D(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i7 = byteBufferDuplicate.getShort() & 65535;
        if (i7 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                j = -1;
                break;
            }
            int i9 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i9) {
                break;
            }
            i8++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i10 = 0; i10 < j3; i10++) {
                int i11 = byteBufferDuplicate.getInt();
                long j7 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i11 || 1701669481 == i11) {
                    byteBufferDuplicate.position((int) (j7 + j));
                    p052h0.b bVar = new p052h0.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f5028d = byteBufferDuplicate;
                    bVar.f5025a = iPosition;
                    int i12 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f5026b = i12;
                    bVar.f5027c = ((ByteBuffer) bVar.f5028d).getShort(i12);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0045 A[EXC_TOP_SPLITTER, PHI: r2
      0x0045: PHI (r2v2 java.lang.String) = (r2v0 java.lang.String), (r2v4 java.lang.String) binds: [B:25:0x004e, B:21:0x0043] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String E(Context context) {
        String attributeValue = "";
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            try {
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                    int depth = xmlPullParserNewPullParser.getDepth();
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                            if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException | XmlPullParserException unused2) {
                    Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                }
                if (attributeValue.isEmpty()) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                } else {
                    Log.d("AppLocalesStorageHelper", "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: ".concat(attributeValue));
                }
                return attributeValue;
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused4) {
            Log.w("AppLocalesStorageHelper", "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return "";
        }
    }

    public static long F(C0095a c0095a, int i7, int i8) {
        c0095a.D(i7);
        if (c0095a.d() < 5) {
            return -9223372036854775807L;
        }
        int iG = c0095a.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i8 || (iG & 32) == 0 || c0095a.t() < 7 || c0095a.d() < 7 || (c0095a.t() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c0095a.f(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
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
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0406b, obj, 1);
        if (c0417m != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i7) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v6, 0);
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
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0406b, obj, 1);
        if (c0417m != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i8) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v6, 0);
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
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0406b, obj, 1);
        if (c0417m != null) {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i9) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v6, 0);
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
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0406b, obj, 1);
        if (c0417m == null) {
            f10.M(null);
        } else {
            final int i10 = 3;
            f10.M(new A5.b() { // from class: R5.A
                @Override // A5.b
                public final void i(Object obj2, V0 v6) {
                    List listW0;
                    List listW1;
                    List listW2;
                    switch (i10) {
                        case 0:
                            C0417m c0417m2 = c0417m;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0417m2.f6191a.f3679c).a(((Long) obj3).longValue(), CookieManager.getInstance());
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
                            break;
                        case 2:
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            t6.h.c(obj7, "null cannot be cast to non-null type android.webkit.CookieManager");
                            B b7 = new B(v6, 0);
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
                            boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                            try {
                                c0417m4.getClass();
                                cookieManager2.setAcceptThirdPartyCookies(webView, zBooleanValue);
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

    public static void K(f fVar, final C0423t c0423t) {
        j jVar;
        h.e(fVar, "binaryMessenger");
        n c0406b = (c0423t == null || (jVar = c0423t.f6213a) == null) ? new C0406b() : jVar.a();
        Object obj = null;
        F0 f7 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0406b, obj, 1);
        if (c0423t != null) {
            final int i7 = 0;
            f7.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            break;
                    }
                }
            });
        } else {
            f7.M(null);
        }
        F0 f8 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0406b, obj, 1);
        if (c0423t != null) {
            final int i8 = 1;
            f8.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            break;
                    }
                }
            });
        } else {
            f8.M(null);
        }
        F0 f9 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0406b, obj, 1);
        if (c0423t != null) {
            final int i9 = 2;
            f9.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            break;
                    }
                }
            });
        } else {
            f9.M(null);
        }
        F0 f10 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0406b, obj, 1);
        if (c0423t != null) {
            final int i10 = 3;
            f10.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            break;
                    }
                }
            });
        } else {
            f10.M(null);
        }
        F0 f11 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0406b, obj, 1);
        if (c0423t != null) {
            final int i11 = 4;
            f11.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
                            break;
                    }
                }
            });
        } else {
            f11.M(null);
        }
        F0 f12 = new F0(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0406b, obj, 1);
        if (c0423t == null) {
            f12.M(null);
        } else {
            final int i12 = 5;
            f12.M(new A5.b() { // from class: R5.K
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
                            C0423t c0423t2 = c0423t;
                            t6.h.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            t6.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0407c) c0423t2.f6213a.f3679c).a(((Long) obj3).longValue(), new Z(c0423t2));
                                listW0 = Y4.D.D(null);
                            } catch (Throwable th) {
                                listW0 = p003a.a.w0(th);
                            }
                            v6.f(listW0);
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
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                c0423t3.getClass();
                                z4.f6123c = zBooleanValue;
                                listW1 = Y4.D.D(null);
                            } catch (Throwable th2) {
                                listW1 = p003a.a.w0(th2);
                            }
                            v6.f(listW1);
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
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                c0423t4.getClass();
                                z7.f6124d = zBooleanValue2;
                                listW2 = Y4.D.D(null);
                            } catch (Throwable th3) {
                                listW2 = p003a.a.w0(th3);
                            }
                            v6.f(listW2);
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
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                c0423t5.getClass();
                                z8.f6125e = zBooleanValue3;
                                listW3 = Y4.D.D(null);
                            } catch (Throwable th4) {
                                listW3 = p003a.a.w0(th4);
                            }
                            v6.f(listW3);
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
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                c0423t6.getClass();
                                z9.f6126f = zBooleanValue4;
                                listW4 = Y4.D.D(null);
                            } catch (Throwable th5) {
                                listW4 = p003a.a.w0(th5);
                            }
                            v6.f(listW4);
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
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                c0423t7.getClass();
                                z10.f6127g = zBooleanValue5;
                                listW5 = Y4.D.D(null);
                            } catch (Throwable th6) {
                                listW5 = p003a.a.w0(th6);
                            }
                            v6.f(listW5);
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i7});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static ArrayList P(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            Object objQ = jSONArray.get(i7);
            if (objQ instanceof JSONArray) {
                objQ = P((JSONArray) objQ);
            } else if (objQ instanceof JSONObject) {
                objQ = Q((JSONObject) objQ);
            }
            arrayList.add(objQ);
        }
        return arrayList;
    }

    public static p122r.b Q(JSONObject jSONObject) throws JSONException {
        p122r.b bVar = new p122r.b();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objQ = jSONObject.get(next);
            if (objQ instanceof JSONArray) {
                objQ = P((JSONArray) objQ);
            } else if (objQ instanceof JSONObject) {
                objQ = Q((JSONObject) objQ);
            } else if (objQ.equals(JSONObject.NULL)) {
                objQ = null;
            }
            bVar.put(next, objQ);
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

    public static void S(I0 i7, p113p3.f fVar) {
        switch (e.e(i7.R())) {
            case 0:
                fVar.g0(5);
                return;
            case 1:
                fVar.g0(10);
                fVar.g0(i7.H() ? 1L : 0L);
                return;
            case 2:
                fVar.g0(15);
                fVar.e0(i7.M());
                return;
            case 3:
                double dK = i7.K();
                if (Double.isNaN(dK)) {
                    fVar.g0(13);
                    return;
                }
                fVar.g0(15);
                if (dK == -0.0d) {
                    fVar.e0(0.0d);
                    return;
                } else {
                    fVar.e0(dK);
                    return;
                }
            case 4:
                z0 z0VarQ = i7.Q();
                fVar.g0(20);
                fVar.g0(z0VarQ.z());
                fVar.g0(z0VarQ.y());
                return;
            case 5:
                String strP = i7.P();
                fVar.g0(25);
                fVar.h0(strP);
                fVar.g0(2L);
                return;
            case 6:
                fVar.g0(30);
                fVar.d0(i7.I());
                fVar.g0(2L);
                return;
            case 7:
                String strO = i7.O();
                fVar.g0(37);
                m mVarY = m.y(strO);
                int size = mVarY.f3312a.size();
                for (int i8 = 5; i8 < size; i8++) {
                    String strL = mVarY.l(i8);
                    fVar.g0(60);
                    fVar.h0(strL);
                }
                return;
            case 8:
                p015b5.b bVarL = i7.L();
                fVar.g0(45);
                fVar.e0(bVarL.y());
                fVar.e0(bVarL.z());
                return;
            case 9:
                C0569e c0569eG = i7.G();
                fVar.g0(50);
                Iterator it = c0569eG.a().iterator();
                while (it.hasNext()) {
                    S((I0) it.next(), fVar);
                }
                fVar.g0(2L);
                return;
            case 10:
                I0 i9 = o.f3334a;
                if (o.f3337d.equals(i7.N().y().get("__type__"))) {
                    fVar.g0(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    return;
                }
                if (o.j(i7)) {
                    Map mapY = i7.N().y();
                    fVar.g0(53);
                    int iA = ((I0) mapY.get("value")).G().A();
                    fVar.g0(15);
                    fVar.g0(iA);
                    fVar.g0(25);
                    fVar.h0("value");
                    S((I0) mapY.get("value"), fVar);
                    return;
                }
                K kN = i7.N();
                fVar.g0(55);
                for (Map.Entry entry : kN.y().entrySet()) {
                    String str = (String) entry.getKey();
                    I0 i10 = (I0) entry.getValue();
                    fVar.g0(25);
                    fVar.h0(str);
                    S(i10, fVar);
                }
                fVar.g0(2L);
                return;
            default:
                throw new IllegalArgumentException("unknown index value type ".concat(AbstractC0486a1.w(i7.R())));
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
            StringBuilder sbG = p150v0.a.g("fromIndex: ", i7, ", toIndex: ", i8, ", size: ");
            sbG.append(i9);
            throw new IndexOutOfBoundsException(sbG.toString());
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

    public static byte[] d(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > com.google.android.gms.common.api.f.API_PRIORITY_OTHER - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static void e(long j, C0095a c0095a, v[] vVarArr) {
        int i7;
        int iT;
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
                int iT2 = c0095a.t();
                i8 += iT2;
                if (iT2 != 255) {
                    i7 = i8;
                    break;
                }
            }
            int i9 = 0;
            do {
                if (c0095a.d() == 0) {
                    i9 = -1;
                    break;
                } else {
                    iT = c0095a.t();
                    i9 += iT;
                }
            } while (iT == 255);
            int i10 = c0095a.f1463a + i9;
            if (i9 == -1 || i9 > c0095a.d()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i10 = c0095a.f1464b;
            } else if (i7 == 4 && i9 >= 8) {
                int iT3 = c0095a.t();
                int iY = c0095a.y();
                int iG = iY == 49 ? c0095a.g() : 0;
                int iT4 = c0095a.t();
                if (iY == 47) {
                    c0095a.E(1);
                }
                boolean z4 = iT3 == 181 && (iY == 49 || iY == 47) && iT4 == 3;
                if (iY == 49) {
                    z4 &= iG == 1195456820;
                }
                if (z4) {
                    f(j, c0095a, vVarArr);
                }
            }
            c0095a.D(i10);
        }
    }

    public static void f(long j, C0095a c0095a, v[] vVarArr) {
        int iT = c0095a.t();
        if ((iT & 64) != 0) {
            c0095a.E(1);
            int i7 = (iT & 31) * 3;
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

    public static boolean g(File file, Resources resources, int i7) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i7);
            try {
                boolean zH = h(file, inputStreamOpenRawResource);
                c(inputStreamOpenRawResource);
                return zH;
            } catch (Throwable th) {
                th = th;
                c(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean h(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i7 = inputStream.read(bArr);
                        if (i7 == -1) {
                            c(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i7);
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    c(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d i(d dVar, d dVar2, Function2 function2) {
        h.e(function2, "<this>");
        if (function2 instanceof p077k6.a) {
            return ((p077k6.a) function2).create(dVar, dVar2);
        }
        i context = dVar2.getContext();
        return context == p065i6.j.f14074a ? new j6.b(dVar2, dVar, function2) : new c(dVar2, context, function2, dVar);
    }

    public static void j(File file) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
        try {
            Files.deleteIfExists(file.toPath());
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
        p034e4.a aVar;
        boolean z4 = false;
        if (!TextUtils.isEmpty(str2)) {
            zzap zzapVar = p034e4.a.f12675d;
            D.e(str2);
            try {
                aVar = new p034e4.a(str2);
            } catch (IllegalArgumentException unused) {
                aVar = null;
            }
            if (aVar != null) {
                zzap zzapVar2 = p034e4.a.f12675d;
                String str3 = aVar.f12677b;
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
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static d v(d dVar) {
        d dVarIntercepted;
        h.e(dVar, "<this>");
        p077k6.c cVar = dVar instanceof p077k6.c ? (p077k6.c) dVar : null;
        return (cVar == null || (dVarIntercepted = cVar.intercepted()) == null) ? dVar : dVarIntercepted;
    }

    public static boolean w(byte b7) {
        return b7 > -65;
    }

    public static boolean x(String str) {
        int i7 = k.f1727a;
        return str == null || str.isEmpty();
    }

    public static String z(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i7 = 0;
        for (int i8 = 0; i8 < objArr.length; i8++) {
            Object obj = objArr[i8];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder sbK = p031e1.k.k("<", str2, " threw ");
                    sbK.append(e7.getClass().getName());
                    sbK.append(">");
                    string = sbK.toString();
                }
            }
            objArr[i8] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i9 = 0;
        while (i7 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i9)) != -1) {
            sb.append((CharSequence) strValueOf, i9, iIndexOf);
            sb.append(objArr[i7]);
            i9 = iIndexOf + 2;
            i7++;
        }
        sb.append((CharSequence) strValueOf, i9, strValueOf.length());
        if (i7 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i7]);
            for (int i10 = i7 + 1; i10 < objArr.length; i10++) {
                sb.append(", ");
                sb.append(objArr[i10]);
            }
            sb.append(']');
        }
        return sb.toString();
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
