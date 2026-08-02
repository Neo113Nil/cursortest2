package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5256j0 extends AbstractC7737t implements Function1<xe.M, C5230a1> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC5272o1 f40895b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5262l0 f40896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5256j0(InterfaceC5272o1 interfaceC5272o1, C5262l0 c5262l0) {
        super(1);
        this.f40895b = interfaceC5272o1;
        this.f40896c = c5262l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C5230a1 invoke(xe.M m11) {
        return new C5230a1(this.f40895b, new C5253i0(this.f40896c));
    }
}
