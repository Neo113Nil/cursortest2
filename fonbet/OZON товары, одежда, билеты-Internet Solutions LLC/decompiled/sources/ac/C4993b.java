package ac;

import B4.V;
import androidx.annotation.NonNull;

/* renamed from: ac.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C4993b extends Hf.f {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f36546f;

    public C4993b(boolean z11) {
        this.f36546f = z11;
    }

    public final boolean n() {
        return this.f36546f;
    }

    @Override // Hf.u
    @NonNull
    public final String toString() {
        return V.d(new StringBuilder("TaskListItem{isDone="), this.f36546f, '}');
    }
}
