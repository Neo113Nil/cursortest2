package Ve;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.fd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4240fd extends Jg {

    /* renamed from: b, reason: collision with root package name */
    public final Ee f31025b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC7737t f31026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4240fd(Ee viewBinding, Function1 hintCloseActionListener) {
        super(viewBinding);
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
        Intrinsics.checkNotNullParameter(hintCloseActionListener, "hintCloseActionListener");
        this.f31025b = viewBinding;
        this.f31026c = (AbstractC7737t) hintCloseActionListener;
    }

    @Override // Ve.Jg
    public final void e(Object obj) {
        Zb item = (Zb) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        Ee ee2 = this.f31025b;
        SPayTextView sPayTextView = ee2.f28927c;
        Sr sr = item.f30581b;
        Context context = this.f29291a.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "itemViewBinding.root.context");
        sPayTextView.setText(E.f(sr, context));
        AppCompatImageView spaySrihhAcivDismissHint = ee2.f28926b;
        Intrinsics.checkNotNullExpressionValue(spaySrihhAcivDismissHint, "spaySrihhAcivDismissHint");
        spaySrihhAcivDismissHint.setOnClickListener(new Cc(new kotlin.jvm.internal.L(), this, item));
    }
}
