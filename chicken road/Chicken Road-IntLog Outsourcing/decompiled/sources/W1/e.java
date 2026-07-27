package W1;

import B0.t;
import B4.r;
import G0.F;
import M2.C0099c;
import T4.v;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import b1.C0265b;
import b1.C0266c;
import b1.EnumC0268e;
import com.chickyneer.roadway.R;
import e1.InterfaceC0410a;
import e5.l;
import g4.AbstractC0464i;
import g4.AbstractC0467l;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.net.ssl.SSLSocket;
import k.n;
import k.s;
import q.AbstractC1387c;
import q.C1385a;
import q.C1386b;
import w2.AbstractActivityC1515c;

/* loaded from: classes.dex */
public final class e implements L3.f, T.a, U.f, X0.b, InterfaceC0410a, l, n {

    /* renamed from: a, reason: collision with root package name */
    public static e f3403a;

    /* renamed from: b, reason: collision with root package name */
    public static e f3404b;

    public /* synthetic */ e(Object obj) {
    }

    public static final void j(j5.d node, long j2, boolean z) {
        F f3 = j5.d.f10481h;
        if (j5.d.f10482i == null) {
            j5.d.f10482i = new j5.d();
            j5.c cVar = new j5.c("Okio Watchdog");
            cVar.setDaemon(true);
            cVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j2 != 0 && z) {
            node.f10489g = Math.min(j2, node.c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            node.f10489g = nanoTime + j2;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            node.f10489g = node.c();
        }
        F f6 = j5.d.f10481h;
        kotlin.jvm.internal.i.e(node, "node");
        int i2 = f6.f753b + 1;
        f6.f753b = i2;
        j5.d[] dVarArr = (j5.d[]) f6.f754c;
        if (i2 == dVarArr.length) {
            j5.d[] dVarArr2 = new j5.d[i2 * 2];
            AbstractC0464i.P(0, 0, dVarArr.length, dVarArr, dVarArr2);
            f6.f754c = dVarArr2;
        }
        f6.b(i2, node);
        if (node.f10488f == 1) {
            j5.d.f10484k.signal();
        }
    }

    public static ArrayList k(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((v) obj) != v.f2986c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0467l.D0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((v) it.next()).f2994a);
        }
        return arrayList2;
    }

    public static j5.d l() {
        F f3 = j5.d.f10481h;
        j5.d dVar = ((j5.d[]) f3.f754c)[1];
        if (dVar == null) {
            long nanoTime = System.nanoTime();
            j5.d.f10484k.await(j5.d.f10485l, TimeUnit.MILLISECONDS);
            if (((j5.d[]) f3.f754c)[1] != null || System.nanoTime() - nanoTime < j5.d.f10486m) {
                return null;
            }
            return j5.d.f10482i;
        }
        long nanoTime2 = dVar.f10489g - System.nanoTime();
        if (nanoTime2 > 0) {
            j5.d.f10484k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        f3.d(dVar);
        dVar.f10487e = 2;
        return dVar;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] n(List protocols) {
        kotlin.jvm.internal.i.e(protocols, "protocols");
        j5.f fVar = new j5.f();
        Iterator it = k(protocols).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            fVar.J(str.length());
            fVar.O(str);
        }
        return fVar.g(fVar.f10495b);
    }

    public static t q(Context context, String[] strArr, String str, B0.i iVar) {
        String[] u5 = u(context);
        int length = u5.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = u5[i2];
            int i3 = 0;
            while (true) {
                int i6 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i6;
                }
            }
            if (zipFile != null) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            iVar.d("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                t tVar = new t(5);
                                tVar.f207b = zipFile;
                                tVar.f208c = entry;
                                return tVar;
                            }
                        }
                        i7 = i8;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] r(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : u(context)) {
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

    public static boolean s(AbstractActivityC1515c context, Uri uri, O0.a aVar) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(uri, "uri");
        Intent intent = new Intent("android.intent.action.VIEW");
        if (aVar != null) {
            B.d dVar = aVar.f2214k;
            if (dVar != null) {
                if (kotlin.jvm.internal.i.a((Boolean) dVar.f107c, Boolean.TRUE)) {
                    Map map = (Map) dVar.f110f;
                    if (map != null) {
                        intent.putExtra("com.android.browser.headers", e5.g.i(map));
                    }
                }
            }
            intent = null;
        }
        if (intent == null) {
            return false;
        }
        intent.setData(uri);
        context.startActivity(intent);
        return true;
    }

    public static String[] u(Context context) {
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

    @Override // e5.l
    public boolean b(SSLSocket sSLSocket) {
        return r.O(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // U.f
    public void c(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // e5.l
    public e5.n d(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new e5.e(cls2);
    }

    @Override // e1.InterfaceC0410a
    public long e() {
        return System.currentTimeMillis();
    }

    @Override // T.a
    public CharSequence f(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f4606a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // k.n
    public boolean g(s sVar) {
        return false;
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        e eVar = new e();
        HashMap hashMap = new HashMap();
        S0.d dVar = S0.d.f2741a;
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar, new C0266c(30000L, 86400000L, emptySet));
        S0.d dVar2 = S0.d.f2743c;
        Set emptySet2 = Collections.emptySet();
        if (emptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar2, new C0266c(1000L, 86400000L, emptySet2));
        S0.d dVar3 = S0.d.f2742b;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(EnumC0268e.f4771b)));
        if (unmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        hashMap.put(dVar3, new C0266c(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() < S0.d.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C0265b(eVar, hashMap);
    }

    @Override // U.f
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public String o(List list) {
        kotlin.jvm.internal.i.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        kotlin.jvm.internal.i.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public void p(C0099c c0099c) {
        Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + c0099c);
    }

    public void t(B0.e eVar, float f3) {
        C1386b c1386b = (C1386b) ((Drawable) eVar.f146b);
        C1385a c1385a = (C1385a) eVar.f147c;
        boolean useCompatPadding = c1385a.getUseCompatPadding();
        boolean preventCornerOverlap = c1385a.getPreventCornerOverlap();
        if (f3 != c1386b.f11655e || c1386b.f11656f != useCompatPadding || c1386b.f11657g != preventCornerOverlap) {
            c1386b.f11655e = f3;
            c1386b.f11656f = useCompatPadding;
            c1386b.f11657g = preventCornerOverlap;
            c1386b.b(null);
            c1386b.invalidateSelf();
        }
        if (!c1385a.getUseCompatPadding()) {
            eVar.o(0, 0, 0, 0);
            return;
        }
        C1386b c1386b2 = (C1386b) ((Drawable) eVar.f146b);
        float f6 = c1386b2.f11655e;
        float f7 = c1386b2.f11651a;
        int ceil = (int) Math.ceil(AbstractC1387c.a(f6, f7, c1385a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC1387c.b(f6, f7, c1385a.getPreventCornerOverlap()));
        eVar.o(ceil, ceil2, ceil, ceil2);
    }

    @Override // k.n
    public void a(k.i iVar, boolean z) {
    }
}
