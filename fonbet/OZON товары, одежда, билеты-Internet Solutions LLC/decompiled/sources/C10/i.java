package C10;

import Sc.InterfaceC4008j;
import Sc.k;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"LC10/i;", "Landroidx/recyclerview/widget/RecyclerView$n;", "<init>", "()V", "", "a", "LSc/j;", "()Ljava/lang/Object;", "key", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class i extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final InterfaceC4008j key = k.b(new a());

    /* loaded from: classes3.dex */
    static final class a extends AbstractC7737t implements Function0<Class<? extends i>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Class<? extends i> invoke() {
            return i.this.getClass();
        }
    }

    @NotNull
    public Object a() {
        return this.key.getValue();
    }
}
