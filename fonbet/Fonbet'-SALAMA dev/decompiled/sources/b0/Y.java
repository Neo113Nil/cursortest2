package b0;

import W5.C0495d1;
import a.AbstractC0603a;
import f6.C1116i;
import java.io.FileOutputStream;
import k6.AbstractC1356c;
import p6.AbstractC1539a;

/* loaded from: classes.dex */
public final class Y extends Q {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC1356c abstractC1356c) {
        X x4;
        int i7;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC1356c instanceof X) {
            x4 = (X) abstractC1356c;
            int i8 = x4.f10009e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                x4.f10009e = i8 - Integer.MIN_VALUE;
                Object obj2 = x4.f10007c;
                j6.a aVar = j6.a.f14642a;
                i7 = x4.f10009e;
                C1116i c1116i = C1116i.f13008a;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj2);
                    if (this.f9981b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f9980a);
                    try {
                        e0.h hVar = e0.h.f12504a;
                        C0495d1 c0495d1 = new C0495d1(fileOutputStream3);
                        x4.f10005a = fileOutputStream3;
                        x4.f10006b = fileOutputStream3;
                        x4.f10009e = 1;
                        hVar.b(obj, c0495d1);
                        if (c1116i == aVar) {
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
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = x4.f10006b;
                    fileOutputStream = x4.f10005a;
                    try {
                        AbstractC0603a.p0(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            AbstractC1539a.e(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                AbstractC1539a.e(fileOutputStream, null);
                return c1116i;
            }
        }
        x4 = new X(this, abstractC1356c);
        Object obj22 = x4.f10007c;
        j6.a aVar2 = j6.a.f14642a;
        i7 = x4.f10009e;
        C1116i c1116i2 = C1116i.f13008a;
        if (i7 != 0) {
        }
        fileOutputStream2.getFD().sync();
        AbstractC1539a.e(fileOutputStream, null);
        return c1116i2;
    }
}
