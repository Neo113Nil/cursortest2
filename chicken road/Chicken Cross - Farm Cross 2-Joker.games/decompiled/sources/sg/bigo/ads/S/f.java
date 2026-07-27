package sg.bigo.ads.S;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class f implements sg.bigo.ads.T.b {
    public static final f i = new f();

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.T.c f12530a = new sg.bigo.ads.T.c();
    public final LinkedHashSet b = new LinkedHashSet();
    public final HashMap c = new HashMap();
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;

    public final boolean a(Context context) {
        if (!this.g) {
            return false;
        }
        boolean z = true;
        if (this.f || this.e) {
            return true;
        }
        this.e = true;
        sg.bigo.ads.T.c cVar = this.f12530a;
        cVar.c = this;
        if (cVar.b == null) {
            sg.bigo.ads.T.d a2 = sg.bigo.ads.T.e.a(context);
            if (a2 == null || !a2.f12544a) {
                z = false;
            } else {
                sg.bigo.ads.T.f fVar = new sg.bigo.ads.T.f(cVar);
                cVar.getClass();
                z = CustomTabsClient.bindCustomTabsService(context, a2.e, fVar);
            }
        }
        if (!z) {
            this.e = false;
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 < 3) {
                this.g = false;
            }
        }
        return z;
    }

    public final void a() {
        String str;
        Iterator it;
        if (!this.f) {
            this.h = false;
            return;
        }
        try {
            it = this.b.iterator();
        } catch (Exception unused) {
            str = null;
        }
        if (!it.hasNext()) {
            this.h = false;
            return;
        }
        this.h = true;
        str = (String) it.next();
        try {
            this.b.remove(str);
        } catch (Exception unused2) {
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC5446j.a(1, null, new e(this, str), 0L);
    }
}
