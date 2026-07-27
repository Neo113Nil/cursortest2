package sg.bigo.ads.j;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import sg.bigo.ads.Y0.D;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.z1.p;

/* renamed from: sg.bigo.ads.j.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5247a {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r20) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0048, code lost:
    
        if (android.webkit.URLUtil.isNetworkUrl(r4) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sg.bigo.ads.P.f a(Context context, Activity activity, Ad ad, sg.bigo.ads.P.c cVar, String str, p pVar, sg.bigo.ads.z1.a aVar, boolean z, boolean z2) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        String str3 = aVar == null ? null : aVar.f13437a;
        boolean z3 = cVar instanceof InterfaceC5087a;
        if (z3) {
            sg.bigo.ads.U0.k kVar = (sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar);
            str3 = D.a(str3, kVar.b1.get(), kVar.c1.get(), 6, 13);
        }
        if (!TextUtils.isEmpty(str3) && !str3.startsWith(ProxyConfig.MATCH_HTTP)) {
            arrayList.add(str3);
        }
        str3 = null;
        if (!TextUtils.isEmpty(str)) {
            if (!str2.startsWith(ProxyConfig.MATCH_HTTP)) {
                arrayList.add(str2);
            } else if (TextUtils.isEmpty(str3)) {
            }
        }
        str2 = str3;
        String str4 = pVar == null ? null : pVar.n;
        if (!TextUtils.isEmpty(str4)) {
            if (!str4.startsWith(ProxyConfig.MATCH_HTTP)) {
                arrayList.add(str4);
            } else if (TextUtils.isEmpty(str2) && URLUtil.isNetworkUrl(str4)) {
                str2 = str4;
            }
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        sg.bigo.ads.U0.j jVar = bVar.z;
        if (!TextUtils.isEmpty(jVar.b)) {
            arrayList.add(jVar.b);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = jVar.f12574a;
            if (z3) {
                sg.bigo.ads.U0.k kVar2 = (sg.bigo.ads.U0.k) ((InterfaceC5087a) cVar);
                str2 = D.a(str2, kVar2.b1.get(), kVar2.c1.get(), 6, 13);
            }
        }
        if (str2 == null) {
            str2 = "";
        }
        String str5 = str2;
        sg.bigo.ads.e.h hVar = ad instanceof sg.bigo.ads.e.h ? (sg.bigo.ads.e.h) ad : null;
        sg.bigo.ads.P.f a2 = D.a(context, activity, arrayList, str5, jVar.g, bVar.a(2), jVar.c, jVar.d, hVar, bVar.b(), D.a(hVar), z && !(hVar instanceof sg.bigo.ads.Q.d), false, z2);
        a2.f = str5;
        return a2;
    }
}
