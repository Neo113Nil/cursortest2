package Df0;

import Oa.c;
import android.app.Application;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function1<c.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f6688b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f6689c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Application f6690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(g gVar, String str, Application application) {
        super(1);
        this.f6688b = gVar;
        this.f6689c = str;
        this.f6690d = application;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(c.a aVar) {
        c.a Build = aVar;
        Intrinsics.checkNotNullParameter(Build, "$this$Build");
        Build.b(new b(this.f6688b, this.f6689c, this.f6690d));
        return Unit.f71690a;
    }
}
