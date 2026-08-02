package D5;

import J5.j;
import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* loaded from: classes8.dex */
public final class l implements m, j {

    /* renamed from: a, reason: collision with root package name */
    private final Path f6018a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Path f6019b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final Path f6020c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f6021d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final J5.j f6022e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6023a;

        static {
            int[] iArr = new int[j.a.values().length];
            f6023a = iArr;
            try {
                iArr[j.a.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6023a[j.a.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6023a[j.a.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6023a[j.a.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6023a[j.a.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(J5.j jVar) {
        jVar.getClass();
        this.f6022e = jVar;
    }

    @TargetApi(19)
    private void d(Path.Op op) {
        Path path = this.f6019b;
        path.reset();
        Path path2 = this.f6018a;
        path2.reset();
        ArrayList arrayList = this.f6021d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            m mVar = (m) arrayList.get(size);
            if (mVar instanceof d) {
                d dVar = (d) mVar;
                ArrayList arrayList2 = (ArrayList) dVar.i();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((m) arrayList2.get(size2)).getPath();
                    path3.transform(dVar.j());
                    path.addPath(path3);
                }
            } else {
                path.addPath(mVar.getPath());
            }
        }
        int i11 = 0;
        m mVar2 = (m) arrayList.get(0);
        if (mVar2 instanceof d) {
            d dVar2 = (d) mVar2;
            List<m> i12 = dVar2.i();
            while (true) {
                ArrayList arrayList3 = (ArrayList) i12;
                if (i11 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((m) arrayList3.get(i11)).getPath();
                path4.transform(dVar2.j());
                path2.addPath(path4);
                i11++;
            }
        } else {
            path2.set(mVar2.getPath());
        }
        this.f6020c.op(path2, path, op);
    }

    @Override // D5.j
    public final void c(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (previous instanceof m) {
                this.f6021d.add((m) previous);
                listIterator.remove();
            }
        }
    }

    @Override // D5.c
    public final void g(List<c> list, List<c> list2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f6021d;
            if (i11 >= arrayList.size()) {
                return;
            }
            ((m) arrayList.get(i11)).g(list, list2);
            i11++;
        }
    }

    @Override // D5.m
    public final Path getPath() {
        Path path = this.f6020c;
        path.reset();
        J5.j jVar = this.f6022e;
        if (!jVar.c()) {
            int i11 = a.f6023a[jVar.b().ordinal()];
            if (i11 == 1) {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.f6021d;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((m) arrayList.get(i12)).getPath());
                    i12++;
                }
            } else {
                if (i11 == 2) {
                    d(Path.Op.UNION);
                    return path;
                }
                if (i11 == 3) {
                    d(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i11 == 4) {
                    d(Path.Op.INTERSECT);
                    return path;
                }
                if (i11 == 5) {
                    d(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
