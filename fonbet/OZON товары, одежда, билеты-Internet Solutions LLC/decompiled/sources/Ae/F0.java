package Ae;

import Be.AbstractC2630b;
import Be.AbstractC2632d;
import xe.C10737n;

/* loaded from: classes.dex */
public final class F0 extends AbstractC2632d<C0<?>> {

    /* renamed from: a, reason: collision with root package name */
    public long f802a = -1;

    /* renamed from: b, reason: collision with root package name */
    public C10737n f803b;

    @Override // Be.AbstractC2632d
    public final boolean a(AbstractC2630b abstractC2630b) {
        C0 c02 = (C0) abstractC2630b;
        if (this.f802a >= 0) {
            return false;
        }
        this.f802a = c02.z();
        return true;
    }

    @Override // Be.AbstractC2632d
    public final kotlin.coroutines.d[] b(AbstractC2630b abstractC2630b) {
        long j11 = this.f802a;
        this.f802a = -1L;
        this.f803b = null;
        return ((C0) abstractC2630b).y(j11);
    }
}
