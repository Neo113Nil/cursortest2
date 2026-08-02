package I3;

import F3.InterfaceC3018x;
import F3.d0;
import I3.B;
import I3.C3226a;
import I3.n;
import I3.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.C5449k;
import androidx.media3.exoplayer.k0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.T;
import j3.AbstractC7252H;
import j3.C7253I;
import j3.C7254J;
import j3.C7255K;
import j3.C7263e;
import j3.C7272n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import m3.N;
import t3.C9734F;
import v3.ExecutorC10204F;

/* loaded from: classes.dex */
public final class n extends B implements k0.a {

    /* renamed from: l, reason: collision with root package name */
    private static final T<Integer> f11865l = T.b(new C3229d());

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f11866m = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f11867d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f11868e;

    /* renamed from: f, reason: collision with root package name */
    private final y.b f11869f;

    /* renamed from: g, reason: collision with root package name */
    private d f11870g;

    /* renamed from: h, reason: collision with root package name */
    private Thread f11871h;

    /* renamed from: i, reason: collision with root package name */
    private f f11872i;

    /* renamed from: j, reason: collision with root package name */
    private C7263e f11873j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f11874k;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends h<a> implements Comparable<a> {

        /* renamed from: e, reason: collision with root package name */
        private final int f11875e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f11876f;

        /* renamed from: g, reason: collision with root package name */
        private final String f11877g;

        /* renamed from: h, reason: collision with root package name */
        private final d f11878h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f11879i;

        /* renamed from: j, reason: collision with root package name */
        private final int f11880j;

        /* renamed from: k, reason: collision with root package name */
        private final int f11881k;

        /* renamed from: l, reason: collision with root package name */
        private final int f11882l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f11883m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f11884n;

        /* renamed from: o, reason: collision with root package name */
        private final int f11885o;

        /* renamed from: p, reason: collision with root package name */
        private final int f11886p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f11887q;

        /* renamed from: r, reason: collision with root package name */
        private final int f11888r;

        /* renamed from: s, reason: collision with root package name */
        private final int f11889s;

        /* renamed from: t, reason: collision with root package name */
        private final int f11890t;

        /* renamed from: u, reason: collision with root package name */
        private final int f11891u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f11892v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f11893w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f11894x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[LOOP:1: B:41:0x00f0->B:43:0x00f3, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0131 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x010e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i11, C7253I c7253i, int i12, d dVar, int i13, boolean z11, m mVar, int i14) {
            super(i11, c7253i, i12);
            int i15;
            int i16;
            boolean z12;
            String[] split;
            int i17;
            int i18;
            int i19;
            int i21;
            AbstractC5880y<String> abstractC5880y;
            d dVar2;
            boolean z13;
            boolean z14;
            int i22 = 2;
            this.f11878h = dVar;
            int i23 = dVar.f11909P ? 24 : 16;
            this.f11883m = dVar.f11905L && (i14 & i23) != 0;
            this.f11877g = n.t(this.f11951d.f69116d);
            this.f11879i = k0.r(i13, false);
            int i24 = 0;
            while (true) {
                AbstractC5880y<String> abstractC5880y2 = dVar.f68990p;
                i15 = Integer.MAX_VALUE;
                if (i24 >= abstractC5880y2.size()) {
                    i16 = 0;
                    i24 = Integer.MAX_VALUE;
                    break;
                } else {
                    i16 = n.r(this.f11951d, abstractC5880y2.get(i24), false);
                    if (i16 > 0) {
                        break;
                    } else {
                        i24++;
                    }
                }
            }
            this.f11881k = i24;
            this.f11880j = i16;
            int i25 = this.f11951d.f69118f;
            int i26 = dVar.f68991q;
            this.f11882l = (i25 == 0 || i25 != i26) ? Integer.bitCount(i25 & i26) : Integer.MAX_VALUE;
            C7272n c7272n = this.f11951d;
            int i27 = c7272n.f69118f;
            this.f11884n = i27 == 0 || (i27 & 1) != 0;
            this.f11887q = (c7272n.f69117e & 1) != 0;
            String str = c7272n.f69127o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            z14 = false;
                            break;
                        }
                        z14 = -1;
                        break;
                    case 187078297:
                        if (str.equals("audio/ac4")) {
                            z14 = true;
                            break;
                        }
                        z14 = -1;
                        break;
                    case 1504698186:
                        if (str.equals("audio/iamf")) {
                            z14 = 2;
                            break;
                        }
                        z14 = -1;
                        break;
                    default:
                        z14 = -1;
                        break;
                }
                switch (z14) {
                    case false:
                    case true:
                    case true:
                        z12 = true;
                        break;
                }
                this.f11894x = z12;
                int i28 = c7272n.f69102G;
                this.f11888r = i28;
                this.f11889s = c7272n.f69103H;
                int i29 = c7272n.f69122j;
                this.f11890t = i29;
                this.f11876f = (i29 != -1 || i29 <= dVar.f68993s) && (i28 == -1 || i28 <= dVar.f68992r) && mVar.apply(c7272n);
                split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
                for (i17 = 0; i17 < split.length; i17++) {
                    split[i17] = N.R(split[i17]);
                }
                i18 = 0;
                while (true) {
                    if (i18 >= split.length) {
                        i19 = n.r(this.f11951d, split[i18], false);
                        if (i19 <= 0) {
                            i18++;
                        }
                    } else {
                        i19 = 0;
                        i18 = Integer.MAX_VALUE;
                    }
                }
                this.f11885o = i18;
                this.f11886p = i19;
                i21 = 0;
                while (true) {
                    abstractC5880y = dVar.f68994t;
                    if (i21 < abstractC5880y.size()) {
                        String str2 = this.f11951d.f69127o;
                        if (str2 == null || !str2.equals(abstractC5880y.get(i21))) {
                            i21++;
                        } else {
                            i15 = i21;
                        }
                    }
                }
                this.f11891u = i15;
                this.f11892v = (i13 & 384) != 128;
                this.f11893w = (i13 & 64) != 64;
                dVar2 = this.f11878h;
                if (k0.r(i13, dVar2.f11911R) && ((z13 = this.f11876f) || dVar2.f11904K)) {
                    dVar2.f68995u.getClass();
                    if (k0.r(i13, false) || !z13 || this.f11951d.f69122j == -1 || dVar2.f68972C || dVar2.f68971B || ((!dVar2.f11913T && z11) || (i23 & i13) == 0)) {
                        i22 = 1;
                    }
                } else {
                    i22 = 0;
                }
                this.f11875e = i22;
            }
            z12 = false;
            this.f11894x = z12;
            int i282 = c7272n.f69102G;
            this.f11888r = i282;
            this.f11889s = c7272n.f69103H;
            int i292 = c7272n.f69122j;
            this.f11890t = i292;
            this.f11876f = (i292 != -1 || i292 <= dVar.f68993s) && (i282 == -1 || i282 <= dVar.f68992r) && mVar.apply(c7272n);
            split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
            while (i17 < split.length) {
            }
            i18 = 0;
            while (true) {
                if (i18 >= split.length) {
                }
                i18++;
            }
            this.f11885o = i18;
            this.f11886p = i19;
            i21 = 0;
            while (true) {
                abstractC5880y = dVar.f68994t;
                if (i21 < abstractC5880y.size()) {
                }
                i21++;
            }
            this.f11891u = i15;
            this.f11892v = (i13 & 384) != 128;
            this.f11893w = (i13 & 64) != 64;
            dVar2 = this.f11878h;
            if (k0.r(i13, dVar2.f11911R)) {
                dVar2.f68995u.getClass();
                if (k0.r(i13, false)) {
                }
                i22 = 1;
                this.f11875e = i22;
            }
            i22 = 0;
            this.f11875e = i22;
        }

        @Override // I3.n.h
        public final int a() {
            return this.f11875e;
        }

        @Override // I3.n.h
        public final boolean b(a aVar) {
            int i11;
            String str;
            int i12;
            a aVar2 = aVar;
            d dVar = this.f11878h;
            boolean z11 = dVar.f11907N;
            C7272n c7272n = aVar2.f11951d;
            C7272n c7272n2 = this.f11951d;
            if (!z11 && ((i12 = c7272n2.f69102G) == -1 || i12 != c7272n.f69102G)) {
                return false;
            }
            if (!this.f11883m && ((str = c7272n2.f69127o) == null || !TextUtils.equals(str, c7272n.f69127o))) {
                return false;
            }
            if (!dVar.f11906M && ((i11 = c7272n2.f69103H) == -1 || i11 != c7272n.f69103H)) {
                return false;
            }
            if (dVar.f11908O) {
                return true;
            }
            return this.f11892v == aVar2.f11892v && this.f11893w == aVar2.f11893w;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(a aVar) {
            boolean z11 = this.f11879i;
            boolean z12 = this.f11876f;
            T f7 = (z12 && z11) ? n.f11865l : n.f11865l.f();
            com.google.common.collect.r e11 = com.google.common.collect.r.i().f(z11, aVar.f11879i).e(Integer.valueOf(this.f11881k), Integer.valueOf(aVar.f11881k), T.d().f()).d(this.f11880j, aVar.f11880j).d(this.f11882l, aVar.f11882l).f(this.f11887q, aVar.f11887q).f(this.f11884n, aVar.f11884n).e(Integer.valueOf(this.f11885o), Integer.valueOf(aVar.f11885o), T.d().f()).d(this.f11886p, aVar.f11886p).f(z12, aVar.f11876f).e(Integer.valueOf(this.f11891u), Integer.valueOf(aVar.f11891u), T.d().f());
            boolean z13 = this.f11878h.f68971B;
            int i11 = this.f11890t;
            int i12 = aVar.f11890t;
            if (z13) {
                e11 = e11.e(Integer.valueOf(i11), Integer.valueOf(i12), n.f11865l.f());
            }
            com.google.common.collect.r e12 = e11.f(this.f11892v, aVar.f11892v).f(this.f11893w, aVar.f11893w).f(this.f11894x, aVar.f11894x).e(Integer.valueOf(this.f11888r), Integer.valueOf(aVar.f11888r), f7).e(Integer.valueOf(this.f11889s), Integer.valueOf(aVar.f11889s), f7);
            if (Objects.equals(this.f11877g, aVar.f11877g)) {
                e12 = e12.e(Integer.valueOf(i11), Integer.valueOf(i12), f7);
            }
            return e12.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class b extends h<b> implements Comparable<b> {

        /* renamed from: e, reason: collision with root package name */
        private final int f11895e;

        /* renamed from: f, reason: collision with root package name */
        private final int f11896f;

        public b(int i11, C7253I c7253i, int i12, d dVar, int i13) {
            super(i11, c7253i, i12);
            int i14;
            this.f11895e = k0.r(i13, dVar.f11911R) ? 1 : 0;
            C7272n c7272n = this.f11951d;
            int i15 = c7272n.f69134v;
            int i16 = -1;
            if (i15 != -1 && (i14 = c7272n.f69135w) != -1) {
                i16 = i15 * i14;
            }
            this.f11896f = i16;
        }

        @Override // I3.n.h
        public final int a() {
            return this.f11895e;
        }

        @Override // I3.n.h
        public final /* bridge */ /* synthetic */ boolean b(b bVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final int compareTo(b bVar) {
            return Integer.compare(this.f11896f, bVar.f11896f);
        }
    }

    /* loaded from: classes8.dex */
    private static final class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f11897a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11898b;

        public c(C7272n c7272n, int i11) {
            this.f11897a = (c7272n.f69117e & 1) != 0;
            this.f11898b = k0.r(i11, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final int compareTo(c cVar) {
            return com.google.common.collect.r.i().f(this.f11898b, cVar.f11898b).f(this.f11897a, cVar.f11897a).h();
        }
    }

    public static final class d extends C7255K {

        /* renamed from: X, reason: collision with root package name */
        public static final d f11899X = new a().F();

        /* renamed from: G, reason: collision with root package name */
        public final boolean f11900G;

        /* renamed from: H, reason: collision with root package name */
        public final boolean f11901H;

        /* renamed from: I, reason: collision with root package name */
        public final boolean f11902I;

        /* renamed from: J, reason: collision with root package name */
        public final boolean f11903J;

        /* renamed from: K, reason: collision with root package name */
        public final boolean f11904K;

        /* renamed from: L, reason: collision with root package name */
        public final boolean f11905L;

        /* renamed from: M, reason: collision with root package name */
        public final boolean f11906M;

        /* renamed from: N, reason: collision with root package name */
        public final boolean f11907N;

        /* renamed from: O, reason: collision with root package name */
        public final boolean f11908O;

        /* renamed from: P, reason: collision with root package name */
        public final boolean f11909P;

        /* renamed from: Q, reason: collision with root package name */
        public final boolean f11910Q;

        /* renamed from: R, reason: collision with root package name */
        public final boolean f11911R;

        /* renamed from: S, reason: collision with root package name */
        public final boolean f11912S;

        /* renamed from: T, reason: collision with root package name */
        public final boolean f11913T;

        /* renamed from: U, reason: collision with root package name */
        public final boolean f11914U;

        /* renamed from: V, reason: collision with root package name */
        private final SparseArray<Map<d0, e>> f11915V;

        /* renamed from: W, reason: collision with root package name */
        private final SparseBooleanArray f11916W;

        static {
            Pk0.h.f(1000, 1001, 1002, 1003, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            Pk0.h.f(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT, 1006, 1007, 1008, 1009);
            Pk0.h.f(1010, 1011, 1012, 1013, 1014);
            N.L(1015);
            N.L(1016);
            N.L(1017);
            N.L(1018);
        }

        /* synthetic */ d(a aVar, int i11) {
            this(aVar);
        }

        @Override // j3.C7255K
        public final C7255K.b a() {
            return new a(this);
        }

        public final a d() {
            return new a(this);
        }

        public final boolean e(int i11) {
            return this.f11916W.get(i11);
        }

        @Override // j3.C7255K
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (super.equals(dVar) && this.f11900G == dVar.f11900G && this.f11901H == dVar.f11901H && this.f11902I == dVar.f11902I && this.f11903J == dVar.f11903J && this.f11904K == dVar.f11904K && this.f11905L == dVar.f11905L && this.f11906M == dVar.f11906M && this.f11907N == dVar.f11907N && this.f11908O == dVar.f11908O && this.f11909P == dVar.f11909P && this.f11910Q == dVar.f11910Q && this.f11911R == dVar.f11911R && this.f11912S == dVar.f11912S && this.f11913T == dVar.f11913T && this.f11914U == dVar.f11914U) {
                    SparseBooleanArray sparseBooleanArray = this.f11916W;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = dVar.f11916W;
                    if (sparseBooleanArray2.size() == size) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                SparseArray<Map<d0, e>> sparseArray = this.f11915V;
                                int size2 = sparseArray.size();
                                SparseArray<Map<d0, e>> sparseArray2 = dVar.f11915V;
                                if (sparseArray2.size() == size2) {
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i12));
                                        if (indexOfKey >= 0) {
                                            Map<d0, e> valueAt = sparseArray.valueAt(i12);
                                            Map<d0, e> valueAt2 = sparseArray2.valueAt(indexOfKey);
                                            if (valueAt2.size() == valueAt.size()) {
                                                for (Map.Entry<d0, e> entry : valueAt.entrySet()) {
                                                    d0 key = entry.getKey();
                                                    if (valueAt2.containsKey(key) && Objects.equals(entry.getValue(), valueAt2.get(key))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) < 0) {
                                    break;
                                }
                                i11++;
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Deprecated
        public final e f(int i11, d0 d0Var) {
            Map<d0, e> map = this.f11915V.get(i11);
            if (map != null) {
                return map.get(d0Var);
            }
            return null;
        }

        @Deprecated
        public final boolean g(int i11, d0 d0Var) {
            Map<d0, e> map = this.f11915V.get(i11);
            return map != null && map.containsKey(d0Var);
        }

        @Override // j3.C7255K
        public final int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f11900G ? 1 : 0)) * 31) + (this.f11901H ? 1 : 0)) * 31) + (this.f11902I ? 1 : 0)) * 31) + (this.f11903J ? 1 : 0)) * 31) + (this.f11904K ? 1 : 0)) * 31) + (this.f11905L ? 1 : 0)) * 31) + (this.f11906M ? 1 : 0)) * 31) + (this.f11907N ? 1 : 0)) * 31) + (this.f11908O ? 1 : 0)) * 31) + (this.f11909P ? 1 : 0)) * 31) + (this.f11910Q ? 1 : 0)) * 31) + (this.f11911R ? 1 : 0)) * 31) + (this.f11912S ? 1 : 0)) * 31) + (this.f11913T ? 1 : 0)) * 31) + (this.f11914U ? 1 : 0);
        }

        private d(a aVar) {
            super(aVar);
            this.f11900G = aVar.f11917F;
            this.f11901H = aVar.f11918G;
            this.f11902I = aVar.f11919H;
            this.f11903J = aVar.f11920I;
            this.f11904K = aVar.f11921J;
            this.f11905L = aVar.f11922K;
            this.f11906M = aVar.f11923L;
            this.f11907N = aVar.f11924M;
            this.f11908O = aVar.f11925N;
            this.f11909P = aVar.f11926O;
            this.f11910Q = aVar.f11927P;
            this.f11911R = aVar.f11928Q;
            this.f11912S = aVar.f11929R;
            this.f11913T = aVar.f11930S;
            this.f11914U = aVar.f11931T;
            this.f11915V = aVar.f11932U;
            this.f11916W = aVar.f11933V;
        }

        public static final class a extends C7255K.b {

            /* renamed from: F, reason: collision with root package name */
            private boolean f11917F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f11918G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f11919H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f11920I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f11921J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f11922K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f11923L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f11924M;

            /* renamed from: N, reason: collision with root package name */
            private boolean f11925N;

            /* renamed from: O, reason: collision with root package name */
            private boolean f11926O;

            /* renamed from: P, reason: collision with root package name */
            private boolean f11927P;

            /* renamed from: Q, reason: collision with root package name */
            private boolean f11928Q;

            /* renamed from: R, reason: collision with root package name */
            private boolean f11929R;

            /* renamed from: S, reason: collision with root package name */
            private boolean f11930S;

            /* renamed from: T, reason: collision with root package name */
            private boolean f11931T;

            /* renamed from: U, reason: collision with root package name */
            private final SparseArray<Map<d0, e>> f11932U;

            /* renamed from: V, reason: collision with root package name */
            private final SparseBooleanArray f11933V;

            public a() {
                this.f11932U = new SparseArray<>();
                this.f11933V = new SparseBooleanArray();
                this.f11917F = true;
                this.f11918G = false;
                this.f11919H = true;
                this.f11920I = false;
                this.f11921J = true;
                this.f11922K = false;
                this.f11923L = false;
                this.f11924M = false;
                this.f11925N = false;
                this.f11926O = true;
                this.f11927P = true;
                this.f11928Q = true;
                this.f11929R = false;
                this.f11930S = true;
                this.f11931T = false;
            }

            @Override // j3.C7255K.b
            public final C7255K.b G(int i11) {
                super.G(i11);
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b J(Set set) {
                super.J(set);
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b L() {
                super.L();
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b M(C7254J c7254j) {
                super.M(c7254j);
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b N() {
                super.N();
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b O(String[] strArr) {
                super.O(strArr);
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b P() {
                super.P();
                return this;
            }

            @Override // j3.C7255K.b
            public final C7255K.b Q(int i11, boolean z11) {
                super.Q(i11, z11);
                return this;
            }

            @Override // j3.C7255K.b
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public final d F() {
                return new d(this, 0);
            }

            protected final void j0(C7255K c7255k) {
                I(c7255k);
            }

            public final void k0() {
                this.f11927P = false;
            }

            a(d dVar) {
                super(dVar);
                this.f11917F = dVar.f11900G;
                this.f11918G = dVar.f11901H;
                this.f11919H = dVar.f11902I;
                this.f11920I = dVar.f11903J;
                this.f11921J = dVar.f11904K;
                this.f11922K = dVar.f11905L;
                this.f11923L = dVar.f11906M;
                this.f11924M = dVar.f11907N;
                this.f11925N = dVar.f11908O;
                this.f11926O = dVar.f11909P;
                this.f11927P = dVar.f11910Q;
                this.f11928Q = dVar.f11911R;
                this.f11929R = dVar.f11912S;
                this.f11930S = dVar.f11913T;
                this.f11931T = dVar.f11914U;
                SparseArray sparseArray = dVar.f11915V;
                SparseArray<Map<d0, e>> sparseArray2 = new SparseArray<>();
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    sparseArray2.put(sparseArray.keyAt(i11), new HashMap((Map) sparseArray.valueAt(i11)));
                }
                this.f11932U = sparseArray2;
                this.f11933V = dVar.f11916W.clone();
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class e {
        static {
            N.L(0);
            N.L(1);
            N.L(2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                if (Arrays.equals((int[]) null, (int[]) null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode((int[]) null) * 31;
        }
    }

    /* loaded from: classes8.dex */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f11934a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11935b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f11936c;

        /* renamed from: d, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f11937d;

        final class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f11938a;

            a(n nVar) {
                this.f11938a = nVar;
            }

            public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
                this.f11938a.s();
            }

            public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
                this.f11938a.s();
            }
        }

        public f(Context context, n nVar, Boolean bool) {
            Spatializer spatializer;
            int immersiveAudioLevel;
            AudioManager c11 = context == null ? null : k3.c.c(context);
            if (c11 == null || (bool != null && bool.booleanValue())) {
                this.f11934a = null;
                this.f11935b = false;
                this.f11936c = null;
                this.f11937d = null;
                return;
            }
            spatializer = c11.getSpatializer();
            this.f11934a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.f11935b = immersiveAudioLevel != 0;
            a aVar = new a(nVar);
            this.f11937d = aVar;
            Looper myLooper = Looper.myLooper();
            G10.a.i(myLooper);
            Handler handler = new Handler(myLooper);
            this.f11936c = handler;
            spatializer.addOnSpatializerStateChangedListener(new ExecutorC10204F(handler), aVar);
        }

        public final boolean a(C7263e c7263e, C7272n c7272n) {
            boolean canBeSpatialized;
            boolean equals = Objects.equals(c7272n.f69127o, "audio/eac3-joc");
            int i11 = c7272n.f69102G;
            if (!equals) {
                String str = c7272n.f69127o;
                if (Objects.equals(str, "audio/iamf")) {
                    if (i11 == -1) {
                        i11 = 6;
                    }
                } else if (Objects.equals(str, "audio/ac4") && (i11 == 18 || i11 == 21)) {
                    i11 = 24;
                }
            } else if (i11 == 16) {
                i11 = 12;
            }
            int t2 = N.t(i11);
            if (t2 == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t2);
            int i12 = c7272n.f69103H;
            if (i12 != -1) {
                channelMask.setSampleRate(i12);
            }
            Spatializer spatializer = this.f11934a;
            spatializer.getClass();
            canBeSpatialized = s.a(spatializer).canBeSpatialized(c7263e.a().f69059a, channelMask.build());
            return canBeSpatialized;
        }

        public final boolean b() {
            boolean isAvailable;
            Spatializer spatializer = this.f11934a;
            spatializer.getClass();
            isAvailable = s.a(spatializer).isAvailable();
            return isAvailable;
        }

        public final boolean c() {
            boolean isEnabled;
            Spatializer spatializer = this.f11934a;
            spatializer.getClass();
            isEnabled = s.a(spatializer).isEnabled();
            return isEnabled;
        }

        public final boolean d() {
            return this.f11935b;
        }

        public final void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Handler handler;
            Spatializer spatializer = this.f11934a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f11937d) == null || (handler = this.f11936c) == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes8.dex */
    static final class g extends h<g> implements Comparable<g> {

        /* renamed from: e, reason: collision with root package name */
        private final int f11939e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f11940f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f11941g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f11942h;

        /* renamed from: i, reason: collision with root package name */
        private final int f11943i;

        /* renamed from: j, reason: collision with root package name */
        private final int f11944j;

        /* renamed from: k, reason: collision with root package name */
        private final int f11945k;

        /* renamed from: l, reason: collision with root package name */
        private final int f11946l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f11947m;

        public g(int i11, C7253I c7253i, int i12, d dVar, int i13, String str, String str2) {
            super(i11, c7253i, i12);
            int i14;
            int i15 = 0;
            this.f11940f = k0.r(i13, false);
            int i16 = this.f11951d.f69117e & (~dVar.f68999y);
            this.f11941g = (i16 & 1) != 0;
            this.f11942h = (i16 & 2) != 0;
            AbstractC5880y<String> abstractC5880y = dVar.f68996v;
            AbstractC5880y<String> B11 = str2 != null ? AbstractC5880y.B(str2) : abstractC5880y.isEmpty() ? AbstractC5880y.B("") : abstractC5880y;
            int i17 = 0;
            while (true) {
                if (i17 >= B11.size()) {
                    i14 = 0;
                    i17 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = n.r(this.f11951d, B11.get(i17), dVar.f69000z);
                    if (i14 > 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            this.f11943i = i17;
            this.f11944j = i14;
            int i18 = str2 != null ? 1088 : dVar.f68997w;
            int i19 = this.f11951d.f69118f;
            int i21 = n.f11866m;
            int bitCount = (i19 == 0 || i19 != i18) ? Integer.bitCount(i18 & i19) : Integer.MAX_VALUE;
            this.f11945k = bitCount;
            this.f11947m = (this.f11951d.f69118f & 1088) != 0;
            int r11 = n.r(this.f11951d, str, n.t(str) == null);
            this.f11946l = r11;
            boolean z11 = i14 > 0 || (abstractC5880y.isEmpty() && bitCount > 0) || this.f11941g || (this.f11942h && r11 > 0);
            if (k0.r(i13, dVar.f11911R) && z11) {
                i15 = 1;
            }
            this.f11939e = i15;
        }

        public static int c(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC5880y<g> e(int i11, C7253I c7253i, d dVar, int[] iArr, String str, String str2) {
            int i12 = AbstractC5880y.f59142c;
            AbstractC5880y.a aVar = new AbstractC5880y.a();
            for (int i13 = 0; i13 < c7253i.f68962a; i13++) {
                aVar.e(new g(i11, c7253i, i13, dVar, iArr[i13], str, str2));
            }
            return aVar.j();
        }

        @Override // I3.n.h
        public final int a() {
            return this.f11939e;
        }

        @Override // I3.n.h
        public final /* bridge */ /* synthetic */ boolean b(g gVar) {
            return false;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final int compareTo(g gVar) {
            com.google.common.collect.r e11 = com.google.common.collect.r.i().f(this.f11940f, gVar.f11940f).e(Integer.valueOf(this.f11943i), Integer.valueOf(gVar.f11943i), T.d().f());
            int i11 = this.f11944j;
            com.google.common.collect.r d11 = e11.d(i11, gVar.f11944j);
            int i12 = this.f11945k;
            com.google.common.collect.r d12 = d11.d(i12, gVar.f11945k).f(this.f11941g, gVar.f11941g).e(Boolean.valueOf(this.f11942h), Boolean.valueOf(gVar.f11942h), i11 == 0 ? T.d() : T.d().f()).d(this.f11946l, gVar.f11946l);
            if (i12 == 0) {
                d12 = d12.g(this.f11947m, gVar.f11947m);
            }
            return d12.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class h<T extends h<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f11948a;

        /* renamed from: b, reason: collision with root package name */
        public final C7253I f11949b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11950c;

        /* renamed from: d, reason: collision with root package name */
        public final C7272n f11951d;

        public interface a<T extends h<T>> {
            List<T> a(int i11, C7253I c7253i, int[] iArr);
        }

        public h(int i11, C7253I c7253i, int i12) {
            this.f11948a = i11;
            this.f11949b = c7253i;
            this.f11950c = i12;
            this.f11951d = c7253i.a(i12);
        }

        public abstract int a();

        public abstract boolean b(T t2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends h<i> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f11952e;

        /* renamed from: f, reason: collision with root package name */
        private final d f11953f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f11954g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f11955h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f11956i;

        /* renamed from: j, reason: collision with root package name */
        private final int f11957j;

        /* renamed from: k, reason: collision with root package name */
        private final int f11958k;

        /* renamed from: l, reason: collision with root package name */
        private final int f11959l;

        /* renamed from: m, reason: collision with root package name */
        private final int f11960m;

        /* renamed from: n, reason: collision with root package name */
        private final int f11961n;

        /* renamed from: o, reason: collision with root package name */
        private final int f11962o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f11963p;

        /* renamed from: q, reason: collision with root package name */
        private final int f11964q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f11965r;

        /* renamed from: s, reason: collision with root package name */
        private final int f11966s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f11967t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f11968u;

        /* renamed from: v, reason: collision with root package name */
        private final int f11969v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0127 A[EDGE_INSN: B:148:0x0127->B:85:0x0127 BREAK  A[LOOP:1: B:77:0x010b->B:146:0x0125], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x00cd A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00dd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0144  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public i(int i11, C7253I c7253i, int i12, d dVar, int i13, String str, int i14, boolean z11) {
            super(i11, c7253i, i12);
            boolean z12;
            boolean z13;
            int i15;
            AbstractC5880y<String> abstractC5880y;
            int i16;
            int i17;
            int i18;
            AbstractC5880y<String> abstractC5880y2;
            C7272n c7272n;
            String str2;
            boolean z14;
            boolean z15;
            int i19;
            C7272n c7272n2;
            int i21;
            int i22;
            float f7;
            int i23;
            C7272n c7272n3;
            int i24;
            int i25;
            int i26;
            int i27 = 4;
            int i28 = 2;
            this.f11953f = dVar;
            int i29 = dVar.f11902I ? 24 : 16;
            this.f11965r = dVar.f11901H && (i14 & i29) != 0;
            if (z11 && (((i24 = (c7272n3 = this.f11951d).f69134v) == -1 || i24 <= dVar.f68975a) && ((i25 = c7272n3.f69135w) == -1 || i25 <= dVar.f68976b))) {
                float f11 = c7272n3.f69138z;
                if ((f11 == -1.0f || f11 <= dVar.f68977c) && ((i26 = c7272n3.f69122j) == -1 || i26 <= dVar.f68978d)) {
                    z12 = true;
                    this.f11952e = z12;
                    if (z11 && (((i21 = (c7272n2 = this.f11951d).f69134v) == -1 || i21 >= dVar.f68979e) && ((i22 = c7272n2.f69135w) == -1 || i22 >= dVar.f68980f))) {
                        f7 = c7272n2.f69138z;
                        if ((f7 != -1.0f || f7 >= dVar.f68981g) && ((i23 = c7272n2.f69122j) == -1 || i23 >= dVar.f68982h)) {
                            z13 = true;
                            this.f11954g = z13;
                            this.f11955h = k0.r(i13, false);
                            C7272n c7272n4 = this.f11951d;
                            float f12 = c7272n4.f69138z;
                            this.f11956i = f12 == -1.0f && f12 >= 10.0f;
                            this.f11957j = c7272n4.f69122j;
                            int i31 = c7272n4.f69134v;
                            this.f11958k = (i31 != -1 || (i19 = c7272n4.f69135w) == -1) ? -1 : i31 * i19;
                            i15 = 0;
                            while (true) {
                                abstractC5880y = dVar.f68988n;
                                i16 = Integer.MAX_VALUE;
                                if (i15 < abstractC5880y.size()) {
                                    i17 = 0;
                                    i15 = Integer.MAX_VALUE;
                                    break;
                                } else {
                                    i17 = n.r(this.f11951d, abstractC5880y.get(i15), false);
                                    if (i17 > 0) {
                                        break;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                            this.f11960m = i15;
                            this.f11961n = i17;
                            int i32 = this.f11951d.f69118f;
                            int i33 = n.f11866m;
                            int i34 = dVar.f68989o;
                            this.f11962o = (i32 == 0 && i32 == i34) ? Integer.MAX_VALUE : Integer.bitCount(i32 & i34);
                            int i35 = this.f11951d.f69118f;
                            this.f11963p = (i35 == 0 && (i35 & 1) == 0) ? false : true;
                            this.f11964q = n.r(this.f11951d, str, n.t(str) != null);
                            i18 = 0;
                            while (true) {
                                abstractC5880y2 = dVar.f68987m;
                                if (i18 < abstractC5880y2.size()) {
                                    String str3 = this.f11951d.f69127o;
                                    if (str3 != null && str3.equals(abstractC5880y2.get(i18))) {
                                        i16 = i18;
                                        break;
                                    }
                                    i18++;
                                } else {
                                    break;
                                }
                            }
                            this.f11959l = i16;
                            this.f11967t = (i13 & 384) != 128;
                            this.f11968u = (i13 & 64) != 64;
                            c7272n = this.f11951d;
                            str2 = c7272n.f69127o;
                            if (str2 != null) {
                                switch (str2.hashCode()) {
                                    case -1851077871:
                                        if (str2.equals("video/dolby-vision")) {
                                            z15 = false;
                                            break;
                                        }
                                        z15 = -1;
                                        break;
                                    case -1662735862:
                                        if (str2.equals("video/av01")) {
                                            z15 = true;
                                            break;
                                        }
                                        z15 = -1;
                                        break;
                                    case -1662541442:
                                        if (str2.equals("video/hevc")) {
                                            z15 = 2;
                                            break;
                                        }
                                        z15 = -1;
                                        break;
                                    case 1331836730:
                                        if (str2.equals("video/avc")) {
                                            z15 = 3;
                                            break;
                                        }
                                        z15 = -1;
                                        break;
                                    case 1599127257:
                                        if (str2.equals("video/x-vnd.on2.vp9")) {
                                            z15 = 4;
                                            break;
                                        }
                                        z15 = -1;
                                        break;
                                    default:
                                        z15 = -1;
                                        break;
                                }
                                switch (z15) {
                                    case false:
                                        i27 = 5;
                                        break;
                                    case true:
                                        i27 = 3;
                                        break;
                                    case true:
                                        i27 = 1;
                                        break;
                                    case true:
                                        i27 = 2;
                                        break;
                                }
                                this.f11969v = i27;
                                if ((c7272n.f69118f & 16384) == 0) {
                                    d dVar2 = this.f11953f;
                                    if (k0.r(i13, dVar2.f11911R) && ((z14 = this.f11952e) || dVar2.f11900G)) {
                                        if (!k0.r(i13, false) || !this.f11954g || !z14 || c7272n.f69122j == -1 || dVar2.f68972C || dVar2.f68971B || (i29 & i13) == 0) {
                                            i28 = 1;
                                        }
                                        this.f11966s = i28;
                                    }
                                }
                                i28 = 0;
                                this.f11966s = i28;
                            }
                            i27 = 0;
                            this.f11969v = i27;
                            if ((c7272n.f69118f & 16384) == 0) {
                            }
                            i28 = 0;
                            this.f11966s = i28;
                        }
                    }
                    z13 = false;
                    this.f11954g = z13;
                    this.f11955h = k0.r(i13, false);
                    C7272n c7272n42 = this.f11951d;
                    float f122 = c7272n42.f69138z;
                    this.f11956i = f122 == -1.0f && f122 >= 10.0f;
                    this.f11957j = c7272n42.f69122j;
                    int i312 = c7272n42.f69134v;
                    this.f11958k = (i312 != -1 || (i19 = c7272n42.f69135w) == -1) ? -1 : i312 * i19;
                    i15 = 0;
                    while (true) {
                        abstractC5880y = dVar.f68988n;
                        i16 = Integer.MAX_VALUE;
                        if (i15 < abstractC5880y.size()) {
                        }
                        i15++;
                    }
                    this.f11960m = i15;
                    this.f11961n = i17;
                    int i322 = this.f11951d.f69118f;
                    int i332 = n.f11866m;
                    int i342 = dVar.f68989o;
                    this.f11962o = (i322 == 0 && i322 == i342) ? Integer.MAX_VALUE : Integer.bitCount(i322 & i342);
                    int i352 = this.f11951d.f69118f;
                    this.f11963p = (i352 == 0 && (i352 & 1) == 0) ? false : true;
                    this.f11964q = n.r(this.f11951d, str, n.t(str) != null);
                    i18 = 0;
                    while (true) {
                        abstractC5880y2 = dVar.f68987m;
                        if (i18 < abstractC5880y2.size()) {
                        }
                        i18++;
                    }
                    this.f11959l = i16;
                    this.f11967t = (i13 & 384) != 128;
                    this.f11968u = (i13 & 64) != 64;
                    c7272n = this.f11951d;
                    str2 = c7272n.f69127o;
                    if (str2 != null) {
                    }
                    i27 = 0;
                    this.f11969v = i27;
                    if ((c7272n.f69118f & 16384) == 0) {
                    }
                    i28 = 0;
                    this.f11966s = i28;
                }
            }
            z12 = false;
            this.f11952e = z12;
            if (z11) {
                f7 = c7272n2.f69138z;
                if (f7 != -1.0f) {
                }
                z13 = true;
                this.f11954g = z13;
                this.f11955h = k0.r(i13, false);
                C7272n c7272n422 = this.f11951d;
                float f1222 = c7272n422.f69138z;
                this.f11956i = f1222 == -1.0f && f1222 >= 10.0f;
                this.f11957j = c7272n422.f69122j;
                int i3122 = c7272n422.f69134v;
                this.f11958k = (i3122 != -1 || (i19 = c7272n422.f69135w) == -1) ? -1 : i3122 * i19;
                i15 = 0;
                while (true) {
                    abstractC5880y = dVar.f68988n;
                    i16 = Integer.MAX_VALUE;
                    if (i15 < abstractC5880y.size()) {
                    }
                    i15++;
                }
                this.f11960m = i15;
                this.f11961n = i17;
                int i3222 = this.f11951d.f69118f;
                int i3322 = n.f11866m;
                int i3422 = dVar.f68989o;
                this.f11962o = (i3222 == 0 && i3222 == i3422) ? Integer.MAX_VALUE : Integer.bitCount(i3222 & i3422);
                int i3522 = this.f11951d.f69118f;
                this.f11963p = (i3522 == 0 && (i3522 & 1) == 0) ? false : true;
                this.f11964q = n.r(this.f11951d, str, n.t(str) != null);
                i18 = 0;
                while (true) {
                    abstractC5880y2 = dVar.f68987m;
                    if (i18 < abstractC5880y2.size()) {
                    }
                    i18++;
                }
                this.f11959l = i16;
                this.f11967t = (i13 & 384) != 128;
                this.f11968u = (i13 & 64) != 64;
                c7272n = this.f11951d;
                str2 = c7272n.f69127o;
                if (str2 != null) {
                }
                i27 = 0;
                this.f11969v = i27;
                if ((c7272n.f69118f & 16384) == 0) {
                }
                i28 = 0;
                this.f11966s = i28;
            }
            z13 = false;
            this.f11954g = z13;
            this.f11955h = k0.r(i13, false);
            C7272n c7272n4222 = this.f11951d;
            float f12222 = c7272n4222.f69138z;
            this.f11956i = f12222 == -1.0f && f12222 >= 10.0f;
            this.f11957j = c7272n4222.f69122j;
            int i31222 = c7272n4222.f69134v;
            this.f11958k = (i31222 != -1 || (i19 = c7272n4222.f69135w) == -1) ? -1 : i31222 * i19;
            i15 = 0;
            while (true) {
                abstractC5880y = dVar.f68988n;
                i16 = Integer.MAX_VALUE;
                if (i15 < abstractC5880y.size()) {
                }
                i15++;
            }
            this.f11960m = i15;
            this.f11961n = i17;
            int i32222 = this.f11951d.f69118f;
            int i33222 = n.f11866m;
            int i34222 = dVar.f68989o;
            this.f11962o = (i32222 == 0 && i32222 == i34222) ? Integer.MAX_VALUE : Integer.bitCount(i32222 & i34222);
            int i35222 = this.f11951d.f69118f;
            this.f11963p = (i35222 == 0 && (i35222 & 1) == 0) ? false : true;
            this.f11964q = n.r(this.f11951d, str, n.t(str) != null);
            i18 = 0;
            while (true) {
                abstractC5880y2 = dVar.f68987m;
                if (i18 < abstractC5880y2.size()) {
                }
                i18++;
            }
            this.f11959l = i16;
            this.f11967t = (i13 & 384) != 128;
            this.f11968u = (i13 & 64) != 64;
            c7272n = this.f11951d;
            str2 = c7272n.f69127o;
            if (str2 != null) {
            }
            i27 = 0;
            this.f11969v = i27;
            if ((c7272n.f69118f & 16384) == 0) {
            }
            i28 = 0;
            this.f11966s = i28;
        }

        public static int c(i iVar, i iVar2) {
            T f7 = (iVar.f11952e && iVar.f11955h) ? n.f11865l : n.f11865l.f();
            com.google.common.collect.r i11 = com.google.common.collect.r.i();
            boolean z11 = iVar.f11953f.f68971B;
            int i12 = iVar.f11957j;
            if (z11) {
                i11 = i11.e(Integer.valueOf(i12), Integer.valueOf(iVar2.f11957j), n.f11865l.f());
            }
            return i11.e(Integer.valueOf(iVar.f11958k), Integer.valueOf(iVar2.f11958k), f7).e(Integer.valueOf(i12), Integer.valueOf(iVar2.f11957j), f7).h();
        }

        public static int d(i iVar, i iVar2) {
            com.google.common.collect.r e11 = com.google.common.collect.r.i().f(iVar.f11955h, iVar2.f11955h).e(Integer.valueOf(iVar.f11960m), Integer.valueOf(iVar2.f11960m), T.d().f()).d(iVar.f11961n, iVar2.f11961n).d(iVar.f11962o, iVar2.f11962o).f(iVar.f11963p, iVar2.f11963p).d(iVar.f11964q, iVar2.f11964q).f(iVar.f11956i, iVar2.f11956i).f(iVar.f11952e, iVar2.f11952e).f(iVar.f11954g, iVar2.f11954g).e(Integer.valueOf(iVar.f11959l), Integer.valueOf(iVar2.f11959l), T.d().f());
            boolean z11 = iVar2.f11967t;
            boolean z12 = iVar.f11967t;
            com.google.common.collect.r f7 = e11.f(z12, z11);
            boolean z13 = iVar2.f11968u;
            boolean z14 = iVar.f11968u;
            com.google.common.collect.r f11 = f7.f(z14, z13);
            if (z12 && z14) {
                f11 = f11.d(iVar.f11969v, iVar2.f11969v);
            }
            return f11.h();
        }

        @Override // I3.n.h
        public final int a() {
            return this.f11966s;
        }

        @Override // I3.n.h
        public final boolean b(i iVar) {
            i iVar2 = iVar;
            if (!this.f11965r && !Objects.equals(this.f11951d.f69127o, iVar2.f11951d.f69127o)) {
                return false;
            }
            if (this.f11953f.f11903J) {
                return true;
            }
            return this.f11967t == iVar2.f11967t && this.f11968u == iVar2.f11968u;
        }
    }

    private n(d dVar, y.b bVar, Context context) {
        this.f11867d = new Object();
        this.f11868e = context != null ? context.getApplicationContext() : null;
        this.f11869f = bVar;
        if (dVar != null) {
            this.f11870g = dVar;
        } else {
            d dVar2 = d.f11899X;
            dVar2.getClass();
            d.a aVar = new d.a(dVar2);
            aVar.j0(dVar);
            this.f11870g = aVar.F();
        }
        this.f11873j = C7263e.f69057b;
        if (this.f11870g.f11910Q && context == null) {
            m3.s.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r2.d() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r4.equals("audio/ac4") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean n(n nVar, d dVar, C7272n c7272n) {
        Boolean bool;
        int i11;
        f fVar;
        char c11 = 2;
        nVar.getClass();
        if (dVar.f11910Q && (((bool = nVar.f11874k) == null || !bool.booleanValue()) && (i11 = c7272n.f69102G) != -1 && i11 > 2)) {
            String str = c7272n.f69127o;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2123537834:
                        if (str.equals("audio/eac3-joc")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187078296:
                        if (str.equals("audio/ac3")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 187078297:
                        break;
                    case 1504578661:
                        if (str.equals("audio/eac3")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        if (Build.VERSION.SDK_INT >= 32) {
                            f fVar2 = nVar.f11872i;
                            if (fVar2 != null) {
                                break;
                            }
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 32 || (fVar = nVar.f11872i) == null || !fVar.d() || !nVar.f11872i.b() || !nVar.f11872i.c() || !nVar.f11872i.a(nVar.f11873j, c7272n)) {
                            return false;
                        }
                        break;
                }
            }
            if (Build.VERSION.SDK_INT >= 32) {
            }
            return false;
        }
        return true;
    }

    private static void q(d0 d0Var, C7255K c7255k, HashMap hashMap) {
        for (int i11 = 0; i11 < d0Var.f8644a; i11++) {
            C7254J c7254j = c7255k.f68973D.get(d0Var.a(i11));
            if (c7254j != null) {
                C7253I c7253i = c7254j.f68967a;
                C7254J c7254j2 = (C7254J) hashMap.get(Integer.valueOf(c7253i.f68964c));
                if (c7254j2 == null || (c7254j2.f68968b.isEmpty() && !c7254j.f68968b.isEmpty())) {
                    hashMap.put(Integer.valueOf(c7253i.f68964c), c7254j);
                }
            }
        }
    }

    protected static int r(C7272n c7272n, String str, boolean z11) {
        if (!TextUtils.isEmpty(str) && str.equals(c7272n.f69116d)) {
            return 4;
        }
        String t2 = t(str);
        String t11 = t(c7272n.f69116d);
        if (t11 == null || t2 == null) {
            return (z11 && t11 == null) ? 1 : 0;
        }
        if (t11.startsWith(t2) || t2.startsWith(t11)) {
            return 3;
        }
        int i11 = N.f74289a;
        return t11.split("-", 2)[0].equals(t2.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        boolean z11;
        f fVar;
        synchronized (this.f11867d) {
            try {
                z11 = this.f11870g.f11910Q && Build.VERSION.SDK_INT >= 32 && (fVar = this.f11872i) != null && fVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            e();
        }
    }

    protected static String t(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static Pair v(int i11, B.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i12;
        RandomAccess randomAccess;
        B.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int b11 = aVar3.b();
        int i13 = 0;
        while (i13 < b11) {
            if (i11 == aVar3.c(i13)) {
                d0 d11 = aVar3.d(i13);
                for (int i14 = 0; i14 < d11.f8644a; i14++) {
                    C7253I a11 = d11.a(i14);
                    List a12 = aVar2.a(i13, a11, iArr[i13][i14]);
                    boolean[] zArr = new boolean[a11.f68962a];
                    int i15 = 0;
                    while (true) {
                        int i16 = a11.f68962a;
                        if (i15 < i16) {
                            h hVar = (h) a12.get(i15);
                            int a13 = hVar.a();
                            if (zArr[i15] || a13 == 0) {
                                i12 = b11;
                            } else {
                                if (a13 == 1) {
                                    randomAccess = AbstractC5880y.B(hVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(hVar);
                                    int i17 = i15 + 1;
                                    while (i17 < i16) {
                                        h hVar2 = (h) a12.get(i17);
                                        int i18 = b11;
                                        int i19 = i17;
                                        if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                            arrayList2.add(hVar2);
                                            zArr[i19] = true;
                                        }
                                        i17 = i19 + 1;
                                        b11 = i18;
                                    }
                                    randomAccess = arrayList2;
                                }
                                i12 = b11;
                                arrayList.add(randomAccess);
                            }
                            i15++;
                            b11 = i12;
                        }
                    }
                }
            }
            i13++;
            aVar3 = aVar;
            b11 = b11;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i21 = 0; i21 < list.size(); i21++) {
            iArr2[i21] = ((h) list.get(i21)).f11950c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new y.a(hVar3.f11949b, iArr2), Integer.valueOf(hVar3.f11948a));
    }

    private void w(d dVar) {
        boolean equals;
        synchronized (this.f11867d) {
            equals = this.f11870g.equals(dVar);
            this.f11870g = dVar;
        }
        if (equals) {
            return;
        }
        if (dVar.f11910Q && this.f11868e == null) {
            m3.s.f("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        e();
    }

    @Override // I3.E
    public final C7255K b() {
        d dVar;
        synchronized (this.f11867d) {
            dVar = this.f11870g;
        }
        return dVar;
    }

    @Override // I3.E
    public final k0.a c() {
        return this;
    }

    @Override // I3.E
    public final void h() {
        f fVar;
        synchronized (this.f11867d) {
            try {
                Thread thread = this.f11871h;
                if (thread != null) {
                    G10.a.g("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (fVar = this.f11872i) != null) {
            fVar.e();
            this.f11872i = null;
        }
        super.h();
    }

    @Override // I3.E
    public final void j(C7263e c7263e) {
        if (this.f11873j.equals(c7263e)) {
            return;
        }
        this.f11873j = c7263e;
        s();
    }

    @Override // I3.E
    public final void k(C7255K c7255k) {
        d dVar;
        if (c7255k instanceof d) {
            w((d) c7255k);
        }
        synchronized (this.f11867d) {
            dVar = this.f11870g;
        }
        d.a aVar = new d.a(dVar);
        aVar.j0(c7255k);
        w(aVar.F());
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02be, code lost:
    
        if (r9 != 2) goto L156;
     */
    @Override // I3.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Pair<C9734F[], y[]> m(B.a aVar, int[][][] iArr, final int[] iArr2, InterfaceC3018x.b bVar, AbstractC7252H abstractC7252H) throws C5449k {
        final d dVar;
        int i11;
        final boolean z11;
        final String str;
        int i12;
        Pair v11;
        final String str2;
        boolean z12;
        int i13;
        int i14;
        y.a aVar2;
        int i15;
        int i16;
        int i17;
        CaptioningManager captioningManager;
        Locale locale;
        Context context;
        int[][][] iArr3 = iArr;
        int i18 = 1;
        synchronized (this.f11867d) {
            this.f11871h = Thread.currentThread();
            dVar = this.f11870g;
        }
        if (this.f11874k == null && (context = this.f11868e) != null) {
            this.f11874k = Boolean.valueOf(N.P(context));
        }
        if (dVar.f11910Q && Build.VERSION.SDK_INT >= 32 && this.f11872i == null) {
            this.f11872i = new f(this.f11868e, this, this.f11874k);
        }
        int b11 = aVar.b();
        int b12 = aVar.b();
        y.a[] aVarArr = new y.a[b12];
        int i19 = 0;
        while (true) {
            i11 = 2;
            if (i19 >= aVar.b()) {
                z11 = false;
                break;
            }
            if (2 == aVar.c(i19) && aVar.d(i19).f8644a > 0) {
                z11 = true;
                break;
            }
            i19++;
        }
        Pair v12 = v(1, aVar, iArr3, new h.a() { // from class: I3.i
            @Override // I3.n.h.a
            public final List a(int i21, C7253I c7253i, int[] iArr4) {
                n nVar = n.this;
                nVar.getClass();
                n.d dVar2 = dVar;
                m mVar = new m(nVar, dVar2);
                int i22 = iArr2[i21];
                int i23 = AbstractC5880y.f59142c;
                AbstractC5880y.a aVar3 = new AbstractC5880y.a();
                for (int i24 = 0; i24 < c7253i.f68962a; i24++) {
                    aVar3.e(new n.a(i21, c7253i, i24, dVar2, iArr4[i24], z11, mVar, i22));
                }
                return aVar3.j();
            }
        }, new j());
        if (v12 != null) {
            aVarArr[((Integer) v12.second).intValue()] = (y.a) v12.first;
        }
        if (v12 == null) {
            str = null;
        } else {
            y.a aVar3 = (y.a) v12.first;
            str = aVar3.f11970a.a(aVar3.f11971b[0]).f69116d;
        }
        dVar.f68995u.getClass();
        boolean z13 = dVar.f68985k;
        Context context2 = this.f11868e;
        final Point x11 = (!z13 || context2 == null) ? null : N.x(context2);
        Pair v13 = v(2, aVar, iArr3, new h.a() { // from class: I3.g
            /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x005a  */
            @Override // I3.n.h.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List a(int i21, C7253I c7253i, int[] iArr4) {
                int i22;
                int i23;
                int i24;
                int i25;
                int i26;
                Point point;
                int i27;
                int i28;
                C7253I c7253i2 = c7253i;
                int i29 = iArr2[i21];
                n.d dVar2 = n.d.this;
                Point point2 = x11;
                int i31 = point2 != null ? point2.x : dVar2.f68983i;
                int i32 = point2 != null ? point2.y : dVar2.f68984j;
                boolean z14 = dVar2.f68986l;
                if (i31 == Integer.MAX_VALUE || i32 == Integer.MAX_VALUE) {
                    i22 = Integer.MAX_VALUE;
                } else {
                    int i33 = Integer.MAX_VALUE;
                    for (int i34 = 0; i34 < c7253i2.f68962a; i34++) {
                        C7272n a11 = c7253i2.a(i34);
                        int i35 = a11.f69134v;
                        if (i35 > 0 && (i24 = a11.f69135w) > 0) {
                            if (z14) {
                                if ((i35 > i24) != (i31 > i32)) {
                                    i26 = i32;
                                    i25 = i31;
                                    int i36 = i35 * i25;
                                    int i37 = i24 * i26;
                                    point = i36 < i37 ? new Point(i26, N.f(i37, i35)) : new Point(N.f(i36, i24), i25);
                                    i27 = a11.f69134v;
                                    i28 = i27 * i24;
                                    if (i27 >= ((int) (point.x * 0.98f)) && i24 >= ((int) (point.y * 0.98f)) && i28 < i33) {
                                        i33 = i28;
                                    }
                                }
                            }
                            i25 = i32;
                            i26 = i31;
                            int i362 = i35 * i25;
                            int i372 = i24 * i26;
                            if (i362 < i372) {
                            }
                            i27 = a11.f69134v;
                            i28 = i27 * i24;
                            if (i27 >= ((int) (point.x * 0.98f))) {
                                i33 = i28;
                            }
                        }
                    }
                    i22 = i33;
                }
                AbstractC5880y.a aVar4 = new AbstractC5880y.a();
                int i38 = 0;
                while (i38 < c7253i2.f68962a) {
                    C7272n a12 = c7253i2.a(i38);
                    int i39 = a12.f69134v;
                    int i41 = (i39 == -1 || (i23 = a12.f69135w) == -1) ? -1 : i39 * i23;
                    aVar4.e(new n.i(i21, c7253i2, i38, dVar2, iArr4[i38], str, i29, i22 == Integer.MAX_VALUE || (i41 != -1 && i41 <= i22)));
                    i38++;
                    c7253i2 = c7253i;
                }
                return aVar4.j();
            }
        }, new I3.h());
        boolean z14 = dVar.f68970A;
        C7255K.a aVar4 = dVar.f68995u;
        int i21 = 4;
        if (z14 || v13 == null) {
            aVar4.getClass();
            i12 = 32;
            v11 = v(4, aVar, iArr3, new h.a() { // from class: I3.e
                @Override // I3.n.h.a
                public final List a(int i22, C7253I c7253i, int[] iArr4) {
                    int i23 = AbstractC5880y.f59142c;
                    AbstractC5880y.a aVar5 = new AbstractC5880y.a();
                    for (int i24 = 0; i24 < c7253i.f68962a; i24++) {
                        aVar5.e(new n.b(i22, c7253i, i24, n.d.this, iArr4[i24]));
                    }
                    return aVar5.j();
                }
            }, new Comparator() { // from class: I3.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((n.b) ((List) obj).get(0)).compareTo((n.b) ((List) obj2).get(0));
                }
            });
        } else {
            i12 = 32;
            v11 = null;
        }
        if (v11 != null) {
            aVarArr[((Integer) v11.second).intValue()] = (y.a) v11.first;
        } else if (v13 != null) {
            aVarArr[((Integer) v13.second).intValue()] = (y.a) v13.first;
        }
        aVar4.getClass();
        if (!dVar.f68998x || context2 == null || (captioningManager = (CaptioningManager) context2.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            str2 = null;
        } else {
            int i22 = N.f74289a;
            str2 = locale.toLanguageTag();
        }
        int i23 = 3;
        Pair v14 = v(3, aVar, iArr3, new h.a() { // from class: I3.k
            @Override // I3.n.h.a
            public final List a(int i24, C7253I c7253i, int[] iArr4) {
                return n.g.e(i24, c7253i, n.d.this, iArr4, str, str2);
            }
        }, new l());
        if (v14 != null) {
            aVarArr[((Integer) v14.second).intValue()] = (y.a) v14.first;
        }
        int i24 = 0;
        while (i24 < b12) {
            int c11 = aVar.c(i24);
            if (c11 == i11 || c11 == i18 || c11 == i23 || c11 == i21) {
                i15 = i24;
                i16 = i18;
            } else {
                d0 d11 = aVar.d(i24);
                int[][] iArr4 = iArr3[i24];
                C7253I c7253i = null;
                c cVar = null;
                int i25 = 0;
                int i26 = 0;
                while (i25 < d11.f8644a) {
                    C7253I a11 = d11.a(i25);
                    int[] iArr5 = iArr4[i25];
                    int i27 = i18;
                    c cVar2 = cVar;
                    int i28 = 0;
                    while (i28 < a11.f68962a) {
                        if (k0.r(iArr5[i28], dVar.f11911R)) {
                            i17 = i24;
                            c cVar3 = new c(a11.a(i28), iArr5[i28]);
                            if (cVar2 == null || cVar3.compareTo(cVar2) > 0) {
                                cVar2 = cVar3;
                                c7253i = a11;
                                i26 = i28;
                            }
                        } else {
                            i17 = i24;
                        }
                        i28++;
                        i24 = i17;
                    }
                    i25++;
                    cVar = cVar2;
                    i18 = i27;
                }
                i15 = i24;
                i16 = i18;
                aVarArr[i15] = c7253i == null ? null : new y.a(c7253i, new int[]{i26});
            }
            i24 = i15 + 1;
            iArr3 = iArr;
            i18 = i16;
            i21 = 4;
            i23 = 3;
            i11 = 2;
        }
        int i29 = i18;
        int b13 = aVar.b();
        HashMap hashMap = new HashMap();
        for (int i31 = 0; i31 < b13; i31++) {
            q(aVar.d(i31), dVar, hashMap);
        }
        q(aVar.f(), dVar, hashMap);
        for (int i32 = 0; i32 < b13; i32++) {
            C7254J c7254j = (C7254J) hashMap.get(Integer.valueOf(aVar.c(i32)));
            if (c7254j != null) {
                AbstractC5880y<Integer> abstractC5880y = c7254j.f68968b;
                if (!abstractC5880y.isEmpty()) {
                    d0 d12 = aVar.d(i32);
                    C7253I c7253i2 = c7254j.f68967a;
                    if (d12.c(c7253i2) != -1) {
                        aVar2 = new y.a(c7253i2, com.google.common.primitives.b.f(abstractC5880y));
                        aVarArr[i32] = aVar2;
                    }
                }
                aVar2 = null;
                aVarArr[i32] = aVar2;
            }
        }
        int b14 = aVar.b();
        for (int i33 = 0; i33 < b14; i33++) {
            d0 d13 = aVar.d(i33);
            if (dVar.g(i33, d13)) {
                if (dVar.f(i33, d13) != null) {
                    throw null;
                }
                aVarArr[i33] = null;
            }
        }
        for (int i34 = 0; i34 < b11; i34++) {
            int c12 = aVar.c(i34);
            if (dVar.e(i34) || dVar.f68974E.contains(Integer.valueOf(c12))) {
                aVarArr[i34] = null;
            }
        }
        y[] a12 = this.f11869f.a(aVarArr, a());
        C9734F[] c9734fArr = new C9734F[b11];
        for (int i35 = 0; i35 < b11; i35++) {
            c9734fArr[i35] = (dVar.e(i35) || dVar.f68974E.contains(Integer.valueOf(aVar.c(i35))) || (aVar.c(i35) != -2 && a12[i35] == null)) ? null : C9734F.f98985c;
        }
        if (dVar.f11912S) {
            int i36 = -1;
            int i37 = -1;
            int i38 = 0;
            while (i38 < aVar.b()) {
                int c13 = aVar.c(i38);
                y yVar = a12[i38];
                if (c13 == i29) {
                }
                if (yVar != null) {
                    int[][] iArr6 = iArr[i38];
                    int c14 = aVar.d(i38).c(yVar.g());
                    int i39 = 0;
                    while (i39 < yVar.length()) {
                        i13 = i12;
                        if ((iArr6[c14][yVar.c(i39)] & 32) != i13) {
                            i14 = 1;
                            break;
                        }
                        i39++;
                        i12 = i13;
                    }
                    i13 = i12;
                    i14 = 1;
                    if (c13 == 1) {
                        if (i37 != -1) {
                            z12 = false;
                            break;
                        }
                        i37 = i38;
                        i38 += i14;
                        i12 = i13;
                        i29 = i14;
                    } else {
                        if (i36 != -1) {
                            z12 = false;
                            break;
                        }
                        i36 = i38;
                        i38 += i14;
                        i12 = i13;
                        i29 = i14;
                    }
                }
                i13 = i12;
                i14 = 1;
                break;
                i38 += i14;
                i12 = i13;
                i29 = i14;
            }
            z12 = true;
            if (((i37 == -1 || i36 == -1) ? false : true) & z12) {
                C9734F c9734f = new C9734F(0, true);
                c9734fArr[i37] = c9734f;
                c9734fArr[i36] = c9734f;
            }
        }
        dVar.f68995u.getClass();
        return Pair.create(c9734fArr, a12);
    }

    public final void u(AbstractC5444f abstractC5444f) {
        boolean z11;
        synchronized (this.f11867d) {
            z11 = this.f11870g.f11914U;
        }
        if (z11) {
            f(abstractC5444f);
        }
    }

    public n(Context context) {
        this(d.f11899X, new C3226a.b(), context);
    }

    @Deprecated
    public n(d dVar, y.b bVar) {
        this(dVar, bVar, null);
    }
}
