package Ue0;

import com.yandex.mapkit.map.RootMapObjectCollection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class o extends AbstractC7737t implements Function0<RootMapObjectCollection> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f27702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(h hVar) {
        super(0);
        this.f27702b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RootMapObjectCollection invoke() {
        return this.f27702b.getContentView().getMap().getMapObjects();
    }
}
