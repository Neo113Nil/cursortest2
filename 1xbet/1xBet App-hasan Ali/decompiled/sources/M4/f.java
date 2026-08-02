package M4;

import A0.C0040k0;
import L4.G;
import L4.I;
import L4.n;
import L4.o;
import L4.u;
import L4.v;
import L4.z;
import W3.m;
import X3.s;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class f extends o {

    /* renamed from: e, reason: collision with root package name */
    public static final z f3631e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f3632b;

    /* renamed from: c, reason: collision with root package name */
    public final o f3633c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3634d;

    static {
        String str = z.f3126l;
        f3631e = j3.i.s("/");
    }

    public f(ClassLoader classLoader) {
        v vVar = o.f3106a;
        l.f("systemFileSystem", vVar);
        this.f3632b = classLoader;
        this.f3633c = vVar;
        this.f3634d = G4.d.E(new C0040k0(17, this));
    }

    @Override // L4.o
    public final void a(z zVar) {
        l.f("path", zVar);
        throw new IOException(this + " is read-only");
    }

    @Override // L4.o
    public final List d(z zVar) {
        l.f("dir", zVar);
        z zVar2 = f3631e;
        zVar2.getClass();
        String p5 = c.b(zVar2, zVar, true).c(zVar2).f3127k.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z3 = false;
        for (W3.h hVar : (List) this.f3634d.getValue()) {
            o oVar = (o) hVar.f6036k;
            z zVar3 = (z) hVar.f6037l;
            try {
                List d5 = oVar.d(zVar3.d(p5));
                ArrayList arrayList = new ArrayList();
                for (Object obj : d5) {
                    if (j3.i.d((z) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(X3.o.S(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    z zVar4 = (z) obj2;
                    l.f("<this>", zVar4);
                    String replace = AbstractC2227e.K0(zVar4.f3127k.p(), zVar3.f3127k.p()).replace('\\', '/');
                    l.e("replace(...)", replace);
                    arrayList2.add(zVar2.d(replace));
                }
                s.U(arrayList2, linkedHashSet);
                z3 = true;
            } catch (IOException unused) {
            }
        }
        if (z3) {
            return X3.m.m0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override // L4.o
    public final n f(z zVar) {
        l.f("path", zVar);
        if (!j3.i.d(zVar)) {
            return null;
        }
        z zVar2 = f3631e;
        zVar2.getClass();
        String p5 = c.b(zVar2, zVar, true).c(zVar2).f3127k.p();
        for (W3.h hVar : (List) this.f3634d.getValue()) {
            n f = ((o) hVar.f6036k).f(((z) hVar.f6037l).d(p5));
            if (f != null) {
                return f;
            }
        }
        return null;
    }

    @Override // L4.o
    public final u g(z zVar) {
        if (!j3.i.d(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        z zVar2 = f3631e;
        zVar2.getClass();
        String p5 = c.b(zVar2, zVar, true).c(zVar2).f3127k.p();
        for (W3.h hVar : (List) this.f3634d.getValue()) {
            try {
                return ((o) hVar.f6036k).g(((z) hVar.f6037l).d(p5));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override // L4.o
    public final G h(z zVar) {
        l.f("file", zVar);
        throw new IOException(this + " is read-only");
    }

    @Override // L4.o
    public final I i(z zVar) {
        l.f("file", zVar);
        if (!j3.i.d(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        z zVar2 = f3631e;
        zVar2.getClass();
        URL resource = this.f3632b.getResource(c.b(zVar2, zVar, false).c(zVar2).f3127k.p());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        l.e("getInputStream(...)", inputStream);
        return N4.b.W(inputStream);
    }
}
