package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;
import ze.C11115c;

/* loaded from: classes.dex */
public final class q2 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C11115c f41004a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q2(C11115c c11115c, Handler handler) {
        super(handler);
        this.f41004a = c11115c;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z11, Uri uri) {
        this.f41004a.b(Unit.f71690a);
    }
}
