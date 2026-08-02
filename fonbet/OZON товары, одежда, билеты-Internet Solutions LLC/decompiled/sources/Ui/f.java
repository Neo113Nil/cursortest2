package Ui;

import h3.C6788a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;
import xe.B0;
import xe.C10727i;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<B0> f27778b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C6788a f27779c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f27780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(M m11, C6788a c6788a, Function0 function0) {
        super(0);
        this.f27778b = m11;
        this.f27779c = c6788a;
        this.f27780d = function0;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T, xe.B0] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        M<B0> m11 = this.f27778b;
        B0 b02 = m11.f71787a;
        if (b02 != null) {
            b02.j(null);
        }
        m11.f71787a = C10727i.c(this.f27779c, null, null, new e(this.f27780d, null), 3);
        return Unit.f71690a;
    }
}
