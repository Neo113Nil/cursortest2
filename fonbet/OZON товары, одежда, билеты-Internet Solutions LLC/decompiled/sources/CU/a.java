package CU;

import android.view.View;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import xe.H0;
import xe.InterfaceC10753v0;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static int a(View view, String str, View view2, String str2) {
        Intrinsics.checkNotNullParameter(view, str);
        Intrinsics.checkNotNullParameter(view2, str2);
        return view.getId();
    }

    public static /* synthetic */ void b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, H0 h02, Object obj, InterfaceC10753v0 interfaceC10753v0) {
        while (!atomicReferenceFieldUpdater.compareAndSet(h02, obj, interfaceC10753v0) && atomicReferenceFieldUpdater.get(h02) == obj) {
        }
    }
}
