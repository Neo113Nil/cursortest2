package Je;

import De.C2857A;
import De.x;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class l extends x<l> {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f14651e;

    public l(long j11, l lVar, int i11) {
        super(j11, lVar, i11);
        int i12;
        i12 = k.f14649f;
        this.f14651e = new AtomicReferenceArray(i12);
    }

    @Override // De.x
    public final int k() {
        int i11;
        i11 = k.f14649f;
        return i11;
    }

    @Override // De.x
    public final void l(int i11, @NotNull CoroutineContext coroutineContext) {
        C2857A c2857a;
        c2857a = k.f14648e;
        this.f14651e.set(i11, c2857a);
        m();
    }

    public final /* synthetic */ AtomicReferenceArray o() {
        return this.f14651e;
    }

    @NotNull
    public final String toString() {
        return "SemaphoreSegment[id=" + this.f6654c + ", hashCode=" + hashCode() + ']';
    }
}
