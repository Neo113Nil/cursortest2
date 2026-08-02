package org.jose4j.keys;

/* loaded from: classes18.dex */
public class EllipticCurves {
    public static final java.security.spec.ECParameterSpec P256;
    public static final java.security.spec.ECParameterSpec P384;
    public static final java.security.spec.ECParameterSpec P521;
    public static final java.lang.String P_256 = "P-256";
    public static final java.lang.String P_384 = "P-384";
    public static final java.lang.String P_521 = "P-521";
    public static final java.security.spec.ECParameterSpec SECP256K1;
    public static final java.lang.String SECP_256K1 = "secp256k1";
    private static final java.util.Map<java.lang.String, java.security.spec.ECParameterSpec> Camera2StreamConfigurationMap = new java.util.HashMap();
    private static final java.util.Map<java.security.spec.EllipticCurve, java.lang.String> getHighSpeedVideoSizes = new java.util.HashMap();

    static {
        java.security.spec.ECParameterSpec eCParameterSpec = new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951")), new java.math.BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853948"), new java.math.BigInteger("41058363725152142129326129780047268409114441015993725554835256314039467401291")), new java.security.spec.ECPoint(new java.math.BigInteger("48439561293906451759052585252797914202762949526041747995844080717082404635286"), new java.math.BigInteger("36134250956749795798585127919587881956611106672985015071877198253568414405109")), new java.math.BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369"), 1);
        P256 = eCParameterSpec;
        java.security.spec.ECParameterSpec eCParameterSpec2 = new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319")), new java.math.BigInteger("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112316"), new java.math.BigInteger("27580193559959705877849011840389048093056905856361568521428707301988689241309860865136260764883745107765439761230575")), new java.security.spec.ECPoint(new java.math.BigInteger("26247035095799689268623156744566981891852923491109213387815615900925518854738050089022388053975719786650872476732087"), new java.math.BigInteger("8325710961489029985546751289520108179287853048861315594709205902480503199884419224438643760392947333078086511627871")), new java.math.BigInteger("39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643"), 1);
        P384 = eCParameterSpec2;
        java.security.spec.ECParameterSpec eCParameterSpec3 = new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151")), new java.math.BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057148"), new java.math.BigInteger("1093849038073734274511112390766805569936207598951683748994586394495953116150735016013708737573759623248592132296706313309438452531591012912142327488478985984")), new java.security.spec.ECPoint(new java.math.BigInteger("2661740802050217063228768716723360960729859168756973147706671368418802944996427808491545080627771902352094241225065558662157113545570916814161637315895999846"), new java.math.BigInteger("3757180025770020463545507224491183603594455134769762486694567779615544477440556316691234405012945539562144444537289428522585666729196580810124344277578376784")), new java.math.BigInteger("6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449"), 1);
        P521 = eCParameterSpec3;
        java.security.spec.ECParameterSpec eCParameterSpec4 = new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(new java.math.BigInteger("115792089237316195423570985008687907853269984665640564039457584007908834671663")), new java.math.BigInteger("0"), new java.math.BigInteger("7")), new java.security.spec.ECPoint(new java.math.BigInteger("55066263022277343669578718895168534326250603453777594175500187360389116729240"), new java.math.BigInteger("32670510020758816978083085130507043184471273380659243275938904335757337482424")), new java.math.BigInteger("115792089237316195423570985008687907852837564279074904382605163141518161494337"), 1);
        SECP256K1 = eCParameterSpec4;
        addCurve(P_256, eCParameterSpec);
        addCurve(P_384, eCParameterSpec2);
        addCurve(P_521, eCParameterSpec3);
        addCurve(SECP_256K1, eCParameterSpec4);
    }

    public static void addCurve(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec) {
        Camera2StreamConfigurationMap.put(str, eCParameterSpec);
        getHighSpeedVideoSizes.put(eCParameterSpec.getCurve(), str);
    }

    public static java.security.spec.ECParameterSpec getSpec(java.lang.String str) {
        return Camera2StreamConfigurationMap.get(str);
    }

    public static java.lang.String getName(java.security.spec.EllipticCurve ellipticCurve) {
        return getHighSpeedVideoSizes.get(ellipticCurve);
    }
}
