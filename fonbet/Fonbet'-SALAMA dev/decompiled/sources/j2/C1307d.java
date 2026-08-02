package j2;

import R5.F;
import com.google.android.gms.common.api.internal.C0844v;
import java.util.ArrayDeque;
import java.util.List;
import v2.AbstractC1664a;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307d extends D1.a implements InterfaceC1309f {

    /* renamed from: c, reason: collision with root package name */
    public long f14587c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1309f f14588d;

    /* renamed from: e, reason: collision with root package name */
    public long f14589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14590f;

    /* renamed from: x, reason: collision with root package name */
    public Object f14591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307d() {
        super(0, (byte) 0);
        this.f14590f = 2;
    }

    @Override // j2.InterfaceC1309f
    public final int d(long j) {
        InterfaceC1309f interfaceC1309f = this.f14588d;
        interfaceC1309f.getClass();
        return interfaceC1309f.d(j - this.f14589e);
    }

    @Override // j2.InterfaceC1309f
    public final long h(int i7) {
        InterfaceC1309f interfaceC1309f = this.f14588d;
        interfaceC1309f.getClass();
        return interfaceC1309f.h(i7) + this.f14589e;
    }

    @Override // j2.InterfaceC1309f
    public final List m(long j) {
        InterfaceC1309f interfaceC1309f = this.f14588d;
        interfaceC1309f.getClass();
        return interfaceC1309f.m(j - this.f14589e);
    }

    @Override // j2.InterfaceC1309f
    public final int p() {
        InterfaceC1309f interfaceC1309f = this.f14588d;
        interfaceC1309f.getClass();
        return interfaceC1309f.p();
    }

    public final void t() {
        switch (this.f14590f) {
            case 0:
                ArrayDeque arrayDeque = (ArrayDeque) ((C0844v) this.f14591x).f11197d;
                AbstractC1664a.h(arrayDeque.size() < 2);
                AbstractC1664a.f(!arrayDeque.contains(this));
                this.f1675b = 0;
                this.f14588d = null;
                arrayDeque.addFirst(this);
                return;
            case 1:
                AbstractC1308e abstractC1308e = (AbstractC1308e) this.f14591x;
                synchronized (abstractC1308e.f14596b) {
                    this.f1675b = 0;
                    this.f14588d = null;
                    int i7 = abstractC1308e.f14602y;
                    abstractC1308e.f14602y = i7 + 1;
                    abstractC1308e.f14600f[i7] = this;
                    if (!abstractC1308e.f14597c.isEmpty() && abstractC1308e.f14602y > 0) {
                        abstractC1308e.f14596b.notify();
                    }
                }
                return;
            default:
                k2.h hVar = (k2.h) ((F) this.f14591x).f6075b;
                hVar.getClass();
                this.f1675b = 0;
                this.f14588d = null;
                hVar.f14761b.add(this);
                return;
        }
    }

    public final void y(long j, InterfaceC1309f interfaceC1309f, long j3) {
        this.f14587c = j;
        this.f14588d = interfaceC1309f;
        if (j3 != Long.MAX_VALUE) {
            j = j3;
        }
        this.f14589e = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307d(InterfaceC1310g interfaceC1310g, int i7) {
        super(0, (byte) 0);
        this.f14590f = i7;
        this.f14591x = interfaceC1310g;
    }
}
