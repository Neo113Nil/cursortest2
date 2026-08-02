package p000;

import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q00 extends i00 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m4022b(Object obj, AbstractC0882xm abstractC0882xm) throws IOException {
        p00 p00Var;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (abstractC0882xm instanceof p00) {
            p00Var = (p00) abstractC0882xm;
            int i = p00Var.f5948q;
            if ((i & Integer.MIN_VALUE) != 0) {
                p00Var.f5948q = i - Integer.MIN_VALUE;
            } else {
                p00Var = new p00(this, abstractC0882xm);
            }
        } else {
            p00Var = new p00(this, abstractC0882xm);
        }
        Object obj2 = p00Var.f5946o;
        int i2 = p00Var.f5948q;
        kf1 kf1Var = kf1.f4365a;
        if (i2 == 0) {
            wo1.m5395v(obj2);
            if (this.f3368b.get()) {
                C0270h1.m2191g("This scope has already been closed.");
                return null;
            }
            FileOutputStream fileOutputStream3 = new FileOutputStream(this.f3367a);
            try {
                mo0 mo0Var = new mo0(fileOutputStream3);
                p00Var.f5944m = fileOutputStream3;
                p00Var.f5945n = fileOutputStream3;
                p00Var.f5948q = 1;
                wa0.m5305s(obj, mo0Var);
                EnumC0513nn enumC0513nn = EnumC0513nn.f5459j;
                if (kf1Var == enumC0513nn) {
                    return enumC0513nn;
                }
                fileOutputStream2 = fileOutputStream3;
                fileOutputStream = fileOutputStream2;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream3;
                throw th;
            }
        } else {
            if (i2 != 1) {
                C0270h1.m2191g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = p00Var.f5945n;
            fileOutputStream = p00Var.f5944m;
            try {
                wo1.m5395v(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    vk1.m5166a(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        vk1.m5166a(fileOutputStream, null);
        return kf1Var;
    }
}
