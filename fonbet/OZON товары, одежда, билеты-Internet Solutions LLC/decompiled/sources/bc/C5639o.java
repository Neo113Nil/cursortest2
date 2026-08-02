package bc;

import Ub.f;
import Ub.j;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;

/* renamed from: bc.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5639o extends Ub.a {

    /* renamed from: a, reason: collision with root package name */
    private final C5627c f55888a = new C5627c();

    C5639o() {
    }

    @NonNull
    public static C5639o a() {
        return new C5639o();
    }

    @Override // Ub.a, Ub.h
    public final void afterSetText(@NonNull TextView textView) {
        AbstractC5631g.b(textView);
    }

    @Override // Ub.a, Ub.h
    public final void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned) {
        AbstractC5631g.c(textView);
    }

    @Override // Ub.a, Ub.h
    public final void configureConfiguration(@NonNull f.a aVar) {
        C5627c c5627c = this.f55888a;
        if (c5627c.f55861e) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        c5627c.f55861e = true;
        if (c5627c.f55857a == null) {
            c5627c.f55857a = Executors.newCachedThreadPool();
        }
        aVar.h(new C5629e(c5627c));
    }

    @Override // Ub.a, Ub.h
    public final void configureSpansFactory(@NonNull j.a aVar) {
        aVar.b(Hf.o.class, new C5638n());
    }
}
