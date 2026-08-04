package p155w1;

import A1.B;
import A1.K0;
import A1.x0;
import A5.d;
import A5.q;
import A5.s;
import B.v;
import B4.C0063g;
import B4.C0070n;
import B4.EnumC0071o;
import B4.j0;
import C0.RunnableC0085d;
import D0.i;
import D3.b;
import E4.A;
import E4.AbstractC0178k;
import E4.C0170c;
import E4.C0171d;
import E4.C0177j;
import E4.EnumC0176i;
import E4.I;
import G6.g;
import H4.m;
import H4.n;
import H4.o;
import I2.C0313v;
import I2.J;
import I4.k;
import I4.l;
import I4.p;
import P2.F;
import R1.j;
import U5.C0434a;
import U5.C0435b;
import W5.AbstractC0486a1;
import W5.E0;
import X0.h;
import Y4.A0;
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
import Y4.D;
import Y4.EnumC0570e0;
import Y4.EnumC0574g0;
import Y4.EnumC0578i0;
import Y4.EnumC0602z;
import Y4.I0;
import Y4.J0;
import Y4.L;
import Y4.L0;
import Y4.Q0;
import Y4.s0;
import Y4.t0;
import Y4.u0;
import Y4.v0;
import Z5.a;
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
import android.support.v4.media.session.t;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.C;
import com.google.protobuf.E;
import com.google.protobuf.y0;
import com.google.protobuf.z0;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.SentryEnvelopeItemHeader;
import io.sentry.SentryEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
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
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;
import p010b0.C0746q;
import p113p3.f;
import p136t.e;
import p145u1.c;
import p146u2.C0956o;
import p146u2.M;
import p167y2.r;

/* JADX INFO: loaded from: classes.dex */
public class P2 implements d, g, zzapf, r, j, q, h, M {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static P2 f17512d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f17515c;

    public /* synthetic */ P2(int i7, char c3) {
        this.f17513a = i7;
    }

    public static boolean E(m mVar) {
        return mVar.f3312a.size() >= 4 && mVar.l(0).equals("projects") && mVar.l(2).equals("databases");
    }

    public static P2 M(char c3) {
        return new P2(6, new c(new b(c3), 3), D3.d.f1714b);
    }

    public static String S(N6.d dVar) {
        long j = dVar.f4797b;
        if (j <= 64) {
            return dVar.h().c();
        }
        return dVar.i((int) Math.min(j, 64L)).c() + "...";
    }

    public static AbstractC0178k i(C0590o0 c0590o0) {
        int iOrdinal = c0590o0.B().ordinal();
        int i7 = 1;
        if (iOrdinal == 0) {
            C0572f0 c0572f0Y = c0590o0.y();
            ArrayList arrayList = new ArrayList();
            Iterator it = c0572f0Y.y().iterator();
            while (it.hasNext()) {
                arrayList.add(i((C0590o0) it.next()));
            }
            int iOrdinal2 = c0572f0Y.z().ordinal();
            if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2) {
                    f.F("Only AND and OR composite filter types are supported.", new Object[0]);
                    throw null;
                }
                i7 = 2;
            }
            return new C0171d(i7, arrayList);
        }
        EnumC0176i enumC0176i = EnumC0176i.NOT_EQUAL;
        EnumC0176i enumC0176i2 = EnumC0176i.EQUAL;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                f.F("Unrecognized Filter.filterType %d", c0590o0.B());
                throw null;
            }
            u0 u0VarC = c0590o0.C();
            H4.j jVarY = H4.j.y(u0VarC.y().x());
            int iOrdinal3 = u0VarC.z().ordinal();
            if (iOrdinal3 == 1) {
                return C0177j.e(jVarY, enumC0176i2, o.f3334a);
            }
            if (iOrdinal3 == 2) {
                return C0177j.e(jVarY, enumC0176i2, o.f3335b);
            }
            if (iOrdinal3 == 3) {
                return C0177j.e(jVarY, enumC0176i, o.f3334a);
            }
            if (iOrdinal3 == 4) {
                return C0177j.e(jVarY, enumC0176i, o.f3335b);
            }
            f.F("Unrecognized UnaryFilter.operator %d", u0VarC.z());
            throw null;
        }
        C0580j0 c0580j0A = c0590o0.A();
        H4.j jVarY2 = H4.j.y(c0580j0A.z().x());
        EnumC0578i0 enumC0578i0A = c0580j0A.A();
        switch (enumC0578i0A.ordinal()) {
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
                f.F("Unhandled FieldFilter.operator %d", enumC0578i0A);
                throw null;
        }
        return C0177j.e(jVarY2, enumC0176i, c0580j0A.B());
    }

    public static k l(Q0 q1, n nVar) {
        n nVarN = n(q1.x());
        if (!n.f3332b.equals(nVarN)) {
            nVar = nVarN;
        }
        int iW = q1.w();
        ArrayList arrayList = new ArrayList(iW);
        for (int i7 = 0; i7 < iW; i7++) {
            arrayList.add(q1.v(i7));
        }
        return new k(nVar, arrayList);
    }

    public static I m(String str, v0 v0Var) {
        m mVar;
        String strY;
        List listEmptyList;
        List listEmptyList2;
        int i7;
        m mVarY = m.y(str);
        f.O("Tried to deserialize invalid key %s", E(mVarY), mVarY);
        m mVarZ = mVarY.f3312a.size() == 4 ? m.f3331b : z(mVarY);
        int iE = v0Var.E();
        if (iE <= 0) {
            mVar = mVarZ;
            strY = null;
        } else {
            f.O("StructuredQuery.from with more than one collection is not supported.", iE == 1, new Object[0]);
            C0566c0 c0566c0D = v0Var.D();
            if (c0566c0D.x()) {
                mVar = mVarZ;
                strY = c0566c0D.y();
            } else {
                mVarZ = (m) mVarZ.b(c0566c0D.y());
                mVar = mVarZ;
                strY = null;
            }
        }
        if (v0Var.N()) {
            AbstractC0178k abstractC0178kI = i(v0Var.J());
            if (!(abstractC0178kI instanceof C0171d)) {
                listEmptyList = Collections.singletonList(abstractC0178kI);
                break;
            }
            C0171d c0171d = (C0171d) abstractC0178kI;
            ArrayList arrayList = c0171d.f2171a;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    if (c0171d.e()) {
                        listEmptyList = Collections.unmodifiableList(arrayList);
                        break;
                    }
                } else if (((AbstractC0178k) it.next()) instanceof C0171d) {
                }
                listEmptyList = Collections.singletonList(abstractC0178kI);
                break;
            }
        }
        listEmptyList = Collections.emptyList();
        List list = listEmptyList;
        int iH = v0Var.H();
        if (iH > 0) {
            ArrayList arrayList2 = new ArrayList(iH);
            for (int i8 = 0; i8 < iH; i8++) {
                C0594q0 c0594q0G = v0Var.G(i8);
                H4.j jVarY = H4.j.y(c0594q0G.y().x());
                int iOrdinal = c0594q0G.x().ordinal();
                if (iOrdinal != 1) {
                    i7 = 2;
                    if (iOrdinal != 2) {
                        f.F("Unrecognized direction %d", c0594q0G.x());
                        throw null;
                    }
                } else {
                    i7 = 1;
                }
                arrayList2.add(new A(i7, jVarY));
            }
            listEmptyList2 = arrayList2;
        } else {
            listEmptyList2 = Collections.emptyList();
        }
        return new I(mVar, strY, list, listEmptyList2, v0Var.L() ? v0Var.F().x() : -1L, v0Var.M() ? new C0170c(v0Var.I().a(), v0Var.I().x()) : null, v0Var.K() ? new C0170c(v0Var.C().a(), !v0Var.C().x()) : null);
    }

    public static n n(z0 z0Var) {
        return (z0Var.z() == 0 && z0Var.y() == 0) ? n.f3332b : new n(new Timestamp(z0Var.z(), z0Var.y()));
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
                f.F("Unrecognized filter type %s", abstractC0178k.toString());
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
            C0568d0 c0568d0A = C0572f0.A();
            int iE = e.e(c0171d.f2172b);
            if (iE == 0) {
                enumC0570e0 = EnumC0570e0.AND;
            } else {
                if (iE != 1) {
                    f.F("Unrecognized composite filter type.", new Object[0]);
                    throw null;
                }
                enumC0570e0 = EnumC0570e0.OR;
            }
            c0568d0A.d();
            C0572f0.v((C0572f0) c0568d0A.f12096b, enumC0570e0);
            c0568d0A.d();
            C0572f0.w((C0572f0) c0568d0A.f12096b, arrayList);
            C0586m0 c0586m0D = C0590o0.D();
            c0586m0D.d();
            C0590o0.x((C0590o0) c0586m0D.f12096b, (C0572f0) c0568d0A.b());
            return (C0590o0) c0586m0D.b();
        }
        C0177j c0177j = (C0177j) abstractC0178k;
        EnumC0176i enumC0176i = c0177j.f2199a;
        EnumC0176i enumC0176i2 = EnumC0176i.EQUAL;
        H4.j jVar = c0177j.f2201c;
        I0 i7 = c0177j.f2200b;
        if (enumC0176i == enumC0176i2 || enumC0176i == EnumC0176i.NOT_EQUAL) {
            s0 s0VarA = u0.A();
            C0582k0 c0582k0Y = C0584l0.y();
            String strC = jVar.c();
            c0582k0Y.d();
            C0584l0.v((C0584l0) c0582k0Y.f12096b, strC);
            C0584l0 c0584l0 = (C0584l0) c0582k0Y.b();
            s0VarA.d();
            u0.w((u0) s0VarA.f12096b, c0584l0);
            I0 i8 = o.f3334a;
            if (i7 != null && Double.isNaN(i7.K())) {
                t0 t0Var = enumC0176i == enumC0176i2 ? t0.IS_NAN : t0.IS_NOT_NAN;
                s0VarA.d();
                u0.v((u0) s0VarA.f12096b, t0Var);
                C0586m0 c0586m0D2 = C0590o0.D();
                c0586m0D2.d();
                C0590o0.w((C0590o0) c0586m0D2.f12096b, (u0) s0VarA.b());
                return (C0590o0) c0586m0D2.b();
            }
            if (i7 != null && i7.R() == 1) {
                t0 t0Var2 = enumC0176i == enumC0176i2 ? t0.IS_NULL : t0.IS_NOT_NULL;
                s0VarA.d();
                u0.v((u0) s0VarA.f12096b, t0Var2);
                C0586m0 c0586m0D3 = C0590o0.D();
                c0586m0D3.d();
                C0590o0.w((C0590o0) c0586m0D3.f12096b, (u0) s0VarA.b());
                return (C0590o0) c0586m0D3.b();
            }
        }
        C0576h0 c0576h0C = C0580j0.C();
        C0582k0 c0582k0Y2 = C0584l0.y();
        String strC2 = jVar.c();
        c0582k0Y2.d();
        C0584l0.v((C0584l0) c0582k0Y2.f12096b, strC2);
        C0584l0 c0584l1 = (C0584l0) c0582k0Y2.b();
        c0576h0C.d();
        C0580j0.v((C0580j0) c0576h0C.f12096b, c0584l1);
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
                f.F("Unknown operator %d", enumC0176i);
                throw null;
        }
        c0576h0C.d();
        C0580j0.w((C0580j0) c0576h0C.f12096b, enumC0578i0);
        c0576h0C.d();
        C0580j0.x((C0580j0) c0576h0C.f12096b, i7);
        C0586m0 c0586m0D4 = C0590o0.D();
        c0586m0D4.d();
        C0590o0.v((C0590o0) c0586m0D4.f12096b, (C0580j0) c0576h0C.b());
        return (C0590o0) c0586m0D4.b();
    }

    public static String x(H4.f fVar, m mVar) {
        List listAsList = Arrays.asList("projects", fVar.f3313a, "databases", fVar.f3314b);
        m mVar2 = m.f3331b;
        return ((m) ((m) (listAsList.isEmpty() ? m.f3331b : new m(listAsList)).b("documents")).a(mVar)).c();
    }

    public static z0 y(Timestamp timestamp) {
        y0 y0VarA = z0.A();
        y0VarA.f(timestamp.f11828a);
        y0VarA.d();
        z0.w((z0) y0VarA.f12096b, timestamp.f11829b);
        return (z0) y0VarA.b();
    }

    public static m z(m mVar) {
        f.O("Tried to deserialize invalid key %s", mVar.f3312a.size() > 4 && mVar.l(4).equals("documents"), mVar);
        return (m) mVar.p();
    }

    public AlgorithmParameterSpec A() {
        return null;
    }

    public Cipher B() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public String C(String str) {
        String str2 = (String) this.f17515c;
        Resources resources = (Resources) this.f17514b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public boolean D() {
        return ((Logger) this.f17514b).isLoggable((Level) this.f17515c);
    }

    public void F(int i7, int i8, N6.d dVar, int i9, boolean z4) {
        if (D()) {
            ((Logger) this.f17514b).log((Level) this.f17515c, AbstractC0486a1.v(i7) + " DATA: streamId=" + i8 + " endStream=" + z4 + " length=" + i9 + " bytes=" + S(dVar));
        }
    }

    public void G(int i7, int i8, a aVar, N6.f fVar) {
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
            ((Logger) this.f17514b).log((Level) this.f17515c, sb.toString());
        }
    }

    public void H(int i7, long j) {
        if (D()) {
            ((Logger) this.f17514b).log((Level) this.f17515c, AbstractC0486a1.v(i7) + " PING: ack=false bytes=" + j);
        }
    }

    public void I(int i7, int i8, a aVar) {
        if (D()) {
            ((Logger) this.f17514b).log((Level) this.f17515c, AbstractC0486a1.v(i7) + " RST_STREAM: streamId=" + i8 + " errorCode=" + aVar);
        }
    }

    public void J(int i7, v vVar) {
        if (D()) {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0486a1.v(i7));
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(X5.n.class);
            for (X5.n nVar : X5.n.values()) {
                if (vVar.k(nVar.f7606a)) {
                    enumMap.put(nVar, Integer.valueOf(((int[]) vVar.f966c)[nVar.f7606a]));
                }
            }
            sb.append(enumMap.toString());
            ((Logger) this.f17514b).log((Level) this.f17515c, sb.toString());
        }
    }

    public void K(int i7, long j, int i8) {
        if (D()) {
            ((Logger) this.f17514b).log((Level) this.f17515c, AbstractC0486a1.v(i7) + " WINDOW_UPDATE: streamId=" + i8 + " windowSizeIncrement=" + j);
        }
    }

    public KeyGenParameterSpec L(Calendar calendar, Calendar calendar2) {
        String str = (String) this.f17514b;
        return new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal(L.i("CN=", str))).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public void N(M.d dVar) {
        int i7 = dVar.f4527b;
        Handler handler = (Handler) this.f17515c;
        x0 x0Var = (x0) this.f17514b;
        if (i7 != 0) {
            handler.post(new RunnableC0085d(x0Var, i7));
        } else {
            handler.post(new D6.y0(12, x0Var, dVar.f4526a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:88:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[LOOP:3: B:11:0x0026->B:94:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x005f A[SYNTHETIC] */
    public void O(K0.b bVar, int i7, int i8) {
        List listEmptyList;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z4;
        int iIntValue;
        D0.a aVar = (D0.a) this.f17514b;
        p033e3.h hVar = (p033e3.h) this.f17515c;
        if (aVar != null) {
            i iVar = (i) aVar.f1622f;
            iVar.getClass();
            if (i7 == i8) {
                listEmptyList = Collections.emptyList();
            } else {
                boolean z7 = i8 > i7;
                ArrayList arrayList = new ArrayList();
                int i9 = i7;
                while (true) {
                    if (z7) {
                        if (i9 < i8) {
                            treeMap = (TreeMap) iVar.f1652a.get(Integer.valueOf(i9));
                            if (treeMap != null) {
                                if (z7) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z4 = false;
                                        break;
                                    }
                                    Integer num = (Integer) it.next();
                                    iIntValue = num.intValue();
                                    if (z7) {
                                        if (iIntValue <= i8 && iIntValue > i9) {
                                            arrayList.add(treeMap.get(num));
                                            z4 = true;
                                            i9 = iIntValue;
                                            break;
                                        }
                                    } else {
                                        if (iIntValue >= i8 && iIntValue < i9) {
                                            arrayList.add(treeMap.get(num));
                                            z4 = true;
                                            i9 = iIntValue;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (!z4) {
                                }
                            }
                            listEmptyList = null;
                        } else {
                            listEmptyList = arrayList;
                        }
                    } else if (i9 > i8) {
                        treeMap = (TreeMap) iVar.f1652a.get(Integer.valueOf(i9));
                        if (treeMap != null) {
                            if (z7) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z4 = false;
                                    break;
                                    break;
                                }
                                Integer num2 = (Integer) it.next();
                                iIntValue = num2.intValue();
                                if (z7) {
                                    if (iIntValue <= i8) {
                                        continue;
                                    }
                                } else if (iIntValue >= i8) {
                                    continue;
                                }
                            }
                            if (!z4) {
                            }
                        }
                        listEmptyList = null;
                    } else {
                        listEmptyList = arrayList;
                    }
                }
            }
            if (listEmptyList != null) {
                ArrayList<String> arrayList2 = new ArrayList();
                Cursor cursorI = bVar.i("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorI.moveToNext()) {
                    try {
                        arrayList2.add(cursorI.getString(0));
                    } catch (Throwable th) {
                        cursorI.close();
                        throw th;
                    }
                }
                cursorI.close();
                for (String str : arrayList2) {
                    if (str.startsWith("room_fts_content_sync_")) {
                        bVar.g("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it2 = listEmptyList.iterator();
                while (it2.hasNext()) {
                    ((E0.a) it2.next()).a(bVar);
                }
                B3.g gVarB0 = p033e3.h.b0(bVar);
                if (!gVarB0.f1063b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) gVarB0.f1064c));
                }
                U(bVar);
                return;
            }
        }
        D0.a aVar2 = (D0.a) this.f17514b;
        if (aVar2 != null) {
            if (!((i7 <= i8 || !aVar2.f1618b) ? aVar2.f1617a : false)) {
                bVar.g("DROP TABLE IF EXISTS `Dependency`");
                bVar.g("DROP TABLE IF EXISTS `WorkSpec`");
                bVar.g("DROP TABLE IF EXISTS `WorkTag`");
                bVar.g("DROP TABLE IF EXISTS `SystemIdInfo`");
                bVar.g("DROP TABLE IF EXISTS `WorkName`");
                bVar.g("DROP TABLE IF EXISTS `WorkProgress`");
                bVar.g("DROP TABLE IF EXISTS `Preference`");
                int i10 = WorkDatabase_Impl.f9870s;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) hVar.f12673a;
                ArrayList arrayList3 = workDatabase_Impl.f1659g;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        ((p031e1.f) workDatabase_Impl.f1659g.get(i11)).getClass();
                    }
                }
                p033e3.h.Z(bVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i7 + " to " + i8 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void P(C0434a c0434a, Object obj) {
        if (((IdentityHashMap) this.f17515c) == null) {
            this.f17515c = new IdentityHashMap(1);
        }
        ((IdentityHashMap) this.f17515c).put(c0434a, obj);
    }

    public void Q(Locale locale) {
        Locale.setDefault(locale);
        Context context = (Context) this.f17515c;
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        context.createConfigurationContext(configuration);
    }

    public List R(CharSequence charSequence) {
        charSequence.getClass();
        D3.n nVar = new D3.n((c) this.f17515c, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (nVar.hasNext()) {
            arrayList.add((String) nVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Key T(byte[] bArr) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        String str = (String) this.f17514b;
        Key key = keyStore.getKey(str, null);
        if (key == null) {
            throw new Exception(L.i("No key found under alias: ", str));
        }
        if (!(key instanceof PrivateKey)) {
            throw new Exception("Not an instance of a PrivateKey");
        }
        Cipher cipherB = B();
        cipherB.init(4, (PrivateKey) key, A());
        return cipherB.unwrap(bArr, "AES", 3);
    }

    public void U(K0.b bVar) {
        bVar.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public C0435b b() {
        if (((IdentityHashMap) this.f17515c) != null) {
            for (Map.Entry entry : ((C0435b) this.f17514b).f6455a.entrySet()) {
                if (!((IdentityHashMap) this.f17515c).containsKey(entry.getKey())) {
                    ((IdentityHashMap) this.f17515c).put((C0434a) entry.getKey(), entry.getValue());
                }
            }
            this.f17514b = new C0435b((IdentityHashMap) this.f17515c);
            this.f17515c = null;
        }
        return (C0435b) this.f17514b;
    }

    @Override // p146u2.M
    public Object c(Uri uri, C0956o c0956o) {
        p012b2.a aVar = (p012b2.a) ((M) this.f17514b).c(uri, c0956o);
        List list = (List) this.f17515c;
        return (list == null || list.isEmpty()) ? aVar : (p012b2.a) aVar.a(list);
    }

    public void d() {
        ((F) this.f17514b).f5420b = true;
        ((ScheduledFuture) this.f17515c).cancel(false);
    }

    public HashMap e(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), f((I0) entry.getValue()));
        }
        return map2;
    }

    public Object f(I0 i7) {
        I0 i0T;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        switch (o.l(i7)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(i7.H());
            case 2:
                return e.b(i7.R(), 3) ? Long.valueOf(i7.M()) : Double.valueOf(i7.K());
            case 3:
                z0 z0VarQ = i7.Q();
                return new Timestamp(z0VarQ.z(), z0VarQ.y());
            case 4:
                int iOrdinal = ((EnumC0071o) this.f17515c).ordinal();
                if (iOrdinal == 1) {
                    z0 z0VarS = D.s(i7);
                    return new Timestamp(z0VarS.z(), z0VarS.y());
                }
                if (iOrdinal == 2 && (i0T = D.t(i7)) != null) {
                    return f(i0T);
                }
                return null;
            case 5:
                return i7.P();
            case 6:
                AbstractC0867k abstractC0867kI = i7.I();
                p003a.a.f(abstractC0867kI, "Provided ByteString must not be null.");
                return new C0063g(abstractC0867kI);
            case 7:
                m mVarY = m.y(i7.O());
                if (mVarY.f3312a.size() > 3 && mVarY.l(0).equals("projects") && mVarY.l(2).equals("databases")) {
                    z4 = true;
                }
                f.O("Tried to parse an invalid resource name: %s", z4, mVarY);
                String strL = mVarY.l(1);
                String strL2 = mVarY.l(3);
                H4.f fVar = new H4.f(strL, strL2);
                H4.h hVarC = H4.h.c(i7.O());
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f17514b;
                H4.f fVar2 = firebaseFirestore.f11964c;
                if (!fVar.equals(fVar2)) {
                    Q0.a.v(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", hVarC.f3318a, strL, strL2, fVar2.f3313a, fVar2.f3314b);
                }
                return new C0070n(hVarC, firebaseFirestore);
            case 8:
                return new B4.M(i7.L().y(), i7.L().z());
            case 9:
                C0569e c0569eG = i7.G();
                ArrayList arrayList = new ArrayList(c0569eG.A());
                Iterator it = c0569eG.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(f((I0) it.next()));
                }
                return arrayList;
            case 10:
                List listA = ((I0) i7.N().y().get("value")).G().a();
                double[] dArr = new double[listA.size()];
                for (int i8 = 0; i8 < listA.size(); i8++) {
                    dArr[i8] = ((I0) listA.get(i8)).K();
                }
                return new j0(dArr);
            case 11:
                return e(i7.N().y());
            default:
                f.F("Unknown value type: ".concat(AbstractC0486a1.w(i7.R())), new Object[0]);
                throw null;
        }
    }

    @Override // R1.j
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public R1.b a(R1.i iVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = iVar.f5919a.f5925a;
        R1.b bVar = null;
        try {
            p151v2.a.c("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                R1.b bVar2 = new R1.b(mediaCodecCreateByCodecName, (HandlerThread) ((B) this.f17514b).get(), (HandlerThread) ((B) this.f17515c).get());
                try {
                    p151v2.a.m();
                    R1.b.a(bVar2, iVar.f5920b, iVar.f5922d, iVar.f5923e);
                    return bVar2;
                } catch (Exception e7) {
                    e = e7;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Exception e9) {
            e = e9;
            mediaCodecCreateByCodecName = null;
        }
    }

    public String h() {
        return ((Context) this.f17515c).getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public H4.h j(String str) {
        m mVarY = m.y(str);
        f.O("Tried to deserialize invalid key %s", E(mVarY), mVarY);
        String strL = mVarY.l(1);
        H4.f fVar = (H4.f) this.f17514b;
        f.O("Tried to deserialize key from different project.", strL.equals(fVar.f3313a), new Object[0]);
        f.O("Tried to deserialize key from different database.", mVarY.l(3).equals(fVar.f3314b), new Object[0]);
        return new H4.h(z(mVarY));
    }

    public I4.h k(L0 l7) {
        I4.n nVarA;
        I4.g gVar;
        if (l7.J()) {
            Y4.M mB = l7.B();
            int iE = e.e(mB.x());
            if (iE == 0) {
                nVarA = I4.n.a(mB.z());
            } else if (iE == 1) {
                nVarA = new I4.n(n(mB.A()), null);
            } else {
                if (iE != 2) {
                    f.F("Unknown precondition", new Object[0]);
                    throw null;
                }
                nVarA = I4.n.f3688c;
            }
        } else {
            nVarA = I4.n.f3688c;
        }
        I4.n nVar = nVarA;
        ArrayList arrayList = new ArrayList();
        for (Y4.A a2 : l7.H()) {
            int iE2 = e.e(a2.F());
            if (iE2 == 0) {
                f.O("Unknown transform setToServerValue: %s", a2.E() == EnumC0602z.REQUEST_TIME, a2.E());
                gVar = new I4.g(H4.j.y(a2.B()), I4.o.f3691a);
            } else if (iE2 == 1) {
                gVar = new I4.g(H4.j.y(a2.B()), new l(a2.C()));
            } else if (iE2 == 4) {
                gVar = new I4.g(H4.j.y(a2.B()), new I4.b(a2.A().a()));
            } else {
                if (iE2 != 5) {
                    f.F("Unknown FieldTransform proto: %s", a2);
                    throw null;
                }
                gVar = new I4.g(H4.j.y(a2.B()), new I4.a(a2.D().a()));
            }
            arrayList.add(gVar);
        }
        int iOrdinal = l7.D().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new I4.e(j(l7.C()), nVar);
            }
            if (iOrdinal == 2) {
                return new I4.r(j(l7.I()), nVar);
            }
            f.F("Unknown mutation operation: %d", l7.D());
            throw null;
        }
        if (!l7.M()) {
            return new p(j(l7.F().A()), H4.l.e(l7.F().z()), nVar, arrayList);
        }
        H4.h hVarJ = j(l7.F().A());
        H4.l lVarE = H4.l.e(l7.F().z());
        C0599w c0599wG = l7.G();
        int iY = c0599wG.y();
        HashSet hashSet = new HashSet(iY);
        for (int i7 = 0; i7 < iY; i7++) {
            hashSet.add(H4.j.y(c0599wG.x(i7)));
        }
        return new I4.m(hVarJ, lVarE, new I4.f(hashSet), nVar, arrayList);
    }

    @Override // A5.q
    public void onMethodCall(A5.o oVar, A5.r rVar) {
        int i7;
        Toast toast;
        t6.h.e(oVar, "call");
        String str = oVar.f676a;
        if (!t6.h.a(str, "showToast")) {
            if (!t6.h.a(str, "cancel")) {
                ((A5.p) rVar).notImplemented();
                return;
            }
            Toast toast2 = (Toast) this.f17515c;
            if (toast2 != null) {
                toast2.cancel();
                this.f17515c = null;
            }
            ((A5.p) rVar).success(Boolean.TRUE);
            return;
        }
        String strValueOf = String.valueOf(oVar.a("msg"));
        String strValueOf2 = String.valueOf(oVar.a(SentryEnvelopeItemHeader.JsonKeys.LENGTH));
        String strValueOf3 = String.valueOf(oVar.a("gravity"));
        Number number = (Number) oVar.a("bgcolor");
        Number number2 = (Number) oVar.a("textcolor");
        Number number3 = (Number) oVar.a("fontSize");
        String str2 = (String) oVar.a("fontAsset");
        if (strValueOf3.equals(RRWebVideoEvent.JsonKeys.TOP)) {
            i7 = 48;
        } else {
            i7 = strValueOf3.equals("center") ? 17 : 80;
        }
        boolean zEquals = strValueOf2.equals("long");
        Context context = (Context) this.f17514b;
        if (number != null) {
            Object systemService = context.getSystemService("layout_inflater");
            t6.h.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.toast_custom, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.text);
            textView.setText(strValueOf);
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
            this.f17515c = toast3;
            toast3.setDuration(zEquals ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = context.getAssets();
                t6.h.d(assets, "getAssets(...)");
                String strA = ((p148u5.c) t.l0().f8076b).a(str2);
                t6.h.d(strA, "getLookupKeyForAsset(...)");
                textView.setTypeface(Typeface.createFromAsset(assets, strA));
            }
            Toast toast4 = (Toast) this.f17515c;
            if (toast4 != null) {
                toast4.setView(viewInflate);
            }
        } else {
            Log.d("KARTHIK", "showToast: " + number + " " + number2 + " " + number3 + " " + str2);
            Toast toastMakeText = Toast.makeText(context, strValueOf, zEquals ? 1 : 0);
            this.f17515c = toastMakeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = toastMakeText != null ? toastMakeText.getView() : null;
                t6.h.b(view);
                View viewFindViewById = view.findViewById(android.R.id.message);
                t6.h.d(viewFindViewById, "findViewById(...)");
                TextView textView2 = (TextView) viewFindViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = context.getAssets();
                    t6.h.d(assets2, "getAssets(...)");
                    String strA2 = ((p148u5.c) t.l0().f8076b).a(str2);
                    t6.h.d(strA2, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, strA2));
                }
            }
        }
        try {
            if (i7 == 17) {
                Toast toast5 = (Toast) this.f17515c;
                if (toast5 != null) {
                    toast5.setGravity(i7, 0, 0);
                }
            } else if (i7 != 48) {
                Toast toast6 = (Toast) this.f17515c;
                if (toast6 != null) {
                    toast6.setGravity(i7, 0, 100);
                }
            } else {
                Toast toast7 = (Toast) this.f17515c;
                if (toast7 != null) {
                    toast7.setGravity(i7, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        if (context instanceof Activity) {
            t6.h.c(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new K0(this, 15));
        } else {
            Toast toast8 = (Toast) this.f17515c;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = (Toast) this.f17515c) != null) {
            toast.addCallback(new T5.b(this));
        }
        ((A5.p) rVar).success(Boolean.TRUE);
    }

    @Override // A5.d
    public void p(ByteBuffer byteBuffer, p135s5.f fVar) {
        F0 f7 = (F0) this.f17515c;
        try {
            ((A5.b) this.f17514b).i(((A5.n) f7.f17381d).b(byteBuffer), new V0(2, this, fVar));
        } catch (RuntimeException e7) {
            Log.e("BasicMessageChannel#" + ((String) f7.f17380c), "Failed to handle message", e7);
            fVar.a(null);
        }
    }

    public void q(D1.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f17514b;
        if (handler != null) {
            handler.post(new A0.f(5, this, eVar));
        }
    }

    @Override // G6.g
    public Object r(G6.h hVar, p065i6.d dVar) {
        Object objR = ((V0) this.f17514b).r(new G6.e(new t6.n(), hVar, (C0746q) this.f17515c), dVar);
        return objR == j6.a.f14648a ? objR : p044f6.i.f13014a;
    }

    public String toString() {
        switch (this.f17513a) {
            case 25:
                return "Request{url=" + ((p008a6.a) this.f17514b) + '}';
            default:
                return super.toString();
        }
    }

    public String u(H4.h hVar) {
        return x((H4.f) this.f17514b, hVar.f3318a);
    }

    public L0 v(I4.h hVar) {
        Y4.M m7;
        C cB;
        J0 j0N = L0.N();
        if (hVar instanceof p) {
            H4.h hVar2 = hVar.f3670a;
            H4.l lVar = ((p) hVar).f3692d;
            C0593q c0593qC = C0595s.C();
            String strU = u(hVar2);
            c0593qC.d();
            C0595s.v((C0595s) c0593qC.f12096b, strU);
            Map mapY = lVar.b().N().y();
            c0593qC.d();
            C0595s.w((C0595s) c0593qC.f12096b).putAll(mapY);
            C0595s c0595s = (C0595s) c0593qC.b();
            j0N.d();
            L0.x((L0) j0N.f12096b, c0595s);
        } else if (hVar instanceof I4.m) {
            H4.h hVar3 = hVar.f3670a;
            H4.l lVar2 = ((I4.m) hVar).f3686d;
            C0593q c0593qC2 = C0595s.C();
            String strU2 = u(hVar3);
            c0593qC2.d();
            C0595s.v((C0595s) c0593qC2.f12096b, strU2);
            Map mapY2 = lVar2.b().N().y();
            c0593qC2.d();
            C0595s.w((C0595s) c0593qC2.f12096b).putAll(mapY2);
            C0595s c0595s2 = (C0595s) c0593qC2.b();
            j0N.d();
            L0.x((L0) j0N.f12096b, c0595s2);
            C0598v c0598vZ = C0599w.z();
            Iterator it = ((I4.m) hVar).f3687e.f3667a.iterator();
            while (it.hasNext()) {
                String strC = ((H4.j) it.next()).c();
                c0598vZ.d();
                C0599w.v((C0599w) c0598vZ.f12096b, strC);
            }
            C0599w c0599w = (C0599w) c0598vZ.b();
            j0N.d();
            L0.v((L0) j0N.f12096b, c0599w);
        } else if (hVar instanceof I4.e) {
            String strU3 = u(hVar.f3670a);
            j0N.d();
            L0.z((L0) j0N.f12096b, strU3);
        } else {
            if (!(hVar instanceof I4.r)) {
                f.F("unknown mutation type %s", hVar.getClass());
                throw null;
            }
            String strU4 = u(hVar.f3670a);
            j0N.d();
            L0.A((L0) j0N.f12096b, strU4);
        }
        for (I4.g gVar : hVar.f3672c) {
            I4.q qVar = gVar.f3669b;
            boolean z4 = qVar instanceof I4.o;
            H4.j jVar = gVar.f3668a;
            if (z4) {
                C0601y c0601yG = Y4.A.G();
                String strC2 = jVar.c();
                c0601yG.d();
                Y4.A.w((Y4.A) c0601yG.f12096b, strC2);
                c0601yG.d();
                Y4.A.y((Y4.A) c0601yG.f12096b);
                cB = c0601yG.b();
            } else if (qVar instanceof I4.b) {
                C0601y c0601yG2 = Y4.A.G();
                String strC3 = jVar.c();
                c0601yG2.d();
                Y4.A.w((Y4.A) c0601yG2.f12096b, strC3);
                C0567d c0567dB = C0569e.B();
                c0567dB.d();
                C0569e.w((C0569e) c0567dB.f12096b, ((I4.b) qVar).f3663a);
                c0601yG2.d();
                Y4.A.v((Y4.A) c0601yG2.f12096b, (C0569e) c0567dB.b());
                cB = c0601yG2.b();
            } else if (qVar instanceof I4.a) {
                C0601y c0601yG3 = Y4.A.G();
                String strC4 = jVar.c();
                c0601yG3.d();
                Y4.A.w((Y4.A) c0601yG3.f12096b, strC4);
                C0567d c0567dB2 = C0569e.B();
                c0567dB2.d();
                C0569e.w((C0569e) c0567dB2.f12096b, ((I4.a) qVar).f3663a);
                c0601yG3.d();
                Y4.A.x((Y4.A) c0601yG3.f12096b, (C0569e) c0567dB2.b());
                cB = c0601yG3.b();
            } else {
                if (!(qVar instanceof l)) {
                    f.F("Unknown transform: %s", qVar);
                    throw null;
                }
                C0601y c0601yG4 = Y4.A.G();
                String strC5 = jVar.c();
                c0601yG4.d();
                Y4.A.w((Y4.A) c0601yG4.f12096b, strC5);
                I0 i7 = ((l) qVar).f3685a;
                c0601yG4.d();
                Y4.A.z((Y4.A) c0601yG4.f12096b, i7);
                cB = c0601yG4.b();
            }
            j0N.d();
            L0.w((L0) j0N.f12096b, (Y4.A) cB);
        }
        I4.n nVar = hVar.f3671b;
        n nVar2 = nVar.f3689a;
        Boolean bool = nVar.f3690b;
        if (nVar2 != null || bool != null) {
            f.O("Can't serialize an empty precondition", !(nVar2 == null && bool == null), new Object[0]);
            L lB = Y4.M.B();
            n nVar3 = nVar.f3689a;
            if (nVar3 != null) {
                z0 z0VarY = y(nVar3.f3333a);
                lB.d();
                Y4.M.w((Y4.M) lB.f12096b, z0VarY);
                m7 = (Y4.M) lB.b();
            } else {
                if (bool == null) {
                    f.F("Unknown Precondition", new Object[0]);
                    throw null;
                }
                boolean zBooleanValue = bool.booleanValue();
                lB.d();
                Y4.M.v((Y4.M) lB.f12096b, zBooleanValue);
                m7 = (Y4.M) lB.b();
            }
            j0N.d();
            L0.y((L0) j0N.f12096b, m7);
        }
        return (L0) j0N.b();
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable, java.lang.Object] */
    public A0 w(I i7) {
        Y4.z0 z0VarA = A0.A();
        C0562a0 c0562a0O = v0.O();
        m mVar = i7.f2126d;
        H4.f fVar = (H4.f) this.f17514b;
        String str = i7.f2127e;
        if (str != null) {
            f.O("Collection Group queries should be within a document path or root.", mVar.f3312a.size() % 2 == 0, new Object[0]);
            String strX = x(fVar, mVar);
            z0VarA.d();
            A0.w((A0) z0VarA.f12096b, strX);
            C0564b0 c0564b0Z = C0566c0.z();
            c0564b0Z.d();
            C0566c0.v((C0566c0) c0564b0Z.f12096b, str);
            c0564b0Z.d();
            C0566c0.w((C0566c0) c0564b0Z.f12096b);
            c0562a0O.d();
            v0.v((v0) c0562a0O.f12096b, (C0566c0) c0564b0Z.b());
        } else {
            f.O("Document queries with filters are not supported.", mVar.f3312a.size() % 2 != 0, new Object[0]);
            String strX2 = x(fVar, (m) mVar.t());
            z0VarA.d();
            A0.w((A0) z0VarA.f12096b, strX2);
            C0564b0 c0564b0Z2 = C0566c0.z();
            String strH = mVar.h();
            c0564b0Z2.d();
            C0566c0.v((C0566c0) c0564b0Z2.f12096b, strH);
            c0562a0O.d();
            v0.v((v0) c0562a0O.f12096b, (C0566c0) c0564b0Z2.b());
        }
        List list = i7.f2125c;
        if (list.size() > 0) {
            C0590o0 c0590o0S = s(new C0171d(1, list));
            c0562a0O.d();
            v0.w((v0) c0562a0O.f12096b, c0590o0S);
        }
        for (A a2 : i7.f2124b) {
            C0592p0 c0592p0Z = C0594q0.z();
            if (e.b(a2.f2084a, 1)) {
                EnumC0574g0 enumC0574g0 = EnumC0574g0.ASCENDING;
                c0592p0Z.d();
                C0594q0.w((C0594q0) c0592p0Z.f12096b, enumC0574g0);
            } else {
                EnumC0574g0 enumC0574g1 = EnumC0574g0.DESCENDING;
                c0592p0Z.d();
                C0594q0.w((C0594q0) c0592p0Z.f12096b, enumC0574g1);
            }
            C0582k0 c0582k0Y = C0584l0.y();
            String strC = a2.f2085b.c();
            c0582k0Y.d();
            C0584l0.v((C0584l0) c0582k0Y.f12096b, strC);
            C0584l0 c0584l0 = (C0584l0) c0582k0Y.b();
            c0592p0Z.d();
            C0594q0.v((C0594q0) c0592p0Z.f12096b, c0584l0);
            C0594q0 c0594q0 = (C0594q0) c0592p0Z.b();
            c0562a0O.d();
            v0.x((v0) c0562a0O.f12096b, c0594q0);
        }
        if (i7.e()) {
            com.google.protobuf.D dY = E.y();
            int i8 = (int) i7.f2128f;
            dY.d();
            E.v((E) dY.f12096b, i8);
            c0562a0O.d();
            v0.A((v0) c0562a0O.f12096b, (E) dY.b());
        }
        C0170c c0170c = i7.f2129g;
        if (c0170c != null) {
            C0589o c0589oZ = C0591p.z();
            ?? r7 = c0170c.f2170b;
            c0589oZ.d();
            C0591p.v((C0591p) c0589oZ.f12096b, r7);
            c0589oZ.d();
            C0591p.w((C0591p) c0589oZ.f12096b, c0170c.f2169a);
            c0562a0O.d();
            v0.y((v0) c0562a0O.f12096b, (C0591p) c0589oZ.b());
        }
        C0170c c0170c2 = i7.f2130h;
        if (c0170c2 != null) {
            C0589o c0589oZ2 = C0591p.z();
            ?? r8 = c0170c2.f2170b;
            c0589oZ2.d();
            C0591p.v((C0591p) c0589oZ2.f12096b, r8);
            boolean z4 = !c0170c2.f2169a;
            c0589oZ2.d();
            C0591p.w((C0591p) c0589oZ2.f12096b, z4);
            c0562a0O.d();
            v0.z((v0) c0562a0O.f12096b, (C0591p) c0589oZ2.b());
        }
        z0VarA.d();
        A0.v((A0) z0VarA.f12096b, (v0) c0562a0O.b());
        return (A0) z0VarA.b();
    }

    @Override // com.google.android.gms.internal.ads.zzapf
    public void zza(zzapk zzapkVar) {
        String str = "Failed to load URL: " + ((String) this.f17514b) + "\n" + zzapkVar.toString();
        int i7 = J.f3546b;
        J2.j.g(str);
        ((C0313v) this.f17515c).zzc(null);
    }

    public /* synthetic */ P2(int i7, Object obj, Object obj2) {
        this.f17513a = i7;
        this.f17515c = obj;
        this.f17514b = obj2;
    }

    public /* synthetic */ P2(int i7, Object obj, Object obj2, boolean z4) {
        this.f17513a = i7;
        this.f17514b = obj;
        this.f17515c = obj2;
    }

    public P2(Context context, int i7) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        this.f17513a = i7;
        switch (i7) {
            case 29:
                this.f17515c = context;
                String strH = h();
                this.f17514b = strH;
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.getKey(strH, null) == null) {
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
                this.f17514b = resources;
                this.f17515c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                return;
        }
    }

    public P2(int i7, byte b7) {
        this.f17513a = i7;
        switch (i7) {
            case 9:
                this.f17514b = new HashMap();
                this.f17515c = new HashMap();
                break;
            default:
                this.f17515c = new WeakHashMap();
                this.f17514b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new E0(this, 2));
                break;
        }
    }

    public P2(s sVar) {
        this.f17513a = 12;
        this.f17514b = new TaskCompletionSource();
        this.f17515c = sVar;
    }

    public P2(V0 v6) {
        this.f17513a = 25;
        this.f17514b = (p008a6.a) v6.f17568b;
        C0.I i7 = (C0.I) v6.f17569c;
        i7.getClass();
        this.f17515c = new c(i7);
    }

    public P2(X0.b bVar) {
        this.f17513a = 23;
        V0 v6 = new V0(23);
        this.f17514b = bVar;
        this.f17515c = v6;
    }

    public P2(Level level) {
        this.f17513a = 24;
        Logger logger = Logger.getLogger(X5.m.class.getName());
        f.k(level, "level");
        this.f17515c = level;
        f.k(logger, SentryEvent.JsonKeys.LOGGER);
        this.f17514b = logger;
    }

    public P2(int i7) {
        this.f17513a = 19;
        B b7 = new B(i7, 2);
        B b8 = new B(i7, 3);
        this.f17514b = b7;
        this.f17515c = b8;
    }

    public P2(H4.f fVar) {
        this.f17513a = 15;
        this.f17514b = fVar;
        List listAsList = Arrays.asList("projects", fVar.f3313a, "databases", fVar.f3314b);
        m mVar = m.f3331b;
        this.f17515c = (listAsList.isEmpty() ? m.f3331b : new m(listAsList)).c();
    }

    public P2(Animation animation) {
        this.f17513a = 26;
        this.f17514b = animation;
        this.f17515c = null;
    }

    public P2(Animator animator) {
        this.f17513a = 26;
        this.f17514b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f17515c = animatorSet;
        animatorSet.play(animator);
    }

    public P2(C0435b c0435b) {
        this.f17513a = 21;
        this.f17514b = c0435b;
    }

    public P2(F f7, ScheduledFuture scheduledFuture) {
        this.f17513a = 22;
        this.f17514b = f7;
        f.k(scheduledFuture, "future");
        this.f17515c = scheduledFuture;
    }
}
