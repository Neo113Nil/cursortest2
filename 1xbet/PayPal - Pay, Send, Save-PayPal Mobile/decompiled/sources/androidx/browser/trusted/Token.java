package androidx.browser.trusted;

/* loaded from: classes6.dex */
public final class Token {
    private final androidx.browser.trusted.TokenContents getHighSpeedVideoFpsRangesFor;

    public static androidx.browser.trusted.Token create(java.lang.String str, android.content.pm.PackageManager packageManager) {
        java.util.List<byte[]> highSpeedVideoFpsRanges = androidx.browser.trusted.PackageIdentityUtils.getHighSpeedVideoFpsRanges(str, packageManager);
        if (highSpeedVideoFpsRanges == null) {
            return null;
        }
        try {
            return new androidx.browser.trusted.Token(androidx.browser.trusted.TokenContents.getHighSpeedVideoFpsRangesFor(str, highSpeedVideoFpsRanges));
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public static androidx.browser.trusted.Token deserialize(byte[] bArr) {
        return new androidx.browser.trusted.Token(androidx.browser.trusted.TokenContents.Camera2StreamConfigurationMap(bArr));
    }

    private Token(androidx.browser.trusted.TokenContents tokenContents) {
        this.getHighSpeedVideoFpsRangesFor = tokenContents;
    }

    public final byte[] serialize() {
        byte[] bArr = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean matches(java.lang.String str, android.content.pm.PackageManager packageManager) {
        return androidx.browser.trusted.PackageIdentityUtils.getHighResolutionOutputSizeshNQ4ISI(str, packageManager, this.getHighSpeedVideoFpsRangesFor);
    }
}
