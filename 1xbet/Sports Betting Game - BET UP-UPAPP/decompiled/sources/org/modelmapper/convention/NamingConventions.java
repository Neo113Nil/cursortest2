package org.modelmapper.convention;

import org.modelmapper.spi.NamingConvention;
import org.modelmapper.spi.PropertyType;

/* loaded from: classes4.dex */
public class NamingConventions {
    public static final NamingConvention JAVABEANS_ACCESSOR = new NamingConvention() { // from class: org.modelmapper.convention.NamingConventions.1
        @Override // org.modelmapper.spi.NamingConvention
        public boolean applies(String str, PropertyType propertyType) {
            return PropertyType.FIELD.equals(propertyType) || (str.startsWith("get") && str.length() > 3) || (str.startsWith("is") && str.length() > 2);
        }

        public String toString() {
            return "Javabeans Accessor";
        }
    };
    public static final NamingConvention JAVABEANS_MUTATOR = new NamingConvention() { // from class: org.modelmapper.convention.NamingConventions.2
        @Override // org.modelmapper.spi.NamingConvention
        public boolean applies(String str, PropertyType propertyType) {
            return PropertyType.FIELD.equals(propertyType) || (str.startsWith("set") && str.length() > 3);
        }

        public String toString() {
            return "Javabeans Mutator";
        }
    };
    public static final NamingConvention NONE = new NamingConvention() { // from class: org.modelmapper.convention.NamingConventions.3
        @Override // org.modelmapper.spi.NamingConvention
        public boolean applies(String str, PropertyType propertyType) {
            return true;
        }

        public String toString() {
            return "None";
        }
    };

    public static NamingConvention builder() {
        return builder("");
    }

    public static NamingConvention builder(String str) {
        return new BuilderNamingConventions(str);
    }

    private static class BuilderNamingConventions implements NamingConvention {
        private String prefix;

        private BuilderNamingConventions(String str) {
            this.prefix = str;
        }

        @Override // org.modelmapper.spi.NamingConvention
        public boolean applies(String str, PropertyType propertyType) {
            return PropertyType.METHOD.equals(propertyType) && str.startsWith(this.prefix);
        }

        public String toString() {
            return "Builder(prefix=" + this.prefix + ")";
        }
    }
}
