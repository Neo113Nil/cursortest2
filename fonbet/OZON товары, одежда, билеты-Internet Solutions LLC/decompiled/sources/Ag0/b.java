package Ag0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;

/* loaded from: classes3.dex */
final class b extends AbstractC7737t implements Function1<PlaceholderInfo, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M<PlaceholderInfo> f1200b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(M<PlaceholderInfo> m11) {
        super(1);
        this.f1200b = m11;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object, ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(PlaceholderInfo placeholderInfo) {
        PlaceholderInfo it = placeholderInfo;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f1200b.f71787a = it;
        return Unit.f71690a;
    }
}
