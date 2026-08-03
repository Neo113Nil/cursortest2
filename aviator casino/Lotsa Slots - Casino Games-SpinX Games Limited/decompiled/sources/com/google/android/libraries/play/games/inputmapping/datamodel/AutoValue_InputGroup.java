package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class AutoValue_InputGroup extends com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup {
    private final java.lang.String zza;
    private final java.util.List zzb;

    AutoValue_InputGroup(java.lang.String str, java.util.List list) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null groupLabel");
        }
        this.zza = str;
        if (list == null) {
            throw new java.lang.NullPointerException("Null inputActions");
        }
        this.zzb = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup) {
            com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup inputGroup = (com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup) obj;
            if (this.zza.equals(inputGroup.groupLabel()) && this.zzb.equals(inputGroup.inputActions())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup
    java.lang.String groupLabel() {
        return this.zza;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputGroup
    java.util.List<com.google.android.libraries.play.games.inputmapping.datamodel.InputAction> inputActions() {
        return this.zzb;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.zza;
        java.lang.String obj = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 37 + obj.length() + 1);
        sb.append("InputGroup{groupLabel=");
        sb.append(str);
        sb.append(", inputActions=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
