package Fj;

import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@j(generateAdapter = false)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LFj/a;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "TR_BL", "RIGHT_LEFT", "BR_TL", "BOTTOM_TOP", "BL_TR", "LEFT_RIGHT", "TL_BR", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a TOP_BOTTOM = new a("TOP_BOTTOM", 0);
    public static final a TR_BL = new a("TR_BL", 1);
    public static final a RIGHT_LEFT = new a("RIGHT_LEFT", 2);
    public static final a BR_TL = new a("BR_TL", 3);
    public static final a BOTTOM_TOP = new a("BOTTOM_TOP", 4);
    public static final a BL_TR = new a("BL_TR", 5);
    public static final a LEFT_RIGHT = new a("LEFT_RIGHT", 6);
    public static final a TL_BR = new a("TL_BR", 7);

    private static final /* synthetic */ a[] $values() {
        return new a[]{TOP_BOTTOM, TR_BL, RIGHT_LEFT, BR_TL, BOTTOM_TOP, BL_TR, LEFT_RIGHT, TL_BR};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
    }

    private a(String str, int i11) {
    }

    @NotNull
    public static Xc.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
