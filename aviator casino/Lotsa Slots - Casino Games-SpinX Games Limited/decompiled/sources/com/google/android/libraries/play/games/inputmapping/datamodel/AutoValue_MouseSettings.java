package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class AutoValue_MouseSettings extends com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings {
    private final boolean zza;
    private final boolean zzb;

    AutoValue_MouseSettings(boolean z, boolean z2) {
        this.zza = z;
        this.zzb = z2;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings
    boolean allowMouseSensitivityAdjustment() {
        return this.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings) {
            com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings mouseSettings = (com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings) obj;
            if (this.zza == mouseSettings.allowMouseSensitivityAdjustment() && this.zzb == mouseSettings.invertMouseMovement()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.zza ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.zzb ? 1231 : 1237);
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings
    boolean invertMouseMovement() {
        return this.zzb;
    }

    public final java.lang.String toString() {
        boolean z = this.zza;
        boolean z2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(z).length() + 68 + java.lang.String.valueOf(z2).length() + 1);
        sb.append("MouseSettings{allowMouseSensitivityAdjustment=");
        sb.append(z);
        sb.append(", invertMouseMovement=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
