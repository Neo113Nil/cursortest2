package androidx.media3.exoplayer.source;

/* loaded from: classes2.dex */
public interface CompositeSequenceableLoaderFactory {
    androidx.media3.exoplayer.source.SequenceableLoader create(java.util.List<? extends androidx.media3.exoplayer.source.SequenceableLoader> list, java.util.List<java.util.List<java.lang.Integer>> list2);

    @java.lang.Deprecated
    androidx.media3.exoplayer.source.SequenceableLoader createCompositeSequenceableLoader(androidx.media3.exoplayer.source.SequenceableLoader... sequenceableLoaderArr);

    androidx.media3.exoplayer.source.SequenceableLoader empty();
}
