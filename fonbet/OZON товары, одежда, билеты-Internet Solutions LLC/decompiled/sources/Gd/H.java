package Gd;

import Gd.I;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
final class H implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final I f9953a;

    /* renamed from: b, reason: collision with root package name */
    private final Fd.k f9954b;

    public H(Fd.k kVar, I i11) {
        this.f9953a = i11;
        this.f9954b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return I.G(this.f9953a, this.f9954b, (I.a) obj);
    }
}
