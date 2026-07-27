package A4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97b;

    public /* synthetic */ h(int i2, Object obj) {
        this.f96a = i2;
        this.f97b = obj;
    }

    @Override // A4.f
    public final Iterator iterator() {
        switch (this.f96a) {
            case 0:
                return (Iterator) this.f97b;
            default:
                return ((Iterable) this.f97b).iterator();
        }
    }
}
