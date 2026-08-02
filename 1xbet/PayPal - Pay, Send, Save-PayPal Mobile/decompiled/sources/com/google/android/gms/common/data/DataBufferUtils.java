package com.google.android.gms.common.data;

/* loaded from: classes8.dex */
public final class DataBufferUtils {
    public static final java.lang.String KEY_NEXT_PAGE_TOKEN = "next_page_token";
    public static final java.lang.String KEY_PREV_PAGE_TOKEN = "prev_page_token";

    public static <T, E extends com.google.android.gms.common.data.Freezable<T>> java.util.ArrayList<T> freezeAndClose(com.google.android.gms.common.data.DataBuffer<E> dataBuffer) {
        io.reactivex.internal.operators.observable.ObservableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (java.util.ArrayList<T>) new java.util.ArrayList(dataBuffer.getCount());
        try {
            java.util.Iterator<E> it = dataBuffer.iterator();
            while (it.hasNext()) {
                unboundedReplayBuffer.add(it.next().freeze());
            }
            return unboundedReplayBuffer;
        } finally {
            dataBuffer.close();
        }
    }

    public static boolean hasData(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        return dataBuffer != null && dataBuffer.getCount() > 0;
    }

    public static boolean hasNextPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_NEXT_PAGE_TOKEN) == null) ? false : true;
    }

    public static boolean hasPrevPage(com.google.android.gms.common.data.DataBuffer<?> dataBuffer) {
        android.os.Bundle metadata = dataBuffer.getMetadata();
        return (metadata == null || metadata.getString(KEY_PREV_PAGE_TOKEN) == null) ? false : true;
    }

    private DataBufferUtils() {
    }
}
