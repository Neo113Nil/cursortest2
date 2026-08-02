package G1;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.collection.C;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C<TypedValue> f9667a = new C<>();

    public final void a() {
        synchronized (this) {
            this.f9667a.d();
            Unit unit = Unit.f71690a;
        }
    }

    @NotNull
    public final TypedValue b(@NotNull Resources resources, int i11) {
        TypedValue c11;
        synchronized (this) {
            c11 = this.f9667a.c(i11);
            if (c11 == null) {
                c11 = new TypedValue();
                resources.getValue(i11, c11, true);
                this.f9667a.h(i11, c11);
            }
        }
        return c11;
    }
}
