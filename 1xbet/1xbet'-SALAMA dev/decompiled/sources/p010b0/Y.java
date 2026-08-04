package p010b0;

import W5.C0495d1;
import j6.a;
import java.io.FileOutputStream;
import p030e0.h;
import p044f6.i;
import p077k6.c;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends Q {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Object obj, c cVar) {
        X x4;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (cVar instanceof X) {
            x4 = (X) cVar;
            int i7 = x4.f10009e;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                x4.f10009e = i7 - Integer.MIN_VALUE;
            } else {
                x4 = new X(this, cVar);
            }
        } else {
            x4 = new X(this, cVar);
        }
        Object obj2 = x4.f10007c;
        a aVar = a.f14648a;
        int i8 = x4.f10009e;
        i iVar = i.f13014a;
        if (i8 == 0) {
            p003a.a.p0(obj2);
            if (this.f9981b.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f9980a);
            try {
                h hVar = h.f12510a;
                C0495d1 c0495d1 = new C0495d1(fileOutputStream3);
                x4.f10005a = fileOutputStream3;
                x4.f10006b = fileOutputStream3;
                x4.f10009e = 1;
                hVar.b(obj, c0495d1);
                if (iVar == aVar) {
                    return aVar;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream2 = x4.f10006b;
            fileOutputStream = x4.f10005a;
            try {
                p003a.a.p0(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    p115p6.a.e(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        p115p6.a.e(fileOutputStream, null);
        return iVar;
    }
}
