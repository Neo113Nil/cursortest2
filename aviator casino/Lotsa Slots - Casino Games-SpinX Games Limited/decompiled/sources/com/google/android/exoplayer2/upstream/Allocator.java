package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public interface Allocator {

    public interface AllocationNode {
        com.google.android.exoplayer2.upstream.Allocation getAllocation();

        com.google.android.exoplayer2.upstream.Allocator.AllocationNode next();
    }

    com.google.android.exoplayer2.upstream.Allocation allocate();

    int getIndividualAllocationLength();

    int getTotalBytesAllocated();

    void release(com.google.android.exoplayer2.upstream.Allocation allocation);

    void release(com.google.android.exoplayer2.upstream.Allocator.AllocationNode allocationNode);

    void trim();
}
