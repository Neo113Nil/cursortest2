package com.google.firebase.messaging;

/* loaded from: classes9.dex */
final class TopicsStore {
    private static final java.lang.String DIVIDER_QUEUE_OPERATIONS = ",";
    static final java.lang.String KEY_TOPIC_OPERATIONS_QUEUE = "topic_operation_queue";
    static final java.lang.String PREFERENCES = "com.google.android.gms.appid";
    private static java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> topicsStoreWeakReference;
    private final android.content.SharedPreferences sharedPreferences;
    private final java.util.concurrent.Executor syncExecutor;
    private com.google.firebase.messaging.SharedPreferencesQueue topicOperationsQueue;

    private TopicsStore(android.content.SharedPreferences sharedPreferences, java.util.concurrent.Executor executor) {
        this.syncExecutor = executor;
        this.sharedPreferences = sharedPreferences;
    }

    private void initStore() {
        synchronized (this) {
            this.topicOperationsQueue = com.google.firebase.messaging.SharedPreferencesQueue.createInstance(this.sharedPreferences, KEY_TOPIC_OPERATIONS_QUEUE, DIVIDER_QUEUE_OPERATIONS, this.syncExecutor);
        }
    }

    public static com.google.firebase.messaging.TopicsStore getInstance(android.content.Context context, java.util.concurrent.Executor executor) {
        com.google.firebase.messaging.TopicsStore topicsStore;
        synchronized (com.google.firebase.messaging.TopicsStore.class) {
            java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> weakReference = topicsStoreWeakReference;
            topicsStore = weakReference != null ? weakReference.get() : null;
            if (topicsStore == null) {
                topicsStore = new com.google.firebase.messaging.TopicsStore(context.getSharedPreferences(PREFERENCES, 0), executor);
                topicsStore.initStore();
                topicsStoreWeakReference = new java.lang.ref.WeakReference<>(topicsStore);
            }
        }
        return topicsStore;
    }

    static void clearCaches() {
        synchronized (com.google.firebase.messaging.TopicsStore.class) {
            java.lang.ref.WeakReference<com.google.firebase.messaging.TopicsStore> weakReference = topicsStoreWeakReference;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    final com.google.firebase.messaging.TopicOperation getNextTopicOperation() {
        com.google.firebase.messaging.TopicOperation from;
        synchronized (this) {
            from = com.google.firebase.messaging.TopicOperation.from(this.topicOperationsQueue.peek());
        }
        return from;
    }

    final boolean addTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        boolean add;
        synchronized (this) {
            add = this.topicOperationsQueue.add(topicOperation.serialize());
        }
        return add;
    }

    final boolean removeTopicOperation(com.google.firebase.messaging.TopicOperation topicOperation) {
        boolean remove;
        synchronized (this) {
            remove = this.topicOperationsQueue.remove(topicOperation.serialize());
        }
        return remove;
    }

    final com.google.firebase.messaging.TopicOperation pollTopicOperation() {
        com.google.firebase.messaging.TopicOperation from;
        synchronized (this) {
            try {
                from = com.google.firebase.messaging.TopicOperation.from(this.topicOperationsQueue.remove());
            } catch (java.util.NoSuchElementException unused) {
                return null;
            }
        }
        return from;
    }

    final java.util.List<com.google.firebase.messaging.TopicOperation> getOperations() {
        java.util.ArrayList arrayList;
        synchronized (this) {
            java.util.List<java.lang.String> list = this.topicOperationsQueue.toList();
            arrayList = new java.util.ArrayList(list.size());
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.google.firebase.messaging.TopicOperation.from(it.next()));
            }
        }
        return arrayList;
    }

    final void clearTopicOperations() {
        synchronized (this) {
            this.topicOperationsQueue.clear();
        }
    }
}
