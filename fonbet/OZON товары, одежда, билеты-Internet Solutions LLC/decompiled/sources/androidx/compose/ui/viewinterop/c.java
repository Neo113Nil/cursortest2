package androidx.compose.ui.viewinterop;

import androidx.compose.ui.e;
import c2.C5730d;
import j1.m;
import j1.o;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class c extends e.c implements o {
    @Override // j1.o
    public final void y0(@NotNull m mVar) {
        mVar.a(getNode().isAttached() && C5730d.c(this).hasFocusable());
    }
}
