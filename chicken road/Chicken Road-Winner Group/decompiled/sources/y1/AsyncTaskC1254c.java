package y1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import o1.i;
import org.json.JSONObject;
import s1.C1196c;
import s1.C1202i;
import v1.AbstractC1217a;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC1254c extends AbstractAsyncTaskC1252a {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10585c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f10586d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10587e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskC1254c(V1.b bVar, HashSet hashSet, JSONObject jSONObject, long j3, int i3) {
        super(bVar);
        this.f = i3;
        this.f10585c = new HashSet(hashSet);
        this.f10586d = jSONObject;
        this.f10587e = j3;
    }

    @Override // y1.AbstractAsyncTaskC1252a
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C1196c c1196c;
        switch (this.f) {
            case 0:
                C1196c c1196c2 = C1196c.f10320c;
                if (c1196c2 != null) {
                    for (i iVar : Collections.unmodifiableCollection(c1196c2.f10321a)) {
                        if (this.f10585c.contains(iVar.f10174h)) {
                            AbstractC1217a abstractC1217a = iVar.f10172e;
                            if (this.f10587e >= abstractC1217a.f && abstractC1217a.f10410e != 3) {
                                abstractC1217a.f10410e = 3;
                                C1202i.f10332a.a(abstractC1217a.g(), "setNativeViewHierarchy", str, abstractC1217a.f10406a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (c1196c = C1196c.f10320c) != null) {
                    for (i iVar2 : Collections.unmodifiableCollection(c1196c.f10321a)) {
                        if (this.f10585c.contains(iVar2.f10174h)) {
                            AbstractC1217a abstractC1217a2 = iVar2.f10172e;
                            if (this.f10587e >= abstractC1217a2.f) {
                                abstractC1217a2.f10410e = 2;
                                C1202i.f10332a.a(abstractC1217a2.g(), "setNativeViewHierarchy", str, abstractC1217a2.f10406a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f) {
            case 0:
                return this.f10586d.toString();
            default:
                V1.b bVar = this.f10584b;
                JSONObject jSONObject = (JSONObject) bVar.f1614b;
                JSONObject jSONObject2 = this.f10586d;
                if (w1.b.f(jSONObject2, jSONObject)) {
                    return null;
                }
                bVar.f1614b = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // y1.AbstractAsyncTaskC1252a, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
