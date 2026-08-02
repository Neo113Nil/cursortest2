package com.google.common.collect;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public abstract class TreeTraverser<T> {
    public abstract java.lang.Iterable<T> children(T t);

    @java.lang.Deprecated
    public static <T> com.google.common.collect.TreeTraverser<T> using(final com.google.common.base.Function<T, ? extends java.lang.Iterable<T>> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.TreeTraverser<T>() { // from class: com.google.common.collect.TreeTraverser.1
            @Override // com.google.common.collect.TreeTraverser
            public java.lang.Iterable<T> children(T t) {
                return (java.lang.Iterable) com.google.common.base.Function.this.apply(t);
            }
        };
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> preOrderTraversal(final T t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        return new com.google.common.collect.FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.2
            final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return this.this$0.preOrderIterator(t);
            }
        };
    }

    com.google.common.collect.UnmodifiableIterator<T> preOrderIterator(T t) {
        return new com.google.common.collect.TreeTraverser.PreOrderIterator(t);
    }

    final class PreOrderIterator extends com.google.common.collect.UnmodifiableIterator<T> {
        private final java.util.Deque<java.util.Iterator<T>> stack;

        PreOrderIterator(T t) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            this.stack = arrayDeque;
            arrayDeque.addLast(com.google.common.collect.Iterators.singletonIterator(com.google.common.base.Preconditions.checkNotNull(t)));
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.stack.isEmpty();
        }

        @Override // java.util.Iterator
        public final T next() {
            java.util.Iterator<T> last = this.stack.getLast();
            T t = (T) com.google.common.base.Preconditions.checkNotNull(last.next());
            if (!last.hasNext()) {
                this.stack.removeLast();
            }
            java.util.Iterator<T> it = com.google.common.collect.TreeTraverser.this.children(t).iterator();
            if (it.hasNext()) {
                this.stack.addLast(it);
            }
            return t;
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> postOrderTraversal(final T t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        return new com.google.common.collect.FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.3
            final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return this.this$0.postOrderIterator(t);
            }
        };
    }

    com.google.common.collect.UnmodifiableIterator<T> postOrderIterator(T t) {
        return new com.google.common.collect.TreeTraverser.PostOrderIterator(t);
    }

    static final class PostOrderNode<T> {
        final java.util.Iterator<T> childIterator;
        final T root;

        PostOrderNode(T t, java.util.Iterator<T> it) {
            this.root = (T) com.google.common.base.Preconditions.checkNotNull(t);
            this.childIterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(it);
        }
    }

    final class PostOrderIterator extends com.google.common.collect.AbstractIterator<T> {
        private final java.util.ArrayDeque<com.google.common.collect.TreeTraverser.PostOrderNode<T>> stack;

        PostOrderIterator(T t) {
            java.util.ArrayDeque<com.google.common.collect.TreeTraverser.PostOrderNode<T>> arrayDeque = new java.util.ArrayDeque<>();
            this.stack = arrayDeque;
            arrayDeque.addLast(expand(t));
        }

        @Override // com.google.common.collect.AbstractIterator
        protected final T computeNext() {
            while (!this.stack.isEmpty()) {
                com.google.common.collect.TreeTraverser.PostOrderNode<T> last = this.stack.getLast();
                if (last.childIterator.hasNext()) {
                    this.stack.addLast(expand(last.childIterator.next()));
                } else {
                    this.stack.removeLast();
                    return last.root;
                }
            }
            return endOfData();
        }

        private com.google.common.collect.TreeTraverser.PostOrderNode<T> expand(T t) {
            return new com.google.common.collect.TreeTraverser.PostOrderNode<>(t, com.google.common.collect.TreeTraverser.this.children(t).iterator());
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> breadthFirstTraversal(final T t) {
        com.google.common.base.Preconditions.checkNotNull(t);
        return new com.google.common.collect.FluentIterable<T>(this) { // from class: com.google.common.collect.TreeTraverser.4
            final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public com.google.common.collect.UnmodifiableIterator<T> iterator() {
                return new com.google.common.collect.TreeTraverser.BreadthFirstIterator(t);
            }
        };
    }

    final class BreadthFirstIterator extends com.google.common.collect.UnmodifiableIterator<T> implements com.google.common.collect.PeekingIterator<T> {
        private final java.util.Queue<T> queue;

        BreadthFirstIterator(T t) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            this.queue = arrayDeque;
            arrayDeque.add(t);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // com.google.common.collect.PeekingIterator
        public final T peek() {
            return this.queue.element();
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public final T next() {
            T remove = this.queue.remove();
            com.google.common.collect.Iterables.addAll(this.queue, com.google.common.collect.TreeTraverser.this.children(remove));
            return remove;
        }
    }
}
