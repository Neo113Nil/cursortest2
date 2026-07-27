package K;

import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class Z extends Q {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, AbstractC0343b abstractC0343b) {
        Y y;
        int i3;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0343b instanceof Y) {
            y = (Y) abstractC0343b;
            int i4 = y.f822h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                y.f822h = i4 - Integer.MIN_VALUE;
                Object obj2 = y.f;
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                i3 = y.f822h;
                C0279i c0279i = C0279i.f4852a;
                if (i3 != 0) {
                    X0.a.L(obj2);
                    if (this.f796b.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.f795a);
                    try {
                        N.g gVar = N.g.f985a;
                        l0 l0Var = new l0(fileOutputStream3);
                        y.f819d = fileOutputStream3;
                        y.f820e = fileOutputStream3;
                        y.f822h = 1;
                        gVar.b(obj, l0Var);
                        if (c0279i == enumC0326a) {
                            return enumC0326a;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = y.f820e;
                    fileOutputStream = y.f819d;
                    try {
                        X0.a.L(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            F2.b.k(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                F2.b.k(fileOutputStream, null);
                return c0279i;
            }
        }
        y = new Y(this, abstractC0343b);
        Object obj22 = y.f;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = y.f822h;
        C0279i c0279i2 = C0279i.f4852a;
        if (i3 != 0) {
        }
        fileOutputStream2.getFD().sync();
        F2.b.k(fileOutputStream, null);
        return c0279i2;
    }
}
