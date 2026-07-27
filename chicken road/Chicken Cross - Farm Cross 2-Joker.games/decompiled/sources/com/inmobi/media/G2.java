package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes6.dex */
public abstract class G2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6571a;

    public G2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6571a = context;
    }

    public abstract Object a(FrameLayout frameLayout, C3849kd c3849kd);

    public abstract Object a(ContinuationImpl continuationImpl);

    public abstract void a();

    public abstract void a(MutableStateFlow mutableStateFlow);

    public abstract void b();
}
