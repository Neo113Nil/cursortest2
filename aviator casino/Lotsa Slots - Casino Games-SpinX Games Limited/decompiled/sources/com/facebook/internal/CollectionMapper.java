package com.facebook.internal;

/* loaded from: classes2.dex */
public class CollectionMapper {

    public interface Collection<T> {
        java.lang.Object get(T key);

        java.util.Iterator<T> keyIterator();

        void set(T key, java.lang.Object value, com.facebook.internal.CollectionMapper.OnErrorListener onErrorListener);
    }

    public interface OnErrorListener {
        void onError(com.facebook.FacebookException exception);
    }

    public interface OnMapValueCompleteListener extends com.facebook.internal.CollectionMapper.OnErrorListener {
        void onComplete(java.lang.Object mappedValue);
    }

    public interface OnMapperCompleteListener extends com.facebook.internal.CollectionMapper.OnErrorListener {
        void onComplete();
    }

    public interface ValueMapper {
        void mapValue(java.lang.Object value, com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void iterate(final com.facebook.internal.CollectionMapper.Collection<T> collection, com.facebook.internal.CollectionMapper.ValueMapper valueMapper, final com.facebook.internal.CollectionMapper.OnMapperCompleteListener onMapperCompleteListener) {
        final com.facebook.internal.Mutable mutable = new com.facebook.internal.Mutable(false);
        final com.facebook.internal.Mutable mutable2 = new com.facebook.internal.Mutable(1);
        final com.facebook.internal.CollectionMapper.OnMapperCompleteListener onMapperCompleteListener2 = new com.facebook.internal.CollectionMapper.OnMapperCompleteListener() { // from class: com.facebook.internal.CollectionMapper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Integer, java.lang.Object] */
            @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
            public void onComplete() {
                if (((java.lang.Boolean) com.facebook.internal.Mutable.this.value).booleanValue()) {
                    return;
                }
                com.facebook.internal.Mutable mutable3 = mutable2;
                int intValue = ((java.lang.Integer) mutable3.value).intValue() - 1;
                ?? valueOf = java.lang.Integer.valueOf(intValue);
                mutable3.value = valueOf;
                valueOf.getClass();
                if (intValue == 0) {
                    onMapperCompleteListener.onComplete();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Boolean] */
            @Override // com.facebook.internal.CollectionMapper.OnErrorListener
            public void onError(com.facebook.FacebookException exception) {
                if (((java.lang.Boolean) com.facebook.internal.Mutable.this.value).booleanValue()) {
                    return;
                }
                com.facebook.internal.Mutable.this.value = true;
                onMapperCompleteListener.onError(exception);
            }
        };
        java.util.Iterator keyIterator = collection.keyIterator();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (keyIterator.hasNext()) {
            linkedList.add(keyIterator.next());
        }
        for (final java.lang.Object obj : linkedList) {
            java.lang.Object obj2 = collection.get(obj);
            com.facebook.internal.CollectionMapper.OnMapValueCompleteListener onMapValueCompleteListener = new com.facebook.internal.CollectionMapper.OnMapValueCompleteListener() { // from class: com.facebook.internal.CollectionMapper.2
                @Override // com.facebook.internal.CollectionMapper.OnMapValueCompleteListener
                public void onComplete(java.lang.Object mappedValue) {
                    com.facebook.internal.CollectionMapper.Collection.this.set(obj, mappedValue, onMapperCompleteListener2);
                    onMapperCompleteListener2.onComplete();
                }

                @Override // com.facebook.internal.CollectionMapper.OnErrorListener
                public void onError(com.facebook.FacebookException exception) {
                    onMapperCompleteListener2.onError(exception);
                }
            };
            mutable2.value = (T) java.lang.Integer.valueOf(((java.lang.Integer) mutable2.value).intValue() + 1);
            valueMapper.mapValue(obj2, onMapValueCompleteListener);
        }
        onMapperCompleteListener2.onComplete();
    }

    private CollectionMapper() {
    }
}
