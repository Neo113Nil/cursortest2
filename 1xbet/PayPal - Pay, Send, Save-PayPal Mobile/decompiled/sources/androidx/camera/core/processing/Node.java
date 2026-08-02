package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public interface Node<I, O> {
    void release();

    O transform(I i);
}
