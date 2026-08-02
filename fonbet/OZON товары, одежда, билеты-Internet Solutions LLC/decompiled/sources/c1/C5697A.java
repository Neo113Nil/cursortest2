package c1;

import S0.H1;
import kotlin.collections.C7705l;
import org.jetbrains.annotations.NotNull;

/* renamed from: c1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5697A<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f56174a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f56175b = new int[16];

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private H1<T>[] f56176c = new H1[16];

    public final void a(@NotNull InterfaceC5704H interfaceC5704H) {
        int i11 = this.f56174a;
        int identityHashCode = System.identityHashCode(interfaceC5704H);
        int i12 = -1;
        if (i11 > 0) {
            int i13 = this.f56174a - 1;
            int i14 = 0;
            while (true) {
                if (i14 > i13) {
                    i12 = -(i14 + 1);
                    break;
                }
                int i15 = (i14 + i13) >>> 1;
                int i16 = this.f56175b[i15];
                if (i16 < identityHashCode) {
                    i14 = i15 + 1;
                } else if (i16 > identityHashCode) {
                    i13 = i15 - 1;
                } else {
                    H1<T> h12 = this.f56176c[i15];
                    if (interfaceC5704H != (h12 != null ? h12.get() : null)) {
                        for (int i17 = i15 - 1; -1 < i17 && this.f56175b[i17] == identityHashCode; i17--) {
                            H1<T> h13 = this.f56176c[i17];
                            if ((h13 != null ? h13.get() : null) == interfaceC5704H) {
                                i12 = i17;
                                break;
                            }
                        }
                        i15++;
                        int i18 = this.f56174a;
                        while (true) {
                            if (i15 >= i18) {
                                i12 = -(this.f56174a + 1);
                                break;
                            } else {
                                if (this.f56175b[i15] != identityHashCode) {
                                    i12 = -(i15 + 1);
                                    break;
                                }
                                H1<T> h14 = this.f56176c[i15];
                                if ((h14 != null ? h14.get() : null) == interfaceC5704H) {
                                    break;
                                } else {
                                    i15++;
                                }
                            }
                        }
                    }
                    i12 = i15;
                }
            }
            if (i12 >= 0) {
                return;
            }
        }
        int i19 = -(i12 + 1);
        H1<T>[] h1Arr = this.f56176c;
        int length = h1Arr.length;
        if (i11 == length) {
            int i21 = length * 2;
            H1<T>[] h1Arr2 = new H1[i21];
            int[] iArr = new int[i21];
            int i22 = i19 + 1;
            C7705l.r(h1Arr, i22, h1Arr2, i19, i11);
            C7705l.u(this.f56176c, 0, h1Arr2, i19, 6);
            C7705l.p(i22, i19, this.f56175b, iArr, i11);
            C7705l.t(0, i19, this.f56175b, iArr, 6);
            this.f56176c = h1Arr2;
            this.f56175b = iArr;
        } else {
            int i23 = i19 + 1;
            C7705l.r(h1Arr, i23, h1Arr, i19, i11);
            int[] iArr2 = this.f56175b;
            C7705l.p(i23, i19, iArr2, iArr2, i11);
        }
        this.f56176c[i19] = new H1<>(interfaceC5704H);
        this.f56175b[i19] = identityHashCode;
        this.f56174a++;
    }

    @NotNull
    public final int[] b() {
        return this.f56175b;
    }

    public final int c() {
        return this.f56174a;
    }

    @NotNull
    public final H1<T>[] d() {
        return this.f56176c;
    }

    public final void e(int i11) {
        this.f56174a = i11;
    }
}
