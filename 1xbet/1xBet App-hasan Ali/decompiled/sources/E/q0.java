package E;

import P0.C0331a;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import com.google.android.gms.internal.ads.C1639u7;
import game.betting133.sports1xbet.aqua_viewmodels.AquaTournamentCatalogViewModel;
import r0.AbstractC2346c;
import r0.C2345b;
import z0.AbstractC2749f;

/* loaded from: classes.dex */
public final /* synthetic */ class q0 extends kotlin.jvm.internal.j implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1263k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, Object obj, Class cls, String str, String str2, int i5, int i6) {
        super(i, i5, cls, obj, str, str2);
        this.f1263k = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    @Override // i4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj) {
        C0331a c0331a;
        int a5;
        Integer valueOf;
        switch (this.f1263k) {
            case 0:
                KeyEvent keyEvent = ((C2345b) obj).f19083a;
                p0 p0Var = (p0) this.receiver;
                p0Var.getClass();
                boolean z3 = true;
                if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
                    L l5 = p0Var.i;
                    l5.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        l5.f1058a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        valueOf = null;
                    } else {
                        Integer num = l5.f1058a;
                        if (num != null) {
                            l5.f1058a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            valueOf = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                valueOf = null;
                            }
                            if (valueOf == null) {
                                valueOf = Integer.valueOf(unicodeChar);
                            }
                        } else {
                            valueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (valueOf != null) {
                        c0331a = new C0331a(new StringBuilder().appendCodePoint(valueOf.intValue()).toString(), 1);
                        I.V v4 = p0Var.f;
                        boolean z5 = p0Var.f1251d;
                        if (c0331a == null) {
                            if (z5) {
                                p0Var.a(AbstractC2346c.A(c0331a));
                                v4.f2454a = null;
                            }
                            z3 = false;
                        } else {
                            if (AbstractC2346c.t(keyEvent) == 2 && (a5 = p0Var.f1255j.a(keyEvent)) != 0) {
                                boolean z6 = true;
                                switch (a5) {
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                        z6 = false;
                                    case 18:
                                    case 19:
                                    case 20:
                                    case C1639u7.zzm /* 21 */:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                        if (!z6 || z5) {
                                            kotlin.jvm.internal.s sVar = new kotlin.jvm.internal.s();
                                            sVar.f17620k = true;
                                            o0 o0Var = new o0(a5, p0Var, sVar);
                                            F0 d5 = p0Var.f1248a.d();
                                            P0.w wVar = p0Var.f1250c;
                                            I.L l6 = new I.L(wVar, p0Var.f1253g, d5, v4);
                                            o0Var.c(l6);
                                            if (!K0.N.a(l6.f, wVar.f4680b) || !kotlin.jvm.internal.l.a(l6.f2417g, wVar.f4679a)) {
                                                p0Var.f1256k.c(P0.w.a(wVar, l6.f2417g, l6.f, 4));
                                            }
                                            G0 g02 = p0Var.f1254h;
                                            if (g02 != null) {
                                                g02.f1037e = true;
                                            }
                                            z3 = sVar.f17620k;
                                            break;
                                        }
                                        break;
                                    default:
                                        throw null;
                                }
                            }
                            z3 = false;
                        }
                        return Boolean.valueOf(z3);
                    }
                }
                c0331a = null;
                I.V v42 = p0Var.f;
                boolean z52 = p0Var.f1251d;
                if (c0331a == null) {
                }
                return Boolean.valueOf(z3);
            case 1:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("p0", str);
                ((AquaTournamentCatalogViewModel) this.receiver).reviseSemeansarchDraft(str);
                return W3.o.f6046a;
            case 2:
                ((g0.u) this.receiver).getClass();
                Object obj2 = ((g0.s) obj).f7162k;
                z0.v0 v0Var = obj2 instanceof z0.v0 ? (z0.v0) obj2 : null;
                if (v0Var != null) {
                    AbstractC2749f.o(v0Var);
                }
                return W3.o.f6046a;
            default:
                ((p4.X) this.receiver).l((Throwable) obj);
                return W3.o.f6046a;
        }
    }
}
