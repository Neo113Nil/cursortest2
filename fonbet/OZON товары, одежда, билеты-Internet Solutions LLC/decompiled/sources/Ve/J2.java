package Ve;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"LVe/J2;", "", "a", "b", "c", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class J2 {

    /* renamed from: a, reason: collision with root package name */
    @J8.b("APP_2_APP")
    public static final J2 f29257a;

    /* renamed from: b, reason: collision with root package name */
    @J8.b("OIDC_2_APP")
    public static final J2 f29258b;

    /* renamed from: c, reason: collision with root package name */
    @J8.b("APP_2_WEB")
    public static final J2 f29259c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ J2[] f29260d;

    static {
        J2 j22 = new J2("APP_2_APP", 0);
        f29257a = j22;
        J2 j23 = new J2("OIDC_2_APP", 1);
        f29258b = j23;
        J2 j24 = new J2("APP_2_WEB", 2);
        f29259c = j24;
        f29260d = new J2[]{j22, j23, j24};
    }

    public static J2 valueOf(String str) {
        return (J2) Enum.valueOf(J2.class, str);
    }

    public static J2[] values() {
        return (J2[]) f29260d.clone();
    }
}
