package p061i2;

import A1.C0045t0;
import A1.X;
import A1.x0;
import M4.e;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.TransactionOptions;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p018c2.C0774u;
import p018c2.I;
import p054h2.m;
import p056h4.i;
import p146u2.A;
import p146u2.C0955n;
import p146u2.F;
import p146u2.H;
import p146u2.J;
import p146u2.K;
import p146u2.N;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements F {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final i f13855F = new i(1);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public m f13856A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Uri f13857B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public j f13858C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13859D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f13861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f13862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13863c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public I f13866f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public K f13867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Handler f13868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f13869z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f13865e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f13864d = new HashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f13860E = -9223372036854775807L;

    public c(x0 x0Var, e eVar, q qVar) {
        this.f13861a = x0Var;
        this.f13862b = qVar;
        this.f13863c = eVar;
    }

    public final j a(boolean z4, Uri uri) {
        HashMap map = this.f13864d;
        j jVar = ((b) map.get(uri)).f13849d;
        if (jVar != null && z4 && !uri.equals(this.f13857B)) {
            List list = this.f13856A.f13922e;
            for (int i7 = 0; i7 < list.size(); i7++) {
                if (uri.equals(((l) list.get(i7)).f13914a)) {
                    j jVar2 = this.f13858C;
                    if (jVar2 != null && jVar2.f13903o) {
                        break;
                    }
                    this.f13857B = uri;
                    b bVar = (b) map.get(uri);
                    j jVar3 = bVar.f13849d;
                    if (jVar3 != null && jVar3.f13903o) {
                        this.f13858C = jVar3;
                        this.f13869z.r(jVar3);
                        break;
                    }
                    bVar.c(b(uri));
                    break;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.f13858C;
        if (jVar == null || !jVar.f13910v.f13892e || (fVar = (f) jVar.f13908t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.f13873b));
        int i7 = fVar.f13874c;
        if (i7 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return builderBuildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i7;
        b bVar = (b) this.f13864d.get(uri);
        if (bVar.f13849d == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, t.N(bVar.f13849d.f13909u));
        j jVar = bVar.f13849d;
        return jVar.f13903o || (i7 = jVar.f13893d) == 2 || i7 == 1 || bVar.f13850e + jMax > jElapsedRealtime;
    }

    @Override // p146u2.F
    public final void g(H h6, long j, long j3) {
        m mVar;
        N n2 = (N) h6;
        n nVar = (n) n2.f16739f;
        boolean z4 = nVar instanceof j;
        if (z4) {
            String str = nVar.f13930a;
            m mVar2 = m.f13920n;
            Uri uri = Uri.parse(str);
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10528a = "0";
            format$Builder.j = "application/x-mpegURL";
            mVar = new m("", Collections.emptyList(), Collections.singletonList(new l(uri, new X(format$Builder), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            mVar = (m) nVar;
        }
        this.f13856A = mVar;
        this.f13857B = ((l) mVar.f13922e.get(0)).f13914a;
        this.f13865e.add(new a(this));
        List list = mVar.f13921d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri2 = (Uri) list.get(i7);
            this.f13864d.put(uri2, new b(this, uri2));
        }
        Uri uri3 = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        b bVar = (b) this.f13864d.get(this.f13857B);
        if (z4) {
            bVar.d((j) nVar);
        } else {
            bVar.c(bVar.f13846a);
        }
        this.f13863c.getClass();
        this.f13866f.f(c0774u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p146u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        long jMin;
        N n2 = (N) h6;
        long j = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        this.f13863c.getClass();
        if (!(iOException instanceof C0045t0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof A) && !(iOException instanceof J)) {
            int i8 = C0955n.f16799b;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
                    break;
                }
                if ((cause instanceof C0955n) && ((C0955n) cause).f16800a == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z4 = jMin == -9223372036854775807L;
        this.f13866f.i(c0774u, n2.f16736c, iOException, z4);
        return z4 ? K.f16730f : new Q1.e(jMin, 0, false);
    }

    @Override // p146u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        long j7 = n2.f16734a;
        Uri uri = n2.f16737d.f16761c;
        C0774u c0774u = new C0774u();
        this.f13863c.getClass();
        this.f13866f.d(c0774u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
