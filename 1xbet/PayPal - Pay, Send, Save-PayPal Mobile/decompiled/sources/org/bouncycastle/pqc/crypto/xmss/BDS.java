package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
public final class BDS implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private java.util.Map<java.lang.Integer, org.bouncycastle.pqc.crypto.xmss.XMSSNode> Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    private java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> getHighSpeedVideoSizes;
    private org.bouncycastle.pqc.crypto.xmss.XMSSNode getHighSpeedVideoSizesFor;
    private final java.util.List<org.bouncycastle.pqc.crypto.xmss.BDSTreeHash> getInputFormats;
    private java.util.Map<java.lang.Integer, java.util.LinkedList<org.bouncycastle.pqc.crypto.xmss.XMSSNode>> getInputSizeshNQ4ISI;
    private java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> getOutputFormats;
    private transient int getOutputMinFrameDuration;
    private transient org.bouncycastle.pqc.crypto.xmss.WOTSPlus getOutputSizes;
    private final int getOutputStallDurationlomOqCM;

    BDS(org.bouncycastle.pqc.crypto.xmss.BDS bds) {
        this.getOutputSizes = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(bds.getOutputSizes.getHighSpeedVideoFpsRanges);
        this.getOutputStallDurationlomOqCM = bds.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoFpsRanges = bds.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = bds.getHighSpeedVideoSizesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = arrayList;
        arrayList.addAll(bds.getHighSpeedVideoSizes);
        this.getInputSizeshNQ4ISI = new java.util.TreeMap();
        for (java.lang.Integer num : bds.getInputSizeshNQ4ISI.keySet()) {
            this.getInputSizeshNQ4ISI.put(num, (java.util.LinkedList) bds.getInputSizeshNQ4ISI.get(num).clone());
        }
        java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> stack = new java.util.Stack<>();
        this.getOutputFormats = stack;
        stack.addAll(bds.getOutputFormats);
        this.getInputFormats = new java.util.ArrayList();
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.BDSTreeHash> it = bds.getInputFormats.iterator();
        while (it.hasNext()) {
            this.getInputFormats.add(it.next().clone());
        }
        this.Camera2StreamConfigurationMap = new java.util.TreeMap(bds.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = bds.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = bds.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = bds.getHighSpeedVideoFpsRangesFor;
    }

    private BDS(org.bouncycastle.pqc.crypto.xmss.BDS bds, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        this.getOutputSizes = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(bds.getOutputSizes.getHighSpeedVideoFpsRanges);
        this.getOutputStallDurationlomOqCM = bds.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoFpsRanges = bds.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = bds.getHighSpeedVideoSizesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = arrayList;
        arrayList.addAll(bds.getHighSpeedVideoSizes);
        this.getInputSizeshNQ4ISI = new java.util.TreeMap();
        for (java.lang.Integer num : bds.getInputSizeshNQ4ISI.keySet()) {
            this.getInputSizeshNQ4ISI.put(num, (java.util.LinkedList) bds.getInputSizeshNQ4ISI.get(num).clone());
        }
        java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> stack = new java.util.Stack<>();
        this.getOutputFormats = stack;
        stack.addAll(bds.getOutputFormats);
        this.getInputFormats = new java.util.ArrayList();
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.BDSTreeHash> it = bds.getInputFormats.iterator();
        while (it.hasNext()) {
            this.getInputFormats.add(it.next().clone());
        }
        this.Camera2StreamConfigurationMap = new java.util.TreeMap(bds.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = bds.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = bds.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = false;
        getHighSpeedVideoFpsRanges(bArr, bArr2, oTSHashAddress);
    }

    BDS(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters, int i, int i2) {
        this(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap), xMSSParameters.getHeight(), xMSSParameters.getHighSpeedVideoFpsRanges, i2);
        this.getOutputMinFrameDuration = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRangesFor = true;
    }

    BDS(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        this(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap), xMSSParameters.getHeight(), xMSSParameters.getHighSpeedVideoFpsRanges, (1 << xMSSParameters.getHeight()) - 1);
        Camera2StreamConfigurationMap(bArr, bArr2, oTSHashAddress);
    }

    BDS(org.bouncycastle.pqc.crypto.xmss.XMSSParameters xMSSParameters, byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress, int i) {
        this(new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(xMSSParameters.Camera2StreamConfigurationMap), xMSSParameters.getHeight(), xMSSParameters.getHighSpeedVideoFpsRanges, (1 << xMSSParameters.getHeight()) - 1);
        Camera2StreamConfigurationMap(bArr, bArr2, oTSHashAddress);
        while (this.getHighResolutionOutputSizeshNQ4ISI < i) {
            getHighSpeedVideoFpsRanges(bArr, bArr2, oTSHashAddress);
            this.getHighSpeedVideoFpsRangesFor = false;
        }
    }

    private org.bouncycastle.pqc.crypto.xmss.BDSTreeHash Camera2StreamConfigurationMap() {
        org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash = null;
        for (org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash2 : this.getInputFormats) {
            if (!bDSTreeHash2.Camera2StreamConfigurationMap && bDSTreeHash2.getHighResolutionOutputSizeshNQ4ISI) {
                if (bDSTreeHash != null) {
                    int i = Integer.MAX_VALUE;
                    if (((!bDSTreeHash2.getHighResolutionOutputSizeshNQ4ISI || bDSTreeHash2.Camera2StreamConfigurationMap) ? Integer.MAX_VALUE : bDSTreeHash2.getHighSpeedVideoSizes) >= ((!bDSTreeHash.getHighResolutionOutputSizeshNQ4ISI || bDSTreeHash.Camera2StreamConfigurationMap) ? Integer.MAX_VALUE : bDSTreeHash.getHighSpeedVideoSizes)) {
                        int i2 = (!bDSTreeHash2.getHighResolutionOutputSizeshNQ4ISI || bDSTreeHash2.Camera2StreamConfigurationMap) ? Integer.MAX_VALUE : bDSTreeHash2.getHighSpeedVideoSizes;
                        if (bDSTreeHash.getHighResolutionOutputSizeshNQ4ISI && !bDSTreeHash.Camera2StreamConfigurationMap) {
                            i = bDSTreeHash.getHighSpeedVideoSizes;
                        }
                        if (i2 == i && bDSTreeHash2.getHighSpeedVideoFpsRangesFor < bDSTreeHash.getHighSpeedVideoFpsRangesFor) {
                        }
                    }
                }
                bDSTreeHash = bDSTreeHash2;
            }
        }
        return bDSTreeHash;
    }

    private void Camera2StreamConfigurationMap(byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        for (int i = 0; i < (1 << this.getOutputStallDurationlomOqCM); i++) {
            oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(i).withChainAddress(oTSHashAddress.Camera2StreamConfigurationMap).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = this.getOutputSizes;
            wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(bArr2, oTSHashAddress), bArr);
            org.bouncycastle.pqc.crypto.xmss.WOTSPlusPublicKeyParameters highSpeedVideoSizes = this.getOutputSizes.getHighSpeedVideoSizes(oTSHashAddress);
            lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(i).withTreeHeight(lTreeAddress.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(lTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(lTreeAddress.getKeyAndMask()).build();
            org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes2 = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(this.getOutputSizes, highSpeedVideoSizes, lTreeAddress);
            hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeIndex(i).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            while (!this.getOutputFormats.isEmpty() && this.getOutputFormats.peek().getHeight() == highSpeedVideoSizes2.getHeight()) {
                int height = i / (1 << highSpeedVideoSizes2.getHeight());
                if (height == 1) {
                    this.getHighSpeedVideoSizes.add(highSpeedVideoSizes2);
                }
                if (height == 3 && highSpeedVideoSizes2.getHeight() < this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRanges) {
                    org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash = this.getInputFormats.get(highSpeedVideoSizes2.getHeight());
                    bDSTreeHash.getHighSpeedVideoSizesFor = highSpeedVideoSizes2;
                    int height2 = highSpeedVideoSizes2.getHeight();
                    bDSTreeHash.getHighSpeedVideoSizes = height2;
                    if (height2 == bDSTreeHash.getHighSpeedVideoFpsRanges) {
                        bDSTreeHash.Camera2StreamConfigurationMap = true;
                    }
                }
                if (height >= 3 && (height & 1) == 1 && highSpeedVideoSizes2.getHeight() >= this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRanges && highSpeedVideoSizes2.getHeight() <= this.getOutputStallDurationlomOqCM - 2) {
                    if (this.getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(highSpeedVideoSizes2.getHeight())) == null) {
                        java.util.LinkedList<org.bouncycastle.pqc.crypto.xmss.XMSSNode> linkedList = new java.util.LinkedList<>();
                        linkedList.add(highSpeedVideoSizes2);
                        this.getInputSizeshNQ4ISI.put(java.lang.Integer.valueOf(highSpeedVideoSizes2.getHeight()), linkedList);
                    } else {
                        this.getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(highSpeedVideoSizes2.getHeight())).add(highSpeedVideoSizes2);
                    }
                }
                org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.getHighSpeedVideoFpsRangesFor).withTreeIndex((hashTreeAddress.getHighSpeedVideoSizes - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
                org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes3 = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(this.getOutputSizes, this.getOutputFormats.pop(), highSpeedVideoSizes2, hashTreeAddress2);
                org.bouncycastle.pqc.crypto.xmss.XMSSNode xMSSNode = new org.bouncycastle.pqc.crypto.xmss.XMSSNode(highSpeedVideoSizes3.getHeight() + 1, highSpeedVideoSizes3.getValue());
                hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.getHighSpeedVideoFpsRangesFor + 1).withTreeIndex(hashTreeAddress2.getHighSpeedVideoSizes).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                highSpeedVideoSizes2 = xMSSNode;
            }
            this.getOutputFormats.push(highSpeedVideoSizes2);
        }
        this.getHighSpeedVideoSizesFor = this.getOutputFormats.pop();
    }

    private void getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> list;
        org.bouncycastle.pqc.crypto.xmss.XMSSNode removeFirst;
        if (oTSHashAddress == null) {
            throw new java.lang.NullPointerException("otsHashAddress == null");
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalStateException("index already used");
        }
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i > this.getOutputMinFrameDuration - 1) {
            throw new java.lang.IllegalStateException("index out of bounds");
        }
        int calculateTau = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.calculateTau(i, this.getOutputStallDurationlomOqCM);
        if (((this.getHighResolutionOutputSizeshNQ4ISI >> (calculateTau + 1)) & 1) == 0 && calculateTau < this.getOutputStallDurationlomOqCM - 1) {
            this.Camera2StreamConfigurationMap.put(java.lang.Integer.valueOf(calculateTau), this.getHighSpeedVideoSizes.get(calculateTau));
        }
        org.bouncycastle.pqc.crypto.xmss.LTreeAddress lTreeAddress = (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        if (calculateTau == 0) {
            oTSHashAddress = (org.bouncycastle.pqc.crypto.xmss.OTSHashAddress) new org.bouncycastle.pqc.crypto.xmss.OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(this.getHighResolutionOutputSizeshNQ4ISI).withChainAddress(oTSHashAddress.Camera2StreamConfigurationMap).withHashAddress(oTSHashAddress.getHighResolutionOutputSizeshNQ4ISI).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus = this.getOutputSizes;
            wOTSPlus.getHighSpeedVideoFpsRanges(wOTSPlus.Camera2StreamConfigurationMap(bArr2, oTSHashAddress), bArr);
            this.getHighSpeedVideoSizes.set(0, org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(this.getOutputSizes, this.getOutputSizes.getHighSpeedVideoSizes(oTSHashAddress), (org.bouncycastle.pqc.crypto.xmss.LTreeAddress) new org.bouncycastle.pqc.crypto.xmss.LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(this.getHighResolutionOutputSizeshNQ4ISI).withTreeHeight(lTreeAddress.getHighResolutionOutputSizeshNQ4ISI).withTreeIndex(lTreeAddress.getHighSpeedVideoSizes).withKeyAndMask(lTreeAddress.getKeyAndMask()).build()));
        } else {
            int i2 = calculateTau - 1;
            org.bouncycastle.pqc.crypto.xmss.HashTreeAddress hashTreeAddress2 = (org.bouncycastle.pqc.crypto.xmss.HashTreeAddress) new org.bouncycastle.pqc.crypto.xmss.HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i2).withTreeIndex(this.getHighResolutionOutputSizeshNQ4ISI >> calculateTau).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus2 = this.getOutputSizes;
            wOTSPlus2.getHighSpeedVideoFpsRanges(wOTSPlus2.Camera2StreamConfigurationMap(bArr2, oTSHashAddress), bArr);
            org.bouncycastle.pqc.crypto.xmss.XMSSNode highSpeedVideoSizes = org.bouncycastle.pqc.crypto.xmss.XMSSNodeUtil.getHighSpeedVideoSizes(this.getOutputSizes, this.getHighSpeedVideoSizes.get(i2), this.Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(i2)), hashTreeAddress2);
            this.getHighSpeedVideoSizes.set(calculateTau, new org.bouncycastle.pqc.crypto.xmss.XMSSNode(highSpeedVideoSizes.getHeight() + 1, highSpeedVideoSizes.getValue()));
            this.Camera2StreamConfigurationMap.remove(java.lang.Integer.valueOf(i2));
            for (int i3 = 0; i3 < calculateTau; i3++) {
                if (i3 < this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRanges) {
                    list = this.getHighSpeedVideoSizes;
                    removeFirst = this.getInputFormats.get(i3).getHighSpeedVideoSizesFor;
                } else {
                    list = this.getHighSpeedVideoSizes;
                    removeFirst = this.getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(i3)).removeFirst();
                }
                list.set(i3, removeFirst);
            }
            int min = java.lang.Math.min(calculateTau, this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRanges);
            for (int i4 = 0; i4 < min; i4++) {
                int i5 = this.getHighResolutionOutputSizeshNQ4ISI + 1 + ((1 << i4) * 3);
                if (i5 < (1 << this.getOutputStallDurationlomOqCM)) {
                    org.bouncycastle.pqc.crypto.xmss.BDSTreeHash bDSTreeHash = this.getInputFormats.get(i4);
                    bDSTreeHash.getHighSpeedVideoSizesFor = null;
                    bDSTreeHash.getHighSpeedVideoSizes = bDSTreeHash.getHighSpeedVideoFpsRanges;
                    bDSTreeHash.getHighSpeedVideoFpsRangesFor = i5;
                    bDSTreeHash.getHighResolutionOutputSizeshNQ4ISI = true;
                    bDSTreeHash.Camera2StreamConfigurationMap = false;
                }
            }
        }
        for (int i6 = 0; i6 < ((this.getOutputStallDurationlomOqCM - this.getHighSpeedVideoFpsRanges) >> 1); i6++) {
            org.bouncycastle.pqc.crypto.xmss.BDSTreeHash Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap != null) {
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges(this.getOutputFormats, this.getOutputSizes, bArr, bArr2, oTSHashAddress);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI++;
    }

    public final org.bouncycastle.pqc.crypto.xmss.BDS withWOTSDigest(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new org.bouncycastle.pqc.crypto.xmss.BDS(this, aSN1ObjectIdentifier);
    }

    public final org.bouncycastle.pqc.crypto.xmss.BDS withMaxIndex(int i, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new org.bouncycastle.pqc.crypto.xmss.BDS(this, i, aSN1ObjectIdentifier);
    }

    protected final int getTreeHeight() {
        return this.getOutputStallDurationlomOqCM;
    }

    protected final org.bouncycastle.pqc.crypto.xmss.XMSSNode getRoot() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final org.bouncycastle.pqc.crypto.xmss.BDS getNextState(byte[] bArr, byte[] bArr2, org.bouncycastle.pqc.crypto.xmss.OTSHashAddress oTSHashAddress) {
        return new org.bouncycastle.pqc.crypto.xmss.BDS(this, bArr, bArr2, oTSHashAddress);
    }

    public final int getMaxIndex() {
        return this.getOutputMinFrameDuration;
    }

    protected final int getIndex() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    protected final java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode> getAuthenticationPath() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.XMSSNode> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.getOutputMinFrameDuration);
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.getHighSpeedVideoSizes == null) {
            throw new java.lang.IllegalStateException("authenticationPath == null");
        }
        if (this.getInputSizeshNQ4ISI == null) {
            throw new java.lang.IllegalStateException("retain == null");
        }
        if (this.getOutputFormats == null) {
            throw new java.lang.IllegalStateException("stack == null");
        }
        if (this.getInputFormats == null) {
            throw new java.lang.IllegalStateException("treeHashInstances == null");
        }
        if (this.Camera2StreamConfigurationMap == null) {
            throw new java.lang.IllegalStateException("keep == null");
        }
        if (!org.bouncycastle.pqc.crypto.xmss.XMSSUtil.isIndexValid(this.getOutputStallDurationlomOqCM, this.getHighResolutionOutputSizeshNQ4ISI)) {
            throw new java.lang.IllegalStateException("index in BDS state out of bounds");
        }
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.available() != 0 ? objectInputStream.readInt() : (1 << this.getOutputStallDurationlomOqCM) - 1;
        this.getOutputMinFrameDuration = readInt;
        if (readInt > (1 << this.getOutputStallDurationlomOqCM) - 1 || this.getHighResolutionOutputSizeshNQ4ISI > readInt + 1 || objectInputStream.available() != 0) {
            throw new java.io.IOException("inconsistent BDS data detected");
        }
    }

    private BDS(org.bouncycastle.pqc.crypto.xmss.WOTSPlus wOTSPlus, int i, int i2, int i3) {
        this.getOutputSizes = wOTSPlus;
        this.getOutputStallDurationlomOqCM = i;
        this.getOutputMinFrameDuration = i3;
        this.getHighSpeedVideoFpsRanges = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.getHighSpeedVideoSizes = new java.util.ArrayList();
                this.getInputSizeshNQ4ISI = new java.util.TreeMap();
                this.getOutputFormats = new java.util.Stack<>();
                this.getInputFormats = new java.util.ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.getInputFormats.add(new org.bouncycastle.pqc.crypto.xmss.BDSTreeHash(i5));
                }
                this.Camera2StreamConfigurationMap = new java.util.TreeMap();
                this.getHighResolutionOutputSizeshNQ4ISI = 0;
                this.getHighSpeedVideoFpsRangesFor = false;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("illegal value for BDS parameter k");
    }

    private BDS(org.bouncycastle.pqc.crypto.xmss.BDS bds, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getOutputSizes = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(new org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters(aSN1ObjectIdentifier));
        this.getOutputStallDurationlomOqCM = bds.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoFpsRanges = bds.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = bds.getHighSpeedVideoSizesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = arrayList;
        arrayList.addAll(bds.getHighSpeedVideoSizes);
        this.getInputSizeshNQ4ISI = new java.util.TreeMap();
        for (java.lang.Integer num : bds.getInputSizeshNQ4ISI.keySet()) {
            this.getInputSizeshNQ4ISI.put(num, (java.util.LinkedList) bds.getInputSizeshNQ4ISI.get(num).clone());
        }
        java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> stack = new java.util.Stack<>();
        this.getOutputFormats = stack;
        stack.addAll(bds.getOutputFormats);
        this.getInputFormats = new java.util.ArrayList();
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.BDSTreeHash> it = bds.getInputFormats.iterator();
        while (it.hasNext()) {
            this.getInputFormats.add(it.next().clone());
        }
        this.Camera2StreamConfigurationMap = new java.util.TreeMap(bds.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = bds.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = bds.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = bds.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRangesFor();
    }

    private BDS(org.bouncycastle.pqc.crypto.xmss.BDS bds, int i, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getOutputSizes = new org.bouncycastle.pqc.crypto.xmss.WOTSPlus(new org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters(aSN1ObjectIdentifier));
        this.getOutputStallDurationlomOqCM = bds.getOutputStallDurationlomOqCM;
        this.getHighSpeedVideoFpsRanges = bds.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizesFor = bds.getHighSpeedVideoSizesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = arrayList;
        arrayList.addAll(bds.getHighSpeedVideoSizes);
        this.getInputSizeshNQ4ISI = new java.util.TreeMap();
        for (java.lang.Integer num : bds.getInputSizeshNQ4ISI.keySet()) {
            this.getInputSizeshNQ4ISI.put(num, (java.util.LinkedList) bds.getInputSizeshNQ4ISI.get(num).clone());
        }
        java.util.Stack<org.bouncycastle.pqc.crypto.xmss.XMSSNode> stack = new java.util.Stack<>();
        this.getOutputFormats = stack;
        stack.addAll(bds.getOutputFormats);
        this.getInputFormats = new java.util.ArrayList();
        java.util.Iterator<org.bouncycastle.pqc.crypto.xmss.BDSTreeHash> it = bds.getInputFormats.iterator();
        while (it.hasNext()) {
            this.getInputFormats.add(it.next().clone());
        }
        this.Camera2StreamConfigurationMap = new java.util.TreeMap(bds.Camera2StreamConfigurationMap);
        this.getHighResolutionOutputSizeshNQ4ISI = bds.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputMinFrameDuration = i;
        this.getHighSpeedVideoFpsRangesFor = bds.getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRangesFor();
    }
}
