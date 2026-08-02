package com.payair.hce;

/* loaded from: classes4.dex */
public final class setTransactionSuccessful extends com.payair.hce.isOpen implements com.payair.hce.getCloseLockroom_runtime_release {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char[] RecordsJson;
    private static int SdkCoreAlternateContactlessPaymentDataImpl;
    private static long getAid;
    private byte[] AlternateContactlessPaymentDataJson;
    private byte[] DigitizedCardProfile;
    private int getProfileVersion;
    private final com.payair.hce.getMDatabaseannotations valueOf;
    private final int values;
    private byte[] writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = b * 3;
        int i5 = 99 - (i2 * 3);
        int i6 = (i * 2) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[28 - i4];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i6++;
            i5 = (i5 + (-i7)) - 1;
            bArr2[i3] = (byte) i5;
            if (i3 == 27 - i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i7 = bArr[i6];
            i6++;
            i5 = (i5 + (-i7)) - 1;
            bArr2[i3] = (byte) i5;
            if (i3 == 27 - i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i5;
            if (i3 == 27 - i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void e(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2 = b3 * 4;
        int i3 = 99 - (b * 2);
        byte[] bArr = $$g;
        int i4 = b2 + 4;
        byte[] bArr2 = new byte[i2 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i3 += i4;
            i4 = i5;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i7 = i4 + 1;
            byte b4 = bArr[i7];
            i4 = i3;
            i3 = b4;
            i5 = i7;
            i3 += i4;
            i4 = i5;
            i = i6;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i6 = i + 1;
            if (i == i2) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public setTransactionSuccessful(com.payair.hce.getMDatabaseannotations getmdatabaseannotations) {
        super(getmdatabaseannotations);
        this.valueOf = getmdatabaseannotations;
        int AlternateContactlessPaymentDataJson = getmdatabaseannotations.AlternateContactlessPaymentDataJson();
        this.values = AlternateContactlessPaymentDataJson;
        this.writeReplace = new byte[AlternateContactlessPaymentDataJson];
        this.DigitizedCardProfile = new byte[AlternateContactlessPaymentDataJson];
        this.AlternateContactlessPaymentDataJson = new byte[AlternateContactlessPaymentDataJson];
        this.getProfileVersion = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0386  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, char c, int i2, java.lang.Object[] objArr) {
        long j;
        java.lang.Throwable cause;
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        while (true) {
            j = 0;
            if (getcvmmodel.valueOf >= i2) {
                break;
            }
            int i3 = $11 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = getcvmmodel.valueOf;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(RecordsJson[i >> getcvmmodel.valueOf])};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 382 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) ((android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 62387));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        e((byte) 0, (byte) -1, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                    }
                    java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                    if (obj2 == null) {
                        obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 35, 3967 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (40223 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                    }
                    jArr[i4] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                    java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                    java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                    if (obj3 == null) {
                        obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.rgb(0, 0, 0) + 16777250, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 211, (char) (android.os.Process.myPid() >> 22))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                    }
                    ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                } catch (java.lang.Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                int i5 = getcvmmodel.valueOf;
                java.lang.Object[] objArr6 = {java.lang.Integer.valueOf(RecordsJson[i + getcvmmodel.valueOf])};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj4 == null) {
                    java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(48 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), 381 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (char) ((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 62388));
                    java.lang.Object[] objArr7 = new java.lang.Object[1];
                    e((byte) 0, (byte) -1, (byte) 0, objArr7);
                    obj4 = cls2.getMethod((java.lang.String) objArr7[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj4);
                }
                java.lang.Object[] objArr8 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj4).invoke(null, objArr6)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getAid), java.lang.Integer.valueOf(c)};
                java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj5 == null) {
                    obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 35, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3965, (char) (40223 - android.view.View.MeasureSpec.getSize(0)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj5);
                }
                jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) obj5).invoke(null, objArr8)).longValue();
                java.lang.Object[] objArr9 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj6 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj6 == null) {
                    obj6 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 211, (char) (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj6);
                }
                ((java.lang.reflect.Method) obj6).invoke(null, objArr9);
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i6 = $11 + 97;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr10 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj7 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj7 == null) {
                    obj7 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.Process.myPid() >> 22) + 34, android.graphics.Color.green(0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, (char) (1 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj7);
                }
                ((java.lang.reflect.Method) obj7).invoke(null, objArr10);
                throw null;
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr11 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj8 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj8 == null) {
                obj8 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.os.Process.getGidForName("") + 35, 212 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj8);
            }
            ((java.lang.reflect.Method) obj8).invoke(null, objArr11);
            j = 0;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final void writeReplace(boolean z, com.payair.hce.getMCallbacksannotations getmcallbacksannotations) throws java.lang.IllegalArgumentException {
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 1) % 128;
        byte b = $$a[30];
        java.lang.Object[] objArr = new java.lang.Object[1];
        c(b, b, b, objArr);
        if (!java.lang.Class.forName((java.lang.String) objArr[0]).isInstance(getmcallbacksannotations)) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            d(86 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (android.view.ViewConfiguration.getTapTimeout() >> 16), 38 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        com.payair.hce.inTransaction intransaction = (com.payair.hce.inTransaction) getmcallbacksannotations;
        byte[] values = com.payair.hce.getClientVersion.values(intransaction.writeReplace());
        this.writeReplace = values;
        int i = this.values;
        if (i < values.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            d(android.widget.ExpandableListView.getPackedPositionChild(0L) + 1, (char) android.text.TextUtils.getOffsetAfter("", 0), android.view.View.resolveSizeAndState(0, 0, 0) + 42, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            sb.append(this.values);
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            d((android.view.ViewConfiguration.getTapTimeout() >> 16) + 42, (char) (62330 - android.view.View.MeasureSpec.getSize(0)), (android.view.ViewConfiguration.getTapTimeout() >> 16) + 7, objArr4);
            sb.append(((java.lang.String) objArr4[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i2 = i / 2;
        if (8 > i2) {
            int i3 = SdkCoreAlternateContactlessPaymentDataImpl + 51;
            IccPrivateKeyCrtComponentsJson = i3 % 128;
            if (i3 % 2 == 0) {
                i2 = i << 5;
            }
        } else {
            i2 = 8;
        }
        if (i - values.length <= i2) {
            if (intransaction.valueOf() != null) {
                this.valueOf.writeReplace(true, intransaction.valueOf());
                IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 49) % 128;
            }
            DigitizedCardProfile();
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        d(android.view.View.resolveSizeAndState(0, 0, 0) + 49, (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (-16777178) - android.graphics.Color.rgb(0, 0, 0), objArr5);
        sb2.append(((java.lang.String) objArr5[0]).intern());
        sb2.append(this.values - i2);
        java.lang.Object[] objArr6 = new java.lang.Object[1];
        d((android.view.ViewConfiguration.getTouchSlop() >> 8) + 42, (char) (android.os.Process.getGidForName("") + 62331), 7 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
        sb2.append(((java.lang.String) objArr6[0]).intern());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final java.lang.String writeReplace() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.valueOf.writeReplace());
        java.lang.Object[] objArr = new java.lang.Object[1];
        d((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 125, (char) (63280 - android.text.TextUtils.getTrimmedLength("")), 4 - android.graphics.Color.blue(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        java.lang.String obj = sb.toString();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 119) % 128;
        return obj;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson() {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 53;
        IccPrivateKeyCrtComponentsJson = i % 128;
        com.payair.hce.getMDatabaseannotations getmdatabaseannotations = this.valueOf;
        if (i % 2 != 0) {
            return getmdatabaseannotations.AlternateContactlessPaymentDataJson();
        }
        getmdatabaseannotations.AlternateContactlessPaymentDataJson();
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setTransactionSuccessful settransactionsuccessful = (com.payair.hce.setTransactionSuccessful) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int intValue = ((java.lang.Number) objArr[2]).intValue();
        byte[] bArr2 = (byte[]) objArr[3];
        int intValue2 = ((java.lang.Number) objArr[4]).intValue();
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 75) % 128;
        settransactionsuccessful.DigitizedCardProfile(bArr, intValue, settransactionsuccessful.values, bArr2, intValue2);
        int i = settransactionsuccessful.values;
        int i2 = SdkCoreAlternateContactlessPaymentDataImpl + 113;
        IccPrivateKeyCrtComponentsJson = i2 % 128;
        if (i2 % 2 != 0) {
            return java.lang.Integer.valueOf(i);
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.isOpen
    public final byte valueOf(byte b) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        int i = SdkCoreAlternateContactlessPaymentDataImpl + 97;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        int i2 = this.getProfileVersion;
        if (i2 == 0) {
            this.valueOf.AlternateContactlessPaymentDataJson(this.DigitizedCardProfile, 0, this.AlternateContactlessPaymentDataJson, 0);
            byte[] bArr = this.AlternateContactlessPaymentDataJson;
            int i3 = this.getProfileVersion;
            this.getProfileVersion = i3 + 1;
            return (byte) (b ^ bArr[i3]);
        }
        byte[] bArr2 = this.AlternateContactlessPaymentDataJson;
        int i4 = i2 + 1;
        this.getProfileVersion = i4;
        byte b2 = (byte) (b ^ bArr2[i2]);
        if (i4 == this.DigitizedCardProfile.length) {
            this.getProfileVersion = 0;
            values();
            valueOf();
            IccPrivateKeyCrtComponentsJson = (SdkCoreAlternateContactlessPaymentDataImpl + 125) % 128;
        }
        return b2;
    }

    private void valueOf() {
        if (this.writeReplace.length < this.values) {
            int i = 0;
            while (true) {
                byte[] bArr = this.writeReplace;
                if (i == bArr.length) {
                    break;
                }
                int i2 = IccPrivateKeyCrtComponentsJson;
                int i3 = i2 + 53;
                SdkCoreAlternateContactlessPaymentDataImpl = i3 % 128;
                if (i3 % 2 == 0) {
                    if (this.DigitizedCardProfile[i] != bArr[i]) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        d(android.view.View.combineMeasuredStates(0, 0) + 129, (char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 38 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
                        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
                    }
                    i++;
                    SdkCoreAlternateContactlessPaymentDataImpl = (i2 + 45) % 128;
                } else {
                    byte b = this.DigitizedCardProfile[i];
                    byte b2 = bArr[i];
                    throw null;
                }
            }
        }
        SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 113) % 128;
    }

    private void values() {
        byte b;
        int i = IccPrivateKeyCrtComponentsJson + 89;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 == 0) {
            int length = this.DigitizedCardProfile.length;
            do {
                length--;
                if (length < 0) {
                    return;
                }
                SdkCoreAlternateContactlessPaymentDataImpl = (IccPrivateKeyCrtComponentsJson + 101) % 128;
                byte[] bArr = this.DigitizedCardProfile;
                b = (byte) (bArr[length] + 1);
                bArr[length] = b;
            } while (b == 0);
            return;
        }
        int length2 = this.DigitizedCardProfile.length;
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final void DigitizedCardProfile() {
        int i = IccPrivateKeyCrtComponentsJson + 83;
        SdkCoreAlternateContactlessPaymentDataImpl = i % 128;
        if (i % 2 != 0) {
            com.payair.hce.getClientVersion.writeReplace(this.DigitizedCardProfile);
            byte[] bArr = this.writeReplace;
            java.lang.System.arraycopy(bArr, 1, this.DigitizedCardProfile, 1, bArr.length);
        } else {
            com.payair.hce.getClientVersion.writeReplace(this.DigitizedCardProfile);
            byte[] bArr2 = this.writeReplace;
            java.lang.System.arraycopy(bArr2, 0, this.DigitizedCardProfile, 0, bArr2.length);
        }
        this.valueOf.DigitizedCardProfile();
        this.getProfileVersion = 0;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        SdkCoreAlternateContactlessPaymentDataImpl = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        RecordsJson = new char[]{24300, 45647, 34709, 39068, 60460, 49506, 53972, 9827, 15202, 3220, 25027, 30070, 18175, 23545, 44818, 32850, 38298, 59698, 64117, 53142, 8396, 13387, 2462, 6869, 28271, 17237, 21640, 43123, 48504, 36537, 58322, 63234, 51291, 56830, 12597, 531, 6027, 26819, 31862, 20909, 41653, 46683, 44533, 16643, 29892, 27581, 8032, 12834, 8643, 24300, 45647, 34709, 39068, 60460, 49506, 53972, 9827, 15202, 3220, 25027, 30070, 18175, 23545, 44818, 32850, 38298, 59698, 64117, 53142, 8396, 13387, 2462, 6869, 28271, 17236, 21633, 43123, 48510, 36543, 58263, 63247, 51274, 56826, 12596, 583, 6085, 26763, 24300, 45647, 34709, 39068, 60460, 49506, 53972, 9827, 15202, 3220, 25027, 30070, 18175, 23545, 44818, 32850, 38298, 59698, 64117, 53142, 8396, 13387, 2439, 6882, 28221, 17242, 21642, 43062, 48491, 36526, 58309, 63248, 51320, 56818, 12595, 603, 6070, 26877, 43440, 17784, 28862, 28608, 24300, 45684, 34738, 39133, 60427, 49486, 53989, 9827, 15206, 3221, 24967, 30032, 18059, 23513, 44888, 32880, 38310, 59672, 64039, 53150, 8400, 13327, 2482, 6819, 28192, 17230, 21651, 43123, 48496, 36525, 58263, 63249, 51278, 56821, 12576, 598, 6097};
        getAid = 3184254501886997019L;
    }

    static void init$1() {
        $$g = new byte[]{89, -55, -127, -63};
        $$h = 144;
    }

    static void init$0() {
        $$a = new byte[]{com.google.common.base.Ascii.ETB, -2, 101, 6, -13, 1, 62, -67, 14, -25, com.google.common.base.Ascii.ETB, -9, -10, 67, -59, 4, -3, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -60, -6, com.google.common.base.Ascii.EM, -31, 16, -14, -6, 17, -3, -18, 10, -7, 0};
        $$b = 37;
    }

    @Override // com.payair.hce.getMDatabaseannotations
    public final int AlternateContactlessPaymentDataJson(byte[] bArr, int i, byte[] bArr2, int i2) throws com.payair.hce.getInvalidationTracker, java.lang.IllegalStateException {
        return ((java.lang.Integer) values(new java.lang.Object[]{this, bArr, java.lang.Integer.valueOf(i), bArr2, java.lang.Integer.valueOf(i2)}, 1189235428, -1189235428, i)).intValue();
    }
}
