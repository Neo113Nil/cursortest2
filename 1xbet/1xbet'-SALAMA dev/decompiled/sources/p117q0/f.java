package p117q0;

import android.os.Bundle;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.List;
import p096n1.e;
import p122r.b;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f15738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bundle f15740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f15741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f15742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, String str, h hVar, String str2, Bundle bundle, Bundle bundle2) {
        super(str);
        this.f15742i = sVar;
        this.f15738e = hVar;
        this.f15739f = str2;
        this.f15740g = bundle;
        this.f15741h = bundle2;
    }

    @Override // p117q0.n
    public final void c(Object obj) {
        List list = (List) obj;
        b bVar = this.f15742i.f15787e;
        h hVar = this.f15738e;
        e eVar = hVar.f15748d;
        Object orDefault = bVar.getOrDefault(((Messenger) eVar.f15314b).getBinder(), null);
        String str = hVar.f15745a;
        String str2 = this.f15739f;
        if (orDefault != hVar) {
            if (s.f15782y) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + str + " id=" + str2);
                return;
            }
            return;
        }
        try {
            eVar.y(str2, list, this.f15740g, this.f15741h);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + str2 + " package=" + str);
        }
    }
}
