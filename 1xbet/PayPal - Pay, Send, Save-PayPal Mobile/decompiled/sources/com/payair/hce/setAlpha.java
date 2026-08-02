package com.payair.hce;

/* loaded from: classes4.dex */
final class setAlpha {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getCvrMaskAnd;
    private static int getPaymentFci;
    byte[] AlternateContactlessPaymentDataJson;
    com.payair.hce.findFragmentByTag DigitizedCardProfile;
    private java.util.concurrent.ExecutorService IccPrivateKeyCrtComponentsJson;
    private int RecordsJson = 2;
    private java.util.concurrent.Future getAid;
    private java.util.concurrent.Future getProfileVersion;
    android.content.SharedPreferences valueOf;
    java.lang.String values;
    com.payair.hce.findFragmentByTag writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6;
        int i7 = (i2 * 2) + 4;
        int i8 = 1 - (i3 * 4);
        int i9 = 111 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i10 = i7;
            int i11 = 0;
            i7 += -i9;
            i5 = i10 + 1;
            i4 = i11;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i8) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i10 = i5;
            i9 = bArr[i5];
            i11 = i6;
            i7 += -i9;
            i5 = i10 + 1;
            i4 = i11;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i8) {
            }
        } else {
            i4 = 0;
            i7 = i9;
            i5 = i7;
            bArr2[i4] = (byte) i7;
            i6 = i4 + 1;
            if (i6 == i8) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * 628) + (i2 * 628) + ((i2 | i3 | (~i)) * (-627)) + (((~((~i2) | i3)) | i) * (-627)) + (((~(i | i3)) | (~(i2 | (~i3)))) * 627);
        if (i4 == 1) {
            com.payair.hce.findFragmentByTag findfragmentbytag = new com.payair.hce.findFragmentByTag(new com.payair.hce.setTransactionSuccessful(new com.payair.hce.isOpenInternalannotations()));
            int i5 = getPaymentFci;
            int i6 = i5 & 13;
            int i7 = (i5 | 13) & (~i6);
            int i8 = i6 << 1;
            getCvrMaskAnd = (((i7 | i8) << 1) - (i7 ^ i8)) % 128;
            return findfragmentbytag;
        }
        if (i4 == 2) {
            com.payair.hce.setAlpha setalpha = (com.payair.hce.setAlpha) objArr[0];
            java.util.concurrent.Future<?> submit = setalpha.IccPrivateKeyCrtComponentsJson.submit(new java.lang.Runnable() { // from class: com.payair.hce.setAlpha.3
                private static int values = 1;
                private static int writeReplace;

                public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i9, int i10, int i11) {
                    return values(objArr2);
                }

                private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr2) {
                    byte[] bArr;
                    com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson;
                    com.payair.hce.setAlpha.AnonymousClass3 anonymousClass3 = (com.payair.hce.setAlpha.AnonymousClass3) objArr2[0];
                    byte[] bArr2 = null;
                    try {
                        try {
                            com.payair.hce.setVisibility setvisibility = new com.payair.hce.setVisibility();
                            AlternateContactlessPaymentDataJson = new com.payair.hce.setIsCredential().AlternateContactlessPaymentDataJson(null, null, com.payair.hce.setAlpha.this.values);
                            bArr = (byte[]) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{setvisibility, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis())}, 759723402, -759723401, java.lang.System.identityHashCode(setvisibility));
                        } catch (java.lang.Exception e) {
                            e = e;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr = bArr2;
                        com.payair.hce.setAlpha setalpha2 = com.payair.hce.setAlpha.this;
                        com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                    try {
                        com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -808754747, 808754756, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
                        com.payair.hce.setAlpha.this.DigitizedCardProfile.DigitizedCardProfile(false, new com.payair.hce.inTransaction(new com.payair.hce.getErrorDialog(bArr), com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson, com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson.length));
                        com.payair.hce.setAlpha setalpha3 = com.payair.hce.setAlpha.this;
                        com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                        int i9 = writeReplace;
                        values = (((i9 & 18) + (i9 | 18)) - 1) % 128;
                        return null;
                    } catch (java.lang.Exception e2) {
                        e = e2;
                        bArr2 = bArr;
                        try {
                            throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.toString()));
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        com.payair.hce.setAlpha setalpha22 = com.payair.hce.setAlpha.this;
                        com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1233593563, -1233593563, java.lang.System.identityHashCode(this));
                }
            });
            int i9 = getPaymentFci;
            getCvrMaskAnd = ((((i9 | 38) << 1) - (i9 ^ 38)) - 1) % 128;
            return submit;
        }
        if (i4 == 3) {
            com.payair.hce.setAlpha setalpha2 = (com.payair.hce.setAlpha) objArr[0];
            java.util.concurrent.Future<?> submit2 = setalpha2.IccPrivateKeyCrtComponentsJson.submit(new java.lang.Runnable() { // from class: com.payair.hce.setAlpha.4
                private static int DigitizedCardProfile = 0;
                private static int valueOf = 1;

                public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2, int i10, int i11, int i12) {
                    return DigitizedCardProfile(objArr2);
                }

                private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr2) {
                    byte[] bArr;
                    com.payair.hce.setVisibility setvisibility;
                    com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson;
                    com.payair.hce.setAlpha.AnonymousClass4 anonymousClass4 = (com.payair.hce.setAlpha.AnonymousClass4) objArr2[0];
                    byte[] bArr2 = null;
                    try {
                        setvisibility = new com.payair.hce.setVisibility();
                        AlternateContactlessPaymentDataJson = new com.payair.hce.setIsCredential().AlternateContactlessPaymentDataJson(null, null, com.payair.hce.setAlpha.this.values);
                        bArr = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
                    } catch (java.lang.Exception e) {
                        e = e;
                        bArr = null;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr = null;
                    }
                    try {
                        byte[] bArr3 = (byte[]) com.payair.hce.setFitsSystemWindows.values(new java.lang.Object[]{setvisibility, (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -1049511775, 1049511786, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis()), bArr}, 759723402, -759723401, java.lang.System.identityHashCode(setvisibility));
                        try {
                            com.payair.hce.getErrorDialog geterrordialog = new com.payair.hce.getErrorDialog(bArr3);
                            if (com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson != null) {
                                com.payair.hce.setAlpha.this.writeReplace.DigitizedCardProfile(true, new com.payair.hce.inTransaction(geterrordialog, com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson, com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson.length));
                                int i10 = valueOf;
                                int i11 = i10 & 119;
                                int i12 = i10 | 119;
                                int i13 = (i11 & i12) + (i12 | i11);
                                DigitizedCardProfile = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i14 = 2 / 4;
                                }
                            } else {
                                com.payair.hce.setAlpha.this.writeReplace.DigitizedCardProfile(true, geterrordialog);
                                com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setAlpha setalpha3 = com.payair.hce.setAlpha.this;
                                com.payair.hce.setLeft.values(new java.lang.Object[]{(java.lang.String) com.payair.hce.setAlpha.values(new java.lang.Object[]{setalpha3}, -1573652999, 1573653004, java.lang.System.identityHashCode(setalpha3)), new java.lang.String(com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(com.payair.hce.setAlpha.this.AlternateContactlessPaymentDataJson).writeReplace()), com.payair.hce.setAlpha.this.valueOf}, 895496365, -895496355, (int) java.lang.System.currentTimeMillis());
                                int i15 = DigitizedCardProfile;
                                int i16 = i15 & 7;
                                int i17 = i15 | 7;
                                valueOf = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
                            }
                            com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -808754747, 808754756, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
                            com.payair.hce.setAlpha setalpha4 = com.payair.hce.setAlpha.this;
                            com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr3}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setAlpha setalpha5 = com.payair.hce.setAlpha.this;
                            com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                            int i18 = DigitizedCardProfile;
                            int i19 = i18 & 63;
                            int i20 = (((i18 ^ 63) | i19) << 1) - ((i18 | 63) & (~i19));
                            valueOf = i20 % 128;
                            if (i20 % 2 != 0) {
                                return null;
                            }
                            throw new java.lang.ArithmeticException();
                        } catch (java.lang.Exception e2) {
                            e = e2;
                            bArr2 = bArr3;
                            try {
                                try {
                                    throw ((java.lang.Throwable) java.lang.RuntimeException.class.getDeclaredConstructor(java.lang.String.class).newInstance(e.toString()));
                                } catch (java.lang.Throwable th2) {
                                    java.lang.Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                bArr3 = bArr2;
                                bArr = bArr;
                                bArr2 = bArr3;
                                com.payair.hce.setAlpha setalpha6 = com.payair.hce.setAlpha.this;
                                com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr2}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                                com.payair.hce.setAlpha setalpha7 = com.payair.hce.setAlpha.this;
                                com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                                throw th;
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            bArr = bArr;
                            bArr2 = bArr3;
                            com.payair.hce.setAlpha setalpha62 = com.payair.hce.setAlpha.this;
                            com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr2}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                            com.payair.hce.setAlpha setalpha72 = com.payair.hce.setAlpha.this;
                            com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                            throw th;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        com.payair.hce.setAlpha setalpha622 = com.payair.hce.setAlpha.this;
                        com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr2}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                        com.payair.hce.setAlpha setalpha722 = com.payair.hce.setAlpha.this;
                        com.payair.hce.setAlpha.values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                        throw th;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DigitizedCardProfile(new java.lang.Object[]{this}, 2080559347, -2080559347, java.lang.System.identityHashCode(this));
                }
            });
            int i10 = getCvrMaskAnd;
            int i11 = i10 & 65;
            getPaymentFci = ((i11 - (~(-(-((i10 ^ 65) | i11))))) - 1) % 128;
            return submit2;
        }
        if (i4 == 4) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i4 != 5) {
            return values(objArr);
        }
        com.payair.hce.setAlpha setalpha3 = (com.payair.hce.setAlpha) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IV-");
        sb.append(setalpha3.values);
        java.lang.String obj = sb.toString();
        int i12 = getCvrMaskAnd;
        getPaymentFci = ((i12 & 95) + (i12 | 95)) % 128;
        return obj;
    }

    setAlpha(java.lang.String str, android.content.SharedPreferences sharedPreferences) throws java.security.GeneralSecurityException {
        try {
            this.values = str;
            this.IccPrivateKeyCrtComponentsJson = java.util.concurrent.Executors.newFixedThreadPool(2);
            this.valueOf = sharedPreferences;
            java.lang.String str2 = (java.lang.String) com.payair.hce.setLeft.values(new java.lang.Object[]{(java.lang.String) values(new java.lang.Object[]{this}, -1573652999, 1573653004, java.lang.System.identityHashCode(this)), null, sharedPreferences}, 1992502504, -1992502503, (int) java.lang.System.currentTimeMillis());
            if (str2 != null) {
                this.AlternateContactlessPaymentDataJson = com.payair.hce.bindIsolatedService.AlternateContactlessPaymentDataJson(str2).DigitizedCardProfile();
            } else {
                com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = new com.payair.hce.setIsCredential().AlternateContactlessPaymentDataJson(null, null, this.values);
                this.AlternateContactlessPaymentDataJson = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
            }
            this.writeReplace = (com.payair.hce.findFragmentByTag) values(new java.lang.Object[0], -262086853, 262086854, (int) java.lang.System.currentTimeMillis());
            this.DigitizedCardProfile = (com.payair.hce.findFragmentByTag) values(new java.lang.Object[0], -262086853, 262086854, (int) java.lang.System.currentTimeMillis());
            java.util.concurrent.Future future = (java.util.concurrent.Future) values(new java.lang.Object[]{this}, -68292907, 68292910, java.lang.System.identityHashCode(this));
            this.getProfileVersion = future;
            future.get();
            java.util.concurrent.Future future2 = (java.util.concurrent.Future) values(new java.lang.Object[]{this}, 719643275, -719643273, java.lang.System.identityHashCode(this));
            this.getAid = future2;
            future2.get();
        } catch (java.lang.Exception e) {
            try {
                java.lang.Object[] objArr = {e.toString()};
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new int[]{0, 38, 167, 23}, false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public final byte[] values(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        synchronized (this) {
            int i = getPaymentFci;
            int i2 = i & 25;
            int i3 = ((i | 25) & (~i2)) + (i2 << 1);
            getCvrMaskAnd = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
            if (this.AlternateContactlessPaymentDataJson == null) {
                com.payair.hce.setOnCapturedPointerListener AlternateContactlessPaymentDataJson = new com.payair.hce.setIsCredential().AlternateContactlessPaymentDataJson(null, null, this.values);
                this.AlternateContactlessPaymentDataJson = (byte[]) com.payair.hce.setDescendantFocusability.writeReplace(new java.lang.Object[]{(java.lang.String) com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, 2121132154, -2121132154, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson))}, 2012113923, -2012113922, (int) java.lang.System.currentTimeMillis());
                com.payair.hce.setOnCapturedPointerListener.writeReplace(new java.lang.Object[]{AlternateContactlessPaymentDataJson}, -808754747, 808754756, java.lang.System.identityHashCode(AlternateContactlessPaymentDataJson));
                int i4 = getPaymentFci;
                int i5 = i4 & 45;
                getCvrMaskAnd = ((((i4 | 45) & (~i5)) - (~(-(-(i5 << 1))))) - 1) % 128;
            }
            try {
                try {
                    this.getProfileVersion.get();
                    bArr2 = new byte[this.writeReplace.valueOf(bArr.length)];
                    this.writeReplace.values(bArr2, this.writeReplace.valueOf(bArr, 0, bArr.length, bArr2));
                    values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                    int i6 = getPaymentFci;
                    int i7 = i6 & 41;
                    int i8 = (i6 ^ 41) | i7;
                    getCvrMaskAnd = ((i7 ^ i8) + ((i7 & i8) << 1)) % 128;
                    int i9 = (i6 & (-4)) | ((~i6) & 3);
                    int i10 = -(-((i6 & 3) << 1));
                    int i11 = (i9 & i10) + (i10 | i9);
                    int i12 = i11 % 128;
                    getCvrMaskAnd = i12;
                    if (i11 % 2 != 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i13 = (i12 ^ 19) + ((i12 & 19) << 1);
                    getPaymentFci = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } catch (java.lang.Throwable th) {
                    values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
                    throw th;
                }
            } catch (com.payair.hce.getSuspendingTransactionId | java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                java.lang.Thread.currentThread().interrupt();
                try {
                    java.lang.Object[] objArr = {e.toString()};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(new int[]{0, 38, 167, 23}, false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                    throw ((java.lang.Throwable) java.lang.Class.forName((java.lang.String) objArr2[0]).getDeclaredConstructor(java.lang.String.class).newInstance(objArr));
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
        }
        return bArr2;
    }

    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    public final byte[] DigitizedCardProfile(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2;
        synchronized (this) {
            int i = getPaymentFci + 15;
            getCvrMaskAnd = i % 128;
            int i2 = 0;
            try {
                if (i % 2 != 0) {
                    this.getAid.get();
                    bArr2 = new byte[this.writeReplace.valueOf(bArr.length)];
                    this.writeReplace.values(bArr2, this.writeReplace.valueOf(bArr, 1, bArr.length, bArr2));
                } else {
                    this.getAid.get();
                    bArr2 = new byte[this.writeReplace.valueOf(bArr.length)];
                    this.writeReplace.values(bArr2, this.writeReplace.valueOf(bArr, 0, bArr.length, bArr2));
                }
                int i3 = getCvrMaskAnd;
                int i4 = (i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
                getPaymentFci = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 & 103;
                int i7 = -(-((i3 ^ 103) | i6));
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                i2 = i8 % 128;
                getPaymentFci = i2;
                if (i8 % 2 == 0) {
                    throw new java.lang.NullPointerException();
                }
                getPaymentFci = ((((i3 | 16) << 1) - (i3 ^ 16)) - 1) % 128;
            } catch (com.payair.hce.getSuspendingTransactionId | java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                java.lang.Thread.currentThread().interrupt();
                try {
                    java.lang.Object[] objArr = {e.toString()};
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a(new int[]{i2, 38, 167, 23}, i2, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                    java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr2[i2]);
                    java.lang.Class<?>[] clsArr = new java.lang.Class[1];
                    clsArr[i2] = java.lang.String.class;
                    throw ((java.lang.Throwable) cls.getDeclaredConstructor(clsArr).newInstance(objArr));
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return bArr2;
    }

    private static void a(int[] iArr, boolean z, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        char[] cArr;
        int i2;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        com.payair.hce.getAccountType getaccounttype = new com.payair.hce.getAccountType();
        char c = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = SdkCoreAlternateContactlessPaymentDataImpl;
        char c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr2[i7]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(275265691);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 29, android.text.TextUtils.lastIndexOf("", c2) + 2808, (char) android.text.TextUtils.indexOf("", ""));
                        byte b = (byte) ($$b & 1);
                        byte b2 = $$a[2];
                        cArr = cArr2;
                        i2 = length;
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        b(b, b2, b2, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(275265691, obj);
                    } else {
                        cArr = cArr2;
                        i2 = length;
                    }
                    cArr3[i7] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i7++;
                    cArr2 = cArr;
                    length = i2;
                    c = 0;
                    c2 = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr2 != null) {
            char[] cArr5 = new char[i4];
            getaccounttype.writeReplace = 0;
            char c3 = 0;
            while (getaccounttype.writeReplace < i4) {
                if (bArr2[getaccounttype.writeReplace] == 1) {
                    int i8 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c3)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1969056788);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2836, (char) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b3 = (byte) ($$b & 10);
                        byte b4 = $$a[2];
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        b(b3, b4, b4, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1969056788, obj2);
                    }
                    cArr5[i8] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                } else {
                    int i9 = getaccounttype.writeReplace;
                    java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(cArr4[getaccounttype.writeReplace]), java.lang.Integer.valueOf(c3)};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-2110984860);
                    if (obj3 == null) {
                        java.lang.Class cls3 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 43, 2879 - android.os.Process.getGidForName(""), (char) android.view.View.MeasureSpec.getSize(0));
                        byte b5 = $$a[2];
                        byte b6 = b5;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        b(b5, b6, b6, objArr7);
                        obj3 = cls3.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-2110984860, obj3);
                    }
                    cArr5[i9] = ((java.lang.Character) ((java.lang.reflect.Method) obj3).invoke(null, objArr6)).charValue();
                }
                c3 = cArr5[getaccounttype.writeReplace];
                java.lang.Object[] objArr8 = {getaccounttype, getaccounttype};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1714689752);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(35 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, (char) android.text.TextUtils.indexOf("", "", 0))).getMethod("l", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1714689752, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr8);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            java.lang.System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i10 = i4 - i6;
            java.lang.System.arraycopy(cArr6, 0, cArr4, i10, i6);
            java.lang.System.arraycopy(cArr6, i6, cArr4, 0, i10);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                getaccounttype.writeReplace = i;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr7[getaccounttype.writeReplace] = cArr4[(i4 - getaccounttype.writeReplace) - 1];
                i = getaccounttype.writeReplace + 1;
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i11 = 0;
            while (true) {
                getaccounttype.writeReplace = i11;
                if (getaccounttype.writeReplace >= i4) {
                    break;
                }
                cArr4[getaccounttype.writeReplace] = (char) (cArr4[getaccounttype.writeReplace] - iArr[2]);
                i11 = getaccounttype.writeReplace + 1;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.setAlpha setalpha = (com.payair.hce.setAlpha) objArr[0];
        int i = getPaymentFci;
        int i2 = i ^ 47;
        int i3 = -(-((i & 47) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        getCvrMaskAnd = i4 % 128;
        if (i4 % 2 == 0) {
            com.payair.hce.setLeft.values(new java.lang.Object[]{(java.lang.String) values(new java.lang.Object[]{setalpha}, -1573652999, 1573653004, java.lang.System.identityHashCode(setalpha)), setalpha.valueOf}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
            byte[] bArr = setalpha.AlternateContactlessPaymentDataJson;
            if (bArr != null) {
                java.util.Arrays.fill(bArr, (byte) 0);
                int i5 = getCvrMaskAnd;
                int i6 = i5 & 97;
                int i7 = -(-((i5 ^ 97) | i6));
                getPaymentFci = ((i6 ^ i7) + ((i7 & i6) << 1)) % 128;
            }
            int i8 = getPaymentFci;
            getCvrMaskAnd = (((i8 & 70) + (i8 | 70)) - 1) % 128;
            return null;
        }
        com.payair.hce.setLeft.values(new java.lang.Object[]{(java.lang.String) values(new java.lang.Object[]{setalpha}, -1573652999, 1573653004, java.lang.System.identityHashCode(setalpha)), setalpha.valueOf}, 589791992, -589791985, (int) java.lang.System.currentTimeMillis());
        byte[] bArr2 = setalpha.AlternateContactlessPaymentDataJson;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int i = getCvrMaskAnd;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        int i4 = ((i2 | i3) << 1) - (i2 ^ i3);
        getPaymentFci = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (bArr != null) {
            int length = bArr.length;
            int i5 = i & 15;
            int i6 = -(-((i ^ 15) | i5));
            getPaymentFci = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            int i7 = 0;
            while (i7 < length) {
                int i8 = getCvrMaskAnd;
                int i9 = ((i8 ^ 113) | (i8 & 113)) << 1;
                int i10 = -((i8 & (-114)) | ((~i8) & 113));
                int i11 = ((i9 & i10) + (i10 | i9)) % 128;
                getPaymentFci = i11;
                bArr[i7] = 0;
                int i12 = i7 - 115;
                int i13 = i12 & 116;
                i7 = ((((i12 ^ 116) | i13) << 1) - (~(-((i12 | 116) & (~i13))))) - 1;
                int i14 = ((i11 ^ 69) | (i11 & 69)) << 1;
                int i15 = -(((~i11) & 69) | (i11 & (-70)));
                getCvrMaskAnd = ((i14 ^ i15) + ((i14 & i15) << 1)) % 128;
            }
        }
        int i16 = getPaymentFci;
        int i17 = i16 & 81;
        int i18 = -(-((i16 ^ 81) | i17));
        getCvrMaskAnd = ((i17 & i18) + (i18 | i17)) % 128;
        return null;
    }

    static {
        init$0();
        getCvrMaskAnd = 0;
        getPaymentFci = 1;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{16712, 16606, 16606, 16604, 16606, 16579, 16584, 16589, 16581, 16605, 16596, 16602, 16603, 16595, 16584, 16587, 16602, 16581, 16607, 16599, 16603, 16605, 16603, 16605, 16578, 16604, 16604, 16672, 16697, 16605, 16581, 16605, 16596, 16602, 16603, 16595, 16692, 16687};
    }

    final java.lang.String AlternateContactlessPaymentDataJson() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1573652999, 1573653004, java.lang.System.identityHashCode(this));
    }

    static void writeReplace(byte[] bArr) {
        values(new java.lang.Object[]{bArr}, 829730561, -829730561, (int) java.lang.System.currentTimeMillis());
    }

    public final void writeReplace() {
        values(new java.lang.Object[]{this}, 6408503, -6408499, java.lang.System.identityHashCode(this));
    }

    private static com.payair.hce.findFragmentByTag DigitizedCardProfile() {
        return (com.payair.hce.findFragmentByTag) values(new java.lang.Object[0], -262086853, 262086854, (int) java.lang.System.currentTimeMillis());
    }

    private java.util.concurrent.Future valueOf() {
        return (java.util.concurrent.Future) values(new java.lang.Object[]{this}, 719643275, -719643273, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.SYN, -105, 0, 34};
        $$b = 55;
    }

    private java.util.concurrent.Future values() {
        return (java.util.concurrent.Future) values(new java.lang.Object[]{this}, -68292907, 68292910, java.lang.System.identityHashCode(this));
    }
}
