package io.ktor.http.cio;

import com.google.android.material.internal.ViewUtils;
import io.ktor.utils.io.pool.DefaultPool;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: HttpHeadersMap.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0003R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/http/cio/HeadersData;", "", "<init>", "()V", "", "arraysCount", "()I", "subArraysCount", "", "prepare", "(I)V", "index", "at", "(I)I", "value", "set", "(II)V", "Lkotlin/sequences/Sequence;", "headersStarts", "()Lkotlin/sequences/Sequence;", "release", "", "", "arrays", "Ljava/util/List;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class HeadersData {
    private List<int[]> arrays = new ArrayList();

    public final int arraysCount() {
        return this.arrays.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prepare(int subArraysCount) {
        DefaultPool defaultPool;
        for (int i = 0; i < subArraysCount; i++) {
            List<int[]> list = this.arrays;
            defaultPool = HttpHeadersMapKt.IntArrayPool;
            list.add(defaultPool.borrow());
        }
    }

    public final int at(int index) {
        return this.arrays.get(index / ViewUtils.EDGE_TO_EDGE_FLAGS)[index % ViewUtils.EDGE_TO_EDGE_FLAGS];
    }

    public final void set(int index, int value) {
        this.arrays.get(index / ViewUtils.EDGE_TO_EDGE_FLAGS)[index % ViewUtils.EDGE_TO_EDGE_FLAGS] = value;
    }

    public final Sequence<Integer> headersStarts() {
        return SequencesKt.sequence(new HeadersData$headersStarts$1(this, null));
    }

    public final void release() {
        DefaultPool defaultPool;
        for (int[] iArr : this.arrays) {
            defaultPool = HttpHeadersMapKt.IntArrayPool;
            defaultPool.recycle(iArr);
        }
        this.arrays.clear();
    }
}
