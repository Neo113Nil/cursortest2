package androidx.compose.ui.platform;

import androidx.collection.AbstractC5144m;
import androidx.collection.C5147p;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class L1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final I1.l f40719a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.D f40720b;

    public L1(@NotNull I1.r rVar, @NotNull AbstractC5144m<M1> abstractC5144m) {
        this.f40719a = rVar.q();
        int i11 = C5147p.f38729b;
        this.f40720b = new androidx.collection.D((Object) null);
        List j11 = I1.r.j(rVar, 4);
        int size = j11.size();
        for (int i12 = 0; i12 < size; i12++) {
            I1.r rVar2 = (I1.r) j11.get(i12);
            if (abstractC5144m.a(rVar2.l())) {
                this.f40720b.b(rVar2.l());
            }
        }
    }

    @NotNull
    public final androidx.collection.D a() {
        return this.f40720b;
    }

    @NotNull
    public final I1.l b() {
        return this.f40719a;
    }
}
