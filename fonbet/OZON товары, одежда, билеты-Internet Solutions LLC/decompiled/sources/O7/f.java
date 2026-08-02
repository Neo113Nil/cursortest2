package O7;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f20017a;

    private f(String str) {
        str.getClass();
        this.f20017a = str;
    }

    public static f d() {
        return new f(String.valueOf(','));
    }

    public static f e(String str) {
        return new f(str);
    }

    public final void a(StringBuilder sb2, AbstractCollection abstractCollection) {
        b(sb2, abstractCollection.iterator());
    }

    public final void b(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f20017a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    public final String c(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb2 = new StringBuilder();
        b(sb2, it);
        return sb2.toString();
    }
}
