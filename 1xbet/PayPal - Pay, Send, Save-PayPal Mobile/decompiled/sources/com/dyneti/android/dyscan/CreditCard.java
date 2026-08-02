package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class CreditCard implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.dyneti.android.dyscan.CreditCard> CREATOR = new com.dyneti.android.dyscan.k0();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3279a;
    public final java.lang.StringBuffer b;
    public final java.lang.StringBuffer c;
    public final java.lang.StringBuffer d;
    public final long e;
    public final com.dyneti.android.dyscan.DeclineReasons f;
    public java.lang.String g;
    public final com.dyneti.android.dyscan.m0 h;
    public final java.lang.String i;

    public CreditCard(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.h = com.dyneti.android.dyscan.m0.f3323a;
        this.e = java.lang.System.currentTimeMillis() / 1000;
        com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
        this.b = new java.lang.StringBuffer(str);
        com.dyneti.android.dyscan.l0 l0Var2 = com.dyneti.android.dyscan.l0.f3319a;
        this.c = new java.lang.StringBuffer(java.lang.String.valueOf(i));
        com.dyneti.android.dyscan.l0 l0Var3 = com.dyneti.android.dyscan.l0.f3319a;
        this.d = new java.lang.StringBuffer(java.lang.String.valueOf(i2));
        this.f = null;
        this.f3279a = java.util.UUID.randomUUID().toString().toLowerCase();
        this.g = null;
        this.i = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String getCardNumber() {
        java.lang.String obj = this.b.toString();
        com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
        return obj;
    }

    public java.lang.String getCardOrientation() {
        char c;
        java.lang.String str = this.i;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == 3739) {
            if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_UP)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3317767) {
            if (hashCode == 108511772 && str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? (c == 1 || c == 2) ? "vertical" : str : "horizontal";
    }

    public com.dyneti.android.dyscan.DeclineReasons getDeclineReasons() {
        return this.f;
    }

    public int getExpiryMonth() {
        java.lang.String obj = this.c.toString();
        com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
        return java.lang.Integer.parseInt(obj);
    }

    public int getExpiryYear() {
        java.lang.String obj = this.d.toString();
        com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
        return java.lang.Integer.parseInt(obj);
    }

    public java.lang.String getLastFourDigitsOfCardNumber() {
        java.lang.String cardNumber = getCardNumber();
        if (cardNumber == null) {
            return "";
        }
        return cardNumber.substring(cardNumber.length() - java.lang.Math.min(4, cardNumber.length()));
    }

    public java.lang.String getPayloadId() {
        return this.g;
    }

    public java.lang.String getScanId() {
        return this.f3279a;
    }

    public long getTimestamp() {
        return this.e;
    }

    public boolean isFraud() {
        com.dyneti.android.dyscan.DeclineReasons declineReasons = this.f;
        if (declineReasons == null) {
            return false;
        }
        return declineReasons.isFormatMismatch() || this.f.isNumberMismatch() || this.f.isGeneratedImage() || this.f.isRateLimited() || this.f.isTamperedFeatures();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.e);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c.toString());
        parcel.writeString(this.d.toString());
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.f3279a);
        parcel.writeString(this.g);
        parcel.writeString(this.i);
    }

    public CreditCard(android.os.Parcel parcel) {
        this.h = com.dyneti.android.dyscan.m0.f3323a;
        this.e = parcel.readLong();
        this.b = new java.lang.StringBuffer(parcel.readString());
        this.c = new java.lang.StringBuffer(parcel.readString());
        this.d = new java.lang.StringBuffer(parcel.readString());
        this.f = (com.dyneti.android.dyscan.DeclineReasons) parcel.readParcelable(com.dyneti.android.dyscan.DeclineReasons.class.getClassLoader());
        this.f3279a = parcel.readString();
        this.g = parcel.readString();
        this.i = parcel.readString();
    }
}
