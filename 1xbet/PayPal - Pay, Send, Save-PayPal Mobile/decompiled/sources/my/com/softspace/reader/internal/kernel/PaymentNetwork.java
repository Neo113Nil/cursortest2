package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public enum PaymentNetwork {
    MASTERCARD("A000000004"),
    MASTERCARD_QPBOC("A000000010"),
    VISA("A000000003"),
    MCCS("A000000615"),
    JCB("A000000065"),
    AMEX("A000000025"),
    CUP("A000000333"),
    VCCS("A000000727"),
    DISCOVER("A000000152"),
    MADA("A000000228"),
    JCBDC("A000000077"),
    EFTPOS("A000000384"),
    NETS("A000000541"),
    UNKNOWN("");

    private static final java.util.Map<java.lang.String, my.com.softspace.reader.internal.kernel.PaymentNetwork> Camera2StreamConfigurationMap = new java.util.HashMap();
    java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    static {
        java.util.Iterator it = java.util.EnumSet.allOf(my.com.softspace.reader.internal.kernel.PaymentNetwork.class).iterator();
        while (it.hasNext()) {
            my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork = (my.com.softspace.reader.internal.kernel.PaymentNetwork) it.next();
            Camera2StreamConfigurationMap.put(paymentNetwork.getRidString().toUpperCase(), paymentNetwork);
        }
    }

    PaymentNetwork(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    public final byte[] getRidBytes() {
        return my.com.softspace.reader.internal.kernelconfig.HexUtil.hexStringToByteArray(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String getRidString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static my.com.softspace.reader.internal.kernel.PaymentNetwork get(java.lang.String str) {
        my.com.softspace.reader.internal.kernel.PaymentNetwork paymentNetwork = Camera2StreamConfigurationMap.get(str.toUpperCase());
        return paymentNetwork == null ? UNKNOWN : paymentNetwork;
    }
}
