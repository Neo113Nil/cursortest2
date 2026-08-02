package androidx.collection;

import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.collection.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5138g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final float[] f38704a;

    static {
        long[] jArr;
        C5156z c5156z = new C5156z(0);
        int f7 = W.f(0);
        int max = f7 > 0 ? Math.max(7, W.e(f7)) : 0;
        c5156z.f38703c = max;
        if (max == 0) {
            jArr = W.f38661a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            C7705l.z(jArr);
        }
        c5156z.f38701a = jArr;
        int i11 = max >> 3;
        long j11 = 255 << ((max & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j11)) | j11;
        c5156z.f38702b = new float[max];
        f38704a = new float[0];
    }

    @NotNull
    public static final float[] a() {
        return f38704a;
    }
}
