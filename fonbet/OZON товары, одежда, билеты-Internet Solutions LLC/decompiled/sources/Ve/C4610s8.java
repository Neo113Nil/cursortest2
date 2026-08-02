package Ve;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.s8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4610s8 extends U8 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f32030a;

    public C4610s8(ArrayList arrayList) {
        this.f32030a = arrayList;
    }

    @Override // Ve.U8
    public final List a() {
        return this.f32030a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4610s8) && Intrinsics.d(this.f32030a, ((C4610s8) obj).f32030a);
    }

    public final int hashCode() {
        return this.f32030a.hashCode();
    }

    public final String toString() {
        return "YesCardsYesHelpers(bannerData=" + this.f32030a + ")";
    }
}
