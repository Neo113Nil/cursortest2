package sg.bigo.ads.h;

import android.os.SystemClock;
import java.lang.reflect.Array;
import java.util.HashMap;
import sg.bigo.ads.e1.InterfaceC5087a;

/* renamed from: sg.bigo.ads.h.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5167g0 {

    /* renamed from: a, reason: collision with root package name */
    public long f12886a = 0;
    public long b = 0;
    public final int[] c = new int[10];
    public final long[] d = new long[10];
    public final long[] e = new long[10];
    public final boolean[][] f = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 10, 10);
    public final boolean[][] g = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 10, 10);
    public boolean h = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:2:0x0000, B:4:0x0013, B:8:0x0024, B:13:0x002f, B:17:0x0038, B:19:0x0046, B:20:0x0055, B:23:0x004f), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5087a interfaceC5087a, int i) {
        int i2;
        long elapsedRealtime;
        long j;
        try {
            this.e[i] = SystemClock.elapsedRealtime();
            int[] iArr = this.c;
            if (this.f12886a != 0 && SystemClock.elapsedRealtime() - this.f12886a <= 5000) {
                i2 = 1;
                iArr[i] = i2;
                int i3 = this.c[i];
                if (this.h) {
                    boolean[] zArr = this.f[i3];
                    if (zArr[i]) {
                        return;
                    }
                    zArr[i] = true;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.d[i];
                    if (i == 1) {
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        j = this.d[i];
                    } else {
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        j = this.b;
                    }
                    sg.bigo.ads.s1.b.a(interfaceC5087a, i, i3, elapsedRealtime2, elapsedRealtime - j);
                    return;
                }
                return;
            }
            i2 = 2;
            iArr[i] = i2;
            int i32 = this.c[i];
            if (this.h) {
            }
        } catch (Exception unused) {
        }
    }

    public final void b(InterfaceC5087a interfaceC5087a, int i) {
        try {
            long[] jArr = this.d;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
            if (this.e[i] != 0) {
                int[] iArr = this.c;
                int i2 = iArr[i];
                iArr[i] = 0;
                a(interfaceC5087a, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(int i) {
        try {
            long[] jArr = this.d;
            if (jArr[i] == 0) {
                jArr[i] = SystemClock.elapsedRealtime();
            }
        } catch (Exception unused) {
        }
    }

    public final void a(InterfaceC5087a interfaceC5087a, int i, int i2) {
        HashMap a2;
        try {
            boolean[] zArr = this.g[i2];
            if (zArr[i]) {
                return;
            }
            zArr[i] = true;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.e[i];
            if (interfaceC5087a == null) {
                a2 = new HashMap();
            } else {
                a2 = sg.bigo.ads.s1.b.a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
            }
            a2.put("page_type", String.valueOf(i));
            a2.put("action", String.valueOf(i2));
            a2.put("cost", String.valueOf(elapsedRealtime));
            sg.bigo.ads.s1.b.a("06002056", a2);
        } catch (Exception unused) {
        }
    }
}
