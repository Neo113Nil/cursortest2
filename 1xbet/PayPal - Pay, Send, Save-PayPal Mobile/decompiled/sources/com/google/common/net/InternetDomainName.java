package com.google.common.net;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class InternetDomainName {
    private static final com.google.common.base.CharMatcher DASH_MATCHER;
    private static final com.google.common.base.CharMatcher DIGIT_MATCHER;
    private static final com.google.common.base.CharMatcher LETTER_MATCHER;
    private static final int MAX_DOMAIN_PART_LENGTH = 63;
    private static final int MAX_LENGTH = 253;
    private static final int MAX_PARTS = 127;
    private static final int NO_SUFFIX_FOUND = -1;
    private static final com.google.common.base.CharMatcher PART_CHAR_MATCHER;
    private static final int SUFFIX_NOT_INITIALIZED = -2;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f3866name;
    private final com.google.common.collect.ImmutableList<java.lang.String> parts;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int publicSuffixIndexCache = -2;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private int registrySuffixIndexCache = -2;
    private static final com.google.common.base.CharMatcher DOTS_MATCHER = com.google.common.base.CharMatcher.anyOf(".。．｡");
    private static final com.google.common.base.Splitter DOT_SPLITTER = com.google.common.base.Splitter.on(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    private static final com.google.common.base.Joiner DOT_JOINER = com.google.common.base.Joiner.on(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);

    static {
        com.google.common.base.CharMatcher anyOf = com.google.common.base.CharMatcher.anyOf("-_");
        DASH_MATCHER = anyOf;
        com.google.common.base.CharMatcher inRange = com.google.common.base.CharMatcher.inRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9');
        DIGIT_MATCHER = inRange;
        com.google.common.base.CharMatcher or = com.google.common.base.CharMatcher.inRange('a', io.ktor.util.date.GMTDateParser.ZONE).or(com.google.common.base.CharMatcher.inRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO));
        LETTER_MATCHER = or;
        PART_CHAR_MATCHER = inRange.or(or).or(anyOf);
    }

    InternetDomainName(java.lang.String str) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(DOTS_MATCHER.replaceFrom(str, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        com.google.common.base.Preconditions.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.f3866name = lowerCase;
        com.google.common.collect.ImmutableList<java.lang.String> copyOf = com.google.common.collect.ImmutableList.copyOf(DOT_SPLITTER.split(lowerCase));
        this.parts = copyOf;
        com.google.common.base.Preconditions.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        com.google.common.base.Preconditions.checkArgument(validateSyntax(copyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    private InternetDomainName(java.lang.String str, com.google.common.collect.ImmutableList<java.lang.String> immutableList) {
        com.google.common.base.Preconditions.checkArgument(!immutableList.isEmpty(), "Cannot create an InternetDomainName with zero parts.");
        this.f3866name = str;
        this.parts = immutableList;
    }

    private int publicSuffixIndex() {
        int i = this.publicSuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int findSuffixOfType = findSuffixOfType(com.google.common.base.Optional.absent());
        this.publicSuffixIndexCache = findSuffixOfType;
        return findSuffixOfType;
    }

    private int registrySuffixIndex() {
        int i = this.registrySuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int findSuffixOfType = findSuffixOfType(com.google.common.base.Optional.of(com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY));
        this.registrySuffixIndexCache = findSuffixOfType;
        return findSuffixOfType;
    }

    private int findSuffixOfType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> optional) {
        int size = this.parts.size();
        for (int i = 0; i < size; i++) {
            java.lang.String join = DOT_JOINER.join(this.parts.subList(i, size));
            if (i > 0 && matchesType(optional, com.google.common.base.Optional.fromNullable(com.google.thirdparty.publicsuffix.PublicSuffixPatterns.UNDER.get(join)))) {
                return i - 1;
            }
            if (matchesType(optional, com.google.common.base.Optional.fromNullable(com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXACT.get(join)))) {
                return i;
            }
            if (com.google.thirdparty.publicsuffix.PublicSuffixPatterns.EXCLUDED.containsKey(join)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static com.google.common.net.InternetDomainName from(java.lang.String str) {
        return new com.google.common.net.InternetDomainName((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
    }

    private static boolean validateSyntax(java.util.List<java.lang.String> list) {
        int size = list.size() - 1;
        if (!validatePart(list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart(list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validatePart(java.lang.String str, boolean z) {
        if (str.length() > 0 && str.length() <= 63) {
            if (!PART_CHAR_MATCHER.matchesAllOf(com.google.common.base.CharMatcher.ascii().retainFrom(str))) {
                return false;
            }
            com.google.common.base.CharMatcher charMatcher = DASH_MATCHER;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                return (z && DIGIT_MATCHER.matches(str.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public final com.google.common.collect.ImmutableList<java.lang.String> parts() {
        return this.parts;
    }

    public final boolean isPublicSuffix() {
        return publicSuffixIndex() == 0;
    }

    public final boolean hasPublicSuffix() {
        return publicSuffixIndex() != -1;
    }

    public final com.google.common.net.InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return ancestor(publicSuffixIndex());
        }
        return null;
    }

    public final boolean isUnderPublicSuffix() {
        return publicSuffixIndex() > 0;
    }

    public final boolean isTopPrivateDomain() {
        return publicSuffixIndex() == 1;
    }

    public final com.google.common.net.InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        com.google.common.base.Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.f3866name);
        return ancestor(publicSuffixIndex() - 1);
    }

    public final boolean isRegistrySuffix() {
        return registrySuffixIndex() == 0;
    }

    public final boolean hasRegistrySuffix() {
        return registrySuffixIndex() != -1;
    }

    public final com.google.common.net.InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return ancestor(registrySuffixIndex());
        }
        return null;
    }

    public final boolean isUnderRegistrySuffix() {
        return registrySuffixIndex() > 0;
    }

    public final boolean isTopDomainUnderRegistrySuffix() {
        return registrySuffixIndex() == 1;
    }

    public final com.google.common.net.InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        com.google.common.base.Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.f3866name);
        return ancestor(registrySuffixIndex() - 1);
    }

    public final boolean hasParent() {
        return this.parts.size() > 1;
    }

    public final com.google.common.net.InternetDomainName parent() {
        com.google.common.base.Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.f3866name);
        return ancestor(1);
    }

    private com.google.common.net.InternetDomainName ancestor(int i) {
        com.google.common.collect.ImmutableList<java.lang.String> immutableList = this.parts;
        com.google.common.collect.ImmutableList<java.lang.String> subList = immutableList.subList(i, immutableList.size());
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.parts.get(i3).length();
        }
        return new com.google.common.net.InternetDomainName(this.f3866name.substring(i2), subList);
    }

    public final com.google.common.net.InternetDomainName child(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
        sb.append(".");
        sb.append(this.f3866name);
        return from(sb.toString());
    }

    public static boolean isValid(java.lang.String str) {
        try {
            from(str);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }

    private static boolean matchesType(com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> optional, com.google.common.base.Optional<com.google.thirdparty.publicsuffix.PublicSuffixType> optional2) {
        return optional.isPresent() ? optional.equals(optional2) : optional2.isPresent();
    }

    public final java.lang.String toString() {
        return this.f3866name;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.common.net.InternetDomainName) {
            return this.f3866name.equals(((com.google.common.net.InternetDomainName) obj).f3866name);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3866name.hashCode();
    }
}
