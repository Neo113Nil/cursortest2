package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.activity.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5047n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ActivityC5043j f36980b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5047n(ActivityC5043j activityC5043j) {
        super(0);
        this.f36980b = activityC5043j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f36980b.reportFullyDrawn();
        return Unit.f71690a;
    }
}
