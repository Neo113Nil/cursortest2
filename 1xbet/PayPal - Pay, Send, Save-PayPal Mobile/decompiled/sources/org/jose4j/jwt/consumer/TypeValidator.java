package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
public class TypeValidator implements org.jose4j.jwt.consumer.ErrorCodeValidator {
    private org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType getHighSpeedVideoFpsRangesFor;
    private boolean getHighSpeedVideoSizes;

    public TypeValidator(boolean z, java.lang.String str) {
        try {
            org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType simpleMediaType = str.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? new org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType(str) : new org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType("application", str);
            this.getHighSpeedVideoFpsRangesFor = simpleMediaType;
            if (simpleMediaType.getHighSpeedVideoFpsRangesFor.equals("*")) {
                throw new org.jose4j.lang.UncheckedJoseException("cannot use wildcard in subtype of expected type");
            }
            this.getHighSpeedVideoSizes = z;
        } catch (org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The given expected type '");
            sb.append(str);
            sb.append("' isn't a valid media type in this context.");
            throw new org.jose4j.lang.UncheckedJoseException(sb.toString(), e);
        }
    }

    @Override // org.jose4j.jwt.consumer.ErrorCodeValidator
    public org.jose4j.jwt.consumer.ErrorCodeValidator.Error validate(org.jose4j.jwt.consumer.JwtContext jwtContext) {
        return getHighSpeedVideoFpsRanges(jwtContext.getJoseObjects().get(0).getHeader("typ"));
    }

    private org.jose4j.jwt.consumer.ErrorCodeValidator.Error getHighSpeedVideoFpsRanges(java.lang.String str) {
        if (str == null) {
            if (this.getHighSpeedVideoSizes) {
                return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(21, "No typ header parameter present in the innermost JWS/JWE");
            }
            return null;
        }
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            return null;
        }
        try {
            org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType simpleMediaType = str.contains(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR) ? new org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType(str) : new org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType("application", str);
            org.jose4j.jwt.consumer.TypeValidator.SimpleMediaType simpleMediaType2 = this.getHighSpeedVideoFpsRangesFor;
            if (simpleMediaType2.getHighSpeedVideoSizes.equals(simpleMediaType.getHighSpeedVideoSizes) && ((simpleMediaType2.getHighSpeedVideoFpsRangesFor.equals(simpleMediaType.getHighSpeedVideoFpsRangesFor) || simpleMediaType2.getHighSpeedVideoFpsRangesFor.equals("*") || simpleMediaType.getHighSpeedVideoFpsRangesFor.equals("*")) && !simpleMediaType.getHighSpeedVideoFpsRangesFor.equals("*"))) {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid typ header parameter value '");
            sb.append(str);
            sb.append("'. Expecting '");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("'");
            if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes.equals("application")) {
                sb.append(" or just '");
                sb.append(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor);
                sb.append("'");
            }
            sb.append(".");
            return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(22, sb.toString());
        } catch (org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("typ header parameter value '");
            sb2.append(str);
            sb2.append("' not parsable as a media type ");
            sb2.append(e);
            return new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(22, sb2.toString());
        }
    }

    static class MediaTypeParseException extends java.lang.Exception {
        MediaTypeParseException(java.lang.String str) {
            super(str);
        }
    }

    static class SimpleMediaType {
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;

        SimpleMediaType(java.lang.String str) throws org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                throw new org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException("Cannot find sub type.");
            }
            int indexOf2 = str.indexOf(59);
            if (indexOf2 < 0) {
                this.getHighSpeedVideoSizes = str.substring(0, indexOf).trim().toLowerCase(java.util.Locale.ENGLISH);
                this.getHighSpeedVideoFpsRangesFor = str.substring(indexOf + 1).trim().toLowerCase(java.util.Locale.ENGLISH);
            } else {
                if (indexOf >= indexOf2) {
                    throw new org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException("Cannot find sub type.");
                }
                this.getHighSpeedVideoSizes = str.substring(0, indexOf).trim().toLowerCase(java.util.Locale.ENGLISH);
                this.getHighSpeedVideoFpsRangesFor = str.substring(indexOf + 1, indexOf2).trim().toLowerCase(java.util.Locale.ENGLISH);
            }
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
        }

        SimpleMediaType(java.lang.String str, java.lang.String str2) throws org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException {
            java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
            this.getHighSpeedVideoSizes = lowerCase;
            getHighSpeedVideoFpsRangesFor(lowerCase);
            java.lang.String lowerCase2 = str2.toLowerCase(java.util.Locale.ENGLISH);
            this.getHighSpeedVideoFpsRangesFor = lowerCase2;
            getHighSpeedVideoFpsRangesFor(lowerCase2);
        }

        private static void getHighSpeedVideoFpsRangesFor(java.lang.String str) throws org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException {
            if (str == null || str.length() == 0) {
                throw new org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException("cannot have empty part");
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt > '~' || "()<>@,;:/[]?=\\\"".indexOf(charAt) >= 0) {
                    throw new org.jose4j.jwt.consumer.TypeValidator.MediaTypeParseException("Invalid token char ".concat(java.lang.String.valueOf(charAt)));
                }
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            return sb.toString();
        }
    }
}
