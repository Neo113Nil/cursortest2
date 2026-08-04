package p107o5;

import A5.p;
import A5.u;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f15620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicBoolean f15621b;

    public final boolean a(p pVar) {
        AtomicBoolean atomicBoolean = this.f15621b;
        if (!atomicBoolean.compareAndSet(true, false)) {
            pVar.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        SharePlusPendingIntent.f12498a = "";
        atomicBoolean.set(false);
        this.f15620a = pVar;
        return true;
    }

    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        p pVar;
        if (i7 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f12498a;
        if (this.f15621b.compareAndSet(false, true) && (pVar = this.f15620a) != null) {
            pVar.success(str);
            this.f15620a = null;
        }
        return true;
    }
}
