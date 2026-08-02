package com.visa.cbp.sdk.j.b.d;

/* renamed from: com.visa.cbp.sdk.j.b.d.ᵔ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C0206 {
    private static final java.lang.String getInputFormats = "ᵔ";
    public java.lang.Integer Camera2StreamConfigurationMap;
    public long getHighResolutionOutputSizeshNQ4ISI;
    public java.lang.Long getHighSpeedVideoFpsRanges;
    public java.lang.Integer getHighSpeedVideoFpsRangesFor;
    public java.lang.String getHighSpeedVideoSizes;
    public java.lang.Integer getHighSpeedVideoSizesFor;
    private transient com.visa.cbp.sdk.facade.data.TokenKey getInputSizeshNQ4ISI;
    public java.lang.Integer getOutputMinFrameDuration;

    public C0206(com.visa.cbp.external.common.DynParams dynParams) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1000L;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoFpsRanges = 0L;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputMinFrameDuration = java.lang.Integer.valueOf(dynParams.getMaxPmts());
        this.getHighSpeedVideoSizes = dynParams.getApi();
        this.getHighSpeedVideoSizesFor = java.lang.Integer.valueOf(dynParams.getSc());
        this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(dynParams.getKeyExpTS());
    }

    public C0206() {
        this.getHighResolutionOutputSizeshNQ4ISI = 1000L;
        this.Camera2StreamConfigurationMap = 0;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getOutputMinFrameDuration = 0;
        this.getHighSpeedVideoSizesFor = 1;
        this.getHighSpeedVideoFpsRanges = 0L;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static com.visa.cbp.sdk.j.b.d.C0206 m23132(byte[] bArr, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        try {
            com.visa.cbp.sdk.j.b.d.C0206 c0206 = (com.visa.cbp.sdk.j.b.d.C0206) new com.google.gson.Gson().fromJson(new java.lang.String(bArr), com.visa.cbp.sdk.j.b.d.C0206.class);
            c0206.m23152(tokenKey);
            return c0206;
        } catch (com.google.gson.JsonSyntaxException unused) {
            throw new com.visa.cbp.sdk.facade.exception.SDKUnrecoverableException("Visa's SDK encountered an unrecoverable exception. Please uninstall and reinstall your application");
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m23146(com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return (m23148() || m23140()) && m23155(getsc, tokenKey);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m23149(com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        com.visa.cbp.sdk.facade.TokenRepersoStatus signature = getsc.BuildConfig(tokenKey).setSignature();
        return signature == com.visa.cbp.sdk.facade.TokenRepersoStatus.COMPLETED_REPERSO || signature == com.visa.cbp.sdk.facade.TokenRepersoStatus.NO_MIGRATION;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m23140() {
        return m23141() > m23150().longValue();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m23148() {
        return this.getHighSpeedVideoFpsRangesFor.intValue() >= m23133().intValue();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public boolean m23155(com.visa.cbp.getSc getsc, com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        return com.visa.cbp.sdk.facade.data.TokenStatus.ACTIVE.getValue().equals(getsc.ConfirmReplenishRequest(tokenKey));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public long m23141() {
        return java.lang.System.currentTimeMillis() / 1000;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public java.lang.Integer m23151() {
        return this.Camera2StreamConfigurationMap;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m23153(java.lang.Integer num) {
        this.Camera2StreamConfigurationMap = num;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.lang.Integer m23145() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m23147(java.lang.Integer num) {
        this.getHighSpeedVideoFpsRangesFor = num;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public java.lang.Integer m23133() {
        return this.getOutputMinFrameDuration;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m23142(java.lang.Integer num) {
        this.getOutputMinFrameDuration = num;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public java.lang.String m23156() {
        return this.getHighSpeedVideoSizes;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m23143(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public java.lang.Integer m23135() {
        return this.getHighSpeedVideoSizesFor;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m23139(java.lang.Integer num) {
        this.getHighSpeedVideoSizesFor = num;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public java.lang.Long m23150() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m23154(java.lang.Long l) {
        this.getHighSpeedVideoFpsRanges = l;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m23134() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoFpsRangesFor.intValue() + 1);
        this.getHighSpeedVideoFpsRangesFor = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public int m23144() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.Camera2StreamConfigurationMap.intValue() + 1);
        this.Camera2StreamConfigurationMap = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m23138() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.getHighSpeedVideoSizesFor.intValue() + 1);
        this.getHighSpeedVideoSizesFor = valueOf;
        return valueOf.intValue();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte[] m23137() {
        return new com.google.gson.Gson().toJson(this).getBytes();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public com.visa.cbp.sdk.facade.data.TokenKey m23136() {
        return this.getInputSizeshNQ4ISI;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public void m23152(com.visa.cbp.sdk.facade.data.TokenKey tokenKey) {
        this.getInputSizeshNQ4ISI = tokenKey;
    }
}
