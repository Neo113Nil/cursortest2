package io.reactivex.internal.util;

/* loaded from: classes17.dex */
public class LinkedArrayList {
    final int getInputSizeshNQ4ISI;
    java.lang.Object[] getOutputMinFrameDuration;
    java.lang.Object[] getOutputMinFrameDurationlomOqCM;
    volatile int getOutputSizes;
    int getOutputStallDuration;

    public LinkedArrayList(int i) {
        this.getInputSizeshNQ4ISI = i;
    }

    public void add(java.lang.Object obj) {
        if (this.getOutputSizes == 0) {
            java.lang.Object[] objArr = new java.lang.Object[this.getInputSizeshNQ4ISI + 1];
            this.getOutputMinFrameDuration = objArr;
            this.getOutputMinFrameDurationlomOqCM = objArr;
            objArr[0] = obj;
            this.getOutputStallDuration = 1;
            this.getOutputSizes = 1;
            return;
        }
        int i = this.getOutputStallDuration;
        int i2 = this.getInputSizeshNQ4ISI;
        if (i == i2) {
            java.lang.Object[] objArr2 = new java.lang.Object[i2 + 1];
            objArr2[0] = obj;
            this.getOutputMinFrameDurationlomOqCM[i2] = objArr2;
            this.getOutputMinFrameDurationlomOqCM = objArr2;
            this.getOutputStallDuration = 1;
            this.getOutputSizes++;
            return;
        }
        this.getOutputMinFrameDurationlomOqCM[i] = obj;
        this.getOutputStallDuration = i + 1;
        this.getOutputSizes++;
    }

    public java.lang.Object[] head() {
        return this.getOutputMinFrameDuration;
    }

    public int size() {
        return this.getOutputSizes;
    }

    public java.lang.String toString() {
        int i = this.getInputSizeshNQ4ISI;
        int i2 = this.getOutputSizes;
        java.util.ArrayList arrayList = new java.util.ArrayList(i2 + 1);
        java.lang.Object[] head = head();
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            arrayList.add(head[i4]);
            i3++;
            i4++;
            if (i4 == i) {
                head = (java.lang.Object[]) head[i];
                i4 = 0;
            }
        }
        return arrayList.toString();
    }
}
