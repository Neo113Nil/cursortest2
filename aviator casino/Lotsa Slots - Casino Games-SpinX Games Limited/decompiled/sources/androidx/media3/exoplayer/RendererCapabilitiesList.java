package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
public interface RendererCapabilitiesList {

    public interface Factory {
        androidx.media3.exoplayer.RendererCapabilitiesList createRendererCapabilitiesList();
    }

    androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
