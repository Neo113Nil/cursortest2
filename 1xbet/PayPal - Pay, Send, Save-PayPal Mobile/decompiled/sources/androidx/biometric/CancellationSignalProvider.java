package androidx.biometric;

/* loaded from: classes3.dex */
class CancellationSignalProvider {
    final androidx.biometric.CancellationSignalProvider.Injector getHighResolutionOutputSizeshNQ4ISI = new androidx.biometric.CancellationSignalProvider.Injector() { // from class: androidx.biometric.CancellationSignalProvider.1
        @Override // androidx.biometric.CancellationSignalProvider.Injector
        public final android.os.CancellationSignal getHighSpeedVideoSizes() {
            return androidx.biometric.CancellationSignalProvider.Api16Impl.getHighSpeedVideoFpsRanges();
        }

        @Override // androidx.biometric.CancellationSignalProvider.Injector
        public final androidx.core.os.CancellationSignal getHighSpeedVideoFpsRangesFor() {
            return new androidx.core.os.CancellationSignal();
        }
    };
    androidx.core.os.CancellationSignal getHighSpeedVideoFpsRangesFor;
    android.os.CancellationSignal getHighSpeedVideoSizes;

    interface Injector {
        androidx.core.os.CancellationSignal getHighSpeedVideoFpsRangesFor();

        android.os.CancellationSignal getHighSpeedVideoSizes();
    }

    CancellationSignalProvider() {
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static android.os.CancellationSignal getHighSpeedVideoFpsRanges() {
            return new android.os.CancellationSignal();
        }

        static void getHighSpeedVideoSizes(android.os.CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }
    }
}
