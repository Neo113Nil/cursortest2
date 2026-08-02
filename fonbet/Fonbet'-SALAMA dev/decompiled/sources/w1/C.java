package w1;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class C extends G2 {

    /* renamed from: A, reason: collision with root package name */
    public G f17297A;

    /* renamed from: B, reason: collision with root package name */
    public F0 f17298B;

    /* renamed from: C, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f17299C;

    /* renamed from: D, reason: collision with root package name */
    public C1757x f17300D;

    /* renamed from: E, reason: collision with root package name */
    public AtomicBoolean f17301E;

    public final boolean j() {
        Map map;
        boolean z4 = this.f17301E.get();
        G g3 = this.f17297A;
        return z4 && (g3 != null && (map = g3.f17381a) != null && map.size() > 0);
    }
}
