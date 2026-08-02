package Mj0;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class i implements C8588a.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f18156a;

    public final void a(boolean z11) {
        this.f18156a = z11;
    }

    @Override // nf.C8588a.b
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (this.f18156a) {
            Log.i("OzonTracker", message);
        }
    }
}
