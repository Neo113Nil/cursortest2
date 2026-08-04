package p155w1;

import com.google.android.gms.common.internal.w;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class C extends G2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public G f17303A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public F0 f17304B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public w f17305C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public C1048x f17306D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AtomicBoolean f17307E;

    public final boolean j() {
        Map map;
        boolean z4 = this.f17307E.get();
        G g3 = this.f17303A;
        return z4 && (g3 != null && (map = g3.f17387a) != null && map.size() > 0);
    }
}
