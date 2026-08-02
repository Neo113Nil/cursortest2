package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l01 {

    /* JADX INFO: renamed from: a */
    public static final m01 f4622a;

    static {
        m01 m01Var = null;
        try {
            m01Var = (m01) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (m01Var == null) {
            m01Var = new m01();
        }
        f4622a = m01Var;
    }
}
