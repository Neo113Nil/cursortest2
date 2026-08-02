package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class R0 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f40731b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ M4.c f40732c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f40733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R0(boolean z11, M4.c cVar, String str) {
        super(0);
        this.f40731b = z11;
        this.f40732c = cVar;
        this.f40733d = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f40731b) {
            this.f40732c.i(this.f40733d);
        }
        return Unit.f71690a;
    }
}
