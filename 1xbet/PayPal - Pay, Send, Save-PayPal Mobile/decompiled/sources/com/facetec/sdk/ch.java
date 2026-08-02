package com.facetec.sdk;

/* loaded from: classes8.dex */
final class ch {
    private static final java.util.HashMap<java.lang.Integer, java.lang.Object> d = new java.util.HashMap<>();
    private static java.util.Timer e = null;

    ch() {
    }

    static <T> void d(T t, android.os.Parcel parcel) {
        if (t != null) {
            parcel.writeInt(c(t));
        } else {
            parcel.writeInt(0);
        }
    }

    static <T> T e(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != 0) {
            return (T) c(readInt);
        }
        return null;
    }

    private static int c(java.lang.Object obj) {
        final int hashCode;
        synchronized (com.facetec.sdk.ch.class) {
            hashCode = obj.hashCode();
            if (e == null) {
                e = new java.util.Timer();
            }
            e.schedule(new com.facetec.sdk.dg(new java.lang.Runnable() { // from class: com.facetec.sdk.ch$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facetec.sdk.ch.c(hashCode);
                }
            }), 300000L);
            d.put(java.lang.Integer.valueOf(hashCode), obj);
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object c(int i) {
        java.lang.Object remove;
        synchronized (com.facetec.sdk.ch.class) {
            java.util.HashMap<java.lang.Integer, java.lang.Object> hashMap = d;
            remove = hashMap.remove(java.lang.Integer.valueOf(i));
            if (e != null && hashMap.isEmpty()) {
                e.cancel();
                e = null;
            }
        }
        return remove;
    }
}
