package org.modelmapper.internal.bytebuddy.matcher;

import ads_mobile_sdk.a03;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.bytebuddy.matcher.FilterableList;

/* loaded from: classes4.dex */
public interface FilterableList<T, S extends FilterableList<T, S>> extends List<T> {
    S filter(ElementMatcher<? super T> elementMatcher);

    T getOnly();

    @Override // java.util.List
    S subList(int i, int i2);

    public static class Empty<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            return this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            throw new IndexOutOfBoundsException("index = " + i);
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList
        public T getOnly() {
            throw new IllegalStateException("size = 0");
        }

        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            if (i == i2 && i2 == 0) {
                return this;
            }
            if (i > i2) {
                throw new IllegalArgumentException("fromIndex(" + i + ") > toIndex(" + i2 + ")");
            }
            throw new IndexOutOfBoundsException("fromIndex = " + i);
        }
    }

    public static abstract class AbstractBase<T, S extends FilterableList<T, S>> extends AbstractList<T> implements FilterableList<T, S> {
        private static final int ONLY = 0;

        protected abstract S wrap(List<T> list);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList
        public S filter(ElementMatcher<? super T> elementMatcher) {
            List<T> arrayList = new ArrayList<>(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                a03 a03Var = (Object) it.next();
                if (elementMatcher.matches(a03Var)) {
                    arrayList.add(a03Var);
                }
            }
            return arrayList.size() == size() ? this : wrap(arrayList);
        }

        @Override // org.modelmapper.internal.bytebuddy.matcher.FilterableList
        public T getOnly() {
            if (size() != 1) {
                throw new IllegalStateException("size = " + size());
            }
            return get(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public S subList(int i, int i2) {
            return wrap(super.subList(i, i2));
        }
    }
}
