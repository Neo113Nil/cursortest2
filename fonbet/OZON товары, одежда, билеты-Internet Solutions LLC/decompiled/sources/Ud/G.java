package Ud;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class G {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ G[] $VALUES;
    public static final G HTML;
    public static final G PLAIN;

    static {
        G g10 = new G() { // from class: Ud.G.b
            @Override // Ud.G
            @NotNull
            public final String a(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                return string;
            }
        };
        PLAIN = g10;
        G g11 = new G() { // from class: Ud.G.a
            @Override // Ud.G
            @NotNull
            public final String a(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                return kotlin.text.h.X(kotlin.text.h.X(string, "<", "&lt;", false), ">", "&gt;", false);
            }
        };
        HTML = g11;
        G[] gArr = {g10, g11};
        $VALUES = gArr;
        $ENTRIES = Xc.b.a(gArr);
    }

    private G() {
        throw null;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    @NotNull
    public abstract String a(@NotNull String str);
}
