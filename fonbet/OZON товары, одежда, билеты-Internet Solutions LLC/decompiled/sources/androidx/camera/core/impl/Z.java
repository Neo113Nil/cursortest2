package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes8.dex */
final class Z implements I.c<List<Surface>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b.a f38242a;

    Z(b.a aVar) {
        this.f38242a = aVar;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
        boolean z11 = th2 instanceof TimeoutException;
        b.a aVar = this.f38242a;
        if (z11) {
            aVar.e(th2);
        } else {
            aVar.c(Collections.EMPTY_LIST);
        }
    }

    @Override // I.c
    public final void onSuccess(List<Surface> list) {
        List<Surface> list2 = list;
        list2.getClass();
        this.f38242a.c(new ArrayList(list2));
    }
}
