package Ci0;

import Sd0.h;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.tracker.debug.menu.presentation.TrackerDebugMenuActivity;

/* loaded from: classes3.dex */
final class a extends AbstractC7737t implements Function1<Td0.c, Intent> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f5110b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Rd0.a f5111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f fVar, Rd0.a aVar) {
        super(1);
        this.f5110b = fVar;
        this.f5111c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Intent invoke(Td0.c cVar) {
        Td0.c request = cVar;
        Intrinsics.checkNotNullParameter(request, "request");
        Context t2 = this.f5111c.t();
        h a11 = request.a();
        Uri c11 = a11 != null ? a11.c() : null;
        this.f5110b.getClass();
        Intent intent = new Intent(t2, (Class<?>) TrackerDebugMenuActivity.class);
        intent.setData(c11);
        return intent;
    }
}
