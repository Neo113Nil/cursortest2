package j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class d implements e {
    public final e[] a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(List list, boolean z) {
        this((e[]) r2.toArray(new e[r2.size()]), z);
        ArrayList arrayList = (ArrayList) list;
    }

    public d(e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    @Override // j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(s sVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            sVar.c++;
        }
        try {
            for (e eVar : this.a) {
                if (!eVar.o(sVar, sb)) {
                    sb.setLength(length);
                }
            }
        } finally {
            if (z) {
                sVar.c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int v(p pVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        e[] eVarArr = this.a;
        int i2 = 0;
        if (z) {
            ArrayList arrayList = pVar.d;
            w c = pVar.c();
            c.getClass();
            w wVar = new w();
            ((HashMap) wVar.a).putAll(c.a);
            wVar.b = c.b;
            wVar.c = c.c;
            wVar.d = c.d;
            arrayList.add(wVar);
            int length = eVarArr.length;
            int i3 = i;
            while (i2 < length) {
                i3 = eVarArr[i2].v(pVar, charSequence, i3);
                if (i3 < 0) {
                    pVar.d.remove(r8.size() - 1);
                    return i;
                }
                i2++;
            }
            pVar.d.remove(r8.size() - 2);
            return i3;
        }
        int length2 = eVarArr.length;
        while (i2 < length2) {
            i = eVarArr[i2].v(pVar, charSequence, i);
            if (i < 0) {
                return i;
            }
            i2++;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
