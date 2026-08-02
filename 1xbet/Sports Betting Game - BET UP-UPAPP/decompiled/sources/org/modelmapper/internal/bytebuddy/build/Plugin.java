package org.modelmapper.internal.bytebuddy.build;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.ClassFileLocator;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;

/* loaded from: classes4.dex */
public interface Plugin extends ElementMatcher<TypeDescription> {
    DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator);

    @HashCodeAndEqualsPlugin.Enhance
    public static class NoOp implements Plugin {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass();
        }

        public int hashCode() {
            return 17;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(TypeDescription typeDescription) {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.build.Plugin
        public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
            throw new IllegalStateException("Cannot apply non-operational plugin");
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static abstract class ForElementMatcher implements Plugin {
        private final ElementMatcher<? super TypeDescription> matcher;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.matcher.equals(((ForElementMatcher) obj).matcher);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode();
        }

        protected ForElementMatcher(ElementMatcher<? super TypeDescription> elementMatcher) {
            this.matcher = elementMatcher;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(TypeDescription typeDescription) {
            return this.matcher.matches(typeDescription);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements Plugin {
        private final List<Plugin> plugins;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.plugins.equals(((Compound) obj).plugins);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.plugins.hashCode();
        }

        public Compound(Plugin... pluginArr) {
            this((List<? extends Plugin>) Arrays.asList(pluginArr));
        }

        public Compound(List<? extends Plugin> list) {
            this.plugins = new ArrayList();
            for (Plugin plugin : list) {
                if (plugin instanceof Compound) {
                    this.plugins.addAll(((Compound) plugin).plugins);
                } else if (!(plugin instanceof NoOp)) {
                    this.plugins.add(plugin);
                }
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.build.Plugin
        public DynamicType.Builder<?> apply(DynamicType.Builder<?> builder, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
            for (Plugin plugin : this.plugins) {
                if (plugin.matches(typeDescription)) {
                    builder = plugin.apply(builder, typeDescription, classFileLocator);
                }
            }
            return builder;
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
        public boolean matches(TypeDescription typeDescription) {
            Iterator<Plugin> it = this.plugins.iterator();
            while (it.hasNext()) {
                if (it.next().matches(typeDescription)) {
                    return true;
                }
            }
            return false;
        }
    }
}
