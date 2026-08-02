package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ForwardingQueue<E> extends com.google.common.collect.ForwardingCollection<E> implements java.util.Queue<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.Queue<E> delegate();

    public boolean offer(E e) {
        return delegate().offer(e);
    }

    @Override // java.util.Queue
    public E poll() {
        return delegate().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return delegate().remove();
    }

    @Override // java.util.Queue
    public E peek() {
        return delegate().peek();
    }

    @Override // java.util.Queue
    public E element() {
        return delegate().element();
    }

    protected boolean standardOffer(E e) {
        try {
            return add(e);
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    protected E standardPeek() {
        try {
            return element();
        } catch (java.util.NoSuchElementException unused) {
            return null;
        }
    }

    protected E standardPoll() {
        try {
            return remove();
        } catch (java.util.NoSuchElementException unused) {
            return null;
        }
    }
}
