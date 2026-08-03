package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class BR<E> extends com.facebook.ads.redexgen.core.AbstractC2078oN<E> {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"emqP2Ifv15ruA3vfOBddLKXSQAhVBBiZ", "hrMd7lJ1e8dj2uYkEp7ZkSLs2D8yKDzP", "R1glWPF1KbPaEDQGu2GwL6vWIpfQR0VI", "T12dHmfXBitdOytN2RtspbU6Ik8qeuAk", "0tCJd3vKXz4Euq7T8InIHSFr9bbtNXIu", "Q", "MwChlhzfsoxh", "7ToYkJZV1iSpkxWyqnmjBpfIK3KeTcwM"};
    public int A00;
    public boolean A01;
    public java.lang.Object[] A02;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[3].charAt(25) != 'k') {
                throw new java.lang.RuntimeException();
            }
            A04[4] = "sNiI9gS6nHnAzu4lGjYMdK7Ee3tNN7Ch";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-6, -1, -6, 5, -6, -14, -3, -44, -14, 1, -14, -12, -6, 5, 10};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public BR(int initialCapacity) {
        com.facebook.ads.redexgen.core.AbstractC2013nJ.A00(initialCapacity, A00(0, 15, 58));
        this.A02 = new java.lang.Object[initialCapacity];
        this.A00 = 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    private void A02(int newElements) {
        java.lang.Object[] objArr = this.A02;
        int newCapacity = com.facebook.ads.redexgen.core.AbstractC2078oN.A03(objArr.length, this.A00 + newElements);
        if (newCapacity > objArr.length || this.A01) {
            java.lang.Object[] contents = this.A02;
            this.A02 = java.util.Arrays.copyOf(contents, newCapacity);
            this.A01 = false;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BR != com.google.common.collect.ImmutableCollection$ArrayBasedBuilder<E> */
    public com.facebook.ads.redexgen.core.BR<E> A03(E element) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(element);
        A02(1);
        java.lang.Object[] objArr = this.A02;
        int i = this.A00;
        this.A00 = i + 1;
        objArr[i] = element;
        return this;
    }
}
