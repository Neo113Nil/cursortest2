package Y1;

import I1.AbstractActivityC0027d;
import a.AbstractC0086a;
import a0.AbstractC0088b;
import a1.AbstractC0089a;
import a1.C0090b;
import a2.C0103M;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import b0.C0156b;
import i1.C0335e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k.InterfaceC1074o;
import k.MenuC1069j;
import k.SubMenuC1079t;
import org.json.JSONObject;
import s1.C1201h;
import t0.C1207a;

/* renamed from: Y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077a implements R0.h, InterfaceC1074o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1668a;

    public /* synthetic */ C0077a(int i3) {
        this.f1668a = i3;
    }

    public static void b(WebView webView) {
        int i3 = 0;
        V1.b bVar = new V1.b(webView, new C0077a(19));
        WebView webView2 = (WebView) bVar.f1614b;
        boolean E3 = AbstractC0086a.E("WEB_MESSAGE_LISTENER");
        C0077a c0077a = (C0077a) bVar.f1615c;
        if (!E3) {
            c0077a.getClass();
            return;
        }
        try {
            c0077a.getClass();
            WeakHashMap weakHashMap = AbstractC0088b.f1782a;
            C0156b c0156b = b0.m.f2467c;
            if (!c0156b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            AbstractC0088b.b(webView2).f2470a.removeWebMessageListener("omidJsAttestationListener");
            b0.j jVar = new b0.j(bVar);
            HashSet hashSet = new HashSet(Arrays.asList("*"));
            if (!c0156b.b()) {
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            }
            b0.o b3 = AbstractC0088b.b(webView2);
            b3.f2470a.addWebMessageListener("omidJsAttestationListener", (String[]) hashSet.toArray(new String[0]), new F2.a(new b0.i(i3, jVar)));
        } catch (Exception unused) {
            c0077a.getClass();
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static f2.i h(List list) {
        f2.i iVar = new f2.i(new f2.f(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String packageName = ((ResolveInfo) it.next()).activityInfo.packageName;
            kotlin.jvm.internal.j.d(packageName, "packageName");
            iVar.add(packageName);
        }
        return F2.b.e(iVar);
    }

    public static V1.b i(Context context, String[] strArr, String str, D0.a aVar) {
        String[] m3 = m(context);
        int length = m3.length;
        int i3 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i3 >= length) {
                return null;
            }
            String str2 = m3[i3];
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i4 = i5;
                }
            }
            if (zipFile != null) {
                int i6 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    if (i6 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c3 = File.separatorChar;
                            sb.append(c3);
                            sb.append(str3);
                            sb.append(c3);
                            sb.append(str);
                            String sb2 = sb.toString();
                            aVar.d("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                V1.b bVar = new V1.b(13, false);
                                bVar.f1614b = zipFile;
                                bVar.f1615c = entry;
                                return bVar;
                            }
                        }
                        i6 = i7;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i3++;
        }
    }

    public static String[] j(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c3 = File.separatorChar;
        sb.append(c3);
        sb.append("([^\\");
        sb.append(c3);
        sb.append("]*)");
        sb.append(c3);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static boolean k(AbstractActivityC0027d context, Uri uri, C1207a c1207a) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (c1207a != null) {
            A.e eVar = c1207a.f10360k;
            if (kotlin.jvm.internal.j.a((Boolean) eVar.f8c, Boolean.TRUE)) {
                Map map = (Map) eVar.f;
                if (map != null) {
                    intent.putExtra("com.android.browser.headers", X0.a.i(map));
                }
            } else {
                intent = null;
            }
        }
        if (intent == null) {
            return false;
        }
        intent.setData(uri);
        context.startActivity(intent);
        return true;
    }

    public static void l(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap d3 = w1.b.d(jSONObject.getJSONObject("attestationArgs"));
                d3.put("version", string2);
                F2.b.a(C1201h.f10330b.f10331a.getApplicationContext(), string, new b0.j(d3));
            } catch (Exception unused) {
            }
        }
    }

    public static String[] m(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // R0.h
    public void accept(Object obj, Object obj2) {
        a1.c cVar = (a1.c) ((C0090b) obj).q();
        a1.f fVar = new a1.f((C0335e) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i3 = AbstractC0089a.f1783a;
        obtain.writeInt(1);
        F2.b.R(obtain, F2.b.Q(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f1784a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // k.InterfaceC1074o
    public boolean c(SubMenuC1079t subMenuC1079t) {
        return false;
    }

    public List e(String listString) {
        switch (this.f1668a) {
            case 5:
                try {
                    return (List) new C0103M(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                } catch (IOException | ClassNotFoundException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                kotlin.jvm.internal.j.e(listString, "listString");
                Object readObject = new C0103M(new ByteArrayInputStream(Base64.decode(listString, 0))).readObject();
                kotlin.jvm.internal.j.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
                ArrayList arrayList = new ArrayList();
                for (Object obj : (List) readObject) {
                    if (obj instanceof String) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }

    public String f(List list) {
        switch (this.f1668a) {
            case 5:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(list);
                    objectOutputStream.flush();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException e3) {
                    throw new RuntimeException(e3);
                }
            default:
                kotlin.jvm.internal.j.e(list, "list");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                objectOutputStream2.writeObject(list);
                objectOutputStream2.flush();
                String encodeToString = Base64.encodeToString(byteArrayOutputStream2.toByteArray(), 0);
                kotlin.jvm.internal.j.d(encodeToString, "encodeToString(...)");
                return encodeToString;
        }
    }

    public void g(C0079c c0079c) {
        switch (this.f1668a) {
            case 0:
                Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + c0079c);
                break;
            case 1:
            default:
                Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + c0079c);
                break;
            case 2:
                Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + c0079c);
                break;
        }
    }

    public /* synthetic */ C0077a(int i3, Object obj) {
        this.f1668a = i3;
    }

    @Override // k.InterfaceC1074o
    public void a(MenuC1069j menuC1069j, boolean z3) {
    }
}
