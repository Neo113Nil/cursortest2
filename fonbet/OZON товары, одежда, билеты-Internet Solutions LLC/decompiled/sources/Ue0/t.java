package Ue0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class t extends AbstractC7737t implements Function0<y> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(h hVar) {
        super(0);
        this.f27707b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final y invoke() {
        return new y(this.f27707b.getContentView());
    }
}
