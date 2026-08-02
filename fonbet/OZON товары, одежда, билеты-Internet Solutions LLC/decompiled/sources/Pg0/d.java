package Pg0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class d extends AbstractC7737t implements Function0<Tg0.a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f22540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(Application application) {
        super(0);
        this.f22540b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Tg0.a invoke() {
        return new Tg0.a(this.f22540b);
    }
}
