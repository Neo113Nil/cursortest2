package Ub;

import If.c;
import Ub.f;
import Ub.j;
import Ub.l;
import Vb.r;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes9.dex */
    public interface a<P extends h> {
        void a(@NonNull P p11);
    }

    public interface b {
        void a(@NonNull a aVar);
    }

    void afterRender(@NonNull Hf.u uVar, @NonNull l lVar);

    void afterSetText(@NonNull TextView textView);

    void beforeRender(@NonNull Hf.u uVar);

    void beforeSetText(@NonNull TextView textView, @NonNull Spanned spanned);

    void configure(@NonNull b bVar);

    void configureConfiguration(@NonNull f.a aVar);

    void configureParser(@NonNull c.a aVar);

    void configureSpansFactory(@NonNull j.a aVar);

    void configureTheme(@NonNull r.a aVar);

    void configureVisitor(@NonNull l.a aVar);

    @NonNull
    String processMarkdown(@NonNull String str);
}
