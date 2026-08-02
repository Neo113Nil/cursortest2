package P2;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzddb;
import com.google.android.gms.internal.ads.zzdqk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class M implements zzddb {

    /* renamed from: a, reason: collision with root package name */
    public final zzdqk f5452a;

    /* renamed from: b, reason: collision with root package name */
    public final L f5453b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5454c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5455d;

    public M(zzdqk zzdqkVar, L l7, String str, int i7) {
        this.f5452a = zzdqkVar;
        this.f5453b = l7;
        this.f5454c = str;
        this.f5455d = i7;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zze(v vVar) {
        String str;
        if (vVar == null || this.f5455d == 2) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(vVar.f5565c);
        zzdqk zzdqkVar = this.f5452a;
        L l7 = this.f5453b;
        if (isEmpty) {
            l7.b(this.f5454c, vVar.f5564b, zzdqkVar);
            return;
        }
        try {
            str = new JSONObject(vVar.f5565c).optString("request_id");
        } catch (JSONException e7) {
            E2.o.f1952C.f1961g.zzw(e7, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l7.b(str, vVar.f5565c, zzdqkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
    }
}
