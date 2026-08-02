package com.payair.hce;

/* loaded from: classes4.dex */
public final class checkSelfPermission {
    private static com.payair.hce.checkCallingPermission valueOf = new com.payair.hce.checkCallingPermission();
    private static int values = 0;
    private static int writeReplace = 1;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        return ((((i * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + (i2 * (-987))) + (((~((i4 | i5) | i)) | (~((i | i2) | i3))) * 988)) + ((i | i4) * (-988))) + ((((~((~i) | i4)) | (~(i3 | i4))) | (~(i2 | (i5 | i)))) * 988) != 1 ? DigitizedCardProfile(objArr) : writeReplace(objArr);
    }

    static {
        int i = writeReplace;
        values = (((i | 79) << 1) - (i ^ 79)) % 128;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        int i = values;
        int i2 = i & 115;
        int i3 = i2 + ((i ^ 115) | i2);
        writeReplace = i3 % 128;
        if (i3 % 2 != 0) {
            return valueOf;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setStatusCodeFromServer setstatuscodefromserver = (com.payair.hce.setStatusCodeFromServer) objArr[0];
        int i = writeReplace;
        int i2 = i & 57;
        int i3 = ((i ^ 57) | i2) << 1;
        int i4 = -((i | 57) & (~i2));
        values = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        com.payair.hce.checkCallingPermission checkcallingpermission = valueOf;
        com.payair.hce.checkCallingPermission.writeReplace(new java.lang.Object[]{checkcallingpermission, setstatuscodefromserver}, 735380152, -735380152, java.lang.System.identityHashCode(checkcallingpermission));
        int i5 = writeReplace + 45;
        values = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static void valueOf(com.payair.hce.setStatusCodeFromServer setstatuscodefromserver) {
        writeReplace(new java.lang.Object[]{setstatuscodefromserver}, 1779101737, -1779101736, (int) java.lang.System.currentTimeMillis());
    }

    public static com.payair.hce.setStatusCodeFromServer valueOf() {
        return (com.payair.hce.setStatusCodeFromServer) writeReplace(new java.lang.Object[0], -1211773049, 1211773049, (int) java.lang.System.currentTimeMillis());
    }
}
