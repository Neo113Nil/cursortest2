package Q1;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class O extends AbstractC7737t implements Function0<BaseInputConnection> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ N f22857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(N n11) {
        super(0);
        this.f22857b = n11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f22857b.p(), false);
    }
}
