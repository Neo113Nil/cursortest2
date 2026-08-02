package Zh0;

import android.os.Handler;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class b extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f35970b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f35971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(View view, Function0<Unit> function0) {
        super(0);
        this.f35970b = view;
        this.f35971c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Handler handler = this.f35970b.getHandler();
        final Function0<Unit> function0 = this.f35971c;
        handler.postAtFrontOfQueue(new Runnable() { // from class: Zh0.a
            @Override // java.lang.Runnable
            public final void run() {
                Function0.this.invoke();
            }
        });
        return Unit.f71690a;
    }
}
