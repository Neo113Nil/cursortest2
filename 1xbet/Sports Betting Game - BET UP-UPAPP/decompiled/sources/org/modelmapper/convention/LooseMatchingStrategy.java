package org.modelmapper.convention;

import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.PropertyNameInfo;
import org.modelmapper.spi.Tokens;

/* loaded from: classes4.dex */
final class LooseMatchingStrategy implements MatchingStrategy {
    @Override // org.modelmapper.spi.MatchingStrategy
    public boolean isExact() {
        return false;
    }

    LooseMatchingStrategy() {
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
            if (!matchLastDestTokens()) {
                return false;
            }
            for (Tokens tokens : this.propertyNameInfo.getDestinationPropertyTokens()) {
                for (int i = 0; i < tokens.size(); i++) {
                    if (matchSourcePropertyName(tokens, i).match(this.sourceTokens.size() - 1)) {
                        return true;
                    }
                }
            }
            return false;
        }

        boolean matchLastDestTokens() {
            Tokens tokens = this.destTokens.get(this.destTokens.size() - 1);
            for (int i = 0; i < tokens.size(); i++) {
                if (matchSourcePropertyName(tokens, i).match() || matchSourcePropertyType(tokens.token(i)) || matchSourceClass(tokens.token(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    public String toString() {
        return "Loose";
    }
}
