package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class AutoValue_InputMap extends com.google.android.libraries.play.games.inputmapping.datamodel.InputMap {
    private final java.util.List zza;
    private final com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings zzb;

    AutoValue_InputMap(java.util.List list, com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings mouseSettings) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null inputGroups");
        }
        this.zza = list;
        if (mouseSettings == null) {
            throw new java.lang.NullPointerException("Null mouseSettings");
        }
        this.zzb = mouseSettings;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.play.games.inputmapping.datamodel.InputMap) {
            com.google.android.libraries.play.games.inputmapping.datamodel.InputMap inputMap = (com.google.android.libraries.play.games.inputmapping.datamodel.InputMap) obj;
            if (this.zza.equals(inputMap.inputGroups()) && this.zzb.equals(inputMap.mouseSettings())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputMap
    java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup> inputGroups() {
        return this.zza;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputMap
    com.google.android.libraries.play.games.inputmapping.datamodel.MouseSettings mouseSettings() {
        return this.zzb;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 37 + obj2.length() + 1);
        sb.append("InputMap{inputGroups=");
        sb.append(obj);
        sb.append(", mouseSettings=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
