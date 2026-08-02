package com.android.volley.toolbox;

/* loaded from: classes3.dex */
public class ByteArrayPool {
    protected static final java.util.Comparator<byte[]> BUF_COMPARATOR = new java.util.Comparator<byte[]>() { // from class: com.android.volley.toolbox.ByteArrayPool.1
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<byte[]> Camera2StreamConfigurationMap = new java.util.ArrayList();
    private final java.util.List<byte[]> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(64);
    private int getHighSpeedVideoSizes = 0;

    public ByteArrayPool(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public byte[] getBuf(int i) {
        synchronized (this) {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.size(); i2++) {
                byte[] bArr = this.getHighSpeedVideoFpsRangesFor.get(i2);
                if (bArr.length >= i) {
                    this.getHighSpeedVideoSizes -= bArr.length;
                    this.getHighSpeedVideoFpsRangesFor.remove(i2);
                    this.Camera2StreamConfigurationMap.remove(bArr);
                    return bArr;
                }
            }
            return new byte[i];
        }
    }

    public void returnBuf(byte[] bArr) {
        synchronized (this) {
            if (bArr != null) {
                if (bArr.length <= this.getHighResolutionOutputSizeshNQ4ISI) {
                    this.Camera2StreamConfigurationMap.add(bArr);
                    int binarySearch = java.util.Collections.binarySearch(this.getHighSpeedVideoFpsRangesFor, bArr, BUF_COMPARATOR);
                    if (binarySearch < 0) {
                        binarySearch = (-binarySearch) - 1;
                    }
                    this.getHighSpeedVideoFpsRangesFor.add(binarySearch, bArr);
                    this.getHighSpeedVideoSizes += bArr.length;
                    synchronized (this) {
                        while (this.getHighSpeedVideoSizes > this.getHighResolutionOutputSizeshNQ4ISI) {
                            byte[] remove = this.Camera2StreamConfigurationMap.remove(0);
                            this.getHighSpeedVideoFpsRangesFor.remove(remove);
                            this.getHighSpeedVideoSizes -= remove.length;
                        }
                    }
                }
            }
        }
    }
}
