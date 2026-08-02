package org.modelmapper.convention;

import java.util.HashSet;
import org.modelmapper.convention.InexactMatcher;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.PropertyNameInfo;
import org.modelmapper.spi.Tokens;

/* loaded from: classes4.dex */
final class StandardMatchingStrategy implements MatchingStrategy {
    @Override // org.modelmapper.spi.MatchingStrategy
    public boolean isExact() {
        return false;
    }

    StandardMatchingStrategy() {
    }

    @Override // org.modelmapper.spi.MatchingStrategy
    public boolean matches(PropertyNameInfo propertyNameInfo) {
        return new Matcher(propertyNameInfo).match();
    }

    static class Matcher extends InexactMatcher {
        Matcher(PropertyNameInfo propertyNameInfo) {
            super(propertyNameInfo);
        }

        boolean match() {
            HashSet hashSet = new HashSet();
            for (Tokens tokens : this.propertyNameInfo.getDestinationPropertyTokens()) {
                int i = 0;
                while (i < tokens.size()) {
                    InexactMatcher.DestTokensMatcher matchSourcePropertyName = matchSourcePropertyName(tokens, i);
                    if (matchSourcePropertyName.match()) {
                        i += matchSourcePropertyName.maxMatchTokens();
                        hashSet.addAll(matchSourcePropertyName.matchSources());
                    } else {
                        if (!matchSourcePropertyType(tokens.token(i)) && !matchSourceClass(tokens.token(i))) {
                            return false;
                        }
                        i++;
                    }
                }
            }
            return hashSet.size() == this.sourceTokens.size();
        }
    }

    public String toString() {
        return "Standard";
    }
}
