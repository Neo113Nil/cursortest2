package com.google.i18n.phonenumbers.metadata.source;

/* loaded from: classes9.dex */
public final class MultiFileModeFileNameProvider implements com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider {
    private final java.lang.String phoneMetadataFileNamePrefix;

    public MultiFileModeFileNameProvider(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_");
        this.phoneMetadataFileNamePrefix = sb.toString();
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.PhoneMetadataFileNameProvider
    public final java.lang.String getFor(java.lang.Object obj) {
        java.lang.String obj2 = obj.toString();
        if (!isAlphanumeric(obj2)) {
            throw new java.lang.IllegalArgumentException("Invalid key: ".concat(java.lang.String.valueOf(obj2)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.phoneMetadataFileNamePrefix);
        sb.append(obj);
        return sb.toString();
    }

    private boolean isAlphanumeric(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (!java.lang.Character.isLetterOrDigit(codePointAt)) {
                return false;
            }
            i += java.lang.Character.charCount(codePointAt);
        }
        return true;
    }
}
