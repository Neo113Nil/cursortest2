package Q1;

/* loaded from: classes.dex */
public abstract class f {
    public static boolean a() {
        org.conscrypt.Conscrypt.Version version = org.conscrypt.Conscrypt.version();
        return version.major() != 2 ? version.major() > 2 : version.minor() != 1 ? version.minor() > 1 : version.patch() >= 0;
    }

    public static boolean b() {
        return Q1.h.f1623d;
    }
}
