package i2;

import B.v;
import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import v2.t;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245a implements InterfaceC1262r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1247c f13837a;

    public C1245a(C1247c c1247c) {
        this.f13837a = c1247c;
    }

    @Override // i2.InterfaceC1262r
    public final void a() {
        this.f13837a.f13859e.remove(this);
    }

    @Override // i2.InterfaceC1262r
    public final boolean b(Uri uri, v vVar, boolean z4) {
        HashMap hashMap;
        C1246b c1246b;
        C1247c c1247c = this.f13837a;
        if (c1247c.f13852C == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C1257m c1257m = c1247c.f13850A;
            int i7 = t.f17153a;
            List list = c1257m.f13916e;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int size = list.size();
                hashMap = c1247c.f13858d;
                if (i8 >= size) {
                    break;
                }
                C1246b c1246b2 = (C1246b) hashMap.get(((C1256l) list.get(i8)).f13908a);
                if (c1246b2 != null && elapsedRealtime < c1246b2.f13847y) {
                    i9++;
                }
                i8++;
            }
            H2.o oVar = new H2.o(1, 0, c1247c.f13850A.f13916e.size(), i9);
            c1247c.f13857c.getClass();
            Q1.e t7 = M4.e.t(oVar, vVar);
            if (t7 != null && t7.f5785a == 2 && (c1246b = (C1246b) hashMap.get(uri)) != null) {
                C1246b.a(c1246b, t7.f5786b);
            }
        }
        return false;
    }
}
