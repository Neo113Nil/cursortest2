package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbmc {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.BitSet zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final byte[] zze;

    static {
        java.util.BitSet bitSet = new java.util.BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        zzb = bitSet;
    }

    /* synthetic */ zzbmc(java.lang.String str, boolean z, java.lang.Object obj, byte[] bArr) {
        java.util.logging.Logger logger;
        java.lang.String str2 = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "name");
        this.zzc = str2;
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
        com.google.common.base.Preconditions.checkNotNull(lowerCase, "name");
        com.google.common.base.Preconditions.checkArgument(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("exception to show backtrace");
            logger = com.google.android.libraries.places.internal.zzbmg.zzc;
            logger.logp(level, "io.grpc.Metadata$Key", "validateName", "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (java.lang.Throwable) runtimeException);
        }
        int i = 0;
        while (i < lowerCase.length()) {
            char charAt = lowerCase.charAt(i);
            if (z && charAt == ':') {
                if (i == 0) {
                    i = 0;
                    i++;
                } else {
                    charAt = ':';
                }
            }
            com.google.common.base.Preconditions.checkArgument(zzb.get(charAt), "Invalid character '%s' in key name '%s'", charAt, (java.lang.Object) lowerCase);
            i++;
        }
        this.zzd = lowerCase;
        this.zze = lowerCase.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static com.google.android.libraries.places.internal.zzbmc zzc(java.lang.String str, com.google.android.libraries.places.internal.zzbmb zzbmbVar) {
        return new com.google.android.libraries.places.internal.zzbma(str, false, zzbmbVar, null);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((com.google.android.libraries.places.internal.zzbmc) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 12);
        sb.append("Key{name='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    abstract byte[] zza(java.lang.Object obj);

    abstract java.lang.Object zzb(byte[] bArr);

    final byte[] zze() {
        return this.zze;
    }

    public final java.lang.String zzd() {
        return this.zzd;
    }
}
