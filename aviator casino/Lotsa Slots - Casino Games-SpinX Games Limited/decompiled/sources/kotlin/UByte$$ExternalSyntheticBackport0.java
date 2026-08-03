package kotlin;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class UByte$$ExternalSyntheticBackport0 {
    public static /* synthetic */ int m(int i, int i2) {
        int i3 = i % i2;
        if (i3 == 0) {
            return 0;
        }
        return (((i ^ i2) >> 31) | 1) > 0 ? i3 : i3 + i2;
    }

    public static /* synthetic */ int m(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ int m(java.lang.reflect.Method method) {
        return method.getParameterTypes().length;
    }

    public static /* synthetic */ int m(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ long m10867m(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2) ? j : j - j2;
        }
        if (j >= 0) {
            return j % j2;
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if ((j3 ^ Long.MIN_VALUE) < (Long.MIN_VALUE ^ j2)) {
            j2 = 0;
        }
        return j3 - j2;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ java.lang.String m10868m(int i, int i2) {
        return java.lang.Long.toString(i & 4294967295L, i2);
    }

    public static /* synthetic */ java.lang.String m(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return java.lang.Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = java.lang.Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = java.lang.Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = java.lang.Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new java.lang.String(cArr, i2, 64 - i2);
    }

    public static /* synthetic */ java.lang.String m(java.lang.CharSequence charSequence, java.lang.Iterable iterable) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("delimiter");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String m(java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("delimiter");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append(charSequence);
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.util.Map.Entry m(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(obj), java.util.Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ java.util.Set m(java.lang.Object[] objArr) {
        java.util.HashSet hashSet = new java.util.HashSet(objArr.length);
        for (java.lang.Object obj : objArr) {
            if (!hashSet.add(java.util.Objects.requireNonNull(obj))) {
                throw new java.lang.IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean m(java.lang.Object obj) {
        return obj == null;
    }

    public static /* synthetic */ long m$1(long j, long j2) {
        if (j2 < 0) {
            return (j ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j >= 0) {
            return j / j2;
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return j3 + (((j - (j3 * j2)) ^ Long.MIN_VALUE) < (j2 ^ Long.MIN_VALUE) ? 0 : 1);
    }

    public static /* synthetic */ java.lang.String m$1(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return java.lang.Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = java.lang.Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = java.lang.Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = java.lang.Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new java.lang.String(cArr, i2, 64 - i2);
    }

    public static /* synthetic */ int m$2(int i, int i2) {
        return (int) ((i & 4294967295L) / (i2 & 4294967295L));
    }

    public static /* synthetic */ java.lang.String m$2(long j, int i) {
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return java.lang.Long.toString(j, i);
        }
        if (i < 2 || i > 36) {
            i = 10;
        }
        int i2 = 64;
        char[] cArr = new char[64];
        int i3 = i - 1;
        if ((i & i3) == 0) {
            int numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i);
            do {
                i2--;
                cArr[i2] = java.lang.Character.forDigit(((int) j) & i3, i);
                j >>>= numberOfTrailingZeros;
            } while (j != 0);
        } else {
            long m$1 = (i & 1) == 0 ? (j >>> 1) / (i >>> 1) : m$1(j, i);
            long j2 = i;
            cArr[63] = java.lang.Character.forDigit((int) (j - (m$1 * j2)), i);
            i2 = 63;
            while (m$1 > 0) {
                i2--;
                cArr[i2] = java.lang.Character.forDigit((int) (m$1 % j2), i);
                m$1 /= j2;
            }
        }
        return new java.lang.String(cArr, i2, 64 - i2);
    }

    public static /* synthetic */ int m$3(int i, int i2) {
        return (int) ((i & 4294967295L) % (i2 & 4294967295L));
    }
}
