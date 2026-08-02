package Ue0;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class i extends AbstractC7737t implements Function0<c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(h hVar) {
        super(0);
        this.f27696b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        Context context;
        h hVar = this.f27696b;
        context = hVar.f27678b;
        return new c(context, hVar.getContentView());
    }
}
