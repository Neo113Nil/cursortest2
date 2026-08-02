package e6;

import C0.C0091j;
import F2.Q0;
import M2.d;
import W3.j;
import X5.t;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import i2.C1254j;
import i2.C1257m;
import i2.C1260p;
import i2.InterfaceC1261q;
import i4.C1265b;
import i4.C1266c;
import i4.InterfaceC1278o;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import p3.InterfaceC1536b;
import p3.InterfaceC1537c;
import q4.g;
import r.f;
import t0.InterfaceC1603a;
import u2.C1638o;
import u2.M;
import w1.C1719l1;
import w1.C1722m0;
import w1.Y0;
import w1.Z0;

/* renamed from: e6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1054c implements D2.c, d, j, M, InterfaceC1261q, InterfaceC1278o, InterfaceC1537c, g, InterfaceC1603a, Z0, Y0 {

    /* renamed from: b, reason: collision with root package name */
    public static C1054c f12737b;

    /* renamed from: c, reason: collision with root package name */
    public static C1054c f12738c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12739a;

    public /* synthetic */ C1054c(int i7) {
        this.f12739a = i7;
    }

    public static t k(int i7) {
        return new t(new N6.d(), Math.min(1048576, Math.max(4096, i7)));
    }

    @Override // u2.M
    public Object c(Uri uri, C1638o c1638o) {
        return Long.valueOf(v2.t.H(new BufferedReader(new InputStreamReader(c1638o)).readLine()));
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // p3.InterfaceC1537c
    public C0091j e(Context context, String str, InterfaceC1536b interfaceC1536b) {
        C0091j c0091j = new C0091j();
        c0091j.f1289a = interfaceC1536b.k(context, str);
        int i7 = 1;
        int f7 = interfaceC1536b.f(context, str, true);
        c0091j.f1290b = f7;
        int i8 = c0091j.f1289a;
        if (i8 == 0) {
            i8 = 0;
            if (f7 == 0) {
                i7 = 0;
                c0091j.f1291c = i7;
                return c0091j;
            }
        }
        if (i8 >= f7) {
            i7 = -1;
        }
        c0091j.f1291c = i7;
        return c0091j;
    }

    @Override // t0.InterfaceC1603a
    public CharSequence f(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f9660a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // w1.Z0
    public Y0 g(int i7) {
        return new C1719l1(new C1722m0(27));
    }

    @Override // D2.c
    public Map getAdapterStatusMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.gms.ads.MobileAds", new Q0());
        return hashMap;
    }

    @Override // w1.Y0
    public Object h(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @Override // i2.InterfaceC1261q
    public M i(C1257m c1257m, C1254j c1254j) {
        return new C1260p(c1257m, c1254j);
    }

    @Override // i2.InterfaceC1261q
    public M j() {
        return new C1260p(C1257m.f13914n, null);
    }

    @Override // q4.g
    public boolean p(Object obj) {
        switch (this.f12739a) {
            case 22:
                p4.c cVar = (p4.c) ((Map) obj).get(s4.g.f16163i);
                return cVar != null && cVar.f15703e;
            default:
                return true;
        }
    }

    @Override // w1.Y0
    public /* synthetic */ void s(Object obj, OutputStream outputStream) {
        String str = (String) obj;
        if (str == null) {
            return;
        }
        byte[] bytes = str.getBytes("utf-8");
        outputStream.write(bytes, 0, bytes.length);
    }

    public C1054c() {
        this.f12739a = 3;
        new r.b();
        new f();
    }

    @Override // i4.InterfaceC1278o
    public void a(C1265b c1265b) {
    }

    @Override // i4.InterfaceC1278o
    public void b(C1266c c1266c) {
    }
}
