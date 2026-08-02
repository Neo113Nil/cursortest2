package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public class SplitInstallRequest {
    private final java.util.List zza;
    private final java.util.List zzb;

    /* synthetic */ SplitInstallRequest(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder builder, com.google.android.play.core.splitinstall.zzaj zzajVar) {
        this.zza = new java.util.ArrayList(builder.zza);
        this.zzb = new java.util.ArrayList(builder.zzb);
    }

    public static com.google.android.play.core.splitinstall.SplitInstallRequest.Builder newBuilder() {
        return new com.google.android.play.core.splitinstall.SplitInstallRequest.Builder(null);
    }

    public java.lang.String toString() {
        return java.lang.String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.zza, this.zzb);
    }

    public static class Builder {
        private final java.util.List zza = new java.util.ArrayList();
        private final java.util.List zzb = new java.util.ArrayList();

        private Builder() {
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addLanguage(java.util.Locale locale) {
            this.zzb.add(locale);
            return this;
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addModule(java.lang.String str) {
            this.zza.add(str);
            return this;
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest build() {
            return new com.google.android.play.core.splitinstall.SplitInstallRequest(this, null);
        }

        /* synthetic */ Builder(com.google.android.play.core.splitinstall.zzai zzaiVar) {
        }
    }

    public java.util.List<java.lang.String> getModuleNames() {
        return this.zza;
    }

    public java.util.List<java.util.Locale> getLanguages() {
        return this.zzb;
    }
}
