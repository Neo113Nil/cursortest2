package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes8.dex */
public interface K0 {

    public interface a {
        default void onCaptureBufferLost(@NonNull b bVar, long j11, int i11) {
        }

        default void onCaptureCompleted(@NonNull b bVar, @NonNull InterfaceC5130z interfaceC5130z) {
        }

        default void onCaptureFailed(@NonNull b bVar, @NonNull r rVar) {
        }

        default void onCaptureProgressed(@NonNull b bVar, @NonNull InterfaceC5130z interfaceC5130z) {
        }

        default void onCaptureSequenceAborted(int i11) {
        }

        default void onCaptureSequenceCompleted(int i11, long j11) {
        }

        default void onCaptureStarted(@NonNull b bVar, long j11, long j12) {
        }
    }

    public interface b {
        @NonNull
        T getParameters();

        @NonNull
        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }
}
