package org.modelmapper.internal.bytebuddy;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public interface NamingStrategy {
    String rebase(TypeDescription typeDescription);

    String redefine(TypeDescription typeDescription);

    String subclass(TypeDescription.Generic generic);

    public static abstract class AbstractBase implements NamingStrategy {
        protected abstract String name(TypeDescription typeDescription);

        @Override // org.modelmapper.internal.bytebuddy.NamingStrategy
        public String subclass(TypeDescription.Generic generic) {
            return name(generic.asErasure());
        }

        @Override // org.modelmapper.internal.bytebuddy.NamingStrategy
        public String redefine(TypeDescription typeDescription) {
            return typeDescription.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.NamingStrategy
        public String rebase(TypeDescription typeDescription) {
            return typeDescription.getName();
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class SuffixingRandom extends AbstractBase {
        public static final String BYTE_BUDDY_RENAME_PACKAGE = "org.modelmapper.internal.bytebuddy.renamed";
        private static final String JAVA_PACKAGE = "java.";
        public static final String NO_PREFIX = "";
        private final BaseNameResolver baseNameResolver;
        private final String javaLangPackagePrefix;

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final RandomString randomString;
        private final String suffix;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SuffixingRandom suffixingRandom = (SuffixingRandom) obj;
            return this.suffix.equals(suffixingRandom.suffix) && this.javaLangPackagePrefix.equals(suffixingRandom.javaLangPackagePrefix) && this.baseNameResolver.equals(suffixingRandom.baseNameResolver);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.suffix.hashCode()) * 31) + this.javaLangPackagePrefix.hashCode()) * 31) + this.baseNameResolver.hashCode();
        }

        public SuffixingRandom(String str) {
            this(str, BaseNameResolver.ForUnnamedType.INSTANCE);
        }

        public SuffixingRandom(String str, String str2) {
            this(str, BaseNameResolver.ForUnnamedType.INSTANCE, str2);
        }

        public SuffixingRandom(String str, BaseNameResolver baseNameResolver) {
            this(str, baseNameResolver, BYTE_BUDDY_RENAME_PACKAGE);
        }

        public SuffixingRandom(String str, BaseNameResolver baseNameResolver, String str2) {
            this.suffix = str;
            this.baseNameResolver = baseNameResolver;
            this.javaLangPackagePrefix = str2;
            this.randomString = new RandomString();
        }

        @Override // org.modelmapper.internal.bytebuddy.NamingStrategy.AbstractBase
        protected String name(TypeDescription typeDescription) {
            String resolve = this.baseNameResolver.resolve(typeDescription);
            if (resolve.startsWith(JAVA_PACKAGE) && !this.javaLangPackagePrefix.equals("")) {
                resolve = this.javaLangPackagePrefix + "." + resolve;
            }
            return resolve + "$" + this.suffix + "$" + this.randomString.nextString();
        }

        public interface BaseNameResolver {
            String resolve(TypeDescription typeDescription);

            public enum ForUnnamedType implements BaseNameResolver {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver
                public String resolve(TypeDescription typeDescription) {
                    return typeDescription.getName();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForGivenType implements BaseNameResolver {
                private final TypeDescription typeDescription;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForGivenType) obj).typeDescription);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                }

                public ForGivenType(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver
                public String resolve(TypeDescription typeDescription) {
                    return this.typeDescription.getName();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForFixedValue implements BaseNameResolver {
                private final String name;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.name.equals(((ForFixedValue) obj).name);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode();
                }

                public ForFixedValue(String str) {
                    this.name = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.NamingStrategy.SuffixingRandom.BaseNameResolver
                public String resolve(TypeDescription typeDescription) {
                    return this.name;
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class PrefixingRandom extends AbstractBase {
        private final String prefix;

        @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
        private final RandomString randomString = new RandomString();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.prefix.equals(((PrefixingRandom) obj).prefix);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefix.hashCode();
        }

        public PrefixingRandom(String str) {
            this.prefix = str;
        }

        @Override // org.modelmapper.internal.bytebuddy.NamingStrategy.AbstractBase
        protected String name(TypeDescription typeDescription) {
            return this.prefix + "." + typeDescription.getName() + "$" + this.randomString.nextString();
        }
    }
}
