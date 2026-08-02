package We0;

import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class d extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Pair<PlacemarkMapObject, PlacemarkAnimation> f33830b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    d(Pair<? extends PlacemarkMapObject, ? extends PlacemarkAnimation> pair) {
        super(0);
        this.f33830b = pair;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f33830b.f().play();
        return Unit.f71690a;
    }
}
