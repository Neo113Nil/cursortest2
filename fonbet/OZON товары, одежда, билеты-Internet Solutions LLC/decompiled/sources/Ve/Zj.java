package Ve;

import androidx.recyclerview.widget.i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Zj extends i.b {

    /* renamed from: a, reason: collision with root package name */
    public final C4617sf f30602a;

    /* renamed from: b, reason: collision with root package name */
    public final C4617sf f30603b;

    public Zj(C4617sf oldState, C4617sf newState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.f30602a = oldState;
        this.f30603b = newState;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areContentsTheSame(int i11, int i12) {
        C4617sf c4617sf = this.f30602a;
        Kp kp2 = (Kp) c4617sf.f32049a.get(c4617sf.a(i11));
        Object item = c4617sf.f32050b.get(i11);
        kp2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        C4617sf c4617sf2 = this.f30603b;
        Kp kp3 = (Kp) c4617sf2.f32049a.get(c4617sf2.a(i12));
        Object item2 = c4617sf2.f32050b.get(i12);
        kp3.getClass();
        Intrinsics.checkNotNullParameter(item2, "item");
        return Intrinsics.d(item, item2);
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areItemsTheSame(int i11, int i12) {
        C4617sf c4617sf = this.f30602a;
        Kp kp2 = (Kp) c4617sf.f32049a.get(c4617sf.a(i11));
        Object item = c4617sf.f32050b.get(i11);
        kp2.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Integer a11 = kp2.a(item);
        C4617sf c4617sf2 = this.f30603b;
        Kp kp3 = (Kp) c4617sf2.f32049a.get(c4617sf2.a(i12));
        Object item2 = c4617sf2.f32050b.get(i12);
        kp3.getClass();
        Intrinsics.checkNotNullParameter(item2, "item");
        return a11.equals(kp3.a(item2));
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getNewListSize() {
        return this.f30603b.f32050b.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getOldListSize() {
        return this.f30602a.f32050b.size();
    }
}
