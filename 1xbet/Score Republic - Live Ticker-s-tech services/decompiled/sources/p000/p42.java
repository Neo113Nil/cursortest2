package p000;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p42 {

    /* JADX INFO: renamed from: c */
    public static final p42 f5986c = new p42(h42.f3051b, d42.m1086A());

    /* JADX INFO: renamed from: a */
    public final h42 f5987a;

    /* JADX INFO: renamed from: b */
    public final d42 f5988b;

    public p42(h42 h42Var, d42 d42Var) {
        h42Var.getClass();
        this.f5987a = h42Var;
        this.f5988b = d42Var;
    }

    /* JADX INFO: renamed from: a */
    public static p42 m3847a(AbstractC0860x0 abstractC0860x0, boolean z) throws mp1 {
        h42 h42VarM2208a;
        int iMo3264f0 = abstractC0860x0.mo3264f0();
        if (iMo3264f0 > 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(iMo3264f0).length() + 44);
            sb.append("Unsupported version: ");
            sb.append(iMo3264f0);
            sb.append(". Current version is: 1");
            throw new mp1(sb.toString());
        }
        abstractC0860x0.mo3264f0();
        int iMo3240D = abstractC0860x0.mo3240D(abstractC0860x0.mo3262d0());
        so1 so1Var = so1.f7176a;
        int i = fo1.f2465a;
        d42 d42VarM1087z = d42.m1087z(abstractC0860x0, so1.f7177b);
        abstractC0860x0.mo3241E(iMo3240D);
        f42 f42Var = new f42();
        Inflater inflater = f42Var.f2311j;
        try {
            if (z) {
                int iMo3240D2 = abstractC0860x0.mo3240D(abstractC0860x0.mo3262d0());
                int iMo3242F = abstractC0860x0.mo3242F();
                try {
                    h42VarM2208a = h42.m2208a(AbstractC0860x0.m5486K(new InflaterInputStream(new e42(f42Var, abstractC0860x0), inflater, iMo3242F < 0 ? 4096 : Math.min(iMo3242F, 4096)), 4096));
                    inflater.reset();
                    if (abstractC0860x0.mo3242F() != 0) {
                        throw new mp1("Unexpected bytes remaining after FlagsBlob parsing.");
                    }
                    abstractC0860x0.mo3241E(iMo3240D2);
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            } else {
                inflater.setInput(abstractC0860x0.mo3261c0());
                try {
                    h42VarM2208a = h42.m2208a(AbstractC0860x0.m5486K(new e42(f42Var), 4096));
                    inflater.reset();
                } catch (Throwable th2) {
                    inflater.reset();
                    throw th2;
                }
            }
            f42Var.close();
            return new p42(h42VarM2208a, d42VarM1087z);
        } catch (Throwable th3) {
            try {
                f42Var.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
