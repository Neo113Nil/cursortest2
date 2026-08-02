package B3;

import androidx.annotation.RecentlyNonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1057a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f1058b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f1059c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f1060d;

    static {
        f fVar = new f("UNKNOWN", 0);
        f1057a = fVar;
        f fVar2 = new f("NOT_REQUIRED", 1);
        f1058b = fVar2;
        f fVar3 = new f("REQUIRED", 2);
        f1059c = fVar3;
        f1060d = new f[]{fVar, fVar2, fVar3};
    }

    @RecentlyNonNull
    public static f valueOf(@RecentlyNonNull String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    @RecentlyNonNull
    public static f[] values() {
        return (f[]) f1060d.clone();
    }
}
