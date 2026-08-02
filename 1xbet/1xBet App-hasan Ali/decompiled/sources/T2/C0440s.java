package T2;

import A0.J0;
import P.W;
import com.google.android.gms.internal.ads.A3;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.C1815y3;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: T2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440s extends A3 {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ U2.g f5742A;

    /* renamed from: w, reason: collision with root package name */
    public final Object f5743w;

    /* renamed from: x, reason: collision with root package name */
    public final t f5744x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ byte[] f5745y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ HashMap f5746z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0440s(int i, String str, t tVar, v3.g gVar, byte[] bArr, HashMap hashMap, U2.g gVar2) {
        super(i, str, gVar);
        this.f5745y = bArr;
        this.f5746z = hashMap;
        this.f5742A = gVar2;
        this.f5743w = new Object();
        this.f5744x = tVar;
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final W a(C1815y3 c1815y3) {
        String str;
        String str2;
        byte[] bArr = c1815y3.f16387b;
        try {
            Map map = c1815y3.f16388c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new W(str, AbstractC1668us.z(c1815y3));
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final Map c() {
        HashMap hashMap = this.f5746z;
        return hashMap == null ? Collections.EMPTY_MAP : hashMap;
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final void e(Object obj) {
        t tVar;
        String str = (String) obj;
        U2.g gVar = this.f5742A;
        if (U2.g.c() && str != null) {
            gVar.d("onNetworkResponseBody", new J0(str.getBytes()));
        }
        synchronized (this.f5743w) {
            tVar = this.f5744x;
        }
        tVar.b(str);
    }

    @Override // com.google.android.gms.internal.ads.A3
    public final byte[] m() {
        byte[] bArr = this.f5745y;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }
}
