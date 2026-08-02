package Ej;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.ozonLogger.core.e;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f8002a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e.a setUpSelfLogging = (e.a) obj;
        Intrinsics.checkNotNullParameter(setUpSelfLogging, "$this$setUpSelfLogging");
        setUpSelfLogging.a(this.f8002a);
        return Unit.f71690a;
    }
}
