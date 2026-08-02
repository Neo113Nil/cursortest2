package org.modelmapper.convention;

import java.util.regex.Pattern;
import org.modelmapper.spi.NameTokenizer;
import org.modelmapper.spi.NameableType;

/* loaded from: classes4.dex */
public class NameTokenizers {
    public static final NameTokenizer CAMEL_CASE;
    public static final NameTokenizer UNDERSCORE;

    static {
        CAMEL_CASE = new CamelCaseNameTokenizer();
        UNDERSCORE = new UnderscoreNameTokenizer();
    }

    private static class CamelCaseNameTokenizer implements NameTokenizer {
        private static final Pattern camelCase = Pattern.compile("(?<=[A-Z])(?=[A-Z][a-z])|(?<=[^A-Z])(?=[A-Z])|(?<=[A-Za-z])(?=[^A-Za-z])");

        private CamelCaseNameTokenizer() {
        }

        @Override // org.modelmapper.spi.NameTokenizer
        public String[] tokenize(String str, NameableType nameableType) {
            return camelCase.split(str);
        }

        public String toString() {
            return "Camel Case";
        }
    }

    private static class UnderscoreNameTokenizer implements NameTokenizer {
        private static final Pattern underscore = Pattern.compile("_");

        private UnderscoreNameTokenizer() {
        }

        @Override // org.modelmapper.spi.NameTokenizer
        public String[] tokenize(String str, NameableType nameableType) {
            return underscore.split(str);
        }

        public String toString() {
            return "Underscore";
        }
    }
}
