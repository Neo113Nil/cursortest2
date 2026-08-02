package com.jakewharton.threetenabp;

/* loaded from: classes9.dex */
final class AssetsZoneRulesInitializer extends org.threeten.bp.zone.ZoneRulesInitializer {
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    AssetsZoneRulesInitializer(android.content.Context context, java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = str;
    }

    @Override // org.threeten.bp.zone.ZoneRulesInitializer
    public final void initializeProviders() {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = this.getHighResolutionOutputSizeshNQ4ISI.getAssets().open(this.getHighSpeedVideoSizes);
                org.threeten.bp.zone.TzdbZoneRulesProvider tzdbZoneRulesProvider = new org.threeten.bp.zone.TzdbZoneRulesProvider(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                org.threeten.bp.zone.ZoneRulesProvider.registerProvider(tzdbZoneRulesProvider);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this.getHighSpeedVideoSizes);
                sb.append(" missing from assets");
                throw new java.lang.IllegalStateException(sb.toString(), e);
            }
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }
}
