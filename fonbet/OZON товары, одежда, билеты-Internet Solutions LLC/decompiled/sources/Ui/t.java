package Ui;

import Ki.b;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class t extends AbstractC7737t implements Function1<b.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4069c f27820b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f27821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(C4069c c4069c, boolean z11) {
        super(1);
        this.f27820b = c4069c;
        this.f27821c = z11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(b.a aVar) {
        b.a requestPermission = aVar;
        Intrinsics.checkNotNullParameter(requestPermission, "$this$requestPermission");
        C4069c c4069c = this.f27820b;
        String[] strArr = (String[]) c4069c.d0().C0().getValue().toArray(new String[0]);
        requestPermission.d((String[]) Arrays.copyOf(strArr, strArr.length));
        requestPermission.c(new q(c4069c));
        requestPermission.e(this.f27821c, new r(c4069c));
        requestPermission.b(new s(c4069c));
        return Unit.f71690a;
    }
}
