package p036e6;

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
import com.salamadev.nabilalawadi.kisaskoran.R;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import p061i2.m;
import p061i2.p;
import p061i2.q;
import p063i4.o;
import p113p3.b;
import p120q4.g;
import p122r.f;
import p137t0.a;
import p146u2.C0956o;
import p146u2.M;
import p155w1.C1010l1;
import p155w1.C1013m0;
import p155w1.Y0;
import p155w1.Z0;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements D2.c, d, j, M, q, o, p113p3.c, g, a, Z0, Y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f12743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f12744c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12745a;

    public /* synthetic */ c(int i7) {
        this.f12745a = i7;
    }

    public static t k(int i7) {
        return new t(new N6.d(), Math.min(1048576, Math.max(4096, i7)));
    }

    @Override // p146u2.M
    public Object c(Uri uri, C0956o c0956o) {
        return Long.valueOf(p151v2.t.H(new BufferedReader(new InputStreamReader(c0956o)).readLine()));
    }

    @Override // W3.j
    public Object d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // p113p3.c
    public C0091j e(Context context, String str, b bVar) {
        C0091j c0091j = new C0091j();
        c0091j.f1289a = bVar.k(context, str);
        int i7 = 1;
        int iF = bVar.f(context, str, true);
        c0091j.f1290b = iF;
        int i8 = c0091j.f1289a;
        if (i8 == 0) {
            i8 = 0;
            if (iF == 0) {
                i7 = 0;
            } else if (i8 >= iF) {
                i7 = -1;
            }
        } else if (i8 >= iF) {
            i7 = -1;
        }
        c0091j.f1291c = i7;
        return c0091j;
    }

    @Override // p137t0.a
    public CharSequence f(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (TextUtils.isEmpty(null)) {
            return listPreference.f9660a.getString(R.string.not_set);
        }
        return null;
    }

    @Override // p155w1.Z0
    public Y0 g(int i7) {
        return new C1010l1(new C1013m0(27));
    }

    @Override // D2.c
    public Map getAdapterStatusMap() {
        HashMap map = new HashMap();
        map.put("com.google.android.gms.ads.MobileAds", new Q0());
        return map;
    }

    @Override // p155w1.Y0
    public Object h(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i7 = inputStream.read(bArr);
            if (i7 < 0) {
                return byteArrayOutputStream.toString();
            }
            byteArrayOutputStream.write(bArr, 0, i7);
        }
    }

    @Override // p061i2.q
    public M i(m mVar, p061i2.j jVar) {
        return new p(mVar, jVar);
    }

    @Override // p061i2.q
    public M j() {
        return new p(m.f13920n, null);
    }

    @Override // p120q4.g
    public boolean p(Object obj) {
        switch (this.f12745a) {
            case 22:
                p114p4.c cVar = (p114p4.c) ((Map) obj).get(p134s4.g.f16169i);
                return cVar != null && cVar.f15709e;
            default:
                return true;
        }
    }

    @Override // p155w1.Y0
    public /* synthetic */ void s(Object obj, OutputStream outputStream) throws IOException {
        String str = (String) obj;
        if (str == null) {
            return;
        }
        byte[] bytes = str.getBytes("utf-8");
        outputStream.write(bytes, 0, bytes.length);
    }

    public c() {
        this.f12745a = 3;
        new p122r.b();
        new f();
    }

    @Override // p063i4.o
    public void a(p063i4.b bVar) {
    }

    @Override // p063i4.o
    public void b(p063i4.c cVar) {
    }
}
