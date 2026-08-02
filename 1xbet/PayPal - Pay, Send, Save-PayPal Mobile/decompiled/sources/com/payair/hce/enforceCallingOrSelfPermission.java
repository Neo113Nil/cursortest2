package com.payair.hce;

/* loaded from: classes4.dex */
final class enforceCallingOrSelfPermission extends android.os.AsyncTask<java.lang.Void, java.lang.String, java.lang.Void> implements com.payair.hce.enforceCallingPermission {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int valueOf;
    private com.payair.hce.checkCallingOrSelfUriPermission DigitizedCardProfile;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = (~i3) | i4;
        int i6 = i2 | i;
        int i7 = ~(i3 | i6);
        switch ((i * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (i2 * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE) + (((~((~i) | i4)) | (~i5) | i7) * (-252)) + (i6 * (-252)) + (((~(i | i5)) | i7) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE)) {
            case 1:
                return values(objArr);
            case 2:
                com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
                int i8 = valueOf;
                int i9 = i8 & 69;
                AlternateContactlessPaymentDataJson = (i9 + ((i8 ^ 69) | i9)) % 128;
                super.onPreExecute();
                com.payair.hce.checkCallingOrSelfUriPermission checkcallingorselfuripermission = enforcecallingorselfpermission.DigitizedCardProfile;
                int i10 = AlternateContactlessPaymentDataJson & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                valueOf = ((i10 - (~((r4 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | i10))) - 1) % 128;
                return null;
            case 3:
                return writeReplace(objArr);
            case 4:
                return valueOf(objArr);
            case 5:
                return DigitizedCardProfile(objArr);
            case 6:
                return getProfileVersion(objArr);
            case 7:
                return getAid(objArr);
            default:
                return AlternateContactlessPaymentDataJson(objArr);
        }
    }

    enforceCallingOrSelfPermission() {
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
        int i = valueOf;
        int i2 = (i & 31) + (i | 31);
        AlternateContactlessPaymentDataJson = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Void r4 = (java.lang.Void) valueOf(new java.lang.Object[]{enforcecallingorselfpermission}, 1793468657, -1793468650, java.lang.System.identityHashCode(enforcecallingorselfpermission));
        if (i3 == 0) {
            throw null;
        }
        valueOf = (AlternateContactlessPaymentDataJson + 61) % 128;
        return r4;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr[1];
        int i = valueOf + 83;
        AlternateContactlessPaymentDataJson = i % 128;
        int i2 = i % 2;
        valueOf(new java.lang.Object[]{enforcecallingorselfpermission, (java.lang.String[]) objArr2}, -1776982482, 1776982488, java.lang.System.identityHashCode(enforcecallingorselfpermission));
        if (i2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        java.lang.Object obj = objArr[1];
        int i = valueOf + 121;
        AlternateContactlessPaymentDataJson = i % 128;
        int i2 = i % 2;
        valueOf(new java.lang.Object[]{enforcecallingorselfpermission, (java.lang.Void) obj}, 480427070, -480427065, java.lang.System.identityHashCode(enforcecallingorselfpermission));
        if (i2 == 0) {
            throw null;
        }
        int i3 = AlternateContactlessPaymentDataJson;
        int i4 = (-2) - (~((i3 ^ 104) + ((i3 & 104) << 1)));
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        java.lang.Void r4 = (java.lang.Void) objArr[1];
        int i = valueOf;
        int i2 = (i & 91) + (i | 91);
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            super.onPostExecute(r4);
            enforcecallingorselfpermission.DigitizedCardProfile.writeReplace();
            int i3 = AlternateContactlessPaymentDataJson;
            int i4 = i3 ^ 85;
            int i5 = (i3 & 85) << 1;
            valueOf = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
            return null;
        }
        super.onPostExecute(r4);
        enforcecallingorselfpermission.DigitizedCardProfile.writeReplace();
        throw null;
    }

    private static /* synthetic */ java.lang.Object getProfileVersion(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        java.lang.String[] strArr = (java.lang.String[]) objArr[1];
        int i = valueOf;
        int i2 = (((i | 2) << 1) - (i ^ 2)) - 1;
        AlternateContactlessPaymentDataJson = i2 % 128;
        if (i2 % 2 != 0) {
            super.onProgressUpdate(strArr);
            int i3 = AlternateContactlessPaymentDataJson;
            int i4 = ((i3 ^ 78) + ((i3 & 78) << 1)) - 1;
            valueOf = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            throw null;
        }
        super.onProgressUpdate(strArr);
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object getAid(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = (((i ^ 85) | (i & 85)) << 1) - ((i & (-86)) | ((~i) & 85));
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            enforcecallingorselfpermission.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
            return null;
        }
        enforcecallingorselfpermission.DigitizedCardProfile.AlternateContactlessPaymentDataJson();
        throw null;
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.enforceCallingOrSelfPermission enforcecallingorselfpermission = (com.payair.hce.enforceCallingOrSelfPermission) objArr[0];
        com.payair.hce.checkCallingOrSelfUriPermission checkcallingorselfuripermission = (com.payair.hce.checkCallingOrSelfUriPermission) objArr[1];
        AlternateContactlessPaymentDataJson = (valueOf + 9) % 128;
        enforcecallingorselfpermission.DigitizedCardProfile = checkcallingorselfuripermission;
        enforcecallingorselfpermission.execute(null);
        int i = AlternateContactlessPaymentDataJson;
        int i2 = ((i | 95) << 1) - (i ^ 95);
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return null;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.lang.Void] */
    @Override // android.os.AsyncTask
    protected final /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
        ?? valueOf2 = valueOf(new java.lang.Object[]{this, voidArr}, -925869310, 925869310, java.lang.System.identityHashCode(this));
        return valueOf2;
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(java.lang.Void r4) {
        valueOf(new java.lang.Object[]{this, r4}, 1479186655, -1479186654, java.lang.System.identityHashCode(this));
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onProgressUpdate(java.lang.String[] strArr) {
        valueOf(new java.lang.Object[]{this, strArr}, -1126629590, 1126629594, java.lang.System.identityHashCode(this));
    }

    @Override // com.payair.hce.enforceCallingPermission
    public final void writeReplace(com.payair.hce.checkCallingOrSelfUriPermission checkcallingorselfuripermission) {
        valueOf(new java.lang.Object[]{this, checkcallingorselfuripermission}, 569520425, -569520422, java.lang.System.identityHashCode(this));
    }

    private java.lang.Void valueOf() {
        return (java.lang.Void) valueOf(new java.lang.Object[]{this}, 1793468657, -1793468650, java.lang.System.identityHashCode(this));
    }

    private void DigitizedCardProfile(java.lang.String... strArr) {
        valueOf(new java.lang.Object[]{this, strArr}, -1776982482, 1776982488, java.lang.System.identityHashCode(this));
    }

    private void DigitizedCardProfile(java.lang.Void r4) {
        valueOf(new java.lang.Object[]{this, r4}, 480427070, -480427065, java.lang.System.identityHashCode(this));
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        valueOf(new java.lang.Object[]{this}, -1229403466, 1229403468, java.lang.System.identityHashCode(this));
    }
}
