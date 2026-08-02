package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final /* synthetic */ class zzfz implements java.util.Comparator {
    static final /* synthetic */ com.google.android.libraries.places.api.model.zzfz zza = new com.google.android.libraries.places.api.model.zzfz();

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.api.model.LocalDate) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.TimeOfWeek) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.Period) obj).getOpen())).getDate())).compareTo((com.google.android.libraries.places.api.model.LocalDate) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.TimeOfWeek) com.google.common.base.Preconditions.checkNotNull(((com.google.android.libraries.places.api.model.Period) obj2).getOpen())).getDate()));
    }

    private /* synthetic */ zzfz() {
    }
}
