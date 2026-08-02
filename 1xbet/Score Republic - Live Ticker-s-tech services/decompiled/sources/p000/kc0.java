package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kc0 {

    /* JADX INFO: renamed from: a */
    public Object[] f4343a;

    /* JADX INFO: renamed from: b */
    public int f4344b;

    /* JADX INFO: renamed from: c */
    public boolean f4345c;

    public kc0(int i) {
        wm1.m5355a("initialCapacity", i);
        this.f4343a = new Object[i];
        this.f4344b = 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m3003b(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: a */
    public final void m3004a(Object obj) {
        obj.getClass();
        m3005c(this.f4344b + 1);
        Object[] objArr = this.f4343a;
        int i = this.f4344b;
        this.f4344b = i + 1;
        objArr[i] = obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m3005c(int i) {
        Object[] objArr = this.f4343a;
        if (objArr.length < i) {
            this.f4343a = Arrays.copyOf(objArr, m3003b(objArr.length, i));
            this.f4345c = false;
        } else if (this.f4345c) {
            this.f4343a = (Object[]) objArr.clone();
            this.f4345c = false;
        }
    }
}
