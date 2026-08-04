package p068j2;

import D1.a;
import R5.F;
import com.google.android.gms.common.api.internal.C0800v;
import java.util.ArrayDeque;
import java.util.List;
import p073k2.h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f14593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f14594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14596f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f14597x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d() {
        super(0, (byte) 0);
        this.f14596f = 2;
    }

    @Override // p068j2.f
    public final int d(long j) {
        f fVar = this.f14594d;
        fVar.getClass();
        return fVar.d(j - this.f14595e);
    }

    @Override // p068j2.f
    public final long h(int i7) {
        f fVar = this.f14594d;
        fVar.getClass();
        return fVar.h(i7) + this.f14595e;
    }

    @Override // p068j2.f
    public final List m(long j) {
        f fVar = this.f14594d;
        fVar.getClass();
        return fVar.m(j - this.f14595e);
    }

    @Override // p068j2.f
    public final int p() {
        f fVar = this.f14594d;
        fVar.getClass();
        return fVar.p();
    }

    public final void t() {
        switch (this.f14596f) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((C0800v) this.f14597x).f11197d;
                p151v2.a.h(arrayDeque.size() < 2);
                p151v2.a.f(!arrayDeque.contains(this));
                this.f1675b = 0;
                this.f14594d = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                e eVar = (e) this.f14597x;
                synchronized (eVar.f14602b) {
                    this.f1675b = 0;
                    this.f14594d = null;
                    int i7 = eVar.f14608y;
                    eVar.f14608y = i7 + 1;
                    eVar.f14606f[i7] = this;
                    if (!eVar.f14603c.isEmpty() && eVar.f14608y > 0) {
                        eVar.f14602b.notify();
                    }
                    break;
                }
                return;
            default:
                h hVar = (h) ((F) this.f14597x).f6075b;
                hVar.getClass();
                this.f1675b = 0;
                this.f14594d = null;
                hVar.f14767b.add(this);
                return;
        }
    }

    public final void y(long j, f fVar, long j3) {
        this.f14593c = j;
        this.f14594d = fVar;
        if (j3 != Long.MAX_VALUE) {
            j = j3;
        }
        this.f14595e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, int i7) {
        super(0, (byte) 0);
        this.f14596f = i7;
        this.f14597x = gVar;
    }
}
