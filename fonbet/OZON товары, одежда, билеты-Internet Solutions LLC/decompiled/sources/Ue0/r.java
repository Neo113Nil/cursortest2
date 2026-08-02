package Ue0;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class r extends AbstractC7737t implements Function0<xe0.h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27705b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(h hVar) {
        super(0);
        this.f27705b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final xe0.h invoke() {
        xe0.j jVar;
        jVar = this.f27705b.f27681e;
        return new xe0.h(new WeakReference(jVar));
    }
}
