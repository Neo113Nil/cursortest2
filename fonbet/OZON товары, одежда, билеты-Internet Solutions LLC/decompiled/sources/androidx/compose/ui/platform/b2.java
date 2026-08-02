package androidx.compose.ui.platform;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class b2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.platform.Z1, androidx.lifecycle.I] */
    public static final Function0 a(final AbstractC5228a abstractC5228a, AbstractC5434v abstractC5434v) {
        if (abstractC5434v.b().compareTo(AbstractC5434v.b.DESTROYED) > 0) {
            ?? r02 = new androidx.lifecycle.G() { // from class: androidx.compose.ui.platform.Z1
                @Override // androidx.lifecycle.G
                public final void onStateChanged(androidx.lifecycle.J j11, AbstractC5434v.a aVar) {
                    if (aVar == AbstractC5434v.a.ON_DESTROY) {
                        AbstractC5228a.this.disposeComposition();
                    }
                }
            };
            abstractC5434v.a(r02);
            return new a2(abstractC5434v, r02);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC5228a + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC5434v + "is already destroyed").toString());
    }
}
