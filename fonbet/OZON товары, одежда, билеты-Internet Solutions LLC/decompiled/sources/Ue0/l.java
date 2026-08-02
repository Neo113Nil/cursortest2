package Ue0;

import android.content.Context;
import com.yandex.mapkit.mapview.MapView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class l extends AbstractC7737t implements Function0<MapView> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(h hVar) {
        super(0);
        this.f27699b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MapView invoke() {
        Context context;
        context = this.f27699b.f27678b;
        return new MapView(context);
    }
}
