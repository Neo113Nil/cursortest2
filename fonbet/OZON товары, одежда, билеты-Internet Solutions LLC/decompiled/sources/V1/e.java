package V1;

import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    private static final int f27904b = 66305;

    /* renamed from: c, reason: collision with root package name */
    private static final int f27905c = 66562;

    /* renamed from: a, reason: collision with root package name */
    private final int f27906a;

    private /* synthetic */ e(int i11) {
        this.f27906a = i11;
    }

    public static final /* synthetic */ e c(int i11) {
        return new e(i11);
    }

    @NotNull
    public static String d(int i11) {
        StringBuilder sb2 = new StringBuilder("LineBreak(strategy=");
        int i12 = i11 & 255;
        String str = "Invalid";
        sb2.append((Object) (i12 == 1 ? "Strategy.Simple" : i12 == 2 ? "Strategy.HighQuality" : i12 == 3 ? "Strategy.Balanced" : i12 == 0 ? "Strategy.Unspecified" : "Invalid"));
        sb2.append(", strictness=");
        int i13 = (i11 >> 8) & 255;
        sb2.append((Object) (i13 == 1 ? "Strictness.None" : i13 == 2 ? "Strictness.Loose" : i13 == 3 ? "Strictness.Normal" : i13 == 4 ? "Strictness.Strict" : i13 == 0 ? "Strictness.Unspecified" : "Invalid"));
        sb2.append(", wordBreak=");
        int i14 = (i11 >> 16) & 255;
        if (i14 == 1) {
            str = "WordBreak.None";
        } else if (i14 == 2) {
            str = "WordBreak.Phrase";
        } else if (i14 == 0) {
            str = "WordBreak.Unspecified";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }

    public final /* synthetic */ int e() {
        return this.f27906a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f27906a == ((e) obj).f27906a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27906a);
    }

    @NotNull
    public final String toString() {
        return d(this.f27906a);
    }
}
