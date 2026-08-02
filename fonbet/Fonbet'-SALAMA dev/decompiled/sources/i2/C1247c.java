package i2;

import A1.C0045t0;
import A1.X;
import A1.x0;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c2.C0814u;
import c2.I;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.gms.internal.ads.zzbbd;
import h2.C1191m;
import h4.C1206i;
import io.sentry.TransactionOptions;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.C1621A;
import u2.C1637n;
import u2.F;
import u2.H;
import u2.J;
import u2.K;
import u2.N;
import v2.t;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247c implements F {

    /* renamed from: F, reason: collision with root package name */
    public static final C1206i f13849F = new C1206i(1);

    /* renamed from: A, reason: collision with root package name */
    public C1257m f13850A;

    /* renamed from: B, reason: collision with root package name */
    public Uri f13851B;

    /* renamed from: C, reason: collision with root package name */
    public C1254j f13852C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f13853D;

    /* renamed from: a, reason: collision with root package name */
    public final x0 f13855a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1261q f13856b;

    /* renamed from: c, reason: collision with root package name */
    public final M4.e f13857c;

    /* renamed from: f, reason: collision with root package name */
    public I f13860f;

    /* renamed from: x, reason: collision with root package name */
    public K f13861x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f13862y;

    /* renamed from: z, reason: collision with root package name */
    public C1191m f13863z;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f13859e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f13858d = new HashMap();

    /* renamed from: E, reason: collision with root package name */
    public long f13854E = -9223372036854775807L;

    public C1247c(x0 x0Var, M4.e eVar, InterfaceC1261q interfaceC1261q) {
        this.f13855a = x0Var;
        this.f13856b = interfaceC1261q;
        this.f13857c = eVar;
    }

    public final C1254j a(boolean z4, Uri uri) {
        HashMap hashMap = this.f13858d;
        C1254j c1254j = ((C1246b) hashMap.get(uri)).f13843d;
        if (c1254j != null && z4 && !uri.equals(this.f13851B)) {
            List list = this.f13850A.f13916e;
            int i7 = 0;
            while (true) {
                if (i7 >= list.size()) {
                    break;
                }
                if (uri.equals(((C1256l) list.get(i7)).f13908a)) {
                    C1254j c1254j2 = this.f13852C;
                    if (c1254j2 == null || !c1254j2.f13897o) {
                        this.f13851B = uri;
                        C1246b c1246b = (C1246b) hashMap.get(uri);
                        C1254j c1254j3 = c1246b.f13843d;
                        if (c1254j3 == null || !c1254j3.f13897o) {
                            c1246b.c(b(uri));
                        } else {
                            this.f13852C = c1254j3;
                            this.f13863z.r(c1254j3);
                        }
                    }
                } else {
                    i7++;
                }
            }
        }
        return c1254j;
    }

    public final Uri b(Uri uri) {
        C1250f c1250f;
        C1254j c1254j = this.f13852C;
        if (c1254j == null || !c1254j.f13904v.f13886e || (c1250f = (C1250f) c1254j.f13902t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1250f.f13867b));
        int i7 = c1250f.f13868c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i7;
        C1246b c1246b = (C1246b) this.f13858d.get(uri);
        if (c1246b.f13843d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, t.N(c1246b.f13843d.f13903u));
        C1254j c1254j = c1246b.f13843d;
        return c1254j.f13897o || (i7 = c1254j.f13887d) == 2 || i7 == 1 || c1246b.f13844e + max > elapsedRealtime;
    }

    @Override // u2.F
    public final void g(H h6, long j, long j3) {
        C1257m c1257m;
        N n2 = (N) h6;
        AbstractC1258n abstractC1258n = (AbstractC1258n) n2.f16733f;
        boolean z4 = abstractC1258n instanceof C1254j;
        if (z4) {
            String str = abstractC1258n.f13924a;
            C1257m c1257m2 = C1257m.f13914n;
            Uri parse = Uri.parse(str);
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10528a = "0";
            format$Builder.j = "application/x-mpegURL";
            c1257m = new C1257m("", Collections.emptyList(), Collections.singletonList(new C1256l(parse, new X(format$Builder), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            c1257m = (C1257m) abstractC1258n;
        }
        this.f13850A = c1257m;
        this.f13851B = ((C1256l) c1257m.f13916e.get(0)).f13908a;
        this.f13859e.add(new C1245a(this));
        List list = c1257m.f13915d;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f13858d.put(uri, new C1246b(this, uri));
        }
        Uri uri2 = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        C1246b c1246b = (C1246b) this.f13858d.get(this.f13851B);
        if (z4) {
            c1246b.d((C1254j) abstractC1258n);
        } else {
            c1246b.c(c1246b.f13840a);
        }
        this.f13857c.getClass();
        this.f13860f.f(c0814u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // u2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q1.e i(H h6, IOException iOException, int i7) {
        long j;
        N n2 = (N) h6;
        long j3 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        this.f13857c.getClass();
        if (!(iOException instanceof C0045t0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1621A) && !(iOException instanceof J)) {
            int i8 = C1637n.f16793b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1637n) || ((C1637n) th).f16794a != 2008) {
                }
            }
            j = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
            boolean z4 = j == -9223372036854775807L;
            this.f13860f.i(c0814u, n2.f16730c, iOException, z4);
            return !z4 ? K.f16724f : new Q1.e(j, 0, false);
        }
        j = -9223372036854775807L;
        if (j == -9223372036854775807L) {
        }
        this.f13860f.i(c0814u, n2.f16730c, iOException, z4);
        if (!z4) {
        }
    }

    @Override // u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        N n2 = (N) h6;
        long j7 = n2.f16728a;
        Uri uri = n2.f16731d.f16755c;
        C0814u c0814u = new C0814u();
        this.f13857c.getClass();
        this.f13860f.d(c0814u, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
