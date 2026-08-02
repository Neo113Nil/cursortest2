package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J20.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3374d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.b f13711b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f13712c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3374d(a.b bVar, Context context) {
        super(0);
        this.f13711b = bVar;
        this.f13712c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f13711b.a().invoke(this.f13712c);
        return Unit.f71690a;
    }
}
