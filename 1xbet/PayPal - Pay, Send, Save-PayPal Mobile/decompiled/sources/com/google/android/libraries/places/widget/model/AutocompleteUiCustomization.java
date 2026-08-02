package com.google.android.libraries.places.widget.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB;\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\nH\u0016J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000f\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\nJ\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "Landroid/os/Parcelable;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "noMatchingResultsMessage", "", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "searchBarHint", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "", "<init>", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Ljava/lang/String;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "equals", "", "other", "", "hashCode", "()Ljava/lang/Integer;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Builder", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutocompleteUiCustomization implements android.os.Parcelable {
    private final com.google.android.libraries.places.widget.model.AutocompleteListDensity zza;
    private final java.lang.String zzb;
    private final com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzc;
    private final java.lang.String zzd;
    private final java.lang.Integer zze;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Companion INSTANCE = new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Companion(null);
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.widget.model.AutocompleteUiCustomization> CREATOR = new com.google.android.libraries.places.widget.model.zzd();

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u000bJ\u0019\u0010\u0019\u001a\u00020\u00002\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H\u0007R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\"\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "", "<init>", "()V", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "getListDensity", "()Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "setListDensity", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;)V", "noMatchingResultsMessage", "", "getNoMatchingResultsMessage", "()Ljava/lang/String;", "setNoMatchingResultsMessage", "(Ljava/lang/String;)V", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "getListItemIcon", "()Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", "setListItemIcon", "(Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;)V", "searchBarHint", "getSearchBarHint", "setSearchBarHint", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "", "getTheme", "()Ljava/lang/Integer;", "setTheme", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "(Ljava/lang/Integer;)Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "build", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private com.google.android.libraries.places.widget.model.AutocompleteListDensity zza;
        private com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzb;
        private java.lang.Integer zzc;

        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization build() {
            return new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization(this.zza, null, this.zzb, null, this.zzc, null);
        }

        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder listDensity(com.google.android.libraries.places.widget.model.AutocompleteListDensity listDensity) {
            this.zza = listDensity;
            return this;
        }

        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder listItemIcon(com.google.android.libraries.places.widget.model.AutocompleteUiIcon listItemIcon) {
            this.zzb = listItemIcon;
            return this;
        }

        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder theme(java.lang.Integer theme) {
            this.zzc = theme;
            return this;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.android.libraries.places.widget.model.AutocompleteUiCustomization)) {
            return false;
        }
        com.google.android.libraries.places.widget.model.AutocompleteListDensity zza = getZza();
        java.lang.String name2 = zza != null ? zza.name() : null;
        com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization = (com.google.android.libraries.places.widget.model.AutocompleteUiCustomization) other;
        com.google.android.libraries.places.widget.model.AutocompleteListDensity zza2 = autocompleteUiCustomization.getZza();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, zza2 != null ? zza2.name() : null) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzb, autocompleteUiCustomization.zzb)) {
            com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzc = getZzc();
            java.lang.Integer valueOf = zzc != null ? java.lang.Integer.valueOf(zzc.getZza()) : null;
            com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzc2 = autocompleteUiCustomization.getZzc();
            if (kotlin.jvm.internal.Intrinsics.areEqual(valueOf, zzc2 != null ? java.lang.Integer.valueOf(zzc2.getZza()) : null) && kotlin.jvm.internal.Intrinsics.areEqual(this.zzd, autocompleteUiCustomization.zzd) && kotlin.jvm.internal.Intrinsics.areEqual(getZze(), autocompleteUiCustomization.getZze())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String name2;
        com.google.android.libraries.places.widget.model.AutocompleteListDensity zza = getZza();
        int hashCode = (zza == null || (name2 = zza.name()) == null) ? 0 : name2.hashCode();
        java.lang.String str = this.zzb;
        int hashCode2 = str != null ? str.hashCode() : 0;
        com.google.android.libraries.places.widget.model.AutocompleteUiIcon zzc = getZzc();
        int hashCode3 = zzc != null ? java.lang.Integer.valueOf(zzc.getZza()).hashCode() : 0;
        java.lang.String str2 = this.zzd;
        int hashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.Integer zze = getZze();
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (zze != null ? zze.hashCode() : 0);
    }

    /* renamed from: zzb, reason: from getter */
    public final java.lang.String getZzd() {
        return this.zzd;
    }

    /* renamed from: zza, reason: from getter */
    public final java.lang.String getZzb() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity = this.zza;
        if (autocompleteListDensity == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteListDensity.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzb);
        com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon = this.zzc;
        if (autocompleteUiIcon == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autocompleteUiIcon.writeToParcel(dest, flags);
        }
        dest.writeString(this.zzd);
        java.lang.Integer num = this.zze;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    /* renamed from: theme, reason: from getter */
    public final java.lang.Integer getZze() {
        return this.zze;
    }

    /* renamed from: listItemIcon, reason: from getter */
    public final com.google.android.libraries.places.widget.model.AutocompleteUiIcon getZzc() {
        return this.zzc;
    }

    /* renamed from: listDensity, reason: from getter */
    public final com.google.android.libraries.places.widget.model.AutocompleteListDensity getZza() {
        return this.zza;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J1\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Companion;", "", "<init>", "()V", "builder", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization$Builder;", "create", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "listDensity", "Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;", "listItemIcon", "Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "", "(Lcom/google/android/libraries/places/widget/model/AutocompleteListDensity;Lcom/google/android/libraries/places/widget/model/AutocompleteUiIcon;Ljava/lang/Integer;)Lcom/google/android/libraries/places/widget/model/AutocompleteUiCustomization;", "java.com.google.android.libraries.places.widget.model_model_3p"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zza(com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Companion companion, com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity, com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon, java.lang.Integer num, int i, java.lang.Object obj) {
            if (1 == (i & 1)) {
                autocompleteListDensity = null;
            }
            if ((i & 2) != 0) {
                autocompleteUiIcon = null;
            }
            return companion.create(autocompleteListDensity, autocompleteUiIcon, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity listDensity, com.google.android.libraries.places.widget.model.AutocompleteUiIcon listItemIcon, java.lang.Integer theme) {
            return new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder().listDensity(listDensity).listItemIcon(listItemIcon).theme(theme).build();
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity, com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon) {
            return zza(this, autocompleteListDensity, autocompleteUiIcon, null, 4, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity) {
            return zza(this, autocompleteListDensity, null, null, 6, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create() {
            return zza(this, null, null, null, 7, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder builder() {
            return new com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        private Companion() {
            throw null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity, com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon, java.lang.Integer num) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon, num);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity, com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon) {
        return INSTANCE.create(autocompleteListDensity, autocompleteUiIcon);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity) {
        return INSTANCE.create(autocompleteListDensity);
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization create() {
        return INSTANCE.create();
    }

    @kotlin.jvm.JvmStatic
    public static final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.Builder builder() {
        return INSTANCE.builder();
    }

    public /* synthetic */ AutocompleteUiCustomization(com.google.android.libraries.places.widget.model.AutocompleteListDensity autocompleteListDensity, java.lang.String str, com.google.android.libraries.places.widget.model.AutocompleteUiIcon autocompleteUiIcon, java.lang.String str2, java.lang.Integer num, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this.zza = autocompleteListDensity;
        this.zzb = str;
        this.zzc = autocompleteUiIcon;
        this.zzd = str2;
        this.zze = num;
    }
}
