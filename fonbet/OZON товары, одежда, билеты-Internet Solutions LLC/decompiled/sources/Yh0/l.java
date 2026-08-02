package Yh0;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class l extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f35102b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Activity f35103c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(n nVar, Activity activity) {
        super(0);
        this.f35102b = nVar;
        this.f35103c = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        n.e(this.f35102b, this.f35103c);
        return Unit.f71690a;
    }
}
