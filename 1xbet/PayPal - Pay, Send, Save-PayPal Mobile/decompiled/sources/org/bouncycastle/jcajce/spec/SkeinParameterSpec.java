package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class SkeinParameterSpec implements java.security.spec.AlgorithmParameterSpec {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;
    private java.util.Map getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private java.util.Map Camera2StreamConfigurationMap = new java.util.HashMap();

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setPersonalisation(java.util.Date date, java.util.Locale locale, java.lang.String str, java.lang.String str2) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new java.text.SimpleDateFormat("YYYYMMDD", locale).format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Byte I/O failed: ".concat(java.lang.String.valueOf(e)));
            }
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setPersonalisation(java.util.Date date, java.lang.String str, java.lang.String str2) {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                java.io.OutputStreamWriter outputStreamWriter = new java.io.OutputStreamWriter(byteArrayOutputStream, "UTF-8");
                outputStreamWriter.write(new java.text.SimpleDateFormat("YYYYMMDD").format(date));
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str);
                outputStreamWriter.write(" ");
                outputStreamWriter.write(str2);
                outputStreamWriter.close();
                return set(8, byteArrayOutputStream.toByteArray());
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException("Byte I/O failed: ".concat(java.lang.String.valueOf(e)));
            }
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec.Builder set(int i, byte[] bArr) {
            if (bArr == null) {
                throw new java.lang.IllegalArgumentException("Parameter value must not be null.");
            }
            if (i != 0 && (i <= 4 || i >= 63 || i == 48)) {
                throw new java.lang.IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            }
            if (i == 4) {
                throw new java.lang.IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
            this.Camera2StreamConfigurationMap.put(org.bouncycastle.util.Integers.valueOf(i), bArr);
            return this;
        }

        public org.bouncycastle.jcajce.spec.SkeinParameterSpec build() {
            return new org.bouncycastle.jcajce.spec.SkeinParameterSpec(this.Camera2StreamConfigurationMap, (byte) 0);
        }

        public Builder(org.bouncycastle.jcajce.spec.SkeinParameterSpec skeinParameterSpec) {
            for (java.lang.Integer num : skeinParameterSpec.getHighSpeedVideoFpsRangesFor.keySet()) {
                this.Camera2StreamConfigurationMap.put(num, skeinParameterSpec.getHighSpeedVideoFpsRangesFor.get(num));
            }
        }

        public Builder() {
        }
    }

    public byte[] getPublicKey() {
        return org.bouncycastle.util.Arrays.clone((byte[]) this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(12)));
    }

    public byte[] getPersonalisation() {
        return org.bouncycastle.util.Arrays.clone((byte[]) this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(8)));
    }

    public java.util.Map getParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getNonce() {
        return org.bouncycastle.util.Arrays.clone((byte[]) this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(20)));
    }

    public byte[] getKeyIdentifier() {
        return org.bouncycastle.util.Arrays.clone((byte[]) this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(16)));
    }

    public byte[] getKey() {
        return org.bouncycastle.util.Arrays.clone((byte[]) this.getHighSpeedVideoFpsRangesFor.get(org.bouncycastle.util.Integers.valueOf(0)));
    }

    /* synthetic */ SkeinParameterSpec(java.util.Map map, byte b) {
        this(map);
    }

    private SkeinParameterSpec(java.util.Map map) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableMap(map);
    }

    public SkeinParameterSpec() {
        this(new java.util.HashMap());
    }
}
