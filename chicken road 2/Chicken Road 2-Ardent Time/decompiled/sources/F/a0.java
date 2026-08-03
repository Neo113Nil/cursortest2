package F;

/* loaded from: classes.dex */
public final class a0 extends F.S {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.Object obj, m1.AbstractC0931b abstractC0931b) {
        F.Z z2;
        int i2;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        if (abstractC0931b instanceof F.Z) {
            z2 = (F.Z) abstractC0931b;
            int i3 = z2.f426h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z2.f426h = i3 - Integer.MIN_VALUE;
                java.lang.Object obj2 = z2.f424f;
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                i2 = z2.f426h;
                h1.C0177i c0177i = h1.C0177i.f3302a;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj2);
                    if (this.f396b.get()) {
                        throw new java.lang.IllegalStateException("This scope has already been closed.");
                    }
                    java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(this.f395a);
                    try {
                        I.g gVar = I.g.f650a;
                        F.m0 m0Var = new F.m0(fileOutputStream3);
                        z2.f422d = fileOutputStream3;
                        z2.f423e = fileOutputStream3;
                        z2.f426h = 1;
                        gVar.b(obj, m0Var);
                        if (c0177i == enumC0927a) {
                            return enumC0927a;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fileOutputStream2 = z2.f423e;
                    fileOutputStream = z2.f422d;
                    try {
                        a.AbstractC0059a.A(obj2);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            Q1.d.g(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                Q1.d.g(fileOutputStream, null);
                return c0177i;
            }
        }
        z2 = new F.Z(this, abstractC0931b);
        java.lang.Object obj22 = z2.f424f;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = z2.f426h;
        h1.C0177i c0177i2 = h1.C0177i.f3302a;
        if (i2 != 0) {
        }
        fileOutputStream2.getFD().sync();
        Q1.d.g(fileOutputStream, null);
        return c0177i2;
    }
}
