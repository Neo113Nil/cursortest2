package Ue0;

import com.yandex.mapkit.mapview.MapView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class u extends AbstractC7737t implements Function0<z> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(h hVar) {
        super(0);
        this.f27708b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final z invoke() {
        MapView mapView = this.f27708b.getContentView();
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        return new z();
    }
}
