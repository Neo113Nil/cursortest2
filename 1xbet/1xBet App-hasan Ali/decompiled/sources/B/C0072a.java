package B;

import com.google.android.gms.internal.ads.AbstractC1690vD;
import com.google.android.gms.internal.ads.C1205ke;
import com.google.android.gms.internal.ads.C1250le;
import com.google.android.gms.internal.ads.C1825yD;
import com.google.android.gms.internal.ads.O3;
import com.google.android.gms.internal.ads.P3;
import com.google.android.gms.internal.ads.R3;
import com.google.android.gms.internal.ads.S3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072a {

    /* renamed from: a, reason: collision with root package name */
    public long f658a;

    public long a() {
        return Math.max(0L, this.f658a - System.nanoTime());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.yD] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.yD] */
    public long b(ByteBuffer byteBuffer) {
        S3 s32;
        R3 r32;
        long j5 = this.f658a;
        if (j5 > 0) {
            return j5;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            O3 o32 = new O3(new C1205ke(duplicate), C1250le.f14389c);
            C1205ke c1205ke = o32.f15982l;
            ArrayList arrayList = o32.f15986p;
            if (c1205ke != null && o32.f15983m != AbstractC1690vD.f15980q) {
                arrayList = new C1825yD(arrayList, o32);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                s32 = null;
                if (!it.hasNext()) {
                    r32 = null;
                    break;
                }
                P3 p32 = (P3) it.next();
                if (p32 instanceof R3) {
                    r32 = (R3) p32;
                    break;
                }
            }
            C1205ke c1205ke2 = r32.f15982l;
            ArrayList arrayList2 = r32.f15986p;
            if (c1205ke2 != null && r32.f15983m != AbstractC1690vD.f15980q) {
                arrayList2 = new C1825yD(arrayList2, r32);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                P3 p33 = (P3) it2.next();
                if (p33 instanceof S3) {
                    s32 = (S3) p33;
                    break;
                }
            }
            long j6 = (s32.f11495w * 1000) / s32.f11494v;
            this.f658a = j6;
            return j6;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
