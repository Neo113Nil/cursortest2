package Z0;

import androidx.window.extensions.layout.WindowLayoutInfo;
import f6.C1116i;
import kotlin.jvm.functions.Function1;
import t6.g;
import t6.h;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends g implements Function1 {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        h.e(windowLayoutInfo, "p0");
        ((f) this.f16456b).accept(windowLayoutInfo);
        return C1116i.f13008a;
    }
}
