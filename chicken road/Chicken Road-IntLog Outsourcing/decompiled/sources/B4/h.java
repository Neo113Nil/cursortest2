package B4;

import g4.AbstractC0456a;
import java.util.Iterator;
import java.util.regex.Matcher;
import y4.C1574c;

/* loaded from: classes.dex */
public final class h extends AbstractC0456a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f308a;

    public h(i iVar) {
        this.f308a = iVar;
    }

    @Override // g4.AbstractC0456a
    public final int c() {
        return ((Matcher) this.f308a.f311b).groupCount() + 1;
    }

    @Override // g4.AbstractC0456a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.contains((e) obj);
        }
        return false;
    }

    public final e d(int i2) {
        i iVar = this.f308a;
        Matcher matcher = (Matcher) iVar.f311b;
        C1574c s02 = K1.b.s0(matcher.start(i2), matcher.end(i2));
        if (s02.f12439a < 0) {
            return null;
        }
        String group = ((Matcher) iVar.f311b).group(i2);
        kotlin.jvm.internal.i.d(group, "group(...)");
        return new e(group, s02);
    }

    @Override // g4.AbstractC0456a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new A4.j(new A4.e(new A4.h(1, new C1574c(0, size() - 1, 1)), new g(0, this), 1));
    }
}
