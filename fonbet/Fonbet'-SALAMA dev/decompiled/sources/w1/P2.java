package w1;

import B4.C0063g;
import B4.C0070n;
import B4.EnumC0071o;
import C0.RunnableC0085d;
import E4.AbstractC0178k;
import E4.C0170c;
import E4.C0171d;
import E4.C0177j;
import E4.EnumC0176i;
import I2.C0313v;
import U5.C0434a;
import U5.C0435b;
import W5.AbstractC0486a1;
import Y4.C0562a0;
import Y4.C0564b0;
import Y4.C0566c0;
import Y4.C0567d;
import Y4.C0568d0;
import Y4.C0569e;
import Y4.C0572f0;
import Y4.C0576h0;
import Y4.C0580j0;
import Y4.C0582k0;
import Y4.C0584l0;
import Y4.C0586m0;
import Y4.C0589o;
import Y4.C0590o0;
import Y4.C0591p;
import Y4.C0592p0;
import Y4.C0593q;
import Y4.C0594q0;
import Y4.C0595s;
import Y4.C0598v;
import Y4.C0599w;
import Y4.C0601y;
import Y4.EnumC0570e0;
import Y4.EnumC0574g0;
import Y4.EnumC0578i0;
import Y4.EnumC0602z;
import a.AbstractC0603a;
import a6.C0623a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase_Impl;
import b0.C0769q;
import b2.InterfaceC0779a;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0911k;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import e1.C0999f;
import e3.C1023h;
import f6.C1116i;
import i6.InterfaceC1287d;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.SentryEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import u2.C1638o;
import u5.C1649c;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public class P2 implements A5.d, G6.g, zzapf, y2.r, R1.j, A5.q, X0.h, u2.M {

    /* renamed from: d, reason: collision with root package name */
    public static P2 f17506d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17507a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17508b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17509c;

    public /* synthetic */ P2(int i7, char c3) {
        this.f17507a = i7;
    }

    public static boolean E(H4.m mVar) {
        return mVar.f3312a.size() >= 4 && mVar.l(0).equals("projects") && mVar.l(2).equals("databases");
    }

    public static P2 M(char c3) {
        return new P2(6, new u1.c(new D3.b(c3), 3), D3.d.f1714b);
    }

    public static String S(N6.d dVar) {
        long j = dVar.f4797b;
        if (j <= 64) {
            return dVar.h().c();
        }
        return dVar.i((int) Math.min(j, 64L)).c() + "...";
    }

    public static AbstractC0178k i(C0590o0 c0590o0) {
        int ordinal = c0590o0.B().ordinal();
        int i7 = 1;
        if (ordinal == 0) {
            C0572f0 y4 = c0590o0.y();
            ArrayList arrayList = new ArrayList();
            Iterator it = y4.y().iterator();
            while (it.hasNext()) {
                arrayList.add(i((C0590o0) it.next()));
            }
            int ordinal2 = y4.z().ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    p3.f.F("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                i7 = 2;
            }
            return new C0171d(i7, arrayList);
        }
        EnumC0176i enumC0176i = EnumC0176i.NOT_EQUAL;
        EnumC0176i enumC0176i2 = EnumC0176i.EQUAL;
        if (ordinal != 1) {
            if (ordinal != 2) {
                p3.f.F("Unrecognized Filter.filterType %d", c0590o0.B());
                throw null;
            }
            Y4.u0 C3 = c0590o0.C();
            H4.j y5 = H4.j.y(C3.y().x());
            int ordinal3 = C3.z().ordinal();
            if (ordinal3 == 1) {
                return C0177j.e(y5, enumC0176i2, H4.o.f3334a);
            }
            if (ordinal3 == 2) {
                return C0177j.e(y5, enumC0176i2, H4.o.f3335b);
            }
            if (ordinal3 == 3) {
                return C0177j.e(y5, enumC0176i, H4.o.f3334a);
            }
            if (ordinal3 == 4) {
                return C0177j.e(y5, enumC0176i, H4.o.f3335b);
            }
            p3.f.F("Unrecognized UnaryFilter.operator %d", C3.z());
            throw null;
        }
        C0580j0 A7 = c0590o0.A();
        H4.j y7 = H4.j.y(A7.z().x());
        EnumC0578i0 A8 = A7.A();
        switch (A8.ordinal()) {
            case 1:
                enumC0176i = EnumC0176i.LESS_THAN;
                break;
            case 2:
                enumC0176i = EnumC0176i.LESS_THAN_OR_EQUAL;
                break;
            case 3:
                enumC0176i = EnumC0176i.GREATER_THAN;
                break;
            case 4:
                enumC0176i = EnumC0176i.GREATER_THAN_OR_EQUAL;
                break;
            case 5:
                enumC0176i = enumC0176i2;
                break;
            case 6:
                break;
            case 7:
                enumC0176i = EnumC0176i.ARRAY_CONTAINS;
                break;
            case 8:
                enumC0176i = EnumC0176i.IN;
                break;
            case 9:
                enumC0176i = EnumC0176i.ARRAY_CONTAINS_ANY;
                break;
            case 10:
                enumC0176i = EnumC0176i.NOT_IN;
                break;
            default:
                p3.f.F("Unhandled FieldFilter.operator %d", A8);
                throw null;
        }
        return C0177j.e(y7, enumC0176i, A7.B());
    }

    public static I4.k l(Y4.Q0 q02, H4.n nVar) {
        H4.n n2 = n(q02.x());
        if (!H4.n.f3332b.equals(n2)) {
            nVar = n2;
        }
        int w7 = q02.w();
        ArrayList arrayList = new ArrayList(w7);
        for (int i7 = 0; i7 < w7; i7++) {
            arrayList.add(q02.v(i7));
        }
        return new I4.k(nVar, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static E4.I m(String str, Y4.v0 v0Var) {
        H4.m mVar;
        String str2;
        List emptyList;
        int H7;
        List emptyList2;
        int i7;
        H4.m y4 = H4.m.y(str);
        p3.f.O("Tried to deserialize invalid key %s", E(y4), y4);
        H4.m z4 = y4.f3312a.size() == 4 ? H4.m.f3331b : z(y4);
        int E7 = v0Var.E();
        if (E7 > 0) {
            p3.f.O("StructuredQuery.from with more than one collection is not supported.", E7 == 1, new Object[0]);
            C0566c0 D7 = v0Var.D();
            if (D7.x()) {
                mVar = z4;
                str2 = D7.y();
                if (v0Var.N()) {
                    emptyList = Collections.emptyList();
                } else {
                    AbstractC0178k i8 = i(v0Var.J());
                    if (i8 instanceof C0171d) {
                        C0171d c0171d = (C0171d) i8;
                        ArrayList arrayList = c0171d.f2171a;
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((AbstractC0178k) it.next()) instanceof C0171d) {
                                    break;
                                }
                            } else if (c0171d.e()) {
                                emptyList = Collections.unmodifiableList(arrayList);
                            }
                        }
                    }
                    emptyList = Collections.singletonList(i8);
                }
                List list = emptyList;
                H7 = v0Var.H();
                if (H7 <= 0) {
                    ArrayList arrayList2 = new ArrayList(H7);
                    for (int i9 = 0; i9 < H7; i9++) {
                        C0594q0 G2 = v0Var.G(i9);
                        H4.j y5 = H4.j.y(G2.y().x());
                        int ordinal = G2.x().ordinal();
                        if (ordinal != 1) {
                            i7 = 2;
                            if (ordinal != 2) {
                                p3.f.F("Unrecognized direction %d", G2.x());
                                throw null;
                            }
                        } else {
                            i7 = 1;
                        }
                        arrayList2.add(new E4.A(i7, y5));
                    }
                    emptyList2 = arrayList2;
                } else {
                    emptyList2 = Collections.emptyList();
                }
                return new E4.I(mVar, str2, list, emptyList2, !v0Var.L() ? v0Var.F().x() : -1L, !v0Var.M() ? new C0170c(v0Var.I().a(), v0Var.I().x()) : null, v0Var.K() ? new C0170c(v0Var.C().a(), !v0Var.C().x()) : null);
            }
            z4 = (H4.m) z4.b(D7.y());
        }
        mVar = z4;
        str2 = null;
        if (v0Var.N()) {
        }
        List list2 = emptyList;
        H7 = v0Var.H();
        if (H7 <= 0) {
        }
        return new E4.I(mVar, str2, list2, emptyList2, !v0Var.L() ? v0Var.F().x() : -1L, !v0Var.M() ? new C0170c(v0Var.I().a(), v0Var.I().x()) : null, v0Var.K() ? new C0170c(v0Var.C().a(), !v0Var.C().x()) : null);
    }

    public static H4.n n(com.google.protobuf.z0 z0Var) {
        return (z0Var.z() == 0 && z0Var.y() == 0) ? H4.n.f3332b : new H4.n(new Timestamp(z0Var.z(), z0Var.y()));
    }

    public static void o(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e7) {
            Log.w("SupportSQLite", "delete failed: ", e7);
        }
    }

    public static C0590o0 s(AbstractC0178k abstractC0178k) {
        EnumC0570e0 enumC0570e0;
        EnumC0578i0 enumC0578i0;
        if (!(abstractC0178k instanceof C0177j)) {
            if (!(abstractC0178k instanceof C0171d)) {
                p3.f.F("Unrecognized filter type %s", abstractC0178k.toString());
                throw null;
            }
            C0171d c0171d = (C0171d) abstractC0178k;
            ArrayList arrayList = new ArrayList(Collections.unmodifiableList(c0171d.f2171a).size());
            Iterator it = Collections.unmodifiableList(c0171d.f2171a).iterator();
            while (it.hasNext()) {
                arrayList.add(s((AbstractC0178k) it.next()));
            }
            if (arrayList.size() == 1) {
                return (C0590o0) arrayList.get(0);
            }
            C0568d0 A7 = C0572f0.A();
            int e7 = t.e.e(c0171d.f2172b);
            if (e7 == 0) {
                enumC0570e0 = EnumC0570e0.AND;
            } else {
                if (e7 != 1) {
                    p3.f.F("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                enumC0570e0 = EnumC0570e0.OR;
            }
            A7.d();
            C0572f0.v((C0572f0) A7.f12096b, enumC0570e0);
            A7.d();
            C0572f0.w((C0572f0) A7.f12096b, arrayList);
            C0586m0 D7 = C0590o0.D();
            D7.d();
            C0590o0.x((C0590o0) D7.f12096b, (C0572f0) A7.b());
            return (C0590o0) D7.b();
        }
        C0177j c0177j = (C0177j) abstractC0178k;
        EnumC0176i enumC0176i = c0177j.f2199a;
        EnumC0176i enumC0176i2 = EnumC0176i.EQUAL;
        H4.j jVar = c0177j.f2201c;
        Y4.I0 i02 = c0177j.f2200b;
        if (enumC0176i == enumC0176i2 || enumC0176i == EnumC0176i.NOT_EQUAL) {
            Y4.s0 A8 = Y4.u0.A();
            C0582k0 y4 = C0584l0.y();
            String c3 = jVar.c();
            y4.d();
            C0584l0.v((C0584l0) y4.f12096b, c3);
            C0584l0 c0584l0 = (C0584l0) y4.b();
            A8.d();
            Y4.u0.w((Y4.u0) A8.f12096b, c0584l0);
            Y4.I0 i03 = H4.o.f3334a;
            if (i02 != null && Double.isNaN(i02.K())) {
                Y4.t0 t0Var = enumC0176i == enumC0176i2 ? Y4.t0.IS_NAN : Y4.t0.IS_NOT_NAN;
                A8.d();
                Y4.u0.v((Y4.u0) A8.f12096b, t0Var);
                C0586m0 D8 = C0590o0.D();
                D8.d();
                C0590o0.w((C0590o0) D8.f12096b, (Y4.u0) A8.b());
                return (C0590o0) D8.b();
            }
            if (i02 != null && i02.R() == 1) {
                Y4.t0 t0Var2 = enumC0176i == enumC0176i2 ? Y4.t0.IS_NULL : Y4.t0.IS_NOT_NULL;
                A8.d();
                Y4.u0.v((Y4.u0) A8.f12096b, t0Var2);
                C0586m0 D9 = C0590o0.D();
                D9.d();
                C0590o0.w((C0590o0) D9.f12096b, (Y4.u0) A8.b());
                return (C0590o0) D9.b();
            }
        }
        C0576h0 C3 = C0580j0.C();
        C0582k0 y5 = C0584l0.y();
        String c4 = jVar.c();
        y5.d();
        C0584l0.v((C0584l0) y5.f12096b, c4);
        C0584l0 c0584l02 = (C0584l0) y5.b();
        C3.d();
        C0580j0.v((C0580j0) C3.f12096b, c0584l02);
        switch (enumC0176i.ordinal()) {
            case 0:
                enumC0578i0 = EnumC0578i0.LESS_THAN;
                break;
            case 1:
                enumC0578i0 = EnumC0578i0.LESS_THAN_OR_EQUAL;
                break;
            case 2:
                enumC0578i0 = EnumC0578i0.EQUAL;
                break;
            case 3:
                enumC0578i0 = EnumC0578i0.NOT_EQUAL;
                break;
            case 4:
                enumC0578i0 = EnumC0578i0.GREATER_THAN;
                break;
            case 5:
                enumC0578i0 = EnumC0578i0.GREATER_THAN_OR_EQUAL;
                break;
            case 6:
                enumC0578i0 = EnumC0578i0.ARRAY_CONTAINS;
                break;
            case 7:
                enumC0578i0 = EnumC0578i0.ARRAY_CONTAINS_ANY;
                break;
            case 8:
                enumC0578i0 = EnumC0578i0.IN;
                break;
            case 9:
                enumC0578i0 = EnumC0578i0.NOT_IN;
                break;
            default:
                p3.f.F("Unknown operator %d", enumC0176i);
                throw null;
        }
        C3.d();
        C0580j0.w((C0580j0) C3.f12096b, enumC0578i0);
        C3.d();
        C0580j0.x((C0580j0) C3.f12096b, i02);
        C0586m0 D10 = C0590o0.D();
        D10.d();
        C0590o0.v((C0590o0) D10.f12096b, (C0580j0) C3.b());
        return (C0590o0) D10.b();
    }

    public static String x(H4.f fVar, H4.m mVar) {
        List asList = Arrays.asList("projects", fVar.f3313a, "databases", fVar.f3314b);
        H4.m mVar2 = H4.m.f3331b;
        return ((H4.m) ((H4.m) (asList.isEmpty() ? H4.m.f3331b : new H4.m(asList)).b("documents")).a(mVar)).c();
    }

    public static com.google.protobuf.z0 y(Timestamp timestamp) {
        com.google.protobuf.y0 A7 = com.google.protobuf.z0.A();
        A7.f(timestamp.f11828a);
        A7.d();
        com.google.protobuf.z0.w((com.google.protobuf.z0) A7.f12096b, timestamp.f11829b);
        return (com.google.protobuf.z0) A7.b();
    }

    public static H4.m z(H4.m mVar) {
        p3.f.O("Tried to deserialize invalid key %s", mVar.f3312a.size() > 4 && mVar.l(4).equals("documents"), mVar);
        return (H4.m) mVar.p();
    }

    public AlgorithmParameterSpec A() {
        return null;
    }

    public Cipher B() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public String C(String str) {
        String str2 = (String) this.f17509c;
        Resources resources = (Resources) this.f17508b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean D() {
        return ((Logger) this.f17508b).isLoggable((Level) this.f17509c);
    }

    public void F(int i7, int i8, N6.d dVar, int i9, boolean z4) {
        if (D()) {
            ((Logger) this.f17508b).log((Level) this.f17509c, AbstractC0486a1.v(i7) + " DATA: streamId=" + i8 + " endStream=" + z4 + " length=" + i9 + " bytes=" + S(dVar));
        }
    }

    public void G(int i7, int i8, Z5.a aVar, N6.f fVar) {
        if (D()) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0486a1.v(i7));
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i8);
            sb.append(" errorCode=");
            sb.append(aVar);
            sb.append(" length=");
            sb.append(fVar.b());
            sb.append(" bytes=");
            N6.d dVar = new N6.d();
            fVar.z(dVar, fVar.b());
            sb.append(S(dVar));
            ((Logger) this.f17508b).log((Level) this.f17509c, sb.toString());
        }
    }

    public void H(int i7, long j) {
        if (D()) {
            ((Logger) this.f17508b).log((Level) this.f17509c, AbstractC0486a1.v(i7) + " PING: ack=false bytes=" + j);
        }
    }

    public void I(int i7, int i8, Z5.a aVar) {
        if (D()) {
            ((Logger) this.f17508b).log((Level) this.f17509c, AbstractC0486a1.v(i7) + " RST_STREAM: streamId=" + i8 + " errorCode=" + aVar);
        }
    }

    public void J(int i7, B.v vVar) {
        if (D()) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0486a1.v(i7));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(X5.n.class);
            for (X5.n nVar : X5.n.values()) {
                if (vVar.k(nVar.f7606a)) {
                    enumMap.put((EnumMap) nVar, (X5.n) Integer.valueOf(((int[]) vVar.f966c)[nVar.f7606a]));
                }
            }
            sb.append(enumMap.toString());
            ((Logger) this.f17508b).log((Level) this.f17509c, sb.toString());
        }
    }

    public void K(int i7, long j, int i8) {
        if (D()) {
            ((Logger) this.f17508b).log((Level) this.f17509c, AbstractC0486a1.v(i7) + " WINDOW_UPDATE: streamId=" + i8 + " windowSizeIncrement=" + j);
        }
    }

    public KeyGenParameterSpec L(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f17508b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(L.i("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public void N(M.d dVar) {
        int i7 = dVar.f4527b;
        Handler handler = (Handler) this.f17509c;
        A1.x0 x0Var = (A1.x0) this.f17508b;
        if (i7 != 0) {
            handler.post(new RunnableC0085d(x0Var, i7));
        } else {
            handler.post(new D6.y0(12, x0Var, dVar.f4526a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003c A[EDGE_INSN: B:79:0x003c->B:63:0x003c BREAK  A[LOOP:3: B:43:0x0026->B:64:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(K0.b bVar, int i7, int i8) {
        List list;
        TreeMap treeMap;
        boolean z4;
        D0.a aVar = (D0.a) this.f17508b;
        C1023h c1023h = (C1023h) this.f17509c;
        if (aVar != null) {
            D0.i iVar = (D0.i) aVar.f1622f;
            iVar.getClass();
            if (i7 == i8) {
                list = Collections.emptyList();
            } else {
                boolean z7 = i8 > i7;
                ArrayList arrayList = new ArrayList();
                int i9 = i7;
                do {
                    if (z7) {
                        if (i9 >= i8) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) iVar.f1652a.get(Integer.valueOf(i9));
                        if (treeMap == null) {
                            break;
                        }
                        for (Integer num : z7 ? treeMap.descendingKeySet() : treeMap.keySet()) {
                            int intValue = num.intValue();
                            if (z7) {
                                if (intValue <= i8 && intValue > i9) {
                                    arrayList.add(treeMap.get(num));
                                    z4 = true;
                                    i9 = intValue;
                                    break;
                                }
                            } else if (intValue >= i8 && intValue < i9) {
                                arrayList.add(treeMap.get(num));
                                z4 = true;
                                i9 = intValue;
                                break;
                                break;
                            }
                        }
                        z4 = false;
                    } else {
                        if (i9 <= i8) {
                            list = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) iVar.f1652a.get(Integer.valueOf(i9));
                        if (treeMap == null) {
                        }
                    }
                } while (z4);
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Cursor i10 = bVar.i("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (i10.moveToNext()) {
                    try {
                        arrayList2.add(i10.getString(0));
                    } catch (Throwable th) {
                        i10.close();
                        throw th;
                    }
                }
                i10.close();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.g("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((E0.a) it2.next()).a(bVar);
                }
                B3.g b02 = C1023h.b0(bVar);
                if (!b02.f1063b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) b02.f1064c));
                }
                U(bVar);
                return;
            }
        }
        D0.a aVar2 = (D0.a) this.f17508b;
        if (aVar2 != null) {
            if (!((i7 <= i8 || !aVar2.f1618b) ? aVar2.f1617a : false)) {
                bVar.g("DROP TABLE IF EXISTS `Dependency`");
                bVar.g("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.g("DROP TABLE IF EXISTS `WorkTag`");
                bVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.g("DROP TABLE IF EXISTS `WorkName`");
                bVar.g("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.g("DROP TABLE IF EXISTS `Preference`");
                int i11 = WorkDatabase_Impl.f9870s;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1023h.f12667a;
                ArrayList arrayList3 = workDatabase_Impl.f1659g;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((C0999f) workDatabase_Impl.f1659g.get(i12)).getClass();
                    }
                }
                C1023h.Z(bVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void P(C0434a c0434a, Object obj) {
        if (((IdentityHashMap) this.f17509c) == null) {
            this.f17509c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f17509c).put(c0434a, obj);
    }

    public void Q(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f17509c;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    public List R(CharSequence charSequence) {
        charSequence.getClass();
        D3.n nVar = new D3.n((u1.c) this.f17509c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (nVar.hasNext()) {
            arrayList.add((String) nVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Key T(byte[] bArr) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f17508b;
        Key key = keyStore.getKey(str, null);
        if (key == null) {
            throw new Exception(L.i("No key found under alias: ", str));
        }
        if (!(key instanceof PrivateKey)) {
            throw new Exception("Not an instance of a PrivateKey");
        }
        Cipher B7 = B();
        B7.init(4, (PrivateKey) key, A());
        return B7.unwrap(bArr, "AES", 3);
    }

    public void U(K0.b bVar) {
        bVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public C0435b b() {
        if (((IdentityHashMap) this.f17509c) != null) {
            for (Map.Entry entry : ((C0435b) this.f17508b).f6455a.entrySet()) {
                if (!((IdentityHashMap) this.f17509c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f17509c).put((C0434a) entry.getKey(), entry.getValue());
                }
            }
            this.f17508b = new C0435b((IdentityHashMap) this.f17509c);
            this.f17509c = null;
        }
        return (C0435b) this.f17508b;
    }

    @Override // u2.M
    public Object c(Uri uri, C1638o c1638o) {
        InterfaceC0779a interfaceC0779a = (InterfaceC0779a) ((u2.M) this.f17508b).c(uri, c1638o);
        List list = (List) this.f17509c;
        return (list == null || list.isEmpty()) ? interfaceC0779a : (InterfaceC0779a) interfaceC0779a.a(list);
    }

    public void d() {
        ((P2.F) this.f17508b).f5420b = true;
        ((ScheduledFuture) this.f17509c).cancel(false);
    }

    public HashMap e(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), f((Y4.I0) entry.getValue()));
        }
        return hashMap;
    }

    public Object f(Y4.I0 i02) {
        Y4.I0 t7;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        switch (H4.o.l(i02)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(i02.H());
            case 2:
                return t.e.b(i02.R(), 3) ? Long.valueOf(i02.M()) : Double.valueOf(i02.K());
            case 3:
                com.google.protobuf.z0 Q6 = i02.Q();
                return new Timestamp(Q6.z(), Q6.y());
            case 4:
                int ordinal = ((EnumC0071o) this.f17509c).ordinal();
                if (ordinal == 1) {
                    com.google.protobuf.z0 s7 = Y4.D.s(i02);
                    return new Timestamp(s7.z(), s7.y());
                }
                if (ordinal == 2 && (t7 = Y4.D.t(i02)) != null) {
                    return f(t7);
                }
                return null;
            case 5:
                return i02.P();
            case 6:
                AbstractC0911k I7 = i02.I();
                AbstractC0603a.f(I7, "Provided ByteString must not be null.");
                return new C0063g(I7);
            case 7:
                H4.m y4 = H4.m.y(i02.O());
                if (y4.f3312a.size() > 3 && y4.l(0).equals("projects") && y4.l(2).equals("databases")) {
                    z4 = true;
                }
                p3.f.O("Tried to parse an invalid resource name: %s", z4, y4);
                String l7 = y4.l(1);
                String l8 = y4.l(3);
                H4.f fVar = new H4.f(l7, l8);
                H4.h c3 = H4.h.c(i02.O());
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f17508b;
                H4.f fVar2 = firebaseFirestore.f11964c;
                if (!fVar.equals(fVar2)) {
                    Q0.a.v(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", c3.f3318a, l7, l8, fVar2.f3313a, fVar2.f3314b);
                }
                return new C0070n(c3, firebaseFirestore);
            case 8:
                return new B4.M(i02.L().y(), i02.L().z());
            case 9:
                C0569e G2 = i02.G();
                ArrayList arrayList = new ArrayList(G2.A());
                Iterator it = G2.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(f((Y4.I0) it.next()));
                }
                return arrayList;
            case 10:
                List a2 = ((Y4.I0) i02.N().y().get("value")).G().a();
                double[] dArr = new double[a2.size()];
                for (int i7 = 0; i7 < a2.size(); i7++) {
                    dArr[i7] = ((Y4.I0) a2.get(i7)).K();
                }
                return new B4.j0(dArr);
            case 11:
                return e(i02.N().y());
            default:
                p3.f.F("Unknown value type: ".concat(AbstractC0486a1.w(i02.R())), new Object[0]);
                throw null;
        }
    }

    @Override // R1.j
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public R1.b a(R1.i iVar) {
        MediaCodec mediaCodec;
        String str = iVar.f5919a.f5925a;
        R1.b bVar = null;
        try {
            AbstractC1664a.c("createCodec:" + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                R1.b bVar2 = new R1.b(mediaCodec, (HandlerThread) ((A1.B) this.f17508b).get(), (HandlerThread) ((A1.B) this.f17509c).get());
                try {
                    AbstractC1664a.m();
                    R1.b.a(bVar2, iVar.f5920b, iVar.f5922d, iVar.f5923e);
                    return bVar2;
                } catch (Exception e7) {
                    e = e7;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodec = null;
        }
    }

    public String h() {
        return ((Context) this.f17509c).getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public H4.h j(String str) {
        H4.m y4 = H4.m.y(str);
        p3.f.O("Tried to deserialize invalid key %s", E(y4), y4);
        String l7 = y4.l(1);
        H4.f fVar = (H4.f) this.f17508b;
        p3.f.O("Tried to deserialize key from different project.", l7.equals(fVar.f3313a), new Object[0]);
        p3.f.O("Tried to deserialize key from different database.", y4.l(3).equals(fVar.f3314b), new Object[0]);
        return new H4.h(z(y4));
    }

    public I4.h k(Y4.L0 l02) {
        I4.n nVar;
        I4.g gVar;
        if (l02.J()) {
            Y4.M B7 = l02.B();
            int e7 = t.e.e(B7.x());
            if (e7 == 0) {
                nVar = I4.n.a(B7.z());
            } else if (e7 == 1) {
                nVar = new I4.n(n(B7.A()), null);
            } else {
                if (e7 != 2) {
                    p3.f.F("Unknown precondition", new Object[0]);
                    throw null;
                }
                nVar = I4.n.f3688c;
            }
        } else {
            nVar = I4.n.f3688c;
        }
        I4.n nVar2 = nVar;
        ArrayList arrayList = new ArrayList();
        for (Y4.A a2 : l02.H()) {
            int e8 = t.e.e(a2.F());
            if (e8 == 0) {
                p3.f.O("Unknown transform setToServerValue: %s", a2.E() == EnumC0602z.REQUEST_TIME, a2.E());
                gVar = new I4.g(H4.j.y(a2.B()), I4.o.f3691a);
            } else if (e8 == 1) {
                gVar = new I4.g(H4.j.y(a2.B()), new I4.l(a2.C()));
            } else if (e8 == 4) {
                gVar = new I4.g(H4.j.y(a2.B()), new I4.b(a2.A().a()));
            } else {
                if (e8 != 5) {
                    p3.f.F("Unknown FieldTransform proto: %s", a2);
                    throw null;
                }
                gVar = new I4.g(H4.j.y(a2.B()), new I4.a(a2.D().a()));
            }
            arrayList.add(gVar);
        }
        int ordinal = l02.D().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new I4.e(j(l02.C()), nVar2);
            }
            if (ordinal == 2) {
                return new I4.r(j(l02.I()), nVar2);
            }
            p3.f.F("Unknown mutation operation: %d", l02.D());
            throw null;
        }
        if (!l02.M()) {
            return new I4.p(j(l02.F().A()), H4.l.e(l02.F().z()), nVar2, arrayList);
        }
        H4.h j = j(l02.F().A());
        H4.l e9 = H4.l.e(l02.F().z());
        C0599w G2 = l02.G();
        int y4 = G2.y();
        HashSet hashSet = new HashSet(y4);
        for (int i7 = 0; i7 < y4; i7++) {
            hashSet.add(H4.j.y(G2.x(i7)));
        }
        return new I4.m(j, e9, new I4.f(hashSet), nVar2, arrayList);
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        Toast toast;
        t6.h.e(oVar, "call");
        String str = oVar.f676a;
        if (!t6.h.a(str, "showToast")) {
            if (!t6.h.a(str, "cancel")) {
                ((A5.p) rVar).notImplemented();
                return;
            }
            Toast toast2 = (Toast) this.f17509c;
            if (toast2 != null) {
                toast2.cancel();
                this.f17509c = null;
            }
            ((A5.p) rVar).success(Boolean.TRUE);
            return;
        }
        String valueOf = String.valueOf(oVar.a("msg"));
        String valueOf2 = String.valueOf(oVar.a(SentryEnvelopeItemHeader.JsonKeys.LENGTH));
        String valueOf3 = String.valueOf(oVar.a("gravity"));
        Number number = (Number) oVar.a("bgcolor");
        Number number2 = (Number) oVar.a("textcolor");
        Number number3 = (Number) oVar.a("fontSize");
        String str2 = (String) oVar.a("fontAsset");
        int i7 = valueOf3.equals(RRWebVideoEvent.JsonKeys.TOP) ? 48 : valueOf3.equals("center") ? 17 : 80;
        boolean equals = valueOf2.equals("long");
        Context context = (Context) this.f17508b;
        if (number != null) {
            Object systemService = context.getSystemService("layout_inflater");
            t6.h.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setText(valueOf);
            Drawable drawable = context.getDrawable(R.drawable.corner);
            t6.h.b(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(context);
            this.f17509c = toast3;
            toast3.setDuration(equals ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = context.getAssets();
                t6.h.d(assets, "getAssets(...)");
                String a2 = ((C1649c) android.support.v4.media.session.t.l0().f8076b).a(str2);
                t6.h.d(a2, "getLookupKeyForAsset(...)");
                textView.setTypeface(Typeface.createFromAsset(assets, a2));
            }
            Toast toast4 = (Toast) this.f17509c;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str2);
            Toast makeText = Toast.makeText(context, valueOf, equals ? 1 : 0);
            this.f17509c = makeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = makeText != null ? makeText.getView() : null;
                t6.h.b(view);
                View findViewById = view.findViewById(android.R.id.message);
                t6.h.d(findViewById, "findViewById(...)");
                TextView textView2 = (TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = context.getAssets();
                    t6.h.d(assets2, "getAssets(...)");
                    String a4 = ((C1649c) android.support.v4.media.session.t.l0().f8076b).a(str2);
                    t6.h.d(a4, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, a4));
                }
            }
        }
        try {
            if (i7 == 17) {
                Toast toast5 = (Toast) this.f17509c;
                if (toast5 != null) {
                    toast5.setGravity(i7, 0, 0);
                }
            } else if (i7 != 48) {
                Toast toast6 = (Toast) this.f17509c;
                if (toast6 != null) {
                    toast6.setGravity(i7, 0, 100);
                }
            } else {
                Toast toast7 = (Toast) this.f17509c;
                if (toast7 != null) {
                    toast7.setGravity(i7, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        if (context instanceof Activity) {
            t6.h.c(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new A1.K0(this, 15));
        } else {
            Toast toast8 = (Toast) this.f17509c;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f17509c) != null) {
            toast.addCallback(new T5.b(this));
        }
        ((A5.p) rVar).success(Boolean.TRUE);
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, s5.f fVar) {
        F0 f02 = (F0) this.f17509c;
        try {
            ((A5.b) this.f17508b).i(((A5.n) f02.f17375d).b(byteBuffer), new V0(2, this, fVar));
        } catch (RuntimeException e7) {
            Log.e("BasicMessageChannel#" + ((String) f02.f17374c), "Failed to handle message", e7);
            fVar.a(null);
        }
    }

    public void q(D1.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f17508b;
        if (handler != null) {
            handler.post(new A0.f(5, this, eVar));
        }
    }

    @Override // G6.g
    public Object r(G6.h hVar, InterfaceC1287d interfaceC1287d) {
        Object r7 = ((V0) this.f17508b).r(new G6.e(new t6.n(), hVar, (C0769q) this.f17509c), interfaceC1287d);
        return r7 == j6.a.f14642a ? r7 : C1116i.f13008a;
    }

    public String toString() {
        switch (this.f17507a) {
            case 25:
                return "Request{url=" + ((C0623a) this.f17508b) + '}';
            default:
                return super.toString();
        }
    }

    public String u(H4.h hVar) {
        return x((H4.f) this.f17508b, hVar.f3318a);
    }

    public Y4.L0 v(I4.h hVar) {
        Y4.M m7;
        com.google.protobuf.C b7;
        Y4.J0 N7 = Y4.L0.N();
        if (hVar instanceof I4.p) {
            H4.h hVar2 = hVar.f3670a;
            H4.l lVar = ((I4.p) hVar).f3692d;
            C0593q C3 = C0595s.C();
            String u4 = u(hVar2);
            C3.d();
            C0595s.v((C0595s) C3.f12096b, u4);
            Map y4 = lVar.b().N().y();
            C3.d();
            C0595s.w((C0595s) C3.f12096b).putAll(y4);
            C0595s c0595s = (C0595s) C3.b();
            N7.d();
            Y4.L0.x((Y4.L0) N7.f12096b, c0595s);
        } else if (hVar instanceof I4.m) {
            H4.h hVar3 = hVar.f3670a;
            H4.l lVar2 = ((I4.m) hVar).f3686d;
            C0593q C7 = C0595s.C();
            String u7 = u(hVar3);
            C7.d();
            C0595s.v((C0595s) C7.f12096b, u7);
            Map y5 = lVar2.b().N().y();
            C7.d();
            C0595s.w((C0595s) C7.f12096b).putAll(y5);
            C0595s c0595s2 = (C0595s) C7.b();
            N7.d();
            Y4.L0.x((Y4.L0) N7.f12096b, c0595s2);
            C0598v z4 = C0599w.z();
            Iterator it = ((I4.m) hVar).f3687e.f3667a.iterator();
            while (it.hasNext()) {
                String c3 = ((H4.j) it.next()).c();
                z4.d();
                C0599w.v((C0599w) z4.f12096b, c3);
            }
            C0599w c0599w = (C0599w) z4.b();
            N7.d();
            Y4.L0.v((Y4.L0) N7.f12096b, c0599w);
        } else if (hVar instanceof I4.e) {
            String u8 = u(hVar.f3670a);
            N7.d();
            Y4.L0.z((Y4.L0) N7.f12096b, u8);
        } else {
            if (!(hVar instanceof I4.r)) {
                p3.f.F("unknown mutation type %s", hVar.getClass());
                throw null;
            }
            String u9 = u(hVar.f3670a);
            N7.d();
            Y4.L0.A((Y4.L0) N7.f12096b, u9);
        }
        for (I4.g gVar : hVar.f3672c) {
            I4.q qVar = gVar.f3669b;
            boolean z7 = qVar instanceof I4.o;
            H4.j jVar = gVar.f3668a;
            if (z7) {
                C0601y G2 = Y4.A.G();
                String c4 = jVar.c();
                G2.d();
                Y4.A.w((Y4.A) G2.f12096b, c4);
                G2.d();
                Y4.A.y((Y4.A) G2.f12096b);
                b7 = G2.b();
            } else if (qVar instanceof I4.b) {
                C0601y G7 = Y4.A.G();
                String c7 = jVar.c();
                G7.d();
                Y4.A.w((Y4.A) G7.f12096b, c7);
                C0567d B7 = C0569e.B();
                B7.d();
                C0569e.w((C0569e) B7.f12096b, ((I4.b) qVar).f3663a);
                G7.d();
                Y4.A.v((Y4.A) G7.f12096b, (C0569e) B7.b());
                b7 = G7.b();
            } else if (qVar instanceof I4.a) {
                C0601y G8 = Y4.A.G();
                String c8 = jVar.c();
                G8.d();
                Y4.A.w((Y4.A) G8.f12096b, c8);
                C0567d B8 = C0569e.B();
                B8.d();
                C0569e.w((C0569e) B8.f12096b, ((I4.a) qVar).f3663a);
                G8.d();
                Y4.A.x((Y4.A) G8.f12096b, (C0569e) B8.b());
                b7 = G8.b();
            } else {
                if (!(qVar instanceof I4.l)) {
                    p3.f.F("Unknown transform: %s", qVar);
                    throw null;
                }
                C0601y G9 = Y4.A.G();
                String c9 = jVar.c();
                G9.d();
                Y4.A.w((Y4.A) G9.f12096b, c9);
                Y4.I0 i02 = ((I4.l) qVar).f3685a;
                G9.d();
                Y4.A.z((Y4.A) G9.f12096b, i02);
                b7 = G9.b();
            }
            N7.d();
            Y4.L0.w((Y4.L0) N7.f12096b, (Y4.A) b7);
        }
        I4.n nVar = hVar.f3671b;
        H4.n nVar2 = nVar.f3689a;
        Boolean bool = nVar.f3690b;
        if (nVar2 != null || bool != null) {
            p3.f.O("Can't serialize an empty precondition", !(nVar2 == null && bool == null), new Object[0]);
            Y4.L B9 = Y4.M.B();
            H4.n nVar3 = nVar.f3689a;
            if (nVar3 != null) {
                com.google.protobuf.z0 y7 = y(nVar3.f3333a);
                B9.d();
                Y4.M.w((Y4.M) B9.f12096b, y7);
                m7 = (Y4.M) B9.b();
            } else {
                if (bool == null) {
                    p3.f.F("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean booleanValue = bool.booleanValue();
                B9.d();
                Y4.M.v((Y4.M) B9.f12096b, booleanValue);
                m7 = (Y4.M) B9.b();
            }
            N7.d();
            Y4.L0.y((Y4.L0) N7.f12096b, m7);
        }
        return (Y4.L0) N7.b();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable, java.lang.Object] */
    public Y4.A0 w(E4.I i7) {
        Y4.z0 A7 = Y4.A0.A();
        C0562a0 O7 = Y4.v0.O();
        H4.m mVar = i7.f2126d;
        H4.f fVar = (H4.f) this.f17508b;
        String str = i7.f2127e;
        if (str != null) {
            p3.f.O("Collection Group queries should be within a document path or root.", mVar.f3312a.size() % 2 == 0, new Object[0]);
            String x4 = x(fVar, mVar);
            A7.d();
            Y4.A0.w((Y4.A0) A7.f12096b, x4);
            C0564b0 z4 = C0566c0.z();
            z4.d();
            C0566c0.v((C0566c0) z4.f12096b, str);
            z4.d();
            C0566c0.w((C0566c0) z4.f12096b);
            O7.d();
            Y4.v0.v((Y4.v0) O7.f12096b, (C0566c0) z4.b());
        } else {
            p3.f.O("Document queries with filters are not supported.", mVar.f3312a.size() % 2 != 0, new Object[0]);
            String x7 = x(fVar, (H4.m) mVar.t());
            A7.d();
            Y4.A0.w((Y4.A0) A7.f12096b, x7);
            C0564b0 z7 = C0566c0.z();
            String h6 = mVar.h();
            z7.d();
            C0566c0.v((C0566c0) z7.f12096b, h6);
            O7.d();
            Y4.v0.v((Y4.v0) O7.f12096b, (C0566c0) z7.b());
        }
        List list = i7.f2125c;
        if (list.size() > 0) {
            C0590o0 s7 = s(new C0171d(1, list));
            O7.d();
            Y4.v0.w((Y4.v0) O7.f12096b, s7);
        }
        for (E4.A a2 : i7.f2124b) {
            C0592p0 z8 = C0594q0.z();
            if (t.e.b(a2.f2084a, 1)) {
                EnumC0574g0 enumC0574g0 = EnumC0574g0.ASCENDING;
                z8.d();
                C0594q0.w((C0594q0) z8.f12096b, enumC0574g0);
            } else {
                EnumC0574g0 enumC0574g02 = EnumC0574g0.DESCENDING;
                z8.d();
                C0594q0.w((C0594q0) z8.f12096b, enumC0574g02);
            }
            C0582k0 y4 = C0584l0.y();
            String c3 = a2.f2085b.c();
            y4.d();
            C0584l0.v((C0584l0) y4.f12096b, c3);
            C0584l0 c0584l0 = (C0584l0) y4.b();
            z8.d();
            C0594q0.v((C0594q0) z8.f12096b, c0584l0);
            C0594q0 c0594q0 = (C0594q0) z8.b();
            O7.d();
            Y4.v0.x((Y4.v0) O7.f12096b, c0594q0);
        }
        if (i7.e()) {
            com.google.protobuf.D y5 = com.google.protobuf.E.y();
            int i8 = (int) i7.f2128f;
            y5.d();
            com.google.protobuf.E.v((com.google.protobuf.E) y5.f12096b, i8);
            O7.d();
            Y4.v0.A((Y4.v0) O7.f12096b, (com.google.protobuf.E) y5.b());
        }
        C0170c c0170c = i7.f2129g;
        if (c0170c != null) {
            C0589o z9 = C0591p.z();
            ?? r52 = c0170c.f2170b;
            z9.d();
            C0591p.v((C0591p) z9.f12096b, r52);
            z9.d();
            C0591p.w((C0591p) z9.f12096b, c0170c.f2169a);
            O7.d();
            Y4.v0.y((Y4.v0) O7.f12096b, (C0591p) z9.b());
        }
        C0170c c0170c2 = i7.f2130h;
        if (c0170c2 != null) {
            C0589o z10 = C0591p.z();
            ?? r32 = c0170c2.f2170b;
            z10.d();
            C0591p.v((C0591p) z10.f12096b, r32);
            boolean z11 = !c0170c2.f2169a;
            z10.d();
            C0591p.w((C0591p) z10.f12096b, z11);
            O7.d();
            Y4.v0.z((Y4.v0) O7.f12096b, (C0591p) z10.b());
        }
        A7.d();
        Y4.A0.v((Y4.A0) A7.f12096b, (Y4.v0) O7.b());
        return (Y4.A0) A7.b();
    }

    @Override // com.google.android.gms.internal.ads.zzapf
    public void zza(zzapk zzapkVar) {
        String str = "Failed to load URL: " + ((String) this.f17508b) + "\n" + zzapkVar.toString();
        int i7 = I2.J.f3546b;
        J2.j.g(str);
        ((C0313v) this.f17509c).zzc(null);
    }

    public /* synthetic */ P2(int i7, Object obj, Object obj2) {
        this.f17507a = i7;
        this.f17509c = obj;
        this.f17508b = obj2;
    }

    public /* synthetic */ P2(int i7, Object obj, Object obj2, boolean z4) {
        this.f17507a = i7;
        this.f17508b = obj;
        this.f17509c = obj2;
    }

    public P2(Context context, int i7) {
        this.f17507a = i7;
        switch (i7) {
            case 29:
                this.f17509c = context;
                String h6 = h();
                this.f17508b = h6;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.getKey(h6, null) == null) {
                    Locale locale = Locale.getDefault();
                    try {
                        Q(Locale.ENGLISH);
                        Calendar calendar = Calendar.getInstance();
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.add(1, 25);
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(L(calendar, calendar2));
                        keyPairGenerator.generateKeyPair();
                        return;
                    } finally {
                        Q(locale);
                    }
                }
                return;
            default:
                com.google.android.gms.common.internal.D.i(context);
                Resources resources = context.getResources();
                this.f17508b = resources;
                this.f17509c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public P2(int i7, byte b7) {
        this.f17507a = i7;
        switch (i7) {
            case 9:
                this.f17508b = new HashMap();
                this.f17509c = new HashMap();
                break;
            default:
                this.f17509c = new WeakHashMap();
                this.f17508b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new W5.E0(this, 2));
                break;
        }
    }

    public P2(A5.s sVar) {
        this.f17507a = 12;
        this.f17508b = new TaskCompletionSource();
        this.f17509c = sVar;
    }

    public P2(V0 v02) {
        this.f17507a = 25;
        this.f17508b = (C0623a) v02.f17562b;
        C0.I i7 = (C0.I) v02.f17563c;
        i7.getClass();
        this.f17509c = new u1.c(i7);
    }

    public P2(X0.b bVar) {
        this.f17507a = 23;
        V0 v02 = new V0(23);
        this.f17508b = bVar;
        this.f17509c = v02;
    }

    public P2(Level level) {
        this.f17507a = 24;
        Logger logger = Logger.getLogger(X5.m.class.getName());
        p3.f.k(level, "level");
        this.f17509c = level;
        p3.f.k(logger, SentryEvent.JsonKeys.LOGGER);
        this.f17508b = logger;
    }

    public P2(int i7) {
        this.f17507a = 19;
        A1.B b7 = new A1.B(i7, 2);
        A1.B b8 = new A1.B(i7, 3);
        this.f17508b = b7;
        this.f17509c = b8;
    }

    public P2(H4.f fVar) {
        this.f17507a = 15;
        this.f17508b = fVar;
        List asList = Arrays.asList("projects", fVar.f3313a, "databases", fVar.f3314b);
        H4.m mVar = H4.m.f3331b;
        this.f17509c = (asList.isEmpty() ? H4.m.f3331b : new H4.m(asList)).c();
    }

    public P2(Animation animation) {
        this.f17507a = 26;
        this.f17508b = animation;
        this.f17509c = null;
    }

    public P2(Animator animator) {
        this.f17507a = 26;
        this.f17508b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17509c = animatorSet;
        animatorSet.play(animator);
    }

    public P2(C0435b c0435b) {
        this.f17507a = 21;
        this.f17508b = c0435b;
    }

    public P2(P2.F f7, ScheduledFuture scheduledFuture) {
        this.f17507a = 22;
        this.f17508b = f7;
        p3.f.k(scheduledFuture, "future");
        this.f17509c = scheduledFuture;
    }
}
