package Yf0;

import android.app.Application;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class g extends AbstractC7737t implements Function0<c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Application f35013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(Application application) {
        super(0);
        this.f35013b = application;
    }

    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        return new c(this.f35013b);
    }
}
