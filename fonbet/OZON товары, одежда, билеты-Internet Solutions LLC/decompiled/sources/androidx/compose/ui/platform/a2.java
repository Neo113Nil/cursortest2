package androidx.compose.ui.platform;

import androidx.lifecycle.AbstractC5434v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class a2 extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f40814b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Z1 f40815c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a2(AbstractC5434v abstractC5434v, Z1 z12) {
        super(0);
        this.f40814b = abstractC5434v;
        this.f40815c = z12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f40814b.e(this.f40815c);
        return Unit.f71690a;
    }
}
