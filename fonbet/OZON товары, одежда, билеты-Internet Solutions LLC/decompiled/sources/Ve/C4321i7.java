package Ve;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.i7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4321i7 extends U8 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31271a;

    public C4321i7(ArrayList arrayList) {
        this.f31271a = arrayList;
    }

    @Override // Ve.U8
    public final List a() {
        return this.f31271a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4321i7) && Intrinsics.d(this.f31271a, ((C4321i7) obj).f31271a);
    }

    public final int hashCode() {
        return this.f31271a.hashCode();
    }

    public final String toString() {
        return "NoCardsYesHelpers(bannerData=" + this.f31271a + ")";
    }
}
