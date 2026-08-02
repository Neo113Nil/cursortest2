package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.ui.platform.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5284t extends AbstractC7737t implements Function1<xe.M, C5262l0> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AndroidComposeView f41019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5284t(AndroidComposeView androidComposeView) {
        super(1);
        this.f41019b = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C5262l0 invoke(xe.M m11) {
        AndroidComposeView androidComposeView = this.f41019b;
        return new C5262l0(androidComposeView, androidComposeView.getF40569y0(), m11);
    }
}
