package org.apache.commons.codec.language.bm;

/* loaded from: classes17.dex */
public class BeiderMorseEncoder implements org.apache.commons.codec.StringEncoder {
    private org.apache.commons.codec.language.bm.PhoneticEngine getHighSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine(org.apache.commons.codec.language.bm.NameType.GENERIC, org.apache.commons.codec.language.bm.RuleType.APPROX, true);

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("BeiderMorseEncoder encode parameter is not of type String");
        }
        return encode((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws org.apache.commons.codec.EncoderException {
        if (str == null) {
            return null;
        }
        return this.getHighSpeedVideoSizes.encode(str);
    }

    public org.apache.commons.codec.language.bm.NameType getNameType() {
        return this.getHighSpeedVideoSizes.getNameType();
    }

    public org.apache.commons.codec.language.bm.RuleType getRuleType() {
        return this.getHighSpeedVideoSizes.getRuleType();
    }

    public boolean isConcat() {
        return this.getHighSpeedVideoSizes.isConcat();
    }

    public void setConcat(boolean z) {
        this.getHighSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine(this.getHighSpeedVideoSizes.getNameType(), this.getHighSpeedVideoSizes.getRuleType(), z, this.getHighSpeedVideoSizes.getMaxPhonemes());
    }

    public void setMaxPhonemes(int i) {
        this.getHighSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine(this.getHighSpeedVideoSizes.getNameType(), this.getHighSpeedVideoSizes.getRuleType(), this.getHighSpeedVideoSizes.isConcat(), i);
    }

    public void setNameType(org.apache.commons.codec.language.bm.NameType nameType) {
        this.getHighSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine(nameType, this.getHighSpeedVideoSizes.getRuleType(), this.getHighSpeedVideoSizes.isConcat(), this.getHighSpeedVideoSizes.getMaxPhonemes());
    }

    public void setRuleType(org.apache.commons.codec.language.bm.RuleType ruleType) {
        this.getHighSpeedVideoSizes = new org.apache.commons.codec.language.bm.PhoneticEngine(this.getHighSpeedVideoSizes.getNameType(), ruleType, this.getHighSpeedVideoSizes.isConcat(), this.getHighSpeedVideoSizes.getMaxPhonemes());
    }
}
