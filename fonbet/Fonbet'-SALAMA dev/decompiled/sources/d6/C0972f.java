package d6;

import U5.C0447n;
import U5.M;

/* renamed from: d6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0972f implements M {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12423a;

    /* renamed from: b, reason: collision with root package name */
    public final M f12424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0968b f12425c;

    public /* synthetic */ C0972f(AbstractC0968b abstractC0968b, M m7, int i7) {
        this.f12423a = i7;
        this.f12425c = abstractC0968b;
        this.f12424b = m7;
    }

    @Override // U5.M
    public final void a(C0447n c0447n) {
        switch (this.f12423a) {
            case 0:
                this.f12424b.a(c0447n);
                ((C0973g) this.f12425c).f12427b.a(c0447n);
                break;
            default:
                C0985s c0985s = (C0985s) this.f12425c;
                c0985s.f12469d = c0447n;
                if (!c0985s.f12468c) {
                    this.f12424b.a(c0447n);
                    break;
                }
                break;
        }
    }
}
