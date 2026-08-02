package androidx.fragment.app;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class Z extends AbstractC7737t implements Function0<AbstractC6409a> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DialogInterfaceOnCancelListenerC5390k f43012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(DialogInterfaceOnCancelListenerC5390k dialogInterfaceOnCancelListenerC5390k) {
        super(0);
        this.f43012b = dialogInterfaceOnCancelListenerC5390k;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC6409a invoke() {
        return this.f43012b.getDefaultViewModelCreationExtras();
    }
}
