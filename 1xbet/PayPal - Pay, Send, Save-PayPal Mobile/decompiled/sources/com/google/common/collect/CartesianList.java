package com.google.common.collect;

/* loaded from: classes9.dex */
final class CartesianList<E> extends java.util.AbstractList<java.util.List<E>> implements java.util.RandomAccess {
    private final transient com.google.common.collect.ImmutableList<java.util.List<E>> axes;
    private final transient int[] axesSizeProduct;

    static <E> java.util.List<java.util.List<E>> create(java.util.List<? extends java.util.List<? extends E>> list) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(list.size());
        java.util.Iterator<? extends java.util.List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            com.google.common.collect.ImmutableList copyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) it.next());
            if (copyOf.isEmpty()) {
                return com.google.common.collect.ImmutableList.of();
            }
            builder.add((com.google.common.collect.ImmutableList.Builder) copyOf);
        }
        return new com.google.common.collect.CartesianList(builder.build());
    }

    CartesianList(com.google.common.collect.ImmutableList<java.util.List<E>> immutableList) {
        this.axes = immutableList;
        int[] iArr = new int[immutableList.size() + 1];
        iArr[immutableList.size()] = 1;
        try {
            for (int size = immutableList.size() - 1; size >= 0; size--) {
                iArr[size] = java.lang.Math.multiplyExact(iArr[size + 1], immutableList.get(size).size());
            }
            this.axesSizeProduct = iArr;
        } catch (java.lang.ArithmeticException unused) {
            throw new java.lang.IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAxisIndexForProductIndex(int i, int i2) {
        return (i / this.axesSizeProduct[i2 + 1]) % this.axes.get(i2).size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.util.List)) {
            return -1;
        }
        java.util.List list = (java.util.List) obj;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        java.util.ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int indexOf = this.axes.get(nextIndex).indexOf(listIterator.next());
            if (indexOf == -1) {
                return -1;
            }
            i += indexOf * this.axesSizeProduct[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.util.List)) {
            return -1;
        }
        java.util.List list = (java.util.List) obj;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        java.util.ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int lastIndexOf = this.axes.get(nextIndex).lastIndexOf(listIterator.next());
            if (lastIndexOf == -1) {
                return -1;
            }
            i += lastIndexOf * this.axesSizeProduct[nextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final com.google.common.collect.ImmutableList<E> get(final int i) {
        com.google.common.base.Preconditions.checkElementIndex(i, size());
        return new com.google.common.collect.ImmutableList<E>(this) { // from class: com.google.common.collect.CartesianList.1
            final /* synthetic */ com.google.common.collect.CartesianList this$0;

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            {
                this.this$0 = this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.this$0.axes.size();
            }

            @Override // java.util.List
            public E get(int i2) {
                com.google.common.base.Preconditions.checkElementIndex(i2, size());
                return (E) ((java.util.List) this.this$0.axes.get(i2)).get(this.this$0.getAxisIndexForProductIndex(i, i2));
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.axesSizeProduct[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) obj;
        if (list.size() != this.axes.size()) {
            return false;
        }
        java.util.Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.axes.get(i).contains(it.next())) {
                return false;
            }
            i++;
        }
        return true;
    }
}
