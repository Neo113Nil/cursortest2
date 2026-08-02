package com.google.firebase.components;

/* loaded from: classes9.dex */
public final class Component<T> {
    private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
    private final com.google.firebase.components.ComponentFactory<T> factory;
    private final int instantiation;

    /* renamed from: name, reason: collision with root package name */
    private final java.lang.String f3913name;
    private final java.util.Set<com.google.firebase.components.Qualified<? super T>> providedInterfaces;
    private final java.util.Set<java.lang.Class<?>> publishedEvents;
    private final int type;

    static /* synthetic */ java.lang.Object lambda$intoSet$3(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$intoSet$4(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$of$0(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ java.lang.Object lambda$of$2(java.lang.Object obj, com.google.firebase.components.ComponentContainer componentContainer) {
        return obj;
    }

    private Component(java.lang.String str, java.util.Set<com.google.firebase.components.Qualified<? super T>> set, java.util.Set<com.google.firebase.components.Dependency> set2, int i, int i2, com.google.firebase.components.ComponentFactory<T> componentFactory, java.util.Set<java.lang.Class<?>> set3) {
        this.f3913name = str;
        this.providedInterfaces = java.util.Collections.unmodifiableSet(set);
        this.dependencies = java.util.Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = java.util.Collections.unmodifiableSet(set3);
    }

    public final java.lang.String getName() {
        return this.f3913name;
    }

    public final java.util.Set<com.google.firebase.components.Qualified<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public final java.util.Set<com.google.firebase.components.Dependency> getDependencies() {
        return this.dependencies;
    }

    public final com.google.firebase.components.ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public final java.util.Set<java.lang.Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public final boolean isLazy() {
        return this.instantiation == 0;
    }

    public final boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public final boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public final boolean isValue() {
        return this.type == 0;
    }

    public final com.google.firebase.components.Component<T> withFactory(com.google.firebase.components.ComponentFactory<T> componentFactory) {
        return new com.google.firebase.components.Component<>(this.f3913name, this.providedInterfaces, this.dependencies, this.instantiation, this.type, componentFactory, this.publishedEvents);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Component<");
        sb.append(java.util.Arrays.toString(this.providedInterfaces.toArray()));
        sb.append(">{");
        sb.append(this.instantiation);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", deps=");
        sb.append(java.util.Arrays.toString(this.dependencies.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> cls) {
        return new com.google.firebase.components.Component.Builder<>(cls, new java.lang.Class[0]);
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
        return new com.google.firebase.components.Component.Builder<>(cls, clsArr);
    }

    public static <T> com.google.firebase.components.Component.Builder<T> builder(com.google.firebase.components.Qualified<T> qualified) {
        return new com.google.firebase.components.Component.Builder<>(qualified, new com.google.firebase.components.Qualified[0]);
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component.Builder<T> builder(com.google.firebase.components.Qualified<T> qualified, com.google.firebase.components.Qualified<? super T>... qualifiedArr) {
        return new com.google.firebase.components.Component.Builder<>(qualified, qualifiedArr);
    }

    @java.lang.Deprecated
    public static <T> com.google.firebase.components.Component<T> of(java.lang.Class<T> cls, final T t) {
        return builder(cls).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.components.Component$$ExternalSyntheticLambda3
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.components.Component.lambda$of$0(t, componentContainer);
            }
        }).build();
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component<T> of(final T t, java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.components.Component$$ExternalSyntheticLambda4
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.components.Component.lambda$of$1(t, componentContainer);
            }
        }).build();
    }

    @java.lang.SafeVarargs
    public static <T> com.google.firebase.components.Component<T> of(final T t, com.google.firebase.components.Qualified<T> qualified, com.google.firebase.components.Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.components.Component$$ExternalSyntheticLambda0
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.components.Component.lambda$of$2(t, componentContainer);
            }
        }).build();
    }

    public static <T> com.google.firebase.components.Component.Builder<T> intoSetBuilder(java.lang.Class<T> cls) {
        return builder(cls).intoSet();
    }

    public static <T> com.google.firebase.components.Component.Builder<T> intoSetBuilder(com.google.firebase.components.Qualified<T> qualified) {
        return builder(qualified).intoSet();
    }

    public static <T> com.google.firebase.components.Component<T> intoSet(final T t, java.lang.Class<T> cls) {
        return intoSetBuilder(cls).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.components.Component$$ExternalSyntheticLambda2
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.components.Component.lambda$intoSet$3(t, componentContainer);
            }
        }).build();
    }

    public static <T> com.google.firebase.components.Component<T> intoSet(final T t, com.google.firebase.components.Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new com.google.firebase.components.ComponentFactory() { // from class: com.google.firebase.components.Component$$ExternalSyntheticLambda1
            @Override // com.google.firebase.components.ComponentFactory
            public final java.lang.Object create(com.google.firebase.components.ComponentContainer componentContainer) {
                return com.google.firebase.components.Component.lambda$intoSet$4(t, componentContainer);
            }
        }).build();
    }

    public static class Builder<T> {
        private final java.util.Set<com.google.firebase.components.Dependency> dependencies;
        private com.google.firebase.components.ComponentFactory<T> factory;
        private int instantiation;

        /* renamed from: name, reason: collision with root package name */
        private java.lang.String f3914name;
        private final java.util.Set<com.google.firebase.components.Qualified<? super T>> providedInterfaces;
        private final java.util.Set<java.lang.Class<?>> publishedEvents;
        private int type;

        @java.lang.SafeVarargs
        private Builder(java.lang.Class<T> cls, java.lang.Class<? super T>... clsArr) {
            this.f3914name = null;
            java.util.HashSet hashSet = new java.util.HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new java.util.HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new java.util.HashSet();
            com.google.firebase.components.Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(com.google.firebase.components.Qualified.unqualified(cls));
            for (java.lang.Class<? super T> cls2 : clsArr) {
                com.google.firebase.components.Preconditions.checkNotNull(cls2, "Null interface");
                this.providedInterfaces.add(com.google.firebase.components.Qualified.unqualified(cls2));
            }
        }

        @java.lang.SafeVarargs
        private Builder(com.google.firebase.components.Qualified<T> qualified, com.google.firebase.components.Qualified<? super T>... qualifiedArr) {
            this.f3914name = null;
            java.util.HashSet hashSet = new java.util.HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new java.util.HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new java.util.HashSet();
            com.google.firebase.components.Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (com.google.firebase.components.Qualified<? super T> qualified2 : qualifiedArr) {
                com.google.firebase.components.Preconditions.checkNotNull(qualified2, "Null interface");
            }
            java.util.Collections.addAll(this.providedInterfaces, qualifiedArr);
        }

        public com.google.firebase.components.Component.Builder<T> name(java.lang.String str) {
            this.f3914name = str;
            return this;
        }

        public com.google.firebase.components.Component.Builder<T> add(com.google.firebase.components.Dependency dependency) {
            com.google.firebase.components.Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        public com.google.firebase.components.Component.Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public com.google.firebase.components.Component.Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        public com.google.firebase.components.Component.Builder<T> publishes(java.lang.Class<?> cls) {
            this.publishedEvents.add(cls);
            return this;
        }

        private com.google.firebase.components.Component.Builder<T> setInstantiation(int i) {
            com.google.firebase.components.Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(com.google.firebase.components.Qualified<?> qualified) {
            com.google.firebase.components.Preconditions.checkArgument(!this.providedInterfaces.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public com.google.firebase.components.Component.Builder<T> factory(com.google.firebase.components.ComponentFactory<T> componentFactory) {
            this.factory = (com.google.firebase.components.ComponentFactory) com.google.firebase.components.Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.firebase.components.Component.Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        public com.google.firebase.components.Component<T> build() {
            com.google.firebase.components.Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new com.google.firebase.components.Component<>(this.f3914name, new java.util.HashSet(this.providedInterfaces), new java.util.HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }
    }
}
