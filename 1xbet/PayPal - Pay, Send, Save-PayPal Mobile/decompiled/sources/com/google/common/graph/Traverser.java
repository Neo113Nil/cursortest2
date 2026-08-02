package com.google.common.graph;

@com.google.errorprone.annotations.DoNotMock("Call forGraph or forTree, passing a lambda or a Graph with the desired edges (built with GraphBuilder)")
/* loaded from: classes9.dex */
public abstract class Traverser<N> {
    private final com.google.common.graph.SuccessorsFunction<N> successorFunction;

    enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            final <T> void insertInto(java.util.Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            final <T> void insertInto(java.util.Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        abstract <T> void insertInto(java.util.Deque<T> deque, T t);
    }

    abstract com.google.common.graph.Traverser.Traversal<N> newTraversal();

    private Traverser(com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
        this.successorFunction = (com.google.common.graph.SuccessorsFunction) com.google.common.base.Preconditions.checkNotNull(successorsFunction);
    }

    public static <N> com.google.common.graph.Traverser<N> forGraph(final com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
        return new com.google.common.graph.Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            com.google.common.graph.Traverser.Traversal<N> newTraversal() {
                return com.google.common.graph.Traverser.Traversal.inGraph(successorsFunction);
            }
        };
    }

    public static <N> com.google.common.graph.Traverser<N> forTree(final com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof com.google.common.graph.BaseGraph) {
            com.google.common.base.Preconditions.checkArgument(((com.google.common.graph.BaseGraph) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof com.google.common.graph.Network) {
            com.google.common.base.Preconditions.checkArgument(((com.google.common.graph.Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new com.google.common.graph.Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            com.google.common.graph.Traverser.Traversal<N> newTraversal() {
                return com.google.common.graph.Traverser.Traversal.inTree(successorsFunction);
            }
        };
    }

    public final java.lang.Iterable<N> breadthFirst(N n) {
        return breadthFirst((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(n));
    }

    public final java.lang.Iterable<N> breadthFirst(java.lang.Iterable<? extends N> iterable) {
        final com.google.common.collect.ImmutableSet<N> validate = validate(iterable);
        return new java.lang.Iterable() { // from class: com.google.common.graph.Traverser$$ExternalSyntheticLambda1
            @Override // java.lang.Iterable
            public final java.util.Iterator iterator() {
                return com.google.common.graph.Traverser.this.m10337lambda$breadthFirst$0$comgooglecommongraphTraverser(validate);
            }
        };
    }

    /* renamed from: lambda$breadthFirst$0$com-google-common-graph-Traverser, reason: not valid java name */
    /* synthetic */ java.util.Iterator m10337lambda$breadthFirst$0$comgooglecommongraphTraverser(com.google.common.collect.ImmutableSet immutableSet) {
        return newTraversal().breadthFirst(immutableSet.iterator());
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(N n) {
        return depthFirstPreOrder((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(n));
    }

    public final java.lang.Iterable<N> depthFirstPreOrder(java.lang.Iterable<? extends N> iterable) {
        final com.google.common.collect.ImmutableSet<N> validate = validate(iterable);
        return new java.lang.Iterable() { // from class: com.google.common.graph.Traverser$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final java.util.Iterator iterator() {
                return com.google.common.graph.Traverser.this.m10339lambda$depthFirstPreOrder$0$comgooglecommongraphTraverser(validate);
            }
        };
    }

    /* renamed from: lambda$depthFirstPreOrder$0$com-google-common-graph-Traverser, reason: not valid java name */
    /* synthetic */ java.util.Iterator m10339lambda$depthFirstPreOrder$0$comgooglecommongraphTraverser(com.google.common.collect.ImmutableSet immutableSet) {
        return newTraversal().preOrder(immutableSet.iterator());
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(N n) {
        return depthFirstPostOrder((java.lang.Iterable) com.google.common.collect.ImmutableSet.of(n));
    }

    public final java.lang.Iterable<N> depthFirstPostOrder(java.lang.Iterable<? extends N> iterable) {
        final com.google.common.collect.ImmutableSet<N> validate = validate(iterable);
        return new java.lang.Iterable() { // from class: com.google.common.graph.Traverser$$ExternalSyntheticLambda2
            @Override // java.lang.Iterable
            public final java.util.Iterator iterator() {
                return com.google.common.graph.Traverser.this.m10338lambda$depthFirstPostOrder$0$comgooglecommongraphTraverser(validate);
            }
        };
    }

    /* renamed from: lambda$depthFirstPostOrder$0$com-google-common-graph-Traverser, reason: not valid java name */
    /* synthetic */ java.util.Iterator m10338lambda$depthFirstPostOrder$0$comgooglecommongraphTraverser(com.google.common.collect.ImmutableSet immutableSet) {
        return newTraversal().postOrder(immutableSet.iterator());
    }

    private com.google.common.collect.ImmutableSet<N> validate(java.lang.Iterable<? extends N> iterable) {
        com.google.common.collect.ImmutableSet<N> copyOf = com.google.common.collect.ImmutableSet.copyOf(iterable);
        com.google.common.collect.UnmodifiableIterator<N> it = copyOf.iterator();
        while (it.hasNext()) {
            this.successorFunction.successors(it.next());
        }
        return copyOf;
    }

    static abstract class Traversal<N> {
        final com.google.common.graph.SuccessorsFunction<N> successorFunction;

        abstract N visitNext(java.util.Deque<java.util.Iterator<? extends N>> deque);

        Traversal(com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
            this.successorFunction = successorsFunction;
        }

        static <N> com.google.common.graph.Traverser.Traversal<N> inGraph(com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
            final java.util.HashSet hashSet = new java.util.HashSet();
            return new com.google.common.graph.Traverser.Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                N visitNext(java.util.Deque<java.util.Iterator<? extends N>> deque) {
                    java.util.Iterator<? extends N> first = deque.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        java.util.Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        static <N> com.google.common.graph.Traverser.Traversal<N> inTree(com.google.common.graph.SuccessorsFunction<N> successorsFunction) {
            return new com.google.common.graph.Traverser.Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                N visitNext(java.util.Deque<java.util.Iterator<? extends N>> deque) {
                    java.util.Iterator<? extends N> first = deque.getFirst();
                    if (first.hasNext()) {
                        return (N) com.google.common.base.Preconditions.checkNotNull(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        final java.util.Iterator<N> breadthFirst(java.util.Iterator<? extends N> it) {
            return topDown(it, com.google.common.graph.Traverser.InsertionOrder.BACK);
        }

        final java.util.Iterator<N> preOrder(java.util.Iterator<? extends N> it) {
            return topDown(it, com.google.common.graph.Traverser.InsertionOrder.FRONT);
        }

        private java.util.Iterator<N> topDown(java.util.Iterator<? extends N> it, final com.google.common.graph.Traverser.InsertionOrder insertionOrder) {
            final java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            arrayDeque.add(it);
            return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.3
                final /* synthetic */ com.google.common.graph.Traverser.Traversal this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    do {
                        N n = (N) this.this$0.visitNext(arrayDeque);
                        if (n != null) {
                            java.util.Iterator<? extends N> it2 = this.this$0.successorFunction.successors(n).iterator();
                            if (it2.hasNext()) {
                                insertionOrder.insertInto(arrayDeque, it2);
                            }
                            return n;
                        }
                    } while (!arrayDeque.isEmpty());
                    return endOfData();
                }
            };
        }

        final java.util.Iterator<N> postOrder(java.util.Iterator<? extends N> it) {
            final java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            final java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque();
            arrayDeque2.add(it);
            return new com.google.common.collect.AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.4
                final /* synthetic */ com.google.common.graph.Traverser.Traversal this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (true) {
                        N n = (N) this.this$0.visitNext(arrayDeque2);
                        if (n != null) {
                            java.util.Iterator<? extends N> it2 = this.this$0.successorFunction.successors(n).iterator();
                            if (!it2.hasNext()) {
                                return n;
                            }
                            arrayDeque2.addFirst(it2);
                            arrayDeque.push(n);
                        } else {
                            if (!arrayDeque.isEmpty()) {
                                return (N) arrayDeque.pop();
                            }
                            return endOfData();
                        }
                    }
                }
            };
        }
    }
}
