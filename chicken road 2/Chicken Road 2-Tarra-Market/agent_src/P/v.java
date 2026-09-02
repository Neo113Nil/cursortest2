package P;

import Q.C0006d;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import e0.InterfaceC0059a;

/* loaded from: classes.dex */
public final class v implements InterfaceC0059a {

    /* renamed from: a, reason: collision with root package name */
    public final C0002c f355a;

    /* renamed from: b, reason: collision with root package name */
    public final int f356b;

    /* renamed from: c, reason: collision with root package name */
    public final C0000a f357c;

    /* renamed from: d, reason: collision with root package name */
    public final long f358d;

    /* renamed from: e, reason: collision with root package name */
    public final long f359e;

    public v(C0002c c0002c, int i2, C0000a c0000a, long j2, long j3) {
        this.f355a = c0002c;
        this.f356b = i2;
        this.f357c = c0000a;
        this.f358d = j2;
        this.f359e = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0006d a(o oVar, com.google.android.gms.common.internal.a aVar, int i2) {
        Q.y yVar = aVar.f752u;
        C0006d c0006d = yVar == null ? null : yVar.f483d;
        if (c0006d != null && c0006d.f407b) {
            int[] iArr = c0006d.f409d;
            int i3 = 0;
            if (iArr == null) {
                int[] iArr2 = c0006d.f411f;
                if (iArr2 != null) {
                    while (i3 < iArr2.length) {
                        if (iArr2[i3] != i2) {
                            i3++;
                        }
                    }
                }
                if (oVar.f339l >= c0006d.f410e) {
                    return c0006d;
                }
                return null;
            }
            while (i3 < iArr.length) {
                if (iArr[i3] != i2) {
                    i3++;
                } else if (oVar.f339l >= c0006d.f410e) {
                }
            }
        }
        return null;
    }

    @Override // e0.InterfaceC0059a
    public final void onComplete(Task task) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        int i8;
        if (this.f355a.a()) {
            Q.i iVar = (Q.i) Q.h.b().f439a;
            if (iVar == null || iVar.f441b) {
                o oVar = (o) this.f355a.f311j.get(this.f357c);
                if (oVar != null) {
                    O.c cVar = oVar.f329b;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        long j3 = 0;
                        boolean z2 = this.f358d > 0;
                        int i9 = aVar.f747p;
                        if (iVar != null) {
                            z2 &= iVar.f442c;
                            int i10 = iVar.f443d;
                            int i11 = iVar.f444e;
                            i2 = iVar.f440a;
                            if (aVar.f752u != null && !aVar.a()) {
                                C0006d a2 = a(oVar, aVar, this.f356b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z3 = a2.f408c && this.f358d > 0;
                                i11 = a2.f410e;
                                z2 = z3;
                            }
                            i4 = i10;
                            i3 = i11;
                        } else {
                            i2 = 0;
                            i3 = 100;
                            i4 = 5000;
                        }
                        C0002c c0002c = this.f355a;
                        if (task.d()) {
                            i6 = 0;
                            i7 = 0;
                        } else {
                            if (((e0.k) task).f971d) {
                                i6 = 100;
                            } else {
                                Exception b2 = task.b();
                                if (b2 instanceof O.d) {
                                    Status status = ((O.d) b2).f263a;
                                    i5 = status.f727a;
                                    N.b bVar = status.f730d;
                                    if (bVar != null) {
                                        i7 = bVar.f231b;
                                        i6 = i5;
                                    }
                                } else {
                                    i5 = 101;
                                }
                                i6 = i5;
                            }
                            i7 = -1;
                        }
                        if (z2) {
                            long j4 = this.f358d;
                            long j5 = this.f359e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j5);
                            j2 = j4;
                            j3 = currentTimeMillis;
                        } else {
                            j2 = 0;
                            i8 = -1;
                        }
                        c0002c.getClass();
                        w wVar = new w(new Q.g(this.f356b, i6, i7, j2, j3, null, null, i9, i8), i2, i4, i3);
                        Z.e eVar = c0002c.f314m;
                        eVar.sendMessage(eVar.obtainMessage(18, wVar));
                    }
                }
            }
        }
    }
}
