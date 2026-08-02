package p2;

import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.G7;
import g2.C1978b;

/* renamed from: p2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2256n {

    /* renamed from: a, reason: collision with root package name */
    public final v3.e f18724a;

    /* renamed from: b, reason: collision with root package name */
    public final C1978b f18725b;

    /* renamed from: c, reason: collision with root package name */
    public final G7 f18726c;

    static {
        f2.m.f("WMFgUpdater");
    }

    public C2256n(WorkDatabase workDatabase, C1978b c1978b, v3.e eVar) {
        this.f18725b = c1978b;
        this.f18724a = eVar;
        this.f18726c = workDatabase.n();
    }
}
