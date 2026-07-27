package z2;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class a extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public A2.n f10700d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10701e;
    public final /* synthetic */ io.flutter.plugin.editing.k f;

    /* renamed from: g, reason: collision with root package name */
    public int f10702g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(io.flutter.plugin.editing.k kVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = kVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10701e = obj;
        this.f10702g |= Integer.MIN_VALUE;
        return this.f.l(null, this);
    }
}
