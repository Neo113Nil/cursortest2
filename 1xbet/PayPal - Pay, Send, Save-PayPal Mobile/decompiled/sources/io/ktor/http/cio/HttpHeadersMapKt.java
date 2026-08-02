package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "indent", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "out", "", "dumpTo", "(Lio/ktor/http/cio/HttpHeadersMap;Ljava/lang/String;Ljava/lang/Appendable;)V", "Lio/ktor/utils/io/pool/DefaultPool;", "", "getHighResolutionOutputSizeshNQ4ISI", "Lio/ktor/utils/io/pool/DefaultPool;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/http/cio/HeadersData;", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpHeadersMapKt {
    private static final io.ktor.utils.io.pool.DefaultPool<int[]> getHighResolutionOutputSizeshNQ4ISI = new io.ktor.utils.io.pool.DefaultPool<int[]>() { // from class: io.ktor.http.cio.HttpHeadersMapKt$IntArrayPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final int[] produceInstance() {
            int[] iArr = new int[com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS];
            for (int i = 0; i < 768; i++) {
                iArr[i] = -1;
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final int[] clearInstance(int[] instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
            kotlin.collections.ArraysKt.fill$default(instance, -1, 0, 0, 6, (java.lang.Object) null);
            return (int[]) super.clearInstance((io.ktor.http.cio.HttpHeadersMapKt$IntArrayPool$1) instance);
        }
    };
    private static final io.ktor.utils.io.pool.DefaultPool<io.ktor.http.cio.HeadersData> getHighSpeedVideoSizes = new io.ktor.utils.io.pool.DefaultPool<io.ktor.http.cio.HeadersData>() { // from class: io.ktor.http.cio.HttpHeadersMapKt$HeadersDataPool$1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final io.ktor.http.cio.HeadersData produceInstance() {
            return new io.ktor.http.cio.HeadersData();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.ktor.utils.io.pool.DefaultPool
        public final io.ktor.http.cio.HeadersData clearInstance(io.ktor.http.cio.HeadersData instance) {
            io.ktor.utils.io.pool.DefaultPool defaultPool;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "");
            for (int[] iArr : instance.getHighResolutionOutputSizeshNQ4ISI) {
                defaultPool = io.ktor.http.cio.HttpHeadersMapKt.getHighResolutionOutputSizeshNQ4ISI;
                defaultPool.recycle(iArr);
            }
            instance.getHighResolutionOutputSizeshNQ4ISI.clear();
            return (io.ktor.http.cio.HeadersData) super.clearInstance((io.ktor.http.cio.HttpHeadersMapKt$HeadersDataPool$1) instance);
        }
    };

    public static final void dumpTo(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, java.lang.String str, java.lang.Appendable appendable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpHeadersMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "");
        java.util.Iterator<java.lang.Integer> it = httpHeadersMap.offsets().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            appendable.append(str);
            appendable.append(httpHeadersMap.nameAtOffset(intValue));
            appendable.append(" => ");
            appendable.append(httpHeadersMap.valueAtOffset(intValue));
            appendable.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
    }
}
