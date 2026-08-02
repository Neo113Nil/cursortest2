package com.google.i18n.phonenumbers;

/* loaded from: classes9.dex */
public final class PhoneNumberMatch {
    private final com.google.i18n.phonenumbers.Phonenumber.PhoneNumber number;
    private final java.lang.String rawString;
    private final int start;

    PhoneNumberMatch(int i, java.lang.String str, com.google.i18n.phonenumbers.Phonenumber.PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Start index must be >= 0.");
        }
        if (str == null || phoneNumber == null) {
            throw null;
        }
        this.start = i;
        this.rawString = str;
        this.number = phoneNumber;
    }

    public final com.google.i18n.phonenumbers.Phonenumber.PhoneNumber number() {
        return this.number;
    }

    public final int start() {
        return this.start;
    }

    public final int end() {
        return this.start + this.rawString.length();
    }

    public final java.lang.String rawString() {
        return this.rawString;
    }

    public final int hashCode() {
        int i = this.start;
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(i), this.rawString, this.number});
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.i18n.phonenumbers.PhoneNumberMatch)) {
            return false;
        }
        com.google.i18n.phonenumbers.PhoneNumberMatch phoneNumberMatch = (com.google.i18n.phonenumbers.PhoneNumberMatch) obj;
        return this.rawString.equals(phoneNumberMatch.rawString) && this.start == phoneNumberMatch.start && this.number.equals(phoneNumberMatch.number);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneNumberMatch [");
        sb.append(start());
        sb.append(",");
        sb.append(end());
        sb.append(") ");
        sb.append(this.rawString);
        return sb.toString();
    }
}
