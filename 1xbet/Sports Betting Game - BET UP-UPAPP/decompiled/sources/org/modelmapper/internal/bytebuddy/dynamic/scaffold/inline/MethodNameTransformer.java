package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public interface MethodNameTransformer {
    String transform(MethodDescription methodDescription);

    @HashCodeAndEqualsPlugin.Enhance
    public static class Suffixing implements MethodNameTransformer {
        private static final String DEFAULT_SUFFIX = "original$";
        private final String suffix;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.suffix.equals(((Suffixing) obj).suffix);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.suffix.hashCode();
        }

        public static MethodNameTransformer withRandomSuffix() {
            return new Suffixing(DEFAULT_SUFFIX + RandomString.make());
        }

        public Suffixing(String str) {
            this.suffix = str;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer
        public String transform(MethodDescription methodDescription) {
            return methodDescription.getInternalName() + "$" + this.suffix;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Prefixing implements MethodNameTransformer {
        private static final String DEFAULT_PREFIX = "original";
        private final String prefix;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.prefix.equals(((Prefixing) obj).prefix);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefix.hashCode();
        }

        public Prefixing() {
            this(DEFAULT_PREFIX);
        }

        public Prefixing(String str) {
            this.prefix = str;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer
        public String transform(MethodDescription methodDescription) {
            return this.prefix + methodDescription.getInternalName();
        }
    }
}
