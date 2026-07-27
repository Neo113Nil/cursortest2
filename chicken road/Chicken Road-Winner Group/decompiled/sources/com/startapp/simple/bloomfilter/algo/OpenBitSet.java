package com.startapp.simple.bloomfilter.algo;

import B0.c;
import java.io.Serializable;

/* loaded from: classes.dex */
public class OpenBitSet implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int PAGE_COUNT_LIMIT = 100;
    public static final int PAGE_SIZE = 4096;
    private static final long serialVersionUID = -901334831550831262L;
    private final long[][] bits;
    private final int pageCount;
    private int wlen;

    public OpenBitSet(long j3) {
        int bits2words = bits2words(j3);
        this.wlen = bits2words;
        int i3 = bits2words % 4096;
        int i4 = bits2words / 4096;
        int i5 = (i3 == 0 ? 0 : 1) + i4;
        this.pageCount = i5;
        if (i5 > 100) {
            throw new RuntimeException(c.h(i5, "HighPageCountException pageCount = "));
        }
        this.bits = new long[i5][];
        for (int i6 = 0; i6 < i4; i6++) {
            this.bits[i6] = new long[4096];
        }
        if (i3 != 0) {
            long[][] jArr = this.bits;
            jArr[jArr.length - 1] = new long[i3];
        }
    }

    private int bits2words(long j3) {
        return (int) (((j3 - 1) >>> 6) + 1);
    }

    private void ensureCapacity(long j3) {
        ensureCapacityWords(bits2words(j3));
    }

    private void ensureCapacityWords(int i3) {
    }

    private int expandingWordNum(long j3) {
        int i3 = (int) (j3 >> 6);
        if (i3 >= this.wlen) {
            ensureCapacity(j3 + 1);
            this.wlen = i3 + 1;
        }
        return i3;
    }

    public int getNumWords() {
        return this.wlen;
    }

    public long[] getPage(int i3) {
        return this.bits[i3];
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public boolean indexInBits(long j3) {
        int i3 = (int) (j3 >> 6);
        return i3 < this.wlen && ((1 << (((int) j3) & 63)) & this.bits[i3 / 4096][i3 % 4096]) != 0;
    }

    public void set(long j3) {
        int expandingWordNum = expandingWordNum(j3);
        long[] jArr = this.bits[expandingWordNum / 4096];
        int i3 = expandingWordNum % 4096;
        jArr[i3] = (1 << (((int) j3) & 63)) | jArr[i3];
    }

    public long size() {
        return this.wlen << 6;
    }
}
