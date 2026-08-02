package Xc0;

import androidx.lifecycle.x0;
import jc0.C7340c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class f extends AbstractC7737t implements Function0<C7340c> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f34358b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(d dVar) {
        super(0);
        this.f34358b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C7340c invoke() {
        Function1 function1;
        d dVar = this.f34358b;
        function1 = dVar.f34305d;
        return (C7340c) function1.invoke(x0.a(dVar));
    }
}
