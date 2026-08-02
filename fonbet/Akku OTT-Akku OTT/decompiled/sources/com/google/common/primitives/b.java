package com.google.common.primitives;

import com.google.common.base.k;
import java.io.Serializable;
import java.util.Arrays;
import okhttp3.internal.url._UrlKt;

/* loaded from: classes4.dex */
public final class b implements Serializable {
    public static final b c = new b(new int[0]);
    public final int[] a;
    public final int b;

    public b(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public static b b(int i) {
        return new b(new int[]{i});
    }

    public final int a(int i) {
        k.e(i, this.b);
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int i = bVar.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == bVar.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public Object readResolve() {
        return this.b == 0 ? c : this;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return _UrlKt.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return i < length ? new b(Arrays.copyOfRange(iArr, 0, i)) : this;
    }
}
