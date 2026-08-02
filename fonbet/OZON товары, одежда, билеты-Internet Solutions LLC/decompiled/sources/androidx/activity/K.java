package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
public final class K extends C {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f36942a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    K(Function1 function1) {
        super(true);
        this.f36942a = (AbstractC7737t) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // androidx.activity.C
    public final void handleOnBackPressed() {
        this.f36942a.invoke(this);
    }
}
