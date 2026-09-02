package C;

import U0.l;
import androidx.window.extensions.layout.WindowLayoutInfo;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends i implements l {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // U0.l
    public final Object invoke(Object obj) {
        WindowLayoutInfo p02 = (WindowLayoutInfo) obj;
        j.e(p02, "p0");
        ((f) this.receiver).accept(p02);
        return K0.i.f206a;
    }
}
