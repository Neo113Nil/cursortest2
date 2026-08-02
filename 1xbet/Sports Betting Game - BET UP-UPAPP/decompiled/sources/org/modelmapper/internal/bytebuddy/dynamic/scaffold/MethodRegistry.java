package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.Transformer;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.attribute.MethodAttributeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.LatentMatcher;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public interface MethodRegistry {

    public interface Compiled extends TypeWriter.MethodPool {
        MethodList<?> getInstrumentedMethods();

        TypeDescription getInstrumentedType();

        LoadedTypeInitializer getLoadedTypeInitializer();

        MethodList<?> getMethods();

        TypeInitializer getTypeInitializer();
    }

    public interface Prepared {
        Compiled compile(Implementation.Target.Factory factory, ClassFileVersion classFileVersion);

        MethodList<?> getInstrumentedMethods();

        TypeDescription getInstrumentedType();

        LoadedTypeInitializer getLoadedTypeInitializer();

        MethodList<?> getMethods();

        TypeInitializer getTypeInitializer();
    }

    MethodRegistry append(LatentMatcher<? super MethodDescription> latentMatcher, Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer);

    Prepared prepare(InstrumentedType instrumentedType, MethodGraph.Compiler compiler, TypeValidation typeValidation, LatentMatcher<? super MethodDescription> latentMatcher);

    MethodRegistry prepend(LatentMatcher<? super MethodDescription> latentMatcher, Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer);

    public interface Handler extends InstrumentedType.Prepareable {

        public interface Compiled {
            TypeWriter.MethodPool.Record assemble(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility);
        }

        Compiled compile(Implementation.Target target);

        public enum ForAbstractMethod implements Handler, Compiled {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public Compiled compile(Implementation.Target target) {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
            public TypeWriter.MethodPool.Record assemble(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                return new TypeWriter.MethodPool.Record.ForDefinedMethod.WithoutBody(methodDescription, methodAttributeAppender, visibility);
            }
        }

        public enum ForVisibilityBridge implements Handler {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                throw new IllegalStateException("A visibility bridge handler must not apply any preparations");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public Compiled compile(Implementation.Target target) {
                return new Compiled(target.getInstrumentedType());
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Compiled implements Compiled {
                private final TypeDescription instrumentedType;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((Compiled) obj).instrumentedType);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
                }

                protected Compiled(TypeDescription typeDescription) {
                    this.instrumentedType = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
                public TypeWriter.MethodPool.Record assemble(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                    return TypeWriter.MethodPool.Record.ForDefinedMethod.OfVisibilityBridge.of(this.instrumentedType, methodDescription, methodAttributeAppender);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForImplementation implements Handler {
            private final Implementation implementation;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.implementation.equals(((ForImplementation) obj).implementation);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementation.hashCode();
            }

            public ForImplementation(Implementation implementation) {
                this.implementation = implementation;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return this.implementation.prepare(instrumentedType);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public Compiled compile(Implementation.Target target) {
                return new Compiled(this.implementation.appender(target));
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Compiled implements Compiled {
                private final ByteCodeAppender byteCodeAppender;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.byteCodeAppender.equals(((Compiled) obj).byteCodeAppender);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.byteCodeAppender.hashCode();
                }

                protected Compiled(ByteCodeAppender byteCodeAppender) {
                    this.byteCodeAppender = byteCodeAppender;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
                public TypeWriter.MethodPool.Record assemble(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                    return new TypeWriter.MethodPool.Record.ForDefinedMethod.WithBody(methodDescription, this.byteCodeAppender, methodAttributeAppender, visibility);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForAnnotationValue implements Handler, Compiled {
            private final AnnotationValue<?, ?> annotationValue;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler
            public Compiled compile(Implementation.Target target) {
                return this;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.annotationValue.equals(((ForAnnotationValue) obj).annotationValue);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationValue.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            public ForAnnotationValue(AnnotationValue<?, ?> annotationValue) {
                this.annotationValue = annotationValue;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.Compiled
            public TypeWriter.MethodPool.Record assemble(MethodDescription methodDescription, MethodAttributeAppender methodAttributeAppender, Visibility visibility) {
                return new TypeWriter.MethodPool.Record.ForDefinedMethod.WithAnnotationDefaultValue(methodDescription, this.annotationValue, methodAttributeAppender);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements MethodRegistry {
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
            this.entries = Collections.emptyList();
        }

        private Default(List<Entry> list) {
            this.entries = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry
        public MethodRegistry prepend(LatentMatcher<? super MethodDescription> latentMatcher, Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
            return new Default(CompoundList.of(new Entry(latentMatcher, handler, factory, transformer), this.entries));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry
        public MethodRegistry append(LatentMatcher<? super MethodDescription> latentMatcher, Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
            return new Default(CompoundList.of(this.entries, new Entry(latentMatcher, handler, factory, transformer)));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry
        public Prepared prepare(InstrumentedType instrumentedType, MethodGraph.Compiler compiler, TypeValidation typeValidation, LatentMatcher<? super MethodDescription> latentMatcher) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            MethodList<MethodDescription.InDefinedShape> declaredMethods = instrumentedType.getDeclaredMethods();
            for (Entry entry : this.entries) {
                if (hashSet.add(entry.getHandler())) {
                    instrumentedType = entry.getHandler().prepare(instrumentedType);
                    ElementMatcher.Junction noneOf = ElementMatchers.noneOf(declaredMethods);
                    MethodList<MethodDescription.InDefinedShape> declaredMethods2 = instrumentedType.getDeclaredMethods();
                    for (MethodDescription methodDescription : declaredMethods2.filter(noneOf)) {
                        linkedHashMap.put(methodDescription, entry.asSupplementaryEntry(methodDescription));
                    }
                    declaredMethods = declaredMethods2;
                }
            }
            MethodGraph.Linked compile = compiler.compile(instrumentedType);
            ElementMatcher.Junction and = ElementMatchers.not(ElementMatchers.anyOf(linkedHashMap.keySet())).and(ElementMatchers.returns(ElementMatchers.isVisibleTo(instrumentedType))).and(ElementMatchers.hasParameters(ElementMatchers.whereNone(ElementMatchers.hasType(ElementMatchers.not(ElementMatchers.isVisibleTo(instrumentedType)))))).and(latentMatcher.resolve(instrumentedType));
            ArrayList arrayList = new ArrayList();
            Iterator it = compile.listNodes().iterator();
            while (it.hasNext()) {
                MethodGraph.Node node = (MethodGraph.Node) it.next();
                MethodDescription representative = node.getRepresentative();
                boolean z = false;
                boolean z2 = instrumentedType.isPublic() && !instrumentedType.isInterface();
                if (and.matches(representative)) {
                    for (Entry entry2 : this.entries) {
                        if (entry2.resolve(instrumentedType).matches(representative)) {
                            linkedHashMap.put(representative, entry2.asPreparedEntry(instrumentedType, representative, node.getMethodTypes(), node.getVisibility()));
                            break;
                        }
                    }
                }
                z = z2;
                if (z && !node.getSort().isMadeVisible() && representative.isPublic() && !representative.isAbstract() && !representative.isFinal() && representative.getDeclaringType().isPackagePrivate()) {
                    linkedHashMap.put(representative, Prepared.Entry.forVisibilityBridge(representative, node.getVisibility()));
                }
                arrayList.add(representative);
            }
            for (MethodDescription methodDescription2 : CompoundList.of(instrumentedType.getDeclaredMethods().filter(ElementMatchers.not(ElementMatchers.isVirtual()).and(and)), new MethodDescription.Latent.TypeInitializer(instrumentedType))) {
                Iterator<Entry> it2 = this.entries.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Entry next = it2.next();
                        if (next.resolve(instrumentedType).matches(methodDescription2)) {
                            linkedHashMap.put(methodDescription2, next.asPreparedEntry(instrumentedType, methodDescription2, methodDescription2.getVisibility()));
                            break;
                        }
                    }
                }
                arrayList.add(methodDescription2);
            }
            LoadedTypeInitializer loadedTypeInitializer = instrumentedType.getLoadedTypeInitializer();
            TypeInitializer typeInitializer = instrumentedType.getTypeInitializer();
            TypeDescription typeDescription = instrumentedType;
            if (typeValidation.isEnabled()) {
                typeDescription = instrumentedType.validated();
            }
            return new Prepared(linkedHashMap, loadedTypeInitializer, typeInitializer, typeDescription, compile, new MethodList.Explicit(arrayList));
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Entry implements LatentMatcher<MethodDescription> {
            private final MethodAttributeAppender.Factory attributeAppenderFactory;
            private final Handler handler;
            private final LatentMatcher<? super MethodDescription> matcher;
            private final Transformer<MethodDescription> transformer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return this.matcher.equals(entry.matcher) && this.handler.equals(entry.handler) && this.attributeAppenderFactory.equals(entry.attributeAppenderFactory) && this.transformer.equals(entry.transformer);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.handler.hashCode()) * 31) + this.attributeAppenderFactory.hashCode()) * 31) + this.transformer.hashCode();
            }

            protected Entry(LatentMatcher<? super MethodDescription> latentMatcher, Handler handler, MethodAttributeAppender.Factory factory, Transformer<MethodDescription> transformer) {
                this.matcher = latentMatcher;
                this.handler = handler;
                this.attributeAppenderFactory = factory;
                this.transformer = transformer;
            }

            protected Prepared.Entry asPreparedEntry(TypeDescription typeDescription, MethodDescription methodDescription, Visibility visibility) {
                return asPreparedEntry(typeDescription, methodDescription, Collections.emptySet(), visibility);
            }

            protected Prepared.Entry asPreparedEntry(TypeDescription typeDescription, MethodDescription methodDescription, Set<MethodDescription.TypeToken> set, Visibility visibility) {
                return new Prepared.Entry(this.handler, this.attributeAppenderFactory, this.transformer.transform(typeDescription, methodDescription), set, visibility, false);
            }

            protected Prepared.Entry asSupplementaryEntry(MethodDescription methodDescription) {
                return new Prepared.Entry(this.handler, MethodAttributeAppender.Explicit.of(methodDescription), methodDescription, Collections.emptySet(), methodDescription.getVisibility(), false);
            }

            protected Handler getHandler() {
                return this.handler;
            }

            @Override // org.modelmapper.internal.bytebuddy.matcher.LatentMatcher
            public ElementMatcher<? super MethodDescription> resolve(TypeDescription typeDescription) {
                return this.matcher.resolve(typeDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Prepared implements Prepared {
            private final LinkedHashMap<MethodDescription, Entry> implementations;
            private final TypeDescription instrumentedType;
            private final LoadedTypeInitializer loadedTypeInitializer;
            private final MethodGraph.Linked methodGraph;
            private final MethodList<?> methods;
            private final TypeInitializer typeInitializer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Prepared prepared = (Prepared) obj;
                return this.implementations.equals(prepared.implementations) && this.loadedTypeInitializer.equals(prepared.loadedTypeInitializer) && this.typeInitializer.equals(prepared.typeInitializer) && this.instrumentedType.equals(prepared.instrumentedType) && this.methodGraph.equals(prepared.methodGraph) && this.methods.equals(prepared.methods);
            }

            public int hashCode() {
                return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementations.hashCode()) * 31) + this.loadedTypeInitializer.hashCode()) * 31) + this.typeInitializer.hashCode()) * 31) + this.instrumentedType.hashCode()) * 31) + this.methodGraph.hashCode()) * 31) + this.methods.hashCode();
            }

            protected Prepared(LinkedHashMap<MethodDescription, Entry> linkedHashMap, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, TypeDescription typeDescription, MethodGraph.Linked linked, MethodList<?> methodList) {
                this.implementations = linkedHashMap;
                this.loadedTypeInitializer = loadedTypeInitializer;
                this.typeInitializer = typeInitializer;
                this.instrumentedType = typeDescription;
                this.methodGraph = linked;
                this.methods = methodList;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public TypeDescription getInstrumentedType() {
                return this.instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public LoadedTypeInitializer getLoadedTypeInitializer() {
                return this.loadedTypeInitializer;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public TypeInitializer getTypeInitializer() {
                return this.typeInitializer;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public MethodList<?> getMethods() {
                return this.methods;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public MethodList<?> getInstrumentedMethods() {
                return (MethodList) new MethodList.Explicit(new ArrayList(this.implementations.keySet())).filter(ElementMatchers.not(ElementMatchers.isTypeInitializer()));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared
            public Compiled compile(Implementation.Target.Factory factory, ClassFileVersion classFileVersion) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Implementation.Target make = factory.make(this.instrumentedType, this.methodGraph, classFileVersion);
                for (Map.Entry<MethodDescription, Entry> entry : this.implementations.entrySet()) {
                    Handler.Compiled compiled = (Handler.Compiled) hashMap.get(entry.getValue().getHandler());
                    if (compiled == null) {
                        compiled = entry.getValue().getHandler().compile(make);
                        hashMap.put(entry.getValue().getHandler(), compiled);
                    }
                    Handler.Compiled compiled2 = compiled;
                    MethodAttributeAppender methodAttributeAppender = (MethodAttributeAppender) hashMap2.get(entry.getValue().getAppenderFactory());
                    if (methodAttributeAppender == null) {
                        methodAttributeAppender = entry.getValue().getAppenderFactory().make(this.instrumentedType);
                        hashMap2.put(entry.getValue().getAppenderFactory(), methodAttributeAppender);
                    }
                    linkedHashMap.put(entry.getKey(), new Compiled.Entry(compiled2, methodAttributeAppender, entry.getValue().getMethodDescription(), entry.getValue().resolveBridgeTypes(), entry.getValue().getVisibility(), entry.getValue().isBridgeMethod()));
                }
                return new Compiled(this.instrumentedType, this.loadedTypeInitializer, this.typeInitializer, this.methods, linkedHashMap, classFileVersion.isAtLeast(ClassFileVersion.JAVA_V5));
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Entry {
                private final MethodAttributeAppender.Factory attributeAppenderFactory;
                private final boolean bridgeMethod;
                private final Handler handler;
                private final MethodDescription methodDescription;
                private final Set<MethodDescription.TypeToken> typeTokens;
                private Visibility visibility;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Entry entry = (Entry) obj;
                    return this.handler.equals(entry.handler) && this.attributeAppenderFactory.equals(entry.attributeAppenderFactory) && this.methodDescription.equals(entry.methodDescription) && this.typeTokens.equals(entry.typeTokens) && this.visibility.equals(entry.visibility) && this.bridgeMethod == entry.bridgeMethod;
                }

                public int hashCode() {
                    return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.handler.hashCode()) * 31) + this.attributeAppenderFactory.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + this.typeTokens.hashCode()) * 31) + this.visibility.hashCode()) * 31) + (this.bridgeMethod ? 1 : 0);
                }

                protected Entry(Handler handler, MethodAttributeAppender.Factory factory, MethodDescription methodDescription, Set<MethodDescription.TypeToken> set, Visibility visibility, boolean z) {
                    this.handler = handler;
                    this.attributeAppenderFactory = factory;
                    this.methodDescription = methodDescription;
                    this.typeTokens = set;
                    this.visibility = visibility;
                    this.bridgeMethod = z;
                }

                protected static Entry forVisibilityBridge(MethodDescription methodDescription, Visibility visibility) {
                    return new Entry(Handler.ForVisibilityBridge.INSTANCE, MethodAttributeAppender.Explicit.of(methodDescription), methodDescription, Collections.emptySet(), visibility, true);
                }

                protected Handler getHandler() {
                    return this.handler;
                }

                protected MethodAttributeAppender.Factory getAppenderFactory() {
                    return this.attributeAppenderFactory;
                }

                protected MethodDescription getMethodDescription() {
                    return this.methodDescription;
                }

                protected Set<MethodDescription.TypeToken> resolveBridgeTypes() {
                    HashSet hashSet = new HashSet(this.typeTokens);
                    hashSet.remove(this.methodDescription.asTypeToken());
                    return hashSet;
                }

                protected Visibility getVisibility() {
                    return this.visibility;
                }

                protected boolean isBridgeMethod() {
                    return this.bridgeMethod;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        protected static class Compiled implements Compiled {
            private final LinkedHashMap<MethodDescription, Entry> implementations;
            private final TypeDescription instrumentedType;
            private final LoadedTypeInitializer loadedTypeInitializer;
            private final MethodList<?> methods;
            private final boolean supportsBridges;
            private final TypeInitializer typeInitializer;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Compiled compiled = (Compiled) obj;
                return this.instrumentedType.equals(compiled.instrumentedType) && this.loadedTypeInitializer.equals(compiled.loadedTypeInitializer) && this.typeInitializer.equals(compiled.typeInitializer) && this.methods.equals(compiled.methods) && this.implementations.equals(compiled.implementations) && this.supportsBridges == compiled.supportsBridges;
            }

            public int hashCode() {
                return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.loadedTypeInitializer.hashCode()) * 31) + this.typeInitializer.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.implementations.hashCode()) * 31) + (this.supportsBridges ? 1 : 0);
            }

            protected Compiled(TypeDescription typeDescription, LoadedTypeInitializer loadedTypeInitializer, TypeInitializer typeInitializer, MethodList<?> methodList, LinkedHashMap<MethodDescription, Entry> linkedHashMap, boolean z) {
                this.instrumentedType = typeDescription;
                this.loadedTypeInitializer = loadedTypeInitializer;
                this.typeInitializer = typeInitializer;
                this.methods = methodList;
                this.implementations = linkedHashMap;
                this.supportsBridges = z;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public TypeDescription getInstrumentedType() {
                return this.instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public LoadedTypeInitializer getLoadedTypeInitializer() {
                return this.loadedTypeInitializer;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public TypeInitializer getTypeInitializer() {
                return this.typeInitializer;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public MethodList<?> getMethods() {
                return this.methods;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodRegistry.Compiled
            public MethodList<?> getInstrumentedMethods() {
                return (MethodList) new MethodList.Explicit(new ArrayList(this.implementations.keySet())).filter(ElementMatchers.not(ElementMatchers.isTypeInitializer()));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool
            public TypeWriter.MethodPool.Record target(MethodDescription methodDescription) {
                Entry entry = this.implementations.get(methodDescription);
                if (entry == null) {
                    return new TypeWriter.MethodPool.Record.ForNonImplementedMethod(methodDescription);
                }
                return entry.bind(this.instrumentedType, this.supportsBridges);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Entry {
                private final MethodAttributeAppender attributeAppender;
                private final boolean bridgeMethod;
                private final Set<MethodDescription.TypeToken> bridgeTypes;
                private final Handler.Compiled handler;
                private final MethodDescription methodDescription;
                private final Visibility visibility;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Entry entry = (Entry) obj;
                    return this.handler.equals(entry.handler) && this.attributeAppender.equals(entry.attributeAppender) && this.methodDescription.equals(entry.methodDescription) && this.bridgeTypes.equals(entry.bridgeTypes) && this.visibility.equals(entry.visibility) && this.bridgeMethod == entry.bridgeMethod;
                }

                public int hashCode() {
                    return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.handler.hashCode()) * 31) + this.attributeAppender.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + this.bridgeTypes.hashCode()) * 31) + this.visibility.hashCode()) * 31) + (this.bridgeMethod ? 1 : 0);
                }

                protected Entry(Handler.Compiled compiled, MethodAttributeAppender methodAttributeAppender, MethodDescription methodDescription, Set<MethodDescription.TypeToken> set, Visibility visibility, boolean z) {
                    this.handler = compiled;
                    this.attributeAppender = methodAttributeAppender;
                    this.methodDescription = methodDescription;
                    this.bridgeTypes = set;
                    this.visibility = visibility;
                    this.bridgeMethod = z;
                }

                protected TypeWriter.MethodPool.Record bind(TypeDescription typeDescription, boolean z) {
                    if (this.bridgeMethod && !z) {
                        return new TypeWriter.MethodPool.Record.ForNonImplementedMethod(this.methodDescription);
                    }
                    TypeWriter.MethodPool.Record assemble = this.handler.assemble(this.methodDescription, this.attributeAppender, this.visibility);
                    return z ? TypeWriter.MethodPool.Record.AccessBridgeWrapper.of(assemble, typeDescription, this.methodDescription, this.bridgeTypes, this.attributeAppender) : assemble;
                }
            }
        }
    }
}
