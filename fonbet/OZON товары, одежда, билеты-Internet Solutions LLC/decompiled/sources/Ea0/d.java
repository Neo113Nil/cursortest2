package Ea0;

import Jb.e;
import Jb.f;
import kb0.EnumC7626a;
import za0.InterfaceC11014a;

/* loaded from: classes3.dex */
public final class d implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f7775a;

    /* renamed from: b, reason: collision with root package name */
    private final f f7776b;

    /* renamed from: c, reason: collision with root package name */
    private final f f7777c;

    public d(f fVar, f fVar2, f fVar3) {
        this.f7775a = fVar;
        this.f7776b = fVar2;
        this.f7777c = fVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new a((Fa0.a) this.f7775a.get(), (EnumC7626a) this.f7776b.get(), (InterfaceC11014a) this.f7777c.get());
    }
}
