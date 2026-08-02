package codec.language;

@java.lang.Deprecated
/* loaded from: classes7.dex */
public class Caverphone implements codec.StringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final codec.language.Caverphone2 f2779a = new codec.language.Caverphone2();

    public java.lang.String caverphone(java.lang.String str) {
        return this.f2779a.encode(str);
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return caverphone((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }

    public boolean isCaverphoneEqual(java.lang.String str, java.lang.String str2) {
        return caverphone(str).equals(caverphone(str2));
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return caverphone(str);
    }
}
