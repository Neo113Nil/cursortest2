package com.visa.cbp;

/* loaded from: classes5.dex */
public class Encoder implements com.visa.cbp.setSignExpo {
    private static final java.lang.String Camera2StreamConfigurationMap = "setSignExpo";
    private com.visa.cbp.setMaxPmts getHighResolutionOutputSizeshNQ4ISI;
    private com.visa.cbp.setWidth getHighSpeedVideoFpsRanges;
    private com.visa.cbp.getApi getHighSpeedVideoFpsRangesFor;
    private com.visa.cbp.getSc getHighSpeedVideoSizes;
    private com.visa.cbp.DynParams getOutputMinFrameDuration;

    public Encoder(com.visa.cbp.getSc getsc, com.visa.cbp.DynParams dynParams, com.visa.cbp.getApi getapi, com.visa.cbp.setMaxPmts setmaxpmts, com.visa.cbp.setWidth setwidth) {
        this.getHighSpeedVideoSizes = getsc;
        this.getOutputMinFrameDuration = dynParams;
        this.getHighResolutionOutputSizeshNQ4ISI = setmaxpmts;
        this.getHighSpeedVideoFpsRangesFor = getapi;
        this.getHighSpeedVideoFpsRanges = setwidth;
    }

    @Override // com.visa.cbp.setSignExpo
    public void valueOf(com.visa.cbp.sdk.facade.data.TokenKey tokenKey, java.lang.String str, byte[] bArr) {
        this.getOutputMinFrameDuration.values(new com.visa.cbp.setParamsStatus(tokenKey, str, bArr));
    }

    @Override // com.visa.cbp.setSignExpo
    public int valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, int i) {
        return this.getHighSpeedVideoSizes.BuildConfig(context, tokenKey, i);
    }

    @Override // com.visa.cbp.setSignExpo
    public void ReplenishAckRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getHighSpeedVideoSizes.valueOf(context, tokenKey);
    }

    @Override // com.visa.cbp.setSignExpo
    public void values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, com.visa.cbp.setTicketMetaData setticketmetadata) {
        this.getHighSpeedVideoFpsRangesFor.values(tokenKey, setticketmetadata, this.getHighResolutionOutputSizeshNQ4ISI.ReplenishRequest());
    }

    @Override // com.visa.cbp.setSignExpo
    public byte[] ConfirmReplenishRequest(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr) throws java.security.UnrecoverableEntryException, java.security.cert.CertificateException, java.security.KeyStoreException, java.security.NoSuchAlgorithmException, java.io.IOException {
        byte[] bArr2;
        byte[] bArr3;
        byte[] valueOf = this.getHighSpeedVideoSizes.valueOf(tokenKey, com.visa.cbp.getCertFormat.ReplenishAckRequest() == null ? 0 : 1).valueOf();
        if ((((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null || com.visa.cbp.getCertFormat.ConfirmReplenishRequest() == null) && this.getHighResolutionOutputSizeshNQ4ISI.getMac()) {
            return this.getHighSpeedVideoFpsRanges.values(context, valueOf, bArr);
        }
        if (com.visa.cbp.getCertFormat.ConfirmReplenishRequest() != null) {
            bArr2 = com.visa.cbp.getCertFormat.ConfirmReplenishRequest().values();
            bArr3 = com.visa.cbp.getCertFormat.ReplenishAckRequest();
        } else {
            bArr2 = null;
            bArr3 = null;
        }
        return this.getHighSpeedVideoFpsRanges.BuildConfig(context, valueOf, bArr, bArr2, bArr3);
    }

    @Override // com.visa.cbp.setSignExpo
    public byte[] values(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] valueOf = this.getHighSpeedVideoSizes.valueOf(tokenKey, com.visa.cbp.getCertFormat.ReplenishAckRequest() == null ? 0 : 1).valueOf();
        if ((((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null || com.visa.cbp.getCertFormat.ConfirmReplenishRequest() == null) && this.getHighResolutionOutputSizeshNQ4ISI.getMac()) {
            return this.getHighSpeedVideoFpsRanges.ReplenishAckRequest(context, valueOf, bArr);
        }
        if (com.visa.cbp.getCertFormat.ConfirmReplenishRequest() != null) {
            bArr2 = com.visa.cbp.getCertFormat.ConfirmReplenishRequest().values();
            bArr3 = com.visa.cbp.getCertFormat.ReplenishAckRequest();
        } else {
            bArr2 = null;
            bArr3 = null;
        }
        return this.getHighSpeedVideoFpsRanges.valueOf(context, valueOf, bArr, bArr2, bArr3);
    }

    @Override // com.visa.cbp.setSignExpo
    public java.lang.String valueOf(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return this.getHighSpeedVideoSizes.getTvls(context, tokenKey).m23156();
    }

    @Override // com.visa.cbp.setSignExpo
    public void valueOf(java.lang.Exception exc) {
        if (exc != null) {
            exc.getMessage();
        }
    }

    @Override // com.visa.cbp.setSignExpo
    public byte[] BuildConfig(android.content.Context context, com.visa.cbp.sdk.facade.data.TokenKey tokenKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.String str) {
        byte[] bArr5;
        byte[] bArr6;
        com.visa.cbp.Content valueOf = this.getHighSpeedVideoSizes.valueOf(tokenKey, com.visa.cbp.getCertFormat.ReplenishAckRequest() == null ? 0 : 1);
        byte[] valueOf2 = valueOf.valueOf();
        byte[] values = valueOf.values();
        if ((((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null || com.visa.cbp.getCertFormat.ConfirmReplenishRequest() == null) && this.getHighResolutionOutputSizeshNQ4ISI.getMac()) {
            return this.getHighSpeedVideoFpsRanges.valueOf(context, valueOf2, bArr, bArr2, bArr3, bArr4, values, str, valueOf.BuildConfig());
        }
        if (com.visa.cbp.getCertFormat.ConfirmReplenishRequest() != null) {
            bArr5 = com.visa.cbp.getCertFormat.ConfirmReplenishRequest().values();
            bArr6 = com.visa.cbp.getCertFormat.ReplenishAckRequest();
        } else {
            bArr5 = null;
            bArr6 = null;
        }
        return this.getHighSpeedVideoFpsRanges.ConfirmReplenishRequest(context, valueOf2, bArr, bArr2, bArr3, bArr4, values, str, bArr5, bArr6);
    }
}
