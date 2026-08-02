package Ve;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.r7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4580r7 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31958b;

    public C4580r7(int i11, ArrayList cardsList) {
        Intrinsics.checkNotNullParameter(cardsList, "cardsList");
        this.f31957a = cardsList;
        this.f31958b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4580r7)) {
            return false;
        }
        C4580r7 c4580r7 = (C4580r7) obj;
        return Intrinsics.d(this.f31957a, c4580r7.f31957a) && this.f31958b == c4580r7.f31958b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31958b) + (this.f31957a.hashCode() * 31);
    }

    public final String toString() {
        return "CardsListData(cardsList=" + this.f31957a + ", selectedCardPosition=" + this.f31958b + ")";
    }
}
