package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
class ERSUtil {
    private static final java.util.Comparator<byte[]> getHighSpeedVideoFpsRangesFor = new org.bouncycastle.tsp.ers.ByteArrayComparator();

    static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.DigestCalculator digestCalculator, byte[][] bArr) {
        if (bArr.length != 2) {
            return getHighResolutionOutputSizeshNQ4ISI(digestCalculator, getHighSpeedVideoFpsRanges(bArr).iterator());
        }
        byte[] bArr2 = bArr[0];
        byte[] bArr3 = bArr[1];
        return getHighSpeedVideoFpsRangesFor.compare(bArr2, bArr3) <= 0 ? getHighSpeedVideoFpsRanges(digestCalculator, bArr2, bArr3) : getHighSpeedVideoFpsRanges(digestCalculator, bArr3, bArr2);
    }

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.operator.DigestCalculator digestCalculator, org.bouncycastle.asn1.tsp.PartialHashtree partialHashtree) {
        byte[][] values = partialHashtree.getValues();
        return values.length > 1 ? getHighResolutionOutputSizeshNQ4ISI(digestCalculator, getHighSpeedVideoFpsRanges(values).iterator()) : values[0];
    }

    private static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.operator.DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.write(bArr2);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to calculate hash: ");
            sb.append(e.getMessage());
            throw org.bouncycastle.tsp.ers.ExpUtil.getHighSpeedVideoSizes(sb.toString(), e);
        }
    }

    static byte[] getHighSpeedVideoFpsRanges(org.bouncycastle.operator.DigestCalculator digestCalculator, byte[] bArr) {
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to calculate hash: ");
            sb.append(e.getMessage());
            throw org.bouncycastle.tsp.ers.ExpUtil.getHighSpeedVideoSizes(sb.toString(), e);
        }
    }

    static byte[] getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.operator.DigestCalculator digestCalculator, java.util.Iterator<byte[]> it) {
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            while (it.hasNext()) {
                outputStream.write(it.next());
            }
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to calculate hash: ");
            sb.append(e.getMessage());
            throw org.bouncycastle.tsp.ers.ExpUtil.getHighSpeedVideoSizes(sb.toString(), e);
        }
    }

    static byte[] getHighSpeedVideoFpsRangesFor(org.bouncycastle.operator.DigestCalculator digestCalculator, java.io.InputStream inputStream) {
        try {
            java.io.OutputStream outputStream = digestCalculator.getOutputStream();
            org.bouncycastle.util.io.Streams.pipeAll(inputStream, outputStream);
            outputStream.close();
            return digestCalculator.getDigest();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to calculate hash: ");
            sb.append(e.getMessage());
            throw org.bouncycastle.tsp.ers.ExpUtil.getHighSpeedVideoSizes(sb.toString(), e);
        }
    }

    static byte[] getHighSpeedVideoSizes(org.bouncycastle.operator.DigestCalculator digestCalculator, byte[] bArr, byte[] bArr2) {
        return getHighSpeedVideoFpsRangesFor.compare(bArr, bArr2) <= 0 ? getHighSpeedVideoFpsRanges(digestCalculator, bArr, bArr2) : getHighSpeedVideoFpsRanges(digestCalculator, bArr2, bArr);
    }

    private static java.util.List<byte[]> getHighSpeedVideoFpsRanges(byte[][] bArr) {
        org.bouncycastle.tsp.ers.SortedHashList sortedHashList = new org.bouncycastle.tsp.ers.SortedHashList();
        for (int i = 0; i != bArr.length; i++) {
            sortedHashList.add(bArr[i]);
        }
        return sortedHashList.toList();
    }

    static java.util.List<byte[]> getHighSpeedVideoSizes(org.bouncycastle.operator.DigestCalculator digestCalculator, java.util.List<org.bouncycastle.tsp.ers.ERSData> list) {
        org.bouncycastle.tsp.ers.SortedHashList sortedHashList = new org.bouncycastle.tsp.ers.SortedHashList();
        for (int i = 0; i != list.size(); i++) {
            sortedHashList.add(list.get(i).getHash(digestCalculator));
        }
        return sortedHashList.toList();
    }

    private ERSUtil() {
    }
}
