package p000;

import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0926yt implements InterfaceC0003a2 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9461j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0963zt f9462k;

    public /* synthetic */ C0926yt(C0963zt c0963zt, C0047b2 c0047b2) {
        this.f9461j = 1;
        this.f9462k = c0963zt;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.InterfaceC0003a2
    public final void run() {
        boolean zM461b;
        int i = this.f9461j;
        C0963zt c0963zt = this.f9462k;
        boolean z = true;
        char c = 1;
        switch (i) {
            case 0:
                final aq0 aq0Var = c0963zt.f9947f;
                final zc0 zc0Var = c0963zt.f9949h;
                aq0Var.getClass();
                if (!zc0Var.f9733b.f5009k) {
                    final int i2 = 0;
                    ((l10) aq0Var.f600c).m3141c().m5127c(aq0Var.f604g, new ou0() { // from class: yp0
                        @Override // p000.ou0
                        /* JADX INFO: renamed from: b */
                        public final void mo306b(Object obj) {
                            int i3 = i2;
                            zc0 zc0Var2 = zc0Var;
                            aq0 aq0Var2 = aq0Var;
                            String str = (String) obj;
                            switch (i3) {
                                case 0:
                                    C0468mf c0468mf = aq0Var2.f598a;
                                    C0467me c0467meM462a = aq0Var2.m462a(zc0Var2, str);
                                    c0467meM462a.m3637c();
                                    C0504ne.m3523o((C0504ne) c0467meM462a.f5645k, EnumC0560ox.f5931l);
                                    c0468mf.m3379d(((C0504ne) c0467meM462a.m3635a()).m2755b());
                                    break;
                                default:
                                    C0468mf c0468mf2 = aq0Var2.f598a;
                                    C0467me c0467meM462a2 = aq0Var2.m462a(zc0Var2, str);
                                    c0467meM462a2.m3637c();
                                    C0504ne.m3523o((C0504ne) c0467meM462a2.f5645k, EnumC0560ox.f5932m);
                                    c0468mf2.m3379d(((C0504ne) c0467meM462a2.m3635a()).m2755b());
                                    break;
                            }
                        }
                    });
                    int i3 = zp0.f9892a[zc0Var.f9732a.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            zM461b = aq0.m461b(((dq0) zc0Var).f1796f);
                        } else if (i3 == 3) {
                            zM461b = aq0.m461b(((C0132db) zc0Var).f1607f);
                        } else if (i3 != 4) {
                            Log.e("FIAM.Headless", "Unable to determine if impression should be counted as conversion.");
                            z = false;
                        } else {
                            zM461b = aq0.m461b(((gc0) zc0Var).f2693d);
                        }
                        z = true ^ zM461b;
                    } else {
                        C0247gf c0247gf = (C0247gf) zc0Var;
                        boolean zM461b2 = aq0.m461b(c0247gf.f2716f);
                        boolean zM461b3 = aq0.m461b(c0247gf.f2717g);
                        if (zM461b2 || zM461b3) {
                            z = false;
                        }
                    }
                    aq0Var.m463c(zc0Var, "fiam_impression", z);
                }
                Iterator it = aq0Var.f603f.f6949d.values().iterator();
                if (it.hasNext()) {
                    throw AbstractC0024an.m280c(it);
                }
                return;
            case 1:
                final aq0 aq0Var2 = c0963zt.f9947f;
                final zc0 zc0Var2 = c0963zt.f9949h;
                aq0Var2.getClass();
                if (!zc0Var2.f9733b.f5009k) {
                    v92 v92VarM3141c = ((l10) aq0Var2.f600c).m3141c();
                    Executor executor = aq0Var2.f604g;
                    final char c2 = c == true ? 1 : 0;
                    v92VarM3141c.m5127c(executor, new ou0() { // from class: yp0
                        @Override // p000.ou0
                        /* JADX INFO: renamed from: b */
                        public final void mo306b(Object obj) {
                            int i4 = c2;
                            zc0 zc0Var3 = zc0Var2;
                            aq0 aq0Var3 = aq0Var2;
                            String str = (String) obj;
                            switch (i4) {
                                case 0:
                                    C0468mf c0468mf = aq0Var3.f598a;
                                    C0467me c0467meM462a = aq0Var3.m462a(zc0Var3, str);
                                    c0467meM462a.m3637c();
                                    C0504ne.m3523o((C0504ne) c0467meM462a.f5645k, EnumC0560ox.f5931l);
                                    c0468mf.m3379d(((C0504ne) c0467meM462a.m3635a()).m2755b());
                                    break;
                                default:
                                    C0468mf c0468mf2 = aq0Var3.f598a;
                                    C0467me c0467meM462a2 = aq0Var3.m462a(zc0Var3, str);
                                    c0467meM462a2.m3637c();
                                    C0504ne.m3523o((C0504ne) c0467meM462a2.f5645k, EnumC0560ox.f5932m);
                                    c0468mf2.m3379d(((C0504ne) c0467meM462a2.m3635a()).m2755b());
                                    break;
                            }
                        }
                    });
                    aq0Var2.m463c(zc0Var2, "fiam_action", true);
                }
                Iterator it2 = aq0Var2.f603f.f6946a.values().iterator();
                if (it2.hasNext()) {
                    throw AbstractC0024an.m280c(it2);
                }
                return;
            default:
                c0963zt.f9951j = true;
                return;
        }
    }

    public /* synthetic */ C0926yt(C0963zt c0963zt, int i) {
        this.f9461j = i;
        this.f9462k = c0963zt;
    }
}
