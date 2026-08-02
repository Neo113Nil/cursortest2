package com.visa.cbp.external.common;

/* loaded from: classes16.dex */
public class StepUpRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() { // from class: com.visa.cbp.external.common.StepUpRequest.1
        @Override // android.os.Parcelable.Creator
        public com.visa.cbp.external.common.StepUpRequest createFromParcel(android.os.Parcel parcel) {
            return new com.visa.cbp.external.common.StepUpRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public com.visa.cbp.external.common.StepUpRequest[] newArray(int i) {
            return new com.visa.cbp.external.common.StepUpRequest[i];
        }
    };
    private java.lang.String identifier;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String method;
    private java.lang.String requestPayload;
    private java.lang.String source;

    @com.visa.cbp.external.common.NullValueValidate
    private java.lang.String value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getMethod() {
        return this.method;
    }

    public void setMethod(java.lang.String str) {
        this.method = str;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void setValue(java.lang.String str) {
        this.value = str;
    }

    public java.lang.String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(java.lang.String str) {
        this.identifier = str;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public void setSource(java.lang.String str) {
        this.source = str;
    }

    public java.lang.String getRequestPayload() {
        return this.requestPayload;
    }

    public void setRequestPayload(java.lang.String str) {
        this.requestPayload = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.method);
        parcel.writeString(this.value);
        parcel.writeString(this.identifier);
        parcel.writeString(this.source);
    }

    public StepUpRequest(android.os.Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(android.os.Parcel parcel) {
        this.method = parcel.readString();
        this.value = parcel.readString();
        this.identifier = parcel.readString();
        this.source = parcel.readString();
    }
}
