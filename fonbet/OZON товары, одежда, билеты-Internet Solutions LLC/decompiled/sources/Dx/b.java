package Dx;

import D2.o;
import android.os.Parcelable;
import android.text.Editable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.utils.DebouncedTextWatcher;
import ru.ozon.app.android.fresh.unsorted.widgets.pdpAspects.presentation.PdpAspectsViewHolder;
import ub.AbstractC9996c;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6785a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6786b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6787c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f6785a = i11;
        this.f6786b = obj;
        this.f6787c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6785a) {
            case 0:
                PdpAspectsViewHolder.submitList$lambda$2((PdpAspectsViewHolder) this.f6786b, (Parcelable) this.f6787c);
                break;
            case 1:
                M2.a this$0 = (M2.a) this.f6786b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o e11 = (o) this.f6787c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.m().a(e11);
                break;
            case 2:
                AbstractC9996c.e((AbstractC9996c) this.f6786b, (AbstractC7737t) this.f6787c);
                break;
            default:
                DebouncedTextWatcher.afterTextChanged$lambda$0((DebouncedTextWatcher) this.f6786b, (Editable) this.f6787c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(AbstractC9996c abstractC9996c, Function1 function1) {
        this.f6785a = 2;
        this.f6786b = abstractC9996c;
        this.f6787c = (AbstractC7737t) function1;
    }
}
