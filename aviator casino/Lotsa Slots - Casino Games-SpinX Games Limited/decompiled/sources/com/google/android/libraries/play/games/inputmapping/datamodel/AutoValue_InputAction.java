package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class AutoValue_InputAction extends com.google.android.libraries.play.games.inputmapping.datamodel.InputAction {
    private final java.lang.String zza;
    private final int zzb;
    private final com.google.android.libraries.play.games.inputmapping.datamodel.InputControls zzc;

    AutoValue_InputAction(java.lang.String str, int i, com.google.android.libraries.play.games.inputmapping.datamodel.InputControls inputControls) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null actionLabel");
        }
        this.zza = str;
        this.zzb = i;
        if (inputControls == null) {
            throw new java.lang.NullPointerException("Null inputControls");
        }
        this.zzc = inputControls;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    java.lang.String actionLabel() {
        return this.zza;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.play.games.inputmapping.datamodel.InputAction) {
            com.google.android.libraries.play.games.inputmapping.datamodel.InputAction inputAction = (com.google.android.libraries.play.games.inputmapping.datamodel.InputAction) obj;
            if (this.zza.equals(inputAction.actionLabel()) && this.zzb == inputAction.uniqueId() && this.zzc.equals(inputAction.inputControls())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    com.google.android.libraries.play.games.inputmapping.datamodel.InputControls inputControls() {
        return this.zzc;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        int i = this.zzb;
        java.lang.String obj = this.zzc.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 35 + java.lang.String.valueOf(i).length() + 16 + obj.length() + 1);
        sb.append("InputAction{actionLabel=");
        sb.append(str);
        sb.append(", uniqueId=");
        sb.append(i);
        sb.append(", inputControls=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputAction
    int uniqueId() {
        return this.zzb;
    }
}
