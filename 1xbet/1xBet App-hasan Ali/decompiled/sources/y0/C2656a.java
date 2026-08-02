package y0;

import v.AbstractC2529y;
import w0.AbstractC2540a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2656a extends AbstractC2529y {

    /* renamed from: a, reason: collision with root package name */
    public e f21127a;

    @Override // v.AbstractC2529y
    public final boolean b(g gVar) {
        return gVar == this.f21127a.getKey();
    }

    @Override // v.AbstractC2529y
    public final Object d(g gVar) {
        if (gVar != this.f21127a.getKey()) {
            AbstractC2540a.b("Check failed.");
        }
        return this.f21127a.getValue();
    }
}
