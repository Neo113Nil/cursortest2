package org.modelmapper.internal.bytebuddy.dynamic.scaffold;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.modifier.Visibility;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.matcher.FilterableList;

/* loaded from: classes4.dex */
public interface MethodGraph {
    NodeList listNodes();

    Node locate(MethodDescription.SignatureToken signatureToken);

    public enum Empty implements Linked, Compiler {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public Linked compile(TypeDefinition typeDefinition, TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
        public Linked compile(TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Linked
        public MethodGraph getInterfaceGraph(TypeDescription typeDescription) {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Linked
        public MethodGraph getSuperClassGraph() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
        public Node locate(MethodDescription.SignatureToken signatureToken) {
            return Node.Unresolved.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
        public NodeList listNodes() {
            return new NodeList(Collections.emptyList());
        }
    }

    public interface Linked extends MethodGraph {
        MethodGraph getInterfaceGraph(TypeDescription typeDescription);

        MethodGraph getSuperClassGraph();

        @HashCodeAndEqualsPlugin.Enhance
        public static class Delegation implements Linked {
            private final Map<TypeDescription, MethodGraph> interfaceGraphs;
            private final MethodGraph methodGraph;
            private final MethodGraph superClassGraph;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Delegation delegation = (Delegation) obj;
                return this.methodGraph.equals(delegation.methodGraph) && this.superClassGraph.equals(delegation.superClassGraph) && this.interfaceGraphs.equals(delegation.interfaceGraphs);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodGraph.hashCode()) * 31) + this.superClassGraph.hashCode()) * 31) + this.interfaceGraphs.hashCode();
            }

            public Delegation(MethodGraph methodGraph, MethodGraph methodGraph2, Map<TypeDescription, MethodGraph> map) {
                this.methodGraph = methodGraph;
                this.superClassGraph = methodGraph2;
                this.interfaceGraphs = map;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Linked
            public MethodGraph getSuperClassGraph() {
                return this.superClassGraph;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Linked
            public MethodGraph getInterfaceGraph(TypeDescription typeDescription) {
                MethodGraph methodGraph = this.interfaceGraphs.get(typeDescription);
                return methodGraph == null ? Empty.INSTANCE : methodGraph;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
            public Node locate(MethodDescription.SignatureToken signatureToken) {
                return this.methodGraph.locate(signatureToken);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
            public NodeList listNodes() {
                return this.methodGraph.listNodes();
            }
        }
    }

    public interface Node {
        Set<MethodDescription.TypeToken> getMethodTypes();

        MethodDescription getRepresentative();

        Sort getSort();

        Visibility getVisibility();

        public enum Sort {
            VISIBLE(true, true, true),
            RESOLVED(true, true, false),
            AMBIGUOUS(true, false, false),
            UNRESOLVED(false, false, false);

            private final boolean madeVisible;
            private final boolean resolved;
            private final boolean unique;

            Sort(boolean z, boolean z2, boolean z3) {
                this.resolved = z;
                this.unique = z2;
                this.madeVisible = z3;
            }

            public boolean isResolved() {
                return this.resolved;
            }

            public boolean isUnique() {
                return this.unique;
            }

            public boolean isMadeVisible() {
                return this.madeVisible;
            }
        }

        public enum Unresolved implements Node {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Sort getSort() {
                return Sort.UNRESOLVED;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public MethodDescription getRepresentative() {
                throw new IllegalStateException("Cannot resolve the method of an illegal node");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Set<MethodDescription.TypeToken> getMethodTypes() {
                throw new IllegalStateException("Cannot resolve bridge method of an illegal node");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Visibility getVisibility() {
                throw new IllegalStateException("Cannot resolve visibility of an illegal node");
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Simple implements Node {
            private final MethodDescription methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((Simple) obj).methodDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
            }

            public Simple(MethodDescription methodDescription) {
                this.methodDescription = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Sort getSort() {
                return Sort.RESOLVED;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public MethodDescription getRepresentative() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Set<MethodDescription.TypeToken> getMethodTypes() {
                return Collections.emptySet();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
            public Visibility getVisibility() {
                return this.methodDescription.getVisibility();
            }
        }
    }

    public interface Compiler {
        public static final Compiler DEFAULT = Default.forJavaHierarchy();

        Linked compile(TypeDefinition typeDefinition, TypeDescription typeDescription);

        Linked compile(TypeDescription typeDescription);

        public enum ForDeclaredMethods implements Compiler {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public Linked compile(TypeDescription typeDescription) {
                return compile(typeDescription, typeDescription);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public Linked compile(TypeDefinition typeDefinition, TypeDescription typeDescription) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (MethodDescription methodDescription : typeDefinition.getDeclaredMethods().filter(ElementMatchers.isVirtual().and(ElementMatchers.not(ElementMatchers.isBridge())).and(ElementMatchers.isVisibleTo(typeDescription)))) {
                    linkedHashMap.put(methodDescription.asSignatureToken(), new Node.Simple(methodDescription));
                }
                return new Linked.Delegation(new Simple(linkedHashMap), Empty.INSTANCE, Collections.emptyMap());
            }
        }

        public static abstract class AbstractBase implements Compiler {
            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public Linked compile(TypeDescription typeDescription) {
                return compile(typeDescription, typeDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class Default<T> extends AbstractBase {
            private final Harmonizer<T> harmonizer;
            private final Merger merger;
            private final TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Default r5 = (Default) obj;
                return this.harmonizer.equals(r5.harmonizer) && this.merger.equals(r5.merger) && this.visitor.equals(r5.visitor);
            }

            public int hashCode() {
                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.harmonizer.hashCode()) * 31) + this.merger.hashCode()) * 31) + this.visitor.hashCode();
            }

            protected Default(Harmonizer<T> harmonizer, Merger merger, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                this.harmonizer = harmonizer;
                this.merger = merger;
                this.visitor = visitor;
            }

            public static <S> Compiler of(Harmonizer<S> harmonizer, Merger merger) {
                return new Default(harmonizer, merger, TypeDescription.Generic.Visitor.Reifying.INITIATING);
            }

            public static <S> Compiler of(Harmonizer<S> harmonizer, Merger merger, TypeDescription.Generic.Visitor<? extends TypeDescription.Generic> visitor) {
                return new Default(harmonizer, merger, visitor);
            }

            public static Compiler forJavaHierarchy() {
                return of(Harmonizer.ForJavaMethod.INSTANCE, Merger.Directional.LEFT);
            }

            public static Compiler forJVMHierarchy() {
                return of(Harmonizer.ForJVMMethod.INSTANCE, Merger.Directional.LEFT);
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler
            public Linked compile(TypeDefinition typeDefinition, TypeDescription typeDescription) {
                Map<TypeDefinition, Key.Store<T>> hashMap = new HashMap<>();
                Key.Store<T> doAnalyze = doAnalyze(typeDefinition, hashMap, ElementMatchers.isVirtual().and(ElementMatchers.isVisibleTo(typeDescription)));
                TypeDescription.Generic superClass = typeDefinition.getSuperClass();
                TypeList.Generic interfaces = typeDefinition.getInterfaces();
                HashMap hashMap2 = new HashMap();
                for (TypeDescription.Generic generic : interfaces) {
                    hashMap2.put(generic.asErasure(), hashMap.get(generic).asGraph(this.merger));
                }
                return new Linked.Delegation(doAnalyze.asGraph(this.merger), superClass == null ? Empty.INSTANCE : hashMap.get(superClass).asGraph(this.merger), hashMap2);
            }

            protected Key.Store<T> analyze(TypeDefinition typeDefinition, TypeDefinition typeDefinition2, Map<TypeDefinition, Key.Store<T>> map, ElementMatcher<? super MethodDescription> elementMatcher) {
                Key.Store<T> store = map.get(typeDefinition2);
                if (store != null) {
                    return store;
                }
                Key.Store<T> doAnalyze = doAnalyze(typeDefinition, map, elementMatcher);
                map.put(typeDefinition2, doAnalyze);
                return doAnalyze;
            }

            protected Key.Store<T> analyzeNullable(TypeDescription.Generic generic, Map<TypeDefinition, Key.Store<T>> map, ElementMatcher<? super MethodDescription> elementMatcher) {
                if (generic == null) {
                    return new Key.Store<>();
                }
                return analyze((TypeDefinition) generic.accept(this.visitor), generic, map, elementMatcher);
            }

            /* JADX WARN: Multi-variable type inference failed */
            protected Key.Store<T> doAnalyze(TypeDefinition typeDefinition, Map<TypeDefinition, Key.Store<T>> map, ElementMatcher<? super MethodDescription> elementMatcher) {
                Key.Store<T> analyzeNullable = analyzeNullable(typeDefinition.getSuperClass(), map, elementMatcher);
                Key.Store<T> store = new Key.Store<>();
                for (TypeDescription.Generic generic : typeDefinition.getInterfaces()) {
                    store = store.combineWith(analyze((TypeDefinition) generic.accept(this.visitor), generic, map, elementMatcher));
                }
                return analyzeNullable.inject(store).registerTopLevel(typeDefinition.getDeclaredMethods().filter(elementMatcher), this.harmonizer);
            }

            public interface Harmonizer<S> {
                S harmonize(MethodDescription.TypeToken typeToken);

                public enum ForJavaMethod implements Harmonizer<Token> {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    public Token harmonize(MethodDescription.TypeToken typeToken) {
                        return new Token(typeToken);
                    }

                    protected static class Token {
                        private final int hashCode;
                        private final MethodDescription.TypeToken typeToken;

                        protected Token(MethodDescription.TypeToken typeToken) {
                            this.typeToken = typeToken;
                            this.hashCode = typeToken.getParameterTypes().hashCode();
                        }

                        public boolean equals(Object obj) {
                            return this == obj || ((obj instanceof Token) && this.typeToken.getParameterTypes().equals(((Token) obj).typeToken.getParameterTypes()));
                        }

                        public int hashCode() {
                            return this.hashCode;
                        }

                        public String toString() {
                            return this.typeToken.getParameterTypes().toString();
                        }
                    }
                }

                public enum ForJVMMethod implements Harmonizer<Token> {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Harmonizer
                    public Token harmonize(MethodDescription.TypeToken typeToken) {
                        return new Token(typeToken);
                    }

                    protected static class Token {
                        private final int hashCode;
                        private final MethodDescription.TypeToken typeToken;

                        public Token(MethodDescription.TypeToken typeToken) {
                            this.typeToken = typeToken;
                            this.hashCode = typeToken.getReturnType().hashCode() + (typeToken.getParameterTypes().hashCode() * 31);
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Token)) {
                                return false;
                            }
                            Token token = (Token) obj;
                            return this.typeToken.getReturnType().equals(token.typeToken.getReturnType()) && this.typeToken.getParameterTypes().equals(token.typeToken.getParameterTypes());
                        }

                        public int hashCode() {
                            return this.hashCode;
                        }

                        public String toString() {
                            return this.typeToken.toString();
                        }
                    }
                }
            }

            public interface Merger {
                MethodDescription merge(MethodDescription methodDescription, MethodDescription methodDescription2);

                public enum Directional implements Merger {
                    LEFT(true),
                    RIGHT(false);

                    private final boolean left;

                    Directional(boolean z) {
                        this.left = z;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Merger
                    public MethodDescription merge(MethodDescription methodDescription, MethodDescription methodDescription2) {
                        return this.left ? methodDescription : methodDescription2;
                    }
                }
            }

            protected static abstract class Key<S> {
                protected final String internalName;
                protected final int parameterCount;

                protected abstract Set<S> getIdentifiers();

                protected Key(String str, int i) {
                    this.internalName = str;
                    this.parameterCount = i;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Key)) {
                        return false;
                    }
                    Key key = (Key) obj;
                    return this.internalName.equals(key.internalName) && this.parameterCount == key.parameterCount && !Collections.disjoint(getIdentifiers(), key.getIdentifiers());
                }

                public int hashCode() {
                    return this.internalName.hashCode() + (this.parameterCount * 31);
                }

                protected static class Harmonized<V> extends Key<V> {
                    private final Map<V, Set<MethodDescription.TypeToken>> identifiers;

                    protected Harmonized(String str, int i, Map<V, Set<MethodDescription.TypeToken>> map) {
                        super(str, i);
                        this.identifiers = map;
                    }

                    protected static <Q> Harmonized<Q> of(MethodDescription methodDescription, Harmonizer<Q> harmonizer) {
                        return new Harmonized<>(methodDescription.getInternalName(), methodDescription.getParameters().size(), Collections.singletonMap(harmonizer.harmonize(methodDescription.asTypeToken()), Collections.emptySet()));
                    }

                    protected Detached detach(MethodDescription.TypeToken typeToken) {
                        HashSet hashSet = new HashSet();
                        Iterator<Set<MethodDescription.TypeToken>> it = this.identifiers.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll(it.next());
                        }
                        hashSet.add(typeToken);
                        return new Detached(this.internalName, this.parameterCount, hashSet);
                    }

                    protected Harmonized<V> combineWith(Harmonized<V> harmonized) {
                        HashMap hashMap = new HashMap(this.identifiers);
                        for (Map.Entry<V, Set<MethodDescription.TypeToken>> entry : harmonized.identifiers.entrySet()) {
                            Set set = (Set) hashMap.get(entry.getKey());
                            if (set == null) {
                                hashMap.put(entry.getKey(), entry.getValue());
                            } else {
                                HashSet hashSet = new HashSet(set);
                                hashSet.addAll(entry.getValue());
                                hashMap.put(entry.getKey(), hashSet);
                            }
                        }
                        return new Harmonized<>(this.internalName, this.parameterCount, hashMap);
                    }

                    protected Harmonized<V> extend(MethodDescription.InDefinedShape inDefinedShape, Harmonizer<V> harmonizer) {
                        HashMap hashMap = new HashMap(this.identifiers);
                        MethodDescription.TypeToken asTypeToken = inDefinedShape.asTypeToken();
                        V harmonize = harmonizer.harmonize(asTypeToken);
                        Set set = (Set) hashMap.get(harmonize);
                        if (set == null) {
                            hashMap.put(harmonize, Collections.singleton(asTypeToken));
                        } else {
                            HashSet hashSet = new HashSet(set);
                            hashSet.add(asTypeToken);
                            hashMap.put(harmonize, hashSet);
                        }
                        return new Harmonized<>(this.internalName, this.parameterCount, hashMap);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key
                    protected Set<V> getIdentifiers() {
                        return this.identifiers.keySet();
                    }
                }

                protected static class Detached extends Key<MethodDescription.TypeToken> {
                    private final Set<MethodDescription.TypeToken> identifiers;

                    protected Detached(String str, int i, Set<MethodDescription.TypeToken> set) {
                        super(str, i);
                        this.identifiers = set;
                    }

                    protected static Detached of(MethodDescription.SignatureToken signatureToken) {
                        return new Detached(signatureToken.getName(), signatureToken.getParameterTypes().size(), Collections.singleton(signatureToken.asTypeToken()));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key
                    protected Set<MethodDescription.TypeToken> getIdentifiers() {
                        return this.identifiers;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class Store<V> {
                    private final LinkedHashMap<Harmonized<V>, Entry<V>> entries;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.entries.equals(((Store) obj).entries);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entries.hashCode();
                    }

                    protected Store() {
                        this(new LinkedHashMap());
                    }

                    private Store(LinkedHashMap<Harmonized<V>, Entry<V>> linkedHashMap) {
                        this.entries = linkedHashMap;
                    }

                    private static <W> Entry<W> combine(Entry<W> entry, Entry<W> entry2) {
                        Set<MethodDescription> candidates = entry.getCandidates();
                        Set<MethodDescription> candidates2 = entry2.getCandidates();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.addAll(candidates);
                        linkedHashSet.addAll(candidates2);
                        for (MethodDescription methodDescription : candidates) {
                            TypeDescription asErasure = methodDescription.getDeclaringType().asErasure();
                            Iterator<MethodDescription> it = candidates2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    MethodDescription next = it.next();
                                    TypeDescription asErasure2 = next.getDeclaringType().asErasure();
                                    if (!asErasure.equals(asErasure2)) {
                                        if (asErasure.isAssignableTo(asErasure2)) {
                                            linkedHashSet.remove(next);
                                            break;
                                        }
                                        if (asErasure.isAssignableFrom(asErasure2)) {
                                            linkedHashSet.remove(methodDescription);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        Harmonized<W> combineWith = entry.getKey().combineWith(entry2.getKey());
                        Visibility expandTo = entry.getVisibility().expandTo(entry2.getVisibility());
                        return linkedHashSet.size() == 1 ? new Entry.Resolved(combineWith, (MethodDescription) linkedHashSet.iterator().next(), expandTo, false) : new Entry.Ambiguous(combineWith, linkedHashSet, expandTo);
                    }

                    protected Store<V> registerTopLevel(List<? extends MethodDescription> list, Harmonizer<V> harmonizer) {
                        if (list.isEmpty()) {
                            return this;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(this.entries);
                        for (MethodDescription methodDescription : list) {
                            Harmonized of = Harmonized.of(methodDescription, harmonizer);
                            Entry entry = (Entry) linkedHashMap.remove(of);
                            if (entry == null) {
                                entry = new Entry.Initial(of);
                            }
                            Entry extendBy = entry.extendBy(methodDescription, harmonizer);
                            linkedHashMap.put(extendBy.getKey(), extendBy);
                        }
                        return new Store<>(linkedHashMap);
                    }

                    protected Store<V> combineWith(Store<V> store) {
                        if (this.entries.isEmpty()) {
                            return store;
                        }
                        if (store.entries.isEmpty()) {
                            return this;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(this.entries);
                        for (Entry<V> entry : store.entries.values()) {
                            Entry entry2 = (Entry) linkedHashMap.remove(entry.getKey());
                            if (entry2 != null) {
                                entry = combine(entry2, entry);
                            }
                            linkedHashMap.put(entry.getKey(), entry);
                        }
                        return new Store<>(linkedHashMap);
                    }

                    protected Store<V> inject(Store<V> store) {
                        if (this.entries.isEmpty()) {
                            return store;
                        }
                        if (store.entries.isEmpty()) {
                            return this;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(this.entries);
                        for (Entry<V> entry : store.entries.values()) {
                            Entry entry2 = (Entry) linkedHashMap.remove(entry.getKey());
                            if (entry2 != null) {
                                entry = entry2.inject(entry.getKey(), entry.getVisibility());
                            }
                            linkedHashMap.put(entry.getKey(), entry);
                        }
                        return new Store<>(linkedHashMap);
                    }

                    protected MethodGraph asGraph(Merger merger) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Entry<V> entry : this.entries.values()) {
                            Node asNode = entry.asNode(merger);
                            linkedHashMap.put(entry.getKey().detach(asNode.getRepresentative().asTypeToken()), asNode);
                        }
                        return new Graph(linkedHashMap);
                    }

                    protected interface Entry<W> {
                        Node asNode(Merger merger);

                        Entry<W> extendBy(MethodDescription methodDescription, Harmonizer<W> harmonizer);

                        Set<MethodDescription> getCandidates();

                        Harmonized<W> getKey();

                        Visibility getVisibility();

                        Entry<W> inject(Harmonized<W> harmonized, Visibility visibility);

                        public static class Initial<U> implements Entry<U> {
                            private final Harmonized<U> key;

                            protected Initial(Harmonized<U> harmonized) {
                                this.key = harmonized;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Harmonized<U> getKey() {
                                throw new IllegalStateException("Cannot extract key from initial entry:" + this);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Set<MethodDescription> getCandidates() {
                                throw new IllegalStateException("Cannot extract method from initial entry:" + this);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Visibility getVisibility() {
                                throw new IllegalStateException("Cannot extract visibility from initial entry:" + this);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> extendBy(MethodDescription methodDescription, Harmonizer<U> harmonizer) {
                                return new Resolved(this.key.extend(methodDescription.asDefined(), harmonizer), methodDescription, methodDescription.getVisibility(), false);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> inject(Harmonized<U> harmonized, Visibility visibility) {
                                throw new IllegalStateException("Cannot inject into initial entry without a registered method: " + this);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Node asNode(Merger merger) {
                                throw new IllegalStateException("Cannot transform initial entry without a registered method: " + this);
                            }

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                return this.key.equals(((Initial) obj).key);
                            }

                            public int hashCode() {
                                return this.key.hashCode();
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Resolved<U> implements Entry<U> {
                            private static final int MADE_VISIBLE = 5;
                            private static final boolean NOT_MADE_VISIBLE = false;
                            private final Harmonized<U> key;
                            private final boolean madeVisible;
                            private final MethodDescription methodDescription;
                            private final Visibility visibility;

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Resolved resolved = (Resolved) obj;
                                return this.key.equals(resolved.key) && this.methodDescription.equals(resolved.methodDescription) && this.visibility.equals(resolved.visibility) && this.madeVisible == resolved.madeVisible;
                            }

                            public int hashCode() {
                                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + this.visibility.hashCode()) * 31) + (this.madeVisible ? 1 : 0);
                            }

                            protected Resolved(Harmonized<U> harmonized, MethodDescription methodDescription, Visibility visibility, boolean z) {
                                this.key = harmonized;
                                this.methodDescription = methodDescription;
                                this.visibility = visibility;
                                this.madeVisible = z;
                            }

                            private static <V> Entry<V> of(Harmonized<V> harmonized, MethodDescription methodDescription, MethodDescription methodDescription2, Visibility visibility) {
                                Visibility expandTo = visibility.expandTo(methodDescription2.getVisibility()).expandTo(methodDescription.getVisibility());
                                if (methodDescription.isBridge()) {
                                    return new Resolved(harmonized, methodDescription2, expandTo, (methodDescription2.getDeclaringType().getModifiers() & 5) == 0);
                                }
                                return new Resolved(harmonized, methodDescription, expandTo, false);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Harmonized<U> getKey() {
                                return this.key;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Set<MethodDescription> getCandidates() {
                                return Collections.singleton(this.methodDescription);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Visibility getVisibility() {
                                return this.visibility;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> extendBy(MethodDescription methodDescription, Harmonizer<U> harmonizer) {
                                Harmonized<U> extend = this.key.extend(methodDescription.asDefined(), harmonizer);
                                Visibility expandTo = this.visibility.expandTo(methodDescription.getVisibility());
                                if (methodDescription.getDeclaringType().equals(this.methodDescription.getDeclaringType())) {
                                    return Ambiguous.of(extend, methodDescription, this.methodDescription, expandTo);
                                }
                                return of(extend, methodDescription, this.methodDescription, expandTo);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> inject(Harmonized<U> harmonized, Visibility visibility) {
                                return new Resolved(this.key.combineWith(harmonized), this.methodDescription, this.visibility.expandTo(visibility), this.madeVisible);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Node asNode(Merger merger) {
                                return new Node(this.key.detach(this.methodDescription.asTypeToken()), this.methodDescription, this.visibility, this.madeVisible);
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            protected static class Node implements Node {
                                private final Detached key;
                                private final MethodDescription methodDescription;
                                private final Visibility visibility;
                                private final boolean visible;

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Node node = (Node) obj;
                                    return this.key.equals(node.key) && this.methodDescription.equals(node.methodDescription) && this.visibility.equals(node.visibility) && this.visible == node.visible;
                                }

                                public int hashCode() {
                                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + this.visibility.hashCode()) * 31) + (this.visible ? 1 : 0);
                                }

                                protected Node(Detached detached, MethodDescription methodDescription, Visibility visibility, boolean z) {
                                    this.key = detached;
                                    this.methodDescription = methodDescription;
                                    this.visibility = visibility;
                                    this.visible = z;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Node.Sort getSort() {
                                    return this.visible ? Node.Sort.VISIBLE : Node.Sort.RESOLVED;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public MethodDescription getRepresentative() {
                                    return this.methodDescription;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Set<MethodDescription.TypeToken> getMethodTypes() {
                                    return this.key.getIdentifiers();
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Visibility getVisibility() {
                                    return this.visibility;
                                }
                            }
                        }

                        @HashCodeAndEqualsPlugin.Enhance
                        public static class Ambiguous<U> implements Entry<U> {
                            private final Harmonized<U> key;
                            private final LinkedHashSet<MethodDescription> methodDescriptions;
                            private final Visibility visibility;

                            public boolean equals(Object obj) {
                                if (this == obj) {
                                    return true;
                                }
                                if (obj == null || getClass() != obj.getClass()) {
                                    return false;
                                }
                                Ambiguous ambiguous = (Ambiguous) obj;
                                return this.key.equals(ambiguous.key) && this.methodDescriptions.equals(ambiguous.methodDescriptions) && this.visibility.equals(ambiguous.visibility);
                            }

                            public int hashCode() {
                                return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + this.methodDescriptions.hashCode()) * 31) + this.visibility.hashCode();
                            }

                            protected Ambiguous(Harmonized<U> harmonized, LinkedHashSet<MethodDescription> linkedHashSet, Visibility visibility) {
                                this.key = harmonized;
                                this.methodDescriptions = linkedHashSet;
                                this.visibility = visibility;
                            }

                            protected static <Q> Entry<Q> of(Harmonized<Q> harmonized, MethodDescription methodDescription, MethodDescription methodDescription2, Visibility visibility) {
                                Visibility expandTo = visibility.expandTo(methodDescription.getVisibility()).expandTo(methodDescription2.getVisibility());
                                if (methodDescription.isBridge() ^ methodDescription2.isBridge()) {
                                    if (methodDescription.isBridge()) {
                                        methodDescription = methodDescription2;
                                    }
                                    return new Resolved(harmonized, methodDescription, expandTo, false);
                                }
                                return new Ambiguous(harmonized, new LinkedHashSet(Arrays.asList(methodDescription, methodDescription2)), expandTo);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Harmonized<U> getKey() {
                                return this.key;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Set<MethodDescription> getCandidates() {
                                return this.methodDescriptions;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Visibility getVisibility() {
                                return this.visibility;
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> extendBy(MethodDescription methodDescription, Harmonizer<U> harmonizer) {
                                Harmonized<U> extend = this.key.extend(methodDescription.asDefined(), harmonizer);
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                TypeDescription asErasure = methodDescription.getDeclaringType().asErasure();
                                boolean isBridge = methodDescription.isBridge();
                                Visibility visibility = this.visibility;
                                Iterator<MethodDescription> it = this.methodDescriptions.iterator();
                                while (it.hasNext()) {
                                    MethodDescription next = it.next();
                                    if (next.getDeclaringType().asErasure().equals(asErasure)) {
                                        if (next.isBridge() ^ isBridge) {
                                            linkedHashSet.add(isBridge ? next : methodDescription);
                                        } else {
                                            linkedHashSet.add(methodDescription);
                                            linkedHashSet.add(next);
                                        }
                                    }
                                    visibility = visibility.expandTo(next.getVisibility());
                                }
                                if (linkedHashSet.isEmpty()) {
                                    return new Resolved(extend, methodDescription, visibility, isBridge);
                                }
                                if (linkedHashSet.size() == 1) {
                                    return new Resolved(extend, (MethodDescription) linkedHashSet.iterator().next(), visibility, false);
                                }
                                return new Ambiguous(extend, linkedHashSet, visibility);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Entry<U> inject(Harmonized<U> harmonized, Visibility visibility) {
                                return new Ambiguous(this.key.combineWith(harmonized), this.methodDescriptions, this.visibility.expandTo(visibility));
                            }

                            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.Key.Store.Entry
                            public Node asNode(Merger merger) {
                                Iterator<MethodDescription> it = this.methodDescriptions.iterator();
                                MethodDescription next = it.next();
                                while (it.hasNext()) {
                                    next = merger.merge(next, it.next());
                                }
                                return new Node(this.key.detach(next.asTypeToken()), next, this.visibility);
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            protected static class Node implements Node {
                                private final Detached key;
                                private final MethodDescription methodDescription;
                                private final Visibility visibility;

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    if (obj == null || getClass() != obj.getClass()) {
                                        return false;
                                    }
                                    Node node = (Node) obj;
                                    return this.key.equals(node.key) && this.methodDescription.equals(node.methodDescription) && this.visibility.equals(node.visibility);
                                }

                                public int hashCode() {
                                    return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + this.methodDescription.hashCode()) * 31) + this.visibility.hashCode();
                                }

                                protected Node(Detached detached, MethodDescription methodDescription, Visibility visibility) {
                                    this.key = detached;
                                    this.methodDescription = methodDescription;
                                    this.visibility = visibility;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Node.Sort getSort() {
                                    return Node.Sort.AMBIGUOUS;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public MethodDescription getRepresentative() {
                                    return this.methodDescription;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Set<MethodDescription.TypeToken> getMethodTypes() {
                                    return this.key.getIdentifiers();
                                }

                                @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph.Node
                                public Visibility getVisibility() {
                                    return this.visibility;
                                }
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class Graph implements MethodGraph {
                        private final LinkedHashMap<Key<MethodDescription.TypeToken>, Node> entries;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.entries.equals(((Graph) obj).entries);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.entries.hashCode();
                        }

                        protected Graph(LinkedHashMap<Key<MethodDescription.TypeToken>, Node> linkedHashMap) {
                            this.entries = linkedHashMap;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
                        public Node locate(MethodDescription.SignatureToken signatureToken) {
                            Node node = this.entries.get(Detached.of(signatureToken));
                            return node == null ? Node.Unresolved.INSTANCE : node;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
                        public NodeList listNodes() {
                            return new NodeList(new ArrayList(this.entries.values()));
                        }
                    }
                }
            }
        }
    }

    public static class NodeList extends FilterableList.AbstractBase<Node, NodeList> {
        private final List<? extends Node> nodes;

        public NodeList(List<? extends Node> list) {
            this.nodes = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public Node get(int i) {
            return this.nodes.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.nodes.size();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList.AbstractBase
        public NodeList wrap(List<Node> list) {
            return new NodeList(list);
        }

        public MethodList<?> asMethodList() {
            ArrayList arrayList = new ArrayList(size());
            Iterator<? extends Node> it = this.nodes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getRepresentative());
            }
            return new MethodList.Explicit(arrayList);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements MethodGraph {
        private final LinkedHashMap<MethodDescription.SignatureToken, Node> nodes;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.nodes.equals(((Simple) obj).nodes);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.nodes.hashCode();
        }

        public Simple(LinkedHashMap<MethodDescription.SignatureToken, Node> linkedHashMap) {
            this.nodes = linkedHashMap;
        }

        public static MethodGraph of(List<? extends MethodDescription> list) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (MethodDescription methodDescription : list) {
                linkedHashMap.put(methodDescription.asSignatureToken(), new Node.Simple(methodDescription));
            }
            return new Simple(linkedHashMap);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
        public Node locate(MethodDescription.SignatureToken signatureToken) {
            Node node = this.nodes.get(signatureToken);
            return node == null ? Node.Unresolved.INSTANCE : node;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph
        public NodeList listNodes() {
            return new NodeList(new ArrayList(this.nodes.values()));
        }
    }
}
