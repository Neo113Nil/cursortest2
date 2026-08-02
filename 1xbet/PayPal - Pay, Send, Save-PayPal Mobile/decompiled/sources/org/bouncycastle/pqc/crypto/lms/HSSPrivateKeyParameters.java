package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class HSSPrivateKeyParameters extends org.bouncycastle.pqc.crypto.lms.LMSKeyParameters implements org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner {
    private java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    long getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    private final int getInputSizeshNQ4ISI;
    private org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters getOutputFormats;
    private java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> getOutputMinFrameDuration;

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext() {
        int l = getL();
        synchronized (this) {
            org.bouncycastle.pqc.crypto.lms.HSS.getHighSpeedVideoFpsRanges(this);
            java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            int i = l - 1;
            org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = getHighResolutionOutputSizeshNQ4ISI().get(i);
            org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[] lMSSignedPubKeyArr = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                lMSSignedPubKeyArr[i2] = new org.bouncycastle.pqc.crypto.lms.LMSSignedPubKey(Camera2StreamConfigurationMap.get(i2), highResolutionOutputSizeshNQ4ISI.get(i3).getPublicKey());
                i2 = i3;
            }
            synchronized (this) {
                this.getHighSpeedVideoFpsRanges++;
            }
            org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext = lMSPrivateKeyParameters.generateLMSContext();
            generateLMSContext.getInputFormats = lMSSignedPubKeyArr;
            return generateLMSContext;
        }
        org.bouncycastle.pqc.crypto.lms.LMSContext generateLMSContext2 = lMSPrivateKeyParameters.generateLMSContext();
        generateLMSContext2.getInputFormats = lMSSignedPubKeyArr;
        return generateLMSContext2;
    }

    public org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters getPublicKey() {
        org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters hSSPublicKeyParameters;
        synchronized (this) {
            hSSPublicKeyParameters = new org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters(this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.get(0).getPublicKey());
        }
        return hSSPublicKeyParameters;
    }

    final void Camera2StreamConfigurationMap(int i) {
        int i2 = i - 1;
        org.bouncycastle.pqc.crypto.lms.SeedDerive highSpeedVideoFpsRanges = this.Camera2StreamConfigurationMap.get(i2).getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI = -2;
        byte[] bArr = new byte[32];
        highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(bArr, 0);
        highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI++;
        byte[] bArr2 = new byte[32];
        highSpeedVideoFpsRanges.Camera2StreamConfigurationMap(bArr2, 0);
        byte[] bArr3 = new byte[16];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, 16);
        java.util.ArrayList arrayList = new java.util.ArrayList(this.Camera2StreamConfigurationMap);
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = this.Camera2StreamConfigurationMap.get(i);
        arrayList.set(i, org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(this.getOutputMinFrameDuration);
        arrayList2.set(i2, org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) arrayList.get(i2), ((org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters) arrayList.get(i)).getPublicKey().getHighResolutionOutputSizeshNQ4ISI()));
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(arrayList);
        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00db, code lost:
    
        if (r3[r11] == (r4[r11].getIndex() - 1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00de, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        if (r3[r11] == r4[r11].getIndex()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRangesFor() {
        boolean z;
        int i;
        boolean z2;
        java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        int size = highResolutionOutputSizeshNQ4ISI.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = highResolutionOutputSizeshNQ4ISI.size() - 1; size2 >= 0; size2--) {
            org.bouncycastle.pqc.crypto.lms.LMSigParameters sigParameters = highResolutionOutputSizeshNQ4ISI.get(size2).getSigParameters();
            jArr[size2] = ((1 << sigParameters.getH()) - 1) & index;
            index >>>= sigParameters.getH();
        }
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[]) highResolutionOutputSizeshNQ4ISI.toArray(new org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[highResolutionOutputSizeshNQ4ISI.size()]);
        java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> list = this.getOutputMinFrameDuration;
        org.bouncycastle.pqc.crypto.lms.LMSSignature[] lMSSignatureArr = (org.bouncycastle.pqc.crypto.lms.LMSSignature[]) list.toArray(new org.bouncycastle.pqc.crypto.lms.LMSSignature[list.size()]);
        org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = this.Camera2StreamConfigurationMap.get(0);
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), (int) jArr[0], lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret());
            z = true;
        } else {
            z = false;
        }
        int i2 = 1;
        while (i2 < size) {
            int i3 = i2 - 1;
            org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters2 = lMSPrivateKeyParametersArr[i3];
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[32];
            org.bouncycastle.pqc.crypto.lms.SeedDerive seedDerive = new org.bouncycastle.pqc.crypto.lms.SeedDerive(lMSPrivateKeyParameters2.getI(), lMSPrivateKeyParameters2.getMasterSecret(), org.bouncycastle.pqc.crypto.lms.DigestUtil.getHighSpeedVideoFpsRangesFor(lMSPrivateKeyParameters2.getOtsParameters().getDigestOID()));
            int i4 = i2;
            seedDerive.getHighSpeedVideoFpsRanges = (int) jArr[i3];
            seedDerive.getHighResolutionOutputSizeshNQ4ISI = -2;
            seedDerive.Camera2StreamConfigurationMap(bArr2, 0);
            seedDerive.getHighResolutionOutputSizeshNQ4ISI++;
            byte[] bArr3 = new byte[32];
            seedDerive.Camera2StreamConfigurationMap(bArr3, 0);
            java.lang.System.arraycopy(bArr3, 0, bArr, 0, 16);
            if (i4 < size - 1) {
                i = i3;
            } else {
                i = i3;
            }
            if (!org.bouncycastle.util.Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i4].getI()) || !org.bouncycastle.util.Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i4].getMasterSecret())) {
                org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters highSpeedVideoSizes = org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI.get(i4).getSigParameters(), highResolutionOutputSizeshNQ4ISI.get(i4).getOtsParameters(), (int) jArr[i4], bArr, bArr2);
                lMSPrivateKeyParametersArr[i4] = highSpeedVideoSizes;
                lMSSignatureArr[i] = org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(lMSPrivateKeyParametersArr[i], highSpeedVideoSizes.getPublicKey().getHighResolutionOutputSizeshNQ4ISI());
            } else if (z2) {
                i2 = i4 + 1;
            } else {
                lMSPrivateKeyParametersArr[i4] = org.bouncycastle.pqc.crypto.lms.LMS.getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI.get(i4).getSigParameters(), highResolutionOutputSizeshNQ4ISI.get(i4).getOtsParameters(), (int) jArr[i4], bArr, bArr2);
            }
            z = true;
            i2 = i4 + 1;
        }
        if (z) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    protected void updateHierarchy(org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, org.bouncycastle.pqc.crypto.lms.LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    public int hashCode() {
        int i = this.getInputSizeshNQ4ISI;
        boolean z = this.getHighSpeedVideoFpsRangesFor;
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = this.getOutputMinFrameDuration.hashCode();
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.getHighSpeedVideoFpsRanges;
        return (((((((((i * 31) + (z ? 1 : 0)) * 31) + hashCode) * 31) + hashCode2) * 31) + i2) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.getHighResolutionOutputSizeshNQ4ISI - this.getHighSpeedVideoFpsRanges;
    }

    final java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> Camera2StreamConfigurationMap() {
        java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> list;
        synchronized (this) {
            list = this.getOutputMinFrameDuration;
        }
        return list;
    }

    public org.bouncycastle.pqc.crypto.lms.LMSParameters[] getLMSParameters() {
        org.bouncycastle.pqc.crypto.lms.LMSParameters[] lMSParametersArr;
        synchronized (this) {
            int size = this.Camera2StreamConfigurationMap.size();
            lMSParametersArr = new org.bouncycastle.pqc.crypto.lms.LMSParameters[size];
            for (int i = 0; i < size; i++) {
                org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters lMSPrivateKeyParameters = this.Camera2StreamConfigurationMap.get(i);
                lMSParametersArr[i] = new org.bouncycastle.pqc.crypto.lms.LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
            }
        }
        return lMSParametersArr;
    }

    public int getL() {
        return this.getInputSizeshNQ4ISI;
    }

    final java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> getHighResolutionOutputSizeshNQ4ISI() {
        java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> list;
        synchronized (this) {
            list = this.Camera2StreamConfigurationMap;
        }
        return list;
    }

    public long getIndex() {
        long j;
        synchronized (this) {
            j = this.getHighSpeedVideoFpsRanges;
        }
        return j;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        byte[] build;
        synchronized (this) {
            org.bouncycastle.pqc.crypto.lms.Composer bool = org.bouncycastle.pqc.crypto.lms.Composer.compose().u32str(0).u32str(this.getInputSizeshNQ4ISI).u64str(this.getHighSpeedVideoFpsRanges).u64str(this.getHighResolutionOutputSizeshNQ4ISI).bool(this.getHighSpeedVideoFpsRangesFor);
            java.util.Iterator<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                bool.bytes(it.next());
            }
            java.util.Iterator<org.bouncycastle.pqc.crypto.lms.LMSSignature> it2 = this.getOutputMinFrameDuration.iterator();
            while (it2.hasNext()) {
                bool.bytes(it2.next());
            }
            build = bool.build();
        }
        return build;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(org.bouncycastle.pqc.crypto.lms.LMSContext lMSContext) {
        try {
            return org.bouncycastle.pqc.crypto.lms.HSS.getHighSpeedVideoFpsRangesFor(getL(), lMSContext).getEncoded();
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode signature: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString(), e);
        }
    }

    public org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters extractKeyShard(int i) {
        org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters highSpeedVideoFpsRangesFor;
        synchronized (this) {
            long j = i;
            if (getUsagesRemaining() < j) {
                throw new java.lang.IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
            }
            long j2 = this.getHighSpeedVideoFpsRanges;
            long j3 = j + j2;
            this.getHighSpeedVideoFpsRanges = j3;
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(new org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters(this.getInputSizeshNQ4ISI, new java.util.ArrayList(getHighResolutionOutputSizeshNQ4ISI()), new java.util.ArrayList(Camera2StreamConfigurationMap()), j2, j3, true));
            getHighSpeedVideoFpsRangesFor();
        }
        return highSpeedVideoFpsRangesFor;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters = (org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) obj;
        if (this.getInputSizeshNQ4ISI == hSSPrivateKeyParameters.getInputSizeshNQ4ISI && this.getHighSpeedVideoFpsRangesFor == hSSPrivateKeyParameters.getHighSpeedVideoFpsRangesFor && this.getHighResolutionOutputSizeshNQ4ISI == hSSPrivateKeyParameters.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == hSSPrivateKeyParameters.getHighSpeedVideoFpsRanges && this.Camera2StreamConfigurationMap.equals(hSSPrivateKeyParameters.Camera2StreamConfigurationMap)) {
            return this.getOutputMinFrameDuration.equals(hSSPrivateKeyParameters.getOutputMinFrameDuration);
        }
        return false;
    }

    protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return getHighSpeedVideoFpsRangesFor(this);
    }

    private static org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters getHighSpeedVideoFpsRangesFor(org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException(e.getMessage(), e);
        }
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws java.io.IOException {
        org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.getOutputFormats = org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }

    public static org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters getInstance(java.lang.Object obj) throws java.io.IOException {
        java.io.DataInputStream dataInputStream;
        while (!(obj instanceof org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters)) {
            if (obj instanceof java.io.DataInputStream) {
                java.io.DataInputStream dataInputStream2 = (java.io.DataInputStream) obj;
                if (dataInputStream2.readInt() != 0) {
                    throw new java.lang.IllegalStateException("unknown version for hss private key");
                }
                int readInt = dataInputStream2.readInt();
                long readLong = dataInputStream2.readLong();
                long readLong2 = dataInputStream2.readLong();
                boolean readBoolean = dataInputStream2.readBoolean();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i = 0; i < readInt; i++) {
                    arrayList.add(org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters.getInstance(obj));
                }
                for (int i2 = 0; i2 < readInt - 1; i2++) {
                    arrayList2.add(org.bouncycastle.pqc.crypto.lms.LMSSignature.getHighSpeedVideoFpsRanges(obj));
                }
                return new org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters(readInt, arrayList, arrayList2, readLong, readLong2, readBoolean);
            }
            if (obj instanceof byte[]) {
                try {
                    dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream((byte[]) obj));
                    try {
                        org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream);
                        dataInputStream.close();
                        return hSSPrivateKeyParameters;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    dataInputStream = null;
                }
            } else {
                if (!(obj instanceof java.io.InputStream)) {
                    throw new java.lang.IllegalArgumentException("cannot parse ".concat(java.lang.String.valueOf(obj)));
                }
                obj = org.bouncycastle.util.io.Streams.readAll((java.io.InputStream) obj);
            }
        }
        return (org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters) obj;
    }

    private HSSPrivateKeyParameters(int i, java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> list, java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> list2, long j, long j2, boolean z) {
        super(true);
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getInputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(list);
        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(list2);
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public HSSPrivateKeyParameters(int i, java.util.List<org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters> list, java.util.List<org.bouncycastle.pqc.crypto.lms.LMSSignature> list2, long j, long j2) {
        super(true);
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getInputSizeshNQ4ISI = i;
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(list);
        this.getOutputMinFrameDuration = java.util.Collections.unmodifiableList(list2);
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getHighSpeedVideoFpsRangesFor = false;
        getHighSpeedVideoFpsRangesFor();
    }
}
