package androidx.core.content.pm;

/* loaded from: classes7.dex */
public final class PackageInfoCompat {
    public static long getLongVersionCode(android.content.pm.PackageInfo packageInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.content.pm.PackageInfoCompat.Api28Impl.getHighSpeedVideoSizes(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public static java.util.List<android.content.pm.Signature> getSignatures(android.content.pm.PackageManager packageManager, java.lang.String str) throws android.content.pm.PackageManager.NameNotFoundException {
        android.content.pm.Signature[] signatureArr;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.content.pm.SigningInfo signingInfo = packageManager.getPackageInfo(str, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
            if (androidx.core.content.pm.PackageInfoCompat.Api28Impl.bN_(signingInfo)) {
                signatureArr = androidx.core.content.pm.PackageInfoCompat.Api28Impl.bL_(signingInfo);
            } else {
                signatureArr = androidx.core.content.pm.PackageInfoCompat.Api28Impl.bM_(signingInfo);
            }
        } else {
            signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        }
        if (signatureArr == null) {
            return java.util.Collections.emptyList();
        }
        return java.util.Arrays.asList(signatureArr);
    }

    public static boolean hasSignatures(android.content.pm.PackageManager packageManager, java.lang.String str, java.util.Map<byte[], java.lang.Integer> map, boolean z) throws android.content.pm.PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        java.util.Set<byte[]> keySet = map.keySet();
        for (byte[] bArr2 : keySet) {
            if (bArr2 == null) {
                throw new java.lang.IllegalArgumentException("Cert byte array cannot be null when verifying ".concat(java.lang.String.valueOf(str)));
            }
            java.lang.Integer num = map.get(bArr2);
            if (num == null) {
                throw new java.lang.IllegalArgumentException("Type must be specified for cert when verifying ".concat(java.lang.String.valueOf(str)));
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported certificate type ");
                sb.append(num);
                sb.append(" when verifying ");
                sb.append(str);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.util.List<android.content.pm.Signature> signatures = getSignatures(packageManager, str);
        if (!z && android.os.Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : keySet) {
                if (!androidx.core.content.pm.PackageInfoCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (signatures.size() != 0 && map.size() <= signatures.size() && (!z || map.size() == signatures.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[signatures.size()][];
                for (int i = 0; i < signatures.size(); i++) {
                    bArr[i] = Camera2StreamConfigurationMap(signatures.get(i).toByteArray());
                }
            } else {
                bArr = null;
            }
            java.util.Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                java.lang.Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 == 1) {
                        if (!getHighSpeedVideoFpsRangesFor(bArr, next)) {
                            return false;
                        }
                    } else {
                        throw new java.lang.IllegalArgumentException("Unsupported certificate type ".concat(java.lang.String.valueOf(num2)));
                    }
                } else if (!signatures.contains(new android.content.pm.Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(byte[][] bArr, byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (java.util.Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    private static byte[] Camera2StreamConfigurationMap(byte[] bArr) {
        try {
            return java.security.MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    private PackageInfoCompat() {
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.content.pm.PackageManager packageManager, java.lang.String str, byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }

        static boolean bN_(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        static android.content.pm.Signature[] bL_(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        static android.content.pm.Signature[] bM_(android.content.pm.SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        static long getHighSpeedVideoSizes(android.content.pm.PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }
}
