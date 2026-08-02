package androidx.constraintlayout.core;

/* loaded from: classes6.dex */
final class Pools {

    interface Pool<T> {
        T getHighResolutionOutputSizeshNQ4ISI();

        void getHighSpeedVideoSizes(T[] tArr, int i);

        boolean getHighSpeedVideoSizes(T t);
    }

    private Pools() {
    }

    static class SimplePool<T> implements androidx.constraintlayout.core.Pools.Pool<T> {
        private final java.lang.Object[] Camera2StreamConfigurationMap = new java.lang.Object[256];
        private int getHighSpeedVideoSizes;

        SimplePool() {
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public final T getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getHighSpeedVideoSizes;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.getHighSpeedVideoSizes = i2;
            return t;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public final boolean getHighSpeedVideoSizes(T t) {
            int i = this.getHighSpeedVideoSizes;
            java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.getHighSpeedVideoSizes = i + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public final void getHighSpeedVideoSizes(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.getHighSpeedVideoSizes;
                java.lang.Object[] objArr = this.Camera2StreamConfigurationMap;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.getHighSpeedVideoSizes = i3 + 1;
                }
            }
        }
    }
}
