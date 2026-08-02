package com.payair.hce;

/* loaded from: classes4.dex */
public final class onCardProvisionCompleted {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] IccPrivateKeyCrtComponentsJson;
    private static char SdkCoreBusinessLogicModuleImpl;
    private static int getCiacDecline;
    private static int getPaymentFci;
    private final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
    private com.payair.hce.setPinIvCvc3Track2 DigitizedCardProfile = com.payair.hce.setMaximumPinTry.valueOf();
    private final com.payair.hce.transactionCanBeResumed RecordsJson;
    private final com.payair.hce.transactionCanBeResumed SdkCoreAlternateContactlessPaymentDataImpl;
    private final com.payair.hce.transactionCanBeResumed getAid;
    private final boolean getProfileVersion;
    private final com.payair.hce.getCacheDir valueOf;
    private final com.payair.hce.transactionCanBeResumed values;
    private final com.payair.hce.getCacheDir writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.transactionCanBeResumed values;
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i4 | i5;
        int i7 = ~i3;
        if ((i * (-919)) + (i2 * (-919)) + (((~(i6 | i3)) | (~(i5 | i7 | i))) * 920) + (((~i6) | (~(i4 | i7))) * 920) + (((~(i | i5 | i3)) | (~(i2 | i4 | i3)) | (~(i6 | i7))) * 920) != 1) {
            return values(objArr);
        }
        com.payair.hce.onCardProvisionCompleted oncardprovisioncompleted = (com.payair.hce.onCardProvisionCompleted) objArr[0];
        getCiacDecline = (getPaymentFci + 39) % 128;
        java.lang.String substring = oncardprovisioncompleted.values.writeReplace().substring(oncardprovisioncompleted.values.writeReplace().indexOf(68) + 8);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("㘓", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 1, (byte) ((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55), objArr2);
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(substring.replaceAll(((java.lang.String) objArr2[0]).intern(), "").getBytes());
        com.payair.hce.transactionCanBeResumed DigitizedCardProfile = com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(oncardprovisioncompleted.values.writeReplace().substring(0, oncardprovisioncompleted.values.writeReplace().indexOf(68) + 8).getBytes()));
        DigitizedCardProfile.writeReplace(oncardprovisioncompleted.writeReplace(oncardprovisioncompleted.valueOf, AlternateContactlessPaymentDataJson));
        if (DigitizedCardProfile.DigitizedCardProfile() % 2 != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(DigitizedCardProfile.AlternateContactlessPaymentDataJson());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            a("㘓", 1 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 54), objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            values = com.payair.hce.transactionCanBeResumed.values(sb.toString());
        } else {
            values = com.payair.hce.transactionCanBeResumed.values(DigitizedCardProfile.AlternateContactlessPaymentDataJson());
        }
        getCiacDecline = (getPaymentFci + 55) % 128;
        return values;
    }

    private static void b(short s, byte b, int i, java.lang.Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = (s * 8) + 65;
        int i3 = b + 4;
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + (-i3);
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            } else {
                i2 += -bArr[i7];
                i3 = i7;
                i5 = i6;
            }
        }
    }

    public onCardProvisionCompleted(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.getCacheDir getcachedir, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.getCacheDir getcachedir2, com.payair.hce.transactionCanBeResumed transactioncanberesumed3, com.payair.hce.transactionCanBeResumed transactioncanberesumed4, com.payair.hce.transactionCanBeResumed transactioncanberesumed5, boolean z) {
        this.AlternateContactlessPaymentDataJson = transactioncanberesumed;
        this.writeReplace = getcachedir;
        this.values = transactioncanberesumed2;
        this.valueOf = getcachedir2;
        this.SdkCoreAlternateContactlessPaymentDataImpl = transactioncanberesumed3;
        this.getAid = transactioncanberesumed4;
        this.RecordsJson = transactioncanberesumed5;
        this.getProfileVersion = z;
    }

    public final com.payair.hce.transactionCanBeResumed DigitizedCardProfile() {
        getPaymentFci = (getCiacDecline + 9) % 128;
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson().substring(0, this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson().lastIndexOf(94) + 8).getBytes());
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson2 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(AlternateContactlessPaymentDataJson).writeReplace(writeReplace(this.writeReplace, com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson().substring(this.AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson().lastIndexOf(94) + 8).getBytes()))).AlternateContactlessPaymentDataJson().getBytes());
        getPaymentFci = (getCiacDecline + 89) % 128;
        return AlternateContactlessPaymentDataJson2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a0, code lost:
    
        AlternateContactlessPaymentDataJson(r8, writeReplace(r6.SdkCoreAlternateContactlessPaymentDataImpl, AlternateContactlessPaymentDataJson((com.payair.hce.transactionCanBeResumed) com.payair.hce.getCacheDir.values(new java.lang.Object[]{r7}, -622902962, 622902962, java.lang.System.identityHashCode(r7)))), r7);
        AlternateContactlessPaymentDataJson(r7, r0, r8);
        values(r7, r8);
        writeReplace(r7, r3, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c4, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009a, code lost:
    
        r3 = (r0 + 5) % 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        r7 = com.payair.hce.onCardProvisionCompleted.getPaymentFci + 83;
        com.payair.hce.onCardProvisionCompleted.getCiacDecline = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if ((r7 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        return com.payair.hce.transactionCanBeResumed.writeReplace(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        return com.payair.hce.transactionCanBeResumed.writeReplace(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r8.DigitizedCardProfile() < ((AlternateContactlessPaymentDataJson((com.payair.hce.transactionCanBeResumed) com.payair.hce.getCacheDir.values(new java.lang.Object[]{r7}, -622902962, 622902962, java.lang.System.identityHashCode(r7))) + AlternateContactlessPaymentDataJson(r7.valueOf())) + 1)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r8.DigitizedCardProfile() < (AlternateContactlessPaymentDataJson((com.payair.hce.transactionCanBeResumed) com.payair.hce.getCacheDir.values(new java.lang.Object[]{r7}, -622902962, 622902962, java.lang.System.identityHashCode(r7))) + AlternateContactlessPaymentDataJson(r7.valueOf()))) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006e, code lost:
    
        r0 = AlternateContactlessPaymentDataJson(r7.valueOf()) - java.lang.Integer.parseInt(r7.AlternateContactlessPaymentDataJson().writeReplace(), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0087, code lost:
    
        if (r6.getProfileVersion == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0089, code lost:
    
        r3 = com.payair.hce.onCardProvisionCompleted.getCiacDecline + 5;
        com.payair.hce.onCardProvisionCompleted.getPaymentFci = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0093, code lost:
    
        if ((r3 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0095, code lost:
    
        r3 = (r0 >> 3) << 53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.payair.hce.transactionCanBeResumed writeReplace(com.payair.hce.getCacheDir getcachedir, com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        int i = getPaymentFci + 109;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
        }
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.getCacheDir getcachedir) {
        getPaymentFci = (getCiacDecline + 49) % 128;
        try {
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson((com.payair.hce.transactionCanBeResumed) com.payair.hce.getCacheDir.values(new java.lang.Object[]{getcachedir}, -622902962, 622902962, java.lang.System.identityHashCode(getcachedir)), transactioncanberesumed.DigitizedCardProfile());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            while (i < AlternateContactlessPaymentDataJson.DigitizedCardProfile()) {
                getCiacDecline = (getPaymentFci + 79) % 128;
                if (AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(i) == ((com.payair.hce.transactionCanBeResumed) com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{'1'}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(1) && arrayList.size() < transactioncanberesumed2.DigitizedCardProfile()) {
                    arrayList.add(java.lang.Integer.valueOf(i));
                }
                i++;
                getCiacDecline = (getPaymentFci + 89) % 128;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                transactioncanberesumed.DigitizedCardProfile(((java.lang.Integer) arrayList.get(i2)).intValue(), transactioncanberesumed2.AlternateContactlessPaymentDataJson(i2));
            }
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            android.widget.ExpandableListView.getPackedPositionType(0L);
            android.view.ViewConfiguration.getMaximumFlingVelocity();
        }
    }

    private void AlternateContactlessPaymentDataJson(com.payair.hce.getCacheDir getcachedir, int i, com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson;
        getCiacDecline = (getPaymentFci + 83) % 128;
        long parseLong = (long) (java.lang.Long.parseLong(this.RecordsJson.writeReplace()) % java.lang.Math.pow(10.0d, i));
        int length = java.lang.String.valueOf(parseLong).length();
        if (length < i) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\t\u0002", android.text.TextUtils.getOffsetAfter("", 0) + 2, (byte) (27 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
            sb.append(i - length);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("\u0002\f㘔", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 3, (byte) (android.text.TextUtils.indexOf("", "", 0) + 43), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.lang.String.format(sb.toString(), 0, java.lang.String.valueOf(parseLong)).getBytes());
            int i2 = getCiacDecline + 55;
            getPaymentFci = i2 % 128;
            int i3 = i2 % 2;
        } else {
            AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(java.lang.String.valueOf(parseLong).getBytes());
        }
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, transactioncanberesumed, AlternateContactlessPaymentDataJson, getcachedir}, 2099383804, -2099383804, java.lang.System.identityHashCode(this));
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = 0;
        com.payair.hce.onCardProvisionCompleted oncardprovisioncompleted = (com.payair.hce.onCardProvisionCompleted) objArr[0];
        com.payair.hce.transactionCanBeResumed transactioncanberesumed = (com.payair.hce.transactionCanBeResumed) objArr[1];
        com.payair.hce.transactionCanBeResumed transactioncanberesumed2 = (com.payair.hce.transactionCanBeResumed) objArr[2];
        try {
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(((com.payair.hce.getCacheDir) objArr[3]).valueOf(), transactioncanberesumed.DigitizedCardProfile());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int DigitizedCardProfile = AlternateContactlessPaymentDataJson.DigitizedCardProfile() - 1;
            while (DigitizedCardProfile >= 0) {
                if (AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(DigitizedCardProfile) == ((com.payair.hce.transactionCanBeResumed) com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{'1'}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(1) && arrayList.size() < transactioncanberesumed2.DigitizedCardProfile()) {
                    int i2 = getCiacDecline + 39;
                    getPaymentFci = i2 % 128;
                    if (i2 % 2 != 0) {
                        arrayList.add(java.lang.Integer.valueOf(DigitizedCardProfile));
                        throw new java.lang.ArithmeticException();
                    }
                    arrayList.add(java.lang.Integer.valueOf(DigitizedCardProfile));
                }
                DigitizedCardProfile--;
                getPaymentFci = (getCiacDecline + 113) % 128;
            }
            while (i < arrayList.size()) {
                int i3 = getPaymentFci + 99;
                getCiacDecline = i3 % 128;
                if (i3 % 2 == 0) {
                    transactioncanberesumed.DigitizedCardProfile(((java.lang.Integer) arrayList.get(arrayList.size() - i)).intValue(), transactioncanberesumed2.AlternateContactlessPaymentDataJson(i));
                    i += 70;
                } else {
                    transactioncanberesumed.DigitizedCardProfile(((java.lang.Integer) arrayList.get((arrayList.size() - 1) - i)).intValue(), transactioncanberesumed2.AlternateContactlessPaymentDataJson(i));
                    i++;
                }
            }
            return null;
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = oncardprovisioncompleted.DigitizedCardProfile;
            android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            return null;
        }
    }

    private void values(com.payair.hce.getCacheDir getcachedir, com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        byte parseByte;
        int i = getPaymentFci + 17;
        getCiacDecline = i % 128;
        if (i % 2 == 0) {
            parseByte = java.lang.Byte.parseByte(getcachedir.AlternateContactlessPaymentDataJson().writeReplace(), 77);
            if (parseByte == 0) {
                return;
            }
        } else {
            parseByte = java.lang.Byte.parseByte(getcachedir.AlternateContactlessPaymentDataJson().writeReplace(), 16);
            if (parseByte == 0) {
                return;
            }
        }
        DigitizedCardProfile(transactioncanberesumed, writeReplace(this.getAid, parseByte), getcachedir);
        getCiacDecline = (getPaymentFci + 69) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void DigitizedCardProfile(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.getCacheDir getcachedir) {
        try {
            com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = AlternateContactlessPaymentDataJson(getcachedir.valueOf(), transactioncanberesumed.DigitizedCardProfile());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i = 0;
            while (i < AlternateContactlessPaymentDataJson.DigitizedCardProfile()) {
                int i2 = getCiacDecline + 25;
                getPaymentFci = i2 % 128;
                if (i2 % 2 != 0) {
                    if (AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(i) != ((com.payair.hce.transactionCanBeResumed) com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{' '}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(1)) {
                        i++;
                        getPaymentFci = (getCiacDecline + 83) % 128;
                    }
                    if (arrayList.size() >= transactioncanberesumed2.DigitizedCardProfile()) {
                        getPaymentFci = (getCiacDecline + 73) % 128;
                        arrayList.add(java.lang.Integer.valueOf(i));
                    }
                    i++;
                    getPaymentFci = (getCiacDecline + 83) % 128;
                } else {
                    if (AlternateContactlessPaymentDataJson.AlternateContactlessPaymentDataJson(i) != ((com.payair.hce.transactionCanBeResumed) com.payair.hce.transactionCanBeResumed.DigitizedCardProfile(new java.lang.Object[]{'1'}, -1858812647, 1858812649, (int) java.lang.System.currentTimeMillis())).AlternateContactlessPaymentDataJson(1)) {
                        i++;
                        getPaymentFci = (getCiacDecline + 83) % 128;
                    }
                    if (arrayList.size() >= transactioncanberesumed2.DigitizedCardProfile()) {
                    }
                    i++;
                    getPaymentFci = (getCiacDecline + 83) % 128;
                }
            }
            getCiacDecline = (getPaymentFci + 79) % 128;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                transactioncanberesumed.DigitizedCardProfile(((java.lang.Integer) arrayList.get(i3)).intValue(), transactioncanberesumed2.AlternateContactlessPaymentDataJson(i3));
            }
        } catch (com.payair.hce.postToastMessageOnUi unused) {
            android.view.ViewConfiguration.getMinimumFlingVelocity();
            android.widget.ExpandableListView.getPackedPositionGroup(0L);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v9 int, still in use, count: 2, list:
          (r0v9 int) from 0x0018: ARITH (r0v9 int) << (1 int) A[WRAPPED]
          (r0v9 int) from 0x0039: PHI (r0v5 int) = (r0v4 int), (r0v9 int) binds: [B:12:0x0037, B:4:0x0020] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private static void writeReplace(com.payair.hce.getCacheDir r4, int r5, com.payair.hce.transactionCanBeResumed r6) {
        /*
            int r0 = com.payair.hce.onCardProvisionCompleted.getCiacDecline
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.payair.hce.onCardProvisionCompleted.getPaymentFci = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L23
            com.payair.hce.transactionCanBeResumed r0 = r4.valueOf()
            int r0 = r0.DigitizedCardProfile()
            com.payair.hce.transactionCanBeResumed r1 = r4.valueOf()
            int r2 = r0 << 1
            byte r1 = r1.AlternateContactlessPaymentDataJson(r2)
            r1 = r1 & 1
            if (r1 != 0) goto L79
            goto L39
        L23:
            com.payair.hce.transactionCanBeResumed r0 = r4.valueOf()
            int r0 = r0.DigitizedCardProfile()
            com.payair.hce.transactionCanBeResumed r1 = r4.valueOf()
            int r2 = r0 + (-1)
            byte r1 = r1.AlternateContactlessPaymentDataJson(r2)
            r1 = r1 & 1
            if (r1 != 0) goto L79
        L39:
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            r2 = 622902962(0x2520beb2, float:1.3942398E-16)
            int r4 = java.lang.System.identityHashCode(r4)
            r3 = -622902962(0xffffffffdadf414e, float:-3.1420362E16)
            java.lang.Object r4 = com.payair.hce.getCacheDir.values(r1, r3, r2, r4)
            com.payair.hce.transactionCanBeResumed r4 = (com.payair.hce.transactionCanBeResumed) r4
            int r0 = r0 + (-1)
            byte r4 = r4.AlternateContactlessPaymentDataJson(r0)
            r4 = r4 & 1
            if (r4 != 0) goto L79
            int r4 = com.payair.hce.onCardProvisionCompleted.getCiacDecline
            int r4 = r4 + 73
            int r4 = r4 % 128
            com.payair.hce.onCardProvisionCompleted.getPaymentFci = r4
            java.lang.String r4 = java.lang.String.valueOf(r5)
            byte[] r4 = r4.getBytes()
            com.payair.hce.transactionCanBeResumed r4 = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(r4)
            int r5 = r6.DigitizedCardProfile()
            int r5 = r5 + (-1)
            r0 = 0
            byte r4 = r4.AlternateContactlessPaymentDataJson(r0)
            r6.DigitizedCardProfile(r5, r4)
        L79:
            int r4 = com.payair.hce.onCardProvisionCompleted.getPaymentFci
            int r4 = r4 + 99
            int r4 = r4 % 128
            com.payair.hce.onCardProvisionCompleted.getCiacDecline = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.payair.hce.onCardProvisionCompleted.writeReplace(com.payair.hce.getCacheDir, int, com.payair.hce.transactionCanBeResumed):void");
    }

    private static void a(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        $11 = ($10 + 107) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = IccPrivateKeyCrtComponentsJson;
        char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        int i4 = 1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myTid() >> 22) + 49, 2507 - android.text.TextUtils.indexOf("", c), (char) (6801 - android.text.TextUtils.indexOf("", c)));
                        byte b2 = $$a[0];
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b2, (byte) (b2 - 1), b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(SdkCoreBusinessLogicModuleImpl)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        long j = 0;
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48, 2509 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (android.text.TextUtils.indexOf("", "") + 6802));
            byte b3 = $$a[0];
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b(b3, (byte) (b3 - 1), b3, objArr5);
            obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE);
            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj2);
        }
        char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            digitizedCardJson12.values = 0;
            while (digitizedCardJson12.values < i2) {
                int i6 = $11 + 73;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    int i7 = digitizedCardJson12.values;
                    throw new java.lang.ArithmeticException();
                }
                digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + i4];
                if (digitizedCardJson12.valueOf == digitizedCardJson12.writeReplace) {
                    cArr3[digitizedCardJson12.values] = (char) (digitizedCardJson12.valueOf - b);
                    cArr3[digitizedCardJson12.values + i4] = (char) (digitizedCardJson12.writeReplace - b);
                    i3 = i4;
                } else {
                    java.lang.Object[] objArr6 = new java.lang.Object[13];
                    objArr6[12] = digitizedCardJson12;
                    objArr6[11] = java.lang.Integer.valueOf(charValue);
                    objArr6[10] = digitizedCardJson12;
                    objArr6[9] = digitizedCardJson12;
                    objArr6[8] = java.lang.Integer.valueOf(charValue);
                    objArr6[7] = digitizedCardJson12;
                    objArr6[6] = digitizedCardJson12;
                    objArr6[5] = java.lang.Integer.valueOf(charValue);
                    objArr6[4] = digitizedCardJson12;
                    objArr6[3] = digitizedCardJson12;
                    objArr6[2] = java.lang.Integer.valueOf(charValue);
                    objArr6[i4] = digitizedCardJson12;
                    objArr6[0] = digitizedCardJson12;
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.text.TextUtils.getTrimmedLength(""), 3596 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (char) android.widget.ExpandableListView.getPackedPositionType(j))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, obj3);
                    }
                    if (((java.lang.Integer) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).intValue() == digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl) {
                        java.lang.Object[] objArr7 = {digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, digitizedCardJson12, java.lang.Integer.valueOf(charValue), java.lang.Integer.valueOf(charValue), digitizedCardJson12, java.lang.Integer.valueOf(charValue), digitizedCardJson12};
                        java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
                        if (obj4 == null) {
                            java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 48, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 2665, (char) (18888 - android.graphics.ImageFormat.getBitsPerPixel(0)));
                            byte b4 = $$a[0];
                            byte b5 = (byte) (b4 + 1);
                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                            b(b5, (byte) (-b5), b4, objArr8);
                            obj4 = cls3.getMethod((java.lang.String) objArr8[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
                            com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, obj4);
                        }
                        int intValue = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr7)).intValue();
                        int i8 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i9 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[intValue];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i8 * charValue) + i9];
                    } else if (digitizedCardJson12.DigitizedCardProfile == digitizedCardJson12.AlternateContactlessPaymentDataJson) {
                        $11 = ($10 + 31) % 128;
                        digitizedCardJson12.RecordsJson = ((digitizedCardJson12.RecordsJson + charValue) - 1) % charValue;
                        digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl = ((digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl + charValue) - 1) % charValue;
                        int i10 = digitizedCardJson12.DigitizedCardProfile;
                        int i11 = digitizedCardJson12.RecordsJson;
                        int i12 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i13 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        cArr3[digitizedCardJson12.values] = cArr[(i10 * charValue) + i11];
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i12 * charValue) + i13];
                    } else {
                        int i14 = digitizedCardJson12.DigitizedCardProfile;
                        int i15 = digitizedCardJson12.SdkCoreAlternateContactlessPaymentDataImpl;
                        int i16 = digitizedCardJson12.AlternateContactlessPaymentDataJson;
                        int i17 = digitizedCardJson12.RecordsJson;
                        cArr3[digitizedCardJson12.values] = cArr[(i14 * charValue) + i15];
                        i3 = 1;
                        cArr3[digitizedCardJson12.values + 1] = cArr[(i16 * charValue) + i17];
                        $10 = ($11 + 19) % 128;
                    }
                    i3 = 1;
                }
                digitizedCardJson12.values += 2;
                i4 = i3;
                j = 0;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private static com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed, int i) throws com.payair.hce.postToastMessageOnUi {
        getCiacDecline = (getPaymentFci + 65) % 128;
        java.lang.String valueOf = com.payair.hce.onRequestSessionCompleted.valueOf(transactioncanberesumed);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("㘄", 1 - android.view.View.getDefaultSize(0, 0), (byte) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 73), objArr);
        com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson = com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(valueOf.replaceAll(((java.lang.String) objArr[0]).intern(), "").getBytes());
        com.payair.hce.transactionCanBeResumed values = AlternateContactlessPaymentDataJson.values(AlternateContactlessPaymentDataJson.DigitizedCardProfile() - i, AlternateContactlessPaymentDataJson.DigitizedCardProfile());
        getCiacDecline = (getPaymentFci + 89) % 128;
        return values;
    }

    private static com.payair.hce.transactionCanBeResumed writeReplace(com.payair.hce.transactionCanBeResumed transactioncanberesumed, int i) {
        java.lang.String writeReplace;
        int i2;
        int i3 = getCiacDecline + 55;
        getPaymentFci = i3 % 128;
        if (i3 % 2 != 0) {
            writeReplace = transactioncanberesumed.writeReplace();
            i2 = 107;
        } else {
            writeReplace = transactioncanberesumed.writeReplace();
            i2 = 16;
        }
        java.lang.String obj = java.lang.Long.valueOf(writeReplace, i2).toString();
        while (obj.length() < i) {
            getPaymentFci = (getCiacDecline + 23) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("㗘", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, (byte) (45 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr);
            obj = ((java.lang.String) objArr[0]).intern().concat(java.lang.String.valueOf(obj));
        }
        return com.payair.hce.transactionCanBeResumed.AlternateContactlessPaymentDataJson(obj.substring(obj.length() - i).getBytes());
    }

    private static int AlternateContactlessPaymentDataJson(com.payair.hce.transactionCanBeResumed transactioncanberesumed) {
        getCiacDecline = (getPaymentFci + 81) % 128;
        int i = 0;
        for (int i2 = 0; i2 < transactioncanberesumed.DigitizedCardProfile(); i2++) {
            getCiacDecline = (getPaymentFci + 1) % 128;
            byte AlternateContactlessPaymentDataJson = transactioncanberesumed.AlternateContactlessPaymentDataJson(i2);
            for (int i3 = 7; i3 >= 0; i3--) {
                int i4 = getPaymentFci + 5;
                getCiacDecline = i4 % 128;
                if (i4 % 2 != 0) {
                    if (com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson, i3)) {
                        int i5 = getPaymentFci + 37;
                        getCiacDecline = i5 % 128;
                        i = i5 % 2 == 0 ? i + 59 : i + 1;
                    }
                } else {
                    com.payair.hce.onRequestSessionCompleted.AlternateContactlessPaymentDataJson(AlternateContactlessPaymentDataJson, i3);
                    throw new java.lang.ArithmeticException();
                }
            }
        }
        return i;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getPaymentFci = 0;
        getCiacDecline = 1;
        IccPrivateKeyCrtComponentsJson = new char[]{12409, 12316, 12302, 12321, 12410, 12324, 12346, 12399, 12350, 12318, 12323, 12351, 12339, 12299, 12331, 12313, 12325, 12394, 12329, 12345, 12297, 12300, 12334, 12344, 12326};
        SdkCoreBusinessLogicModuleImpl = (char) 1493;
    }

    private void valueOf(com.payair.hce.transactionCanBeResumed transactioncanberesumed, com.payair.hce.transactionCanBeResumed transactioncanberesumed2, com.payair.hce.getCacheDir getcachedir) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, transactioncanberesumed, transactioncanberesumed2, getcachedir}, 2099383804, -2099383804, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{0, -59, 44, -8};
        $$b = 106;
    }

    public final com.payair.hce.transactionCanBeResumed AlternateContactlessPaymentDataJson() {
        return (com.payair.hce.transactionCanBeResumed) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, -1521228294, 1521228295, java.lang.System.identityHashCode(this));
    }
}
