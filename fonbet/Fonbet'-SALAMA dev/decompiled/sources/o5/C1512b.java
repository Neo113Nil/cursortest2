package o5;

import A5.p;
import A5.u;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1512b implements u {

    /* renamed from: a, reason: collision with root package name */
    public p f15614a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f15615b;

    public final boolean a(p pVar) {
        AtomicBoolean atomicBoolean = this.f15615b;
        if (!atomicBoolean.compareAndSet(true, false)) {
            pVar.error("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
            return false;
        }
        SharePlusPendingIntent.f12492a = "";
        atomicBoolean.set(false);
        this.f15614a = pVar;
        return true;
    }

    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        p pVar;
        if (i7 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f12492a;
        if (this.f15615b.compareAndSet(false, true) && (pVar = this.f15614a) != null) {
            pVar.success(str);
            this.f15614a = null;
        }
        return true;
    }
}
