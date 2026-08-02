package org.modelmapper.convention;

import java.util.List;
import org.modelmapper.spi.MatchingStrategy;
import org.modelmapper.spi.PropertyNameInfo;
import org.modelmapper.spi.Tokens;

/* loaded from: classes4.dex */
final class StrictMatchingStrategy implements MatchingStrategy {
    @Override // org.modelmapper.spi.MatchingStrategy
    public boolean isExact() {
        return true;
    }

    StrictMatchingStrategy() {
    }

    @Override // org.modelmapper.spi.MatchingStrategy
    public boolean matches(PropertyNameInfo propertyNameInfo) {
        List<Tokens> sourcePropertyTokens = propertyNameInfo.getSourcePropertyTokens();
        List<Tokens> destinationPropertyTokens = propertyNameInfo.getDestinationPropertyTokens();
        if (sourcePropertyTokens.size() != destinationPropertyTokens.size()) {
            return false;
        }
        for (int i = 0; i < destinationPropertyTokens.size(); i++) {
            Tokens tokens = sourcePropertyTokens.get(i);
            Tokens tokens2 = destinationPropertyTokens.get(i);
            if (tokens.size() != tokens2.size()) {
                return false;
            }
            for (int i2 = 0; i2 < tokens.size(); i2++) {
                if (!tokens.token(i2).equalsIgnoreCase(tokens2.token(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        return "Strict";
    }
}
