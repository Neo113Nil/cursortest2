package sg.bigo.ads.A0;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.T0.g;
import sg.bigo.ads.U.h;
import sg.bigo.ads.X0.u;

/* loaded from: classes3.dex */
public abstract class c {
    public static URL a(Uri uri, sg.bigo.ads.B0.c cVar, h hVar) {
        if (uri == null) {
            return null;
        }
        if (hVar == null || !cVar.f) {
            return new URL(uri.toString());
        }
        Uri.Builder buildUpon = uri.buildUpon();
        a(buildUpon, "sdk_ver", "5.10.1");
        a(buildUpon, "sdk_vc", String.valueOf(51001));
        u uVar = (u) hVar;
        g gVar = uVar.c;
        a(buildUpon, "country", gVar != null ? gVar.I : "");
        a(buildUpon, MBridgeConstans.APP_KEY, uVar.f12615a.getAppKey());
        a(buildUpon, "pkg_ver", uVar.e);
        a(buildUpon, "pkg_vc", String.valueOf(uVar.f));
        a(buildUpon, L6.F, "android");
        a(buildUpon, "os_ver", Build.VERSION.RELEASE);
        a(buildUpon, "os_lang", uVar.g);
        a(buildUpon, "vendor", uVar.h);
        a(buildUpon, "model", uVar.i);
        a(buildUpon, "dpi", String.valueOf(uVar.l));
        a(buildUpon, "dpi_f", uVar.m);
        a(buildUpon, "resolution", uVar.k);
        a(buildUpon, "net", uVar.i());
        a(buildUpon, "tz", uVar.j());
        if (cVar.f()) {
            a(buildUpon, "enc", "1");
        }
        return new URL(buildUpon.build().toString());
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static byte[] a(sg.bigo.ads.B0.c cVar, h hVar) {
        byte[] a2 = cVar.a();
        if (a2 == null || a2.length == 0) {
            return null;
        }
        if ((cVar instanceof sg.bigo.ads.B0.b) && hVar != null && ((u) hVar).c.B.a(27)) {
            long longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_gzip_server_fail", (Object) 0L, 1)).longValue();
            if (0 == longValue || Math.abs(System.currentTimeMillis() - longValue) >= 14400000) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(a2);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ((sg.bigo.ads.B0.b) cVar).p = byteArray.length;
                return byteArray;
            }
        }
        return a2;
    }

    public static boolean a(HashMap hashMap) {
        if (!hashMap.containsKey(HttpHeaders.CONNECTION)) {
            hashMap.put(HttpHeaders.CONNECTION, new HashSet(Collections.singletonList(HttpHeaders.KEEP_ALIVE)));
        }
        Set set = (Set) hashMap.get("Range");
        Set set2 = (Set) hashMap.get(HttpHeaders.ACCEPT_ENCODING);
        if (!A.a(set) || !A.a(set2)) {
            return false;
        }
        hashMap.put(HttpHeaders.ACCEPT_ENCODING, new HashSet(Collections.singletonList("gzip")));
        return true;
    }
}
