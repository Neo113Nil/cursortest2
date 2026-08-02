package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: nr */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0517nr {

    /* JADX INFO: renamed from: a */
    public final String f5504a;

    /* JADX INFO: renamed from: b */
    public final b90 f5505b;

    public C0517nr(Set set, b90 b90Var) {
        this.f5504a = m3582b(set);
        this.f5505b = b90Var;
    }

    /* JADX INFO: renamed from: b */
    public static String m3582b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0131da c0131da = (C0131da) it.next();
            sb.append(c0131da.f1594a);
            sb.append('/');
            sb.append(c0131da.f1595b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public final String m3583a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        b90 b90Var = this.f5505b;
        synchronized (((HashSet) b90Var.f793k)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) b90Var.f793k);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.f5504a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) b90Var.f793k)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) b90Var.f793k);
        }
        sb.append(m3582b(setUnmodifiableSet2));
        return sb.toString();
    }
}
