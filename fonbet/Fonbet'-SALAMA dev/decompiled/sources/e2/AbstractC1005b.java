package e2;

import java.util.NoSuchElementException;

/* renamed from: e2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1005b implements InterfaceC1014k {

    /* renamed from: a, reason: collision with root package name */
    public final long f12574a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12575b;

    /* renamed from: c, reason: collision with root package name */
    public long f12576c;

    public AbstractC1005b(long j, long j3) {
        this.f12574a = j;
        this.f12575b = j3;
        this.f12576c = j - 1;
    }

    public final void a() {
        long j = this.f12576c;
        if (j < this.f12574a || j > this.f12575b) {
            throw new NoSuchElementException();
        }
    }

    @Override // e2.InterfaceC1014k
    public final boolean next() {
        long j = this.f12576c + 1;
        this.f12576c = j;
        return !(j > this.f12575b);
    }
}
