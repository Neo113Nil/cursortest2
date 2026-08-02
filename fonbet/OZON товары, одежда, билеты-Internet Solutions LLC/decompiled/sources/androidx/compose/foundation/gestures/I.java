package androidx.compose.foundation.gestures;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r0.InterfaceC9133m;

/* loaded from: classes8.dex */
final class I<T> implements InterfaceC9133m<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.H f39036a;

    public I(@NotNull androidx.collection.H h11) {
        this.f39036a = h11;
    }

    @Override // r0.InterfaceC9133m
    public final T a(float f7, boolean z11) {
        androidx.collection.H h11 = this.f39036a;
        Object[] objArr = h11.f38635b;
        float[] fArr = h11.f38636c;
        long[] jArr = h11.f38634a;
        int length = jArr.length - 2;
        T t2 = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            float f12 = fArr[i14];
                            float f13 = z11 ? f12 - f7 : f7 - f12;
                            if (f13 < 0.0f) {
                                f13 = Float.POSITIVE_INFINITY;
                            }
                            if (f13 <= f11) {
                                f11 = f13;
                                t2 = (T) obj;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return t2;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return t2;
    }

    @Override // r0.InterfaceC9133m
    public final T b(float f7) {
        androidx.collection.H h11 = this.f39036a;
        Object[] objArr = h11.f38635b;
        float[] fArr = h11.f38636c;
        long[] jArr = h11.f38634a;
        int length = jArr.length - 2;
        T t2 = null;
        if (length >= 0) {
            float f11 = Float.POSITIVE_INFINITY;
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            Object obj = objArr[i14];
                            float abs = Math.abs(f7 - fArr[i14]);
                            if (abs <= f11) {
                                f11 = abs;
                                t2 = (T) obj;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        return t2;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return t2;
    }

    @Override // r0.InterfaceC9133m
    public final boolean c(T t2) {
        return this.f39036a.b(t2) >= 0;
    }

    @Override // r0.InterfaceC9133m
    public final float d() {
        int i11 = C5158a.f39111b;
        androidx.collection.H h11 = this.f39036a;
        if (h11.f38638e == 1) {
            return Float.NaN;
        }
        float[] fArr = h11.f38636c;
        long[] jArr = h11.f38634a;
        int length = jArr.length - 2;
        float f7 = Float.POSITIVE_INFINITY;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            float f11 = fArr[(i12 << 3) + i14];
                            if (f11 <= f7) {
                                f7 = f11;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return f7;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return f7;
    }

    @Override // r0.InterfaceC9133m
    public final float e(T t2) {
        androidx.collection.H h11 = this.f39036a;
        int b11 = h11.b(t2);
        if (b11 >= 0) {
            return h11.f38636c[b11];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        return Intrinsics.d(this.f39036a, ((I) obj).f39036a);
    }

    @Override // r0.InterfaceC9133m
    public final float f() {
        int i11 = C5158a.f39111b;
        androidx.collection.H h11 = this.f39036a;
        if (h11.f38638e == 1) {
            return Float.NaN;
        }
        float[] fArr = h11.f38636c;
        long[] jArr = h11.f38634a;
        int length = jArr.length - 2;
        float f7 = Float.NEGATIVE_INFINITY;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr[i12];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j11) < 128) {
                            float f11 = fArr[(i12 << 3) + i14];
                            if (f11 >= f7) {
                                f7 = f11;
                            }
                        }
                        j11 >>= 8;
                    }
                    if (i13 != 8) {
                        return f7;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
        }
        return f7;
    }

    public final int hashCode() {
        return this.f39036a.hashCode() * 31;
    }

    @NotNull
    public final String toString() {
        return "MapDraggableAnchors(" + this.f39036a + ')';
    }
}
