package rx.internal.util;

/* loaded from: classes18.dex */
public class LinkedArrayList {
    volatile int getHighSpeedVideoSizesFor;
    java.lang.Object[] getInputFormats;
    int getOutputFormats;
    final int getOutputMinFrameDuration;
    java.lang.Object[] getOutputStallDuration;

    public LinkedArrayList(int i) {
        this.getOutputMinFrameDuration = i;
    }

    public void add(java.lang.Object obj) {
        if (this.getHighSpeedVideoSizesFor == 0) {
            java.lang.Object[] objArr = new java.lang.Object[this.getOutputMinFrameDuration + 1];
            this.getInputFormats = objArr;
            this.getOutputStallDuration = objArr;
            objArr[0] = obj;
            this.getOutputFormats = 1;
            this.getHighSpeedVideoSizesFor = 1;
            return;
        }
        int i = this.getOutputFormats;
        int i2 = this.getOutputMinFrameDuration;
        if (i == i2) {
            java.lang.Object[] objArr2 = new java.lang.Object[i2 + 1];
            objArr2[0] = obj;
            this.getOutputStallDuration[i2] = objArr2;
            this.getOutputStallDuration = objArr2;
            this.getOutputFormats = 1;
            this.getHighSpeedVideoSizesFor++;
            return;
        }
        this.getOutputStallDuration[i] = obj;
        this.getOutputFormats = i + 1;
        this.getHighSpeedVideoSizesFor++;
    }

    public java.lang.Object[] head() {
        return this.getInputFormats;
    }

    public java.lang.Object[] tail() {
        return this.getOutputStallDuration;
    }

    public int size() {
        return this.getHighSpeedVideoSizesFor;
    }

    public int indexInTail() {
        return this.getOutputFormats;
    }

    public int capacityHint() {
        return this.getOutputMinFrameDuration;
    }

    public java.lang.String toString() {
        int i = this.getOutputMinFrameDuration;
        int i2 = this.getHighSpeedVideoSizesFor;
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
