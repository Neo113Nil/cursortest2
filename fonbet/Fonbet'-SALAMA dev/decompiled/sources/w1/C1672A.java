package w1;

import java.util.Collections;

/* renamed from: w1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1672A extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f17268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f17269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1763z f17270c;

    public C1672A(C1763z c1763z, boolean z4, String str) {
        this.f17270c = c1763z;
        this.f17268a = z4;
        this.f17269b = str;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        C1763z c1763z = this.f17270c;
        c1763z.f17939b.f17300D.h();
        C c3 = c1763z.f17939b;
        C1757x c1757x = c3.f17300D;
        if (this.f17268a == c1757x.f17915A && this.f17269b.equals(c1757x.f17917z)) {
            return;
        }
        Collections.emptyMap();
        c3.getClass();
        c3.d(new C1763z(c3, 2));
    }
}
