package Ue0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class j extends AbstractC7737t implements Function0<we0.x> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(h hVar) {
        super(0);
        this.f27697b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final we0.x invoke() {
        h hVar = this.f27697b;
        return new we0.x(hVar.getContentView().getWidth(), hVar.getContentView().getHeight());
    }
}
