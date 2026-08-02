package P2;

import T2.L;
import T2.y;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0724Yc;
import com.google.android.gms.internal.ads.C0980fc;
import com.google.android.gms.internal.ads.InterfaceC0758ad;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4712a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4713b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0758ad f4714c;

    /* renamed from: d, reason: collision with root package name */
    public final C0980fc f4715d = new C0980fc(false, Collections.EMPTY_LIST);

    public a(Context context, InterfaceC0758ad interfaceC0758ad) {
        this.f4712a = context;
        this.f4714c = interfaceC0758ad;
    }

    public final void a(String str) {
        List<String> list;
        C0980fc c0980fc = this.f4715d;
        InterfaceC0758ad interfaceC0758ad = this.f4714c;
        if ((interfaceC0758ad == null || !((C0724Yc) interfaceC0758ad).f12342g.f12491p) && !c0980fc.f13471k) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (interfaceC0758ad != null) {
            ((C0724Yc) interfaceC0758ad).a(str, null, 3);
            return;
        }
        if (!c0980fc.f13471k || (list = c0980fc.f13472l) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                L l5 = o.f4767B.f4771c;
                new y(this.f4712a, "", replace, null).l();
            }
        }
    }

    public final boolean b() {
        InterfaceC0758ad interfaceC0758ad = this.f4714c;
        return ((interfaceC0758ad == null || !((C0724Yc) interfaceC0758ad).f12342g.f12491p) && !this.f4715d.f13471k) || this.f4713b;
    }
}
