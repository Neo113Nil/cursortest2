package com.google.common.util.concurrent;

/* loaded from: classes9.dex */
public class CycleDetectingLockFactory {
    final com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy;
    private static final java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> lockGraphNodesPerType = new com.google.common.collect.MapMaker().weakKeys().makeMap();
    private static final com.google.common.util.concurrent.LazyLogger logger = new com.google.common.util.concurrent.LazyLogger(com.google.common.util.concurrent.CycleDetectingLockFactory.class);
    private static final java.lang.ThreadLocal<java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> acquiredLocks = new java.lang.ThreadLocal<java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> initialValue() {
            return com.google.common.collect.Lists.newArrayListWithCapacity(3);
        }
    };

    interface CycleDetectingLock {
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode();

        boolean isAcquiredByCurrentThread();
    }

    public enum Policies implements com.google.common.util.concurrent.CycleDetectingLockFactory.Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public final void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException) {
                throw potentialDeadlockException;
            }
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public final void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException) {
                com.google.common.util.concurrent.CycleDetectingLockFactory.logger.get().log(java.util.logging.Level.SEVERE, "Detected potential deadlock", (java.lang.Throwable) potentialDeadlockException);
            }
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
            @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.Policy
            public final void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException) {
            }
        }
    }

    public interface Policy {
        void handlePotentialDeadlock(com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException);
    }

    public static com.google.common.util.concurrent.CycleDetectingLockFactory newInstance(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        return new com.google.common.util.concurrent.CycleDetectingLockFactory(policy);
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String str) {
        return newReentrantLock(str, false);
    }

    public java.util.concurrent.locks.ReentrantLock newReentrantLock(java.lang.String str, boolean z) {
        if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
            return new java.util.concurrent.locks.ReentrantLock(z);
        }
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantLock(new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(str), z);
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String str) {
        return newReentrantReadWriteLock(str, false);
    }

    public java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(java.lang.String str, boolean z) {
        if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
            return new java.util.concurrent.locks.ReentrantReadWriteLock(z);
        }
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock(new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(str), z);
    }

    public static <E extends java.lang.Enum<E>> com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E> newInstanceWithExplicitOrdering(java.lang.Class<E> cls, com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        com.google.common.base.Preconditions.checkNotNull(cls);
        com.google.common.base.Preconditions.checkNotNull(policy);
        return new com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<>(policy, getOrCreateNodes(cls));
    }

    private static <E extends java.lang.Enum<E>> java.util.Map<? extends E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> getOrCreateNodes(java.lang.Class<E> cls) {
        java.util.concurrent.ConcurrentMap<java.lang.Class<? extends java.lang.Enum<?>>, java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode>> concurrentMap = lockGraphNodesPerType;
        java.util.Map<? extends E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> map = (java.util.Map) concurrentMap.get(cls);
        if (map != null) {
            return map;
        }
        java.util.Map<? extends java.lang.Enum<?>, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> createNodes = createNodes(cls);
        return (java.util.Map) com.google.common.base.MoreObjects.firstNonNull(concurrentMap.putIfAbsent(cls, createNodes), createNodes);
    }

    static <E extends java.lang.Enum<E>> java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> createNodes(java.lang.Class<E> cls) {
        java.util.EnumMap newEnumMap = com.google.common.collect.Maps.newEnumMap(cls);
        E[] enumConstants = cls.getEnumConstants();
        int length = enumConstants.length;
        java.util.ArrayList newArrayListWithCapacity = com.google.common.collect.Lists.newArrayListWithCapacity(length);
        int i = 0;
        for (E e : enumConstants) {
            com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = new com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode(getLockName(e));
            newArrayListWithCapacity.add(lockGraphNode);
            newEnumMap.put((java.util.EnumMap) e, (E) lockGraphNode);
        }
        for (int i2 = 1; i2 < length; i2++) {
            ((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) newArrayListWithCapacity.get(i2)).checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.THROW, newArrayListWithCapacity.subList(0, i2));
        }
        while (i < length - 1) {
            i++;
            ((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) newArrayListWithCapacity.get(i)).checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED, newArrayListWithCapacity.subList(i, length));
        }
        return java.util.Collections.unmodifiableMap(newEnumMap);
    }

    private static java.lang.String getLockName(java.lang.Enum<?> r2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(r2.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(r2.name());
        return sb.toString();
    }

    public static final class WithExplicitOrdering<E extends java.lang.Enum<E>> extends com.google.common.util.concurrent.CycleDetectingLockFactory {
        private final java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> lockGraphNodes;

        WithExplicitOrdering(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, java.util.Map<E, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> map) {
            super(policy);
            this.lockGraphNodes = map;
        }

        public final java.util.concurrent.locks.ReentrantLock newReentrantLock(E e) {
            return newReentrantLock((com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E>) e, false);
        }

        public final java.util.concurrent.locks.ReentrantLock newReentrantLock(E e, boolean z) {
            if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
                return new java.util.concurrent.locks.ReentrantLock(z);
            }
            return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantLock((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) java.util.Objects.requireNonNull(this.lockGraphNodes.get(e)), z);
        }

        public final java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E e) {
            return newReentrantReadWriteLock((com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering<E>) e, false);
        }

        public final java.util.concurrent.locks.ReentrantReadWriteLock newReentrantReadWriteLock(E e, boolean z) {
            if (this.policy == com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.DISABLED) {
                return new java.util.concurrent.locks.ReentrantReadWriteLock(z);
            }
            return new com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock((com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) java.util.Objects.requireNonNull(this.lockGraphNodes.get(e)), z);
        }
    }

    private CycleDetectingLockFactory(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy) {
        this.policy = (com.google.common.util.concurrent.CycleDetectingLockFactory.Policy) com.google.common.base.Preconditions.checkNotNull(policy);
    }

    static class ExampleStackTrace extends java.lang.IllegalStateException {
        static final java.lang.StackTraceElement[] EMPTY_STACK_TRACE = new java.lang.StackTraceElement[0];
        static final com.google.common.collect.ImmutableSet<java.lang.String> EXCLUDED_CLASS_NAMES = com.google.common.collect.ImmutableSet.of(com.google.common.util.concurrent.CycleDetectingLockFactory.class.getName(), com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace.class.getName(), com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode.class.getName());

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ExampleStackTrace(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode2) {
            super(r0.toString());
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(lockGraphNode.getLockName());
            sb.append(" -> ");
            sb.append(lockGraphNode2.getLockName());
            java.lang.StackTraceElement[] stackTrace = getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                if (com.google.common.util.concurrent.CycleDetectingLockFactory.WithExplicitOrdering.class.getName().equals(stackTrace[i].getClassName())) {
                    setStackTrace(EMPTY_STACK_TRACE);
                    return;
                } else {
                    if (!EXCLUDED_CLASS_NAMES.contains(stackTrace[i].getClassName())) {
                        setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i, length));
                        return;
                    }
                }
            }
        }
    }

    public static final class PotentialDeadlockException extends com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace conflictingStackTrace;

        private PotentialDeadlockException(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode2, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace) {
            super(lockGraphNode, lockGraphNode2);
            this.conflictingStackTrace = exampleStackTrace;
            initCause(exampleStackTrace);
        }

        public final com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace getConflictingStackTrace() {
            return this.conflictingStackTrace;
        }

        @Override // java.lang.Throwable
        public final java.lang.String getMessage() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) java.util.Objects.requireNonNull(super.getMessage()));
            for (java.lang.Throwable th = this.conflictingStackTrace; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    static final class LockGraphNode {
        final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace> allowedPriorLocks = new com.google.common.collect.MapMaker().weakKeys().makeMap();
        final java.util.Map<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException> disallowedPriorLocks = new com.google.common.collect.MapMaker().weakKeys().makeMap();
        final java.lang.String lockName;

        LockGraphNode(java.lang.String str) {
            this.lockName = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        }

        final java.lang.String getLockName() {
            return this.lockName;
        }

        final void checkAcquiredLocks(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> list) {
            java.util.Iterator<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> it = list.iterator();
            while (it.hasNext()) {
                checkAcquiredLock(policy, it.next());
            }
        }

        final void checkAcquiredLock(com.google.common.util.concurrent.CycleDetectingLockFactory.Policy policy, com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode) {
            com.google.common.base.Preconditions.checkState(this != lockGraphNode, "Attempted to acquire multiple locks with the same rank %s", lockGraphNode.getLockName());
            if (this.allowedPriorLocks.containsKey(lockGraphNode)) {
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException = this.disallowedPriorLocks.get(lockGraphNode);
            if (potentialDeadlockException != null) {
                policy.handlePotentialDeadlock(new com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException(lockGraphNode, this, potentialDeadlockException.getConflictingStackTrace()));
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace findPathTo = lockGraphNode.findPathTo(this, com.google.common.collect.Sets.newIdentityHashSet());
            if (findPathTo == null) {
                this.allowedPriorLocks.put(lockGraphNode, new com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace(lockGraphNode, this));
                return;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException potentialDeadlockException2 = new com.google.common.util.concurrent.CycleDetectingLockFactory.PotentialDeadlockException(lockGraphNode, this, findPathTo);
            this.disallowedPriorLocks.put(lockGraphNode, potentialDeadlockException2);
            policy.handlePotentialDeadlock(potentialDeadlockException2);
        }

        private com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace findPathTo(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, java.util.Set<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> set) {
            if (!set.add(this)) {
                return null;
            }
            com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace = this.allowedPriorLocks.get(lockGraphNode);
            if (exampleStackTrace != null) {
                return exampleStackTrace;
            }
            for (java.util.Map.Entry<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode, com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace> entry : this.allowedPriorLocks.entrySet()) {
                com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode key = entry.getKey();
                com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace findPathTo = key.findPathTo(lockGraphNode, set);
                if (findPathTo != null) {
                    com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace exampleStackTrace2 = new com.google.common.util.concurrent.CycleDetectingLockFactory.ExampleStackTrace(key, this);
                    exampleStackTrace2.setStackTrace(entry.getValue().getStackTrace());
                    exampleStackTrace2.initCause(findPathTo);
                    return exampleStackTrace2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aboutToAcquire(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock cycleDetectingLock) {
        if (cycleDetectingLock.isAcquiredByCurrentThread()) {
            return;
        }
        java.util.List<com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode> list = (java.util.List) java.util.Objects.requireNonNull(acquiredLocks.get());
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
        lockGraphNode.checkAcquiredLocks(this.policy, list);
        list.add(lockGraphNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lockStateChanged(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock cycleDetectingLock) {
        if (cycleDetectingLock.isAcquiredByCurrentThread()) {
            return;
        }
        java.util.List list = (java.util.List) java.util.Objects.requireNonNull(acquiredLocks.get());
        com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode = cycleDetectingLock.getLockGraphNode();
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size) == lockGraphNode) {
                list.remove(size);
                return;
            }
        }
    }

    final class CycleDetectingReentrantLock extends java.util.concurrent.locks.ReentrantLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;

        private CycleDetectingReentrantLock(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, boolean z) {
            super(z);
            this.lockGraphNode = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) com.google.common.base.Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public final boolean isAcquiredByCurrentThread() {
            return isHeldByCurrentThread();
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this);
            }
        }
    }

    final class CycleDetectingReentrantReadWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock implements com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock {
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadLock readLock;
        private final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantWriteLock writeLock;

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock readLock() {
            return readLock();
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final /* bridge */ /* synthetic */ java.util.concurrent.locks.Lock writeLock() {
            return writeLock();
        }

        private CycleDetectingReentrantReadWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode lockGraphNode, boolean z) {
            super(z);
            this.readLock = com.google.common.util.concurrent.CycleDetectingLockFactory.this.new CycleDetectingReentrantReadLock(this);
            this.writeLock = com.google.common.util.concurrent.CycleDetectingLockFactory.this.new CycleDetectingReentrantWriteLock(this);
            this.lockGraphNode = (com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode) com.google.common.base.Preconditions.checkNotNull(lockGraphNode);
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock() {
            return this.readLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock() {
            return this.writeLock;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public final com.google.common.util.concurrent.CycleDetectingLockFactory.LockGraphNode getLockGraphNode() {
            return this.lockGraphNode;
        }

        @Override // com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingLock
        public final boolean isAcquiredByCurrentThread() {
            return isWriteLockedByCurrentThread() || getReadHoldCount() > 0;
        }
    }

    final class CycleDetectingReentrantReadLock extends java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock {
        final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantReadLock(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }

    final class CycleDetectingReentrantWriteLock extends java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock {
        final com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock readWriteLock;

        CycleDetectingReentrantWriteLock(com.google.common.util.concurrent.CycleDetectingLockFactory.CycleDetectingReentrantReadWriteLock cycleDetectingReentrantReadWriteLock) {
            super(cycleDetectingReentrantReadWriteLock);
            this.readWriteLock = cycleDetectingReentrantReadWriteLock;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void lock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void lockInterruptibly() throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                super.lockInterruptibly();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final boolean tryLock(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
            com.google.common.util.concurrent.CycleDetectingLockFactory.this.aboutToAcquire(this.readWriteLock);
            try {
                return super.tryLock(j, timeUnit);
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public final void unlock() {
            try {
                super.unlock();
            } finally {
                com.google.common.util.concurrent.CycleDetectingLockFactory.lockStateChanged(this.readWriteLock);
            }
        }
    }
}
