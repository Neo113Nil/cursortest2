package com.payair.hce;

/* loaded from: classes4.dex */
public class setPinPreEntryAllowed extends com.payair.hce.isPrimaryAidMchipDataValid<com.payair.hce.isAlternateAidMchipDataValid> {
    private static long DigitizedCardProfile = 0;
    private static int getAid = 0;
    private static int getProfileVersion = 1;
    private static char[] writeReplace;

    static {
        writeReplace();
        com.payair.hce.setRecords.values((byte) -78, com.payair.hce.setPinPreEntryAllowed.class);
        int i = getProfileVersion + 71;
        getAid = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public setPinPreEntryAllowed() {
        DigitizedCardProfile((byte) 0);
        AlternateContactlessPaymentDataJson();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i <= 255; i++) {
            if ((i & 7) == 4) {
                arrayList.add(java.lang.Byte.valueOf((byte) i));
            }
        }
        AlternateContactlessPaymentDataJson(arrayList);
        values();
        writeReplace(new java.util.ArrayList<com.payair.hce.onDeleteCardCompleted.valueOf>() { // from class: com.payair.hce.setPinPreEntryAllowed.2
            {
                add(com.payair.hce.onDeleteCardCompleted.valueOf.writeReplace);
                add(com.payair.hce.onDeleteCardCompleted.valueOf.values);
            }
        });
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final com.payair.hce.getContactlessSupported valueOf() throws com.payair.hce.getCurrentRequestId {
        byte RecordsJson = ((com.payair.hce.isAlternateAidMchipDataValid) this.valueOf).RecordsJson();
        com.payair.hce.isAlternateAidMchipDataValid isalternateaidmchipdatavalid = (com.payair.hce.isAlternateAidMchipDataValid) this.valueOf;
        byte byteValue = (byte) (((java.lang.Byte) com.payair.hce.setMobilePinInitialConfiguration.valueOf(new java.lang.Object[]{isalternateaidmchipdatavalid}, 1301847775, -1301847775, java.lang.System.identityHashCode(isalternateaidmchipdatavalid))).byteValue() >>> 3);
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track2 = this.AlternateContactlessPaymentDataJson;
        android.view.KeyEvent.normalizeMetaState(0);
        android.os.SystemClock.currentThreadTimeMillis();
        android.os.Process.myPid();
        new java.lang.Object[]{java.lang.Byte.valueOf(RecordsJson), java.lang.Byte.valueOf(byteValue)};
        com.payair.hce.access000 access000Var = (com.payair.hce.access000) this.values.AlternateContactlessPaymentDataJson();
        com.payair.hce.getCodeCacheDir getcodecachedir = (com.payair.hce.getCodeCacheDir) com.payair.hce.access202.DigitizedCardProfile(new java.lang.Object[]{access000Var}, -1529917445, 1529917464, java.lang.System.identityHashCode(access000Var));
        com.payair.hce.setCardManager valueOf = ((com.payair.hce.setPanSequenceNumber) com.payair.hce.getCodeCacheDir.valueOf(new java.lang.Object[]{getcodecachedir}, -687040266, 687040266, java.lang.System.identityHashCode(getcodecachedir))).valueOf(RecordsJson, byteValue);
        com.payair.hce.setPinIvCvc3Track2 setpinivcvc3track22 = this.AlternateContactlessPaymentDataJson;
        android.os.Process.getElapsedCpuTime();
        android.view.KeyEvent.getDeadChar(0, 0);
        android.widget.ExpandableListView.getPackedPositionGroup(0L);
        new java.lang.Object[]{valueOf};
        com.payair.hce.getRemotePaymentSupported getremotepaymentsupported = new com.payair.hce.getRemotePaymentSupported();
        if (!((java.lang.Boolean) com.payair.hce.setCardManager.writeReplace(new java.lang.Object[]{valueOf}, -302605525, 302605525, java.lang.System.identityHashCode(valueOf))).booleanValue()) {
            java.util.List<com.payair.hce.startDeviceAuthenticationForRegistration> valueOf2 = valueOf.valueOf();
            if (valueOf2 != null) {
                getProfileVersion = (getAid + 53) % 128;
                access000Var.writeReplace(valueOf2);
            }
            getremotepaymentsupported.valueOf(valueOf.values(), valueOf.writeReplace(), valueOf2);
            return getremotepaymentsupported;
        }
        int i = getProfileVersion + 53;
        getAid = i % 128;
        if (i % 2 == 0) {
            getremotepaymentsupported.valueOf(valueOf.values(), valueOf.writeReplace(), valueOf.valueOf());
            int i2 = getProfileVersion + 101;
            getAid = i2 % 128;
            int i3 = i2 % 2;
            return getremotepaymentsupported;
        }
        getremotepaymentsupported.valueOf(valueOf.values(), valueOf.writeReplace(), valueOf.valueOf());
        throw null;
    }

    @Override // com.payair.hce.isPrimaryAidMchipDataValid
    protected final /* synthetic */ com.payair.hce.isAlternateAidMchipDataValid DigitizedCardProfile(byte[] bArr) throws com.payair.hce.digitize {
        com.payair.hce.isAlternateAidMchipDataValid isalternateaidmchipdatavalid = new com.payair.hce.isAlternateAidMchipDataValid(bArr);
        getProfileVersion = (getAid + 83) % 128;
        return isalternateaidmchipdatavalid;
    }

    static void writeReplace() {
        writeReplace = new char[]{11917, 18581, 58082, 7229, 46609, 53328, 19429, 58872, 8146, 47381, 54123, 19135, 58521, 7836, 47208, 53806, 19485, 59288, 445, 48002, 54560, 20290, 59036, 198, 47762, 54392, 20011, 59506, 24317, 14565, 37522, 27725, 50785, 40992, 15253, 38288, 28598, 51556, 41740, 15055, 38049, 28396, 51224, 41501};
        DigitizedCardProfile = -3810464359971932032L;
    }
}
