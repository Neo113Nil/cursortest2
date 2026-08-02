package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J20.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3377g extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a.c f13715b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Context f13716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3377g(a.c cVar, Context context) {
        super(0);
        this.f13715b = cVar;
        this.f13716c = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f13715b.a().invoke(this.f13716c);
        return Unit.f71690a;
    }
}
