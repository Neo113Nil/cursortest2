package my.com.softspace.ssfasstapsdk;

/* loaded from: classes17.dex */
public final class FasstapSDKInfo {
    my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo attestationInstanceInfo;
    java.lang.String cotsId;
    java.util.List<my.com.softspace.ssfasstapsdk.KernelInfo> kernelInfo;
    java.lang.String mpocSdkVersion;
    java.lang.String sdkInitTimeStamp = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    java.lang.String sdkVersion;

    private FasstapSDKInfo(java.lang.String str, java.lang.String str2, my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo attestationInstanceInfo, java.lang.String str3, java.util.List<my.com.softspace.ssfasstapsdk.KernelInfo> list) {
        this.sdkVersion = str;
        this.mpocSdkVersion = str2;
        this.attestationInstanceInfo = attestationInstanceInfo;
        this.cotsId = str3;
        this.kernelInfo = list;
    }

    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    public final java.lang.String getMPoCSdkVersion() {
        return this.mpocSdkVersion;
    }

    public final my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo getAttestationInstanceInfo() {
        return this.attestationInstanceInfo;
    }

    public final java.lang.String getCotsId() {
        return this.cotsId;
    }

    public final java.util.List<my.com.softspace.ssfasstapsdk.KernelInfo> getKernelInfo() {
        return this.kernelInfo;
    }

    static my.com.softspace.ssfasstapsdk.FasstapSDKInfo getHighSpeedVideoFpsRangesFor(android.content.Context context, my.com.softspace.ssfasstapsdk.pog.AttestationPOG attestationPOG) {
        java.lang.String string;
        my.com.softspace.ssfasstapsdk.pog.AttestationInstanceInfo instanceInfo = attestationPOG != null ? attestationPOG.getInstanceInfo() : null;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new my.com.softspace.ssfasstapsdk.KernelInfo(my.com.softspace.ssfasstapsdk.KernelInfo.KernelType.Visa, my.com.softspace.ssfasstapsdk.BuildConfig.VISA_KERNEL_CHECKSUM, null));
        arrayList.add(new my.com.softspace.ssfasstapsdk.KernelInfo(my.com.softspace.ssfasstapsdk.KernelInfo.KernelType.Master, null, my.com.softspace.ssfasstapsdk.BuildConfig.MASTERCARD_CONTACTLESS_KERNEL));
        if (attestationPOG != null && attestationPOG.getInstanceInfo() != null && !android.text.TextUtils.isEmpty(attestationPOG.getInstanceInfo().getDeviceId())) {
            string = attestationPOG.getInstanceInfo().getDeviceId();
        } else {
            string = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        }
        return new my.com.softspace.ssfasstapsdk.FasstapSDKInfo(my.com.softspace.ssfasstapsdk.BuildConfig.SDK_VERSION, my.com.softspace.sspog.BuildConfig.VERSION_NAME, instanceInfo, string, arrayList);
    }

    public final java.lang.String getSdkInitTimeStamp() {
        return this.sdkInitTimeStamp;
    }

    public final void resetSdkInitTimeStamp() {
        this.sdkInitTimeStamp = null;
    }
}
