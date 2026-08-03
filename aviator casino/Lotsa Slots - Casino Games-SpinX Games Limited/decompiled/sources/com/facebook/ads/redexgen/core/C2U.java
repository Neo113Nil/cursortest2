package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2U, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2U implements com.facebook.ads.redexgen.core.CY, com.facebook.ads.redexgen.core.InterfaceC1617gP {
    public static byte[] A0A;
    public static java.lang.String[] A0B = {"IFN7jxPm5iUVHezzrmxS", "S0eu2eNSRgR", "zAFRaPaLH2briFok", "kmV", "0tQTfhSJ7", "pW9DdJxYDevwUXMYU", "23M9j", "tE9Nw4uJT9AR2sagm"};
    public final com.facebook.ads.redexgen.core.T8 A00;
    public final com.facebook.ads.redexgen.core.TP A01;
    public final com.facebook.ads.redexgen.core.InterfaceC1587fv A02;
    public final com.facebook.ads.redexgen.core.InterfaceC1618gQ A03;
    public final com.facebook.ads.redexgen.core.C1626gY A04;
    public final com.facebook.ads.redexgen.core.InterfaceC1627gZ A05;
    public final java.lang.String A06;
    public final java.util.Map<com.facebook.ads.redexgen.core.EnumC1613gL, com.facebook.ads.redexgen.core.C0614Cb> A09 = new java.util.HashMap();
    public final java.util.Map<com.facebook.ads.redexgen.core.EnumC1613gL, com.facebook.ads.redexgen.core.AbstractC03772d> A08 = new java.util.HashMap();
    public final java.util.List<com.facebook.ads.redexgen.core.InterfaceC1631gd> A07 = new java.util.ArrayList();

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A04() throws java.lang.Throwable {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        java.util.HashMap hashMap4 = new java.util.HashMap();
        synchronized (this) {
            for (com.facebook.ads.redexgen.core.C0614Cb c0614Cb : this.A09.values()) {
                if (c0614Cb.AAe()) {
                    hashMap.put(c0614Cb, com.facebook.ads.redexgen.core.EnumC1634gg.A05);
                } else {
                    hashMap.put(c0614Cb, com.facebook.ads.redexgen.core.EnumC1634gg.A04);
                }
            }
            new java.util.concurrent.atomic.AtomicReference();
            new java.util.concurrent.atomic.AtomicReference();
            java.util.Iterator<com.facebook.ads.redexgen.core.AbstractC03772d> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                com.facebook.ads.redexgen.core.InterfaceC1612gK interfaceC1612gK = null;
                if (interfaceC1612gK.AAe()) {
                    throw new java.lang.NullPointerException(A01(349, 20, 51));
                }
            }
            java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1631gd> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new java.lang.NullPointerException(A01(424, 22, 120));
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        java.util.concurrent.atomic.AtomicReference atomicReference2 = new java.util.concurrent.atomic.AtomicReference();
        org.json.JSONObject A03 = A03(hashMap, hashMap2, hashMap3, hashMap4);
        java.lang.String.format(java.util.Locale.US, A01(188, 33, 57), this.A06, A03.toString(2));
        this.A02.AGy(this.A06, (A01(327, 8, 121) + java.net.URLEncoder.encode(A03.toString())).getBytes(), new com.facebook.ads.redexgen.core.CN(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((java.lang.Throwable) atomicReference2.get());
            }
            java.util.Set<com.facebook.ads.redexgen.core.InterfaceC1630gc> A02 = A02((org.json.JSONObject) atomicReference.get());
            java.util.HashMap hashMap5 = new java.util.HashMap();
            java.util.HashMap hashMap6 = new java.util.HashMap();
            java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1630gc> it3 = A02.iterator();
            while (it3.hasNext()) {
                it3.next().A4D(hashMap5, hashMap6);
            }
            this.A03.A6b(A00((org.json.JSONObject) atomicReference.get()));
            java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1631gd> it4 = this.A07.iterator();
            if (it4.hasNext()) {
                it4.next();
                throw new java.lang.NullPointerException(A01(401, 23, 20));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{102, -81, -71, 102, -72, -85, -71, -70, -72, -81, -87, -70, -85, -86, 116, 102, -103, -79, -81, -74, -74, -81, -76, -83, 102, -71, -65, -76, -87, -43, 4, 4, -76, -3, 2, -76, -10, -11, -9, -1, -5, 6, 3, 9, 2, -8, -62, -67, -37, -24, -24, -23, -18, -102, -35, -20, -33, -37, -18, -33, -102, -19, -33, -20, -16, -33, -20, -102, -36, -17, -24, -34, -26, -33, -102, -15, -29, -18, -30, -102, -24, -23, -24, -89, -19, -33, -20, -16, -33, -20, -102, -23, -15, -24, -33, -34, -102, -36, -17, -24, -34, -26, -33, -102, -61, -66, 123, -104, -85, -104, 87, -89, -87, -90, -102, -100, -86, -86, -96, -91, -98, 87, -90, -89, -85, -96, -90, -91, 87, -118, -81, -73, -94, -83, -86, -91, 97, -77, -90, -89, -77, -90, -76, -87, 97, -75, -86, -82, -90, 123, 97, 102, -91, -34, -11, 7, -80, 3, -11, 2, 6, -11, 2, -67, -1, 7, -2, -11, -12, -80, -14, 5, -2, -12, -4, -11, -80, -13, 2, -11, -15, 4, -11, -12, -54, -80, -75, 3, -95, -57, -68, -79, -74, -64, -67, -68, -73, -56, -81, -62, -73, -67, -68, 110, -64, -77, -65, -61, -77, -63, -62, 110, -62, -67, 110, 115, -63, -120, 88, 115, -63, -34, 4, -7, -18, -13, -3, -6, -7, -12, 5, -20, -1, -12, -6, -7, -85, -3, -16, -2, -5, -6, -7, -2, -16, -59, -107, -80, -2, -43, -5, -16, -27, -22, -12, -15, -16, -21, -4, -29, -10, -21, -15, -16, -94, -12, -9, -16, -94, -24, -29, -21, -18, -25, -26, -67, -94, -24, -15, -12, -27, -21, -16, -23, -94, -21, -16, -94, -89, -26, -94, -11, -25, -27, -15, -16, -26, -11, -28, -9, -16, -26, -18, -25, -11, -61, -49, -50, -44, -59, -40, -44, 124, 121, -116, 121, -90, -87, -82, -89, -91, -78, -80, -78, -87, -82, -76, -2, -17, 7, -6, -3, -17, -14, -53, -116, Byte.MAX_VALUE, Byte.MIN_VALUE, -116, Byte.MAX_VALUE, -115, -126, -10, -23, -11, -7, -23, -9, -8, -70, -83, -71, -67, -79, -70, -83, -69, -101, -63, -74, -85, -119, -74, -84, -102, -83, -69, -83, -68, -69, -82, -68, -71, -72, -73, -68, -82, 0, -14, -1, 3, -14, -1, -36, 4, -5, -14, -15, -49, 2, -5, -15, -7, -14, -48, -1, -14, -18, 1, -14, -15, -100, -94, -105, -116, -111, -101, -104, -105, -110, -93, -118, -99, -110, -104, -105, 111, -110, -105, -110, -100, -111, -114, -115, 0, 6, -5, -16, -11, -1, -4, -5, -10, 7, -18, 1, -10, -4, -5, -32, 1, -18, -1, 1, -14, -15, -11, -30, -13, -24, -26, -11, -32, -13, -26, -25, -13, -26, -12, -23, -32, -12};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private synchronized void A08(java.lang.Throwable th) {
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1631gd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new java.util.HashMap();
            new java.util.HashMap();
            throw new java.lang.NullPointerException(A01(401, 23, 20));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.CY
    public final synchronized com.facebook.ads.redexgen.core.InterfaceC1612gK A5U(com.facebook.ads.redexgen.core.EnumC1613gL enumC1613gL) {
        if (enumC1613gL.A03() != com.facebook.ads.redexgen.core.EnumC1615gN.A04) {
            throw new java.lang.IllegalArgumentException(A01(47, 59, 101));
        }
        if (this.A09.containsKey(enumC1613gL)) {
            return this.A09.get(enumC1613gL);
        }
        com.facebook.ads.redexgen.core.C0614Cb c0614Cb = new com.facebook.ads.redexgen.core.C0614Cb(enumC1613gL);
        this.A09.put(enumC1613gL, c0614Cb);
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1631gd> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new java.lang.NullPointerException(A01(377, 24, 120));
        }
        java.lang.String.format(java.util.Locale.US, A01(153, 35, 123), enumC1613gL);
        return c0614Cb;
    }

    static {
        A05();
    }

    public C2U(com.facebook.ads.redexgen.core.T8 t8, com.facebook.ads.redexgen.core.TP tp, com.facebook.ads.redexgen.core.InterfaceC1587fv interfaceC1587fv, java.lang.String str, com.facebook.ads.redexgen.core.InterfaceC1627gZ interfaceC1627gZ, com.facebook.ads.redexgen.core.C1626gY c1626gY, com.facebook.ads.redexgen.core.InterfaceC1616gO interfaceC1616gO) {
        this.A00 = t8;
        this.A01 = tp;
        this.A02 = interfaceC1587fv;
        this.A06 = str;
        this.A05 = interfaceC1627gZ;
        this.A04 = c1626gY;
        this.A03 = interfaceC1616gO.A5E(this);
    }

    public static int A00(org.json.JSONObject jSONObject) throws org.json.JSONException {
        int time = jSONObject.getJSONObject(A01(335, 7, 5)).getInt(A01(446, 16, 108));
        if (time > 0) {
            return time;
        }
        throw new org.json.JSONException(java.lang.String.format(java.util.Locale.US, A01(129, 24, 44), java.lang.Integer.valueOf(time)));
    }

    private java.util.Set<com.facebook.ads.redexgen.core.InterfaceC1630gc> A02(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 52));
        org.json.JSONObject data = jSONObject.getJSONObject(A01(298, 7, 109));
        java.util.Iterator<com.facebook.ads.redexgen.core.C0614Cb> it = this.A09.values().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String[] strArr = A0B;
            if (strArr[6].length() == strArr[0].length()) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A0B;
            strArr2[1] = "GiFNWD8Qhge";
            strArr2[3] = "8JT";
            if (hasNext) {
                final com.facebook.ads.redexgen.core.C0614Cb next = it.next();
                switch (com.facebook.ads.redexgen.core.C1629gb.A01[com.facebook.ads.redexgen.core.EnumC1635gh.A00(jSONObject2.getString(next.A8F().A04())).ordinal()]) {
                    case 1:
                        final org.json.JSONObject fingerprint = data.getJSONObject(next.A8F().A04()).getJSONObject(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, 4, 3));
                        final org.json.JSONObject responseObject = data.getJSONObject(next.A8F().A04()).optJSONObject(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 11, 43));
                        hashSet.add(new com.facebook.ads.redexgen.core.CL(next, fingerprint, responseObject) { // from class: com.facebook.ads.redexgen.X.2X
                            public final org.json.JSONObject A00;
                            public final org.json.JSONObject A01;

                            {
                                com.facebook.ads.redexgen.core.EnumC1635gh enumC1635gh = com.facebook.ads.redexgen.core.EnumC1635gh.A03;
                                this.A00 = fingerprint;
                                this.A01 = responseObject;
                            }

                            @Override // com.facebook.ads.redexgen.core.CL, com.facebook.ads.redexgen.core.InterfaceC1630gc
                            public final void A4D(java.util.Map<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1635gh> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1622gU> map2) {
                                super.A00.A03(this.A00, this.A01);
                                super.A4D(map, map2);
                            }
                        });
                        break;
                    case 2:
                        hashSet.add(new com.facebook.ads.redexgen.core.CL(next) { // from class: com.facebook.ads.redexgen.X.2W
                            {
                                com.facebook.ads.redexgen.core.EnumC1635gh enumC1635gh = com.facebook.ads.redexgen.core.EnumC1635gh.A04;
                            }
                        });
                        break;
                    default:
                        throw new java.lang.AssertionError();
                }
            } else {
                java.util.Iterator<com.facebook.ads.redexgen.core.AbstractC03772d> it2 = this.A08.values().iterator();
                while (it2.hasNext()) {
                    it2.next();
                    final com.facebook.ads.redexgen.core.AbstractC03772d abstractC03772d = null;
                    switch (com.facebook.ads.redexgen.core.C1629gb.A00[com.facebook.ads.redexgen.core.EnumC1622gU.A00(jSONObject2.getString(abstractC03772d.A8F().A04())).ordinal()]) {
                        case 1:
                            hashSet.add(new com.facebook.ads.redexgen.core.CM(abstractC03772d) { // from class: com.facebook.ads.redexgen.X.2b
                                {
                                    com.facebook.ads.redexgen.core.EnumC1622gU enumC1622gU = com.facebook.ads.redexgen.core.EnumC1622gU.A03;
                                }
                            });
                            break;
                        case 2:
                            hashSet.add(new com.facebook.ads.redexgen.core.CM(abstractC03772d) { // from class: com.facebook.ads.redexgen.X.2V
                                public static byte[] A00;

                                static {
                                    A01();
                                }

                                public static java.lang.String A00(int i, int i2, int i3) {
                                    byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
                                    for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                                        copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_AUTHENTICATION_EXPIRED);
                                    }
                                    return new java.lang.String(copyOfRange);
                                }

                                public static void A01() {
                                    A00 = new byte[]{48, 34, 49, com.google.common.base.Ascii.SI, 34, 46, 50, 38, 47, 34, 48, com.google.common.base.Ascii.DLE, 54, 43, 32};
                                }

                                {
                                    com.facebook.ads.redexgen.core.EnumC1622gU enumC1622gU = com.facebook.ads.redexgen.core.EnumC1622gU.A04;
                                }

                                @Override // com.facebook.ads.redexgen.core.CM, com.facebook.ads.redexgen.core.InterfaceC1630gc
                                public final void A4D(java.util.Map<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1635gh> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1622gU> map2) {
                                    throw new java.lang.NullPointerException(A00(0, 15, 87));
                                }
                            });
                            break;
                        default:
                            throw new java.lang.AssertionError();
                    }
                }
                return hashSet;
            }
        }
    }

    private org.json.JSONObject A03(java.util.Map<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1634gg> map, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1621gT> map2, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, org.json.JSONObject> clientBundleData, java.util.Map<com.facebook.ads.sync.SyncModifiableBundle, org.json.JSONObject> clientBundleFingerprint) throws org.json.JSONException {
        java.lang.String A01;
        org.json.JSONObject syncRequest = new org.json.JSONObject();
        for (java.util.Map.Entry<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1634gg> entry : map.entrySet()) {
            syncRequest.put(entry.getKey().A8F().A04(), entry.getValue().A03());
        }
        for (java.util.Map.Entry<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1621gT> entry2 : map2.entrySet()) {
            entry2.getKey();
            com.facebook.ads.redexgen.core.InterfaceC1612gK interfaceC1612gK = null;
            java.lang.String A04 = interfaceC1612gK.A8F().A04();
            java.lang.String A03 = entry2.getValue().A03();
            java.lang.String[] strArr = A0B;
            if (strArr[1].length() == strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A0B[4] = "GjL9vB6wh";
            syncRequest.put(A04, A03);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.Iterator<java.util.Map.Entry<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1634gg>> it = map.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            A01 = A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, 11, 43);
            if (!hasNext) {
                break;
            }
            java.util.Map.Entry<com.facebook.ads.redexgen.core.InterfaceC1612gK, com.facebook.ads.redexgen.core.EnumC1634gg> next = it.next();
            if (next.getValue() == com.facebook.ads.redexgen.core.EnumC1634gg.A05) {
                org.json.JSONObject updateData = new org.json.JSONObject();
                com.facebook.ads.redexgen.core.InterfaceC1612gK key = next.getKey();
                jSONObject.put(key.A8F().A04(), updateData);
                if (next.getKey().A8F().A05()) {
                    org.json.JSONObject request = key.A88();
                    updateData.put(A01, request);
                } else {
                    updateData.put(A01, org.json.JSONObject.NULL);
                }
                com.facebook.ads.redexgen.core.EnumC1613gL A8F = key.A8F();
                java.lang.String[] strArr2 = A0B;
                if (strArr2[7].length() != strArr2[2].length()) {
                    java.lang.String[] strArr3 = A0B;
                    strArr3[1] = "cfjTgROdu8b";
                    strArr3[3] = "qIs";
                    jSONObject.put(A8F.A04(), updateData);
                } else {
                    A0B[4] = "vaTQWmMwm";
                    jSONObject.put(A8F.A04(), updateData);
                }
            }
        }
        for (java.util.Map.Entry<com.facebook.ads.sync.SyncModifiableBundle, com.facebook.ads.redexgen.core.EnumC1621gT> entry3 : map2.entrySet()) {
            org.json.JSONObject updateData2 = new org.json.JSONObject();
            com.facebook.ads.redexgen.core.InterfaceC1612gK key2 = entry3.getKey();
            org.json.JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData2.put(A01, request2);
            if (entry3.getValue() == com.facebook.ads.redexgen.core.EnumC1621gT.A05) {
                java.lang.String A012 = A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE, 4, 3);
                org.json.JSONObject request3 = clientBundleData.get(key2);
                updateData2.put(A012, request3);
                jSONObject.put(key2.A8F().A04(), updateData2);
            } else {
                jSONObject.put(key2.A8F().A04(), updateData2);
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry4 : this.A05.A7z().entrySet()) {
            if (entry4.getValue() != null) {
                jSONObject2.put(entry4.getKey(), entry4.getValue());
            }
        }
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(A01(342, 7, 111), syncRequest);
        jSONObject3.put(A01(298, 7, 109), jSONObject);
        jSONObject3.put(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 7, 75), jSONObject2);
        return jSONObject3;
    }

    public static void A06(java.lang.String str, java.util.concurrent.atomic.AtomicReference<org.json.JSONObject> atomicReference, java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> atomicReference2) {
        java.lang.String.format(java.util.Locale.US, A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 28, 118), str);
        try {
            atomicReference.set((org.json.JSONObject) new org.json.JSONTokener(str).nextValue());
        } catch (java.lang.ClassCastException | org.json.JSONException e) {
            atomicReference2.set(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CY, com.facebook.ads.redexgen.core.TE
    public final void A6d() {
        this.A03.A6c();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1617gP
    public final void AIo() {
        if (this.A01.AAh()) {
            java.lang.String str = A01(106, 23, 34) + this.A01.A7k().A07() + A01(0, 29, 49);
            A08(new com.facebook.ads.redexgen.core.C1633gf());
            return;
        }
        try {
            if (!com.facebook.ads.redexgen.core.C1086Up.A27(this.A00) || this.A00.A04().AAU()) {
                A04();
                return;
            }
            throw new java.lang.IllegalStateException(A01(29, 18, 127));
        } catch (java.lang.Throwable th) {
            java.lang.String.format(java.util.Locale.US, A01(249, 49, 109), java.lang.Integer.valueOf(this.A04.A01()));
            A08(th);
            this.A03.A6b(this.A04.A01());
        }
    }
}
