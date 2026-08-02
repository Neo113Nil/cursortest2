package kotlinx.serialization.json.internal;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class H {
    public static final H c;
    public static final H d;
    public static final H e;
    public static final H f;
    public static final /* synthetic */ H[] i;
    public static final /* synthetic */ EnumEntries j;

    @JvmField
    public final char a;

    @JvmField
    public final char b;

    static {
        H h = new H("OBJ", 0, '{', '}');
        c = h;
        H h2 = new H("LIST", 1, '[', ']');
        d = h2;
        H h3 = new H("MAP", 2, '{', '}');
        e = h3;
        H h4 = new H("POLY_OBJ", 3, '[', ']');
        f = h4;
        H[] hArr = {h, h2, h3, h4};
        i = hArr;
        j = EnumEntriesKt.enumEntries(hArr);
    }

    public H(String str, int i2, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) i.clone();
    }
}
