package F4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class B<T> implements androidx.recyclerview.widget.u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f8768a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K f8769b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.recyclerview.widget.u f8770c;

    /* renamed from: d, reason: collision with root package name */
    private int f8771d;

    /* renamed from: e, reason: collision with root package name */
    private int f8772e;

    /* renamed from: f, reason: collision with root package name */
    private int f8773f;

    /* renamed from: g, reason: collision with root package name */
    private int f8774g;

    /* renamed from: h, reason: collision with root package name */
    private int f8775h;

    public B(@NotNull K oldList, @NotNull K newList, @NotNull androidx.recyclerview.widget.u callback) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f8768a = oldList;
        this.f8769b = newList;
        this.f8770c = callback;
        this.f8771d = oldList.k();
        this.f8772e = oldList.i();
        this.f8773f = oldList.n();
        this.f8774g = 1;
        this.f8775h = 1;
    }

    public final void a() {
        K k11 = this.f8768a;
        int min = Math.min(k11.k(), this.f8771d);
        K k12 = this.f8769b;
        int k13 = k12.k() - this.f8771d;
        androidx.recyclerview.widget.u uVar = this.f8770c;
        if (k13 > 0) {
            if (min > 0) {
                uVar.onChanged(0, min, EnumC3030j.PLACEHOLDER_POSITION_CHANGE);
            }
            uVar.onInserted(0, k13);
        } else if (k13 < 0) {
            uVar.onRemoved(0, -k13);
            int i11 = min + k13;
            if (i11 > 0) {
                uVar.onChanged(0, i11, EnumC3030j.PLACEHOLDER_POSITION_CHANGE);
            }
        }
        this.f8771d = k12.k();
        int min2 = Math.min(k11.i(), this.f8772e);
        int i12 = k12.i();
        int i13 = this.f8772e;
        int i14 = i12 - i13;
        int i15 = this.f8771d + this.f8773f + i13;
        int i16 = i15 - min2;
        boolean z11 = i16 != k11.getSize() - min2;
        if (i14 > 0) {
            uVar.onInserted(i15, i14);
        } else if (i14 < 0) {
            uVar.onRemoved(i15 + i14, -i14);
            min2 += i14;
        }
        if (min2 > 0 && z11) {
            uVar.onChanged(i16, min2, EnumC3030j.PLACEHOLDER_POSITION_CHANGE);
        }
        this.f8772e = k12.i();
    }

    @Override // androidx.recyclerview.widget.u
    public final void onChanged(int i11, int i12, Object obj) {
        this.f8770c.onChanged(i11 + this.f8771d, i12, obj);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onInserted(int i11, int i12) {
        int i13 = this.f8773f;
        androidx.recyclerview.widget.u uVar = this.f8770c;
        if (i11 >= i13 && this.f8775h != 2) {
            int min = Math.min(i12, this.f8772e);
            if (min > 0) {
                this.f8775h = 3;
                uVar.onChanged(this.f8771d + i11, min, EnumC3030j.PLACEHOLDER_TO_ITEM);
                this.f8772e -= min;
            }
            int i14 = i12 - min;
            if (i14 > 0) {
                uVar.onInserted(i11 + min + this.f8771d, i14);
            }
        } else if (i11 <= 0 && this.f8774g != 2) {
            int min2 = Math.min(i12, this.f8771d);
            if (min2 > 0) {
                this.f8774g = 3;
                uVar.onChanged((0 - min2) + this.f8771d, min2, EnumC3030j.PLACEHOLDER_TO_ITEM);
                this.f8771d -= min2;
            }
            int i15 = i12 - min2;
            if (i15 > 0) {
                uVar.onInserted(this.f8771d, i15);
            }
        } else {
            uVar.onInserted(i11 + this.f8771d, i12);
        }
        this.f8773f += i12;
    }

    @Override // androidx.recyclerview.widget.u
    public final void onMoved(int i11, int i12) {
        int i13 = this.f8771d;
        this.f8770c.onMoved(i11 + i13, i12 + i13);
    }

    @Override // androidx.recyclerview.widget.u
    public final void onRemoved(int i11, int i12) {
        int i13;
        int i14 = i11 + i12;
        int i15 = this.f8773f;
        androidx.recyclerview.widget.u uVar = this.f8770c;
        K k11 = this.f8769b;
        if (i14 >= i15 && this.f8775h != 3) {
            int min = Math.min(k11.i() - this.f8772e, i12);
            i13 = min >= 0 ? min : 0;
            int i16 = i12 - i13;
            if (i13 > 0) {
                this.f8775h = 2;
                uVar.onChanged(this.f8771d + i11, i13, EnumC3030j.ITEM_TO_PLACEHOLDER);
                this.f8772e += i13;
            }
            if (i16 > 0) {
                uVar.onRemoved(i11 + i13 + this.f8771d, i16);
            }
        } else if (i11 <= 0 && this.f8774g != 3) {
            int min2 = Math.min(k11.k() - this.f8771d, i12);
            i13 = min2 >= 0 ? min2 : 0;
            int i17 = i12 - i13;
            if (i17 > 0) {
                uVar.onRemoved(this.f8771d, i17);
            }
            if (i13 > 0) {
                this.f8774g = 2;
                uVar.onChanged(this.f8771d, i13, EnumC3030j.ITEM_TO_PLACEHOLDER);
                this.f8771d += i13;
            }
        } else {
            uVar.onRemoved(i11 + this.f8771d, i12);
        }
        this.f8773f -= i12;
    }
}
