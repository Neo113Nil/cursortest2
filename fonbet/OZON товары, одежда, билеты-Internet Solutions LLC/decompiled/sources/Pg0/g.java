package Pg0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class g extends AbstractC7737t implements Function0<Og0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f22543b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Application application) {
        super(0);
        this.f22543b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Og0.a invoke() {
        return new Og0.a(m.a(this.f22543b));
    }
}
