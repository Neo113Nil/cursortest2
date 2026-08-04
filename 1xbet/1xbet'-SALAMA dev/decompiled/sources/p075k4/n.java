package p075k4;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f14795a = new n();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }
}
