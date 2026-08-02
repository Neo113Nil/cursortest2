package Ni;

import android.os.SystemClock;
import android.view.View;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ni.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC3672a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicLong f19590a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f19591b;

    /* JADX WARN: Multi-variable type inference failed */
    ViewOnClickListenerC3672a(AtomicLong atomicLong, Function1 function1) {
        this.f19590a = atomicLong;
        this.f19591b = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.f19590a;
        if (elapsedRealtime - atomicLong.get() < 600) {
            return;
        }
        atomicLong.set(SystemClock.elapsedRealtime());
        this.f19591b.invoke(v11);
    }
}
