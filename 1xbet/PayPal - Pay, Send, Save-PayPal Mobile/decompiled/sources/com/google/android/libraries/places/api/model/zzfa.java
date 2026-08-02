package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
final class zzfa extends com.google.android.libraries.places.api.model.zzbo {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.api.model.zzfa> CREATOR = new com.google.android.libraries.places.api.model.zzez();

    zzfa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Double d, com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution, java.lang.String str6, java.lang.String str7, android.net.Uri uri, com.google.android.libraries.places.api.model.LocalDate localDate) {
        super(str, str2, str3, str4, str5, d, authorAttribution, str6, str7, uri, localDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (getRelativePublishTimeDescription() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getRelativePublishTimeDescription());
        }
        if (getText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getText());
        }
        if (getTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getTextLanguageCode());
        }
        if (getOriginalText() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalText());
        }
        if (getOriginalTextLanguageCode() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getOriginalTextLanguageCode());
        }
        parcel.writeDouble(getRating().doubleValue());
        parcel.writeParcelable(getAuthorAttribution(), i);
        parcel.writeString(getAttribution());
        if (getPublishTime() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(getPublishTime());
        }
        parcel.writeParcelable(getFlagContentUri(), i);
        parcel.writeParcelable(getVisitDate(), i);
    }
}
