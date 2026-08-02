package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public interface Operation<I, O> {
    O apply(I i) throws androidx.camera.core.ImageCaptureException;
}
