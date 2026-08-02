package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class SkeinParameters implements org.bouncycastle.crypto.CipherParameters {
    public static final int PARAM_TYPE_CONFIG = 4;
    public static final int PARAM_TYPE_KEY = 0;
    public static final int PARAM_TYPE_KEY_IDENTIFIER = 16;
    public static final int PARAM_TYPE_MESSAGE = 48;
    public static final int PARAM_TYPE_NONCE = 20;
    public static final int PARAM_TYPE_OUTPUT = 63;
    public static final int PARAM_TYPE_PERSONALISATION = 8;
    public static final int PARAM_TYPE_PUBLIC_KEY = 12;
    private java.util.Hashtable getHighSpeedVideoSizes;

    public static class Builder {
        private java.util.Hashtable getHighSpeedVideoSizes = new java.util.Hashtable();

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setPublicKey(byte[] bArr) {
            return set(12, bArr);
        }

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setPersonalisation(byte[] bArr) {
            return set(8, bArr);
        }

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setPersonalisation(java.util.Date date, java.util.Locale locale, java.lang.String str, java.lang.String str2) {
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

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setPersonalisation(java.util.Date date, java.lang.String str, java.lang.String str2) {
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

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setNonce(byte[] bArr) {
            return set(20, bArr);
        }

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setKeyIdentifier(byte[] bArr) {
            return set(16, bArr);
        }

        public org.bouncycastle.crypto.params.SkeinParameters.Builder setKey(byte[] bArr) {
            return set(0, bArr);
        }

        public org.bouncycastle.crypto.params.SkeinParameters.Builder set(int i, byte[] bArr) {
            if (bArr == null) {
                throw new java.lang.IllegalArgumentException("Parameter value must not be null.");
            }
            if (i != 0 && (i < 4 || i >= 63 || i == 48)) {
                throw new java.lang.IllegalArgumentException("Parameter types must be in the range 0,5..47,49..62.");
            }
            if (i == 4) {
                throw new java.lang.IllegalArgumentException("Parameter type 4 is reserved for internal use.");
            }
            this.getHighSpeedVideoSizes.put(org.bouncycastle.util.Integers.valueOf(i), bArr);
            return this;
        }

        public org.bouncycastle.crypto.params.SkeinParameters build() {
            return new org.bouncycastle.crypto.params.SkeinParameters(this.getHighSpeedVideoSizes, (byte) 0);
        }

        public Builder(org.bouncycastle.crypto.params.SkeinParameters skeinParameters) {
            java.util.Enumeration keys = skeinParameters.getHighSpeedVideoSizes.keys();
            while (keys.hasMoreElements()) {
                java.lang.Integer num = (java.lang.Integer) keys.nextElement();
                this.getHighSpeedVideoSizes.put(num, skeinParameters.getHighSpeedVideoSizes.get(num));
            }
        }

        public Builder(java.util.Hashtable hashtable) {
            java.util.Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                java.lang.Integer num = (java.lang.Integer) keys.nextElement();
                this.getHighSpeedVideoSizes.put(num, hashtable.get(num));
            }
        }

        public Builder() {
        }
    }

    public byte[] getPublicKey() {
        return (byte[]) this.getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(12));
    }

    public byte[] getPersonalisation() {
        return (byte[]) this.getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(8));
    }

    public java.util.Hashtable getParameters() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getNonce() {
        return (byte[]) this.getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(20));
    }

    public byte[] getKeyIdentifier() {
        return (byte[]) this.getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(16));
    }

    public byte[] getKey() {
        return (byte[]) this.getHighSpeedVideoSizes.get(org.bouncycastle.util.Integers.valueOf(0));
    }

    /* synthetic */ SkeinParameters(java.util.Hashtable hashtable, byte b) {
        this(hashtable);
    }

    private SkeinParameters(java.util.Hashtable hashtable) {
        this.getHighSpeedVideoSizes = hashtable;
    }

    public SkeinParameters() {
        this(new java.util.Hashtable());
    }
}
