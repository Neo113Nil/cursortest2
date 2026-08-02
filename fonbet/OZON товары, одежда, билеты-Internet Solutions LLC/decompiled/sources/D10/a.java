package D10;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import m10.C8042d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a extends GridLayoutManager.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8042d f5593a;

    public a(@NotNull C8042d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f5593a = adapter;
        setSpanIndexCacheEnabled(true);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int getSpanSize(int i11) {
        if (i11 < 0) {
            return 0;
        }
        C8042d c8042d = this.f5593a;
        if (i11 < c8042d.getCardsCount()) {
            return c8042d.h(i11).p().a();
        }
        return 0;
    }
}
