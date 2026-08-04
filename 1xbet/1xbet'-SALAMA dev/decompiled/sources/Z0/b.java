package Z0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.functions.Function1;
import p044f6.i;
import t6.g;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends g implements Function1 {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((f) this.f16462b).accept(windowLayoutInfo);
        return i.f13014a;
    }
}
