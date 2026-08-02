package org.jctools.queues;

/* loaded from: classes18.dex */
public final class IndexedQueueSizeUtil {

    /* loaded from: classes5.dex */
    public interface IndexedQueue {
        int capacity();

        long lvConsumerIndex();

        long lvProducerIndex();
    }

    public static int size(org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue indexedQueue) {
        long lvProducerIndex;
        long lvConsumerIndex;
        long lvConsumerIndex2 = indexedQueue.lvConsumerIndex();
        while (true) {
            lvProducerIndex = indexedQueue.lvProducerIndex();
            lvConsumerIndex = indexedQueue.lvConsumerIndex();
            if (lvConsumerIndex2 == lvConsumerIndex) {
                break;
            }
            lvConsumerIndex2 = lvConsumerIndex;
        }
        long j = lvProducerIndex - lvConsumerIndex;
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j < 0) {
            return 0;
        }
        return (indexedQueue.capacity() == -1 || j <= ((long) indexedQueue.capacity())) ? (int) j : indexedQueue.capacity();
    }

    public static boolean isEmpty(org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue indexedQueue) {
        return indexedQueue.lvConsumerIndex() >= indexedQueue.lvProducerIndex();
    }
}
