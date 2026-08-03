package com.google.android.libraries.play.games.inputmapping.datamodel;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class AutoValue_InputControls extends com.google.android.libraries.play.games.inputmapping.datamodel.InputControls {
    private final java.util.List zza;
    private final java.util.List zzb;

    AutoValue_InputControls(java.util.List list, java.util.List list2) {
        if (list == null) {
            throw new java.lang.NullPointerException("Null keycodes");
        }
        this.zza = list;
        if (list2 == null) {
            throw new java.lang.NullPointerException("Null mouseActions");
        }
        this.zzb = list2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.play.games.inputmapping.datamodel.InputControls) {
            com.google.android.libraries.play.games.inputmapping.datamodel.InputControls inputControls = (com.google.android.libraries.play.games.inputmapping.datamodel.InputControls) obj;
            if (this.zza.equals(inputControls.keycodes()) && this.zzb.equals(inputControls.mouseActions())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputControls
    java.util.List<java.lang.Integer> keycodes() {
        return this.zza;
    }

    @Override // com.google.android.libraries.play.games.inputmapping.datamodel.InputControls
    java.util.List<java.lang.Integer> mouseActions() {
        return this.zzb;
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        java.lang.String obj2 = this.zzb.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj.length() + 38 + obj2.length() + 1);
        sb.append("InputControls{keycodes=");
        sb.append(obj);
        sb.append(", mouseActions=");
        sb.append(obj2);
        sb.append("}");
        return sb.toString();
    }
}
