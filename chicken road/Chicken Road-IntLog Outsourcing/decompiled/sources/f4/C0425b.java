package f4;

import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0425b implements InterfaceC1218d {

    /* renamed from: a, reason: collision with root package name */
    public R4.o f5661a;

    /* renamed from: b, reason: collision with root package name */
    public v f5662b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1218d f5663c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5664d;

    @Override // k4.InterfaceC1218d
    public final InterfaceC1223i getContext() {
        return C1224j.f10720a;
    }

    @Override // k4.InterfaceC1218d
    public final void resumeWith(Object obj) {
        this.f5663c = null;
        this.f5664d = obj;
    }
}
