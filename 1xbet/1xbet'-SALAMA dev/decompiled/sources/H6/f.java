package H6;

import D6.E;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p065i6.i f3434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3436c;

    public f(p065i6.i iVar, int i7, int i8) {
        this.f3434a = iVar;
        this.f3435b = i7;
        this.f3436c = i8;
    }

    public abstract Object a(F6.p pVar, p065i6.d dVar);

    public abstract f b(p065i6.i iVar, int i7, int i8);

    @Override // G6.g
    public Object r(G6.h hVar, p065i6.d dVar) throws Throwable {
        Object objE = E.e(new d(hVar, this, null), dVar);
        return objE == j6.a.f14648a ? objE : p044f6.i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    @Override // H6.j
    public final G6.g t(p065i6.i iVar, int i7, int i8) {
        p065i6.i iVar2 = this.f3434a;
        p065i6.i iVarPlus = iVar.plus(iVar2);
        int i9 = this.f3436c;
        int i10 = this.f3435b;
        if (i8 == 1) {
            if (i10 != -3) {
                if (i7 == -3) {
                    i7 = i10;
                } else if (i10 != -2) {
                    if (i7 == -2) {
                        i7 = i10;
                    } else {
                        i7 += i10;
                        if (i7 < 0) {
                            i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            i8 = i9;
        }
        return (t6.h.a(iVarPlus, iVar2) && i7 == i10 && i8 == i9) ? this : b(iVarPlus, i7, i8);
    }

    public String toString() {
        String str;
        ArrayList arrayList = new ArrayList(4);
        p065i6.j jVar = p065i6.j.f14074a;
        p065i6.i iVar = this.f3434a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i7 = this.f3435b;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        int i8 = this.f3436c;
        if (i8 != 1) {
            if (i8 == 1) {
                str = "SUSPEND";
            } else if (i8 != 2) {
                str = i8 != 3 ? "null" : "DROP_LATEST";
            } else {
                str = "DROP_OLDEST";
            }
            arrayList.add("onBufferOverflow=".concat(str));
        }
        return getClass().getSimpleName() + '[' + p050g6.h.T0(arrayList, ", ", null, null, null, 62) + ']';
    }
}
