package I0;

import B0.InterfaceC2477h1;
import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import x1.InterfaceC10628c;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt", f = "SelectionGestures.kt", l = {276, 315}, m = "touchSelectionSubsequentPress")
/* renamed from: I0.h0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3186h0 extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    InterfaceC10628c f11526d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2477h1 f11527e;

    /* renamed from: f, reason: collision with root package name */
    x1.x f11528f;

    /* renamed from: g, reason: collision with root package name */
    kotlin.jvm.internal.L f11529g;

    /* renamed from: h, reason: collision with root package name */
    long f11530h;

    /* renamed from: i, reason: collision with root package name */
    /* synthetic */ Object f11531i;

    /* renamed from: j, reason: collision with root package name */
    int f11532j;

    C3186h0(kotlin.coroutines.jvm.internal.a aVar) {
        super(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f11531i = obj;
        this.f11532j |= LinearLayoutManager.INVALID_OFFSET;
        return C3176c0.g(null, null, null, this);
    }
}
