package J20;

import S20.a;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class w extends AbstractC7737t implements Function1<String, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f13740b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a.h f13741c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f13742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    w(Function1<? super String, Unit> function1, a.h hVar, Context context) {
        super(1);
        this.f13740b = function1;
        this.f13741c = hVar;
        this.f13742d = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        a.h hVar = this.f13741c;
        this.f13740b.invoke(hVar.g());
        Function2<String, Context, Unit> e11 = hVar.e();
        if (e11 != null) {
            e11.invoke(hVar.g(), this.f13742d);
        }
        return Unit.f71690a;
    }
}
