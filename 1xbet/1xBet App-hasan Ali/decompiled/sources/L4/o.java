package L4;

import java.io.FileNotFoundException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final v f3106a;

    static {
        v vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new w();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        f3106a = vVar;
        String str = z.f3126l;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.l.e("getProperty(...)", property);
        j3.i.s(property);
        ClassLoader classLoader = M4.f.class.getClassLoader();
        kotlin.jvm.internal.l.e("getClassLoader(...)", classLoader);
        new M4.f(classLoader);
    }

    public abstract void a(z zVar);

    public final void b(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        a(zVar);
    }

    public final boolean c(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        return f(zVar) != null;
    }

    public abstract List d(z zVar);

    public final n e(z zVar) {
        kotlin.jvm.internal.l.f("path", zVar);
        n f = f(zVar);
        if (f != null) {
            return f;
        }
        throw new FileNotFoundException("no such file: " + zVar);
    }

    public abstract n f(z zVar);

    public abstract u g(z zVar);

    public abstract G h(z zVar);

    public abstract I i(z zVar);
}
