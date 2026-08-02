package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.xh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC4762xh {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32488a;

    static {
        String str;
        switch (Em.a(Wk.f30290b)) {
            case 0:
            case 5:
            case 6:
                str = "aHR0cHM6Ly9pZC5zYmVyLnJ1Lw==";
                break;
            case 1:
                str = "aHR0cHM6Ly9pZC1wc2kuc2Jlci5ydS8=";
                break;
            case 2:
            case 3:
            case 4:
                str = "aHR0cHM6Ly9pZC1pZnQuc2Jlci5ydS8=";
                break;
            default:
                throw new Sc.o();
        }
        f32488a = str;
    }

    public static String a() {
        Intrinsics.checkNotNullParameter("token-exchange", "path");
        return M1.b.m(f32488a).concat("token-exchange");
    }
}
