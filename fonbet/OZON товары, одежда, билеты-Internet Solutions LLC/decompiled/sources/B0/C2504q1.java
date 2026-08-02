package B0;

import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import v1.C10177b;
import v1.C10178c;
import v1.C10179d;

/* renamed from: B0.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2504q1 extends AbstractC7737t implements Function1<C10177b, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j1.i f1907b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O0 f1908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2504q1(j1.i iVar, O0 o02) {
        super(1);
        this.f1907b = iVar;
        this.f1908c = o02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C10177b c10177b) {
        KeyEvent b11 = c10177b.b();
        InputDevice device = b11.getDevice();
        boolean z11 = false;
        if (device != null && device.supportsSource(513) && !device.isVirtual() && C10178c.a(C10179d.b(b11), 2) && b11.getSource() != 257) {
            boolean a11 = C2506r1.a(19, b11);
            j1.i iVar = this.f1907b;
            if (a11) {
                z11 = iVar.d(5);
            } else if (C2506r1.a(20, b11)) {
                z11 = iVar.d(6);
            } else if (C2506r1.a(21, b11)) {
                z11 = iVar.d(3);
            } else if (C2506r1.a(22, b11)) {
                z11 = iVar.d(4);
            } else if (C2506r1.a(23, b11)) {
                androidx.compose.ui.platform.P1 h11 = this.f1908c.h();
                if (h11 != null) {
                    h11.show();
                }
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
