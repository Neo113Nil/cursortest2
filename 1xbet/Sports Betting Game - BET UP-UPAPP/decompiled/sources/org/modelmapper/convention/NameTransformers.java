package org.modelmapper.convention;

import org.modelmapper.internal.util.Strings;
import org.modelmapper.spi.NameTransformer;
import org.modelmapper.spi.NameableType;

/* loaded from: classes4.dex */
public class NameTransformers {
    public static final NameTransformer JAVABEANS_ACCESSOR = new NameTransformer() { // from class: org.modelmapper.convention.NameTransformers.1
        @Override // org.modelmapper.spi.NameTransformer
        public String transform(String str, NameableType nameableType) {
            if (!NameableType.METHOD.equals(nameableType)) {
                return str;
            }
            if (!str.startsWith("get") || str.length() <= 3) {
                return (!str.startsWith("is") || str.length() <= 2) ? str : Strings.decapitalize(str.substring(2));
            }
            return Strings.decapitalize(str.substring(3));
        }

        public String toString() {
            return "Javabeans Accessor";
        }
    };
    public static final NameTransformer JAVABEANS_MUTATOR = new NameTransformer() { // from class: org.modelmapper.convention.NameTransformers.2
        @Override // org.modelmapper.spi.NameTransformer
        public String transform(String str, NameableType nameableType) {
            return (NameableType.METHOD.equals(nameableType) && str.startsWith("set") && str.length() > 3) ? Strings.decapitalize(str.substring(3)) : str;
        }

        public String toString() {
            return "Javabeans Mutator";
        }
    };

    public static NameTransformer builder() {
        return builder("");
    }

    public static NameTransformer builder(String str) {
        return new BuilderNameTransformer(str);
    }

    private static class BuilderNameTransformer implements NameTransformer {
        private String prefix;

        private BuilderNameTransformer(String str) {
            this.prefix = str;
        }

        @Override // org.modelmapper.spi.NameTransformer
        public String transform(String str, NameableType nameableType) {
            return (!this.prefix.isEmpty() && str.startsWith(this.prefix)) ? Strings.decapitalize(str.substring(this.prefix.length())) : str;
        }

        public String toString() {
            return "Builder(prefix=" + this.prefix + ")";
        }
    }
}
