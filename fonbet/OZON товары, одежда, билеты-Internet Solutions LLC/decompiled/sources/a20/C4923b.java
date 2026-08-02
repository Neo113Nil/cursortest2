package a20;

import org.jetbrains.annotations.NotNull;

/* renamed from: a20.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4923b implements l20.c {

    /* renamed from: a, reason: collision with root package name */
    private final long f36217a;

    public C4923b(long j11) {
        this.f36217a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4923b) && this.f36217a == ((C4923b) obj).f36217a;
    }

    @Override // l20.c
    public final long getId() {
        return this.f36217a;
    }

    @Override // l20.c
    public final Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public final int getViewItemKey() {
        return hashCode();
    }

    public final int hashCode() {
        return Long.hashCode(this.f36217a);
    }

    @NotNull
    public final String toString() {
        return P4.f.a(this.f36217a, ")", new StringBuilder("FirstRowSpacerItem(id="));
    }
}
