package org.modelmapper.internal.bytebuddy.implementation.auxiliary;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.modifier.ModifierContributor;
import org.modelmapper.internal.bytebuddy.description.modifier.SyntheticState;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

/* loaded from: classes4.dex */
public interface AuxiliaryType {
    public static final ModifierContributor.ForType[] DEFAULT_TYPE_MODIFIER = {SyntheticState.SYNTHETIC};

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface SignatureRelevant {
    }

    DynamicType make(String str, ClassFileVersion classFileVersion, MethodAccessorFactory methodAccessorFactory);

    public interface NamingStrategy {
        String name(TypeDescription typeDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class SuffixingRandom implements NamingStrategy {

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final RandomString randomString = new RandomString();
            private final String suffix;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.suffix.equals(((SuffixingRandom) obj).suffix);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.suffix.hashCode();
            }

            public SuffixingRandom(String str) {
                this.suffix = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy
            public String name(TypeDescription typeDescription) {
                return typeDescription.getName() + "$" + this.suffix + "$" + this.randomString.nextString();
            }
        }
    }
}
