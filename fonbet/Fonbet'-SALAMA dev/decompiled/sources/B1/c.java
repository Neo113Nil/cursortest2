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
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.SparseArray;
import c2.C0819z;
import c2.e0;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.Timestamp;
import com.google.protobuf.AbstractC0911k;
import com.google.protobuf.M;
import g4.C1128a;
import g4.C1145r;
import g4.InterfaceC1131d;
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
import k4.AbstractC1341c;
import u2.AbstractC1623C;
import u2.C1622B;
import u2.D;
import u2.V;
import u2.y;
import v2.t;
import w1.C1726n0;
import w1.P2;
import w1.V0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements v2.f, v2.e, Continuation, L4.p, L4.n, InterfaceC1131d, N4.a, HintUtils.SentryConsumer, Scope.IWithTransaction, ScopeCallback, Sentry.OptionsConfiguration, LazyEvaluator.Evaluator, t2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f979c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f977a = i7;
        this.f978b = obj;
        this.f979c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    @Override // t2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public L a(int i7, e0 e0Var, int[] iArr) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Point point;
        int i13;
        int i14;
        Object obj = this.f979c;
        Object obj2 = this.f978b;
        boolean z4 = true;
        switch (this.f977a) {
            case 24:
                int i15 = ((int[]) obj)[i7];
                t2.i iVar = (t2.i) obj2;
                int i16 = iVar.f16442z;
                if (i16 == Integer.MAX_VALUE || (i9 = iVar.f16417A) == Integer.MAX_VALUE) {
                    i8 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                } else {
                    int i17 = Integer.MAX_VALUE;
                    int i18 = 0;
                    while (i18 < e0Var.f10341a) {
                        X x4 = e0Var.f10344d[i18];
                        int i19 = x4.f288H;
                        if (i19 > 0 && (i10 = x4.f289I) > 0) {
                            if (iVar.f16418B) {
                                if ((i19 > i10 ? z4 : false) != (i16 > i9 ? z4 : false)) {
                                    i12 = i16;
                                    i11 = i9;
                                    int i20 = i19 * i12;
                                    int i21 = i10 * i11;
                                    point = i20 < i21 ? new Point(i11, t.g(i21, i19)) : new Point(t.g(i20, i10), i12);
                                    i13 = x4.f288H;
                                    i14 = i13 * i10;
                                    if (i13 >= ((int) (point.x * 0.98f)) && i10 >= ((int) (point.y * 0.98f)) && i14 < i17) {
                                        i17 = i14;
                                    }
                                }
                            }
                            i11 = i16;
                            i12 = i9;
                            int i202 = i19 * i12;
                            int i212 = i10 * i11;
                            if (i202 < i212) {
                            }
                            i13 = x4.f288H;
                            i14 = i13 * i10;
                            if (i13 >= ((int) (point.x * 0.98f))) {
                                i17 = i14;
                            }
                        }
                        i18++;
                        z4 = true;
                    }
                    i8 = i17;
                }
                C0165x c0165x = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i22 = 0;
                int i23 = 0;
                while (i22 < e0Var.f10341a) {
                    int b7 = e0Var.f10344d[i22].b();
                    t2.o oVar = new t2.o(i7, e0Var, i22, iVar, iArr[i22], i15, i8 == Integer.MAX_VALUE || (b7 != -1 && b7 <= i8));
                    int i24 = i23 + 1;
                    if (objArr.length < i24) {
                        objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i24));
                    }
                    objArr[i23] = oVar;
                    i22++;
                    i23 = i24;
                }
                return AbstractC0167z.B(i23, objArr);
            default:
                C0165x c0165x2 = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArr2 = new Object[4];
                int i25 = 0;
                int i26 = 0;
                while (i25 < e0Var.f10341a) {
                    t2.l lVar = new t2.l(i7, e0Var, i25, (t2.i) obj2, iArr[i25], (String) obj);
                    int i27 = i26 + 1;
                    if (objArr2.length < i27) {
                        objArr2 = Arrays.copyOf(objArr2, C0164w.e(objArr2.length, i27));
                    }
                    objArr2[i26] = lVar;
                    i25++;
                    i26 = i27;
                }
                return AbstractC0167z.B(i26, objArr2);
        }
    }

    @Override // io.sentry.Scope.IWithTransaction
    public void accept(ITransaction iTransaction) {
        ((SentryGestureListener) this.f978b).lambda$clearScope$2((IScope) this.f979c, iTransaction);
    }

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
                    X4.c C3 = X4.c.C(cursor.getBlob(2));
                    return new D4.i(str, new D4.h(P2.m(C3.z(), C3.A()), C3.y().equals(X4.b.FIRST) ? 1 : 2), new H4.n(new Timestamp(cursor.getLong(0), cursor.getInt(1))));
                } catch (M e7) {
                    p3.f.F("NamedQuery failed to parse: %s", e7);
                    throw null;
                }
            default:
                H4.k kVar = (H4.k) obj;
                if (!((C) this.f978b).g(kVar)) {
                    if (!((Set) this.f979c).contains(kVar.f3323a)) {
                        z4 = false;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = true;
                return Boolean.valueOf(z4);
        }
    }

    @Override // N4.a
    public void b(N4.b bVar) {
        ((N4.a) this.f978b).b(bVar);
        ((N4.a) this.f979c).b(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06e1 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05da  */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [B1.m, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v26, types: [A1.X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v46 */
    @Override // v2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Object obj, v2.d dVar) {
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
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i17;
        int i18;
        int i19;
        X x4;
        int i20;
        int i21;
        int i22;
        N n2;
        n nVar;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        Object obj2;
        DrmInitData drmInitData;
        int i23;
        h hVar = (h) this.f978b;
        AbstractC0021h abstractC0021h = (AbstractC0021h) this.f979c;
        b bVar = (b) obj;
        SparseArray sparseArray = hVar.f990e;
        SparseArray sparseArray2 = new SparseArray(dVar.f17104a.size());
        for (int i24 = 0; i24 < dVar.f17104a.size(); i24++) {
            int a2 = dVar.a(i24);
            a aVar = (a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        n nVar2 = (n) bVar;
        nVar2.getClass();
        if (dVar.f17104a.size() == 0) {
            return;
        }
        for (int i25 = 0; i25 < dVar.f17104a.size(); i25++) {
            int a4 = dVar.a(i25);
            a aVar2 = (a) sparseArray2.get(a4);
            aVar2.getClass();
            if (a4 == 0) {
                j jVar = nVar2.f1019b;
                synchronized (jVar) {
                    try {
                        jVar.f1007d.getClass();
                        R0 r02 = jVar.f1008e;
                        jVar.f1008e = aVar2.f969b;
                        Iterator it = jVar.f1006c.values().iterator();
                        while (it.hasNext()) {
                            i iVar = (i) it.next();
                            if (iVar.b(r02, jVar.f1008e) && !iVar.a(aVar2)) {
                            }
                            it.remove();
                            if (iVar.f999e) {
                                if (iVar.f995a.equals(jVar.f1009f)) {
                                    jVar.f1009f = null;
                                }
                                jVar.f1007d.d(aVar2, iVar.f995a);
                            }
                        }
                        jVar.c(aVar2);
                    } finally {
                    }
                }
            } else if (a4 == 11) {
                j jVar2 = nVar2.f1019b;
                int i26 = nVar2.f1027k;
                synchronized (jVar2) {
                    try {
                        jVar2.f1007d.getClass();
                        boolean z7 = i26 == 0;
                        Iterator it2 = jVar2.f1006c.values().iterator();
                        while (it2.hasNext()) {
                            i iVar2 = (i) it2.next();
                            if (iVar2.a(aVar2)) {
                                it2.remove();
                                if (iVar2.f999e) {
                                    boolean equals = iVar2.f995a.equals(jVar2.f1009f);
                                    if (z7 && equals) {
                                        boolean z8 = iVar2.f1000f;
                                    }
                                    if (equals) {
                                        jVar2.f1009f = null;
                                    }
                                    jVar2.f1007d.d(aVar2, iVar2.f995a);
                                }
                            }
                        }
                        jVar2.c(aVar2);
                    } finally {
                    }
                }
            } else {
                nVar2.f1019b.d(aVar2);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (dVar.f17104a.get(0)) {
            a aVar3 = (a) sparseArray2.get(0);
            aVar3.getClass();
            if (nVar2.j != null) {
                nVar2.c(aVar3.f969b, aVar3.f971d);
            }
        }
        if (dVar.f17104a.get(2) && nVar2.j != null) {
            N n7 = (N) abstractC0021h;
            n7.W();
            C0165x listIterator = n7.f154b0.f593i.f16446d.f236a.listIterator(0);
            loop4: while (true) {
                if (!listIterator.hasNext()) {
                    drmInitData = null;
                    break;
                }
                S0 s02 = (S0) listIterator.next();
                for (int i27 = 0; i27 < s02.f227a; i27++) {
                    if (s02.f231e[i27] && (drmInitData = s02.f228b.f10344d[i27].f286F) != null) {
                        break loop4;
                    }
                }
            }
            if (drmInitData != null) {
                PlaybackMetrics.Builder builder = nVar2.j;
                int i28 = t.f17153a;
                PlaybackMetrics.Builder g3 = F.g(builder);
                int i29 = 0;
                while (true) {
                    if (i29 >= drmInitData.f10556d) {
                        i23 = 1;
                        break;
                    }
                    UUID uuid = drmInitData.f10553a[i29].f10558b;
                    if (uuid.equals(AbstractC0029l.f465d)) {
                        i23 = 3;
                        break;
                    } else if (uuid.equals(AbstractC0029l.f466e)) {
                        i23 = 2;
                        break;
                    } else {
                        if (uuid.equals(AbstractC0029l.f464c)) {
                            i23 = 6;
                            break;
                        }
                        i29++;
                    }
                }
                g3.setDrmType(i23);
            }
        }
        if (dVar.f17104a.get(1011)) {
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
            int i30 = rVar.f535a;
            if (i30 == 1001) {
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
                int i31 = 27;
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
                    } else {
                        if (cause instanceof R1.o) {
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
                            } else if (t.f17153a < 16 || !(cause instanceof MediaCodec.CryptoException)) {
                                lVar = new l(22, 0, 0);
                            } else {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (t.r(errorCode2)) {
                                    case 6002:
                                        i31 = 24;
                                        break;
                                    case 6003:
                                        i31 = 28;
                                        break;
                                    case 6004:
                                        i31 = 25;
                                        break;
                                    case 6005:
                                        i31 = 26;
                                        break;
                                }
                                lVar = new l(i31, errorCode2, 0);
                            }
                        }
                        PlaybackSession playbackSession = nVar2.f1020c;
                        timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                        subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                        exception = subErrorCode.setException(rVar);
                        build = exception.build();
                        playbackSession.reportPlaybackErrorEvent(build);
                        nVar2.f1017A = true;
                        nVar2.f1030n = null;
                    }
                    i12 = 13;
                    PlaybackSession playbackSession2 = nVar2.f1020c;
                    timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                    subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                    exception = subErrorCode.setException(rVar);
                    build = exception.build();
                    playbackSession2.reportPlaybackErrorEvent(build);
                    nVar2.f1017A = true;
                    nVar2.f1030n = null;
                } else if (cause instanceof D) {
                    lVar = new l(5, ((D) cause).f16709d, 0);
                } else {
                    if ((cause instanceof AbstractC1623C) || (cause instanceof C0045t0)) {
                        i13 = 9;
                        i14 = 7;
                        i15 = 6;
                        i16 = 8;
                        lVar = new l(z9 ? 10 : 11, 0, 0);
                    } else {
                        boolean z10 = cause instanceof C1622B;
                        if (z10 || (cause instanceof V)) {
                            i13 = 9;
                            if (v2.n.e(nVar2.f1018a).f() == 1) {
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
                                    PlaybackSession playbackSession22 = nVar2.f1020c;
                                    timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                                    subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                                    exception = subErrorCode.setException(rVar);
                                    build = exception.build();
                                    playbackSession22.reportPlaybackErrorEvent(build);
                                    nVar2.f1017A = true;
                                    nVar2.f1030n = null;
                                } else {
                                    i15 = 6;
                                    if (cause2 instanceof SocketTimeoutException) {
                                        i14 = 7;
                                        lVar = new l(7, 0, 0);
                                    } else {
                                        i14 = 7;
                                        if (z10 && ((C1622B) cause).f16708c == 1) {
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
                                    PlaybackSession playbackSession222 = nVar2.f1020c;
                                    timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                                    errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                                    subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                                    exception = subErrorCode.setException(rVar);
                                    build = exception.build();
                                    playbackSession222.reportPlaybackErrorEvent(build);
                                    nVar2.f1017A = true;
                                    nVar2.f1030n = null;
                                }
                            }
                        } else if (i30 == 1002) {
                            lVar = new l(21, 0, 0);
                        } else if (cause instanceof E1.c) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i32 = t.f17153a;
                            if (i32 < 21 || !(cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                lVar = (i32 < 23 || !(cause3 instanceof MediaDrmResetException)) ? (i32 < 18 || !(cause3 instanceof NotProvisionedException)) ? (i32 < 18 || !(cause3 instanceof DeniedByServerException)) ? cause3 instanceof E1.j ? new l(23, 0, 0) : cause3 instanceof E1.a ? new l(28, 0, 0) : new l(30, 0, 0) : new l(29, 0, 0) : new l(24, 0, 0) : new l(27, 0, 0);
                            } else {
                                int s7 = t.s(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                switch (t.r(s7)) {
                                    case 6002:
                                        i31 = 24;
                                        break;
                                    case 6003:
                                        i31 = 28;
                                        break;
                                    case 6004:
                                        i31 = 25;
                                        break;
                                    case 6005:
                                        i31 = 26;
                                        break;
                                }
                                lVar = new l(i31, s7, 0);
                            }
                        } else if ((cause instanceof y) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            lVar = (t.f17153a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new l(32, 0, 0) : new l(31, 0, 0);
                        } else {
                            i13 = 9;
                            lVar = new l(9, 0, 0);
                        }
                        i11 = i13;
                        i12 = 13;
                        i8 = 8;
                        i9 = 6;
                        i10 = 7;
                        PlaybackSession playbackSession2222 = nVar2.f1020c;
                        timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                        subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                        exception = subErrorCode.setException(rVar);
                        build = exception.build();
                        playbackSession2222.reportPlaybackErrorEvent(build);
                        nVar2.f1017A = true;
                        nVar2.f1030n = null;
                    }
                    i11 = i13;
                    i10 = i14;
                    i9 = i15;
                    i8 = i16;
                    i12 = 13;
                    PlaybackSession playbackSession22222 = nVar2.f1020c;
                    timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                    errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
                    subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
                    exception = subErrorCode.setException(rVar);
                    build = exception.build();
                    playbackSession22222.reportPlaybackErrorEvent(build);
                    nVar2.f1017A = true;
                    nVar2.f1030n = null;
                }
            }
            i12 = 13;
            i8 = 8;
            i9 = 6;
            i10 = 7;
            i11 = 9;
            PlaybackSession playbackSession222222 = nVar2.f1020c;
            timeSinceCreatedMillis = k.g().setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
            errorCode = timeSinceCreatedMillis.setErrorCode(lVar.f1011b);
            subErrorCode = errorCode.setSubErrorCode(lVar.f1012c);
            exception = subErrorCode.setException(rVar);
            build = exception.build();
            playbackSession222222.reportPlaybackErrorEvent(build);
            nVar2.f1017A = true;
            nVar2.f1030n = null;
        }
        if (dVar.f17104a.get(2)) {
            N n8 = (N) abstractC0021h;
            n8.W();
            T0 t02 = n8.f154b0.f593i.f16446d;
            boolean b7 = t02.b(2);
            boolean b8 = t02.b(1);
            boolean b9 = t02.b(3);
            if (b7 || b8 || b9) {
                if (b7) {
                    i17 = i8;
                    i18 = i9;
                    i19 = i10;
                    obj2 = null;
                } else {
                    if (!t.a(nVar2.f1034r, null)) {
                        int i33 = nVar2.f1034r == null ? 1 : 0;
                        nVar2.f1034r = null;
                        i19 = i10;
                        i21 = i12;
                        i17 = i8;
                        i20 = 10;
                        i18 = i9;
                        x4 = 0;
                        nVar2.e(1, elapsedRealtime, null, i33);
                        if (!b8 && !t.a(nVar2.f1035s, x4)) {
                            int i34 = nVar2.f1035s != null ? 1 : 0;
                            nVar2.f1035s = x4;
                            nVar2.e(0, elapsedRealtime, x4, i34);
                        }
                        if (!b9 && !t.a(nVar2.f1036t, x4)) {
                            int i35 = nVar2.f1036t != null ? 1 : 0;
                            nVar2.f1036t = x4;
                            nVar2.e(2, elapsedRealtime, x4, i35);
                        }
                        if (nVar2.a(nVar2.f1031o)) {
                            m mVar = nVar2.f1031o;
                            X x7 = (X) mVar.f1015c;
                            if (x7.f289I != -1) {
                                int i36 = mVar.f1014b;
                                if (!t.a(nVar2.f1034r, x7)) {
                                    int i37 = (nVar2.f1034r == null && i36 == 0) ? 1 : i36;
                                    nVar2.f1034r = x7;
                                    nVar2.e(1, elapsedRealtime, x7, i37);
                                }
                                nVar2.f1031o = x4;
                            }
                        }
                        if (nVar2.a(nVar2.f1032p)) {
                            m mVar2 = nVar2.f1032p;
                            X x8 = (X) mVar2.f1015c;
                            int i38 = mVar2.f1014b;
                            if (!t.a(nVar2.f1035s, x8)) {
                                int i39 = (nVar2.f1035s == null && i38 == 0) ? 1 : i38;
                                nVar2.f1035s = x8;
                                nVar2.e(0, elapsedRealtime, x8, i39);
                            }
                            nVar2.f1032p = x4;
                        }
                        if (nVar2.a(nVar2.f1033q)) {
                            m mVar3 = nVar2.f1033q;
                            X x9 = (X) mVar3.f1015c;
                            int i40 = mVar3.f1014b;
                            if (!t.a(nVar2.f1036t, x9)) {
                                int i41 = (nVar2.f1036t == null && i40 == 0) ? 1 : i40;
                                nVar2.f1036t = x9;
                                nVar2.e(2, elapsedRealtime, x9, i41);
                            }
                            nVar2.f1033q = x4;
                        }
                        switch (v2.n.e(nVar2.f1018a).f()) {
                            case 0:
                                i22 = 0;
                                break;
                            case 1:
                                i22 = i11;
                                break;
                            case 2:
                                i22 = 2;
                                break;
                            case 3:
                                i22 = 4;
                                break;
                            case 4:
                                i22 = 5;
                                break;
                            case 5:
                                i22 = i18;
                                break;
                            case 6:
                            case 8:
                            default:
                                i22 = 1;
                                break;
                            case 7:
                                i22 = 3;
                                break;
                            case 9:
                                i22 = i17;
                                break;
                            case 10:
                                i22 = i19;
                                break;
                        }
                        if (i22 != nVar2.f1029m) {
                            nVar2.f1029m = i22;
                            PlaybackSession playbackSession3 = nVar2.f1020c;
                            networkType = k.c().setNetworkType(i22);
                            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                            build3 = timeSinceCreatedMillis3.build();
                            playbackSession3.reportNetworkEvent(build3);
                        }
                        n2 = (N) abstractC0021h;
                        if (n2.E() != 2) {
                            nVar2.f1037u = false;
                        }
                        n2.W();
                        if (n2.f154b0.f590f == null) {
                            nVar2.f1039w = false;
                        } else if (dVar.f17104a.get(i20)) {
                            nVar2.f1039w = true;
                        }
                        int E7 = n2.E();
                        if (nVar2.f1037u) {
                            i20 = 5;
                        } else if (nVar2.f1039w) {
                            i20 = i21;
                        } else if (E7 == 4) {
                            i20 = 11;
                        } else {
                            int i42 = 2;
                            if (E7 == 2) {
                                int i43 = nVar2.f1028l;
                                if (i43 != 0 && i43 != 2) {
                                    if (n2.D()) {
                                        n2.W();
                                        if (n2.f154b0.f596m == 0) {
                                            i20 = i18;
                                        }
                                    } else {
                                        i20 = i19;
                                    }
                                }
                                i20 = i42;
                            } else {
                                i42 = 3;
                                if (E7 != 3) {
                                    i20 = (E7 != 1 || nVar2.f1028l == 0) ? nVar2.f1028l : 12;
                                } else if (n2.D()) {
                                    n2.W();
                                    if (n2.f154b0.f596m != 0) {
                                        i20 = i11;
                                    }
                                    i20 = i42;
                                } else {
                                    i20 = 4;
                                }
                            }
                        }
                        if (nVar2.f1028l != i20) {
                            nVar2.f1028l = i20;
                            nVar2.f1017A = true;
                            PlaybackSession playbackSession4 = nVar2.f1020c;
                            state = F.j().setState(nVar2.f1028l);
                            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - nVar2.f1021d);
                            build2 = timeSinceCreatedMillis2.build();
                            playbackSession4.reportPlaybackStateEvent(build2);
                        }
                        if (dVar.f17104a.get(1028)) {
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
                            return;
                        }
                        return;
                    }
                    i17 = i8;
                    obj2 = null;
                    i18 = i9;
                    i19 = i10;
                }
                i20 = 10;
                i21 = i12;
                x4 = obj2;
                if (!b8) {
                    if (nVar2.f1035s != null) {
                    }
                    nVar2.f1035s = x4;
                    nVar2.e(0, elapsedRealtime, x4, i34);
                }
                if (!b9) {
                    if (nVar2.f1036t != null) {
                    }
                    nVar2.f1036t = x4;
                    nVar2.e(2, elapsedRealtime, x4, i35);
                }
                if (nVar2.a(nVar2.f1031o)) {
                }
                if (nVar2.a(nVar2.f1032p)) {
                }
                if (nVar2.a(nVar2.f1033q)) {
                }
                switch (v2.n.e(nVar2.f1018a).f()) {
                }
                if (i22 != nVar2.f1029m) {
                }
                n2 = (N) abstractC0021h;
                if (n2.E() != 2) {
                }
                n2.W();
                if (n2.f154b0.f590f == null) {
                }
                int E72 = n2.E();
                if (nVar2.f1037u) {
                }
                if (nVar2.f1028l != i20) {
                }
                if (dVar.f17104a.get(1028)) {
                }
            }
        }
        i17 = i8;
        i18 = i9;
        i19 = i10;
        x4 = 0;
        i20 = 10;
        i21 = i12;
        if (nVar2.a(nVar2.f1031o)) {
        }
        if (nVar2.a(nVar2.f1032p)) {
        }
        if (nVar2.a(nVar2.f1033q)) {
        }
        switch (v2.n.e(nVar2.f1018a).f()) {
        }
        if (i22 != nVar2.f1029m) {
        }
        n2 = (N) abstractC0021h;
        if (n2.E() != 2) {
        }
        n2.W();
        if (n2.f154b0.f590f == null) {
        }
        int E722 = n2.E();
        if (nVar2.f1037u) {
        }
        if (nVar2.f1028l != i20) {
        }
        if (dVar.f17104a.get(1028)) {
        }
    }

    @Override // io.sentry.Sentry.OptionsConfiguration
    public void configure(SentryOptions sentryOptions) {
        SentryFlutterPlugin.initNativeSdk$lambda$0((SentryFlutterPlugin) this.f978b, (Map) this.f979c, (SentryAndroidOptions) sentryOptions);
    }

    @Override // g4.InterfaceC1131d
    public Object e(C1145r c1145r) {
        String str;
        switch (this.f977a) {
            case 13:
                Context context = (Context) c1145r.a(Context.class);
                switch (((R5.M) this.f979c).f6088a) {
                    case 10:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        }
                    case 11:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 == null) {
                            str = "";
                            break;
                        } else {
                            str = String.valueOf(applicationInfo2.minSdkVersion);
                            break;
                        }
                    case 12:
                        int i7 = Build.VERSION.SDK_INT;
                        if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                                    if (i7 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                                        str = "embedded";
                                        break;
                                    } else {
                                        str = "";
                                        break;
                                    }
                                } else {
                                    str = "auto";
                                    break;
                                }
                            } else {
                                str = "watch";
                                break;
                            }
                        } else {
                            str = "tv";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName == null) {
                            str = "";
                            break;
                        } else {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        }
                }
                return new R4.a((String) this.f978b, str);
            default:
                String str2 = (String) this.f978b;
                C1128a c1128a = (C1128a) this.f979c;
                try {
                    Trace.beginSection(str2);
                    return c1128a.f13188f.e(c1145r);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // io.sentry.util.LazyEvaluator.Evaluator
    public Object evaluate() {
        String lambda$new$0;
        String lambda$new$1;
        switch (this.f977a) {
            case zzbbd.zzt.zzm /* 21 */:
                lambda$new$0 = ((SentryId) this.f978b).lambda$new$0((UUID) this.f979c);
                return lambda$new$0;
            default:
                lambda$new$1 = ((SentryId) this.f978b).lambda$new$1((String) this.f979c);
                return lambda$new$1;
        }
    }

    @Override // L4.p
    public Object get() {
        Long l7;
        Long l8;
        D4.e eVar;
        boolean z4;
        switch (this.f977a) {
            case 3:
                C0279l c0279l = (C0279l) this.f978b;
                I4.j jVar = (I4.j) this.f979c;
                I4.i iVar = (I4.i) jVar.f3678b;
                c0279l.f2993c.i(iVar, (AbstractC0911k) jVar.f3681e);
                Iterator it = iVar.b().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    ArrayList arrayList = (ArrayList) jVar.f3680d;
                    List list = iVar.f3676d;
                    int i7 = 0;
                    if (!hasNext) {
                        c0279l.f2993c.k(iVar);
                        c0279l.f2993c.a();
                        c0279l.f2994d.G(iVar.f3673a);
                        k1.g gVar = c0279l.f2996f;
                        HashSet hashSet = new HashSet();
                        while (i7 < arrayList.size()) {
                            if (!((I4.k) arrayList.get(i7)).f3684b.isEmpty()) {
                                hashSet.add(((I4.h) list.get(i7)).f3670a);
                            }
                            i7++;
                        }
                        gVar.M(((G4.D) gVar.f14674a).n(hashSet));
                        return c0279l.f2996f.v(iVar.b());
                    }
                    H4.h hVar = (H4.h) it.next();
                    G4.D d7 = c0279l.f2995e;
                    H4.k y4 = d7.y(hVar);
                    H4.n nVar = (H4.n) ((AbstractC1341c) jVar.f3682f).m(hVar);
                    p3.f.O("docVersions should contain every doc in the write.", nVar != null, new Object[0]);
                    if (y4.f3325c.compareTo(nVar) < 0) {
                        int size = list.size();
                        p3.f.O("Mismatch between mutations length (%d) and results length (%d)", arrayList.size() == size, Integer.valueOf(size), Integer.valueOf(arrayList.size()));
                        while (i7 < size) {
                            I4.h hVar2 = (I4.h) list.get(i7);
                            if (hVar2.f3670a.equals(y4.f3323a)) {
                                hVar2.b(y4, (I4.k) arrayList.get(i7));
                            }
                            i7++;
                        }
                        if (!t.e.b(y4.f3324b, 1)) {
                            d7.i(y4, (H4.n) jVar.f3679c);
                        }
                    }
                }
            case 4:
                SparseArray sparseArray = ((C0279l) this.f978b).f3000k;
                G4.r rVar = (G4.r) this.f979c;
                E4.y yVar = rVar.f3020b;
                long j = -1;
                if (yVar.f2247a == -1) {
                    Q0.a.v(1, "LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
                    return new C0283p();
                }
                Object obj = rVar.f3019a;
                S s7 = (S) ((G4.M) obj).f2916b;
                Cursor J5 = s7.c0("PRAGMA page_count").J();
                try {
                    if (J5.moveToFirst()) {
                        l7 = Long.valueOf(J5.getLong(0));
                        J5.close();
                    } else {
                        J5.close();
                        l7 = null;
                    }
                    long longValue = l7.longValue();
                    Cursor J6 = s7.c0("PRAGMA page_size").J();
                    try {
                        Long valueOf = J6.moveToFirst() ? Long.valueOf(J6.getLong(0)) : null;
                        J6.close();
                        long longValue2 = valueOf.longValue() * longValue;
                        long j3 = yVar.f2247a;
                        if (longValue2 < j3) {
                            StringBuilder j7 = e1.k.j("Garbage collection skipped; Cache size ", " is lower than threshold ", longValue2);
                            j7.append(j3);
                            Q0.a.v(1, "LruGarbageCollector", j7.toString(), new Object[0]);
                            return new C0283p();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        S s8 = (S) ((G4.M) obj).f2916b;
                        long j8 = s8.f2931e.f2952f;
                        Cursor J7 = s8.c0("SELECT COUNT(*) FROM (SELECT sequence_number FROM target_documents GROUP BY path HAVING COUNT(*) = 1 AND target_id = 0)").J();
                        try {
                            if (J7.moveToFirst()) {
                                l8 = Long.valueOf(J7.getLong(0));
                                J7.close();
                            } else {
                                J7.close();
                                l8 = null;
                            }
                            int longValue3 = (int) ((10 / 100.0f) * (l8.longValue() + j8));
                            if (longValue3 > 1000) {
                                Q0.a.v(1, "LruGarbageCollector", e1.k.d(longValue3, "Capping sequence numbers to collect down to the maximum of 1000 from "), new Object[0]);
                                longValue3 = 1000;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis();
                            if (longValue3 != 0) {
                                final C0284q c0284q = new C0284q();
                                c0284q.f3015a = longValue3;
                                c0284q.f3016b = new PriorityQueue(longValue3, C0284q.f3014c);
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
                                Cursor J8 = w7.f2947a.c0("SELECT target_proto FROM targets").J();
                                while (J8.moveToNext()) {
                                    try {
                                        hVar3.accept(w7.k(J8.getBlob(0)));
                                    } finally {
                                    }
                                }
                                J8.close();
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
                                J8 = ((S) ((G4.M) obj).f2916b).c0("select sequence_number from target_documents group by path having COUNT(*) = 1 AND target_id = 0").J();
                                while (J8.moveToNext()) {
                                    try {
                                        hVar4.accept(Long.valueOf(J8.getLong(0)));
                                    } finally {
                                    }
                                }
                                J8.close();
                                j = ((Long) ((PriorityQueue) c0284q.f3016b).peek()).longValue();
                            }
                            long currentTimeMillis3 = System.currentTimeMillis();
                            W w8 = ((S) ((G4.M) obj).f2916b).f2931e;
                            int[] iArr = new int[1];
                            C1726n0 c0 = w8.f2947a.c0("SELECT target_id FROM targets WHERE last_listen_sequence_number <= ?");
                            c0.c(Long.valueOf(j));
                            c0.m(new G4.N(w8, sparseArray, iArr, 1));
                            w8.m();
                            int i10 = iArr[0];
                            long currentTimeMillis4 = System.currentTimeMillis();
                            final G4.M m7 = (G4.M) obj;
                            m7.getClass();
                            final int[] iArr2 = new int[1];
                            final ArrayList arrayList2 = new ArrayList();
                            final H4.m[] mVarArr = {H4.m.f3331b};
                            while (true) {
                                S s9 = (S) m7.f2916b;
                                long j9 = currentTimeMillis4;
                                C1726n0 c02 = s9.c0("select path from target_documents group by path having COUNT(*) = 1 AND target_id = 0 AND sequence_number <= ? AND path > ? LIMIT ?");
                                long j10 = j;
                                int i11 = longValue3;
                                c02.c(Long.valueOf(j), p3.f.C(mVarArr[0]), 100);
                                if (c02.m(new L4.h() { // from class: G4.L
                                    @Override // L4.h
                                    public final void accept(Object obj2) {
                                        boolean moveToFirst;
                                        M m8 = M.this;
                                        m8.getClass();
                                        H4.m A7 = p3.f.A(((Cursor) obj2).getString(0));
                                        H4.h hVar5 = new H4.h(A7);
                                        boolean l9 = ((V0) m8.f2919e).l(hVar5);
                                        S s10 = (S) m8.f2916b;
                                        H4.m mVar = hVar5.f3318a;
                                        if (l9) {
                                            moveToFirst = true;
                                        } else {
                                            C1726n0 c03 = s10.c0("SELECT 1 FROM document_mutations WHERE path = ?");
                                            c03.c(p3.f.C(mVar));
                                            Cursor J9 = c03.J();
                                            try {
                                                moveToFirst = J9.moveToFirst();
                                                J9.close();
                                            } catch (Throwable th) {
                                                if (J9 != null) {
                                                    try {
                                                        J9.close();
                                                    } catch (Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                }
                                                throw th;
                                            }
                                        }
                                        if (!moveToFirst) {
                                            int[] iArr3 = iArr2;
                                            iArr3[0] = iArr3[0] + 1;
                                            arrayList2.add(hVar5);
                                            s10.b0("DELETE FROM target_documents WHERE path = ? AND target_id = 0", p3.f.C(mVar));
                                        }
                                        mVarArr[0] = A7;
                                    }
                                }) != 100) {
                                    s9.f2933g.o(arrayList2);
                                    int i12 = iArr2[0];
                                    long currentTimeMillis5 = System.currentTimeMillis();
                                    if (Q0.a.E()) {
                                        StringBuilder c3 = t.e.c(AbstractC0486a1.i(new StringBuilder("LRU Garbage Collection:\n\tCounted targets in "), currentTimeMillis2 - currentTimeMillis, "ms\n"));
                                        Locale locale = Locale.ROOT;
                                        c3.append("\tDetermined least recently used " + i11 + " sequence numbers in " + (currentTimeMillis3 - currentTimeMillis2) + "ms\n");
                                        StringBuilder c4 = t.e.c(c3.toString());
                                        c4.append("\tRemoved " + i10 + " targets in " + (j9 - currentTimeMillis3) + "ms\n");
                                        StringBuilder c7 = t.e.c(c4.toString());
                                        c7.append("\tRemoved " + i12 + " documents in " + (currentTimeMillis5 - j9) + "ms\n");
                                        StringBuilder c8 = t.e.c(c7.toString());
                                        c8.append("Total Duration: " + (currentTimeMillis5 - currentTimeMillis) + "ms");
                                        Q0.a.v(1, "LruGarbageCollector", c8.toString(), new Object[0]);
                                    }
                                    return new C0283p();
                                }
                                currentTimeMillis4 = j9;
                                longValue3 = i11;
                                j = j10;
                            }
                        } finally {
                            if (J7 == null) {
                                throw th;
                            }
                            try {
                                J7.close();
                                throw th;
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                        if (J6 == null) {
                            throw th;
                        }
                        try {
                            J6.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                } finally {
                    if (J5 == null) {
                        throw th;
                    }
                    try {
                        J5.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            case 5:
                C0279l c0279l2 = (C0279l) this.f978b;
                c0279l2.getClass();
                D4.e eVar2 = (D4.e) this.f979c;
                String str = eVar2.f1749a;
                P2 p22 = c0279l2.j;
                switch (p22.f17507a) {
                    case 9:
                        eVar = (D4.e) ((HashMap) p22.f17508b).get(str);
                        break;
                    default:
                        C1726n0 c03 = ((S) p22.f17508b).c0("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
                        c03.c(str);
                        eVar = (D4.e) c03.l(new E(str));
                        break;
                }
                if (eVar != null) {
                    if (eVar.f1751c.f3333a.compareTo(eVar2.f1751c.f3333a) >= 0) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
                z4 = false;
                return Boolean.valueOf(z4);
            default:
                P2 p23 = ((C0279l) this.f978b).j;
                String str2 = (String) this.f979c;
                switch (p23.f17507a) {
                    case 9:
                        return (D4.i) ((HashMap) p23.f17509c).get(str2);
                    default:
                        C1726n0 c04 = ((S) p23.f17508b).c0("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
                        c04.c(str2);
                        return (D4.i) c04.l(new c(7, p23, str2));
                }
        }
    }

    @Override // v2.e
    public void invoke(Object obj) {
        n nVar = (n) ((b) obj);
        nVar.getClass();
        a aVar = (a) this.f978b;
        c2.D d7 = aVar.f971d;
        if (d7 == null) {
            return;
        }
        C0819z c0819z = (C0819z) this.f979c;
        X x4 = c0819z.f10428c;
        x4.getClass();
        d7.getClass();
        m mVar = new m(x4, c0819z.f10429d, nVar.f1019b.b(aVar.f969b, d7), 0);
        int i7 = c0819z.f10427b;
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
    public Object then(Task task) {
        switch (this.f977a) {
            case 2:
                C0061e c0061e = (C0061e) this.f978b;
                c0061e.getClass();
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f979c;
                if (isSuccessful) {
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
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((P) task.getResult()).w().v().entrySet()) {
                    Object key = entry.getKey();
                    HashMap hashMap2 = (HashMap) this.f979c;
                    p3.f.O("%s not present in aliasMap", hashMap2.containsKey(key), entry.getKey());
                    hashMap.put((String) hashMap2.get(entry.getKey()), (I0) entry.getValue());
                }
                return hashMap;
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
