package V1;

import B3.D;
import b2.C5520a;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final i f27915b = new i(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final i f27916c = new i(1);

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final i f27917d = new i(2);

    /* renamed from: a, reason: collision with root package name */
    private final int f27918a;

    public static final class a {
    }

    public i(int i11) {
        this.f27918a = i11;
    }

    public final boolean d(@NotNull i iVar) {
        int i11 = this.f27918a;
        return (iVar.f27918a | i11) == i11;
    }

    public final int e() {
        return this.f27918a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            return this.f27918a == ((i) obj).f27918a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27918a;
    }

    @NotNull
    public final String toString() {
        int i11 = this.f27918a;
        if (i11 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i11 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return D.c(new StringBuilder("TextDecoration["), C5520a.b(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
