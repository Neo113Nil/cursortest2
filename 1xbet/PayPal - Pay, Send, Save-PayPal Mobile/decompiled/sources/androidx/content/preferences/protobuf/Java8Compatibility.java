package androidx.content.preferences.protobuf;

/* loaded from: classes7.dex */
final class Java8Compatibility {
    static void getHighSpeedVideoSizes(java.nio.Buffer buffer) {
        buffer.clear();
    }

    static void getHighSpeedVideoSizes(java.nio.Buffer buffer, int i) {
        buffer.limit(i);
    }

    static void Camera2StreamConfigurationMap(java.nio.Buffer buffer) {
        buffer.mark();
    }

    static void getHighSpeedVideoFpsRanges(java.nio.Buffer buffer, int i) {
        buffer.position(i);
    }

    static void getHighSpeedVideoFpsRangesFor(java.nio.Buffer buffer) {
        buffer.reset();
    }

    private Java8Compatibility() {
    }
}
