package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ec, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4210ec extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Zb f30924a;

    public C4210ec(Zb item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f30924a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4210ec) && Intrinsics.d(this.f30924a, ((C4210ec) obj).f30924a);
    }

    public final int hashCode() {
        return this.f30924a.hashCode();
    }

    public final String toString() {
        return "OnCloseHintClickEvent(item=" + this.f30924a + ")";
    }
}
