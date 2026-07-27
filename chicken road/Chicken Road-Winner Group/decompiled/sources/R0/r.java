package R0;

import S0.C0060c;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import i1.C0341k;
import i1.InterfaceC0332b;

/* loaded from: classes.dex */
public final class r implements InterfaceC0332b {

    /* renamed from: a, reason: collision with root package name */
    public final c f1230a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1231b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1232c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1233d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1234e;

    public r(c cVar, int i3, a aVar, long j3, long j4) {
        this.f1230a = cVar;
        this.f1231b = i3;
        this.f1232c = aVar;
        this.f1233d = j3;
        this.f1234e = j4;
    }

    public static C0060c a(l lVar, com.google.android.gms.common.internal.a aVar, int i3) {
        S0.x xVar = aVar.f2591u;
        C0060c c0060c = xVar == null ? null : xVar.f1372d;
        if (c0060c != null && c0060c.f1300b) {
            int[] iArr = c0060c.f1302d;
            int i4 = 0;
            if (iArr == null) {
                int[] iArr2 = c0060c.f;
                if (iArr2 != null) {
                    while (i4 < iArr2.length) {
                        if (iArr2[i4] == i3) {
                            return null;
                        }
                        i4++;
                    }
                }
            } else {
                while (i4 < iArr.length) {
                    if (iArr[i4] != i3) {
                        i4++;
                    }
                }
            }
            if (lVar.f1218n < c0060c.f1303e) {
                return c0060c;
            }
        }
        return null;
    }

    @Override // i1.InterfaceC0332b
    public final void onComplete(Task task) {
        int i3;
        int i4;
        int i5;
        int i6;
        long j3;
        long j4;
        if (this.f1230a.a()) {
            S0.h hVar = (S0.h) S0.g.b().f1329a;
            if (hVar == null || hVar.f1331b) {
                l lVar = (l) this.f1230a.f1200j.get(this.f1232c);
                if (lVar != null) {
                    Q0.c cVar = lVar.f1209d;
                    if (cVar instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                        int i7 = 0;
                        boolean z3 = this.f1233d > 0;
                        int i8 = aVar.f2586p;
                        int i9 = 100;
                        if (hVar != null) {
                            z3 &= hVar.f1332c;
                            int i10 = hVar.f1333d;
                            int i11 = hVar.f1334e;
                            i3 = hVar.f1330a;
                            if (aVar.f2591u != null && !aVar.e()) {
                                C0060c a3 = a(lVar, aVar, this.f1231b);
                                if (a3 == null) {
                                    return;
                                }
                                boolean z4 = a3.f1301c && this.f1233d > 0;
                                i11 = a3.f1303e;
                                z3 = z4;
                            }
                            i5 = i10;
                            i4 = i11;
                        } else {
                            i3 = 0;
                            i4 = 100;
                            i5 = 5000;
                        }
                        c cVar2 = this.f1230a;
                        int i12 = -1;
                        if (task.c()) {
                            i6 = 0;
                        } else {
                            if (!((C0341k) task).f5025d) {
                                Exception a4 = task.a();
                                if (a4 instanceof Q0.d) {
                                    Status status = ((Q0.d) a4).f1158a;
                                    i9 = status.f2567a;
                                    P0.b bVar = status.f2570d;
                                    if (bVar != null) {
                                        i7 = bVar.f1122b;
                                        i6 = i9;
                                    }
                                } else {
                                    i6 = 101;
                                    i7 = -1;
                                }
                            }
                            i6 = i9;
                            i7 = -1;
                        }
                        if (z3) {
                            long j5 = this.f1233d;
                            long j6 = this.f1234e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i12 = (int) (SystemClock.elapsedRealtime() - j6);
                            j4 = currentTimeMillis;
                            j3 = j5;
                        } else {
                            j3 = 0;
                            j4 = 0;
                        }
                        int i13 = i12;
                        cVar2.getClass();
                        s sVar = new s(new S0.f(this.f1231b, i6, i7, j3, j4, null, null, i8, i13), i3, i5, i4);
                        b1.e eVar = cVar2.f1203m;
                        eVar.sendMessage(eVar.obtainMessage(18, sVar));
                    }
                }
            }
        }
    }
}
