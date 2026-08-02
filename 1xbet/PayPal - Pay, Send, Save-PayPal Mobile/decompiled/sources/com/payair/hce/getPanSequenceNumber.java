package com.payair.hce;

/* loaded from: classes4.dex */
public class getPanSequenceNumber implements com.payair.hce.stopSelfResultHook, java.io.Serializable {
    public com.payair.hce.getRecordNumber[] writeReplace = new com.payair.hce.getRecordNumber[256];

    public getPanSequenceNumber() {
        for (int i = 0; i < 256; i++) {
            this.writeReplace[i] = new com.payair.hce.getRecordNumber();
        }
    }

    public int hashCode() {
        return java.util.Arrays.deepHashCode(this.writeReplace) + 511;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.deepEquals(this.writeReplace, ((com.payair.hce.getPanSequenceNumber) obj).writeReplace);
    }

    @Override // com.payair.hce.stopSelfResultHook
    public void values(com.payair.hce.getStartCommandIntent getstartcommandintent) {
        this.writeReplace = (com.payair.hce.getRecordNumber[]) getstartcommandintent.DigitizedCardProfile(com.payair.hce.getRecordNumber[].class);
    }
}
