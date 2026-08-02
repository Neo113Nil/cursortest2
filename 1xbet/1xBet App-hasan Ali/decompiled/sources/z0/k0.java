package z0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class k0 implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final k0 f21836l = new k0(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21837k;

    public /* synthetic */ k0(int i) {
        this.f21837k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21837k) {
            case 0:
                C2731G c2731g = (C2731G) obj;
                C2731G c2731g2 = (C2731G) obj2;
                int g5 = kotlin.jvm.internal.l.g(c2731g2.f21638y, c2731g.f21638y);
                return g5 != 0 ? g5 : kotlin.jvm.internal.l.g(c2731g.hashCode(), c2731g2.hashCode());
            default:
                C2731G c2731g3 = (C2731G) obj;
                C2731G c2731g4 = (C2731G) obj2;
                int g6 = kotlin.jvm.internal.l.g(c2731g3.f21638y, c2731g4.f21638y);
                return g6 != 0 ? g6 : kotlin.jvm.internal.l.g(c2731g3.hashCode(), c2731g4.hashCode());
        }
    }
}
