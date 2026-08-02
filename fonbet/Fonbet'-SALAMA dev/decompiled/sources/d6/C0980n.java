package d6;

import U5.AbstractC0438e;

/* renamed from: d6.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0980n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12451a;

    /* renamed from: b, reason: collision with root package name */
    public final C0981o f12452b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0438e f12453c;

    public C0980n(C0981o c0981o, AbstractC0438e abstractC0438e, int i7) {
        this.f12451a = i7;
        switch (i7) {
            case 1:
                p3.f.d("success rate ejection config is null", c0981o.f12458e != null);
                this.f12452b = c0981o;
                this.f12453c = abstractC0438e;
                break;
            default:
                this.f12452b = c0981o;
                this.f12453c = abstractC0438e;
                break;
        }
    }
}
