package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class ScoreBuffer<T> {
    private final java.util.PriorityQueue Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;

    static class b implements java.lang.Comparable {
        public final long Camera2StreamConfigurationMap;
        public final java.lang.Object getHighSpeedVideoFpsRanges;
        public final java.lang.String getHighSpeedVideoFpsRangesFor;
        public final float getHighSpeedVideoSizes;

        public b(java.lang.Object obj, float f, long j, java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = obj;
            this.getHighSpeedVideoSizes = f;
            this.Camera2StreamConfigurationMap = j;
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // java.lang.Comparable
        public /* synthetic */ int compareTo(java.lang.Object obj) {
            return java.lang.Float.compare(this.getHighSpeedVideoSizes, ((com.daon.sdk.face.ScoreBuffer.b) obj).getHighSpeedVideoSizes);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{ score=");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(", milliseconds=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", metadata='");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append("'}");
            return sb.toString();
        }
    }

    class c implements java.util.Comparator {
        private c() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Float.compare(((com.daon.sdk.face.ScoreBuffer.b) obj).getHighSpeedVideoSizes, ((com.daon.sdk.face.ScoreBuffer.b) obj2).getHighSpeedVideoSizes);
        }

        /* synthetic */ c(com.daon.sdk.face.ScoreBuffer scoreBuffer, byte b) {
            this();
        }
    }

    class d implements java.util.Comparator {
        private d() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
            return java.lang.Long.compare(((com.daon.sdk.face.ScoreBuffer.b) obj).Camera2StreamConfigurationMap, ((com.daon.sdk.face.ScoreBuffer.b) obj2).Camera2StreamConfigurationMap);
        }

        /* synthetic */ d(com.daon.sdk.face.ScoreBuffer scoreBuffer, byte b) {
            this();
        }
    }

    public ScoreBuffer(int i, long j) {
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = j;
        byte b2 = 0;
        if (j > 0) {
            this.Camera2StreamConfigurationMap = new java.util.PriorityQueue(i, new com.daon.sdk.face.ScoreBuffer.d(this, b2));
        } else {
            this.Camera2StreamConfigurationMap = new java.util.PriorityQueue(i, new com.daon.sdk.face.ScoreBuffer.c(this, b2));
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getHighSpeedVideoFpsRanges <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            com.daon.sdk.face.ScoreBuffer.b bVar = (com.daon.sdk.face.ScoreBuffer.b) it.next();
            if (currentTimeMillis - bVar.Camera2StreamConfigurationMap >= this.getHighSpeedVideoFpsRanges) {
                arrayList.add(bVar);
            }
        }
        this.Camera2StreamConfigurationMap.removeAll(arrayList);
    }

    public void add(T t, float f) {
        synchronized (this) {
            add(t, f, null);
        }
    }

    public void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }

    public float getAverage() {
        float f;
        synchronized (this) {
            f = 0.0f;
            if (this.Camera2StreamConfigurationMap.size() >= this.getHighSpeedVideoSizes) {
                java.util.Iterator it = this.Camera2StreamConfigurationMap.iterator();
                while (it.hasNext()) {
                    f += ((com.daon.sdk.face.ScoreBuffer.b) it.next()).getHighSpeedVideoSizes;
                }
                f /= this.Camera2StreamConfigurationMap.size();
                this.Camera2StreamConfigurationMap.clear();
            }
        }
        return f;
    }

    public T getBest() {
        T best;
        synchronized (this) {
            best = getBest(true);
        }
        return best;
    }

    public T getLatest() {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI();
            try {
                if (this.Camera2StreamConfigurationMap.size() > 0) {
                    return (T) ((com.daon.sdk.face.ScoreBuffer.b) java.util.Collections.max(this.Camera2StreamConfigurationMap, new com.daon.sdk.face.ScoreBuffer.d(this, (byte) 0))).getHighSpeedVideoFpsRanges;
                }
            } catch (java.lang.Exception unused) {
            }
            return null;
        }
    }

    public int size() {
        int size;
        synchronized (this) {
            size = this.Camera2StreamConfigurationMap.size();
        }
        return size;
    }

    public void add(T t, float f, java.lang.String str) {
        synchronized (this) {
            if (f == 0.0f) {
                return;
            }
            this.Camera2StreamConfigurationMap.add(new com.daon.sdk.face.ScoreBuffer.b(t, f, java.lang.System.currentTimeMillis(), str));
            if (this.Camera2StreamConfigurationMap.size() > this.getHighSpeedVideoSizes) {
                try {
                    this.Camera2StreamConfigurationMap.remove((com.daon.sdk.face.ScoreBuffer.b) java.util.Collections.min(this.Camera2StreamConfigurationMap));
                } catch (java.lang.Exception unused) {
                    this.Camera2StreamConfigurationMap.poll();
                }
            }
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public T getBest(boolean z) {
        synchronized (this) {
            getHighResolutionOutputSizeshNQ4ISI();
            try {
                if (this.Camera2StreamConfigurationMap.size() > 0) {
                    com.daon.sdk.face.ScoreBuffer.b bVar = (com.daon.sdk.face.ScoreBuffer.b) java.util.Collections.max(this.Camera2StreamConfigurationMap);
                    if (z) {
                        this.Camera2StreamConfigurationMap.clear();
                    }
                    return (T) bVar.getHighSpeedVideoFpsRanges;
                }
            } catch (java.lang.Exception unused) {
            }
            return null;
        }
    }
}
