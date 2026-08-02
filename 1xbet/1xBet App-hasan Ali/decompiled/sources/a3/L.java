package a3;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1392ol;
import com.google.android.gms.internal.ads.InterfaceC0764aj;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class L implements InterfaceC0764aj {

    /* renamed from: k, reason: collision with root package name */
    public final C1392ol f6508k;

    /* renamed from: l, reason: collision with root package name */
    public final K f6509l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6510m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6511n;

    public L(C1392ol c1392ol, K k5, String str, int i) {
        this.f6508k = c1392ol;
        this.f6509l = k5;
        this.f6510m = str;
        this.f6511n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void b(u uVar) {
        String str;
        if (uVar == null || this.f6511n == 2) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(uVar.f6622c);
        C1392ol c1392ol = this.f6508k;
        K k5 = this.f6509l;
        if (isEmpty) {
            k5.b(this.f6510m, uVar.f6621b, c1392ol);
            return;
        }
        try {
            str = new JSONObject(uVar.f6622c).optString("request_id");
        } catch (JSONException e3) {
            P2.o.f4767B.f4774g.i("RenderSignals.getRequestId", e3);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        k5.b(str, uVar.f6622c, c1392ol);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0764aj
    public final void a(String str) {
    }
}
