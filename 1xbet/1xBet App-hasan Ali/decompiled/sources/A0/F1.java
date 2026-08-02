package A0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class F1 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r4.c f270a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(r4.c cVar, Handler handler) {
        super(handler);
        this.f270a = cVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        this.f270a.q(W3.o.f6046a);
    }
}
