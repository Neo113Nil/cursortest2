package B1;

import A1.AbstractC0021h;
import A1.AbstractC0029l;
import A1.C0045t0;
import A1.F;
import A1.N;
import A1.R0;
import A1.S0;
import A1.T0;
import A1.X;
import A1.r;
import B4.C0061e;
import B4.C0062f;
import B4.H;
import B4.I;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import E4.C;
import F2.C0247p;
import G4.C0279l;
import G4.C0283p;
import G4.C0284q;
import G4.E;
import G4.S;
import G4.W;
import U5.C0437d;
import U5.Q;
import W5.AbstractC0486a1;
import Y4.I0;
import Y4.P;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.Point;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0867k;
import com.google.protobuf.M;
import io.sentry.IScope;
import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.Sentry;
import io.sentry.SentryOptions;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.cache.AndroidEnvelopeCache;
import io.sentry.android.core.internal.gestures.SentryGestureListener;
import io.sentry.flutter.SentryFlutterPlugin;
import io.sentry.protocol.SentryId;
import io.sentry.util.HintUtils;
import io.sentry.util.LazyEvaluator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.UUID;
import p018c2.C0779z;
import p018c2.e0;
import p146u2.B;
import p146u2.D;
import p146u2.V;
import p146u2.y;
import p151v2.t;
import p155w1.C1017n0;
import p155w1.P2;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements p151v2.f, p151v2.e, Continuation, L4.p, L4.n, p048g4.d, N4.a, HintUtils.SentryConsumer, Scope.IWithTransaction, ScopeCallback, Sentry.OptionsConfiguration, LazyEvaluator.Evaluator, p139t2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f979c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f977a = i7;
        this.f978b = obj;
        this.f979c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    @Override // p139t2.m
    public L a(int i7, e0 e0Var, int[] iArr) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj = this.f979c;
        Object obj2 = this.f978b;
        boolean z4 = true;
        switch (this.f977a) {
            case 24:
                int i13 = ((int[]) obj)[i7];
                p139t2.i iVar = (p139t2.i) obj2;
                int i14 = iVar.f16448z;
                if (i14 == Integer.MAX_VALUE || (i9 = iVar.f16423A) == Integer.MAX_VALUE) {
                    i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                } else {
                    int i15 = Integer.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < e0Var.f10341a) {
                        X x4 = e0Var.f10344d[i16];
                        int i17 = x4.f288H;
                        if (i17 > 0 && (i10 = x4.f289I) > 0) {
                            if (iVar.f16424B) {
                                if ((i17 > i10 ? z4 : false) != (i14 > i9 ? z4 : false)) {
                                    i12 = i14;
                                    i11 = i9;
                                } else {
                                    i11 = i14;
                                    i12 = i9;
                                }
                            } else {
                                i11 = i14;
                                i12 = i9;
                            }
                            int i18 = i17 * i12;
                            int i19 = i10 * i11;
                            Point point = i18 >= i19 ? new Point(i11, t.g(i19, i17)) : new Point(t.g(i18, i10), i12);
                            int i20 = x4.f288H;
                            int i21 = i20 * i10;
                            if (i20 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i21 < i15) {
                                i15 = i21;
                            }
                        }
                        i16++;
                        z4 = true;
                    }
                    i8 = i15;
                }
                C0165x c0165x = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i22 = 0;
                int i23 = 0;
                while (i22 < e0Var.f10341a) {
                    int iB = e0Var.f10344d[i22].b();
                    p139t2.o oVar = new p139t2.o(i7, e0Var, i22, iVar, iArr[i22], i13, i8 == Integer.MAX_VALUE || (iB != -1 && iB <= i8));
                    int i24 = i23 + 1;
                    if (objArrCopyOf.length < i24) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i24));
                    }
                    objArrCopyOf[i23] = oVar;
                    i22++;
                    i23 = i24;
                }
                return AbstractC0167z.B(i23, objArrCopyOf);
            default:
                C0165x c0165x2 = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[4];
                int i25 = 0;
                int i26 = 0;
                while (i25 < e0Var.f10341a) {
                    p139t2.l lVar = new p139t2.l(i7, e0Var, i25, (p139t2.i) obj2, iArr[i25], (String) obj);
                    int i27 = i26 + 1;
                    if (objArrCopyOf2.length < i27) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, C0164w.e(objArrCopyOf2.length, i27));
                    }
                    objArrCopyOf2[i26] = lVar;
                    i25++;
                    i26 = i27;
                }
                return AbstractC0167z.B(i26, objArrCopyOf2);
        }
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryGestureListener) this.f978b).lambda$clearScope$2((IScope) this.f979c, iTransaction);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    @Override // L4.n
    public Object apply(Object obj) {
        boolean z4;
        switch (this.f977a) {
            case 7:
                String str = (String) this.f979c;
                Cursor cursor = (Cursor) obj;
                ((P2) this.f978b).getClass();
                if (cursor == null) {
                    return null;
                }
                try {
                    X4.c cVarC = X4.c.C(cursor.getBlob(2));
                    return new D4.i(str, new D4.h(P2.m(cVarC.z(), cVarC.A()), cVarC.y().equals(X4.b.FIRST) ? 1 : 2), new H4.n(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
                } catch (M e7) {
                    p113p3.f.F("NamedQuery failed to parse: %s", e7);
                    throw null;
                }
            default:
                H4.k kVar = (H4.k) obj;
                if (((C) this.f978b).g(kVar)) {
                    z4 = true;
                } else {
                    if (((Set) this.f979c).contains(kVar.f3323a)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
        }
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        ((N4.a) this.f978b).b(bVar);
        ((N4.a) this.f979c).b(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:267:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:286:0x0501  */
    /* JADX WARN: Code duplicated, block: B:294:0x051b  */
    /* JADX WARN: Code duplicated, block: B:295:0x051d  */
    /* JADX WARN: Code duplicated, block: B:381:0x0653 A[PHI: r8
      0x0653: PHI (r8v74 int) = (r8v73 int), (r8v72 int), (r8v72 int) binds: [B:388:0x0667, B:371:0x0638, B:372:0x063a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [B1.m, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v26, types: [A1.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v46 */
    @Override // p151v2.f
    public void c(Object obj, p151v2.d dVar) {
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        l lVar;
        int i13;
        int i14;
        int i15;
        int i16;
        X x4;
        int i17;
        int i18;
        n nVar;
        Object obj2;
        int i19;
        int i20;
        DrmInitData drmInitData;
        int i21;
        h hVar = (h) this.f978b;
        AbstractC0021h abstractC0021h = (AbstractC0021h) this.f979c;
        b bVar = (b) obj;
        SparseArray sparseArray = hVar.f990e;
        SparseArray sparseArray2 = new SparseArray(dVar.f17110a.size());
        for (int i22 = 0; i22 < dVar.f17110a.size(); i22++) {
            int iA = dVar.a(i22);
            a aVar = (a) sparseArray.get(iA);
            aVar.getClass();
            sparseArray2.append(iA, aVar);
        }
        n nVar2 = (n) bVar;
        nVar2.getClass();
        if (dVar.f17110a.size() == 0) {
            return;
        }
        for (int i23 = 0; i23 < dVar.f17110a.size(); i23++) {
            int iA2 = dVar.a(i23);
            a aVar2 = (a) sparseArray2.get(iA2);
            aVar2.getClass();
            if (iA2 == 0) {
                j jVar = nVar2.f1019b;
                synchronized (jVar) {
                    try {
                        jVar.f1007d.getClass();
                        R0 r7 = jVar.f1008e;
                        jVar.f1008e = aVar2.f969b;
                        Iterator it = jVar.f1006c.values().iterator();
                        while (it.hasNext()) {
                            i iVar = (i) it.next();
                            if (!iVar.b(r7, jVar.f1008e) || iVar.a(aVar2)) {
                                it.remove();
                                if (iVar.f999e) {
                                    if (iVar.f995a.equals(jVar.f1009f)) {
                                        jVar.f1009f = null;
                                    }
                                    jVar.f1007d.d(aVar2, iVar.f995a);
                                }
                            }
                        }
                        jVar.c(aVar2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iA2 == 11) {
                j jVar2 = nVar2.f1019b;
                int i24 = nVar2.f1027k;
                synchronized (jVar2) {
                    try {
                        jVar2.f1007d.getClass();
                        boolean z7 = i24 == 0;
                        Iterator it2 = jVar2.f1006c.values().iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            if (iVar2.a(aVar2)) {
                                it2.remove();
                                if (iVar2.f999e) {
                                    boolean zEquals = iVar2.f995a.equals(jVar2.f1009f);
                                    if (z7 && zEquals) {
                                        boolean z8 = iVar2.f1000f;
                                    }
                                    if (zEquals) {
                                        jVar2.f1009f = null;
                                    }
                                    jVar2.f1007d.d(aVar2, iVar2.f995a);
                                }
                            }
                        }
                        jVar2.c(aVar2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                nVar2.f1019b.d(aVar2);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (dVar.f17110a.get(0)) {
            a aVar3 = (a) sparseArray2.get(0);
            aVar3.getClass();
            if (nVar2.j != null) {
                nVar2.c(aVar3.f969b, aVar3.f971d);
            }
        }
        if (dVar.f17110a.get(2) && nVar2.j != null) {
            N n2 = (N) abstractC0021h;
            n2.W();
            C0165x c0165xListIterator = n2.f154b0.f593i.f16452d.f236a.listIterator(0);
            loop4: while (true) {
                if (!c0165xListIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                S0 s7 = (S0) c0165xListIterator.next();
                for (int i25 = 0; i25 < s7.f227a; i25++) {
                    if (s7.f231e[i25] && (drmInitData = s7.f228b.f10344d[i25].f286F) != null) {
                        break loop4;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = nVar2.j;
                int i26 = t.f17159a;
                PlaybackMetrics.Builder builderG = F.g(builder);
                int i27 = 0;
                while (true) {
                    if (i27 >= drmInitData.f10556d) {
                        i21 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f10553a[i27].f10558b;
                    if (uuid.equals(AbstractC0029l.f465d)) {
                        i21 = 3;
                        break;
                    } else if (uuid.equals(AbstractC0029l.f466e)) {
                        i21 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC0029l.f464c)) {
                            i21 = 6;
                            break;
                        }
                        i27++;
                    }
                }
                builderG.setDrmType(i21);
            }
        }
        if (dVar.f17110a.get(1011)) {
            nVar2.f1042z++;
        }
        r rVar = nVar2.f1030n;
        if (rVar == null) {
            i12 = 13;
            i8 = 8;
            i9 = 6;
            i10 = 7;
            i11 = 9;
        } else {
            boolean z9 = nVar2.f1038v == 4;
            int i28 = rVar.f535a;
            if (i28 == 1001) {
                lVar = new l(20, 0, 0);
            } else {
                if (rVar instanceof r) {
                    z4 = rVar.f537c == 1;
                    i7 = rVar.f541x;
                } else {
                    z4 = false;
                    i7 = 0;
                }
                Throwable cause = rVar.getCause();
                cause.getClass();
                int i29 = 27;
                if (!(cause instanceof IOException)) {
                    i8 = 8;
                    i9 = 6;
                    i10 = 7;
                    i11 = 9;
                    if (z4 && (i7 == 0 || i7 == 1)) {
                        lVar = new l(35, 0, 0);
                    } else if (z4 && i7 == 3) {
                        lVar = new l(15, 0, 0);
                    } else if (z4 && i7 == 2) {
                        lVar = new l(23, 0, 0);
                    } else if (cause instanceof R1.o) {
                        i12 = 13;
                        lVar = new l(13, t.s(((R1.o) cause).f5936d), 0);
                    } else {
                        i12 = 13;
                        if (cause instanceof R1.l) {
                            lVar = new l(14, t.s(((R1.l) cause).f5924a), 0);
                        } else if (cause instanceof OutOfMemoryError) {
                            lVar = new l(14, 0, 0);
                        } else if (cause instanceof C1.p) {
                            lVar = new l(17, ((C1.p) cause).f1509a, 0);
                        } else if (cause instanceof C1.r) {
                            lVar = new l(18, ((C1.r) cause).f1512a, 0);
                        } else if (t.f17159a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                            lVar = new l(22, 0, 0);
                        } else {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (t.r(errorCode)) {
                                case 6002:
                                    i29 = 24;
                                    break;
                                case 6003:
                                    i29 = 28;
                                    break;
                                case 6004:
                                    i29 = 25;
                                    break;
                                case 6005:
                                    i29 = 26;
                                    break;
                            }
                            lVar = new l(i29, errorCode, 0);
                        }
                    }
                    i12 = 13;
                } else if (cause instanceof D) {
                    lVar = new l(5, ((D) cause).f16715d, 0);
                } else {
                    if ((cause instanceof p146u2.C) || (cause instanceof C0045t0)) {
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        i16 = 8;
                        lVar = new l(z9 ? 10 : 11, 0, 0);
                    } else {
                        boolean z10 = cause instanceof B;
                        if (z10 || (cause instanceof V)) {
                            i13 = 9;
                            if (p151v2.n.e(nVar2.f1018a).f() == 1) {
                                lVar = new l(3, 0, 0);
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    lVar = new l(6, 0, 0);
                                    i11 = 9;
                                    i9 = 6;
                                    i12 = 13;
                                    i8 = 8;
                                    i10 = 7;
                                } else {
                                    i15 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i14 = 7;
                                        lVar = new l(7, 0, 0);
                                    } else {
                                        i14 = 7;
                                        if (z10 && ((B) cause).f16714c == 1) {
                                            lVar = new l(4, 0, 0);
                                        } else {
                                            i16 = 8;
                                            lVar = new l(8, 0, 0);
                                        }
                                    }
                                    i11 = 9;
                                    i10 = i14;
                                    i9 = 6;
                                    i12 = 13;
                                    i8 = 8;
                                }
                            }
                        } else if (i28 == 1002) {
                            lVar = new l(21, 0, 0);
                        } else if (cause instanceof E1.c) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i30 = t.f17159a;
                            if (i30 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                int iS = t.s(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (t.r(iS)) {
                                    case 6002:
                                        i29 = 24;
                                        break;
                                    case 6003:
                                        i29 = 28;
                                        break;
                                    case 6004:
                                        i29 = 25;
                                        break;
                                    case 6005:
                                        i29 = 26;
                                        break;
                                }
                                lVar = new l(i29, iS, 0);
                            } else if (i30 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                lVar = new l(27, 0, 0);
                            } else if (i30 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                lVar = new l(24, 0, 0);
                            } else if (i30 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                lVar = new l(29, 0, 0);
                            } else if (cause3 instanceof E1.j) {
                                lVar = new l(23, 0, 0);
                            } else {
                                lVar = cause3 instanceof E1.a ? new l(28, 0, 0) : new l(30, 0, 0);
                            }
                        } else if ((cause instanceof y) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            lVar = (t.f17159a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new l(32, 0, 0) : new l(31, 0, 0);
                        } else {
                            i13 = 9;
                            lVar = new l(9, 0, 0);
                        }
                        i11 = i13;
                        i12 = 13;
                        i8 = 8;
                        i9 = 6;
                        i10 = 7;
                    }
                    i11 = i13;
                    i10 = i14;
                    i9 = i15;
                    i8 = i16;
                    i12 = 13;
                }
                nVar2.f1020c.reportPlaybackErrorEvent(k.g().setTimeSinceCreatedMillis(jElapsedRealtime - nVar2.f1021d).setErrorCode(lVar.f1011b).setSubErrorCode(lVar.f1012c).setException(rVar).build());
                nVar2.f1017A = true;
                nVar2.f1030n = null;
            }
            i12 = 13;
            i8 = 8;
            i9 = 6;
            i10 = 7;
            i11 = 9;
            nVar2.f1020c.reportPlaybackErrorEvent(k.g().setTimeSinceCreatedMillis(jElapsedRealtime - nVar2.f1021d).setErrorCode(lVar.f1011b).setSubErrorCode(lVar.f1012c).setException(rVar).build());
            nVar2.f1017A = true;
            nVar2.f1030n = null;
        }
        if (dVar.f17110a.get(2)) {
            N n7 = (N) abstractC0021h;
            n7.W();
            T0 t7 = n7.f154b0.f593i.f16452d;
            boolean zB = t7.b(2);
            boolean zB2 = t7.b(1);
            boolean zB3 = t7.b(3);
            if (zB || zB2 || zB3) {
                if (zB) {
                    obj2 = null;
                } else {
                    if (t.a(nVar2.f1034r, null)) {
                        obj2 = null;
                    } else {
                        int i31 = nVar2.f1034r == null ? 1 : 0;
                        nVar2.f1034r = null;
                        i10 = i10;
                        i8 = i8;
                        i17 = 10;
                        i9 = i9;
                        x4 = 0;
                        nVar2.e(1, jElapsedRealtime, null, i31);
                    }
                    if (!zB2 && !t.a(nVar2.f1035s, x4)) {
                        if (nVar2.f1035s == null) {
                            i20 = 1;
                        } else {
                            i20 = 0;
                        }
                        nVar2.f1035s = x4;
                        nVar2.e(0, jElapsedRealtime, x4, i20);
                    }
                    if (!zB3 && !t.a(nVar2.f1036t, x4)) {
                        if (nVar2.f1036t == null) {
                            i19 = 1;
                        } else {
                            i19 = 0;
                        }
                        nVar2.f1036t = x4;
                        nVar2.e(2, jElapsedRealtime, x4, i19);
                    }
                }
                i17 = 10;
                x4 = obj2;
                if (!zB2) {
                    if (nVar2.f1035s == null) {
                        i20 = 1;
                    } else {
                        i20 = 0;
                    }
                    nVar2.f1035s = x4;
                    nVar2.e(0, jElapsedRealtime, x4, i20);
                }
                if (!zB3) {
                    if (nVar2.f1036t == null) {
                        i19 = 1;
                    } else {
                        i19 = 0;
                    }
                    nVar2.f1036t = x4;
                    nVar2.e(2, jElapsedRealtime, x4, i19);
                }
            } else {
                i8 = i8;
                i9 = i9;
                i10 = i10;
                x4 = 0;
                i17 = 10;
                i12 = i12;
            }
        } else {
            i8 = i8;
            i9 = i9;
            i10 = i10;
            x4 = 0;
            i17 = 10;
            i12 = i12;
        }
        if (nVar2.a(nVar2.f1031o)) {
            m mVar = nVar2.f1031o;
            X x7 = (X) mVar.f1015c;
            if (x7.f289I != -1) {
                int i32 = mVar.f1014b;
                if (!t.a(nVar2.f1034r, x7)) {
                    int i33 = (nVar2.f1034r == null && i32 == 0) ? 1 : i32;
                    nVar2.f1034r = x7;
                    nVar2.e(1, jElapsedRealtime, x7, i33);
                }
                nVar2.f1031o = x4;
            }
        }
        if (nVar2.a(nVar2.f1032p)) {
            m mVar2 = nVar2.f1032p;
            X x8 = (X) mVar2.f1015c;
            int i34 = mVar2.f1014b;
            if (!t.a(nVar2.f1035s, x8)) {
                int i35 = (nVar2.f1035s == null && i34 == 0) ? 1 : i34;
                nVar2.f1035s = x8;
                nVar2.e(0, jElapsedRealtime, x8, i35);
            }
            nVar2.f1032p = x4;
        }
        if (nVar2.a(nVar2.f1033q)) {
            m mVar3 = nVar2.f1033q;
            X x9 = (X) mVar3.f1015c;
            int i36 = mVar3.f1014b;
            if (!t.a(nVar2.f1036t, x9)) {
                int i37 = (nVar2.f1036t == null && i36 == 0) ? 1 : i36;
                nVar2.f1036t = x9;
                nVar2.e(2, jElapsedRealtime, x9, i37);
            }
            nVar2.f1033q = x4;
        }
        switch (p151v2.n.e(nVar2.f1018a).f()) {
            case 0:
                i18 = 0;
                break;
            case 1:
                i18 = i11;
                break;
            case 2:
                i18 = 2;
                break;
            case 3:
                i18 = 4;
                break;
            case 4:
                i18 = 5;
                break;
            case 5:
                i18 = i9;
                break;
            case 6:
            case 8:
            default:
                i18 = 1;
                break;
            case 7:
                i18 = 3;
                break;
            case 9:
                i18 = i8;
                break;
            case 10:
                i18 = i10;
                break;
        }
        if (i18 != nVar2.f1029m) {
            nVar2.f1029m = i18;
            nVar2.f1020c.reportNetworkEvent(k.c().setNetworkType(i18).setTimeSinceCreatedMillis(jElapsedRealtime - nVar2.f1021d).build());
        }
        N n8 = (N) abstractC0021h;
        if (n8.E() != 2) {
            nVar2.f1037u = false;
        }
        n8.W();
        if (n8.f154b0.f590f == null) {
            nVar2.f1039w = false;
        } else if (dVar.f17110a.get(i17)) {
            nVar2.f1039w = true;
        }
        int iE = n8.E();
        if (nVar2.f1037u) {
            i17 = 5;
        } else if (nVar2.f1039w) {
            i17 = i12;
        } else if (iE == 4) {
            i17 = 11;
        } else {
            int i38 = 2;
            if (iE == 2) {
                int i39 = nVar2.f1028l;
                if (i39 == 0 || i39 == 2) {
                    i17 = i38;
                } else if (n8.D()) {
                    n8.W();
                    if (n8.f154b0.f596m == 0) {
                        i17 = i9;
                    }
                } else {
                    i17 = i10;
                }
            } else {
                i38 = 3;
                if (iE != 3) {
                    i17 = (iE != 1 || nVar2.f1028l == 0) ? nVar2.f1028l : 12;
                } else if (n8.D()) {
                    n8.W();
                    if (n8.f154b0.f596m != 0) {
                        i17 = i11;
                    } else {
                        i17 = i38;
                    }
                } else {
                    i17 = 4;
                }
            }
        }
        if (nVar2.f1028l != i17) {
            nVar2.f1028l = i17;
            nVar2.f1017A = true;
            nVar2.f1020c.reportPlaybackStateEvent(F.j().setState(nVar2.f1028l).setTimeSinceCreatedMillis(jElapsedRealtime - nVar2.f1021d).build());
        }
        if (dVar.f17110a.get(1028)) {
            j jVar3 = nVar2.f1019b;
            a aVar4 = (a) sparseArray2.get(1028);
            aVar4.getClass();
            synchronized (jVar3) {
                jVar3.f1009f = x4;
                Iterator it3 = jVar3.f1006c.values().iterator();
                while (it3.hasNext()) {
                    i iVar3 = (i) it3.next();
                    it3.remove();
                    if (iVar3.f999e && (nVar = jVar3.f1007d) != null) {
                        nVar.d(aVar4, iVar3.f995a);
                    }
                }
            }
        }
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryFlutterPlugin.initNativeSdk$lambda$0((SentryFlutterPlugin) this.f978b, (Map) this.f979c, (SentryAndroidOptions) sentryOptions);
    }

    @Override // p048g4.d
    public Object e(p048g4.r rVar) {
        String strValueOf;
        switch (this.f977a) {
            case 13:
                Context context = (Context) rVar.a(Context.class);
                switch (((R5.M) this.f979c).f6088a) {
                    case 10:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        strValueOf = applicationInfo == null ? "" : String.valueOf(applicationInfo.targetSdkVersion);
                        break;
                    case 11:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        strValueOf = applicationInfo2 == null ? "" : String.valueOf(applicationInfo2.minSdkVersion);
                        break;
                    case 12:
                        int i7 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "embedded" : "";
                        } else {
                            strValueOf = "auto";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.a(installerPackageName);
                        break;
                }
                return new R4.a((String) this.f978b, strValueOf);
            default:
                String str = (String) this.f978b;
                p048g4.a aVar = (p048g4.a) this.f979c;
                try {
                    Trace.beginSection(str);
                    return aVar.f13194f.e(rVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        switch (this.f977a) {
            case zzbbd.zzt.zzm /* 21 */:
                return ((SentryId) this.f978b).lambda$new$0((UUID) this.f979c);
            default:
                return ((SentryId) this.f978b).lambda$new$1((String) this.f979c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008c  */
    @Override // L4.p
    public Object get() {
        Long lValueOf;
        Long lValueOf2;
        D4.e eVar;
        boolean z4;
        switch (this.f977a) {
            case 3:
                C0279l c0279l = (C0279l) this.f978b;
                I4.j jVar = (I4.j) this.f979c;
                I4.i iVar = (I4.i) jVar.f3678b;
                c0279l.f2993c.i(iVar, (AbstractC0867k) jVar.f3681e);
                Iterator it = iVar.b().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    ArrayList arrayList = (ArrayList) jVar.f3680d;
                    List list = iVar.f3676d;
                    int i7 = 0;
                    if (!zHasNext) {
                        c0279l.f2993c.k(iVar);
                        c0279l.f2993c.a();
                        c0279l.f2994d.G(iVar.f3673a);
                        p072k1.g gVar = c0279l.f2996f;
                        HashSet hashSet = new HashSet();
                        while (i7 < arrayList.size()) {
                            if (!((I4.k) arrayList.get(i7)).f3684b.isEmpty()) {
                                hashSet.add(((I4.h) list.get(i7)).f3670a);
                            }
                            i7++;
                        }
                        gVar.M(((G4.D) gVar.f14680a).n(hashSet));
                        return c0279l.f2996f.v(iVar.b());
                    }
                    H4.h hVar = (H4.h) it.next();
                    G4.D d7 = c0279l.f2995e;
                    H4.k kVarY = d7.y(hVar);
                    H4.n nVar = (H4.n) ((p075k4.c) jVar.f3682f).m(hVar);
                    p113p3.f.O("docVersions should contain every doc in the write.", nVar != null, new Object[0]);
                    if (kVarY.f3325c.compareTo(nVar) < 0) {
                        int size = list.size();
                        p113p3.f.O("Mismatch between mutations length (%d) and results length (%d)", arrayList.size() == size, Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                        while (i7 < size) {
                            I4.h hVar2 = (I4.h) list.get(i7);
                            if (hVar2.f3670a.equals(kVarY.f3323a)) {
                                hVar2.b(kVarY, (I4.k) arrayList.get(i7));
                            }
                            i7++;
                        }
                        if (!p136t.e.b(kVarY.f3324b, 1)) {
                            d7.i(kVarY, (H4.n) jVar.f3679c);
                        }
                    }
                }
                break;
            case 4:
                SparseArray sparseArray = ((C0279l) this.f978b).f3000k;
                G4.r rVar = (G4.r) this.f979c;
                E4.y yVar = rVar.f3020b;
                long jLongValue = -1;
                if (yVar.f2247a == -1) {
                    Q0.a.v(1, "LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
                    return new C0283p();
                }
                Object obj = rVar.f3019a;
                S s7 = (S) ((G4.M) obj).f2916b;
                Cursor cursorJ = s7.c0("PRAGMA page_count").J();
                try {
                    if (cursorJ.moveToFirst()) {
                        lValueOf = Long.valueOf(cursorJ.getLong(0));
                        cursorJ.close();
                    } else {
                        cursorJ.close();
                        lValueOf = null;
                    }
                    long jLongValue2 = lValueOf.longValue();
                    Cursor cursorJ2 = s7.c0("PRAGMA page_size").J();
                    try {
                        Long lValueOf3 = cursorJ2.moveToFirst() ? Long.valueOf(cursorJ2.getLong(0)) : null;
                        cursorJ2.close();
                        long jLongValue3 = lValueOf3.longValue() * jLongValue2;
                        long j = yVar.f2247a;
                        if (jLongValue3 < j) {
                            StringBuilder sbJ = p031e1.k.j("Garbage collection skipped; Cache size ", " is lower than threshold ", jLongValue3);
                            sbJ.append(j);
                            Q0.a.v(1, "LruGarbageCollector", sbJ.toString(), new Object[0]);
                            return new C0283p();
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        S s8 = (S) ((G4.M) obj).f2916b;
                        long j3 = s8.f2931e.f2952f;
                        Cursor cursorJ3 = s8.c0("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").J();
                        try {
                            if (cursorJ3.moveToFirst()) {
                                lValueOf2 = Long.valueOf(cursorJ3.getLong(0));
                                cursorJ3.close();
                            } else {
                                cursorJ3.close();
                                lValueOf2 = null;
                            }
                            int iLongValue = (int) ((10 / 100.0f) * (lValueOf2.longValue() + j3));
                            if (iLongValue > 1000) {
                                Q0.a.v(1, "LruGarbageCollector", p031e1.k.d(iLongValue, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                                iLongValue = 1000;
                            }
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (iLongValue != 0) {
                                final C0284q c0284q = new C0284q();
                                c0284q.f3015a = iLongValue;
                                c0284q.f3016b = new PriorityQueue(iLongValue, C0284q.f3014c);
                                final int i8 = 0;
                                L4.h hVar3 = new L4.h() { // from class: G4.n
                                    @Override // L4.h
                                    public final void accept(Object obj2) {
                                        switch (i8) {
                                            case 0:
                                                c0284q.a(Long.valueOf(((Z) obj2).f2955c));
                                                break;
                                            default:
                                                c0284q.a((Long) obj2);
                                                break;
                                        }
                                    }
                                };
                                W w7 = ((S) ((G4.M) obj).f2916b).f2931e;
                                Cursor cursorJ4 = w7.f2947a.c0("SELECT target_proto FROM targets").J();
                                while (cursorJ4.moveToNext()) {
                                    try {
                                        hVar3.accept(w7.k(cursorJ4.getBlob(0)));
                                    } catch (Throwable th) {
                                        if (cursorJ4 == null) {
                                            throw th;
                                        }
                                        try {
                                            cursorJ4.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                }
                                cursorJ4.close();
                                final int i9 = 1;
                                L4.h hVar4 = new L4.h() { // from class: G4.n
                                    @Override // L4.h
                                    public final void accept(Object obj2) {
                                        switch (i9) {
                                            case 0:
                                                c0284q.a(Long.valueOf(((Z) obj2).f2955c));
                                                break;
                                            default:
                                                c0284q.a((Long) obj2);
                                                break;
                                        }
                                    }
                                };
                                Cursor cursorJ5 = ((S) ((G4.M) obj).f2916b).c0("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").J();
                                while (cursorJ5.moveToNext()) {
                                    try {
                                        hVar4.accept(Long.valueOf(cursorJ5.getLong(0)));
                                    } catch (Throwable th3) {
                                        if (cursorJ5 == null) {
                                            throw th3;
                                        }
                                        try {
                                            cursorJ5.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                }
                                cursorJ5.close();
                                jLongValue = ((Long) ((PriorityQueue) c0284q.f3016b).peek()).longValue();
                            }
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            W w8 = ((S) ((G4.M) obj).f2916b).f2931e;
                            int[] iArr = new int[1];
                            C1017n0 c1017n0C0 = w8.f2947a.c0("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                            c1017n0C0.c(Long.valueOf(jLongValue));
                            c1017n0C0.m(new G4.N(w8, sparseArray, iArr, 1));
                            w8.m();
                            int i10 = iArr[0];
                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                            final G4.M m7 = (G4.M) obj;
                            m7.getClass();
                            final int[] iArr2 = new int[1];
                            final ArrayList arrayList2 = new ArrayList();
                            final H4.m[] mVarArr = {H4.m.f3331b};
                            while (true) {
                                S s9 = (S) m7.f2916b;
                                long j7 = jCurrentTimeMillis4;
                                C1017n0 c1017n0C1 = s9.c0("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                                long j8 = jLongValue;
                                int i11 = iLongValue;
                                c1017n0C1.c(Long.valueOf(jLongValue), p113p3.f.C(mVarArr[0]), 100);
                                if (c1017n0C1.m(new L4.h() { // from class: G4.L
                                    @Override // L4.h
                                    public final void accept(Object obj2) {
                                        boolean zMoveToFirst;
                                        M m8 = m7;
                                        m8.getClass();
                                        H4.m mVarA = p113p3.f.A(((Cursor) obj2).getString(0));
                                        H4.h hVar5 = new H4.h(mVarA);
                                        boolean zL = ((V0) m8.f2919e).l(hVar5);
                                        S s10 = (S) m8.f2916b;
                                        H4.m mVar = hVar5.f3318a;
                                        if (zL) {
                                            zMoveToFirst = true;
                                        } else {
                                            C1017n0 c1017n0C2 = s10.c0("SELECT 1 FROM document_mutations WHERE path = ?");
                                            c1017n0C2.c(p113p3.f.C(mVar));
                                            Cursor cursorJ6 = c1017n0C2.J();
                                            try {
                                                zMoveToFirst = cursorJ6.moveToFirst();
                                                cursorJ6.close();
                                            } catch (Throwable th5) {
                                                if (cursorJ6 != null) {
                                                    try {
                                                        cursorJ6.close();
                                                    } catch (Throwable th6) {
                                                        th5.addSuppressed(th6);
                                                    }
                                                }
                                                throw th5;
                                            }
                                        }
                                        if (!zMoveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList2.add(hVar5);
                                            s10.b0("DELETE FROM target_documents WHERE path = ? AND target_id = 0", p113p3.f.C(mVar));
                                        }
                                        mVarArr[0] = mVarA;
                                    }
                                }) != 100) {
                                    s9.f2933g.o(arrayList2);
                                    int i12 = iArr2[0];
                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                    if (Q0.a.E()) {
                                        StringBuilder sbC = p136t.e.c(AbstractC0486a1.i(new StringBuilder("LRU Garbage Collection:\n\tCounted targets in "), jCurrentTimeMillis2 - jCurrentTimeMillis, "ms\n"));
                                        Locale locale = Locale.ROOT;
                                        sbC.append("\tDetermined least recently used " + i11 + " sequence numbers in " + (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "ms\n");
                                        StringBuilder sbC2 = p136t.e.c(sbC.toString());
                                        sbC2.append("\tRemoved " + i10 + " targets in " + (j7 - jCurrentTimeMillis3) + "ms\n");
                                        StringBuilder sbC3 = p136t.e.c(sbC2.toString());
                                        sbC3.append("\tRemoved " + i12 + " documents in " + (jCurrentTimeMillis5 - j7) + "ms\n");
                                        StringBuilder sbC4 = p136t.e.c(sbC3.toString());
                                        sbC4.append("Total Duration: " + (jCurrentTimeMillis5 - jCurrentTimeMillis) + "ms");
                                        Q0.a.v(1, "LruGarbageCollector", sbC4.toString(), new Object[0]);
                                    }
                                    return new C0283p();
                                }
                                jCurrentTimeMillis4 = j7;
                                iLongValue = i11;
                                jLongValue = j8;
                            }
                        } catch (Throwable th5) {
                            if (cursorJ3 == null) {
                                throw th5;
                            }
                            try {
                                cursorJ3.close();
                                throw th5;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                                throw th5;
                            }
                        }
                        break;
                    } catch (Throwable th7) {
                        if (cursorJ2 == null) {
                            throw th7;
                        }
                        try {
                            cursorJ2.close();
                            throw th7;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                            throw th7;
                        }
                    }
                } catch (Throwable th9) {
                    if (cursorJ == null) {
                        throw th9;
                    }
                    try {
                        cursorJ.close();
                        throw th9;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                        throw th9;
                    }
                }
                break;
            case 5:
                C0279l c0279l2 = (C0279l) this.f978b;
                c0279l2.getClass();
                D4.e eVar2 = (D4.e) this.f979c;
                String str = eVar2.f1749a;
                P2 p5 = c0279l2.j;
                switch (p5.f17513a) {
                    case 9:
                        eVar = (D4.e) ((HashMap) p5.f17514b).get(str);
                        break;
                    default:
                        C1017n0 c1017n0C2 = ((S) p5.f17514b).c0("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
                        c1017n0C2.c(str);
                        eVar = (D4.e) c1017n0C2.l(new E(str));
                        break;
                }
                if (eVar == null) {
                    z4 = false;
                } else if (eVar.f1751c.f3333a.compareTo(eVar2.f1751c.f3333a) >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                P2 p7 = ((C0279l) this.f978b).j;
                String str2 = (String) this.f979c;
                switch (p7.f17513a) {
                    case 9:
                        return (D4.i) ((HashMap) p7.f17515c).get(str2);
                    default:
                        C1017n0 c1017n0C3 = ((S) p7.f17514b).c0("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
                        c1017n0C3.c(str2);
                        return (D4.i) c1017n0C3.l(new c(7, p7, str2));
                }
        }
    }

    @Override // p151v2.e
    public void invoke(Object obj) {
        n nVar = (n) ((b) obj);
        nVar.getClass();
        a aVar = (a) this.f978b;
        p018c2.D d7 = aVar.f971d;
        if (d7 == null) {
            return;
        }
        C0779z c0779z = (C0779z) this.f979c;
        X x4 = c0779z.f10428c;
        x4.getClass();
        d7.getClass();
        m mVar = new m(x4, c0779z.f10429d, nVar.f1019b.b(aVar.f969b, d7), 0);
        int i7 = c0779z.f10427b;
        if (i7 != 0) {
            if (i7 == 1) {
                nVar.f1032p = mVar;
                return;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    return;
                }
                nVar.f1033q = mVar;
                return;
            }
        }
        nVar.f1031o = mVar;
    }

    @Override // io.sentry.ScopeCallback
    public void run(IScope iScope) {
        switch (this.f977a) {
            case 18:
                ((SentryGestureListener) this.f978b).lambda$startTracing$0((ITransaction) this.f979c, iScope);
                break;
            default:
                SentryFlutterPlugin.removeContexts$lambda$6((String) this.f978b, (A5.r) this.f979c, iScope);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Exception {
        switch (this.f977a) {
            case 2:
                C0061e c0061e = (C0061e) this.f978b;
                c0061e.getClass();
                boolean zIsSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f979c;
                if (zIsSuccessful) {
                    taskCompletionSource.setResult(new C0062f(c0061e, (Map) task.getResult()));
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
            case 11:
                K4.j jVar = (K4.j) this.f978b;
                jVar.getClass();
                if (!task.isSuccessful()) {
                    if ((task.getException() instanceof I) && ((I) task.getException()).f1098a == H.UNAUTHENTICATED) {
                        K4.r rVar = jVar.f4026c;
                        rVar.f4054b.a0();
                        rVar.f4055c.Z();
                    }
                    throw task.getException();
                }
                HashMap map = new HashMap();
                for (Map.Entry entry : ((P) task.getResult()).w().v().entrySet()) {
                    Object key = entry.getKey();
                    HashMap map2 = (HashMap) this.f979c;
                    p113p3.f.O("%s not present in aliasMap", map2.containsKey(key), entry.getKey());
                    map.put((String) map2.get(entry.getKey()), (I0) entry.getValue());
                }
                return map;
            default:
                C0247p c0247p = (C0247p) this.f978b;
                c0247p.getClass();
                return Tasks.forResult(((Q) task.getResult()).n((H2.r) this.f979c, (C0437d) c0247p.f2708c));
        }
    }

    @Override // io.sentry.util.HintUtils.SentryConsumer
    public void accept(Object obj) {
        ((AndroidEnvelopeCache) this.f978b).lambda$store$0((SentryAndroidOptions) this.f979c, (AnrV2Integration.AnrV2Hint) obj);
    }
}
