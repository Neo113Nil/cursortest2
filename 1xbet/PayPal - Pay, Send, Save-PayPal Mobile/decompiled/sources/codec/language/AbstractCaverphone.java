package codec.language;

/* loaded from: classes7.dex */
public abstract class AbstractCaverphone implements codec.StringEncoder {
    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }

    public boolean isEncodeEqual(java.lang.String str, java.lang.String str2) throws codec.EncoderException {
        return encode(str).equals(encode(str2));
    }
}
