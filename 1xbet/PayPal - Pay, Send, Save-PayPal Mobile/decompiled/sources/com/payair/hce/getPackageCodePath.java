package com.payair.hce;

/* loaded from: classes4.dex */
public final class getPackageCodePath {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int IccPrivateKeyCrtComponentsJson;
    private static int valueOf;
    private static int values;
    private final java.util.concurrent.atomic.AtomicLong AlternateContactlessPaymentDataJson = new java.util.concurrent.atomic.AtomicLong();
    private com.payair.hce.sendOrderedBroadcast DigitizedCardProfile;
    private com.payair.hce.getPackageResourcePath writeReplace;

    public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~i3;
        if ((i * (-183)) + (i2 * 185) + ((i2 | i4) * (-368)) + ((i | i5 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) + (((~(i | i6)) | (~(i4 | i5)) | (~(i2 | i))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE) != 1) {
            return values(objArr);
        }
        com.payair.hce.getPackageCodePath getpackagecodepath = (com.payair.hce.getPackageCodePath) objArr[0];
        com.payair.hce.deleteSharedPreferences deletesharedpreferences = (com.payair.hce.deleteSharedPreferences) objArr[1];
        com.payair.hce.getWallpaperDesiredMinimumHeight getwallpaperdesiredminimumheight = new com.payair.hce.getWallpaperDesiredMinimumHeight(getpackagecodepath.DigitizedCardProfile, getpackagecodepath.writeReplace, getpackagecodepath.values(), new com.payair.hce.deleteFile(), deletesharedpreferences);
        IccPrivateKeyCrtComponentsJson = (valueOf + 41) % 128;
        return getwallpaperdesiredminimumheight;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 4 - (s * 4);
        int i5 = 115 - (i * 4);
        int i6 = b * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i5;
            i2 = 0;
            i3 = i4;
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i3];
            i4 += -i7;
            i3++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i4;
            i4 = i5;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    getPackageCodePath(com.payair.hce.sendOrderedBroadcast sendorderedbroadcast, com.payair.hce.getPackageResourcePath getpackageresourcepath) {
        this.DigitizedCardProfile = sendorderedbroadcast;
        this.writeReplace = getpackageresourcepath;
    }

    public final void valueOf(com.payair.hce.getPackageResourcePath getpackageresourcepath) {
        int i = IccPrivateKeyCrtComponentsJson + 43;
        valueOf = i % 128;
        if (i % 2 == 0) {
            this.writeReplace = getpackageresourcepath;
        } else {
            this.writeReplace = getpackageresourcepath;
            throw new java.lang.ArithmeticException();
        }
    }

    public final com.payair.hce.startActivities valueOf(com.payair.hce.getFilesDir getfilesdir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.startActivities startactivities = new com.payair.hce.startActivities(this.DigitizedCardProfile, this.writeReplace, values(), getfilesdir, deletesharedpreferences);
        int i = IccPrivateKeyCrtComponentsJson + 15;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return startactivities;
        }
        throw new java.lang.ArithmeticException();
    }

    public final com.payair.hce.sendBroadcast DigitizedCardProfile(com.payair.hce.getExternalFilesDir getexternalfilesdir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.sendBroadcast sendbroadcast = new com.payair.hce.sendBroadcast(this.DigitizedCardProfile, this.writeReplace, values(), getexternalfilesdir, deletesharedpreferences);
        int i = valueOf + 109;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return sendbroadcast;
        }
        throw null;
    }

    private static void a(boolean z, java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 61) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.payair.hce.DigitizedCardJson11 digitizedCardJson11 = new com.payair.hce.DigitizedCardJson11();
        char[] cArr3 = new char[i3];
        digitizedCardJson11.DigitizedCardProfile = 0;
        while (digitizedCardJson11.DigitizedCardProfile < i3) {
            digitizedCardJson11.values = cArr2[digitizedCardJson11.DigitizedCardProfile];
            cArr3[digitizedCardJson11.DigitizedCardProfile] = (char) (i + digitizedCardJson11.values);
            int i4 = digitizedCardJson11.DigitizedCardProfile;
            try {
                java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(cArr3[i4]), java.lang.Integer.valueOf(values)};
                java.lang.Object obj = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(414841307);
                if (obj == null) {
                    java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, 2074 - (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 60037));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    b((byte) 0, (short) 0, 0, objArr3);
                    obj = cls.getMethod((java.lang.String) objArr3[0], java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(414841307, obj);
                }
                cArr3[i4] = ((java.lang.Character) ((java.lang.reflect.Method) obj).invoke(null, objArr2)).charValue();
                java.lang.Object[] objArr4 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj2 == null) {
                    obj2 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 52, 3543 - android.view.View.resolveSize(0, 0), (char) android.text.TextUtils.getTrimmedLength(""))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
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
            char[] cArr4 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr4, 0, i3);
            java.lang.System.arraycopy(cArr4, 0, cArr3, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson, digitizedCardJson11.AlternateContactlessPaymentDataJson);
            java.lang.System.arraycopy(cArr4, digitizedCardJson11.AlternateContactlessPaymentDataJson, cArr3, 0, i3 - digitizedCardJson11.AlternateContactlessPaymentDataJson);
        }
        if (z) {
            char[] cArr5 = new char[i3];
            digitizedCardJson11.DigitizedCardProfile = 0;
            while (digitizedCardJson11.DigitizedCardProfile < i3) {
                $10 = ($11 + 107) % 128;
                cArr5[digitizedCardJson11.DigitizedCardProfile] = cArr3[(i3 - digitizedCardJson11.DigitizedCardProfile) - 1];
                java.lang.Object[] objArr5 = {digitizedCardJson11, digitizedCardJson11};
                java.lang.Object obj3 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(-1341684428);
                if (obj3 == null) {
                    obj3 = ((java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson(54 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionChild(0L) + 3544, (char) android.graphics.Color.blue(0))).getMethod("t", java.lang.Object.class, java.lang.Object.class);
                    com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(-1341684428, obj3);
                }
                ((java.lang.reflect.Method) obj3).invoke(null, objArr5);
                $11 = ($10 + 31) % 128;
            }
            cArr3 = cArr5;
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        int i5 = $11 + 9;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    public final com.payair.hce.getWallpaperDesiredMinimumWidth writeReplace(com.payair.hce.getFilesDir getfilesdir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.getWallpaperDesiredMinimumWidth getwallpaperdesiredminimumwidth = new com.payair.hce.getWallpaperDesiredMinimumWidth(this.DigitizedCardProfile, this.writeReplace, values(), getfilesdir, deletesharedpreferences);
        IccPrivateKeyCrtComponentsJson = (valueOf + 103) % 128;
        return getwallpaperdesiredminimumwidth;
    }

    public final com.payair.hce.sendBroadcast AlternateContactlessPaymentDataJson(com.payair.hce.getExternalFilesDir getexternalfilesdir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.sendBroadcast sendbroadcast = new com.payair.hce.sendBroadcast(this.DigitizedCardProfile, this.writeReplace, values(), getexternalfilesdir, deletesharedpreferences);
        int i = valueOf + 39;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return sendbroadcast;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.getPackageCodePath getpackagecodepath = (com.payair.hce.getPackageCodePath) objArr[0];
        com.payair.hce.setWallpaper setwallpaper = new com.payair.hce.setWallpaper(getpackagecodepath.DigitizedCardProfile, getpackagecodepath.writeReplace, getpackagecodepath.values(), (com.payair.hce.getNoBackupFilesDir) objArr[1], (com.payair.hce.deleteSharedPreferences) objArr[2]);
        int i = valueOf + 87;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return setwallpaper;
        }
        throw null;
    }

    public final com.payair.hce.clearWallpaper DigitizedCardProfile(com.payair.hce.getFileStreamPath getfilestreampath, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.clearWallpaper clearwallpaper = new com.payair.hce.clearWallpaper(this.DigitizedCardProfile, this.writeReplace, values(), getfilestreampath, deletesharedpreferences);
        int i = valueOf + 45;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return clearwallpaper;
        }
        throw null;
    }

    public final com.payair.hce.getObbDir valueOf(com.payair.hce.getDataDir getdatadir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.getObbDir getobbdir = new com.payair.hce.getObbDir(this.DigitizedCardProfile, this.writeReplace, values(), getdatadir, deletesharedpreferences);
        IccPrivateKeyCrtComponentsJson = (valueOf + 113) % 128;
        return getobbdir;
    }

    public final com.payair.hce.startActivity writeReplace(com.payair.hce.openFileOutput openfileoutput, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.startActivity startactivity = new com.payair.hce.startActivity(this.DigitizedCardProfile, this.writeReplace, values(), openfileoutput, deletesharedpreferences);
        int i = valueOf + 21;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return startactivity;
        }
        throw null;
    }

    public final com.payair.hce.sendBroadcastWithMultiplePermissions DigitizedCardProfile(com.payair.hce.openFileInput openfileinput, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.sendBroadcastWithMultiplePermissions sendbroadcastwithmultiplepermissions = new com.payair.hce.sendBroadcastWithMultiplePermissions(this.DigitizedCardProfile, this.writeReplace, values(), openfileinput, deletesharedpreferences);
        int i = valueOf + 25;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return sendbroadcastwithmultiplepermissions;
        }
        throw null;
    }

    public final com.payair.hce.peekWallpaper DigitizedCardProfile(com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        com.payair.hce.peekWallpaper peekwallpaper = new com.payair.hce.peekWallpaper(this.DigitizedCardProfile, this.writeReplace, values(), new com.payair.hce.deleteFile(), deletesharedpreferences);
        int i = valueOf + 13;
        IccPrivateKeyCrtComponentsJson = i % 128;
        if (i % 2 != 0) {
            return peekwallpaper;
        }
        throw new java.lang.ArithmeticException();
    }

    private java.lang.String values() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(true, "\u0006\u0007\ufff5", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 181, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 2, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3, objArr);
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern()));
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        a(true, "\u0011\u000b\u000b￦￦\u0002\u0002￫￫\u0017\u0017\u0017\u0017\ufff1\ufff1\ufff1\u0011", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 201, 13 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), 17 - android.graphics.Color.green(0), objArr2);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), java.util.Locale.US);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(simpleDateFormat.format(calendar.getTime()));
        sb.append(java.lang.String.valueOf(this.AlternateContactlessPaymentDataJson.incrementAndGet()));
        java.lang.String obj = sb.toString();
        valueOf = (IccPrivateKeyCrtComponentsJson + 93) % 128;
        return obj;
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        valueOf = 0;
        IccPrivateKeyCrtComponentsJson = 1;
        values = 1889207046;
    }

    public final com.payair.hce.setWallpaper DigitizedCardProfile(com.payair.hce.getNoBackupFilesDir getnobackupfilesdir, com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        return (com.payair.hce.setWallpaper) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, getnobackupfilesdir, deletesharedpreferences}, 1362094210, -1362094210, java.lang.System.identityHashCode(this));
    }

    static void init$0() {
        $$a = new byte[]{70, 56, kotlin.io.encoding.Base64.padSymbol, 63};
        $$b = 29;
    }

    public final com.payair.hce.getWallpaperDesiredMinimumHeight valueOf(com.payair.hce.deleteSharedPreferences deletesharedpreferences) {
        return (com.payair.hce.getWallpaperDesiredMinimumHeight) AlternateContactlessPaymentDataJson(new java.lang.Object[]{this, deletesharedpreferences}, 147849031, -147849030, java.lang.System.identityHashCode(this));
    }
}
