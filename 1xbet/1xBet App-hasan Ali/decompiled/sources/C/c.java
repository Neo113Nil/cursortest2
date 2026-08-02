package C;

import G4.l;
import W3.o;
import a.AbstractC0444a;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import h0.C1989c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final R.e f780a = new R.e(new d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C1989c c1989c, AbstractC0542c abstractC0542c) {
        b bVar;
        int i;
        int i5;
        C1989c c1989c2;
        int i6;
        Object[] objArr;
        if (abstractC0542c instanceof b) {
            bVar = (b) abstractC0542c;
            int i7 = bVar.f779q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f779q = i7 - Integer.MIN_VALUE;
                Object obj = bVar.f777o;
                EnumC0510a enumC0510a = EnumC0510a.f7289k;
                i = bVar.f779q;
                if (i != 0) {
                    l.N(obj);
                    R.e eVar = this.f780a;
                    i5 = eVar.f5108m;
                    if (i5 > 0) {
                        Object[] objArr2 = eVar.f5106k;
                        c1989c2 = c1989c;
                        i6 = 0;
                        objArr = objArr2;
                        d dVar = (d) objArr[i6];
                        bVar.f773k = c1989c2;
                        bVar.f774l = objArr;
                        bVar.f775m = i5;
                        bVar.f776n = i6;
                        bVar.f779q = 1;
                        if (AbstractC0444a.a0(dVar, c1989c2, bVar) == enumC0510a) {
                            return enumC0510a;
                        }
                        i6++;
                    }
                    return o.f6046a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i6 = bVar.f776n;
                i5 = bVar.f775m;
                objArr = bVar.f774l;
                C1989c c1989c3 = bVar.f773k;
                l.N(obj);
                c1989c2 = c1989c3;
                i6++;
            }
        }
        bVar = new b(this, abstractC0542c);
        Object obj2 = bVar.f777o;
        EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
        i = bVar.f779q;
        if (i != 0) {
        }
    }
}
