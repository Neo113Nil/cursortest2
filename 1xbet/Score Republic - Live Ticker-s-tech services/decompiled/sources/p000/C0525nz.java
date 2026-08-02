package p000;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: nz */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0525nz extends s70 {
    public static final int ALREADY_SEEN_CAMPAIGNS_FIELD_NUMBER = 3;
    public static final int CLIENT_SIGNALS_FIELD_NUMBER = 4;
    private static final C0525nz DEFAULT_INSTANCE;
    private static volatile lv0 PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int REQUESTING_CLIENT_APP_FIELD_NUMBER = 2;
    private int bitField0_;
    private C0470mh clientSignals_;
    private C0802vg requestingClientApp_;
    private String projectNumber_ = "";
    private de0 alreadySeenCampaigns_ = gy0.f2961m;

    static {
        C0525nz c0525nz = new C0525nz();
        DEFAULT_INSTANCE = c0525nz;
        s70.m4493l(C0525nz.class, c0525nz);
    }

    /* JADX INFO: renamed from: n */
    public static void m3601n(C0525nz c0525nz, String str) {
        c0525nz.getClass();
        str.getClass();
        c0525nz.projectNumber_ = str;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static void m3602o(C0525nz c0525nz, de0 de0Var) {
        de0 de0Var2 = c0525nz.alreadySeenCampaigns_;
        if (!((AbstractC0490n0) de0Var2).f5220j) {
            int size = de0Var2.size();
            c0525nz.alreadySeenCampaigns_ = de0Var2.mo1171i(size == 0 ? 10 : size * 2);
        }
        List list = c0525nz.alreadySeenCampaigns_;
        Charset charset = fe0.f2381a;
        de0Var.getClass();
        if (!(de0Var instanceof jh0)) {
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(de0Var.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : de0Var) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    C0270h1.m2192h(str);
                    return;
                }
                list.add(obj);
            }
            return;
        }
        List listMo2640o = ((jh0) de0Var).mo2640o();
        jh0 jh0Var = (jh0) list;
        int size4 = list.size();
        for (Object obj2 : listMo2640o) {
            if (obj2 == null) {
                String str2 = "Element at index " + (jh0Var.size() - size4) + " is null.";
                for (int size5 = jh0Var.size() - 1; size5 >= size4; size5--) {
                    jh0Var.remove(size5);
                }
                C0270h1.m2192h(str2);
                return;
            }
            if (obj2 instanceof C0762ud) {
                jh0Var.mo2637a((C0762ud) obj2);
            } else {
                jh0Var.add((String) obj2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3603p(C0525nz c0525nz, C0470mh c0470mh) {
        c0525nz.getClass();
        c0525nz.clientSignals_ = c0470mh;
        c0525nz.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: q */
    public static void m3604q(C0525nz c0525nz, C0802vg c0802vg) {
        c0525nz.getClass();
        c0525nz.requestingClientApp_ = c0802vg;
        c0525nz.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static C0525nz m3605r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static C0488mz m3606s() {
        return (C0488mz) DEFAULT_INSTANCE.m4494d();
    }

    @Override // p000.s70
    /* JADX INFO: renamed from: e */
    public final Object mo182e(int i) {
        lv0 q70Var;
        switch (AbstractC0024an.m292o(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new yz0(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "projectNumber_", "requestingClientApp_", "alreadySeenCampaigns_", C0726te.class, "clientSignals_"});
            case 3:
                return new C0525nz();
            case 4:
                return new C0488mz(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                lv0 lv0Var = PARSER;
                if (lv0Var != null) {
                    return lv0Var;
                }
                synchronized (C0525nz.class) {
                    try {
                        q70Var = PARSER;
                        if (q70Var == null) {
                            q70Var = new q70(DEFAULT_INSTANCE);
                            PARSER = q70Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return q70Var;
            default:
                dd0.m1164i();
                return null;
        }
    }
}
