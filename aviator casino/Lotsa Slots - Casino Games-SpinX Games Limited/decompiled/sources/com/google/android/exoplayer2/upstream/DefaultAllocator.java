package com.google.android.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class DefaultAllocator implements com.google.android.exoplayer2.upstream.Allocator {
    private static final int AVAILABLE_EXTRA_CAPACITY = 100;
    private int allocatedCount;
    private com.google.android.exoplayer2.upstream.Allocation[] availableAllocations;
    private int availableCount;
    private final int individualAllocationSize;
    private final byte[] initialAllocationBlock;
    private int targetBufferSize;
    private final boolean trimOnReset;

    public DefaultAllocator(boolean z, int i) {
        this(z, i, 0);
    }

    public DefaultAllocator(boolean z, int i, int i2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > 0);
        com.google.android.exoplayer2.util.Assertions.checkArgument(i2 >= 0);
        this.trimOnReset = z;
        this.individualAllocationSize = i;
        this.availableCount = i2;
        this.availableAllocations = new com.google.android.exoplayer2.upstream.Allocation[i2 + 100];
        if (i2 > 0) {
            this.initialAllocationBlock = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.availableAllocations[i3] = new com.google.android.exoplayer2.upstream.Allocation(this.initialAllocationBlock, i3 * i);
            }
            return;
        }
        this.initialAllocationBlock = null;
    }

    public synchronized void reset() {
        if (this.trimOnReset) {
            setTargetBufferSize(0);
        }
    }

    public synchronized void setTargetBufferSize(int i) {
        boolean z = i < this.targetBufferSize;
        this.targetBufferSize = i;
        if (z) {
            trim();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized com.google.android.exoplayer2.upstream.Allocation allocate() {
        com.google.android.exoplayer2.upstream.Allocation allocation;
        this.allocatedCount++;
        int i = this.availableCount;
        if (i > 0) {
            com.google.android.exoplayer2.upstream.Allocation[] allocationArr = this.availableAllocations;
            int i2 = i - 1;
            this.availableCount = i2;
            allocation = (com.google.android.exoplayer2.upstream.Allocation) com.google.android.exoplayer2.util.Assertions.checkNotNull(allocationArr[i2]);
            this.availableAllocations[this.availableCount] = null;
        } else {
            allocation = new com.google.android.exoplayer2.upstream.Allocation(new byte[this.individualAllocationSize], 0);
            int i3 = this.allocatedCount;
            com.google.android.exoplayer2.upstream.Allocation[] allocationArr2 = this.availableAllocations;
            if (i3 > allocationArr2.length) {
                this.availableAllocations = (com.google.android.exoplayer2.upstream.Allocation[]) java.util.Arrays.copyOf(allocationArr2, allocationArr2.length * 2);
            }
        }
        return allocation;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(com.google.android.exoplayer2.upstream.Allocation allocation) {
        com.google.android.exoplayer2.upstream.Allocation[] allocationArr = this.availableAllocations;
        int i = this.availableCount;
        this.availableCount = i + 1;
        allocationArr[i] = allocation;
        this.allocatedCount--;
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void release(com.google.android.exoplayer2.upstream.Allocator.AllocationNode allocationNode) {
        while (allocationNode != null) {
            com.google.android.exoplayer2.upstream.Allocation[] allocationArr = this.availableAllocations;
            int i = this.availableCount;
            this.availableCount = i + 1;
            allocationArr[i] = allocationNode.getAllocation();
            this.allocatedCount--;
            allocationNode = allocationNode.next();
        }
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized void trim() {
        int i = 0;
        int max = java.lang.Math.max(0, com.google.android.exoplayer2.util.Util.ceilDivide(this.targetBufferSize, this.individualAllocationSize) - this.allocatedCount);
        int i2 = this.availableCount;
        if (max >= i2) {
            return;
        }
        if (this.initialAllocationBlock != null) {
            int i3 = i2 - 1;
            while (i <= i3) {
                com.google.android.exoplayer2.upstream.Allocation allocation = (com.google.android.exoplayer2.upstream.Allocation) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.availableAllocations[i]);
                if (allocation.data == this.initialAllocationBlock) {
                    i++;
                } else {
                    com.google.android.exoplayer2.upstream.Allocation allocation2 = (com.google.android.exoplayer2.upstream.Allocation) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.availableAllocations[i3]);
                    if (allocation2.data != this.initialAllocationBlock) {
                        i3--;
                    } else {
                        com.google.android.exoplayer2.upstream.Allocation[] allocationArr = this.availableAllocations;
                        allocationArr[i] = allocation2;
                        allocationArr[i3] = allocation;
                        i3--;
                        i++;
                    }
                }
            }
            max = java.lang.Math.max(max, i);
            if (max >= this.availableCount) {
                return;
            }
        }
        java.util.Arrays.fill(this.availableAllocations, max, this.availableCount, (java.lang.Object) null);
        this.availableCount = max;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public synchronized int getTotalBytesAllocated() {
        return this.allocatedCount * this.individualAllocationSize;
    }

    @Override // com.google.android.exoplayer2.upstream.Allocator
    public int getIndividualAllocationLength() {
        return this.individualAllocationSize;
    }
}
