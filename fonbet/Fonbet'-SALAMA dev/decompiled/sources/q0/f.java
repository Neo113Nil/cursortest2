package q0;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import n1.C1450e;

/* loaded from: classes.dex */
public final class f extends n {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f15734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f15735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f15736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, String str, h hVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.f15736i = sVar;
        this.f15732e = hVar;
        this.f15733f = str2;
        this.f15734g = bundle;
        this.f15735h = bundle2;
    }

    @Override // q0.n
    public final void c(Object obj) {
        List list = (List) obj;
        r.b bVar = this.f15736i.f15781e;
        h hVar = this.f15732e;
        C1450e c1450e = hVar.f15742d;
        Object orDefault = bVar.getOrDefault(((Messenger) c1450e.f15308b).getBinder(), null);
        String str = hVar.f15739a;
        String str2 = this.f15733f;
        if (orDefault != hVar) {
            if (s.f15776y) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        try {
            c1450e.y(str2, list, this.f15734g, this.f15735h);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
