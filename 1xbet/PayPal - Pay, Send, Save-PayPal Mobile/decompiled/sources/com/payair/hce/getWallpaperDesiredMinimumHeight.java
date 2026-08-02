package com.payair.hce;

/* loaded from: classes4.dex */
public final class getWallpaperDesiredMinimumHeight extends com.payair.hce.deleteDatabase {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int RecordsJson;
    private static char[] SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static int getPaymentFci;
    private static long getProfileVersion;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 35 - (b * 4);
        byte[] bArr = $$a;
        int i5 = (i * 3) + 65;
        int i6 = 3 - (s * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = (i7 + (-i6)) - 2;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i6 = i10;
            int i11 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + (-i6)) - 2;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i6 = i102;
            int i112 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void h(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        byte[] bArr = $$g;
        int i3 = (i * 16) + 99;
        int i4 = 4 - (b * 3);
        int i5 = s * 3;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i3;
            int i7 = 0;
            i3 = i4;
            i4++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 += i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    public getWallpaperDesiredMinimumHeight(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath, java.lang.String str, com.payair.hce.deleteFile deletefile, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        super(sendorderedbroadcast, getpackageresourcepath, str, deletefile, deletesharedpreferences);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AlternateContactlessPaymentDataJson);
        sb.append(com.payair.hce.removeStickyBroadcast.writeReplace);
        this.AlternateContactlessPaymentDataJson = sb.toString();
    }

    private static void c(int i, int i2, char c, java.lang.Object[] objArr) {
        com.payair.hce.getCvmModel getcvmmodel = new com.payair.hce.getCvmModel();
        long[] jArr = new long[i2];
        getcvmmodel.valueOf = 0;
        $10 = ($11 + 93) % 128;
        while (getcvmmodel.valueOf < i2) {
            int i3 = getcvmmodel.valueOf;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl[i + getcvmmodel.valueOf])};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(471988451);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((-16777168) - android.graphics.Color.rgb(0, 0, 0), android.text.TextUtils.indexOf("", "") + 381, (char) (62388 - android.view.KeyEvent.keyCodeFromString("")));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    h((short) 0, (byte) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(471988451, obj);
                }
                java.lang.Object[] objArr4 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(getcvmmodel.valueOf), java.lang.Long.valueOf(getProfileVersion), java.lang.Integer.valueOf(c)};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1455312558);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(36 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 3967, (char) (40223 - (android.os.Process.myTid() >> 22)))).getMethod("a", java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1455312558, obj2);
                }
                jArr[i3] = ((java.lang.Long) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).longValue();
                java.lang.Object[] objArr5 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(34 - android.graphics.Color.red(0), 211 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 85) % 128;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        getcvmmodel.valueOf = 0;
        while (getcvmmodel.valueOf < i2) {
            int i4 = $11 + 99;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
                java.lang.Object[] objArr6 = {getcvmmodel, getcvmmodel};
                java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
                if (obj4 == null) {
                    obj4 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(33 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), 211 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (char) android.view.Gravity.getAbsoluteGravity(0, 0))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj4);
                }
                ((java.lang.reflect.Method) obj4).invoke(null, objArr6);
                throw new java.lang.ArithmeticException();
            }
            cArr[getcvmmodel.valueOf] = (char) jArr[getcvmmodel.valueOf];
            java.lang.Object[] objArr7 = {getcvmmodel, getcvmmodel};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(885690656);
            if (obj5 == null) {
                obj5 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.Color.argb(0, 0, 0, 0) + 34, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 211, (char) ((android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1))).getMethod("d", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(885690656, obj5);
            }
            ((java.lang.reflect.Method) obj5).invoke(null, objArr7);
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = $11 + 7;
        $10 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            $11 = ($10 + 121) % 128;
            digitizedCardJson11.values = charArray[digitizedCardJson11.DigitizedCardProfile];
            cArr[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i5 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr[i5]), java.lang.Integer.valueOf(RecordsJson)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(43 - android.view.View.combineMeasuredStates(0, 0), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2073, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    h((short) 0, (byte) 0, 1, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr[i5] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 53, android.view.Gravity.getAbsoluteGravity(0, 0) + 3543, (char) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj2);
                }
                ((java.lang.reflect.Method) obj2).invoke(null, objArr4);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            digitizedCardJson11.AlternateContactlessPaymentDataJson = i2;
            char[] cArr2 = new char[i3];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i3);
            java.lang.System.arraycopy(cArr2, 0, cArr, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr2, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            $11 = ($10 + 3) % 128;
            char[] cArr3 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                cArr3[digitizedCardJson11.DigitizedCardProfile] = cArr[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 3543 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-1) - android.view.MotionEvent.axisFromString("")))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // com.payair.hce.deleteDatabase
    public final void writeReplace() {
        int i = getPaymentFci + 57;
        getAid = i % 128;
        if (i % 2 == 0) {
            com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
            if (!((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).writeReplace()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(true, "\u0003\u0000\u0003\u0003\ufff6\u0010\n\ufff9\u0001\ufff2\u0003\ufff8\u0000\u0005\u0001\n\u0003\ufff4\u0010￼\ufff5\u0004", 184 - android.view.MotionEvent.axisFromString(""), (-16777194) - android.graphics.Color.rgb(0, 0, 0), 22 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(true, "\u0011\u0010\u0003\u0012\u0003\u000b\uffff\u0010\uffff\u000eﾾ\f\r\u0007\u0012\uffff\u0001\u0007\f\u0013\u000b\u000b\r￡ￌ\u0005\f\u0007\u0011\u0011\u0007\u000bﾾ\u0003\u0010\uffffﾾ", 204 - (android.view.ViewConfiguration.getTapTimeout() >> 16), 23 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 38 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                this.DigitizedCardProfile.writeReplace(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson, new com.payair.hce.fileList(null, this.values, intern, ((java.lang.String) objArr2[0]).intern())), AlternateContactlessPaymentDataJson());
                return;
            }
            try {
                java.lang.String buildAsJson = values().buildAsJson();
                int i2 = com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson;
                com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
                com.payair.hce.equals DigitizedCardProfile = ((com.payair.hce.hashCode) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 905350733, -905350733, java.lang.System.identityHashCode(sendorderedbroadcast2))).DigitizedCardProfile(com.payair.hce.component6.DigitizedCardProfile, this.AlternateContactlessPaymentDataJson, buildAsJson, this.IccPrivateKeyCrtComponentsJson);
                if (DigitizedCardProfile != null) {
                    int i3 = getAid + 47;
                    getPaymentFci = i3 % 128;
                    if (i3 % 2 != 0) {
                        DigitizedCardProfile.DigitizedCardProfile();
                    } else {
                        DigitizedCardProfile.DigitizedCardProfile();
                        throw null;
                    }
                }
                if (DigitizedCardProfile.DigitizedCardProfile() != 200) {
                    int i4 = getPaymentFci + 5;
                    getAid = i4 % 128;
                    if (i4 % 2 == 0) {
                        if (DigitizedCardProfile.DigitizedCardProfile() == 204) {
                        }
                        DigitizedCardProfile(DigitizedCardProfile);
                        return;
                    } else {
                        if (DigitizedCardProfile.DigitizedCardProfile() == 12003) {
                        }
                        DigitizedCardProfile(DigitizedCardProfile);
                        return;
                    }
                }
                this.DigitizedCardProfile.DigitizedCardProfile(new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson, new com.payair.hce.fileList(null, this.values)));
                return;
            } catch (com.payair.hce.VisaReperso e) {
                com.payair.hce.getDatabasePath getdatabasepath = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson, new com.payair.hce.fileList(this.values, e.writeReplace(), e.getMessage()));
                com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath, e}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath));
                this.DigitizedCardProfile.writeReplace(getdatabasepath, AlternateContactlessPaymentDataJson());
                return;
            } catch (com.payair.hce.component5 e2) {
                java.lang.String str = this.values;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(true, "\u0003\u0000\u0003\u0003\ufff6\u0010\n\ufff9\u0001\ufff2\u0003\ufff8\u0000\u0005\u0001\n\u0003\ufff4\u0010￼\ufff5\u0004", 185 - android.view.View.combineMeasuredStates(0, 0), 21 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.view.Gravity.getAbsoluteGravity(0, 0) + 22, objArr3);
                java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(true, "￭ￅ\n\u0019\u001a\b\n\u001d\nￅ\u0014\u0019ￅ\t\n\u0011\u000e\u0006￫ￓ\u0019\u0018\n\u001a\u0016\n\u0017ￅ\ufff5\ufff9\ufff9", 197 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 19 - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32, objArr4);
                com.payair.hce.getDatabasePath getdatabasepath2 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson, new com.payair.hce.fileList(str, intern2, ((java.lang.String) objArr4[0]).intern()));
                com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath2, e2}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath2));
                this.DigitizedCardProfile.writeReplace(getdatabasepath2, AlternateContactlessPaymentDataJson());
                return;
            } catch (java.security.GeneralSecurityException e3) {
                java.lang.String str2 = this.values;
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                a(true, "\u0003\u0000\u0003\u0003\ufff6\u0010\n\ufff9\u0001\ufff2\u0003\ufff8\u0000\u0005\u0001\n\u0003\ufff4\u0010￼\ufff5\u0004", 185 - (android.os.Process.myTid() >> 22), 22 - android.view.View.combineMeasuredStates(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 22, objArr5);
                java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(true, "ￇ\u0016\u001bￇ\u000b\f\u0013\u0010\b￭ￕ￫ￔ\ufffa\ufff4￪ￇ\u0019\u0016\rￇ\u001b\u001a\f\u001c\u0018\f\u0019ￇ\u001b\u0017 \u0019\n\u0015\f", 195 - android.graphics.Color.blue(0), android.text.TextUtils.indexOf("", "", 0, 0) + 10, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35, objArr6);
                com.payair.hce.getDatabasePath getdatabasepath3 = new com.payair.hce.getDatabasePath(com.payair.hce.sendOrderedBroadcastAsUser.AlternateContactlessPaymentDataJson, new com.payair.hce.fileList(str2, intern3, ((java.lang.String) objArr6[0]).intern()));
                com.payair.hce.getDatabasePath.DigitizedCardProfile(new java.lang.Object[]{getdatabasepath3, e3}, -1478206329, 1478206329, java.lang.System.identityHashCode(getdatabasepath3));
                this.DigitizedCardProfile.writeReplace(getdatabasepath3, AlternateContactlessPaymentDataJson());
                return;
            }
        }
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
        ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast3))).writeReplace();
        throw null;
    }

    @Override // com.payair.hce.deleteDatabase
    final com.mastercard.mpsdk.remotemanagement.api.json.CmsDApiRequest values() throws java.security.GeneralSecurityException {
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast = this.valueOf;
        java.lang.String DigitizedCardProfile = ((com.payair.hce.setStatusMessage) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast}, -633422505, 633422510, java.lang.System.identityHashCode(sendorderedbroadcast))).values().DigitizedCardProfile();
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast2 = this.valueOf;
        java.lang.String str = new java.lang.String(((com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast2}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast2))).writeReplace());
        com.payair.hce.sendOrderedBroadcast sendorderedbroadcast3 = this.valueOf;
        com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest requestSessionRequest = new com.mastercard.mpsdk.remotemanagement.api.json.RequestSessionRequest(DigitizedCardProfile, str, new java.lang.String(((com.payair.hce.updateRNSInformation) com.payair.hce.sendOrderedBroadcast.DigitizedCardProfile(new java.lang.Object[]{sendorderedbroadcast3}, 389581613, -389581611, java.lang.System.identityHashCode(sendorderedbroadcast3))).AlternateContactlessPaymentDataJson()));
        getPaymentFci = (getAid + 27) % 128;
        return requestSessionRequest;
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getAid = 0;
        getPaymentFci = 1;
        RecordsJson = 1889207051;
        SdkCoreAlternateContactlessPaymentDataImpl = new char[]{24264, 37541, 50693, 15282, 28530, 41191, 37982, 51655, 15792, 28973, 41652, 38411, 52213, 16237, 28890, 42059, 38957, 43573, 26200, 13048, 53071, 39823, 21530, 24739, 15674, 51533, 34256, 22093, 25337, 16128, 52126, 24284, 37545, 50710, 15244, 28530, 41200, 37952, 51668, 15794, 28987, 37931, 22607, 3305, 61805, 42451, 27161, 24254, 811, 63308, 48084, 26750, 23792, 268, 62924, 47664, 28325, 21187, 1898, 52129, 47167, 27784, 20776, 1471, 51665, 48719, 25343, 22372, 7061, 51217, 48311, 24837, 21841, 6594, 52858, 45712, 26398, 11172, 17355, 36779, 56080, 9877, 29305, 48616, 35156, 54413, 8369, 27682, 49042, 35611, 55035, 8807, 28108, 47365, 34090, 53400, 7242, 28612, 47983, 34518, 53838, 7730, 27062, 46344, 32926, 52346, 24283, 37551, 50739, 15259, 28519, 41185, 38004, 51668, 15781, 28969, 41600, 54020, 8032, 19398, 46658, 58108, 11574, 6545, 17412, 45155, 64763, 12113, 7135, 17955, 45795, 64799, 10634, 5612, 16453, 35982, 65291, 11255, 5701, 17117, 36564, 63843, 9675, 4188, 23730, 36652, 64404, 9743, 4734, 24314, 35140, 31465, 46724, 57892, 8080, 19271, 33991, 45182, 60898, 6549, 21789, 34432, 45694, 61322, 6941, 21708, 32893, 48151, 59839, 9507, 22234, 33362, 49140, 60264};
        getProfileVersion = 1651990364216726208L;
    }

    static void init$1() {
        $$g = new byte[]{92, -25, 4, -11};
        $$h = 206;
    }

    static void init$0() {
        $$a = new byte[]{107, -45, -30, com.google.common.base.Ascii.FS, -45, -10, 13, -15, 2, com.google.common.base.Ascii.VT, -21, 13, 32, -46, -1, -8, 17, -4, -19, 6, 5, com.visa.cbp.getEncExpo.onUnminimized, -2, 33, -19, -26, 10, 6, -11, -8, 46, -31, -21, 17, com.google.common.base.Ascii.NAK, -43, 2, -1};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
    }

    public static java.lang.Object[] valueOf(android.content.Context context, int i, int i2) {
        int i3 = 0;
        try {
            if (context == null) {
                java.lang.Object[] objArr = {new int[]{i}, new int[]{i}, null, new int[1]};
                int i4 = ~i;
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i4 | (-354451167))) | 650477818) * (-602)) + 1066170050 + (((~(i | (-354451167))) | 67109082 | (~(937819902 | i4))) * (-301)) + ((~(i4 | 650477818)) * 301))};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2713, (char) (android.os.Process.myTid() >> 22));
                    byte b = (byte) ($$a[14] + 1);
                    byte b2 = b;
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b(b, b2, b2, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj);
                }
                ((int[]) objArr[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).intValue();
                return objArr;
            }
            try {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a(false, "ￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚ", 197 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), 16 - android.view.View.resolveSize(0, 0), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 39, objArr4);
                java.lang.Object[] objArr5 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(java.lang.Class.forName(((java.lang.String) objArr4[0]).intern()), 2);
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                a(false, "￬\u0019\u000f\u001d\u001a\u0014\u000fￋ\uffef\u0010\r \u0012ￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮￨\u0000\ufffe￮\ufff9￨", 239 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.Color.alpha(0) + 28, 31 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr6);
                try {
                    java.lang.Object[] objArr7 = {((java.lang.String) objArr6[0]).intern()};
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    a(false, "ￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚ", 197 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 16 - android.view.View.getDefaultSize(0, 0), 38 - android.view.View.getDefaultSize(0, 0), objArr8);
                    objArr5[0] = java.lang.Class.forName(((java.lang.String) objArr8[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr7);
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    a(false, "\uffef\u0010\r \u0012￮￨\u0000\ufffeￗ\ufffa￨￬\u0019\u000f\u001d\u001a\u0014\u000fￗ￮\ufff9￨￬\u0019\u000f\u001d\u001a\u0014\u000fￋ", 190 - android.view.MotionEvent.axisFromString(""), 5 - android.text.TextUtils.getTrimmedLength(""), ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 32, objArr9);
                    try {
                        java.lang.Object[] objArr10 = {((java.lang.String) objArr9[0]).intern()};
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        a(false, "ￕￕￓ�ￚￕￕ\ufff5\u0017\u000e\u0013\b\u000e\u0015\u0006\u0011\u000f\u0006\u001b\u0006\u001dￓ\u0018\n\b\u001a\u0017\u000e\u0019\u001eￓ\u0006\u001a\u0019\rￓ\u001dￚ", 196 - android.view.MotionEvent.axisFromString(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, android.view.View.combineMeasuredStates(0, 0) + 38, objArr11);
                        objArr5[1] = java.lang.Class.forName(((java.lang.String) objArr11[0]).intern()).getDeclaredConstructor(java.lang.String.class).newInstance(objArr10);
                        try {
                            java.lang.Object[] objArr12 = new java.lang.Object[1];
                            a(false, "\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t", 207 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 5 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 23 - (android.os.Process.myPid() >> 22), objArr12);
                            java.lang.Class<?> cls2 = java.lang.Class.forName(((java.lang.String) objArr12[0]).intern());
                            java.lang.Object[] objArr13 = new java.lang.Object[1];
                            c((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 17 - android.view.View.getDefaultSize(0, 0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr13);
                            java.lang.Object invoke = cls2.getMethod(((java.lang.String) objArr13[0]).intern(), null).invoke(context, null);
                            try {
                                java.lang.Object[] objArr14 = new java.lang.Object[1];
                                a(false, "\u000f\u0000\u0013\u000f￼\t\uffff\r\n\u0004\uffff\uffc9\ufffe\n\t\u000f\u0000\t\u000f\uffc9\uffde\n\t", (android.os.Process.myTid() >> 22) + 207, 4 - (android.os.Process.myTid() >> 22), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22, objArr14);
                                java.lang.Class<?> cls3 = java.lang.Class.forName(((java.lang.String) objArr14[0]).intern());
                                java.lang.Object[] objArr15 = new java.lang.Object[1];
                                a(false, "\u0011￭\ufffe\u0000\b\ufffe\u0004\u0002￫\ufffe\n\u0002\u0004\u0002", 205 - android.view.KeyEvent.getDeadChar(0, 0), 12 - android.widget.ExpandableListView.getPackedPositionType(0L), 14 - android.text.TextUtils.getOffsetBefore("", 0), objArr15);
                                try {
                                    java.lang.Object[] objArr16 = {cls3.getMethod(((java.lang.String) objArr15[0]).intern(), null).invoke(context, null), 64};
                                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                                    a(false, "\u000bￌ￮\uffff\u0001\t\uffff\u0005\u0003￫\uffff\f\uffff\u0005\u0003\u0010\uffff\f\u0002\u0010\r\u0007\u0002ￌ\u0001\r\f\u0012\u0003\f\u0012ￌ\u000e", 204 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 17, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 33, objArr17);
                                    java.lang.Class<?> cls4 = java.lang.Class.forName(((java.lang.String) objArr17[0]).intern());
                                    java.lang.Object[] objArr18 = new java.lang.Object[1];
                                    c((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, android.text.TextUtils.indexOf("", "", 0, 0) + 14, (char) (62717 - android.widget.ExpandableListView.getPackedPositionType(0L)), objArr18);
                                    java.lang.Object invoke2 = cls4.getMethod(((java.lang.String) objArr18[0]).intern(), java.lang.String.class, java.lang.Integer.TYPE).invoke(invoke, objArr16);
                                    java.lang.Object[] objArr19 = new java.lang.Object[1];
                                    a(true, "\r\u0004\u0013\r\u000e\u0002ￍ\u0003\b\u000e\u0011\u0003\r\u0000\u000e\u0005\r￨\u0004\u0006\u0000\n\u0002\u0000\uffefￍ\f\u000fￍ\u0013", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 203, 13 - android.view.MotionEvent.axisFromString(""), 31 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr19);
                                    java.lang.Class<?> cls5 = java.lang.Class.forName(((java.lang.String) objArr19[0]).intern());
                                    java.lang.Object[] objArr20 = new java.lang.Object[1];
                                    c(32 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), 9 - android.graphics.ImageFormat.getBitsPerPixel(0), (char) (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr20);
                                    java.lang.Object[] objArr21 = (java.lang.Object[]) cls5.getField(((java.lang.String) objArr20[0]).intern()).get(invoke2);
                                    int length = objArr21.length;
                                    int i5 = 0;
                                    while (i5 < length) {
                                        java.lang.Object obj2 = objArr21[i5];
                                        java.lang.Object[] objArr22 = new java.lang.Object[1];
                                        a(false, "\ufffb\ufff6\uffff\u001e\ufff4", android.graphics.Color.green(i3) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 3 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, objArr22);
                                        try {
                                            java.lang.Object[] objArr23 = {((java.lang.String) objArr22[i3]).intern()};
                                            long packedPositionForGroup = android.widget.ExpandableListView.getPackedPositionForGroup(i3);
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            c((packedPositionForGroup > 0L ? 1 : (packedPositionForGroup == 0L ? 0 : -1)) + 41, (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (char) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 51950), objArr24);
                                            java.lang.Class<?> cls6 = java.lang.Class.forName(((java.lang.String) objArr24[0]).intern());
                                            java.lang.Object[] objArr25 = new java.lang.Object[1];
                                            a(true, "\ufffe￼\u0007\ufffa\r\f\u0007￢\r\ufffe\u0000", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, (android.os.Process.myPid() >> 22) + 11, 11 - android.graphics.Color.blue(0), objArr25);
                                            java.lang.Object invoke3 = cls6.getMethod(((java.lang.String) objArr25[0]).intern(), java.lang.String.class).invoke(null, objArr23);
                                            try {
                                                java.lang.Object[] objArr26 = new java.lang.Object[1];
                                                c((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 78, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 29, (char) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 7430), objArr26);
                                                java.lang.Class<?> cls7 = java.lang.Class.forName(((java.lang.String) objArr26[0]).intern());
                                                java.lang.Object[] objArr27 = objArr21;
                                                java.lang.Object[] objArr28 = new java.lang.Object[1];
                                                c(106 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), android.view.Gravity.getAbsoluteGravity(0, 0) + 11, (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr28);
                                                try {
                                                    java.lang.Object[] objArr29 = {new java.io.ByteArrayInputStream((byte[]) cls7.getMethod(((java.lang.String) objArr28[0]).intern(), null).invoke(obj2, null))};
                                                    java.lang.Object[] objArr30 = new java.lang.Object[1];
                                                    c(40 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 37, (char) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 51950), objArr30);
                                                    java.lang.Class<?> cls8 = java.lang.Class.forName(((java.lang.String) objArr30[0]).intern());
                                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                                    a(true, "\ufffa\u000b\ufffe\u0007\ufffe\u0000\ufffe\r\ufffa￼\u0002\uffff\u0002\r\u000b\ufffeￜ\ufffe\r", (android.os.Process.myTid() >> 22) + com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 6 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 18 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr31);
                                                    java.lang.Object invoke4 = cls8.getMethod(((java.lang.String) objArr31[0]).intern(), java.io.InputStream.class).invoke(invoke3, objArr29);
                                                    int length2 = objArr5.length;
                                                    for (int i6 = 0; i6 < 2; i6++) {
                                                        java.lang.Object obj3 = objArr5[i6];
                                                        try {
                                                            java.lang.Object[] objArr32 = new java.lang.Object[1];
                                                            c(android.text.TextUtils.getOffsetBefore("", 0) + 117, android.graphics.Color.green(0) + 34, (char) (android.graphics.Color.alpha(0) + 36289), objArr32);
                                                            java.lang.Class<?> cls9 = java.lang.Class.forName(((java.lang.String) objArr32[0]).intern());
                                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                                            c(151 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 23, (char) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 9249), objArr33);
                                                            if (obj3.equals(cls9.getMethod(((java.lang.String) objArr33[0]).intern(), null).invoke(invoke4, null))) {
                                                                java.lang.Object[] objArr34 = {new int[]{i}, new int[]{i ^ 1}, null, new int[1]};
                                                                int i7 = ~i;
                                                                try {
                                                                    java.lang.Object[] objArr35 = {java.lang.Integer.valueOf(i2), 16, java.lang.Integer.valueOf(((((~((-153530276) | i7)) | r5) * 1150) - 1303619152) + (((~((-851398710) | i)) | (~(851398709 | i7))) * (-575)) + (((~(i7 | 153530275)) | (~((-153530276) | i))) * 575))};
                                                                    java.lang.Object obj4 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
                                                                    if (obj4 == null) {
                                                                        java.lang.Class cls10 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 51, 2714 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) ((-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)));
                                                                        byte b3 = (byte) ($$a[14] + 1);
                                                                        byte b4 = b3;
                                                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                                                        b(b3, b4, b4, objArr36);
                                                                        obj4 = cls10.getMethod((java.lang.String) objArr36[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                                                                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj4);
                                                                    }
                                                                    ((int[]) objArr34[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj4).invoke(null, objArr35)).intValue();
                                                                    return objArr34;
                                                                } catch (java.lang.Throwable th) {
                                                                    java.lang.Throwable cause = th.getCause();
                                                                    if (cause != null) {
                                                                        throw cause;
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th2) {
                                                            java.lang.Throwable cause2 = th2.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th2;
                                                        }
                                                    }
                                                    i5++;
                                                    objArr21 = objArr27;
                                                    i3 = 0;
                                                } catch (java.lang.Throwable th3) {
                                                    java.lang.Throwable cause3 = th3.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th3;
                                                }
                                            } catch (java.lang.Throwable th4) {
                                                java.lang.Throwable cause4 = th4.getCause();
                                                if (cause4 != null) {
                                                    throw cause4;
                                                }
                                                throw th4;
                                            }
                                        } catch (java.lang.Throwable th5) {
                                            java.lang.Throwable cause5 = th5.getCause();
                                            if (cause5 != null) {
                                                throw cause5;
                                            }
                                            throw th5;
                                        }
                                    }
                                } catch (java.lang.Throwable th6) {
                                    java.lang.Throwable cause6 = th6.getCause();
                                    if (cause6 != null) {
                                        throw cause6;
                                    }
                                    throw th6;
                                }
                            } catch (java.lang.Throwable th7) {
                                java.lang.Throwable cause7 = th7.getCause();
                                if (cause7 != null) {
                                    throw cause7;
                                }
                                throw th7;
                            }
                        } catch (java.lang.Throwable th8) {
                            java.lang.Throwable cause8 = th8.getCause();
                            if (cause8 != null) {
                                throw cause8;
                            }
                            throw th8;
                        }
                    } catch (java.lang.Throwable th9) {
                        java.lang.Throwable cause9 = th9.getCause();
                        if (cause9 != null) {
                            throw cause9;
                        }
                        throw th9;
                    }
                } catch (java.lang.Throwable th10) {
                    java.lang.Throwable cause10 = th10.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th10;
                }
            } catch (java.lang.Throwable unused) {
            }
            java.lang.Object[] objArr37 = {new int[]{i}, new int[]{i}, null, new int[1]};
            int i8 = ~i;
            java.lang.Object[] objArr38 = {java.lang.Integer.valueOf(i2), 0, java.lang.Integer.valueOf((((~(i8 | (-512436418))) | 42019008 | (~(i8 | 492492567))) * 464) + 340917176 + (((-470417410) | i) * (-464)) + (((~(i | 492492567)) | 42019008) * 464))};
            java.lang.Object obj5 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1347122530);
            if (obj5 == null) {
                java.lang.Class cls11 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.ImageFormat.getBitsPerPixel(0) + 51, 2713 - android.text.TextUtils.indexOf("", "", 0, 0), (char) (android.view.KeyEvent.getMaxKeyCode() >> 16));
                byte b5 = (byte) ($$a[14] + 1);
                byte b6 = b5;
                java.lang.Object[] objArr39 = new java.lang.Object[1];
                b(b5, b6, b6, objArr39);
                obj5 = cls11.getMethod((java.lang.String) objArr39[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1347122530, obj5);
            }
            ((int[]) objArr37[3])[0] = ((java.lang.Integer) ((java.lang.reflect.Method) obj5).invoke(null, objArr38)).intValue();
            return objArr37;
        } catch (java.lang.Throwable th11) {
            java.lang.Throwable cause11 = th11.getCause();
            if (cause11 != null) {
                throw cause11;
            }
            throw th11;
        }
    }
}
