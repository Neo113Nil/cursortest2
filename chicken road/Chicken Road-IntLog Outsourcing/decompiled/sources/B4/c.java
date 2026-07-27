package B4;

import java.util.Iterator;
import t4.InterfaceC1445p;

/* loaded from: classes.dex */
public final class c implements A4.f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f294a;

    /* renamed from: b, reason: collision with root package name */
    public final int f295b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1445p f297d;

    public c(CharSequence input, int i2, int i3, InterfaceC1445p interfaceC1445p) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f294a = input;
        this.f295b = i2;
        this.f296c = i3;
        this.f297d = interfaceC1445p;
    }

    @Override // A4.f
    public final Iterator iterator() {
        return new b(this);
    }
}
