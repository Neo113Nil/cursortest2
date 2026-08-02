package p000;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0471mi extends AbstractC0693si {
    /* JADX INFO: renamed from: t */
    public static final void m3386t(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, h60 h60Var) {
        iterable.getClass();
        sb.append(charSequence2);
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            if (h60Var != null) {
                sb.append((CharSequence) h60Var.mo170i(next));
            } else {
                if (next != null ? next instanceof CharSequence : true) {
                    sb.append((CharSequence) next);
                } else if (next instanceof Character) {
                    sb.append(((Character) next).charValue());
                } else {
                    sb.append((CharSequence) next.toString());
                }
            }
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: u */
    public static String m3387u(Collection collection, String str, String str2, String str3, h60 h60Var, int i) {
        String str4 = (i & 2) != 0 ? "" : str2;
        String str5 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            h60Var = null;
        }
        collection.getClass();
        StringBuilder sb = new StringBuilder();
        m3386t(collection, sb, str, str4, str5, "...", h60Var);
        return sb.toString();
    }

    /* JADX INFO: renamed from: v */
    public static final void m3388v(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public static List m3389w(Collection collection) {
        collection.getClass();
        int size = collection.size();
        if (size == 0) {
            return C0411kw.f4584j;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return vt1.m5193e(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: x */
    public static Set m3390x(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(fm0.m1881G(collection.size()));
                    m3388v(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                Set setSingleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                setSingleton.getClass();
                return setSingleton;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m3388v(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                Set setSingleton2 = Collections.singleton(linkedHashSet2.iterator().next());
                setSingleton2.getClass();
                return setSingleton2;
            }
        }
        return C0485mw.f5167j;
    }
}
