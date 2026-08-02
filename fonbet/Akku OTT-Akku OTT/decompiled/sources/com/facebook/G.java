package com.facebook;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class G {
    public static final G a;
    public static final G b;
    public static final G c;
    public static final G d;
    public static final G e;
    public static final G f;
    public static final G i;
    public static final /* synthetic */ G[] j;

    static {
        G g = new G("REQUESTS", 0);
        a = g;
        G g2 = new G("INCLUDE_ACCESS_TOKENS", 1);
        b = g2;
        G g3 = new G("INCLUDE_RAW_RESPONSES", 2);
        c = g3;
        G g4 = new G("CACHE", 3);
        G g5 = new G("APP_EVENTS", 4);
        d = g5;
        G g6 = new G("DEVELOPER_ERRORS", 5);
        e = g6;
        G g7 = new G("GRAPH_API_DEBUG_WARNING", 6);
        f = g7;
        G g8 = new G("GRAPH_API_DEBUG_INFO", 7);
        i = g8;
        j = new G[]{g, g2, g3, g4, g5, g6, g7, g8};
    }

    public G() {
        throw null;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) j.clone();
    }
}
