package M5;

import android.graphics.Typeface;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4592a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f4593b;

    static {
        a aVar = new a("NORMAL", 0);
        f4592a = aVar;
        f4593b = new a[]{aVar, new a("BOLD", 1), new a("ITALIC", 2), new a("MONOSPACE", 3)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f4593b.clone();
    }

    public final Typeface a() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}
