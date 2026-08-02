package com.payair.hce;

/* loaded from: classes4.dex */
final class setTransitionVisibility implements com.payair.hce.getApplicationInfo {
    private static int DigitizedCardProfile = 0;
    private static int valueOf = 1;
    private long writeReplace = 0;
    private java.util.SortedMap<java.lang.Long, com.payair.hce.getApplicationInfo> values = new java.util.TreeMap();

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    setTransitionVisibility() {
    }

    final long values(com.payair.hce.getApplicationInfo getapplicationinfo) {
        long j;
        java.util.SortedMap<java.lang.Long, com.payair.hce.getApplicationInfo> sortedMap;
        long j2;
        synchronized (this) {
            int i = DigitizedCardProfile;
            int i2 = i ^ 73;
            int i3 = -(-((i & 73) << 1));
            int i4 = (i2 & i3) + (i3 | i2);
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                j = this.writeReplace;
                this.writeReplace = j;
                sortedMap = this.values;
            } else {
                j = this.writeReplace + 1;
                this.writeReplace = j;
                sortedMap = this.values;
            }
            sortedMap.put(java.lang.Long.valueOf(j), getapplicationinfo);
            j2 = this.writeReplace;
        }
        return j2;
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void valueOf(com.payair.hce.sendRequest sendrequest, com.payair.hce.setSelectedCard setselectedcard) {
        synchronized (this) {
            int i = valueOf;
            int i2 = ((i ^ 71) | (i & 71)) << 1;
            int i3 = -((i & (-72)) | ((~i) & 71));
            DigitizedCardProfile = ((i2 & i3) + (i3 | i2)) % 128;
            java.util.Iterator<com.payair.hce.getApplicationInfo> it = this.values.values().iterator();
            int i4 = valueOf;
            int i5 = ((i4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + ((i4 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) << 1)) - 1;
            DigitizedCardProfile = i5 % 128;
            int i6 = i5 % 2;
            while (it.hasNext()) {
                DigitizedCardProfile = ((-2) - (~(valueOf + 78))) % 128;
                it.next().valueOf(sendrequest, setselectedcard);
                int i7 = valueOf;
                int i8 = i7 | 111;
                int i9 = i8 << 1;
                int i10 = -((~(i7 & 111)) & i8);
                DigitizedCardProfile = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            }
            int i11 = DigitizedCardProfile & 15;
            valueOf = (((((r5 ^ 15) | i11) << 1) - (~(-((r5 | 15) & (~i11))))) - 1) % 128;
        }
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setTransitionVisibility settransitionvisibility = (com.payair.hce.setTransitionVisibility) objArr[0];
        com.payair.hce.sendRequest sendrequest = (com.payair.hce.sendRequest) objArr[1];
        java.lang.Exception exc = (java.lang.Exception) objArr[2];
        int i = valueOf + 116;
        DigitizedCardProfile = ((~i) + (i << 1)) % 128;
        java.util.Iterator<com.payair.hce.getApplicationInfo> it = settransitionvisibility.values.values().iterator();
        while (it.hasNext()) {
            int i2 = DigitizedCardProfile;
            int i3 = (i2 & (-44)) | ((~i2) & 43);
            int i4 = -(-((i2 & 43) << 1));
            int i5 = (i3 & i4) + (i4 | i3);
            valueOf = i5 % 128;
            if (i5 % 2 != 0) {
                it.next().AlternateContactlessPaymentDataJson(sendrequest, exc);
                int i6 = valueOf;
                int i7 = i6 & 105;
                int i8 = (i6 | 105) & (~i7);
                int i9 = i7 << 1;
                DigitizedCardProfile = ((i8 & i9) + (i8 | i9)) % 128;
            } else {
                it.next().AlternateContactlessPaymentDataJson(sendrequest, exc);
                throw new java.lang.ArithmeticException();
            }
        }
        int i10 = valueOf;
        int i11 = (i10 ^ 85) + ((i10 & 85) << 1);
        DigitizedCardProfile = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void writeReplace(com.payair.hce.sendRequest sendrequest, com.payair.hce.replenishToken replenishtoken, java.lang.Exception exc) {
        synchronized (this) {
            int i = DigitizedCardProfile;
            int i2 = ((i | 117) << 1) - (i ^ 117);
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                this.values.values().iterator();
                throw new java.lang.NullPointerException();
            }
            java.util.Iterator<com.payair.hce.getApplicationInfo> it = this.values.values().iterator();
            while (it.hasNext()) {
                valueOf = (DigitizedCardProfile + 67) % 128;
                it.next().writeReplace(sendrequest, replenishtoken, exc);
                valueOf = (DigitizedCardProfile + 67) % 128;
            }
            DigitizedCardProfile = (valueOf + 63) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        r0 = com.payair.hce.setTransitionVisibility.DigitizedCardProfile + 45;
        com.payair.hce.setTransitionVisibility.valueOf = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if ((r0 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    @Override // com.payair.hce.getApplicationInfo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void DigitizedCardProfile() {
        synchronized (this) {
            int i = DigitizedCardProfile;
            int i2 = i & 43;
            int i3 = (i ^ 43) | i2;
            valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            java.util.Iterator<com.payair.hce.getApplicationInfo> it = this.values.values().iterator();
            int i4 = (-2) - (~(DigitizedCardProfile + 34));
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 / 3;
            }
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int i6 = DigitizedCardProfile;
                int i7 = (i6 ^ 27) + ((i6 & 27) << 1);
                valueOf = i7 % 128;
                if (i7 % 2 == 0) {
                    it.next().DigitizedCardProfile();
                    throw new java.lang.ArithmeticException();
                }
                it.next().DigitizedCardProfile();
                int i8 = DigitizedCardProfile;
                int i9 = (i8 & (-20)) | ((~i8) & 19);
                int i10 = (i8 & 19) << 1;
                valueOf = ((i9 ^ i10) + ((i10 & i9) << 1)) % 128;
            }
        }
    }

    @Override // com.payair.hce.getApplicationInfo
    public final void AlternateContactlessPaymentDataJson(com.payair.hce.sendRequest sendrequest, java.lang.Exception exc) {
        AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, sendrequest, exc}, -745339207, 745339207, java.lang.System.identityHashCode(this));
    }
}
