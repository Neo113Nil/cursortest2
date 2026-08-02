package androidx.browser.trusted;

/* loaded from: classes6.dex */
class PackageIdentityUtils {

    interface SignaturesCompat {
        java.util.List<byte[]> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException;

        boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException;
    }

    private PackageIdentityUtils() {
    }

    static class Api28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Api28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (android.content.pm.Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(androidx.browser.trusted.PackageIdentityUtils.getHighSpeedVideoSizes(signature));
                }
                return arrayList;
            }
            arrayList.add(androidx.browser.trusted.PackageIdentityUtils.getHighSpeedVideoSizes(signingInfo.getSigningCertificateHistory()[0]));
            return arrayList;
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
            java.util.List<byte[]> highResolutionOutputSizeshNQ4ISI;
            tokenContents.getHighSpeedVideoFpsRangesFor();
            java.lang.String str2 = tokenContents.Camera2StreamConfigurationMap;
            if (str2 != null) {
                if (!str2.equals(str) || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, packageManager)) == null) {
                    return false;
                }
                if (highResolutionOutputSizeshNQ4ISI.size() != 1) {
                    return tokenContents.equals(androidx.browser.trusted.TokenContents.getHighSpeedVideoFpsRangesFor(str, highResolutionOutputSizeshNQ4ISI));
                }
                tokenContents.getHighSpeedVideoFpsRangesFor();
                java.util.List<byte[]> list = tokenContents.getHighSpeedVideoFpsRanges;
                if (list != null) {
                    return packageManager.hasSigningCertificate(str, java.util.Arrays.copyOf(list.get(0), tokenContents.getHighSpeedVideoFpsRanges.get(0).length), 1);
                }
                throw new java.lang.IllegalStateException();
            }
            throw new java.lang.IllegalStateException();
        }
    }

    static class Pre28Implementation implements androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat {
        Pre28Implementation() {
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public java.util.List<byte[]> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            java.util.ArrayList arrayList = new java.util.ArrayList(packageInfo.signatures.length);
            for (android.content.pm.Signature signature : packageInfo.signatures) {
                byte[] highSpeedVideoSizes = androidx.browser.trusted.PackageIdentityUtils.getHighSpeedVideoSizes(signature);
                if (highSpeedVideoSizes == null) {
                    return null;
                }
                arrayList.add(highSpeedVideoSizes);
            }
            return arrayList;
        }

        @Override // androidx.browser.trusted.PackageIdentityUtils.SignaturesCompat
        public boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) throws java.io.IOException, android.content.pm.PackageManager.NameNotFoundException {
            java.util.List<byte[]> highResolutionOutputSizeshNQ4ISI;
            tokenContents.getHighSpeedVideoFpsRangesFor();
            java.lang.String str2 = tokenContents.Camera2StreamConfigurationMap;
            if (str2 != null) {
                if (str.equals(str2) && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, packageManager)) != null) {
                    return tokenContents.equals(androidx.browser.trusted.TokenContents.getHighSpeedVideoFpsRangesFor(str, highResolutionOutputSizeshNQ4ISI));
                }
                return false;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    static byte[] getHighSpeedVideoSizes(android.content.pm.Signature signature) {
        try {
            return java.security.MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (java.security.NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static java.util.List<byte[]> getHighSpeedVideoFpsRanges(java.lang.String str, android.content.pm.PackageManager packageManager) {
        try {
            return (android.os.Build.VERSION.SDK_INT >= 28 ? new androidx.browser.trusted.PackageIdentityUtils.Api28Implementation() : new androidx.browser.trusted.PackageIdentityUtils.Pre28Implementation()).getHighResolutionOutputSizeshNQ4ISI(str, packageManager);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.content.pm.PackageManager packageManager, androidx.browser.trusted.TokenContents tokenContents) {
        try {
            return (android.os.Build.VERSION.SDK_INT >= 28 ? new androidx.browser.trusted.PackageIdentityUtils.Api28Implementation() : new androidx.browser.trusted.PackageIdentityUtils.Pre28Implementation()).getHighResolutionOutputSizeshNQ4ISI(str, packageManager, tokenContents);
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.io.IOException unused) {
            return false;
        }
    }
}
