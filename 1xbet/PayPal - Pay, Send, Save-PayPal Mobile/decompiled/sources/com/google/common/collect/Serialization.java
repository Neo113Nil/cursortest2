package com.google.common.collect;

/* loaded from: classes9.dex */
final class Serialization {
    private Serialization() {
    }

    static int readCount(java.io.ObjectInputStream objectInputStream) throws java.io.IOException {
        return objectInputStream.readInt();
    }

    static <K, V> void writeMap(java.util.Map<K, V> map, java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(map.size());
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static <K, V> void populateMap(java.util.Map<K, V> map, java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMap(map, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMap(java.util.Map<K, V> map, java.io.ObjectInputStream objectInputStream, int i) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            map.put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    static <E> void writeMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(multiset.entrySet().size());
        for (com.google.common.collect.Multiset.Entry<E> entry : multiset.entrySet()) {
            objectOutputStream.writeObject(entry.getElement());
            objectOutputStream.writeInt(entry.getCount());
        }
    }

    static <E> void populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMultiset(multiset, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream objectInputStream, int i) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            multiset.add(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    static <K, V> void writeMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(multimap.asMap().size());
        for (java.util.Map.Entry<K, java.util.Collection<V>> entry : multimap.asMap().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            java.util.Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static <K, V> void populateMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectInputStream objectInputStream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMultimap(multimap, objectInputStream, objectInputStream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectInputStream objectInputStream, int i) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Collection collection = multimap.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    static <T> com.google.common.collect.Serialization.FieldSetter<T> getFieldSetter(java.lang.Class<T> cls, java.lang.String str) {
        try {
            return new com.google.common.collect.Serialization.FieldSetter<>(cls.getDeclaredField(str));
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    static final class FieldSetter<T> {
        private final java.lang.reflect.Field field;

        private FieldSetter(java.lang.reflect.Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        final void set(T t, java.lang.Object obj) {
            try {
                this.field.set(t, obj);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        final void set(T t, int i) {
            try {
                this.field.set(t, java.lang.Integer.valueOf(i));
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
