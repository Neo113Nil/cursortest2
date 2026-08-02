package E0;

import android.view.inputmethod.BaseInputConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: E0.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2927i0 extends AbstractC7737t implements Function0<BaseInputConnection> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2935m0 f7252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2927i0(C2935m0 c2935m0) {
        super(0);
        this.f7252b = c2935m0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.f7252b.g(), false);
    }
}
