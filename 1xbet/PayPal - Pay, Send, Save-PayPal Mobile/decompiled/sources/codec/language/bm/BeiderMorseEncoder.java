package codec.language.bm;

/* loaded from: classes7.dex */
public class BeiderMorseEncoder implements codec.StringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public codec.language.bm.PhoneticEngine f2791a = new codec.language.bm.PhoneticEngine(codec.language.bm.NameType.GENERIC, codec.language.bm.RuleType.APPROX, true);

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        throw new codec.EncoderException("BeiderMorseEncoder encode parameter is not of type String");
    }

    public codec.language.bm.NameType getNameType() {
        return this.f2791a.getNameType();
    }

    public codec.language.bm.RuleType getRuleType() {
        return this.f2791a.getRuleType();
    }

    public boolean isConcat() {
        return this.f2791a.isConcat();
    }

    public void setConcat(boolean z) {
        this.f2791a = new codec.language.bm.PhoneticEngine(this.f2791a.getNameType(), this.f2791a.getRuleType(), z, this.f2791a.getMaxPhonemes());
    }

    public void setMaxPhonemes(int i) {
        this.f2791a = new codec.language.bm.PhoneticEngine(this.f2791a.getNameType(), this.f2791a.getRuleType(), this.f2791a.isConcat(), i);
    }

    public void setNameType(codec.language.bm.NameType nameType) {
        this.f2791a = new codec.language.bm.PhoneticEngine(nameType, this.f2791a.getRuleType(), this.f2791a.isConcat(), this.f2791a.getMaxPhonemes());
    }

    public void setRuleType(codec.language.bm.RuleType ruleType) {
        this.f2791a = new codec.language.bm.PhoneticEngine(this.f2791a.getNameType(), ruleType, this.f2791a.isConcat(), this.f2791a.getMaxPhonemes());
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) throws codec.EncoderException {
        if (str == null) {
            return null;
        }
        return this.f2791a.encode(str);
    }
}
