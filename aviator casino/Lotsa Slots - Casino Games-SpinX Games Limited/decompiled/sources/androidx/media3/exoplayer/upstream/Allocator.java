package androidx.media3.exoplayer.upstream;

/* loaded from: classes2.dex */
public interface Allocator {

    public interface AllocationNode {
        androidx.media3.exoplayer.upstream.Allocation getAllocation();

        androidx.media3.exoplayer.upstream.Allocator.AllocationNode next();
    }

    androidx.media3.exoplayer.upstream.Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(androidx.media3.exoplayer.upstream.Allocation allocation);

    void release(androidx.media3.exoplayer.upstream.Allocator.AllocationNode allocationNode);

    void trim();
}
