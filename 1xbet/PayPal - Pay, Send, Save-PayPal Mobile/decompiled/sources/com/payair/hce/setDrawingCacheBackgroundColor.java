package com.payair.hce;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class setDrawingCacheBackgroundColor {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AlternateContactlessPaymentDataJson;
    private static java.lang.String DigitizedCardProfile;
    private static int IccPrivateKeyCrtComponentsJson;
    private static char RecordsJson;
    private static char SdkCoreAlternateContactlessPaymentDataImpl;
    private static int getAid;
    private static char[] getProfileVersion;
    private static char valueOf;
    private static java.lang.String values;
    private static char writeReplace;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = (s * 4) + 4;
        int i5 = 1 - (b * 3);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = i4;
            i3 = 0;
            i4 += -i6;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i4 += -i6;
            i2++;
            i = i3;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            int i7 = b2 + 65;
            i = 0;
            i2 = i4;
            i4 = i7;
            i3 = i + 1;
            bArr2[i] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bd, code lost:
    
        if (r1 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0113, code lost:
    
        if (r2 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0115, code lost:
    
        r2 = new java.lang.Object[1];
        a("\uf202굵ᑷﴭ鳸眷蘸魕Ͽኰ\uf0ee容", 12 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013e, code lost:
    
        return com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(((java.lang.String) r2[0]).intern(), true, (java.lang.Object) r15), new com.payair.hce.communication.JsonResponse(), 2, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        boolean contains;
        boolean booleanValue;
        java.lang.String intern;
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ~(i5 | i);
        int i7 = (i * (-711)) + (i2 * 713) + (((~(i4 | i)) | i6) * (-712)) + (((~(i | i4 | i5)) | (~(i2 | i | i3))) * (-712)) + ((i4 | i6) * 712);
        if (i7 == 1) {
            return AlternateContactlessPaymentDataJson(objArr);
        }
        if (i7 == 2) {
            return valueOf(objArr);
        }
        if (i7 != 3) {
            java.lang.String str = (java.lang.String) objArr[0];
            int i8 = IccPrivateKeyCrtComponentsJson;
            getAid = (i8 + 115) % 128;
            DigitizedCardProfile = str;
            getAid = (i8 + 11) % 128;
            return null;
        }
        com.payair.hce.setBackgroundTintMode setbackgroundtintmode = (com.payair.hce.setBackgroundTintMode) objArr[0];
        java.lang.String str2 = (java.lang.String) objArr[1];
        int i9 = getAid + 115;
        IccPrivateKeyCrtComponentsJson = i9 % 128;
        if (i9 % 2 != 0) {
            contains = com.payair.hce.setDuplicateParentStateEnabled.values.contains((java.lang.String) com.payair.hce.setBackgroundTintMode.values(new java.lang.Object[]{setbackgroundtintmode}, -436134590, 436134591, java.lang.System.identityHashCode(setbackgroundtintmode)));
            java.lang.String str3 = (java.lang.String) com.payair.hce.setBackgroundTintMode.values(new java.lang.Object[]{setbackgroundtintmode}, 524623352, -524623349, java.lang.System.identityHashCode(setbackgroundtintmode));
            char mirror = android.text.AndroidCharacter.getMirror((char) 22);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            b("'\u001a\u0004\u0014\u0012\u0015\u0015\u0002/0\u001a\u00180/\u0010\u0016\u0004\u001a\u0007*\u000f\t", '[' << mirror, (byte) (6303 % android.text.AndroidCharacter.getMirror(io.ktor.util.date.GMTDateParser.SECONDS)), objArr2);
            booleanValue = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str3, ((java.lang.String) objArr2[0]).intern()}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
        } else {
            contains = com.payair.hce.setDuplicateParentStateEnabled.values.contains((java.lang.String) com.payair.hce.setBackgroundTintMode.values(new java.lang.Object[]{setbackgroundtintmode}, -436134590, 436134591, java.lang.System.identityHashCode(setbackgroundtintmode)));
            java.lang.String str4 = (java.lang.String) com.payair.hce.setBackgroundTintMode.values(new java.lang.Object[]{setbackgroundtintmode}, 524623352, -524623349, java.lang.System.identityHashCode(setbackgroundtintmode));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            b("'\u001a\u0004\u0014\u0012\u0015\u0015\u0002/0\u001a\u00180/\u0010\u0016\u0004\u001a\u0007*\u000f\t", 'F' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (byte) (138 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), objArr3);
            booleanValue = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str4, ((java.lang.String) objArr3[0]).intern()}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
        }
        if (contains) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u0003 \u001b0&\u001d\u0003\u0007\n&\u0003!,*\u001c\u0000", 20 - android.view.View.combineMeasuredStates(0, 0), (byte) ((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 30), objArr4);
            intern = ((java.lang.String) objArr4[0]).intern();
        } else {
            IccPrivateKeyCrtComponentsJson = (getAid + 39) % 128;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            a("꺒笊㦲㷤鳸眷蘸魕Ͽኰ顏\uea36畴胙", android.text.TextUtils.indexOf("", "", 0) + 14, objArr5);
            intern = ((java.lang.String) objArr5[0]).intern();
        }
        throw new java.lang.IllegalArgumentException(intern);
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        IccPrivateKeyCrtComponentsJson = 0;
        getAid = 1;
        getAid();
        getAid = (IccPrivateKeyCrtComponentsJson + 69) % 128;
    }

    static void valueOf(java.lang.String str) {
        int i = IccPrivateKeyCrtComponentsJson;
        int i2 = i + 63;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            values = str;
            int i3 = i + 5;
            getAid = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        values = str;
        throw null;
    }

    static java.lang.String writeReplace() {
        int i = getAid + 55;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return values;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        int i = (getAid + 93) % 128;
        IccPrivateKeyCrtComponentsJson = i;
        java.lang.String str = DigitizedCardProfile;
        int i2 = i + 85;
        getAid = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static com.payair.hce.setActivated AlternateContactlessPaymentDataJson() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("숟彌ײַ䎝犺丘\ue980压滿囖煮ۣ꾳沸ꪜ鷵颐隙崯ꨋ睭䲟", android.graphics.Color.argb(0, 0, 0, 0) + 21, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        com.payair.hce.setActivated setactivated = (com.payair.hce.setActivated) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString()), new com.payair.hce.setActivated(), null);
        android.view.View.combineMeasuredStates(0, 0);
        android.widget.ExpandableListView.getPackedPositionForGroup(0);
        getAid = (IccPrivateKeyCrtComponentsJson + 73) % 128;
        return setactivated;
    }

    static com.payair.hce.setForegroundTintList values(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("\n/\u001c\u0014 \u001d\u001b#\u001b(&\b\u0018\u001c\b\r\u0005/\u0018'", (android.os.Process.myPid() >> 22) + 20, (byte) (109 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr);
        com.payair.hce.setForegroundTintList setforegroundtintlist = (com.payair.hce.setForegroundTintList) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(((java.lang.String) objArr[0]).intern()), new com.payair.hce.setForegroundTintList(), null, str);
        android.media.AudioTrack.getMinVolume();
        android.view.View.getDefaultSize(0, 0);
        getAid = (IccPrivateKeyCrtComponentsJson + 79) % 128;
        return setforegroundtintlist;
    }

    static com.payair.hce.setPadding writeReplace(com.payair.hce.setBackground setbackground) {
        java.lang.Object obj;
        getAid = (IccPrivateKeyCrtComponentsJson + 101) % 128;
        boolean contains = com.payair.hce.setBackground.getProfileVersion.contains(setbackground.writeReplace);
        boolean contains2 = com.payair.hce.setBackground.getAid.contains(setbackground.getAid);
        java.lang.String str = setbackground.DigitizedCardProfile;
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("'\u001a\u0004\u0014\u0012\u0015\u0015\u0002/0\u001a\u00180/\u0010\u0016\u0004\u001a\u0007*\u000f\t", 22 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), (byte) ((android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 89), objArr);
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str, ((java.lang.String) objArr[0]).intern()}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
        boolean z = setbackground.valueOf == null || setbackground.valueOf.length() == 0 || android.text.TextUtils.isDigitsOnly(java.lang.String.valueOf(setbackground.valueOf));
        java.lang.String str2 = setbackground.getProfileVersion;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("앴淨镛댲뵕놓\u192e\uf038⩁양᧭㝄\uf774\ue7da", 14 - (android.os.Process.myTid() >> 22), objArr2);
        boolean booleanValue2 = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str2, ((java.lang.String) objArr2[0]).intern()}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
        java.lang.String str3 = setbackground.getProfileVersion;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("\u000b\u0016㘎", 2 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (byte) (76 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr3);
        boolean booleanValue3 = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str3, ((java.lang.String) objArr3[0]).intern()}, -1924051175, 1924051175, (int) java.lang.System.currentTimeMillis())).booleanValue();
        if (contains && contains2 && booleanValue && z && booleanValue3) {
            getAid = (IccPrivateKeyCrtComponentsJson + 31) % 128;
            if (booleanValue2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                a("瓩㞕춷窱\ue9d1鸏毲畼ᷱ揬覂ପ헊抭꿇\uf52f棠ኜ", 18 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                return (com.payair.hce.setPadding) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setbackground), new com.payair.hce.setPadding(), 2);
            }
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        b("\u000f.\u0011\r\"(\u0001\u0019\u0011\r\u001e\f㙯", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, (byte) (android.text.TextUtils.getOffsetBefore("", 0) + 112), objArr5);
        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
        if (!contains) {
            IccPrivateKeyCrtComponentsJson = (getAid + 101) % 128;
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            a("꺒笊㦲㷤鳸眷蘸魕Ͽኰ顏\uea36畴胙", (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14, objArr6);
            intern = ((java.lang.String) objArr6[0]).intern();
        } else if (!contains2) {
            java.lang.Object[] objArr7 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u001b\u0007\u001c -$\u001b\u0007\u001f\u0007-\"\u0017\u0002\u0003&", 20 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (byte) (android.graphics.Color.argb(0, 0, 0, 0) + 121), objArr7);
            intern = ((java.lang.String) objArr7[0]).intern();
            getAid = (IccPrivateKeyCrtComponentsJson + 107) % 128;
        } else if (!booleanValue) {
            java.lang.Object[] objArr8 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u0003 \u001b0&\u001d\u0003\u0007\n&\u0003!,*\u001c\u0000", android.text.TextUtils.getCapsMode("", 0, 0) + 20, (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 31), objArr8);
            intern = ((java.lang.String) objArr8[0]).intern();
        } else if (!z) {
            int i = getAid + 25;
            IccPrivateKeyCrtComponentsJson = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                b("\u001f\u000b\u0001\u0019\u0006\n(#\" &#㘬", 102 / (android.view.ViewConfiguration.getMaximumDrawingCacheSize() * 53), (byte) (87 / android.text.TextUtils.lastIndexOf("", kotlin.text.Typography.greater, 1)), objArr9);
                obj = objArr9[0];
            } else {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                b("\u001f\u000b\u0001\u0019\u0006\n(#\" &#㘬", (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13, (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 57), objArr10);
                obj = objArr10[0];
            }
            intern = ((java.lang.String) obj).intern();
        } else if (!booleanValue2 || !booleanValue3) {
            android.graphics.Color.rgb(0, 0, 0);
            java.lang.String str4 = setbackground.getProfileVersion;
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\"*㙃", 8 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 81), objArr11);
            intern = ((java.lang.String) objArr11[0]).intern();
        }
        throw new java.lang.IllegalArgumentException(intern);
    }

    private static void a(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.getProductType getproducttype = new com.payair.hce.getProductType();
        char[] cArr = new char[charArray.length];
        getproducttype.AlternateContactlessPaymentDataJson = 0;
        char[] cArr2 = new char[2];
        while (getproducttype.AlternateContactlessPaymentDataJson < charArray.length) {
            $10 = ($11 + 27) % 128;
            cArr2[0] = charArray[getproducttype.AlternateContactlessPaymentDataJson];
            cArr2[1] = charArray[getproducttype.AlternateContactlessPaymentDataJson + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (writeReplace ^ 2144259807102049818L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(SdkCoreAlternateContactlessPaymentDataImpl)};
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 62, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 1335, (char) (1 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (short) 0, (byte) 45, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj);
                    }
                    char charValue = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    cArr2[1] = charValue;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr2[0]), java.lang.Integer.valueOf(((charValue << 4) + ((char) (AlternateContactlessPaymentDataJson ^ 2144259807102049818L))) ^ r13), java.lang.Integer.valueOf(charValue >>> 5), java.lang.Integer.valueOf(valueOf)};
                    int i4 = charValue + i2;
                    java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(338207329);
                    if (obj2 == null) {
                        java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(63 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1334, (char) android.text.TextUtils.getOffsetBefore("", 0));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        c((byte) 0, (short) 0, (byte) 45, objArr5);
                        obj2 = cls2.getMethod((java.lang.String) objArr5[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(338207329, obj2);
                    }
                    cArr2[0] = ((java.lang.Character) ((java.lang.reflect.Method) obj2).invoke(null, objArr4)).charValue();
                    i2 -= 40503;
                    i3++;
                    $10 = ($11 + 59) % 128;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr[getproducttype.AlternateContactlessPaymentDataJson] = cArr2[0];
            cArr[getproducttype.AlternateContactlessPaymentDataJson + 1] = cArr2[1];
            java.lang.Object[] objArr6 = {getproducttype, getproducttype};
            java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1765331150);
            if (obj3 == null) {
                obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(53 - android.widget.ExpandableListView.getPackedPositionType(0L), 3544 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).getMethod("r", java.lang.Object.class, java.lang.Object.class);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1765331150, obj3);
            }
            ((java.lang.reflect.Method) obj3).invoke(null, objArr6);
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i5 = $11 + 61;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    public static com.payair.hce.setPadding DigitizedCardProfile(com.payair.hce.setDuplicateParentStateEnabled setduplicateparentstateenabled, java.lang.String str) {
        boolean contains = com.payair.hce.setDuplicateParentStateEnabled.values.contains((java.lang.String) com.payair.hce.setDuplicateParentStateEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setduplicateparentstateenabled}, -1619079951, 1619079951, java.lang.System.identityHashCode(setduplicateparentstateenabled)));
        boolean contains2 = com.payair.hce.setDuplicateParentStateEnabled.writeReplace.contains((java.lang.String) com.payair.hce.setDuplicateParentStateEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setduplicateparentstateenabled}, -1612026116, 1612026124, java.lang.System.identityHashCode(setduplicateparentstateenabled)));
        java.lang.String str2 = (java.lang.String) com.payair.hce.setDuplicateParentStateEnabled.AlternateContactlessPaymentDataJson(new java.lang.Object[]{setduplicateparentstateenabled}, 1522848344, -1522848334, java.lang.System.identityHashCode(setduplicateparentstateenabled));
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("'\u001a\u0004\u0014\u0012\u0015\u0015\u0002/0\u001a\u00180/\u0010\u0016\u0004\u001a\u0007*\u000f\t", android.view.View.resolveSize(0, 0) + 22, (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 90), objArr);
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setMotionEventSplittingEnabled.DigitizedCardProfile(new java.lang.Object[]{str2, ((java.lang.String) objArr[0]).intern()}, -29560201, 29560202, (int) java.lang.System.currentTimeMillis())).booleanValue();
        if (contains) {
            int i = getAid;
            IccPrivateKeyCrtComponentsJson = (i + 53) % 128;
            if (contains2) {
                int i2 = i + 125;
                IccPrivateKeyCrtComponentsJson = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (booleanValue) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    a("\ud91a䒖绵잻颐隙䰽첤", 8 - android.text.TextUtils.indexOf("", ""), objArr2);
                    return (com.payair.hce.setPadding) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(((java.lang.String) objArr2[0]).intern(), true, (java.lang.Object) setduplicateparentstateenabled), new com.payair.hce.setPadding(), 2, str);
                }
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("\u000f.\u0011\r\"(\u0001\u0019\u0011\r\u001e\f㙯", android.text.TextUtils.getCapsMode("", 0, 0) + 13, (byte) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 112), objArr3);
        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
        if (!contains) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            a("꺒笊㦲㷤鳸眷蘸魕Ͽኰ顏\uea36畴胙", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14, objArr4);
            intern = ((java.lang.String) objArr4[0]).intern();
        } else if (!contains2) {
            IccPrivateKeyCrtComponentsJson = (getAid + 31) % 128;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u001b\u0007\u001c -$\u001b\u0007\u001f\u0007-\"\u0017\u0002\u0003&", (android.os.Process.myPid() >> 22) + 20, (byte) (121 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), objArr5);
            intern = ((java.lang.String) objArr5[0]).intern();
        } else if (!booleanValue) {
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u0003 \u001b0&\u001d\u0003\u0007\n&\u0003!,*\u001c\u0000", 19 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (byte) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 32), objArr6);
            intern = ((java.lang.String) objArr6[0]).intern();
            IccPrivateKeyCrtComponentsJson = (getAid + 55) % 128;
        }
        throw new java.lang.IllegalArgumentException(intern);
    }

    public static com.payair.hce.setPadding AlternateContactlessPaymentDataJson(com.payair.hce.setBackgroundColor setbackgroundcolor, java.lang.String str) {
        IccPrivateKeyCrtComponentsJson = (getAid + 89) % 128;
        if (!com.payair.hce.setDuplicateParentStateEnabled.writeReplace.contains((java.lang.String) com.payair.hce.setBackgroundColor.valueOf(new java.lang.Object[]{setbackgroundcolor}, 1464097489, -1464097489, java.lang.System.identityHashCode(setbackgroundcolor)))) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            b("\u001f\u000b\u0001\u0019\u001b\u0007\u001c -$\u001b\u0007\u001f\u0007-\"\u0017\u0002\u0003&", 20 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 120), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", 8 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(com.payair.hce.HCERegistration.getPaymentAppInstanceId());
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        b("\n\u0005\u000b\b\u0018\u001c\u001d#\u0007\u001f㘧", 10 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (40 - android.os.Process.getGidForName("")), objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        com.payair.hce.setPadding setpadding = (com.payair.hce.setPadding) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setbackgroundcolor), new com.payair.hce.setPadding(), 2, str);
        int i = IccPrivateKeyCrtComponentsJson + 85;
        getAid = i % 128;
        if (i % 2 != 0) {
            return setpadding;
        }
        throw null;
    }

    static com.payair.hce.setForegroundGravity AlternateContactlessPaymentDataJson(com.payair.hce.setClipBounds setclipbounds) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("\r\n\n\u001c!\u0007&\u000b0\u001d'\u0006\r\u000b\u0007\u0017-\u001c*\u0016#%\u0007\u0018㘀", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 25, (byte) (android.view.View.resolveSizeAndState(0, 0, 0) + 1), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb.append(intern);
        com.payair.hce.setForegroundGravity setforegroundgravity = (com.payair.hce.setForegroundGravity) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setclipbounds), new com.payair.hce.setForegroundGravity(), 2);
        android.media.AudioTrack.getMinVolume();
        int i = IccPrivateKeyCrtComponentsJson + 9;
        getAid = i % 128;
        if (i % 2 != 0) {
            return setforegroundgravity;
        }
        throw null;
    }

    static com.payair.hce.setForegroundTintMode valueOf() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("瓩㞕춷窱\ue9d1鸏\udf43ﲳ\uda18葰\u0b49\ueca0ﵬ➼鳸眷ꃍ퓇ꪜ鷵ശ븡", (android.os.Process.myPid() >> 22) + 21, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb.append(intern);
        com.payair.hce.setForegroundTintMode setforegroundtintmode = (com.payair.hce.setForegroundTintMode) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true), new com.payair.hce.setForegroundTintMode(), 2);
        android.view.View.resolveSizeAndState(0, 0, 0);
        int i = getAid + 107;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return setforegroundtintmode;
        }
        throw null;
    }

    static com.payair.hce.setForegroundTintMode values() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("瓩㞕춷窱\ue9d1鸏\udf43ﲳ\uda18葰\u0b49\ueca0\ue5c1ꚠ\ue818瘡⌍毿", android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 31, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb.append(intern);
        com.payair.hce.setForegroundTintMode setforegroundtintmode = (com.payair.hce.setForegroundTintMode) com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true), new com.payair.hce.setForegroundTintMode(), 2);
        android.media.AudioTrack.getMinVolume();
        IccPrivateKeyCrtComponentsJson = (getAid + 59) % 128;
        return setforegroundtintmode;
    }

    static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(com.payair.hce.setLeftTopRightBottom setlefttoprightbottom) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙ᷱ揬ヤ䈲팜囎", (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb.append(intern);
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setlefttoprightbottom), new com.payair.hce.communication.JsonResponse(), 2);
        android.graphics.Color.argb(0, 0, 0, 0);
        int i = IccPrivateKeyCrtComponentsJson + 19;
        getAid = i % 128;
        if (i % 2 != 0) {
            return sendRequest;
        }
        throw null;
    }

    static com.payair.hce.communication.JsonResponse writeReplace(com.payair.hce.setBackgroundTintBlendMode setbackgroundtintblendmode) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        b("\u000b\u0005\"\u0011#%!\n\r#*,\u0007\u0018\u0007\u001e㙏", android.graphics.Color.rgb(0, 0, 0) + 16777233, (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 81), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb.append(intern);
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setbackgroundtintblendmode), new com.payair.hce.communication.JsonResponse(), 2);
        android.view.Gravity.getAbsoluteGravity(0, 0);
        int i = IccPrivateKeyCrtComponentsJson + 63;
        getAid = i % 128;
        if (i % 2 != 0) {
            return sendRequest;
        }
        throw new java.lang.ArithmeticException();
    }

    static com.payair.hce.communication.JsonResponse writeReplace(com.payair.hce.setBackgroundResource setbackgroundresource) {
        com.payair.hce.HCERegistration.getPaymentAppInstanceId();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", 9 - android.view.View.MeasureSpec.getSize(0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.HCERegistration.getPaymentAppInstanceId());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("\u000b\u0005\"\u0011#%&\u001f/\u001d\b)\u001c\r", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13, (byte) ((android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 76), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        sb2.append(obj);
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb2.toString(), true, (java.lang.Object) setbackgroundresource), new com.payair.hce.communication.JsonResponse(), 2);
        android.os.SystemClock.elapsedRealtime();
        int i = IccPrivateKeyCrtComponentsJson + 121;
        getAid = i % 128;
        if (i % 2 != 0) {
            return sendRequest;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0160, code lost:
    
        r12 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), r2};
        r14 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(1553139325);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01ae, code lost:
    
        if (r14 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b0, code lost:
    
        r14 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(29 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 3596 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (1 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1))))).getMethod(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(1553139325, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0231, code lost:
    
        if (((java.lang.Integer) ((java.lang.reflect.Method) r14).invoke(null, r12)).intValue() != r2.SdkCoreAlternateContactlessPaymentDataImpl) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0233, code lost:
    
        com.payair.hce.setDrawingCacheBackgroundColor.$11 = (com.payair.hce.setDrawingCacheBackgroundColor.$10 + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023d, code lost:
    
        r12 = new java.lang.Object[]{r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, r2, java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r5), r2, java.lang.Integer.valueOf(r5), r2};
        r13 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(737480198);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0279, code lost:
    
        if (r13 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x027b, code lost:
    
        r9 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 49, 2665 - android.view.View.MeasureSpec.getSize(0), (char) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18889));
        r13 = new java.lang.Object[1];
        c((byte) 0, 0, (byte) 8, r13);
        r13 = r9.getMethod((java.lang.String) r13[0], java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class);
        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(737480198, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02e4, code lost:
    
        r9 = ((java.lang.Integer) ((java.lang.reflect.Method) r13).invoke(null, r12)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02f1, code lost:
    
        r12 = r2.AlternateContactlessPaymentDataJson;
        r13 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[r9];
        r6[r2.values + 1] = r3[(r12 * r5) + r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0355, code lost:
    
        r2.values += 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x030a, code lost:
    
        if (r2.DigitizedCardProfile != r2.AlternateContactlessPaymentDataJson) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x030c, code lost:
    
        com.payair.hce.setDrawingCacheBackgroundColor.$10 = (com.payair.hce.setDrawingCacheBackgroundColor.$11 + 97) % 128;
        r2.RecordsJson = ((r2.RecordsJson + r5) - 1) % r5;
        r2.SdkCoreAlternateContactlessPaymentDataImpl = ((r2.SdkCoreAlternateContactlessPaymentDataImpl + r5) - 1) % r5;
        r9 = r2.DigitizedCardProfile;
        r12 = r2.RecordsJson;
        r13 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r6[r2.values] = r3[(r9 * r5) + r12];
        r6[r2.values + 1] = r3[(r13 * r5) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x033c, code lost:
    
        r9 = r2.DigitizedCardProfile;
        r12 = r2.SdkCoreAlternateContactlessPaymentDataImpl;
        r13 = r2.AlternateContactlessPaymentDataJson;
        r14 = r2.RecordsJson;
        r6[r2.values] = r3[(r9 * r5) + r12];
        r6[r2.values + 1] = r3[(r13 * r5) + r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013e, code lost:
    
        com.payair.hce.setDrawingCacheBackgroundColor.$10 = (com.payair.hce.setDrawingCacheBackgroundColor.$11 + 43) % 128;
        r6[r2.values] = (char) (r2.valueOf - r30);
        r6[r2.values + 1] = (char) (r2.writeReplace - r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013c, code lost:
    
        if (r2.valueOf == r2.writeReplace) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(java.lang.String str, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        com.payair.hce.DigitizedCardJson12 digitizedCardJson12 = new com.payair.hce.DigitizedCardJson12();
        char[] cArr = getProfileVersion;
        long j = 0;
        char c = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            $11 = ($10 + 27) % 128;
            int i3 = 0;
            while (i3 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[c] = java.lang.Integer.valueOf(cArr[i3]);
                    java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
                    if (obj == null) {
                        java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(50 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 2509, (char) ((android.os.Process.myTid() >> 22) + 6802));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        c((byte) 0, (short) 0, (byte) 0, objArr3);
                        obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE);
                        com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1497284274, obj);
                    }
                    cArr2[i3] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                    c = 0;
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
        java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(RecordsJson)};
        java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1497284274);
        if (obj2 == null) {
            java.lang.Class cls2 = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 49, android.graphics.Color.argb(0, 0, 0, 0) + 2508, (char) (6850 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            c((byte) 0, (short) 0, (byte) 0, objArr5);
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
                int i4 = $10 + 85;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values];
                } else {
                    digitizedCardJson12.valueOf = charArray[digitizedCardJson12.values];
                    digitizedCardJson12.writeReplace = charArray[digitizedCardJson12.values + 1];
                }
            }
        }
        int i5 = 0;
        while (i5 < i) {
            int i6 = ($11 + 59) % 128;
            $10 = i6;
            cArr3[i5] = (char) (cArr3[i5] ^ 13722);
            i5++;
            $11 = (i6 + 65) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(java.lang.String str) {
        java.lang.StringBuilder sb;
        IccPrivateKeyCrtComponentsJson = (getAid + 59) % 128;
        if (((java.lang.Boolean) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1486464230, -1486464227, (int) java.lang.System.currentTimeMillis())).booleanValue()) {
            sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", 9 - android.view.KeyEvent.keyCodeFromString(""), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
        } else {
            sb = new java.lang.StringBuilder();
            sb.append((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 772749596, -772749510, (int) java.lang.System.currentTimeMillis()));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a("瓩㞕춷窱\ue9d1鸏毲畼ᷱ揬\ue6a2\ue354覂ପ헊抭꿇\uf52f棠ኜ", 20 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            str = ((java.lang.String) objArr2[0]).intern();
        }
        sb.append(str);
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true), new com.payair.hce.communication.JsonResponse(), 3);
        getAid = (IccPrivateKeyCrtComponentsJson + 33) % 128;
        return sendRequest;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.setBackgroundTintList setbackgroundtintlist = (com.payair.hce.setBackgroundTintList) objArr[0];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(com.payair.hce.setSaveFromParentEnabled.writeReplace());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("瓩㞕춷窱\ue9d1鸏毲畼ᷱ揬䆤\uf3bd꺪鳠箩췞춪摖ᠱ属㺰䷧잳Ώ", 23 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), true, (java.lang.Object) setbackgroundtintlist), new com.payair.hce.communication.JsonResponse(), 1);
        int i = IccPrivateKeyCrtComponentsJson + 11;
        getAid = i % 128;
        if (i % 2 != 0) {
            return sendRequest;
        }
        throw null;
    }

    static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(com.payair.hce.setBackgroundDrawable setbackgrounddrawable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 9, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.HCERegistration.getPaymentAppInstanceId());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("\n/\n\b,\u000e\u0014)\u001d-㘊", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 10, (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 34), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), setbackgrounddrawable), new com.payair.hce.communication.JsonResponse(), 2);
        IccPrivateKeyCrtComponentsJson = (getAid + 37) % 128;
        return sendRequest;
    }

    static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(java.util.List<com.payair.hce.setDuplicateParentStateEnabled.writeReplace> list, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", 9 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.HCERegistration.getPaymentAppInstanceId());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        b("\u000b\u0005\"\u0011#%&\u001f/\u001d\b) \r\u001e-㘠", android.os.Process.getGidForName("") + 18, (byte) (54 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString(), list), new com.payair.hce.communication.JsonResponse(), 1, str);
        getAid = (IccPrivateKeyCrtComponentsJson + 27) % 128;
        return sendRequest;
    }

    static com.payair.hce.communication.JsonResponse values(java.lang.String str, com.payair.hce.communication.JsonResponse jsonResponse) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        a("\ud91a䒖绵잻颐隙䰽첤\uec8fꍓ", 8 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(com.payair.hce.HCERegistration.getPaymentAppInstanceId());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a("⥧嚟\ue015疺慑䊒\uf0ee容\ue6a2\ue354\ue120\ueb5b淕胥慑䊒傚\ue8b5", 18 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        com.payair.hce.communication.JsonResponse sendRequest = com.payair.hce.communication.Connection.sendRequest(new com.payair.hce.communication.JsonRequest(sb.toString()), jsonResponse, 2, str);
        int i = getAid + 111;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 == 0) {
            return sendRequest;
        }
        throw null;
    }

    static void getAid() {
        AlternateContactlessPaymentDataJson = (char) 5808;
        valueOf = (char) 64971;
        writeReplace = (char) 37660;
        SdkCoreAlternateContactlessPaymentDataImpl = (char) 3846;
        getProfileVersion = new char[]{12292, 12300, 12337, 12327, 12334, 12294, 12316, 12345, 12290, 12351, 12331, 12289, 12389, 12325, 12297, 12306, 12318, 12312, 12291, 12293, 12348, 12350, 12394, 12309, 12319, 12303, 12332, 12400, 12344, 12336, 12298, 12335, 12296, 12326, 12321, 12301, 12329, 12314, 12313, 12328, 12302, 12323, 12322, 12324, 12339, 12346, 12299, 12295, 12333};
        RecordsJson = (char) 1495;
    }

    static com.payair.hce.communication.JsonResponse writeReplace(com.payair.hce.setBackgroundTintList setbackgroundtintlist) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{setbackgroundtintlist}, -206702460, 206702462, (int) java.lang.System.currentTimeMillis());
    }

    public static com.payair.hce.communication.JsonResponse AlternateContactlessPaymentDataJson(com.payair.hce.setBackgroundTintMode setbackgroundtintmode, java.lang.String str) {
        return (com.payair.hce.communication.JsonResponse) valueOf(new java.lang.Object[]{setbackgroundtintmode, str}, 1829196519, -1829196516, (int) java.lang.System.currentTimeMillis());
    }

    static java.lang.String DigitizedCardProfile() {
        return (java.lang.String) valueOf(new java.lang.Object[0], 2050148069, -2050148068, (int) java.lang.System.currentTimeMillis());
    }

    static void DigitizedCardProfile(java.lang.String str) {
        valueOf(new java.lang.Object[]{str}, 782711109, -782711109, (int) java.lang.System.currentTimeMillis());
    }

    static void init$0() {
        $$a = new byte[]{org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -79, -89, 69};
        $$b = 15;
    }
}
