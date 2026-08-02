package org.bouncycastle.crypto.examples;

/* loaded from: classes17.dex */
public class DESExample {
    private org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher Camera2StreamConfigurationMap;
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private java.io.BufferedOutputStream getHighSpeedVideoFpsRangesFor;
    private java.io.BufferedInputStream getHighSpeedVideoSizes;

    public static void main(java.lang.String[] strArr) {
        java.lang.String str;
        boolean z;
        if (strArr.length < 2) {
            org.bouncycastle.crypto.examples.DESExample dESExample = new org.bouncycastle.crypto.examples.DESExample();
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Usage: java ");
            sb.append(dESExample.getClass().getName());
            sb.append(" infile outfile [keyfile]");
            printStream.println(sb.toString());
            java.lang.System.exit(1);
        }
        java.lang.String str2 = strArr[0];
        java.lang.String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z = false;
        } else {
            str = "deskey.dat";
            z = true;
        }
        org.bouncycastle.crypto.examples.DESExample dESExample2 = new org.bouncycastle.crypto.examples.DESExample(str2, str3, str, z);
        org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher paddedBufferedBlockCipher = new org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DESedeEngine()));
        dESExample2.Camera2StreamConfigurationMap = paddedBufferedBlockCipher;
        try {
            if (dESExample2.getHighSpeedVideoFpsRanges) {
                paddedBufferedBlockCipher.init(true, new org.bouncycastle.crypto.params.KeyParameter(dESExample2.getHighResolutionOutputSizeshNQ4ISI));
                byte[] bArr = new byte[47];
                byte[] bArr2 = new byte[dESExample2.Camera2StreamConfigurationMap.getOutputSize(47)];
                while (true) {
                    try {
                        int read = dESExample2.getHighSpeedVideoSizes.read(bArr, 0, 47);
                        if (read <= 0) {
                            break;
                        }
                        int processBytes = dESExample2.Camera2StreamConfigurationMap.processBytes(bArr, 0, read, bArr2, 0);
                        if (processBytes > 0) {
                            byte[] encode = org.bouncycastle.util.encoders.Hex.encode(bArr2, 0, processBytes);
                            dESExample2.getHighSpeedVideoFpsRangesFor.write(encode, 0, encode.length);
                            dESExample2.getHighSpeedVideoFpsRangesFor.write(10);
                        }
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                }
                int doFinal = dESExample2.Camera2StreamConfigurationMap.doFinal(bArr2, 0);
                if (doFinal > 0) {
                    byte[] encode2 = org.bouncycastle.util.encoders.Hex.encode(bArr2, 0, doFinal);
                    dESExample2.getHighSpeedVideoFpsRangesFor.write(encode2, 0, encode2.length);
                    dESExample2.getHighSpeedVideoFpsRangesFor.write(10);
                }
            } else {
                paddedBufferedBlockCipher.init(false, new org.bouncycastle.crypto.params.KeyParameter(dESExample2.getHighResolutionOutputSizeshNQ4ISI));
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(dESExample2.getHighSpeedVideoSizes));
                byte[] bArr3 = null;
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        byte[] decode = org.bouncycastle.util.encoders.Hex.decode(readLine);
                        bArr3 = new byte[dESExample2.Camera2StreamConfigurationMap.getOutputSize(decode.length)];
                        int processBytes2 = dESExample2.Camera2StreamConfigurationMap.processBytes(decode, 0, decode.length, bArr3, 0);
                        if (processBytes2 > 0) {
                            dESExample2.getHighSpeedVideoFpsRangesFor.write(bArr3, 0, processBytes2);
                        }
                    } catch (java.io.IOException e2) {
                        e2.printStackTrace();
                    }
                }
                int doFinal2 = dESExample2.Camera2StreamConfigurationMap.doFinal(bArr3, 0);
                if (doFinal2 > 0) {
                    dESExample2.getHighSpeedVideoFpsRangesFor.write(bArr3, 0, doFinal2);
                }
            }
        } catch (org.bouncycastle.crypto.CryptoException unused) {
        }
        try {
            dESExample2.getHighSpeedVideoSizes.close();
            dESExample2.getHighSpeedVideoFpsRangesFor.flush();
            dESExample2.getHighSpeedVideoFpsRangesFor.close();
        } catch (java.io.IOException e3) {
            java.io.PrintStream printStream2 = java.lang.System.err;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("exception closing resources: ");
            sb2.append(e3.getMessage());
            printStream2.println(sb2.toString());
        }
    }

    public DESExample(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        java.io.PrintStream printStream;
        java.lang.StringBuilder sb;
        java.security.SecureRandom secureRandom;
        java.security.SecureRandom secureRandom2 = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRanges = z;
        try {
            this.getHighSpeedVideoSizes = new java.io.BufferedInputStream(new java.io.FileInputStream(str));
        } catch (java.io.FileNotFoundException unused) {
            java.io.PrintStream printStream2 = java.lang.System.err;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Input file not found [");
            sb2.append(str);
            sb2.append("]");
            printStream2.println(sb2.toString());
            java.lang.System.exit(1);
        }
        try {
            this.getHighSpeedVideoFpsRangesFor = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str2));
        } catch (java.io.IOException unused2) {
            java.io.PrintStream printStream3 = java.lang.System.err;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Output file not created [");
            sb3.append(str2);
            sb3.append("]");
            printStream3.println(sb3.toString());
            java.lang.System.exit(1);
        }
        if (z) {
            try {
                try {
                    secureRandom = new java.security.SecureRandom();
                    try {
                        secureRandom.setSeed("www.bouncycastle.org".getBytes());
                    } catch (java.lang.Exception unused3) {
                        secureRandom2 = secureRandom;
                        java.lang.System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                        java.lang.System.exit(1);
                        secureRandom = secureRandom2;
                        org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters = new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192);
                        org.bouncycastle.crypto.generators.DESedeKeyGenerator dESedeKeyGenerator = new org.bouncycastle.crypto.generators.DESedeKeyGenerator();
                        dESedeKeyGenerator.init(keyGenerationParameters);
                        this.getHighResolutionOutputSizeshNQ4ISI = dESedeKeyGenerator.generateKey();
                        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str3));
                        byte[] encode = org.bouncycastle.util.encoders.Hex.encode(this.getHighResolutionOutputSizeshNQ4ISI);
                        bufferedOutputStream.write(encode, 0, encode.length);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        return;
                    }
                } catch (java.io.IOException unused4) {
                    printStream = java.lang.System.err;
                    sb = new java.lang.StringBuilder("Could not decryption create key file [");
                }
            } catch (java.lang.Exception unused5) {
            }
            org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters2 = new org.bouncycastle.crypto.KeyGenerationParameters(secureRandom, 192);
            org.bouncycastle.crypto.generators.DESedeKeyGenerator dESedeKeyGenerator2 = new org.bouncycastle.crypto.generators.DESedeKeyGenerator();
            dESedeKeyGenerator2.init(keyGenerationParameters2);
            this.getHighResolutionOutputSizeshNQ4ISI = dESedeKeyGenerator2.generateKey();
            java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(new java.io.FileOutputStream(str3));
            byte[] encode2 = org.bouncycastle.util.encoders.Hex.encode(this.getHighResolutionOutputSizeshNQ4ISI);
            bufferedOutputStream2.write(encode2, 0, encode2.length);
            bufferedOutputStream2.flush();
            bufferedOutputStream2.close();
            return;
        }
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(str3));
            int available = bufferedInputStream.available();
            byte[] bArr = new byte[available];
            bufferedInputStream.read(bArr, 0, available);
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.encoders.Hex.decode(bArr);
            return;
        } catch (java.io.IOException unused6) {
            printStream = java.lang.System.err;
            sb = new java.lang.StringBuilder("Decryption key file not found, or not valid [");
        }
        sb.append(str3);
        sb.append("]");
        printStream.println(sb.toString());
        java.lang.System.exit(1);
    }

    public DESExample() {
        this.getHighSpeedVideoFpsRanges = true;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = null;
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }
}
