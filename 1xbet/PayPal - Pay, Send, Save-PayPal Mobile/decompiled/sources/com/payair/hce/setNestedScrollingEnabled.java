package com.payair.hce;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f"}, d2 = {"Lcom/payair/hce/setNestedScrollingEnabled;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "writeReplace", "()V", "", "DigitizedCardProfile", "()Ljava/lang/String;", "valueOf", "(Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "AlternateContactlessPaymentDataJson"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setNestedScrollingEnabled {
    private static int AlternateContactlessPaymentDataJson = 0;
    private static int DigitizedCardProfile = 1;

    /* renamed from: writeReplace, reason: from kotlin metadata */
    private final android.content.SharedPreferences AlternateContactlessPaymentDataJson;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (i * (-1975)) + (i2 * com.paypal.oslo.feature.onboarding.signup.welcome.ui.state.WelcomeAnimationConstantsKt.TransferFrameEnd) + ((i3 | i4) * 988) + (((~(i | i5)) | (~(i | i6))) * (-1976)) + (((~(i5 | i3)) | i4 | (~(i2 | i6))) * 988);
        if (i7 == 1) {
            return writeReplace(objArr);
        }
        if (i7 != 2) {
            return DigitizedCardProfile(objArr);
        }
        com.payair.hce.setNestedScrollingEnabled setnestedscrollingenabled = (com.payair.hce.setNestedScrollingEnabled) objArr[0];
        DigitizedCardProfile = ((-2) - (~(AlternateContactlessPaymentDataJson + 96))) % 128;
        java.lang.String string = setnestedscrollingenabled.AlternateContactlessPaymentDataJson.getString("firebase_id", null);
        int i8 = DigitizedCardProfile;
        AlternateContactlessPaymentDataJson = (((i8 | 101) << 1) - (i8 ^ 101)) % 128;
        return string;
    }

    private setNestedScrollingEnabled(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("firebase_prefs", 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.AlternateContactlessPaymentDataJson = sharedPreferences;
    }

    public /* synthetic */ setNestedScrollingEnabled(android.content.Context context, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.payair.hce.setSaveFromParentEnabled.getAlternateContactlessPaymentData() : context);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.setNestedScrollingEnabled setnestedscrollingenabled = (com.payair.hce.setNestedScrollingEnabled) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = DigitizedCardProfile;
        int i2 = (i & 113) + (i | 113);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 == 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            android.content.SharedPreferences.Editor edit = setnestedscrollingenabled.AlternateContactlessPaymentDataJson.edit();
            edit.putString("firebase_id", str);
            edit.apply();
            return null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.SharedPreferences.Editor edit2 = setnestedscrollingenabled.AlternateContactlessPaymentDataJson.edit();
        edit2.putString("firebase_id", str);
        edit2.apply();
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.setNestedScrollingEnabled setnestedscrollingenabled = (com.payair.hce.setNestedScrollingEnabled) objArr[0];
        int i = AlternateContactlessPaymentDataJson + 49;
        DigitizedCardProfile = i % 128;
        if (i % 2 != 0) {
            android.content.SharedPreferences.Editor edit = setnestedscrollingenabled.AlternateContactlessPaymentDataJson.edit();
            edit.remove("firebase_id");
            edit.apply();
            return null;
        }
        android.content.SharedPreferences.Editor edit2 = setnestedscrollingenabled.AlternateContactlessPaymentDataJson.edit();
        edit2.remove("firebase_id");
        edit2.apply();
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setNestedScrollingEnabled() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void writeReplace() {
        writeReplace(new java.lang.Object[]{this}, -964452765, 964452765, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String DigitizedCardProfile() {
        return (java.lang.String) writeReplace(new java.lang.Object[]{this}, 705861851, -705861849, java.lang.System.identityHashCode(this));
    }

    public final void valueOf(java.lang.String p0) {
        writeReplace(new java.lang.Object[]{this, p0}, -1806836139, 1806836140, java.lang.System.identityHashCode(this));
    }
}
