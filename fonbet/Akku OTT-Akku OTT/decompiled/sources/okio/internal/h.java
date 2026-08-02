package okio.internal;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C;
import okio.C1190e;
import okio.C1193h;

@JvmName(name = "-Path")
@SourceDebugExtension({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n53#1,22:406\n203#1:432\n203#1:433\n1563#2:428\n1634#2,3:429\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n47#1:406,22\n193#1:432\n198#1:433\n47#1:428\n47#1:429,3\n*E\n"})
/* loaded from: classes5.dex */
public final class h {
    public static final C1193h a;
    public static final C1193h b;
    public static final C1193h c;
    public static final C1193h d;
    public static final C1193h e;

    static {
        C1193h.Companion.getClass();
        a = C1193h.a.c(DomExceptionUtils.SEPARATOR);
        b = C1193h.a.c("\\");
        c = C1193h.a.c("/\\");
        d = C1193h.a.c(".");
        e = C1193h.a.c("..");
    }

    public static final int a(C c2) {
        C1193h c1193h = c2.a;
        if (c1193h.d() != 0) {
            if (c1193h.i(0) != 47) {
                if (c1193h.i(0) == 92) {
                    if (c1193h.d() > 2 && c1193h.i(1) == 92) {
                        C1193h other = b;
                        Intrinsics.checkNotNullParameter(other, "other");
                        int f = c1193h.f(other.h(), 2);
                        return f == -1 ? c1193h.d() : f;
                    }
                } else if (c1193h.d() > 2 && c1193h.i(1) == 58 && c1193h.i(2) == 92) {
                    char i = (char) c1193h.i(0);
                    if ('a' <= i && i < '{') {
                        return 3;
                    }
                    if ('A' <= i && i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final C b(C c2, C child, boolean z) {
        Intrinsics.checkNotNullParameter(c2, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (a(child) != -1) {
            return child;
        }
        if (child.g() != null) {
            return child;
        }
        C1193h c3 = c(c2);
        if (c3 == null && (c3 = c(child)) == null) {
            c3 = f(C.b);
        }
        C1190e c1190e = new C1190e();
        c1190e.b0(c2.a);
        if (c1190e.b > 0) {
            c1190e.b0(c3);
        }
        c1190e.b0(child.a);
        return d(c1190e, z);
    }

    public static final C1193h c(C c2) {
        C1193h c1193h = c2.a;
        C1193h c1193h2 = a;
        if (C1193h.g(c1193h, c1193h2) != -1) {
            return c1193h2;
        }
        C1193h c1193h3 = c2.a;
        C1193h c1193h4 = b;
        if (C1193h.g(c1193h3, c1193h4) != -1) {
            return c1193h4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[EDGE_INSN: B:68:0x0118->B:69:0x0118 BREAK  A[LOOP:1: B:20:0x00b3->B:36:0x00b3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C d(C1190e c1190e, boolean z) {
        C1193h c1193h;
        long j;
        char t;
        boolean E;
        C1193h c1193h2;
        int size;
        int i;
        C1193h C;
        Intrinsics.checkNotNullParameter(c1190e, "<this>");
        C1190e c1190e2 = new C1190e();
        C1193h c1193h3 = null;
        int i2 = 0;
        while (true) {
            if (!c1190e.n(0L, a)) {
                c1193h = b;
                if (!c1190e.n(0L, c1193h)) {
                    break;
                }
            }
            byte readByte = c1190e.readByte();
            if (c1193h3 == null) {
                c1193h3 = e(readByte);
            }
            i2++;
        }
        boolean z2 = i2 >= 2 && Intrinsics.areEqual(c1193h3, c1193h);
        C1193h c1193h4 = c;
        if (z2) {
            Intrinsics.checkNotNull(c1193h3);
            c1190e2.b0(c1193h3);
            c1190e2.b0(c1193h3);
        } else {
            if (i2 <= 0) {
                long x = c1190e.x(c1193h4);
                if (c1193h3 == null) {
                    c1193h3 = x == -1 ? f(C.b) : e(c1190e.t(x));
                }
                if (Intrinsics.areEqual(c1193h3, c1193h) && c1190e.b >= 2) {
                    j = -1;
                    if (c1190e.t(1L) == 58 && (('a' <= (t = (char) c1190e.t(0L)) && t < '{') || ('A' <= t && t < '['))) {
                        if (x == 2) {
                            c1190e2.write(c1190e, 3L);
                        } else {
                            c1190e2.write(c1190e, 2L);
                        }
                    }
                } else {
                    j = -1;
                }
                Unit unit = Unit.INSTANCE;
                boolean z3 = c1190e2.b <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    E = c1190e.E();
                    c1193h2 = d;
                    if (!E) {
                        break;
                    }
                    long x2 = c1190e.x(c1193h4);
                    if (x2 == j) {
                        C = c1190e.C(c1190e.b);
                    } else {
                        C = c1190e.C(x2);
                        c1190e.readByte();
                    }
                    C1193h c1193h5 = e;
                    if (Intrinsics.areEqual(C, c1193h5)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (!z || (!z3 && (arrayList.isEmpty() || Intrinsics.areEqual(CollectionsKt.last((List) arrayList), c1193h5)))) {
                                arrayList.add(C);
                            } else if (!z2 || arrayList.size() != 1) {
                                CollectionsKt.removeLastOrNull(arrayList);
                            }
                        }
                    } else if (!Intrinsics.areEqual(C, c1193h2) && !Intrinsics.areEqual(C, C1193h.d)) {
                        arrayList.add(C);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        c1190e2.b0(c1193h3);
                    }
                    c1190e2.b0((C1193h) arrayList.get(i));
                }
                if (c1190e2.b == 0) {
                    c1190e2.b0(c1193h2);
                }
                return new C(c1190e2.C(c1190e2.b));
            }
            Intrinsics.checkNotNull(c1193h3);
            c1190e2.b0(c1193h3);
        }
        j = -1;
        if (c1190e2.b <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            E = c1190e.E();
            c1193h2 = d;
            if (!E) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (c1190e2.b == 0) {
        }
        return new C(c1190e2.C(c1190e2.b));
    }

    public static final C1193h e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(b2, "not a directory separator: "));
    }

    public static final C1193h f(String str) {
        if (Intrinsics.areEqual(str, DomExceptionUtils.SEPARATOR)) {
            return a;
        }
        if (Intrinsics.areEqual(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(defpackage.g.a("not a directory separator: ", str));
    }
}
