package F3;

import com.google.common.collect.AbstractC5880y;
import java.util.List;

/* renamed from: F3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3003h implements V {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5880y<a> f8684a;

    /* renamed from: b, reason: collision with root package name */
    private long f8685b;

    /* renamed from: F3.h$a */
    private static final class a implements V {

        /* renamed from: a, reason: collision with root package name */
        private final V f8686a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5880y<Integer> f8687b;

        public a(V v11, List<Integer> list) {
            this.f8686a = v11;
            this.f8687b = AbstractC5880y.n(list);
        }

        public final AbstractC5880y<Integer> a() {
            return this.f8687b;
        }

        @Override // F3.V
        public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
            return this.f8686a.continueLoading(m11);
        }

        @Override // F3.V
        public final long getBufferedPositionUs() {
            return this.f8686a.getBufferedPositionUs();
        }

        @Override // F3.V
        public final long getNextLoadPositionUs() {
            return this.f8686a.getNextLoadPositionUs();
        }

        @Override // F3.V
        public final boolean isLoading() {
            return this.f8686a.isLoading();
        }

        @Override // F3.V
        public final void reevaluateBuffer(long j11) {
            this.f8686a.reevaluateBuffer(j11);
        }
    }

    public C3003h(List<? extends V> list, List<List<Integer>> list2) {
        int i11 = AbstractC5880y.f59142c;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        G10.a.c(list.size() == list2.size());
        for (int i12 = 0; i12 < list.size(); i12++) {
            aVar.e(new a(list.get(i12), list2.get(i12)));
        }
        this.f8684a = aVar.j();
        this.f8685b = -9223372036854775807L;
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        boolean z11;
        boolean z12 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z12;
            }
            int i11 = 0;
            z11 = false;
            while (true) {
                AbstractC5880y<a> abstractC5880y = this.f8684a;
                if (i11 >= abstractC5880y.size()) {
                    break;
                }
                long nextLoadPositionUs2 = abstractC5880y.get(i11).getNextLoadPositionUs();
                boolean z13 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= m11.f43657a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z13) {
                    z11 |= abstractC5880y.get(i11).continueLoading(m11);
                }
                i11++;
            }
            z12 |= z11;
        } while (z11);
        return z12;
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        int i11 = 0;
        long j11 = Long.MAX_VALUE;
        long j12 = Long.MAX_VALUE;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f8684a;
            if (i11 >= abstractC5880y.size()) {
                break;
            }
            a aVar = abstractC5880y.get(i11);
            long bufferedPositionUs = aVar.getBufferedPositionUs();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j11 = Math.min(j11, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j12 = Math.min(j12, bufferedPositionUs);
            }
            i11++;
        }
        if (j11 != Long.MAX_VALUE) {
            this.f8685b = j11;
            return j11;
        }
        if (j12 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j13 = this.f8685b;
        return j13 != -9223372036854775807L ? j13 : j12;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        int i11 = 0;
        long j11 = Long.MAX_VALUE;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f8684a;
            if (i11 >= abstractC5880y.size()) {
                break;
            }
            long nextLoadPositionUs = abstractC5880y.get(i11).getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j11 = Math.min(j11, nextLoadPositionUs);
            }
            i11++;
        }
        if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j11;
    }

    @Override // F3.V
    public final boolean isLoading() {
        int i11 = 0;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f8684a;
            if (i11 >= abstractC5880y.size()) {
                return false;
            }
            if (abstractC5880y.get(i11).isLoading()) {
                return true;
            }
            i11++;
        }
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        int i11 = 0;
        while (true) {
            AbstractC5880y<a> abstractC5880y = this.f8684a;
            if (i11 >= abstractC5880y.size()) {
                return;
            }
            abstractC5880y.get(i11).reevaluateBuffer(j11);
            i11++;
        }
    }
}
