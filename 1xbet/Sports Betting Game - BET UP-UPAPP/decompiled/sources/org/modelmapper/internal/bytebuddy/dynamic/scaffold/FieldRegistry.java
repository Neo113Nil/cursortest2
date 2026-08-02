package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.Transformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.implementation.attribute.FieldAttributeAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;

/* loaded from: classes4.dex */
public interface FieldRegistry {
    Compiled compile(TypeDescription typeDescription);

    FieldRegistry prepend(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, Object obj, Transformer<FieldDescription> transformer);

    public interface Compiled extends TypeWriter.FieldPool {

        public enum NoOp implements Compiled {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public TypeWriter.FieldPool.Record target(FieldDescription fieldDescription) {
                return new TypeWriter.FieldPool.Record.ForImplicitField(fieldDescription);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements FieldRegistry {
        private final List<Entry> entries;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.entries.equals(((Default) obj).entries);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entries.hashCode();
        }

        public Default() {
            this(Collections.emptyList());
        }

        private Default(List<Entry> list) {
            this.entries = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldRegistry
        public FieldRegistry prepend(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, Object obj, Transformer<FieldDescription> transformer) {
            ArrayList arrayList = new ArrayList(this.entries.size() + 1);
            arrayList.add(new Entry(latentMatcher, factory, obj, transformer));
            arrayList.addAll(this.entries);
            return new Default(arrayList);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldRegistry
        public Compiled compile(TypeDescription typeDescription) {
            ArrayList arrayList = new ArrayList(this.entries.size());
            HashMap hashMap = new HashMap();
            for (Entry entry : this.entries) {
                FieldAttributeAppender fieldAttributeAppender = (FieldAttributeAppender) hashMap.get(entry.getFieldAttributeAppenderFactory());
                if (fieldAttributeAppender == null) {
                    fieldAttributeAppender = entry.getFieldAttributeAppenderFactory().make(typeDescription);
                    hashMap.put(entry.getFieldAttributeAppenderFactory(), fieldAttributeAppender);
                }
                arrayList.add(new Compiled.Entry(entry.resolve(typeDescription), fieldAttributeAppender, entry.getDefaultValue(), entry.getTransformer()));
            }
            return new Compiled(typeDescription, arrayList);
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Entry implements LatentMatcher<FieldDescription> {
            private final Object defaultValue;
            private final FieldAttributeAppender.Factory fieldAttributeAppenderFactory;
            private final LatentMatcher<? super FieldDescription> matcher;
            private final Transformer<FieldDescription> transformer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return this.matcher.equals(entry.matcher) && this.fieldAttributeAppenderFactory.equals(entry.fieldAttributeAppenderFactory) && this.defaultValue.equals(entry.defaultValue) && this.transformer.equals(entry.transformer);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.fieldAttributeAppenderFactory.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.transformer.hashCode();
            }

            protected Entry(LatentMatcher<? super FieldDescription> latentMatcher, FieldAttributeAppender.Factory factory, Object obj, Transformer<FieldDescription> transformer) {
                this.matcher = latentMatcher;
                this.fieldAttributeAppenderFactory = factory;
                this.defaultValue = obj;
                this.transformer = transformer;
            }

            protected FieldAttributeAppender.Factory getFieldAttributeAppenderFactory() {
                return this.fieldAttributeAppenderFactory;
            }

            protected Object getDefaultValue() {
                return this.defaultValue;
            }

            protected Transformer<FieldDescription> getTransformer() {
                return this.transformer;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
            public ElementMatcher<? super FieldDescription> resolve(TypeDescription typeDescription) {
                return this.matcher.resolve(typeDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Compiled implements Compiled {
            private final List<Entry> entries;
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Compiled compiled = (Compiled) obj;
                return this.instrumentedType.equals(compiled.instrumentedType) && this.entries.equals(compiled.entries);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.entries.hashCode();
            }

            protected Compiled(TypeDescription typeDescription, List<Entry> list) {
                this.instrumentedType = typeDescription;
                this.entries = list;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.FieldPool
            public TypeWriter.FieldPool.Record target(FieldDescription fieldDescription) {
                for (Entry entry : this.entries) {
                    if (entry.matches(fieldDescription)) {
                        return entry.bind(this.instrumentedType, fieldDescription);
                    }
                }
                return new TypeWriter.FieldPool.Record.ForImplicitField(fieldDescription);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Entry implements ElementMatcher<FieldDescription> {
                private final Object defaultValue;
                private final FieldAttributeAppender fieldAttributeAppender;
                private final ElementMatcher<? super FieldDescription> matcher;
                private final Transformer<FieldDescription> transformer;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Entry entry = (Entry) obj;
                    return this.matcher.equals(entry.matcher) && this.fieldAttributeAppender.equals(entry.fieldAttributeAppender) && this.defaultValue.equals(entry.defaultValue) && this.transformer.equals(entry.transformer);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.fieldAttributeAppender.hashCode()) * 31) + this.defaultValue.hashCode()) * 31) + this.transformer.hashCode();
                }

                protected Entry(ElementMatcher<? super FieldDescription> elementMatcher, FieldAttributeAppender fieldAttributeAppender, Object obj, Transformer<FieldDescription> transformer) {
                    this.matcher = elementMatcher;
                    this.fieldAttributeAppender = fieldAttributeAppender;
                    this.defaultValue = obj;
                    this.transformer = transformer;
                }

                protected TypeWriter.FieldPool.Record bind(TypeDescription typeDescription, FieldDescription fieldDescription) {
                    return new TypeWriter.FieldPool.Record.ForExplicitField(this.fieldAttributeAppender, this.defaultValue, this.transformer.transform(typeDescription, fieldDescription));
                }

                @Override // org.modelmapper.internal.bytebuddy.matcher.ElementMatcher
                public boolean matches(FieldDescription fieldDescription) {
                    return this.matcher.matches(fieldDescription);
                }
            }
        }
    }
}
