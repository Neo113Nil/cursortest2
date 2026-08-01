package sg.bigo.ads.B0;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4761z5;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;
import sg.bigo.ads.K0.F;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.InterfaceC5501a;

/* loaded from: classes3.dex */
public class b extends c {
    public static final C5506f q = C5506f.a("text/plain;charset=utf-8");
    public JSONObject h;
    public byte[] i;
    public String j;
    public C5506f k;
    public boolean l;
    public boolean m;
    public int n;
    public String o;
    public int p;

    public b(int i, InterfaceC5501a interfaceC5501a, Context context) {
        super(i, interfaceC5501a, true, context);
        this.p = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037 A[Catch: Exception -> 0x0047, TryCatch #1 {Exception -> 0x0047, blocks: (B:7:0x0011, B:9:0x0015, B:12:0x0028, B:13:0x0031, B:15:0x0037, B:16:0x0044, B:17:0x0020, B:20:0x002d), top: B:6:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044 A[Catch: Exception -> 0x0047, TRY_LEAVE, TryCatch #1 {Exception -> 0x0047, blocks: (B:7:0x0011, B:9:0x0015, B:12:0x0028, B:13:0x0031, B:15:0x0037, B:16:0x0044, B:17:0x0020, B:20:0x002d), top: B:6:0x0011 }] */
    @Override // sg.bigo.ads.B0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] a() {
        JSONObject jSONObject;
        String a2;
        String str;
        if (this.i == null && (jSONObject = this.h) != null) {
            String jSONObject2 = jSONObject.toString();
            this.j = jSONObject2;
            try {
                if (this.l) {
                    if (TextUtils.isEmpty(jSONObject2)) {
                        str = "data error with empty.";
                    } else if (TextUtils.isEmpty("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F")) {
                        str = "cip error with empty.";
                    } else {
                        a2 = F.a(jSONObject2);
                        if (TextUtils.isEmpty(a2)) {
                            this.m = true;
                            this.j = a2;
                            a("enc", "1");
                        } else {
                            this.m = false;
                        }
                    }
                    AbstractC5496a.a("a", str);
                    a2 = null;
                    if (TextUtils.isEmpty(a2)) {
                    }
                }
            } catch (Exception unused) {
                this.m = false;
            }
            try {
                this.i = this.j.getBytes(C4761z5.O);
            } catch (UnsupportedEncodingException unused2) {
            }
        }
        return this.i;
    }

    @Override // sg.bigo.ads.B0.c
    public final void b() {
        c();
    }

    @Override // sg.bigo.ads.B0.c
    public final int c() {
        int i = this.p;
        if (i > 0) {
            return i;
        }
        byte[] a2 = a();
        if (a2 != null) {
            return a2.length;
        }
        return -1;
    }

    @Override // sg.bigo.ads.B0.c
    public final C5506f d() {
        C5506f c5506f = this.k;
        return c5506f != null ? c5506f : q;
    }

    @Override // sg.bigo.ads.B0.c
    public final String e() {
        return "POST";
    }

    @Override // sg.bigo.ads.B0.c
    public final boolean f() {
        return this.m;
    }
}
