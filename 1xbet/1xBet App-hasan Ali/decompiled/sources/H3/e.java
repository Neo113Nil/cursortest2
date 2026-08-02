package H3;

import android.net.Uri;
import com.google.android.gms.internal.ads.JB;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements q {

    /* renamed from: k, reason: collision with root package name */
    public final String f2317k;

    public /* synthetic */ e(String str) {
        this.f2317k = str;
    }

    public String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f2317k).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // H3.q
    public Object k() {
        throw new F3.p(this.f2317k);
    }

    public e() {
        this.f2317k = (String) JB.f9907t.s();
    }
}
