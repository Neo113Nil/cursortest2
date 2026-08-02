package com.google.common.eventbus;

/* loaded from: classes9.dex */
final class SubscriberRegistry {
    private final com.google.common.eventbus.EventBus bus;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber>> subscribers = com.google.common.collect.Maps.newConcurrentMap();
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableList<java.lang.reflect.Method>> subscriberMethodsCache = com.google.common.cache.CacheBuilder.newBuilder().weakKeys().build(com.google.common.cache.CacheLoader.from(new com.google.common.base.Function() { // from class: com.google.common.eventbus.SubscriberRegistry$$ExternalSyntheticLambda0
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            com.google.common.collect.ImmutableList annotatedMethodsNotCached;
            annotatedMethodsNotCached = com.google.common.eventbus.SubscriberRegistry.getAnnotatedMethodsNotCached((java.lang.Class) obj);
            return annotatedMethodsNotCached;
        }
    }));
    private static final com.google.common.cache.LoadingCache<java.lang.Class<?>, com.google.common.collect.ImmutableSet<java.lang.Class<?>>> flattenHierarchyCache = com.google.common.cache.CacheBuilder.newBuilder().weakKeys().build(com.google.common.cache.CacheLoader.from(new com.google.common.base.Function() { // from class: com.google.common.eventbus.SubscriberRegistry$$ExternalSyntheticLambda1
        @Override // com.google.common.base.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            com.google.common.collect.ImmutableSet copyOf;
            copyOf = com.google.common.collect.ImmutableSet.copyOf((java.util.Collection) com.google.common.reflect.TypeToken.of((java.lang.Class) obj).getTypes().rawTypes());
            return copyOf;
        }
    }));

    SubscriberRegistry(com.google.common.eventbus.EventBus eventBus) {
        this.bus = (com.google.common.eventbus.EventBus) com.google.common.base.Preconditions.checkNotNull(eventBus);
    }

    final void register(java.lang.Object obj) {
        for (java.util.Map.Entry<java.lang.Class<?>, java.util.Collection<com.google.common.eventbus.Subscriber>> entry : findAllSubscribers(obj).asMap().entrySet()) {
            java.lang.Class<?> key = entry.getKey();
            java.util.Collection<com.google.common.eventbus.Subscriber> value = entry.getValue();
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(key);
            if (copyOnWriteArraySet == null) {
                java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet2 = new java.util.concurrent.CopyOnWriteArraySet<>();
                copyOnWriteArraySet = (java.util.concurrent.CopyOnWriteArraySet) com.google.common.base.MoreObjects.firstNonNull(this.subscribers.putIfAbsent(key, copyOnWriteArraySet2), copyOnWriteArraySet2);
            }
            copyOnWriteArraySet.addAll(value);
        }
    }

    final void unregister(java.lang.Object obj) {
        for (java.util.Map.Entry<java.lang.Class<?>, java.util.Collection<com.google.common.eventbus.Subscriber>> entry : findAllSubscribers(obj).asMap().entrySet()) {
            java.lang.Class<?> key = entry.getKey();
            java.util.Collection<com.google.common.eventbus.Subscriber> value = entry.getValue();
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(key);
            if (copyOnWriteArraySet == null || !copyOnWriteArraySet.removeAll(value)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("missing event subscriber for an annotated method. Is ");
                sb.append(obj);
                sb.append(" registered?");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
    }

    final java.util.Set<com.google.common.eventbus.Subscriber> getSubscribersForTesting(java.lang.Class<?> cls) {
        return (java.util.Set) com.google.common.base.MoreObjects.firstNonNull(this.subscribers.get(cls), com.google.common.collect.ImmutableSet.of());
    }

    final java.util.Iterator<com.google.common.eventbus.Subscriber> getSubscribers(java.lang.Object obj) {
        com.google.common.collect.ImmutableSet<java.lang.Class<?>> flattenHierarchy = flattenHierarchy(obj.getClass());
        java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(flattenHierarchy.size());
        com.google.common.collect.UnmodifiableIterator<java.lang.Class<?>> it = flattenHierarchy.iterator();
        while (it.hasNext()) {
            java.util.concurrent.CopyOnWriteArraySet<com.google.common.eventbus.Subscriber> copyOnWriteArraySet = this.subscribers.get(it.next());
            if (copyOnWriteArraySet != null) {
                newArrayListWithCapacity.add(copyOnWriteArraySet.iterator());
            }
        }
        return com.google.common.collect.Iterators.concat(newArrayListWithCapacity.iterator());
    }

    private com.google.common.collect.Multimap<java.lang.Class<?>, com.google.common.eventbus.Subscriber> findAllSubscribers(java.lang.Object obj) {
        com.google.common.collect.HashMultimap create = com.google.common.collect.HashMultimap.create();
        com.google.common.collect.UnmodifiableIterator<java.lang.reflect.Method> it = getAnnotatedMethods(obj.getClass()).iterator();
        while (it.hasNext()) {
            java.lang.reflect.Method next = it.next();
            create.put(next.getParameterTypes()[0], com.google.common.eventbus.Subscriber.create(this.bus, obj, next));
        }
        return create;
    }

    private static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethods(java.lang.Class<?> cls) {
        try {
            return subscriberMethodsCache.getUnchecked(cls);
        } catch (com.google.common.util.concurrent.UncheckedExecutionException e) {
            if (e.getCause() instanceof java.lang.IllegalArgumentException) {
                throw new java.lang.IllegalArgumentException(e.getCause().getMessage(), e.getCause());
            }
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.common.collect.ImmutableList<java.lang.reflect.Method> getAnnotatedMethodsNotCached(java.lang.Class<?> cls) {
        java.util.Set rawTypes = com.google.common.reflect.TypeToken.of((java.lang.Class) cls).getTypes().rawTypes();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = rawTypes.iterator();
        while (it.hasNext()) {
            for (java.lang.reflect.Method method : ((java.lang.Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(com.google.common.eventbus.Subscribe.class) && !method.isSynthetic()) {
                    java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                    com.google.common.base.Preconditions.checkArgument(parameterTypes.length == 1, "Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", (java.lang.Object) method, parameterTypes.length);
                    com.google.common.base.Preconditions.checkArgument(!parameterTypes[0].isPrimitive(), "@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, parameterTypes[0].getName(), com.google.common.primitives.Primitives.wrap(parameterTypes[0]).getSimpleName());
                    com.google.common.eventbus.SubscriberRegistry.MethodIdentifier methodIdentifier = new com.google.common.eventbus.SubscriberRegistry.MethodIdentifier(method);
                    if (!hashMap.containsKey(methodIdentifier)) {
                        hashMap.put(methodIdentifier, method);
                    }
                }
            }
        }
        return com.google.common.collect.ImmutableList.copyOf(hashMap.values());
    }

    static com.google.common.collect.ImmutableSet<java.lang.Class<?>> flattenHierarchy(java.lang.Class<?> cls) {
        return flattenHierarchyCache.getUnchecked(cls);
    }

    static final class MethodIdentifier {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3864name;
        private final java.util.List<java.lang.Class<?>> parameterTypes;

        MethodIdentifier(java.lang.reflect.Method method) {
            this.f3864name = method.getName();
            this.parameterTypes = java.util.Arrays.asList(method.getParameterTypes());
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.f3864name, this.parameterTypes);
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.eventbus.SubscriberRegistry.MethodIdentifier)) {
                return false;
            }
            com.google.common.eventbus.SubscriberRegistry.MethodIdentifier methodIdentifier = (com.google.common.eventbus.SubscriberRegistry.MethodIdentifier) obj;
            return this.f3864name.equals(methodIdentifier.f3864name) && this.parameterTypes.equals(methodIdentifier.parameterTypes);
        }
    }
}
