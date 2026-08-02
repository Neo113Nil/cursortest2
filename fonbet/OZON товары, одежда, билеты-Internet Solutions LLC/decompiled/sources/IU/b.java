package IU;

import C2.r;
import E2.B;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.presentation.CommentInputViewHolder;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f12107c;

    public /* synthetic */ b(Object obj, Serializable serializable, int i11) {
        this.f12105a = i11;
        this.f12106b = obj;
        this.f12107c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12105a) {
            case 0:
                CommentInputViewHolder.sendCommentWithScrollIfNeeded$lambda$8((CommentInputViewHolder) this.f12106b, (String) this.f12107c);
                return;
            default:
                L2.a this$0 = (L2.a) this.f12106b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Throwable t2 = (Throwable) this.f12107c;
                Intrinsics.checkNotNullParameter(t2, "$t");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a(new F2.a(new B(), t2.getMessage()));
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
        }
    }
}
