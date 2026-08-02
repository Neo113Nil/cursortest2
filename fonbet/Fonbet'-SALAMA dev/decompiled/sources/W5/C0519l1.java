package W5;

import U5.AbstractC0457y;
import U5.EnumC0446m;

/* renamed from: W5.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0519l1 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0457y f7273a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC0446m f7274b;

    /* renamed from: c, reason: collision with root package name */
    public final C0510i1 f7275c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7276d;

    public C0519l1(AbstractC0457y abstractC0457y, C0510i1 c0510i1) {
        EnumC0446m enumC0446m = EnumC0446m.f6553d;
        this.f7276d = false;
        this.f7273a = abstractC0457y;
        this.f7274b = enumC0446m;
        this.f7275c = c0510i1;
    }

    public static void a(C0519l1 c0519l1, EnumC0446m enumC0446m) {
        c0519l1.f7274b = enumC0446m;
        if (enumC0446m == EnumC0446m.f6551b || enumC0446m == EnumC0446m.f6552c) {
            c0519l1.f7276d = true;
        } else if (enumC0446m == EnumC0446m.f6553d) {
            c0519l1.f7276d = false;
        }
    }
}
