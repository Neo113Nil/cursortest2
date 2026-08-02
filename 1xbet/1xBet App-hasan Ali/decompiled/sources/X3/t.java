package X3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class t implements n4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6088b;

    public /* synthetic */ t(int i, Object obj) {
        this.f6087a = i;
        this.f6088b = obj;
    }

    @Override // n4.g
    public final Iterator iterator() {
        switch (this.f6087a) {
            case 0:
                return ((Iterable) this.f6088b).iterator();
            default:
                return (Iterator) this.f6088b;
        }
    }
}
