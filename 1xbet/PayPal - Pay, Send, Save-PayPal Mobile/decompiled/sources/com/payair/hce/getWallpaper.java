package com.payair.hce;

/* loaded from: classes4.dex */
public class getWallpaper extends com.payair.hce.fileList {
    private static int valueOf = 0;
    private static int writeReplace = 1;
    private com.payair.hce.checkForSuccess DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        return DigitizedCardProfile(objArr);
    }

    public getWallpaper(java.lang.String str, java.lang.String str2, com.payair.hce.checkForSuccess checkforsuccess) {
        super(str, str2);
        this.DigitizedCardProfile = checkforsuccess;
    }

    public getWallpaper(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.getWallpaper getwallpaper = (com.payair.hce.getWallpaper) objArr[0];
        int i = writeReplace;
        int i2 = (i & 45) + (i | 45);
        valueOf = i2 % 128;
        com.payair.hce.checkForSuccess checkforsuccess = getwallpaper.DigitizedCardProfile;
        if (i2 % 2 == 0) {
            return checkforsuccess;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = writeReplace + 97;
        int i2 = i % 128;
        valueOf = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        writeReplace = (i2 + 101) % 128;
        return "getWallpaper";
    }

    public final com.payair.hce.checkForSuccess values() {
        return (com.payair.hce.checkForSuccess) valueOf(new java.lang.Object[]{this}, 303362241, -303362241, java.lang.System.identityHashCode(this));
    }
}
