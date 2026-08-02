package com.google.i18n.phonenumbers.internal;

/* loaded from: classes9.dex */
public final class RegexBasedMatcher implements com.google.i18n.phonenumbers.internal.MatcherApi {
    private final com.google.i18n.phonenumbers.internal.RegexCache regexCache = new com.google.i18n.phonenumbers.internal.RegexCache(100);

    public static com.google.i18n.phonenumbers.internal.MatcherApi create() {
        return new com.google.i18n.phonenumbers.internal.RegexBasedMatcher();
    }

    private RegexBasedMatcher() {
    }

    @Override // com.google.i18n.phonenumbers.internal.MatcherApi
    public final boolean matchNationalNumber(java.lang.CharSequence charSequence, com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z) {
        java.lang.String nationalNumberPattern = phoneNumberDesc.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        return match(charSequence, this.regexCache.getPatternForRegex(nationalNumberPattern), z);
    }

    private static boolean match(java.lang.CharSequence charSequence, java.util.regex.Pattern pattern, boolean z) {
        java.util.regex.Matcher matcher = pattern.matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            return true;
        }
        return z;
    }
}
